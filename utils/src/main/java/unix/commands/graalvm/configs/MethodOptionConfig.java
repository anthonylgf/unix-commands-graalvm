package unix.commands.graalvm.configs;

import java.util.List;
import java.util.Set;

public interface MethodOptionConfig {

    Set<String> getAlias();

    boolean hasValue();

    /**
     * Checks if the methods is the only acceptable.
     *
     * <p>NOTE: if it is set to true, the function will not
     * consider the other arguments.</p>
     *
     * @return if the option is the only acceptable at runtime
     */
    boolean isAlone();

    String getDescription();

    List<MethodOptionValueConfig> getValues();

    void addValue(MethodOptionValueConfig value);

    boolean isFromType(MethodOptionType type);
}
