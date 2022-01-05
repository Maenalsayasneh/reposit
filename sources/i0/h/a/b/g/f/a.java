package i0.h.a.b.g.f;

import java.io.OutputStream;
import java.util.Objects;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
public final class a extends OutputStream {
    public final String toString() {
        return "ByteStreams.nullOutputStream()";
    }

    public final void write(int i) {
    }

    public final void write(byte[] bArr) {
        Objects.requireNonNull(bArr);
    }

    public final void write(byte[] bArr, int i, int i2) {
        Objects.requireNonNull(bArr);
    }
}
