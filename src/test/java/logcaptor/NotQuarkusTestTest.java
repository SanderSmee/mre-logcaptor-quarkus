package logcaptor;

import nl.altindag.log.LogCaptor;
import org.acme.GreetingResource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NotQuarkusTestTest {

    @Test
    void canCaptureLogging() {
        Assertions.assertDoesNotThrow(() ->
            LogCaptor.forClass(GreetingResource.class)
        );
    }
}
