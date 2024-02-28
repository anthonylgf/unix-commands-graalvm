package unix.commands.graalvm.configs;

public enum MethodOptionType {

    /**
     * Options like -p, -a, -la, etc.
     */
    SINGLE_DASH,

    /**
     * Options like --help, --mode, --MODE=<>, etc.
     */
    DOUBLE_DASH;
}
