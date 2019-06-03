package homework;

/**
 * 作业12: 实现水仙花数
 *
 * @author haoc
 */
public class Topic12 {

  public static void main(String[] args) {

  }

  public static void findNum(int start, int end) {
    // 参数判断
    if (start <= 0 || end <= 0) {
      System.err.println("不能<0");
      return;
    }

    // 参数判断
    if (start > end) {
      System.err.println("起始,结束有问题");
      return;
    }

    // 设置个上线, 假设只接受1000以内的



    for (int i = start; i <= end; i++) {
      // 取出百分位
      // 取出十分位
      // 取出个分位
    }
  }


}
