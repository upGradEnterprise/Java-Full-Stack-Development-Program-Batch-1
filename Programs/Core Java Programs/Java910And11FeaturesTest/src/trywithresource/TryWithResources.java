package trywithresource;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class TryWithResources {
    public static void main(String[] args) {
        // Before Java 7
//        DataInputStream dis=null;
//        FileOutputStream fos=null;
//        try {
//            dis = new DataInputStream(System.in);
//            fos = new FileOutputStream("abc.txt");
//            System.out.println("Enter the data");
//            int ch;
//            while((ch=dis.read()) != '@'){
//                fos.write(ch);
//            }
//        }catch (Exception e){
//            System.out.println(e);
//        }finally {
//            try {
//                dis.close();
//                fos.close();
//            }catch (Exception e){}
//        }

        // After Java 7 onward try with resources
//        try(
//                DataInputStream dis=new DataInputStream(System.in);
//                FileOutputStream fos = new FileOutputStream("xyz.txt");
//        )
//        {
//            System.out.println("Enter the data");
//            int ch;
//            while((ch=dis.read()) != '@'){
//                fos.write(ch);
//            }
//        }catch (Exception e){
//            System.out.println(e);
//        }

        // After java 9 onward
        final DataInputStream dis=new DataInputStream(System.in);
        try(
                dis;
                FileOutputStream fos = new FileOutputStream("xyz.txt");
        )
        {
            System.out.println("Enter the data");
            int ch;
            while((ch=dis.read()) != '@'){
                fos.write(ch);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
