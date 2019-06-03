// 关键字: package, 空格之后跟的是包名,一般有多级时使用逗号分隔
// 两条斜线,单行注释
package code;

/**
 * HelloWorld类
 *
 * public 关键字,表示权限的,所有包下的类都可以访问
 *
 * class  关键字, 用于定义一个类
 *
 * HelloWorld, 类名,在Java中一般与文件名保持相同
 *
 * @author haoc 作者标识
 */
public class HelloWorld {

  /**
   * main方法,一个程序执行的入口方法,是固定写法
   *
   * static 关键字, 标识为静态的,属于类级别的
   *
   * void 关键字, 表示无返回值
   *
   * (String[] args) 方法的入参,此处是一个字符串数组
   *
   * @param args 参数说明,一般说一下这个参数的用处
   */
  public static void main(String[] args) {// {方法体开始的大括号
    // 程序内待执行的逻辑
    System.out.println("hello world");
  } // 方法结束的大括号

  /**
   * 注:若使用idea编辑器
   *    - 快速编写main方法的快捷写法为: psvm 然后回车
   *    - 快速编写System.out.println("hello world"); soutm
   */

  /**
   * 这里是多行注释,一般用在类头部,方法头部等,或者方法中若有很多的说明时使用
   */

  // 单行注释,
}
