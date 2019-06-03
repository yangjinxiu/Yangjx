package code;

import org.junit.Test;

/**
 * @author haoc
 */
public class WhileDemo {

  /**
   * 最基本的循环,打印1到10
   */
  @Test
  public void case1() {
    // init
    int i = 1;

    // test
    while (i <= 10) {

      // body
      System.out.println(i);

      // update
      i++;
    }
  }

  /**
   * 死循环
   */
  @Test
  public void case2() {

  }

  /**
   * continue
   *
   * break
   */
  @Test
  public void case3() {

  }

}
