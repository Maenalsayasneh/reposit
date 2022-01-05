package s0.a.b.a0.l;

import i0.d.a.a.a;
import java.io.IOException;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import s0.a.a.b1;
import s0.a.a.e1;
import s0.a.a.f;
import s0.a.a.x0;
import s0.a.b.l;
import s0.a.b.m;
import s0.a.b.n;
import s0.a.e.b.b0.c.h3;

public class c implements l {
    public final n a;
    public s0.a.a.n b;
    public int c;
    public byte[] d;
    public byte[] e;

    public c(n nVar) {
        this.a = nVar;
    }

    public int generateBytes(byte[] bArr, int i, int i2) throws DataLengthException, IllegalArgumentException {
        if (bArr.length - i2 >= i) {
            long j = (long) i2;
            int digestSize = this.a.getDigestSize();
            if (j <= 8589934591L) {
                long j2 = (long) digestSize;
                int i3 = (int) (((j + j2) - 1) / j2);
                byte[] bArr2 = new byte[this.a.getDigestSize()];
                int i4 = 0;
                int i5 = 1;
                boolean z = true;
                int i6 = 0;
                while (i4 < i3) {
                    n nVar = this.a;
                    byte[] bArr3 = this.d;
                    nVar.update(bArr3, i6, bArr3.length);
                    f fVar = new f(10);
                    f fVar2 = new f(10);
                    fVar2.a(this.b);
                    fVar2.a(new x0(h3.C1(i5)));
                    fVar.a(new b1(fVar2));
                    byte[] bArr4 = this.e;
                    if (bArr4 != null) {
                        fVar.a(new e1(z, 0, new x0(bArr4)));
                    }
                    fVar.a(new e1(true, 2, new x0(h3.C1(this.c))));
                    try {
                        byte[] r = new b1(fVar).r("DER");
                        this.a.update(r, 0, r.length);
                        this.a.doFinal(bArr2, 0);
                        if (i2 > digestSize) {
                            System.arraycopy(bArr2, 0, bArr, i, digestSize);
                            i += digestSize;
                            i2 -= digestSize;
                        } else {
                            System.arraycopy(bArr2, 0, bArr, i, i2);
                        }
                        i5++;
                        i4++;
                        i6 = 0;
                        z = true;
                    } catch (IOException e2) {
                        throw new IllegalArgumentException(a.V(e2, a.P0("unable to encode parameter info: ")));
                    }
                }
                this.a.reset();
                return (int) j;
            }
            throw new IllegalArgumentException("Output length too large");
        }
        throw new OutputLengthException("output buffer too small");
    }

    public void init(m mVar) {
        b bVar = (b) mVar;
        this.b = bVar.a;
        this.c = bVar.b;
        this.d = bVar.c;
        this.e = bVar.d;
    }
}
