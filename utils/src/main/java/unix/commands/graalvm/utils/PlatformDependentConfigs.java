package unix.commands.graalvm.utils;

public enum PlatformDependentConfigs {
    INSTANCE;

    private final String lineSeparator = System.lineSeparator();

    public String getNewLine() {
        return lineSeparator;
    }
}
