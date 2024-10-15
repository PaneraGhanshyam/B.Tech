package OOPJ_LABS.LAB_7;
/*demonstration of final keyword */
public class LAB7_4 {
    public static void main(String[] args) {
        MyClass my=new MyClass(10);
        my.myMethod();
        my.myMethod(0);
    }
}
final class MyClass{
    final int i;
    MyClass(int i){
        this.i=i;//only assign value of final variable one time using constructor.
        //this.i=10; can not change after assignment.  
    }
    public final void myMethod(){
        System.out.println("This is final method");
    }
    public final void myMethod(int a){
        System.out.println("Final method overloading");
        System.out.println("value of final variable is: "+i);
    }
}
// class MyClass2 extends MyClass{
// } can not extends final class
