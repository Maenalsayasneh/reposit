package s0.a.b;

import java.security.SecureRandom;

public class h {
    public SecureRandom a;
    public int b;

    public byte[] a() {
        byte[] bArr = new byte[this.b];
        this.a.nextBytes(bArr);
        return bArr;
    }

    public void b(q qVar) {
        this.a = qVar.a;
        this.b = (qVar.b + 7) / 8;
    }
}
