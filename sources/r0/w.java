package r0;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

/* compiled from: Sink.kt */
public interface w extends Closeable, Flushable {
    void S(f fVar, long j) throws IOException;

    void close() throws IOException;

    z d();

    void flush() throws IOException;
}
