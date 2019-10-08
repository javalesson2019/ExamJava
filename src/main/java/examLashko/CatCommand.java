package examLashko;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.Scanner;

// TODO: в чем смысл дублировать суффикс Command в именовании класса?
public class CatCommand implements Command {
    @Override
    public void printHelp() {
        System.out.println("cat «имя_файла» - выводит содержимое текстового файла «имя_файла»");
    }

    @Override
    public void run(CurrentDirectory currentDirectory, String... args) {
        StringBuilder content = new StringBuilder();

        if (args == null) {
            System.out.println("Введите cat <имя_файла>");
        } else {
            String fileName = args[0];
            File file = new File(fileName);

            if (!file.exists()) {
                content.append("Файла с таким именем не существует!");
            }

            if (file.exists() && file.length() > 0) {
                try {
                    InputStream in = new FileInputStream(file.getPath()); // TODO: м.б. через Files.readString былобы эффективнее?
                    Scanner scanner = new Scanner(in);
                    try {
                        while (true) {
                            content.append(scanner.nextLine()).append("\n");
                        }
                    } catch (NoSuchElementException e2) {
                        System.out.print("");
                    }
                    in.close();
                    scanner.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
                System.out.println("Считывание файла прошло успешно!");
            }
            System.out.println(content.toString());
        }
    }
}
