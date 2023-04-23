class Test{
    int a;
    int b;
    public void setData(int a1,int b1){
        a = a1;
        b = b1;
    }
    public void showData(){
        System.out.println("Gia tri a = "+a);
        System.out.println("Gia tri b = "+b);
        
    }
}
public class ArrObj {
 public static void main(String[] args){
     Test myObj[] = new Test[2];
     myObj[0].setData(1,2);
     myObj[1].setData(3,4);
     myObj[0].showData();
     myObj[1].showData();
 }   
}