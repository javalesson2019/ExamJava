package examLashko;

public interface Command {
    // TODO: хорошая идея с базовым интерфесом и универсальными методами
    void run(CurrentDirectory currentDirectory, String... args);
    void printHelp();
}
