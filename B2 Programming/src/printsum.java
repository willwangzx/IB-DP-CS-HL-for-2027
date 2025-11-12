import java.util.Scanner;
public class printsum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);//create a new scanner class to read input
        int n=0;
        int sum=0;
        n=s.nextInt();//how many numbers will be input next
        while(n!=0){
            sum+=n;
            n=s.nextInt();
        }
        System.out.println(sum);
    }
}
