package code;

import org.junit.Test;

/**
 * @author haoc
 */
public class ForDemo {

  /**
   * 最基本的循环,打印1到10
   */
  @Test
  public void case1() {
    for (int i = 1; i <= 100; i++) {

    }

    for (int i = 1; i <= 10; i += 2) {
      System.out.println(i);
    }

    // for (int i = 0; i < 10; i++) {
    //   System.out.println("i = " + i);
  }

  /**
   * 死循环
   */
  @Test
  public void case2() {
    for (; ; ) {
      System.out.println("哈哈哈");
    }
  }

  /**
   * continue
   *
   * break
   */
  @Test
  public void case3() {
    for (int i = 0; i <= 10; i++) {
      scan:
      System.out.println("yes");

      // 结束当前循环,进入下一次循环
      if (i % 2 == 0) {
        continue;
      }

      if (i == 9) {
        // 跳出循环
        break;
      }

      System.out.println(i);
    }
  }

  /**
   * 变步长
   */
  @Test
  public void case4() {

  }
}
