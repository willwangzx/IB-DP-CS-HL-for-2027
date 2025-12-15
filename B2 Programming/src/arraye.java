import java.util.ArrayList;
class myarray{
    static int[] ay;
    myarray(int data[]){
        ay=data;
    }
    public int max(){
        if(ay.length<=0)return 0;
        int ma=0;
        for(int i=0;i<ay.length;i++){
            if(ma<ay[i]){
                ma=ay[i];
            }
        }
        return ma;
    }
    public int min(){
        if(ay.length<=0)return 0;
        int mn=2147364847;
        for(int i=0;i<ay.length;i++){
            if(mn>ay[i]){
                mn=ay[i];
            }
        }
        return mn;
    }
    public void outp(){
        for(int i=0;i<ay.length;i++){
            System.out.print(ay[i]+" ");
        }
    }
}
public class arraye {
    public static void main(String[] args) {
        ArrayList<Integer> n=new ArrayList<Integer>();
        int[] m=new int[114];
        myarray a=new myarray(m);
    }

}
