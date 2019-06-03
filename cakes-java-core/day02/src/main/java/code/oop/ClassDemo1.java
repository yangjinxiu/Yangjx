package code.oop;

/**
 * 类定义示例1
 *
 * “人”类
 *
 * 属性: 身高,姓名,年纪,性别,爱好
 *
 * 方法: 抽烟,喝酒,烫头
 *
 * @author haoc
 */
public class ClassDemo1 {

  public static void main(String[] args) {
    int num = 1024;

    /**
     * 第一步: Person p1 = null;
     * 第二步: new Person();  开辟内存(运行时数据区的堆)空间
     * 第三步: Person p1 = 0x1234; 将内存地址赋值给p1
     *
     */
    Person p1 = new Person();
    // 在给属性赋值
    p1.name = "寂寞";
    p1.age = 23;

    // 对属性的调用
    System.out.println(p1.name);

    // 调对象的行为, 对象.行为()
    p1.喝酒();
  }
}

/**
 * Person.java -> Person.class -> Person Class
 */
class Person {

  int height;
  String name;
  int age;
  int gender;
  String 爱好;

  /**
   *
   */
  String 抽烟() {
    System.out.println("抽烟");
    return "抽烟";
  }

  void 喝酒() {
    System.out.println("喝酒");
  }

  void 烫头() {
    System.out.println("烫头");
  }
}
