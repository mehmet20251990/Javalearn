package j29_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_FileInputStreamException02 {
    public static void main(String[] args) {

        try {
            FileInputStream fis=new FileInputStream("C:\\Users\\samet\\IdeaProjects\\javaLearn\\src\\j29_Exceptions\\ebikGabık");
            int k;
                try {
                    while ((k=fis.read())!=-1){
                        System.out.print((char)k);
                    }
                    System.out.println("Try içteki block");
                } catch (IOException e) { // dosyaya ulaşılır fakat okunamazsa bu catch çalışır
                    System.out.println("Dosya okunamıyor");
                    System.out.println("Catch içteki block");
                }
            System.out.println("Try dıştaki block");
        } catch (FileNotFoundException e) { // dosyaya ulaşılamazsa bu catch çalışır
            System.out.println("Dosyaya ulaşılamıyor");
            System.out.println("Catch dıştaki block");
        }
        System.out.println("Devamkeeee");
    }
}
