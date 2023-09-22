package ArrayList_Prg;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class user{
    String Name="King";
    int Age;
    String Mail;

    user(String Name, int Age, String Mail){
        this.Name=Name;
        this.Age=Age;
        this.Mail=Mail;
    }
}

public class ArrayList_Using_Class_Ex {
    public static void main(String[] args) {
        ArrayList<String> str=Stream.of("Aman","Vikas","Vishu").collect(Collectors.toCollection(ArrayList::new));
        System.out.println(str);

ArrayList<user> users= new ArrayList<user>(); 
        users.add(new user("hi",5,"hi@mail.com"));
        users.add(new user("AnmolDev",20,"anmoldev@gmail.com"));

        users.forEach((i)-> print(i) );

    }
    public static void print(user i){
        System.out.println("Name : "+i.Name+" || Age : "+i.Age+" || Mail ID : "+i.Mail);
    }
}
