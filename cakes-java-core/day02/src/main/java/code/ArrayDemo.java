package code;

import org.junit.Test;

/**
 * @author haoc
 */
public class ArrayDemo {

  /**
   * 一维定义
   *
   * 默认值
   *
   * 为数组插入元素
   */
  @Test
  public void case1() {
    // 声明
    int[] arr1;

    // 声明+初始化
    int[] arr2 = new int[3];
    // 为数组赋值
    arr2[0] = 1;
    arr2[1] = 2;
    arr2[2] = 3;
    // arr2[3] = 4;

    // 声明+静态初始化,arr3和arr4一样
    int[] arr3 = new int[]{1, 2, 3, 4, 5};
    int[] arr4 = {1, 2, 3, 4, 5};


  }

  /**
   * 一维数组的访问&遍历
   */
  @Test
  public void case2() {
    int[] arr = new int[]{1, 2, 3, 4, 5};
    // for (int i = 0; i < arr.length; i++) {
    //   System.out.println(arr[i]);
    // }

    // foreach,  增强for循环
    for (int num : arr) {
      System.out.println(num);
    }
  }

  /**
   * 二维数组的定义,初始化,访问,遍历
   */
  @Test
  public void case3() {
    // 声明
    int[][] arr1;

    // 声明+初始化
    int[][] arr2 = new int[3][2];
    arr2[0][0] = 1;
    arr2[0][1] = 1;
    // arr2[0][3] = 1;

    // 声明+静态初始化,3*3
    int[][] arr3 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
  }

  @Test
  public void case4() {
    int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.println(arr[i][j]);
      }
    }
  }
}
