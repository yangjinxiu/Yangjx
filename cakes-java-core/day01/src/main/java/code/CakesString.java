package code;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import org.junit.Test;

/**
 * 字符串
 *
 * @author haoc
 */
public class CakesString {

  /**
   * 1.新建
   *
   * 需要格外注意编码的问题
   */
  @Test
  public void newStr() throws UnsupportedEncodingException {
    // 定义, 为初始化
    String str1;

    // 定义, 并初始化为null
    String str2 = null;

    // 定义, 并初始化为空串
    String str3 = "hello world";

    // new 空串
    String str4 = new String();

    // new "hello"
    String str5 = new String("hello");

    // char数组创建
    final char[] chars = {'h', 'e', 'l', 'l', 'o'};
    final String str6 = new String(chars);
    System.out.println("str6=" + str6);

    // 在char数组中切片,从0开始,切3个长度,即:hel
    final String str7 = new String(chars, 2, 3);
    System.out.println("str7=" + str7);

    int[] codePoints = new int[]{97, 98, 99, 100, 101};
    final String str8 = new String(codePoints, 0, 3);
    System.out.println("str8=" + str8);

    String val = "中国";
    final String str9 = new String(val.getBytes());
    System.out.println("str9 = " + str9);

    final String str10 = new String(
        val.getBytes("UTF-8"),
        StandardCharsets.UTF_8);
    System.out.println("str10 = " + str10);
  }

  /**
   * 2.转化,
   */
  @Test
  public void valueof() {
    // 定义字符串
    String str = "hello world";

    // int & Integer 转 String
    Integer num1 = 1024;
    int num2 = num1;
    String intValue = String.valueOf(num2);
    System.out.println(intValue);

    // long & Long 转String的操作
    Long num3 = 5689087678L;
    long num4 = num3;
    String longValue = String.valueOf(num4);
    System.out.println(longValue);

    // float(Float) & double(Double) 转String,
    String.valueOf(10.24F);
    String.valueOf(10.24D);

    // String 最挫的 = 1024 + "";

    // "false"
    String.valueOf(false);

    // "a"
    String.valueOf('a');

    // String.valueOf(new Object());
    String.valueOf(new byte[]{1, 2, 3, 4});
    String.valueOf(new char[]{'a', 'b', 'c', 'd'});
  }

  /**
   * 3.获取属性信息
   */
  @Test
  public void prop() {
    // String str = "hello";
    String str = "        ";
    String str2 = "null";

    // 字符串是否为空,"",若为true就是空串,若为false就是非空,null
    // String str = "";   // 空串
    // String str = null; // 空指针
    boolean isEmpty = str.isEmpty();
    System.out.println("str.isEmpty() = " + isEmpty);
    // 业务中经常使用的判断操作,是不是空指针, 然后才是判断是不是空串
    // TODO, 编程实践, 后面在回来优化, 补充,说明
    // fixme,
    // todo
    // FIXME, 后面要回来修改这个Bug
    // checkpoint 检查点, 这里是一些说明
    if (str == null || str.isEmpty()) {

    }

    // 字符串的长度
    int length = str.length();
    System.out.println("length = " + length);

    // 获取字符串的hash code
    // TODO 哈希码的获取,
    int hashCode = str.hashCode();
    System.out.println("hashCode = " + hashCode);
  }

  /**
   * 4.分割与连接
   */
  @Test
  public void splitAndJoin() {
    String str = "hello,world,hi,thank,you";
    final String[] strs1 = str.split(",");

    // 数组遍历,后面会讲到
    for (String s : strs1) {
      System.out.println(s);
    }

    System.out.println("\n-----我是分割线------\n");

    final String[] strs2 = str.split(",", 3);
    for (String s : strs2) {
      System.out.println(s);
    }

    System.out.println("\n-----我是分割线------\n");

    String joinResult1 = String.join("+", strs1);
    System.out.println("joinResult1 = " + joinResult1);
  }

  /**
   * 5.截取
   */
  @Test
  public void subAndTrim() {
    // String str = "123456789";
    //
    // // 从beginIndex开始截取,一直截取到最后
    // String res1 = str.substring(3);
    // System.out.println("res1 = " + res1);
    //
    // System.out.println("\n-----我是分割线------\n");
    //
    // // 从beginIndex开始截取一直截取到endIndex
    // String res2 = str.substring(3, 6);
    // System.out.println("res2 = " + res2);
    //
    // System.out.println("\n-----我是分割线------\n");

    String originStr = "  abcdefg    ";
    System.out.println("origin:[" + originStr + "]");

    originStr = originStr.trim();
    System.out.println("origin:[" + originStr + "]");
  }

