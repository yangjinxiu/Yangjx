package code;

import org.junit.Test;

/**
 * @author haoc
 */
public class SwitchDemo {

  /**
   * 整型数据作为表达式
   *
   * break关键字
   *
   * default关键字
   *
   * 可以作为switch表达式的数据: byte,short,char,int,枚举,String
   */
  @Test
  public void case1() {
    String str = "你好";
    switch (str) {
      case "你好":
        System.out.println("跟我打招呼");
        break;
      case "尼玛":
        System.out.println("这是要干架");
        break;
      case "嘿嘿嘿":
        System.out.println("这可能是要搞基");
        break;
      default:
        System.out.println("不懂你要说啥");
    }
  }

  /**
   * 多个常量落进相同的逻辑处理
   */
  @Test
  public void case2() {
    // type=1, 支付宝,
    // type=2, 微信
    // type=3, 京东

    // type=4, 易宝
    int type = 4;
    switch (type) {
      case 1:
      case 2:
      case 3:
        System.out.println("互联网支付");
        break;
      case 4:
      case 5:
      case 6:
      case 7:
        System.out.println("非互联网支付");
        break;
      default:
        System.err.println("出错啦, 不支持的类型");
    }
  }
}
