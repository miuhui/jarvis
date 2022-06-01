package com.tsa.jarvis.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.UnsupportedJwtException;
import java.util.Date;
import javax.crypto.spec.SecretKeySpec;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author : hui.miao
 */
@Slf4j
public class JwtTokenProvider {

  @Value("${app.jwtSecret}")
  private String jwtSecret;

  @Value("${app.jwtExpirationInMs}")
  private int jwtExpirationInMs;

  public String generateToken(String id) {
    Date now = new Date();
    Date expiryDate = new Date(now.getTime() + jwtExpirationInMs);

    return Jwts.builder()
        .setSubject(id)
        .setIssuedAt(now)
        .setExpiration(expiryDate)
        .signWith(getKey())
        .compact();
  }

  public Long getUserIdFromJWT(String token) {
    Claims body =
        Jwts.parserBuilder().setSigningKey(getKey()).build().parseClaimsJws(token).getBody();

    return Long.parseLong(body.getSubject());
  }

  public boolean validateToken(String token) {
    try {
      Jwts.parserBuilder().setSigningKey(getKey()).build().parsePlaintextJws(token);
      return true;
    } catch (MalformedJwtException ex) {
      log.error("Invalid JWT token");
    } catch (ExpiredJwtException ex) {
      log.error("Expired JWT token");
    } catch (UnsupportedJwtException ex) {
      log.error("Unsupported JWT token");
    } catch (IllegalArgumentException ex) {
      log.error("JWT claims string is empty.");
    }
    return false;
  }

  private SecretKeySpec getKey() {
    return new SecretKeySpec(jwtSecret.getBytes(), SignatureAlgorithm.HS512.getJcaName());
  }
}
