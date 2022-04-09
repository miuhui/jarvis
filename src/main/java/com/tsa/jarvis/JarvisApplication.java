package com.tsa.jarvis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.tsa.jarvis.mapper")
public class JarvisApplication {

  public static void main(String[] args) {
    SpringApplication.run(JarvisApplication.class, args);
  }
}
