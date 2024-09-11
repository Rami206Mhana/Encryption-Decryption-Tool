package Base;

public class Main {
    public static void main(String [] args){
        Users u1 = new Users();
        u1.printInfoUsers();
        u1.print();
        Encryption_Decryption text1 = new Encryption_Decryption();


        Encryption_Decryption forkey = new Encryption_Decryption(u1.inputKey());
        text1.encrypt(u1.textUsers());



    }
}
