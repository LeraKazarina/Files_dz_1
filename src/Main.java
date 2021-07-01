import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        File dir = new File("C://Workspace//13.1.1.1//Game");
        if (dir.mkdir()) {
            sb.append("Создан каталог Game        ");
        }

        File dir1 = new File(dir + "//src");
        if (dir1.mkdir()) {
            sb.append("Создан каталог src    ");
        }

        File dir2 = new File(dir + "//res");
        if (dir2.mkdir()) {
            sb.append("Создан каталог rec   ");
        }

        File dir3 = new File(dir + "//savegames");
        if (dir3.mkdir()) {
            sb.append("Создан каталог savegames   ");
        }

        File dir4 = new File(dir + "//temp");
        if (dir4.mkdir()) {
            sb.append("Создан каталог temp    ");
        }

        File dir5 = new File(dir1 + "//main");
        if (dir5.mkdir()) {
            sb.append("Создан каталог main    ");
        }

        File dir6 = new File(dir1 + "//test");
        if (dir6.mkdir()) {
            sb.append("Создан каталог test   ");
        }

        File dir7 = new File(dir2 + "//drawables");
        if (dir7.mkdir()) {
            sb.append("Создан каталог drawable    ");
        }

        File dir8 = new File(dir2 + "//vectors");
        if (dir8.mkdir()) {
            sb.append("Создан каталог vectors    ");
        }
        File dir9 = new File(dir2 + "//icons");
        if (dir9.mkdir()) {
            sb.append("Создан каталог icons    ");
        }

        File myFile2 = new File("C://Workspace//13.1.1.1//Game//src//main//Main.java");
        try {
            if (myFile2.createNewFile()) {
                sb.append("Создан файл Main.java    ");

            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File myFile3 = new File("C://Workspace//13.1.1.1//Game//src//main//Utils.java");
        try {
            if (myFile3.createNewFile()) {
                sb.append("Создан файл Utils.java     ");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        String text = sb.toString();

        try (FileWriter writer = new FileWriter("C://Workspace//13.1.1.1//Game//temp//temp.txt")){
            writer.write(text);
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}