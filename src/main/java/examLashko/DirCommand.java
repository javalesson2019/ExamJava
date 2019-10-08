package examLashko;

import java.io.File;

public class DirCommand implements Command {
    @Override
    public void run(CurrentDirectory currentDirectory, String... args) {
        File[] files = currentDirectory.getCurrentDirectory().listFiles(); // TODO: Files.list
        if (files != null) {
            for (File f : files) {
                System.out.println(f.getName()); // TODO: что файл, а что директория?
            }
        }
        System.out.println("Вывод прошёл успешно!");
    }

    @Override
    public void printHelp() {
        System.out.println("dir — выводит список файлов в текущей директории");
    }
}
