package examLashko;

public interface Command {
    void run(CurrentDirectory currentDirectory, String... args);
    void printHelp();
}
