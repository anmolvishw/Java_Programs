// CLASS
package OOPS;
class ex{
    int a=10;
    String str="Hello Anmol";
}
public class Ex1 {
    public static void main(String[] args) {
        // creating obj of class ex

        ex obj1 = new ex();
        // accessing class obj var..
        System.out.println(obj1.a);

        obj1.a+=10;
        System.out.println(obj1.a);
    }    
}
