import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        System.out.println("s.nextLine() = " + s.nextLine());

        s.close();

        File dir = new File("dir2");
        //dir.mkdir();
        System.out.println("dir.getCanonicalPath() = " + dir.getCanonicalPath());
        System.out.println("dir.getAbsolutePath() = " + dir.getAbsolutePath());

        File[] files = dir.listFiles();
        for (File f : files) {
            System.out.println("f.isDirectory() = " + f.isDirectory());
            System.out.println("f.isFile() = " + f.isFile());
            System.out.println("f.getName() = " + f.getName());
            System.out.println();
        }
    }
}