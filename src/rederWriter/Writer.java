package rederWriter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {

    public static void main(String[] args) throws IOException {
        //create new fileOutputStream
        //create new File ...
        FileWriter fw = new FileWriter("new-filw.txt", true);

        fw.write("2this is text from java app\n");
        fw.write("2this is text from java app\n");
        fw.write("2this is text from java app\n");

        fw.flush();

        fw.close();

        File file = new File("new-file2.txt");
        FileOutputStream fos = new FileOutputStream(file);
        fos.write('h');
        fos.write('e');
        fos.write('l');
        fos.write('l');
        fos.write('o');

        fos.flush();
        fos.close();
    }
}
