package com.tsa.jarvis.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * 日期工具类
 *
 * @author : jinfan
 */
public class DateUtil {

  public static final String SHORT_DATE_PATTERN = "yyyyMMdd";

  public static String shortDateStr(LocalDate d) {
    return DateTimeFormatter.ofPattern(SHORT_DATE_PATTERN).format(d);
  }
}
