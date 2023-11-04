package OOPS;

class exp{
    // var
    public int val; // by default 0 
    public String str="Anmol Dev...";

   // not intiliaze value here val=20; //

    public void fun(){
        System.out.println("this function");
    }
}
public class someExp {
    public static void main(String[] args) {
             // val=20;     // direct access denied

        // cretaing obj of that class
        exp obj=new exp();
        System.out.println(obj.val+" -- "+obj.str);
        obj.val=20;
        obj.str="Developer Anmol";
        System.out.println(obj.val+" -- "+obj.str);
        

    }
}
