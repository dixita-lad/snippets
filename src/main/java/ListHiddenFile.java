import java.io.File;

public class ListHiddenFile {
    public static void main(String[] args) {
        File[] hiddenFiles = new File(".").listFiles(File::isHidden);

        for(File f: hiddenFiles) {
            System.out.println(f.getName());
        }
    }
}
