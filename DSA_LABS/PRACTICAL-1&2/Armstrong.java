public class Armstrong {
    public static void main(String[] args) {
        int size=10000;

        for(int i=1;i<=size;i++) {
            int n=i;
            int temp=n;
            int pow=0;
            while (temp != 0) {
                temp /= 10;
                pow++;
            }

            int sum=0;
            temp=n;

            while(temp != 0) {
                int digit=temp%10;
                sum += Math.pow(digit, pow);
                temp /= 10;
            }
            if (sum==n) {
                System.out.println(sum);
            }
        }
    }
}
