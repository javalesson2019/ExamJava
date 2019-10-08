package examLashko;

import java.io.File;

public class CurrentDirectory {
    private File currentDirectory; // TODO: лучбе было бы использовать Path

    public CurrentDirectory(File currentDirectory) {
        this.currentDirectory = currentDirectory;
    }

    public void setCurrentDirectory(File currentDirectory) {
        this.currentDirectory = currentDirectory;
    }

    public File getCurrentDirectory() {
        return currentDirectory;
    }
}
