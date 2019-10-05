package examLashko;

import java.io.File;

public class CurrentDirectory {
    private File currentDirectory;

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
