package code.oop;

/**
 * 更多的是偏向面向过程的设计
 *
 * @author haoc
 */
public class ClassDemo3 {

  public static void main(String[] args) {
    ClassDemo3 demo = new ClassDemo3();
    demo.func4(1, "a");
    demo.func4(1, "a", "b");
    demo.func4(1, "a", "b", "c", "d");
    demo.func4(1, "a", "b", "c", "d", "e");
  }

  // 无返回值, 无参数
  void func1() {

  }

  // 有返回值, 无参数
  String func2() {
    return "hello";
  }

  // 有返回值, 有多个参数
  String func3(String str1, Integer num2) {
    return str1 + num2;
  }

  /**
   * 动态参数
   *
   * String... 参数名称
   *
   * 要求,一定要在最后
   */
  String func4(Integer num, String... strs) {
    for (String str : strs) {
      System.out.println(str);
    }
    return "finished";
  }
}
