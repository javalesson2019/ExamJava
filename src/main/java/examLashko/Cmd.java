package examLashko;

import java.io.File;
import java.util.Scanner;

public class Cmd {
    private CurrentDirectory currentDirectory;

    public Cmd() {
        currentDirectory = new CurrentDirectory(new File("").getAbsoluteFile());
    }

    public void run() {
        printHelp();
        do {
            System.out.print("-> ");
            Scanner scanner = new Scanner(System.in);
            String tmpCommand = scanner.nextLine();
            
            String[] partsOfCommand = tmpCommand.split(" ");
            String[] args = null;
            if (partsOfCommand.length > 1) {
                args = new String[partsOfCommand.length - 1];
                System.arraycopy(partsOfCommand, 1, args, 0, args.length);
            }


            if ("help".toLowerCase().equals(partsOfCommand[0])) {
                printHelp();
            }
            if ("exit".toLowerCase().equals(partsOfCommand[0])) {
                System.exit(0);
            }

            Command command;
            switch (partsOfCommand[0]) {
                case "dir":
                    command = new DirCommand();
                    break;
                case "cd":
                    command = new CdCommand();
                    break;
                case "pwd":
                    command = new PwdCommand();
                    break;
                case "cat":
                    command = new CatCommand();
                    break;
                case "download":
                    command = new DownloadCommand();
                    break;
                default:
                    System.out.println("Такой команды не существует!");
                    continue;
            }

            if(partsOfCommand.length > 1 && "help".toLowerCase().equals(partsOfCommand[1])){
                command.printHelp();
            }else{
                command.run(currentDirectory, args);
            }

        } while (true);
    }

    private void printHelp() {
        System.out.println( "dir - выводит список файлов в текущей директории" +
                            "\ncd «путь» - перейти в директорию, путь к которой задан первым аргументом" +
                            "\npwd - вывести полный путь до текущей директории" +
                            "\ncat «имя_файла» - выводит содержимое текстового файла «имя_файла»" +
                            "\ndownload «url» «имя_файла» - загружает файл" +
                            "\nexit - выход");
    }
}
