package r0;

import java.io.IOException;
import java.nio.channels.WritableByteChannel;
import okio.ByteString;

/* compiled from: BufferedSink.kt */
public interface h extends w, WritableByteChannel {
    h A() throws IOException;

    h B0(long j) throws IOException;

    h K(String str) throws IOException;

    h R(byte[] bArr, int i, int i2) throws IOException;

    long V(y yVar) throws IOException;

    h W(long j) throws IOException;

    f c();

    void flush() throws IOException;

    h k0(byte[] bArr) throws IOException;

    h l0(ByteString byteString) throws IOException;

    h m(int i) throws IOException;

    h o(int i) throws IOException;

    h u(int i) throws IOException;
}
