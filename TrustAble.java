package Class26;

public interface TrustAble {
  public static final int age=20; //constant
    String color="red";

     int trust();
     static void method1(){
         System.out.println("i love java");
     }
     default void method2(){

     }
}
class Bank implements TrustAble{

    @Override
    public int trust() {
        return 0;
    }

    public static void main(String[] args) {
        TrustAble.method1();

    }
}
