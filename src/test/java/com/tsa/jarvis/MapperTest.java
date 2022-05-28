package com.tsa.jarvis;

import com.tsa.jarvis.entity.UserDO;
import com.tsa.jarvis.mapper.UserMapper;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MapperTest {

  @Autowired private UserMapper userMapper;

  @Test
  void testUserQuery() {
  }
}
