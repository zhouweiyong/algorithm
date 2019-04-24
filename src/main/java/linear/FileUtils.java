package linear;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FileUtils {


    public static void writeTxtToFile(String content, String dirPath, String fileName) {
        File file = makeFilePath(dirPath, fileName);
        try {
            if (file.exists()) {
                RandomAccessFile raf = new RandomAccessFile(file, "rwd");
                raf.seek(file.length());
                raf.write(content.getBytes());
                raf.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static File makeFilePath(String dirPath, String fileName) {
        makeRootDir(dirPath);
        File file = null;
        try {
            file = new File(dirPath + File.separator + fileName);
            if (file.exists())
                file.delete();
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }

    public static void makeRootDir(String dirPath) {
        File file = new File(dirPath);
        if (!file.exists())
            file.mkdirs();
    }
}
