package examLashko;

import java.io.File;

public class CdCommand implements Command {
    @Override
    public void run(CurrentDirectory currentDirectory, String... args) {
        if (args == null) {
            System.out.println("Введите cd <название_директории>");
        } else {
            File f = new File(args[0]);
            if (f.isDirectory()) {
                currentDirectory.setCurrentDirectory(f);
                System.out.println("Переход прошёл успешно!");
            } else {
                System.out.println("Не является директорией!");
            }
        }
    }

    @Override
    public void printHelp() {
        System.out.println("cd «путь» — перейти в директорию, путь к которой задан первым аргументом");
    }
}
