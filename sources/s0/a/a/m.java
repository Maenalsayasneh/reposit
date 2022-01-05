package s0.a.a;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import s0.a.g.d;

public abstract class m implements e, d {
    public abstract r c();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        return c().w(((e) obj).c());
    }

    public byte[] getEncoded() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        k(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public int hashCode() {
        return c().hashCode();
    }

    public void k(OutputStream outputStream) throws IOException {
        new q(outputStream).j(this);
    }

    public void o(OutputStream outputStream, String str) throws IOException {
        q.a(outputStream, str).j(this);
    }

    public byte[] r(String str) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        o(byteArrayOutputStream, str);
        return byteArrayOutputStream.toByteArray();
    }
}
