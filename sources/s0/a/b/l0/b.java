package s0.a.b.l0;

import i0.d.a.a.a;
import java.io.IOException;
import java.io.InputStream;
import s0.a.b.k0.c0;
import s0.a.b.k0.w;
import s0.a.b.r;

public class b implements r {
    public w a;

    public b(w wVar) {
        this.a = wVar;
    }

    public s0.a.b.k0.b a(InputStream inputStream) throws IOException {
        byte[] bArr;
        int read = inputStream.read();
        if (read != 0) {
            if (read == 2 || read == 3) {
                bArr = new byte[(((this.a.g.l() + 7) / 8) + 1)];
            } else if (read == 4 || read == 6 || read == 7) {
                bArr = new byte[((((this.a.g.l() + 7) / 8) * 2) + 1)];
            } else {
                StringBuilder P0 = a.P0("Sender's public key has invalid point encoding 0x");
                P0.append(Integer.toString(read, 16));
                throw new IOException(P0.toString());
            }
            bArr[0] = (byte) read;
            s0.a.g.l.a.b(inputStream, bArr, 1, bArr.length - 1);
            return new c0(this.a.g.h(bArr), this.a);
        }
        throw new IOException("Sender's public key invalid.");
    }
}
