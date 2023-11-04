package OOPS;

class function{
    int x=10;
    int y=20;
    String str="Hello World";

    public void fun(){
        System.out.println("Function without any argu");
    }
    public void fun(int z){
        System.out.println("Function with one int  argu");
    }
    public void fun(String str1){
        System.out.println("Function with one String argu");
    }
    public void fun(String str1,int z){
        System.out.println("Function with string int  argu");
    }
    public void fun(int str1,String z){
        System.out.println("Function with int string argu");
    }

} 
public class functionoverload{
    public static void main(String[] args) {
        // here accessing someexp java file class varible or fun with the help of pkg
        // val=20;     // direct access denied

        // cretaing obj of that class
        exp obj=new exp();
        System.out.println(obj.val+" -- "+obj.str);
        obj.val=20;
        obj.str="Developer Anmol";
        System.out.println(obj.val+" -- "+obj.str);
        obj.fun();

        System.out.println("---------------------");

        function f=new function();
        f.fun();
        f.fun(5);
        f.fun("uygvf");
        f.fun(56,"gyf");
        f.fun("gyc",98);

    }
}