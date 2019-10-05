package examLashko;

public class PwdCommand implements Command {
    @Override
    public void run(CurrentDirectory currentDirectory, String... args) {
        System.out.println(currentDirectory.getCurrentDirectory().getAbsolutePath());
    }

    @Override
    public void printHelp() {
        System.out.println("pwd — вывести полный путь до текущей директории");
    }
}
