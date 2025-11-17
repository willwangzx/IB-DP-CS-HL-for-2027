class queue{
    int q[]=new int[114514];
    int l=1,r=0;
    queue(){

    }
    void enqueue(int n){
        q[++r]=n;
        q[0]++;
    }
    void dequeue(){
        if(!isEmpty())return;
        q[l++]=0;
        q[0]--;
    }
    int front(){return q[l];}
    boolean isEmpty(){
        return q[0]<=0;
    }

}
public class myqueue {

}
