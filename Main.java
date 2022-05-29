import java.io.File;
import java.io.FileOutputStream;
//import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        StringBuilder log = new StringBuilder();
        File src = new File("E://Netology//Games//src");
        if (src.mkdir()) log.append(messageCreateDir(src));
        File res = new File("E://Netology//Games//res");
        if (res.mkdir()) log.append(messageCreateDir(res));
        File savegames = new File("E://Netology//Games//savegames");
        if (savegames.mkdir()) log.append(messageCreateDir(savegames));
        File temp = new File("E://Netology//Games//temp");
        if (temp.mkdir()) log.append(messageCreateDir(temp));
        File main = new File("E://Netology//Games//src//main");
        if (main.mkdir()) log.append(messageCreateDir(main));
        File test = new File("E://Netology//Games//src//test");
        if (test.mkdir()) log.append(messageCreateDir(test));
        File mainFile = new File("E://Netology//Games//src//main//Main.java");
        try {
            if (mainFile.createNewFile()) log.append(messageCreateFile(mainFile));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        File utilsFile = new File("E://Netology//Games//src//main//Utils.java");
        try {
            if (utilsFile.createNewFile()) log.append(messageCreateFile(utilsFile));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        File drawables = new File("E://Netology//Games//res//drawables");
        if (drawables.mkdir()) log.append(messageCreateDir(drawables));
        File vectors = new File("E://Netology//Games//res//vectors");
        if (vectors.mkdir()) log.append(messageCreateDir(vectors));
        File icons = new File("E://Netology//Games//res//icons");
        if (icons.mkdir()) log.append(messageCreateDir(icons));
        File tempFile = new File("E://Netology//Games//temp//temp.txt");
        try {
            if (tempFile.createNewFile()) log.append(messageCreateFile(tempFile));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
//        System.out.println(log);
        try (FileOutputStream fos = new FileOutputStream("E://Netology//Games//temp//temp.txt")) {
            byte[] bytes = log.toString().getBytes();
            fos.write(bytes, 0, bytes.length);
//        try (FileWriter writer = new FileWriter("E://Netology//Games//temp//temp.txt", false)) {
//            writer.write(log.toString());
//            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static String messageCreateDir (File dir) {
        return "Директория " + dir.getName() + " создана.\n";
    }

    public static String messageCreateFile (File file) {
        return "Файл " + file.getName() + " создан.\n";
    }

}
