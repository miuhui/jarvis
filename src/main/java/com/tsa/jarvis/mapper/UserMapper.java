package com.tsa.jarvis.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tsa.jarvis.entity.UserDO;
import java.util.Optional;
import org.apache.ibatis.annotations.Select;

public interface UserMapper extends BaseMapper<UserDO> {

  @Select("select * from user where id = #{id}")
  Optional<UserDO> getById(long id);
}
