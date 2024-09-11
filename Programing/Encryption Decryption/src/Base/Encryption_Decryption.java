package Base;

import java.util.Scanner;

public class Encryption_Decryption {


    protected int key ;
    protected String text;

    public Encryption_Decryption(){};

    // تهيئة المفتاح من خلال السماح للمستخدم في ادخاله
    public Encryption_Decryption(int key){
        this.key = key;
    }
    // الطريقة الخاصة بعملية التشفير
    public String encrypt(String text){
        StringBuilder modified_Text = new StringBuilder();

        for(char characters : text.toCharArray()){
            if(Character.isLetter(characters)){
                char base = Character.isLowerCase(characters) ? 'a': 'A';
                char shifted = (char) ((characters - base + key) % 26 + base);
                modified_Text.append(shifted); // نضيف الحرف المشفر إلى النتيجة

            }
            else {
                modified_Text.append(characters); // إذا كان الحرف رمزًا، نضيفه كما هو
            }
        }
        return modified_Text.toString(); // نرجع النص المشفر النهائي

        }


}


class Users extends Encryption_Decryption{
    Scanner input = new Scanner(System.in);
    private String name;
    private int age;


//    public void rules_App(){
//        System.out.println("Hi there, Enter The text that you wanna encrypt, just 50 Letters \n");
//
//    }


    // نقوم في عملية تمرير هذه الدالة للمنشئ من خلال تمريرها ك وسيطة
    public int inputKey(){
        key = input.nextInt();
        return key;
    }

    public String textUsers(){
        String text = input.nextLine();
        return text;
    }
    // منشئ افتراضي
     public Users(){};
    // من اجل ان يقوم المستخدم في ادخال القيم مباشرة من خلال عملية انشاء الكائن
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
        System.out.println("Enter The Key For Encryption ");
        System.out.println("Please enter a text.. ");


    }

}