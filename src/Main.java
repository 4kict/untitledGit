import java.io.File;

public class Main {

    public static void main(String[] args) {

        File file = new File(  "src/foto_1473785496365.jpg");      // В тексте сообщени содержится путь к файлу

        System.out.println("file size=" + file.getName() );

        int pos = file.getName().lastIndexOf(".");
        String justName = pos > 0 ? file.getName().substring(0, pos) : file.getName();
        System.out.println("file justName=" + justName);
    }
}
