package examLashko;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DownloadCommand implements Command {
    @Override
    public void printHelp() {
        System.out.println("download «url» «имя_файла» - загружает файл");
    }

    @Override
    public void run(CurrentDirectory currentDirectory, String... args) {
        if (args == null) {
            System.out.println("Введите download <URL_адрес> <Имя_файла>");
        } else {
            if(args.length > 1) {
                try {
                    URL url = null;
                    try {
                        url = new URL(args[0]);
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }

                    // TODO: эта одна строка заменяет все ниже написанное!!!
                    // Files.copy(url.openStream(), Paths.get(currentDirectory.getCurrentDirectory() + "\\" + args[1]));

                    BufferedInputStream in = null;
                    if (url != null) {
                        in = new BufferedInputStream(url.openStream());
                    }
                    File f = new File(currentDirectory.getCurrentDirectory() + "\\" + args[1]);
                    FileOutputStream out = null;

                    try {
                        out = new FileOutputStream(f);
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }

                    byte[] data = new byte[1024];
                    int count;
                    if (in != null) {
                        while ((count = in.read(data, 0, 1024)) != -1) {
                            if (out != null) {
                                out.write(data, 0, count);
                            }
                        }
                        System.out.println("Файл скачан успешно!");
                    }


                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("Введите имя файла!");
            }
        }
    }
}
