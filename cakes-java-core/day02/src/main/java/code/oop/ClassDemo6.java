package code.oop;

/**
 * @author haoc
 */
public class ClassDemo6 {

  public static void main(String[] args) {
    // i=ox1234 , [0x1234:9876]
    int i = 128;
    /**
     * int identityHashCode(Object x)
     *
     * i -> Integer.valueOf(i)
     *
     * Integer
     */
    System.out.println(System.identityHashCode(i));

    /**
     * i -> Integer.valueOf(i)
     * Integer
     */
    System.out.println(System.identityHashCode(i));
  }
}
