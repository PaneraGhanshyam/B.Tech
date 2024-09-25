package OOPJ_LABS.LAB_6;

public class LAB6_7 {
    //static int sum=10;
    int sum;
    public static void main(String[] args) {
        //System.out.println(this.sum);
        //error Cannot use this in a static contextJava(536871112)
        LAB6_7 l7=new LAB6_7();
        int sum=10;
        l7.add(sum);
    }
    void add(int sum){
        this.sum=sum+10;
        System.out.println(this.sum);
    }
}
