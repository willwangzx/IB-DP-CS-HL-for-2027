import java.util.Scanner;
public class bubblesort {
    public static boolean cmp(int a,int b){
        return a<b;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int m[]=new int[128],n=s.nextInt();
        for(int i=1;i<=n;i++){
            m[i]=s.nextInt();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<n;j++){
                if(cmp(m[j+1],m[j])){
                    int tmp=m[j];
                    m[j]=m[j+1];
                    m[j+1]=tmp;
                }
            }
        }
        for(int i=1;i<=n;i++){
            System.out.print(m[i]+" ");
        }
    }
}
