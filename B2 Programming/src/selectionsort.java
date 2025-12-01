import java.util.Scanner;
public class selectionsort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m[]=new int[n+1];
        for(int i=1;i<=n;i++){
            m[i]=s.nextInt();
        }
        for(int i=1;i<=n;i++) {
            int min =m[i],p=i;
            for(int j=i;j<=n;j++){
                if(m[j]<min){
                    min=m[j];
                    p=j;
                }
            }
            int temp=m[i];
            m[i]=min;
            m[p]=temp;
        }
        for(int i=1;i<=n;i++){
            System.out.println(m[i]);
        }
    }
}
