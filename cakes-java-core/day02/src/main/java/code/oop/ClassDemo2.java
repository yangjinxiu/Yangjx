package code.oop;

/**
 * 成员变量: 类的属性,
 *
 * 局部变量
 *
 * @author haoc
 */
public class ClassDemo2 {

  String name = "abc";

  String foo = name + "haha";

  void callName() {
    String name = "bcd";
    System.out.println(name);
  }

  void callSth() {
    System.out.println(name);
  }

  public static void main(String[] args) {
    new ClassDemo2().callName();
  }
}
