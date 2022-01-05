package s0.a.f.b.a;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import org.bouncycastle.pqc.crypto.lms.LMOtsParameters;
import org.bouncycastle.pqc.crypto.lms.LMSigParameters;
import s0.a.e.b.b0.c.h3;

public class h extends f {
    public final LMSigParameters d;
    public final LMOtsParameters q;
    public final byte[] x;
    public final byte[] y;

    public h(LMSigParameters lMSigParameters, LMOtsParameters lMOtsParameters, byte[] bArr, byte[] bArr2) {
        super(false);
        this.d = lMSigParameters;
        this.q = lMOtsParameters;
        this.x = h3.I(bArr2);
        this.y = h3.I(bArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0050  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static s0.a.f.b.a.h a(java.lang.Object r4) throws java.io.IOException {
        /*
            boolean r0 = r4 instanceof s0.a.f.b.a.h
            if (r0 == 0) goto L_0x0007
            s0.a.f.b.a.h r4 = (s0.a.f.b.a.h) r4
            return r4
        L_0x0007:
            boolean r0 = r4 instanceof java.io.DataInputStream
            if (r0 == 0) goto L_0x0031
            java.io.DataInputStream r4 = (java.io.DataInputStream) r4
            int r0 = r4.readInt()
            org.bouncycastle.pqc.crypto.lms.LMSigParameters r0 = org.bouncycastle.pqc.crypto.lms.LMSigParameters.a(r0)
            int r1 = r4.readInt()
            org.bouncycastle.pqc.crypto.lms.LMOtsParameters r1 = org.bouncycastle.pqc.crypto.lms.LMOtsParameters.a(r1)
            r2 = 16
            byte[] r2 = new byte[r2]
            r4.readFully(r2)
            int r3 = r0.h
            byte[] r3 = new byte[r3]
            r4.readFully(r3)
            s0.a.f.b.a.h r4 = new s0.a.f.b.a.h
            r4.<init>(r0, r1, r3, r2)
            return r4
        L_0x0031:
            boolean r0 = r4 instanceof byte[]
            if (r0 == 0) goto L_0x0054
            r0 = 0
            java.io.DataInputStream r1 = new java.io.DataInputStream     // Catch:{ all -> 0x004d }
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x004d }
            byte[] r4 = (byte[]) r4     // Catch:{ all -> 0x004d }
            r2.<init>(r4)     // Catch:{ all -> 0x004d }
            r1.<init>(r2)     // Catch:{ all -> 0x004d }
            s0.a.f.b.a.h r4 = a(r1)     // Catch:{ all -> 0x004a }
            r1.close()
            return r4
        L_0x004a:
            r4 = move-exception
            r0 = r1
            goto L_0x004e
        L_0x004d:
            r4 = move-exception
        L_0x004e:
            if (r0 == 0) goto L_0x0053
            r0.close()
        L_0x0053:
            throw r4
        L_0x0054:
            boolean r0 = r4 instanceof java.io.InputStream
            if (r0 == 0) goto L_0x0063
            java.io.InputStream r4 = (java.io.InputStream) r4
            byte[] r4 = s0.a.g.l.a.a(r4)
            s0.a.f.b.a.h r4 = a(r4)
            return r4
        L_0x0063:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "cannot parse "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.a.f.b.a.h.a(java.lang.Object):s0.a.f.b.a.h");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        if (this.d.equals(hVar.d) && this.q.equals(hVar.q) && Arrays.equals(this.x, hVar.x)) {
            return Arrays.equals(this.y, hVar.y);
        }
        return false;
    }

    public byte[] getEncoded() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = this.d.g;
        byteArrayOutputStream.write((byte) (i >>> 24));
        byteArrayOutputStream.write((byte) (i >>> 16));
        byteArrayOutputStream.write((byte) (i >>> 8));
        byteArrayOutputStream.write((byte) i);
        int i2 = this.q.f;
        byteArrayOutputStream.write((byte) (i2 >>> 24));
        byteArrayOutputStream.write((byte) (i2 >>> 16));
        byteArrayOutputStream.write((byte) (i2 >>> 8));
        byteArrayOutputStream.write((byte) i2);
        try {
            byteArrayOutputStream.write(this.x);
            try {
                byteArrayOutputStream.write(this.y);
                return byteArrayOutputStream.toByteArray();
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage(), e);
            }
        } catch (Exception e2) {
            throw new RuntimeException(e2.getMessage(), e2);
        }
    }

    public int hashCode() {
        int hashCode = this.q.hashCode();
        int m1 = h3.m1(this.x);
        return h3.m1(this.y) + ((m1 + ((hashCode + (this.d.hashCode() * 31)) * 31)) * 31);
    }
}
