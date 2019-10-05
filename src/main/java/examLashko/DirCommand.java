package examLashko;

import java.io.File;

public class DirCommand implements Command {
    @Override
    public void run(CurrentDirectory currentDirectory, String... args) {
        File[] files = currentDirectory.getCurrentDirectory().listFiles();
        if (files != null) {
            for (File f : files) {
                System.out.println(f.getName());
            }
        }
        System.out.println("Вывод прошёл успешно!");
    }

    @Override
    public void printHelp() {
        System.out.println("dir — выводит список файлов в текущей директории");
    }
}
