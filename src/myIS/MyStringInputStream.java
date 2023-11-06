package myIS;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Queue;

public class MyStringInputStream extends InputStream {

    private Queue<Character> elements;

    public MyStringInputStream(String row) {
        char[] chars = row.toCharArray();
        elements = new ArrayDeque<>();
        for (char el : chars) {
            elements.add(el);
        }
    }

    @Override
    public int read() throws IOException {
        if (available() == 0) {
            return -1;
        }
        Character poll = elements.poll();
        return (int) ((char) poll);
    }

    @Override
    public int available() throws IOException {
        return elements.size();
    }

    public static void main(String[] args) throws IOException {
        MyStringInputStream msis = new MyStringInputStream("java hello");

        System.out.println("msis.available() = " + msis.available());
        while (msis.available() > 0) {
            int read = msis.read();
            System.out.println("((char) msis.available()) = " + ((char) read));
            System.out.println("msis.read() = " + read);
        }
        System.out.println("msis.available() = " +  msis.available());
    }
}
