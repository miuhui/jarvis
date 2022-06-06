package com.tsa.jarvis.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * 日期工具类
 *
 * @author : miaohui
 */
public class DateUtil {

  public static final String SHORT_DATE_PATTERN = "yyyyMMdd";

  /**
   * 将日期转化为yyyyMMdd格式的字符串
   *
   * @param d 代转化日期
   * @return yyyyMMdd格式的字符串
   */
  public static String shortDateStr(LocalDate d) {
    return DateTimeFormatter.ofPattern(SHORT_DATE_PATTERN).format(d);
  }
}
