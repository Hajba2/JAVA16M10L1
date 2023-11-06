package fis;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class FileInputStreamTest {

    public static void main(String[] args) throws IOException {
        File file = new File("hello.txt");
        File dir1 = new File("dir1");

        System.out.println("file.isFile() = " + file.isFile());
        System.out.println("dir1.isFile() = " + dir1.isFile());
        System.out.println("dir1.isDirectory() = " + dir1.isDirectory());
        System.out.println("file.getCanonicalPath() = " + file.getCanonicalPath());
        System.out.println("file.exists() = " + file.exists());

        InputStream fis = new FileInputStream(file);

//        while (fis.available() > 0) {
//            int read = fis.read();
//            System.out.println("((char) msis.available()) = " + ((char) read));
//            System.out.println("msis.read() = " + read);
//        }

        Scanner s = new Scanner(fis);

        System.out.println("s.nextLine() = " + s.nextLine());
        System.out.println("s.nextLine() = " + s.nextLine());
        System.out.println("s.nextLine() = " + s.nextLine());

        s.close();;

    }

}
