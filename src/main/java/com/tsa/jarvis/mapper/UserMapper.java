package com.tsa.jarvis.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tsa.jarvis.entity.UserDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<UserDO> {}
