## Quarkus project
Minimal start project created using https://code.quarkus.io

## Purpose
The purpose is to be a Minimal Reproducible Example

This example points out that given the steps to configure [LogCaptor](https://github.com/Hakky54/log-captor), it will
not work as expected when applied in a test that uses `@QuarkusTest`.

See the tests in the [logcaptor](https://github.com/SanderSmee/mre-logcaptor-quarkus/tree/main/src/test/java/logcaptor
) package. The `QuarkusTestTest` shows an exception is thrown, where that is not expected.
