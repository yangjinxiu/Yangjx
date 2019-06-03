package homework;

/**
 * 实现toTitle
 *
 * @author haoc
 */
public class Topic8 {

  public static void main(String[] args) {
    // case 1,正常
    String result = toTitle("hello");
    System.out.println("result1 = " + result);
    System.out.println("-------------------------\n");

    // case 2,空串
    result = toTitle("");
    System.out.println("result2 = " + result);
    System.out.println("-------------------------\n");

    // case 3,null
    result = toTitle(null);
    System.out.println("result3 = " + result);
    System.out.println("-------------------------\n");

    // case 4," "
    result = toTitle("  ");
    System.out.println("result4 = " + result);
    System.out.println("-------------------------\n");

    // case 5,"-abc"
    result = toTitle("-abc");
    System.out.println("result5 = " + result);
    System.out.println("-------------------------\n");

    // case 6," abc"
    result = toTitle(" abc");
    System.out.println("result6 = " + result);
    System.out.println("-------------------------\n");
  }

  public static String toTitle(String str) {
    if (null == str || str.trim().isEmpty()) {
      System.err.println("参数不可为空");
      return str;
    }

    char ch = str.charAt(0);
    if ('a' < ch && ch <= 'z') {
      // 说明是小写,需要进行toTitle转化
      char firstChar = (char) (ch - 32);
      return firstChar + str.substring(1);
    }

    // 说明不是小写的字符,则不需要做转化
    return str;
  }

}
