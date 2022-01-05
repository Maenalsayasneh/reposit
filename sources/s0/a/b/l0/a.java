package s0.a.b.l0;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import s0.a.b.k0.b;
import s0.a.b.k0.h;
import s0.a.b.k0.j;
import s0.a.b.r;

public class a implements r {
    public h a;

    public a(h hVar) {
        this.a = hVar;
    }

    public b a(InputStream inputStream) throws IOException {
        int bitLength = (this.a.d.bitLength() + 7) / 8;
        byte[] bArr = new byte[bitLength];
        s0.a.g.l.a.b(inputStream, bArr, 0, bitLength);
        return new j(new BigInteger(1, bArr), this.a);
    }
}
