package homework;

/**
 * 作业3: 实现ltrim
 *
 * @author haoc
 */
public class Topic3 {

  public static void main(String[] args) {
    System.out.println(ltrim("    abc"));
    ltrim("abc");
    ltrim("");
    ltrim("   ");
    ltrim(null);
    ltrim("123");
    ltrim("   abc     ");
  }

  /**
   * 实现字符串的左trim
   *
   * @param originStr 原始字符串
   * @return 返回trim后的字符串
   */
  public static String ltrim(String originStr) {
    // 入参校验
    boolean isValided = requiredNotBlank(originStr);
    if (!isValided) {
      System.out.println("入参不可为null或空串");
      return originStr;
    }

    // 如果是空串 "   " 一类的则直接返回
    if (originStr.trim().isEmpty()) {
      return originStr.trim();
    }

    // 转成字符数组
    char[] chars = originStr.toCharArray();

    // 初始化索引
    int index = 0;

    // 循环并判断,从索引0开始判断,若是空串则索引自增一位
    while (chars[index] == ' ') {
      index++;
    }

    // 截取,从非空串索引处开始一致截取到最后
    return originStr.substring(index);
  }

  private static boolean requiredNotBlank(String originStr) {
    return null != originStr && !originStr.isEmpty();
  }
}
