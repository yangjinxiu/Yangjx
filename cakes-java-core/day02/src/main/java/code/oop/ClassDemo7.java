package code.oop;

/**
 * @author haoc
 */
public class ClassDemo7 {

  public static void main(String[] args) {

    // 原始
    // UserDemo7 u7 = new UserDemo7();
    // u7.name = "xxx";
    // u7.age = 1234;
    // u7.height = 180;
    // System.out.println(u7.name);

    // 带有构造器的
    UserDemo7 u8 = new UserDemo7("jim", 23);
    u8.height = 180;
    System.out.println("u8 = " + u8.name);

    // UserDemo7 u9 = new UserDemo7("jack", 23, 180);
    // System.out.println("u9 = " + u9.name);
    // System.out.println("u9 = " + u9.age);
    // System.out.println("u9 = " + u9.height);
  }

}

class UserDemo7 {

  // 名字,年纪,身高,性别,爱好
  String name;
  int age = 1;
  int height;

  /**
   * 方法名与雷鸣一直 没有返回值 也没有return
   *
   * 默认的,午餐的, 即使你不写,也会自带的 构造器
   */
  UserDemo7() {
    System.out.println("init");
  }

  /**
   * 有参数的构造器
   *
   * 1.name=null;
   * 2.age=0
   * 3.this <- 0x1234
   * 4.this.name = "jim"
   * 4.this.name = "jim"
   */
  UserDemo7(String name, int age) {
    // self
    this.name = name;
    this.age = age;
  }

  UserDemo7(String n, int a, int h) {
    name = n;
    age = a;
    height = h;
  }

}
