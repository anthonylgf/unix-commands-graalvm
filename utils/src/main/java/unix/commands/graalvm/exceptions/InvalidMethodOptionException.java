package unix.commands.graalvm.exceptions;

import static java.lang.String.format;

import unix.commands.graalvm.utils.PlatformDependentConfigs;

public class InvalidMethodOptionException extends RuntimeException {

    private static final String messageTemplate =
            "%s: invalid option -- '%s'%sTry '%s --help' for more information.";

    public InvalidMethodOptionException(String commandName, String parameter) {
        super(format(messageTemplate, commandName, parameter,
                PlatformDependentConfigs.INSTANCE.getNewLine(), commandName));
    }

}
