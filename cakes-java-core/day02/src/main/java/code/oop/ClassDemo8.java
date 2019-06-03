package code.oop;

/**
 * @author haoc
 */
public class ClassDemo8 {

  public static void main(String[] args) {
    // this
    ClassDemo8 cd8 = new ClassDemo8("jack", 23);
    cd8.age = 123;
    cd8.name = "";
  }

  String name;
  int age;


  ClassDemo8(String name, int age) {
    // 0x1234
    // this = 0x1234
    //
    this.name = name;
    this.age = age;
  }

  void test() {
    String name = "haoc";
    System.out.println(this.name);
  }
}
