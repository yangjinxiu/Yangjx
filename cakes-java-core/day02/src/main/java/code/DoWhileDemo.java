package code;

import org.junit.Test;

/**
 * @author haoc
 */
public class DoWhileDemo {
  /**
   * 最基本的循环,打印1到10
   */
  @Test
  public void case1() {
    // init
    int num = 1;
    do {

      // body
      System.out.println("进入循环体");

      // update

    } while (num < 1); // test

    // while (num < 1){
    //   System.out.println("进入循环体");
    // }
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
