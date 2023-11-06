package copyPaster;

import java.io.*;

public class FileCopyPasterImpl implements CopyPaster {

    private final CopyPasterImpl copyPaster;

    public FileCopyPasterImpl(FileInputStream is, FileOutputStream os) {
        this.copyPaster = new CopyPasterImpl(is, os);
    }

    @Override
    public void copy() throws IOException {
        copyPaster.copy();
    }

    public static void main(String[] args) throws IOException {
        new FileCopyPasterImpl(
                new FileInputStream("dir2/a.txt"),
                new FileOutputStream("dir2/a-to.txt")).copy();
    }
}
