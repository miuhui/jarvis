package com.tsa.jarvis.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Data;

@Data
@TableName("user")
public class UserDO {

  @TableId(type = IdType.INPUT)
  private String id;

  /** 用户id */
  private String userId;

  /** 用户姓名 */
  private String userName;

  /** 性别 */
  private String gender;

  /** 密码 */
  private String password;

  /** 创建时间 */
  private Date gmtCreated;

  /** 修改时间 */
  private Date gmtModified;
}
