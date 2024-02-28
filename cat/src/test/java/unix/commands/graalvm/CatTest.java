package unix.commands.graalvm;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

class CatTest {
    @Test void appHasAGreeting() {
        Cat classUnderTest = new Cat();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
}
