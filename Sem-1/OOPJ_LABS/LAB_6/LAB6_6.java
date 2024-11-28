package OOPJ_LABS.LAB_6;

public class LAB6_6 {
    public static void main(String[] args) {
        Count c1=new Count();
        Count c2=new Count();
        Count c3=new Count();
        Count c4=new Count();
        Count c5=new Count();
        Count c6=new Count();

        System.out.println("Count of objects is : "+Count.count);
    }
}
class Count{
    static int count;
    Count(){
        count++;
    }
}
