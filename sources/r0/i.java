package r0;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import okio.ByteString;

/* compiled from: BufferedSource.kt */
public interface i extends y, ReadableByteChannel {
    long B() throws IOException;

    String D(long j) throws IOException;

    long E0() throws IOException;

    InputStream G0();

    int H0(q qVar) throws IOException;

    String P(Charset charset) throws IOException;

    ByteString X() throws IOException;

    boolean a0(long j) throws IOException;

    f c();

    String e0() throws IOException;

    byte[] h0(long j) throws IOException;

    ByteString j(long j) throws IOException;

    byte[] r() throws IOException;

    byte readByte() throws IOException;

    int readInt() throws IOException;

    short readShort() throws IOException;

    long s0(w wVar) throws IOException;

    void skip(long j) throws IOException;

    boolean t() throws IOException;

    void z0(long j) throws IOException;
}
