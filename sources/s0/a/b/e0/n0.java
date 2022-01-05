package s0.a.b.e0;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Objects;
import s0.a.b.a;
import s0.a.b.i;
import s0.a.b.j;
import s0.a.b.k0.d1;
import s0.a.b.k0.k1;
import s0.a.b.k0.l1;

public class n0 implements a {
    public static final BigInteger a = BigInteger.valueOf(1);
    public o0 b = new o0();
    public k1 c;
    public SecureRandom d;

    public int a() {
        return this.b.a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0043, code lost:
        r6 = (s0.a.b.k0.l1) r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] b(byte[] r6, int r7, int r8) {
        /*
            r5 = this;
            s0.a.b.k0.k1 r0 = r5.c
            if (r0 == 0) goto L_0x00e5
            s0.a.b.e0.o0 r0 = r5.b
            int r1 = r0.a()
            r2 = 1
            int r1 = r1 + r2
            java.lang.String r3 = "input too large for RSA cipher."
            if (r8 > r1) goto L_0x00df
            int r1 = r0.a()
            int r1 = r1 + r2
            if (r8 != r1) goto L_0x0022
            boolean r1 = r0.b
            if (r1 == 0) goto L_0x001c
            goto L_0x0022
        L_0x001c:
            org.bouncycastle.crypto.DataLengthException r6 = new org.bouncycastle.crypto.DataLengthException
            r6.<init>(r3)
            throw r6
        L_0x0022:
            r1 = 0
            if (r7 != 0) goto L_0x0028
            int r4 = r6.length
            if (r8 == r4) goto L_0x002e
        L_0x0028:
            byte[] r4 = new byte[r8]
            java.lang.System.arraycopy(r6, r7, r4, r1, r8)
            r6 = r4
        L_0x002e:
            java.math.BigInteger r7 = new java.math.BigInteger
            r7.<init>(r2, r6)
            s0.a.b.k0.k1 r6 = r0.a
            java.math.BigInteger r6 = r6.x
            int r6 = r7.compareTo(r6)
            if (r6 >= 0) goto L_0x00d9
            s0.a.b.k0.k1 r6 = r5.c
            boolean r8 = r6 instanceof s0.a.b.k0.l1
            if (r8 == 0) goto L_0x0088
            s0.a.b.k0.l1 r6 = (s0.a.b.k0.l1) r6
            java.math.BigInteger r8 = r6.Y1
            if (r8 == 0) goto L_0x0088
            java.math.BigInteger r6 = r6.x
            java.math.BigInteger r0 = a
            java.math.BigInteger r3 = r6.subtract(r0)
            java.security.SecureRandom r4 = r5.d
            java.math.BigInteger r0 = s0.a.g.b.f(r0, r3, r4)
            java.math.BigInteger r3 = r0.modPow(r8, r6)
            java.math.BigInteger r3 = r3.multiply(r7)
            java.math.BigInteger r3 = r3.mod(r6)
            s0.a.b.e0.o0 r4 = r5.b
            java.math.BigInteger r3 = r4.c(r3)
            java.math.BigInteger r0 = s0.a.g.b.j(r6, r0)
            java.math.BigInteger r0 = r3.multiply(r0)
            java.math.BigInteger r0 = r0.mod(r6)
            java.math.BigInteger r6 = r0.modPow(r8, r6)
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x0080
            goto L_0x008e
        L_0x0080:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "RSA engine faulty decryption/signing detected"
            r6.<init>(r7)
            throw r6
        L_0x0088:
            s0.a.b.e0.o0 r6 = r5.b
            java.math.BigInteger r0 = r6.c(r7)
        L_0x008e:
            s0.a.b.e0.o0 r6 = r5.b
            java.util.Objects.requireNonNull(r6)
            byte[] r7 = r0.toByteArray()
            boolean r8 = r6.b
            if (r8 == 0) goto L_0x00c2
            byte r8 = r7[r1]
            if (r8 != 0) goto L_0x00ae
            int r8 = r7.length
            int r0 = r6.b()
            if (r8 <= r0) goto L_0x00ae
            int r6 = r7.length
            int r6 = r6 - r2
            byte[] r8 = new byte[r6]
            java.lang.System.arraycopy(r7, r2, r8, r1, r6)
            goto L_0x00d7
        L_0x00ae:
            int r8 = r7.length
            int r0 = r6.b()
            if (r8 >= r0) goto L_0x00d8
            int r6 = r6.b()
            byte[] r8 = new byte[r6]
            int r0 = r7.length
            int r6 = r6 - r0
            int r0 = r7.length
            java.lang.System.arraycopy(r7, r1, r8, r6, r0)
            goto L_0x00d7
        L_0x00c2:
            byte r6 = r7[r1]
            if (r6 != 0) goto L_0x00ce
            int r6 = r7.length
            int r6 = r6 - r2
            byte[] r8 = new byte[r6]
            java.lang.System.arraycopy(r7, r2, r8, r1, r6)
            goto L_0x00d4
        L_0x00ce:
            int r6 = r7.length
            byte[] r8 = new byte[r6]
            java.lang.System.arraycopy(r7, r1, r8, r1, r6)
        L_0x00d4:
            java.util.Arrays.fill(r7, r1)
        L_0x00d7:
            r7 = r8
        L_0x00d8:
            return r7
        L_0x00d9:
            org.bouncycastle.crypto.DataLengthException r6 = new org.bouncycastle.crypto.DataLengthException
            r6.<init>(r3)
            throw r6
        L_0x00df:
            org.bouncycastle.crypto.DataLengthException r6 = new org.bouncycastle.crypto.DataLengthException
            r6.<init>(r3)
            throw r6
        L_0x00e5:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "RSA engine not initialised"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.a.b.e0.n0.b(byte[], int, int):byte[]");
    }

    public int c() {
        return this.b.b();
    }

    public void init(boolean z, i iVar) {
        o0 o0Var = this.b;
        Objects.requireNonNull(o0Var);
        boolean z2 = iVar instanceof d1;
        o0Var.a = (k1) (z2 ? ((d1) iVar).d : iVar);
        o0Var.b = z;
        SecureRandom secureRandom = null;
        if (z2) {
            d1 d1Var = (d1) iVar;
            k1 k1Var = (k1) d1Var.d;
            this.c = k1Var;
            if (k1Var instanceof l1) {
                secureRandom = d1Var.c;
            }
        } else {
            k1 k1Var2 = (k1) iVar;
            this.c = k1Var2;
            if (k1Var2 instanceof l1) {
                secureRandom = j.a();
            }
        }
        this.d = secureRandom;
    }
}
