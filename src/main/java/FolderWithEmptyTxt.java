import java.io.File;
import java.io.IOException;

public class FolderWithEmptyTxt {
    public void Create() throws IOException {
        String fileSeparator = System.getProperty("file.separator");
        //создаем файл с указанием относительного пути к файлу
        long randomPart = (long) (Math.random()*100000000);
        String nameOfDirectory = "BAV_" + randomPart;

        File directory = new File(nameOfDirectory);
        if (directory.mkdir()) {
            System.out.println("Создана директория: " + nameOfDirectory);
        }else System.out.println("Не удалось создать директорию. Попытайтесь снова");

        String relativePath = nameOfDirectory + fileSeparator + "file.txt";
        File file = new File(relativePath);
        if(file.createNewFile()){
            System.out.println("В директории создан пустой file.txt");
        }else System.out.println("Не удалось создать файл");

    }
}
