package homework;

/**
 * 作业13: 面向对象
 *
 * @author haoc
 */
public class Topic13 {

  public static void main(String[] args) {
    User user = new User("jim", 23);
    System.out.println("user.getUserAge() = " + user.getUserAge());
  }
}

class User {

  /**
   * 定义一个 静态域
   */
  private static String address;

  /**
   * 定义两个私有的属性
   */
  private Integer userId;
  private Integer userAge;

  /**
   * 定义一个公开的属性
   */
  public String userName;

  /**
   * 默认的构造方法
   */
  public User() {
  }

  /**
   * 一个参数的构造方法
   */
  public User(Integer userId) {
    this.userId = userId;
  }

  /**
   * 两个参数的构造方法
   */
  public User(String userName, Integer userAge) {
    this.userAge = userAge;
    this.userName = userName;
  }

  /**
   * 实例方法
   */
  public Integer getUserAge() {
    if (userAge > 18) {
      return 18;
    }
    return userAge;
  }

  /**
   * 静态方法
   */
  public static User of() {
    return new User();
  }
}