  /**
   * 6.定位
   */
  @Test
  public void indexOf() {
    String str = "hello,love,how are you, love,thanks,";

    int index = str.indexOf("love");
    System.out.println("love first index = " + index);

    // TODO 待循环补齐后, 实现 定位所有的字符串
    index = str.indexOf("love", 7);
    System.out.println("love jump index = " + index);

    index = str.indexOf('e');
    System.out.println("char index = " + index);

    index = str.lastIndexOf("love");
    System.out.println("last index = " + index);

    index = str.indexOf("yes");
    System.out.println("none exists index = " + index);

    char ch = str.charAt(0);
    System.out.println("ch = " + ch);
    ch = str.charAt(1);
    System.out.println("ch = " + ch);
  }

  /**
   * 7.判断,全相等,前缀相等,后缀相等,包含
   */
  @Test
  public void check() {
    String str1 = "hello";
    String str2 = "hi";
    String str3 = "hello";
    String str4 = "HELLO";

    // 不相等,返回false
    boolean isEq = str1.equals(str2);
    System.out.println("1:" + isEq);

    // 相等 返回的true
    isEq = str1.equals(str3);
    System.out.println("2:" + isEq);

    isEq = (str1 == str3);
    System.out.println("3:" + isEq);

    // 忽略大小写的 相等判断
    isEq = str1.equalsIgnoreCase(str4);
    System.out.println("4:" + isEq);
    isEq = str1.equals(str4);
    System.out.println("5:" + isEq);

    // 起始前缀匹配判断 ,210_ 支付宝,230_ 微信,
    String orderId1 = "210_100012342324324";
    String orderId2 = "230_100012342324324";
    boolean isStartWith = orderId1.startsWith("210_");
    System.out.println("isStartWith:" + isStartWith);

    // 末尾后缀匹配判断
    final boolean isEndWith = orderId1.endsWith("4324");
    System.out.println("isEndWith = " + isEndWith);

    // 包含判断,如果包含子串返回true, 不包含返回false
    String str = "hello world,hi";
    final boolean isContains = str.contains("hi");
    System.out.println("isContains = " + isContains);
  }

  /**
   * 8.转化&替换
   */
  @Test
  public void toSth() {
    String str = "hello";
    String upperCase = str.toUpperCase();
    System.out.println("upperCase = " + upperCase);

    String str2 = "HELLO";
    final String lowerCase = str2.toLowerCase();
    System.out.println("lowerCase = " + lowerCase);

    String str3 = "abcde";
    char[] chars = str3.toCharArray();
    for (char ch : chars) {
      System.out.println(ch);
    }

    // final char[] chars = "hello".toCharArray();
    //
    // // 替换
    // "hello world".replace("hello", "hi");
    // "hello world,hello java".replaceAll("hello", "hi");
    // "hello world,hello java".replaceFirst("hello", "hi");
  }

  @Test
  public void toUpperTest() {
    final String response = toUpperCase123("he & llo");
    System.out.println(response);
  }

  // 公共   返回值     方法名      (参数列表)
  public String toUpperCase123(String originStr) {
    if (null == originStr || originStr.trim().isEmpty()) {
      // 关键字, 返回值
      return originStr;
    }

    char[] chars = originStr.toCharArray();

    for (int i = 0; i < chars.length; i++) {
      if ('a' <= chars[i] && chars[i] <= 'z') {
        chars[i] = (char) (chars[i] - 32);
      }
    }
    return new String(chars);
  }

  /**
   * 面试点一
   */
  @Test
  public void interviewPoint1() {
    String str1 = "hello";
    String str2 = new String("hello");

    System.out.println(str1 == str2);
    System.out.println(str1.equals(str2));
  }

  /**
   * 面试点二
   */
  @Test
  public void interviewPoint2() {
    String str1 = "hello";
    String str2 = "hello";

    System.out.println(str1 == str2);
    System.out.println(str1.equals(str2));

  }

  /**
   * 面试点三
   */
  @Test
  public void interviewPoint3() {
    String str1 = "a" + "b" + "c";
    String str2 = "abc";

    System.out.println(str1 == str2);
    System.out.println(str1.equals(str2));
  }

  /**
   * 面试点四
   */
  @Test
  public void interviewPoint4() {
    String str1 = "ab";
    String str2 = "abc";
    String str3 = str1 + "c";

    System.out.println(str2 == str3);
    System.out.println(str2.equals(str3));
  }

  /**
   * 查看字节码即可看出,在定义'a'的时候, 实际就是push了一个97
   */
  @Test
  public void testChar() {
    char ch = 'a';
    int result = ch - 32;
  }
}
