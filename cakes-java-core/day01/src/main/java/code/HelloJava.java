package code;

/**
 * @author haoc
 */
public class HelloJava {

  public static void main(String[] args) {
    // 2.方法的调用
    // 类型 返回值接收名 = 方法名(参数);
    String response = foo("hello");

    System.out.println(response);
  }

  /**
   * 1.自定义一个方法,方法的定义
   *
   * 方法定义语法:
   *
   * 权限修饰符 [静态标识] 返回值类型 方法名(参数列表){
   *
   *   方法体...
   *
   *   return 返回数据;
   * }
   *
   * @param msg 入参一段消息
   * @return 返回结果
   */
  public static String foo(String msg) {

    System.out.println(msg);

    return "java";
  }
}
