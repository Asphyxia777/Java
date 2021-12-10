package lab8;

import java.io.*;
import java.util.Scanner;

public class Main{
    public static void main(String [] args) {
        Scanner console = new Scanner(System.in);
        String data = console.nextLine();
        FileWriter(data);
        FileReader();
        String data1 = console.nextLine();
        FileReplace(data1);
        String data2 = console.nextLine();
        FileAppend(data2);
    }
    public static void FileWriter(String data) {
        File file = new File("File_1.txt");
        FileWriter fr = null;
        try
        {
            fr = new FileWriter(file);
            fr.write(data);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        try
        {
            assert fr != null;
            fr.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    public static void FileReader() {
        try(FileReader reader = new FileReader("File_1.txt"))
        {
            // читаем посимвольно
            int c;
            while((c=reader.read())!=-1){
                System.out.print((char)c);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        System.out.println();
    }
    public static void FileReplace(String data1) {
        File file = new File("File_1.txt");
        FileWriter fr = null;
        try
        {
            fr = new FileWriter(file);
            fr.write(data1);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        try
        {
            assert fr != null;
            fr.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    public static void FileAppend(String data2) {
        OutputStream os = null;
        try {
            //в конструкторе FileOutputStream используем флаг true, который обозначает обновление содержимого файла
            os = new FileOutputStream(new File("File_1.txt"), true);
            os.write(data2.getBytes(), 0, data2.length());
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
