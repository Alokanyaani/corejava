import com.sun.security.jgss.GSSUtil;

public class functiooverloading {
    void add(){
        int A=10,B=20,C;
        C =A+B;
        System.out.println(C);
    }void add(int X,int Y){
        int C ;
        C=X+Y;
        System.out.println(C);
    }
    public static void main(String[] args){
        functiooverloading C=new functiooverloading();
        C.add();C.add(100,200);


    }

}
