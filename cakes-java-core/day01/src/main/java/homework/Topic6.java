package homework;

/**
 * 作业6: 实现忽略大小写的startWith
 *
 * @author haoc
 */
public class Topic6 {

  public static void main(String[] args) {
    // case 1
    startsWithIgnoreCase("abcdefg", "abc");
    startsWithIgnoreCase("abcdefg", "ABC");
    startsWithIgnoreCase("", "ABC");
    startsWithIgnoreCase("", "");
    startsWithIgnoreCase("abcde", "");
    startsWithIgnoreCase(null, "abc");
    startsWithIgnoreCase("abcde", null);
    startsWithIgnoreCase("abcdef", "123");
    startsWithIgnoreCase("abcdef", "123");
    // case 10
    startsWithIgnoreCase("abc", "abcdefg");
  }

  /**
   * 忽略大小写的判断是否前缀匹配
   *
   * @param origin 原始字符串
   * @param anotherString 待匹配字符
   * @return 匹配结果, 成功返回true
   */
  public static boolean startsWithIgnoreCase(String origin, String anotherString) {
    // 校验传入字符串 合法
    boolean isStrValided = requiredNotBlanks(origin, anotherString);
    if (!isStrValided) {
      return false;
    }

    // 思路一: 将anotherString转大写匹配一次,在转小写匹配一下,不管哪个只要有一个为真就可以
    // 思路二: 将origin和anotherString都转成大写或者小写在用startWith匹配
    return origin.startsWith(anotherString.toLowerCase()) || origin
        .startsWith(anotherString.toUpperCase());
  }

  private static boolean requiredNotBlanks(String str1, String str2) {
    if (null == str1 || null == str2) {
      System.err.println("入参不可为null");
      return false;
    }

    if (str1.trim().isEmpty() || str2.trim().isEmpty()) {
      System.err.println("入参不可为空串");
      return false;
    }

    return true;
  }
}
