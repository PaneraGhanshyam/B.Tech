package OOPJ_LABS.LAB_7;

public class LAB7_3{
    public static void main(String[] args) {
        Child c=new Child("hello world");   
    }
}
class Parent{
    int p=10;
    Parent(){
        System.out.println("Parent class constructor.");
    }
    Parent(String msg){
        System.out.println("Parent class parametrized constructor with msg: " + msg);
    }
}
class Child extends Parent{
    Child(String msg){
        // super();
        super(msg);
        System.out.println("Child class constructor.");
        System.out.println("value of parent class data member \'P\' is : "+super.p);
    }
}