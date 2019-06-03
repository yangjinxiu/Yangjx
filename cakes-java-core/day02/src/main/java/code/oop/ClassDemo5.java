package code.oop;

/**
 * 方法参数:
 *
 * 基本数据类型
 *
 * 引用数据类型
 *
 * @author haoc
 */
public class ClassDemo5 {

  public static void main(String[] args) {
    ClassDemo5 demo5 = new ClassDemo5();

    // case1
    // 内存地址
    //i=ox1234 , [0x1234:9876]
    // int i = 9876;
    // // 修改
    // demo5.updateNum(i);
    // // 输出
    // System.out.println(i);

    // case 2
    // int[] arr = {1, 2, 3};
    // demo5.updateArray(arr);
    // for (int i : arr) {
    //   System.out.println(i);
    // }
    //
    // // case 3
    // UserDemo5 user = new UserDemo5();
    // user.name = "金莲";
    // user.age = 24;
    // demo5.updateObject(user);
    // System.out.println(user.name + ";" + user.age);

    Integer i = 9876;
    demo5.updateNum(i);
    System.out.println(i);
  }

  void updateNum(Integer i) {
    i = 1024;
  }

  // case 1,修改基本数据类型
  //
  void updateNum(int i) {
    // i == 9876, 0x1234
    i = 1024; // 0x4567
  }

  // case 2,修改数组
  void updateArray(int[] arr) {
    arr[0] = 4;
    arr[1] = 5;
    arr[2] = 6;
  }

  // case 3,修改对象
  void updateObject(UserDemo5 userDemo5) {
    userDemo5.name = "大叔";
    userDemo5.age = 40;
  }
}

class UserDemo5 {

  String name;
  int age;
}