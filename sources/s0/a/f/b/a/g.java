package s0.a.f.b.a;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.WeakHashMap;
import org.bouncycastle.pqc.crypto.lms.LMOtsParameters;
import org.bouncycastle.pqc.crypto.lms.LMSigParameters;
import s0.a.b.n;
import s0.a.e.b.b0.c.h3;

public class g extends f {
    public static a d;
    public static a[] q;
    public final LMOtsParameters Y1;
    public final int Z1;
    public final byte[] a2;
    public final Map<a, byte[]> b2 = new WeakHashMap();
    public final int c2;
    public final n d2;
    public int e2;
    public h f2;
    public final byte[] x;
    public final LMSigParameters y;

    public static class a {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && ((a) obj).a == this.a;
        }

        public int hashCode() {
            return this.a;
        }
    }

    static {
        a aVar = new a(1);
        d = aVar;
        a[] aVarArr = new a[129];
        q = aVarArr;
        aVarArr[1] = aVar;
        int i = 2;
        while (true) {
            a[] aVarArr2 = q;
            if (i < aVarArr2.length) {
                aVarArr2[i] = new a(i);
                i++;
            } else {
                return;
            }
        }
    }

    public g(LMSigParameters lMSigParameters, LMOtsParameters lMOtsParameters, int i, byte[] bArr, int i2, byte[] bArr2) {
        super(true);
        this.y = lMSigParameters;
        this.Y1 = lMOtsParameters;
        this.e2 = i;
        this.x = h3.I(bArr);
        this.Z1 = i2;
        this.a2 = h3.I(bArr2);
        this.c2 = 1 << (lMSigParameters.i + 1);
        this.d2 = b.a(lMSigParameters.j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0090  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static s0.a.f.b.a.g e(java.lang.Object r8) throws java.io.IOException {
        /*
            boolean r0 = r8 instanceof s0.a.f.b.a.g
            if (r0 == 0) goto L_0x0007
            s0.a.f.b.a.g r8 = (s0.a.f.b.a.g) r8
            return r8
        L_0x0007:
            boolean r0 = r8 instanceof java.io.DataInputStream
            if (r0 == 0) goto L_0x0071
            java.io.DataInputStream r8 = (java.io.DataInputStream) r8
            int r0 = r8.readInt()
            if (r0 != 0) goto L_0x0069
            int r0 = r8.readInt()
            org.bouncycastle.pqc.crypto.lms.LMSigParameters r2 = org.bouncycastle.pqc.crypto.lms.LMSigParameters.a(r0)
            int r0 = r8.readInt()
            org.bouncycastle.pqc.crypto.lms.LMOtsParameters r3 = org.bouncycastle.pqc.crypto.lms.LMOtsParameters.a(r0)
            r0 = 16
            byte[] r5 = new byte[r0]
            r8.readFully(r5)
            int r4 = r8.readInt()
            int r6 = r8.readInt()
            int r0 = r8.readInt()
            if (r0 < 0) goto L_0x0061
            int r1 = r8.available()
            if (r0 > r1) goto L_0x004a
            byte[] r7 = new byte[r0]
            r8.readFully(r7)
            s0.a.f.b.a.g r8 = new s0.a.f.b.a.g
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r8
        L_0x004a:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "secret length exceeded "
            java.lang.StringBuilder r1 = i0.d.a.a.a.P0(r1)
            int r8 = r8.available()
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
        L_0x0061:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "secret length less than zero"
            r8.<init>(r0)
            throw r8
        L_0x0069:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "expected version 0 lms private key"
            r8.<init>(r0)
            throw r8
        L_0x0071:
            boolean r0 = r8 instanceof byte[]
            if (r0 == 0) goto L_0x0094
            r0 = 0
            java.io.DataInputStream r1 = new java.io.DataInputStream     // Catch:{ all -> 0x008d }
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x008d }
            byte[] r8 = (byte[]) r8     // Catch:{ all -> 0x008d }
            r2.<init>(r8)     // Catch:{ all -> 0x008d }
            r1.<init>(r2)     // Catch:{ all -> 0x008d }
            s0.a.f.b.a.g r8 = e(r1)     // Catch:{ all -> 0x008a }
            r1.close()
            return r8
        L_0x008a:
            r8 = move-exception
            r0 = r1
            goto L_0x008e
        L_0x008d:
            r8 = move-exception
        L_0x008e:
            if (r0 == 0) goto L_0x0093
            r0.close()
        L_0x0093:
            throw r8
        L_0x0094:
            boolean r0 = r8 instanceof java.io.InputStream
            if (r0 == 0) goto L_0x00a3
            java.io.InputStream r8 = (java.io.InputStream) r8
            byte[] r8 = s0.a.g.l.a.a(r8)
            s0.a.f.b.a.g r8 = e(r8)
            return r8
        L_0x00a3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "cannot parse "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.a.f.b.a.g.e(java.lang.Object):s0.a.f.b.a.g");
    }

    public final byte[] a(int i) {
        int i2 = i;
        int i3 = 1 << this.y.i;
        if (i2 >= i3) {
            h3.C(d(), this.d2);
            h3.t3(i2, this.d2);
            n nVar = this.d2;
            nVar.update((byte) 16777090);
            nVar.update((byte) -32126);
            LMOtsParameters lMOtsParameters = this.Y1;
            byte[] d3 = d();
            int i4 = i2 - i3;
            byte[] I = h3.I(this.a2);
            n a3 = b.a(lMOtsParameters.j);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(d3);
                byte b = (byte) (i4 >>> 24);
                byteArrayOutputStream.write(b);
                byte b3 = (byte) (i4 >>> 16);
                byteArrayOutputStream.write(b3);
                byte b4 = (byte) (i4 >>> 8);
                byteArrayOutputStream.write(b4);
                byte b5 = (byte) i4;
                byteArrayOutputStream.write(b5);
                byteArrayOutputStream.write((byte) 128);
                byteArrayOutputStream.write((byte) 32896);
                while (byteArrayOutputStream.size() < 22) {
                    byteArrayOutputStream.write(0);
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                a3.update(byteArray, 0, byteArray.length);
                n a4 = b.a(lMOtsParameters.j);
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    byteArrayOutputStream2.write(d3);
                    byteArrayOutputStream2.write(b);
                    byteArrayOutputStream2.write(b3);
                    byteArrayOutputStream2.write(b4);
                    byteArrayOutputStream2.write(b5);
                    int digestSize = a4.getDigestSize() + 23;
                    while (byteArrayOutputStream2.size() < digestSize) {
                        byteArrayOutputStream2.write(0);
                    }
                    byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                    n a5 = b.a(lMOtsParameters.j);
                    int i5 = lMOtsParameters.i;
                    int i6 = lMOtsParameters.g;
                    int i7 = (1 << lMOtsParameters.h) - 1;
                    int i8 = 0;
                    int i9 = 0;
                    while (i8 < i5) {
                        int i10 = i5;
                        boolean z = i8 < i5 + -1;
                        if (byteArray2.length >= a5.getDigestSize()) {
                            a5.update(d3, 0, d3.length);
                            a5.update(b);
                            a5.update(b3);
                            a5.update(b4);
                            a5.update(b5);
                            int i11 = i9;
                            a5.update((byte) (i11 >>> 8));
                            a5.update((byte) i11);
                            a5.update((byte) -1);
                            byte b6 = b5;
                            a5.update(I, 0, I.length);
                            a5.doFinal(byteArray2, 23);
                            int i12 = z ? i11 + 1 : i11;
                            short s = (short) i8;
                            byteArray2[20] = (byte) (s >>> 8);
                            byteArray2[21] = (byte) s;
                            for (int i13 = 0; i13 < i7; i13++) {
                                byteArray2[22] = (byte) i13;
                                a4.update(byteArray2, 0, byteArray2.length);
                                a4.doFinal(byteArray2, 23);
                            }
                            a3.update(byteArray2, 23, i6);
                            i8++;
                            i5 = i10;
                            byte b7 = b6;
                            i9 = i12;
                            b5 = b7;
                        } else {
                            throw new IllegalArgumentException("target length is less than digest size.");
                        }
                    }
                    int digestSize2 = a3.getDigestSize();
                    byte[] bArr = new byte[digestSize2];
                    a3.doFinal(bArr, 0);
                    this.d2.update(bArr, 0, digestSize2);
                    byte[] bArr2 = new byte[this.d2.getDigestSize()];
                    this.d2.doFinal(bArr2, 0);
                    return bArr2;
                } catch (Exception e) {
                    Exception exc = e;
                    throw new RuntimeException(exc.getMessage(), exc);
                }
            } catch (Exception e3) {
                Exception exc2 = e3;
                throw new RuntimeException(exc2.getMessage(), exc2);
            }
        } else {
            int i14 = i2 * 2;
            byte[] b8 = b(i14);
            byte[] b9 = b(i14 + 1);
            h3.C(d(), this.d2);
            h3.t3(i2, this.d2);
            n nVar2 = this.d2;
            nVar2.update((byte) 16777091);
            nVar2.update((byte) -31869);
            h3.C(b8, this.d2);
            h3.C(b9, this.d2);
            byte[] bArr3 = new byte[this.d2.getDigestSize()];
            this.d2.doFinal(bArr3, 0);
            return bArr3;
        }
    }

    public byte[] b(int i) {
        if (i >= this.c2) {
            return a(i);
        }
        a[] aVarArr = q;
        return c(i < aVarArr.length ? aVarArr[i] : new a(i));
    }

    public final byte[] c(a aVar) {
        synchronized (this.b2) {
            byte[] bArr = this.b2.get(aVar);
            if (bArr != null) {
                return bArr;
            }
            byte[] a3 = a(aVar.a);
            this.b2.put(aVar, a3);
            return a3;
        }
    }

    public byte[] d() {
        return h3.I(this.x);
    }

    public boolean equals(Object obj) {
        h hVar;
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        if (this.e2 != gVar.e2 || this.Z1 != gVar.Z1 || !Arrays.equals(this.x, gVar.x)) {
            return false;
        }
        LMSigParameters lMSigParameters = this.y;
        if (lMSigParameters == null ? gVar.y != null : !lMSigParameters.equals(gVar.y)) {
            return false;
        }
        LMOtsParameters lMOtsParameters = this.Y1;
        if (lMOtsParameters == null ? gVar.Y1 != null : !lMOtsParameters.equals(gVar.Y1)) {
            return false;
        }
        if (!Arrays.equals(this.a2, gVar.a2)) {
            return false;
        }
        h hVar2 = this.f2;
        if (hVar2 == null || (hVar = gVar.f2) == null) {
            return true;
        }
        return hVar2.equals(hVar);
    }

    public h f() {
        h hVar;
        synchronized (this) {
            if (this.f2 == null) {
                this.f2 = new h(this.y, this.Y1, c(d), this.x);
            }
            hVar = this.f2;
        }
        return hVar;
    }

    public byte[] getEncoded() throws IOException {
        a aVar = new a();
        aVar.d(0);
        aVar.d(this.y.g);
        aVar.d(this.Y1.f);
        aVar.c(this.x);
        aVar.d(this.e2);
        aVar.d(this.Z1);
        aVar.d(this.a2.length);
        aVar.c(this.a2);
        return aVar.a();
    }

    public int hashCode() {
        int m1 = (h3.m1(this.x) + (this.e2 * 31)) * 31;
        LMSigParameters lMSigParameters = this.y;
        int i = 0;
        int hashCode = (m1 + (lMSigParameters != null ? lMSigParameters.hashCode() : 0)) * 31;
        LMOtsParameters lMOtsParameters = this.Y1;
        int m12 = (h3.m1(this.a2) + ((((hashCode + (lMOtsParameters != null ? lMOtsParameters.hashCode() : 0)) * 31) + this.Z1) * 31)) * 31;
        h hVar = this.f2;
        if (hVar != null) {
            i = hVar.hashCode();
        }
        return m12 + i;
    }
}
