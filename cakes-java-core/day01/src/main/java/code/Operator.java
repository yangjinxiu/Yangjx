package code;

import org.junit.Test;

/**
 * 运算符
 *
 * @author haoc
 */
public class Operator {

  @Test
  public void normal() {
    // + - * / %
    // int num1 = 1024;
    // int num2 = 1024;
    //
    // int result = num1 + num2;
    // result = num1 - num2;
    // result = num1 * num2;
    // result = num1 / num2;
    // int orderId = 342234234;
    // int dbId = orderId % 8;
    // System.out.println("dbId = " + dbId);

    // && || !

    // 短路
    // boolean flag1 = true;
    // boolean flag2 = false;
    // System.out.println("(flag1||flag2) = " + (flag1 || flag2));
    // System.out.println("(flag1&&flag2) = " + (flag1 && flag2));
    // if (flag1 || flag2) {
    //   System.out.println("进入");
    // }

    // boolean flag1 = true;
    // boolean flag2 = false;
    // boolean flag3 = false;
    // boolean flag4 = false;
    // if (flag1 && flag2 && flag3 || flag4) {
    //
    // }
  }

  /**
   * ++i 与 i++的区别
   */
  @Test
  public void plusplus() {
    int num = 0;

    /**
     Code:
     stack=2, locals=2, args_size=1
     0: iconst_0
     1: istore_1
     2: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
     5: iload_1
     6: iinc          1, 1
     9: invokevirtual #3                  // Method java/io/PrintStream.println:(I)V
     12: return
     */
    // System.out.println(num++);

    /**
     Code:
     stack=2, locals=2, args_size=1
     0: iconst_0
     1: istore_1
     2: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
     5: iinc          1, 1
     8: iload_1
     9: invokevirtual #3                  // Method java/io/PrintStream.println:(I)V
     12: return
     */
    // System.out.println(++num);

    /**
     * 无论是i++还是++i, 在虚拟机的指令上都是两条,加载后自增,或者自增后加载,因此是没办法保证原子性的
     */
  }

  /**
   * 三目运算示例1
   */
  @Test
  public void ternaryCall1() {
    ternary1(true);
    ternary2(true);
  }

  public void ternary1(boolean flag) {
    String result = null;
    if (flag) {
      result = "居然是真的?!";
    } else {
      result = "原来是假的!?";
    }

    System.out.println(result);
  }

  public void ternary2(boolean flag) {
    String result = flag ? "居然是真的?!" : "原来是假的!?";
    System.out.println(result);
  }

  /**
   * 三目运算示例2
   */
  @Test
  public void ternaryCall2() {
    final String result1 = ternary3(59);
    System.out.println(result1);

    String result2 = ternary4(59);
    System.out.println(result2);
  }

  public String ternary3(int score) {
    if (score >= 90) {
      return "真牛逼,我靠";
    } else if (score >= 80) {
      return "牛逼";
    } else if (score >= 60) {
      return "呵呵";
    } else {
      return "对不起,学费不退哈!!!";
    }
  }

  public String ternary4(int score) {
    return score >= 90 ? "真牛逼,我靠" : score >= 80 ? "牛逼" : score >= 60 ? "呵呵" : "对不起,学费不退哈!!!";
  }

  /**
   * 短路补充
   */
  @Test
  public void testBool() {
    // 基于方法调用,查看内部调用
    // case 1
    // 与运算, 如果第一个是false, 后面的表达式就不会去计算了
    // if (boo1() && boo2()) {

    // 或运算,如果第一个是true, 后面的表达式就不会去计算
    if (boo1() || boo2()) {
      System.out.println("true");
    } else {
      System.out.println("false");
    }
  }

  private boolean boo1() {
    System.out.println("boo1");
    return true;
  }

  private boolean boo2() {
    System.out.println("boo2");
    return true;
  }

  /**
   * 数值计算补充
   */
  @Test
  public void countAppend() {
    int i1 = 5 / 2;
    int i2 = 5 % 2;
    System.out.println(i1);
    System.out.println(i2);

    System.out.println("\n ----------------------------------- \n");

    float i3 = 5 / 2;
    double i4 = 5 / 2;
    float i5 = 5.0F / 2.0F;
    double i6 = 5.0 / 2.0;
    System.out.println(i3);
    System.out.println(i4);
    System.out.println(i5);
    System.out.println(i6);

    System.out.println("\n ----------------------------------- \n");

    float i7 = 10 / 3;
    float i8 = 10.0F / 3.0F;
    double i9 = 10.0 / 3.0;
    System.out.println(i7);
    System.out.println(i8);
    System.out.println(i9);

    System.out.println("\n ----------------------------------- \n");

    int i10 = 10;
    i10 += 2;
    i10 -= 2;
    i10 *= 2;
    i10 /= 3;
    i10 %= 4;
    System.out.println(i10);
  }

}
