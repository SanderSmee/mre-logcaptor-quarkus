package logcaptor;

import io.quarkus.test.junit.QuarkusTest;
import nl.altindag.log.LogCaptor;
import org.acme.GreetingResource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@QuarkusTest
class QuarkusTestTest {

    @Test
    void canNotCaptureLogging() {
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () ->
            LogCaptor.forClass(GreetingResource.class)
        );

        Assertions.assertEquals("SLF4J Logger implementation should be of the type [ch.qos.logback.classic.Logger] but found [ch.qos.logback.classic.Logger].", exception.getMessage());
    }
}
