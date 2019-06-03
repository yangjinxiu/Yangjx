package code;

import java.util.Scanner;
import org.junit.Test;

/**
 * @author haoc
 */
public class IfDemo {

  /**
   * 第1种,1个分支
   *
   * 大括号可省略???
   */
  @Test
  public void case1() {
    int num = 10;
    boolean b = num > 32;

    // if (istrue()) {
    //   System.out.println("大于");
    // }
  }

  // private boolean istrue() {
  //   System.out.println("");
  //   System.out.println("");
  //   System.out.println("");
  //   return true;
  // }

  /**
   * 第2种,2个分支
   */
  @Test
  public void case2() {

    if (true) {
      System.out.println("sdf");
    } else {
      System.out.println("");
    }
  }

  /**
   * 第3种,多个分支
   *
   * else ???
   */
  @Test
  public void case3() {
    int num = 0;
    if (num > 10) {
      System.out.println("20");
    } else if (num > 20) {
      System.out.println("");
    } else if (num > 30) {
      System.out.println("");
    } else if (num > 40) {
      System.out.println("");
    } else if (num > 50) {
      System.out.println("");
    } else {

    }

    //  -----

    // -----
  }

  /**
   * 第4种,1个分支,多条语句
   */
  @Test
  public void case4() {

  }

  // ... 多个分支,多条语句?

  /**
   * 猜数字
   *
   * “错,小小小”
   *
   * “错,大大大”
   *
   * ”哈哈,猜对了,拜拜!!!”
   */
  public static void main(String[] args) {
    int target = (int) (Math.random() * 100);

    Scanner scanner = new Scanner(System.in);
    while (scanner.hasNext()) {
      int num = scanner.nextInt();

      if (num == target) {
        System.out.println("哈哈,猜对了,拜拜!!!");
      } else if (num > target) {
        System.out.println("错,大大大");
      } else {
        System.out.println("错,小小小");
      }
    }
  }
}
