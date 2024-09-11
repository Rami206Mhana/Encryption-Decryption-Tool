package Exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader; // استيراد الفئة المدمجة FileReader
import java.io.IOException;

public class MyFileReader { // تغيير اسم الكلاس لتجنب الالتباس
    private FileReader read; // تعريف متغير كائن FileReader المدمج
    private BufferedReader wroteFile; // تعريف متغير كائن BufferedReader

    // الكونستركتور
    public MyFileReader(String filePath) throws IOException {
        this.read = new FileReader(filePath); // تهيئة FileReader باستخدام المسار الممرر
        this.wroteFile = new BufferedReader(read); // تهيئة BufferedReader باستخدام كائن FileReader
    }

    // ميثود لطباعة محتوى الملف
    public void printText() throws IOException {
        String line; // متغير لتخزين كل سطر يتم قراءته
        while ((line = wroteFile.readLine()) != null) { // قراءة الملف سطرًا بسطر
            System.out.println(line); // طباعة كل سطر
        }
    }

    // إغلاق الموارد بعد الانتهاء
    public void close() throws IOException {
        wroteFile.close(); // إغلاق BufferedReader
        read.close(); // إغلاق FileReader
    }

    public static void main(String[] args) {
        try {

            MyFileReader myReader = new MyFileReader("Data.txt"); // إنشاء كائن MyFileReader
            myReader.printText(); // طباعة محتوى الملف
            myReader.close(); // إغلاق الموارد
        }catch (FileNotFoundException x){
            System.out.println("This fUCK FILE NOT FOUND " + x.getMessage());
        } catch (IOException e) {
            e.printStackTrace(); // معالجة الأخطاء في حال فشل القراءة
        }
    }
}
