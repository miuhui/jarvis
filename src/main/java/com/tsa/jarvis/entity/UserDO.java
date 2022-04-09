package com.tsa.jarvis.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Data;

@Data
@TableName("user")
public class UserDO {

  private int id;

  private String userId;

  private String userName;

  private String password;

  private Date gmtCreated;

  private Date gmtModified;
}
