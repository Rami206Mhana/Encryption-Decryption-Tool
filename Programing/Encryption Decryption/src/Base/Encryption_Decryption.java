package Base;

import java.util.Scanner;

public class Encryption_Decryption {


    public String encrypt(String text, int key){



    }

}
class Users{
    Scanner input = new Scanner(System.in);
    private String name;
    private int age;

    public Users(String name, int age){
        this.age = age;
        this.name = name;
    }
    public void printInfoUsers(){
        System.out.println("Please Enter Your Name & Age... ");
        name = input.nextLine();
        age = input.nextInt();
    }

    public void print(){
        System.out.println("Hi.." + name + "We clad to join us our service \n");
        System.out.println("Please enter a text.. ");
        
    }

}