package code.oop;

/**
 * @author haoc
 */
public class ClassDemo4 {

  public static void main(String[] args) {
    User 美女 = new User();
    美女.name = "西施";

    // System.out.println(美女.name);
    美女.要微信号(90);
  }
}

// 美女
class User {

  String name;

  int age;

  String getName() {
    return name;
  }

  String 要微信号(long amount) {
    if (amount > 100) {
      System.out.println(name);
      System.out.println(age);
      return "123456";
    }

    return "滚蛋吧";
  }
}
