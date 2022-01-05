package s0.a.f.b.a;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import org.bouncycastle.pqc.crypto.lms.LMOtsParameters;
import s0.a.g.d;

public class e implements d {
    public final LMOtsParameters c;
    public final byte[] d;
    public final byte[] q;

    public e(LMOtsParameters lMOtsParameters, byte[] bArr, byte[] bArr2) {
        this.c = lMOtsParameters;
        this.d = bArr;
        this.q = bArr2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static s0.a.f.b.a.e a(java.lang.Object r4) throws java.io.IOException {
        /*
            boolean r0 = r4 instanceof s0.a.f.b.a.e
            if (r0 == 0) goto L_0x0007
            s0.a.f.b.a.e r4 = (s0.a.f.b.a.e) r4
            return r4
        L_0x0007:
            boolean r0 = r4 instanceof java.io.DataInputStream
            if (r0 == 0) goto L_0x002c
            java.io.DataInputStream r4 = (java.io.DataInputStream) r4
            int r0 = r4.readInt()
            org.bouncycastle.pqc.crypto.lms.LMOtsParameters r0 = org.bouncycastle.pqc.crypto.lms.LMOtsParameters.a(r0)
            int r1 = r0.g
            byte[] r1 = new byte[r1]
            r4.readFully(r1)
            int r2 = r0.i
            int r3 = r0.g
            int r2 = r2 * r3
            byte[] r2 = new byte[r2]
            r4.readFully(r2)
            s0.a.f.b.a.e r4 = new s0.a.f.b.a.e
            r4.<init>(r0, r1, r2)
            return r4
        L_0x002c:
            boolean r0 = r4 instanceof byte[]
            if (r0 == 0) goto L_0x004f
            r0 = 0
            java.io.DataInputStream r1 = new java.io.DataInputStream     // Catch:{ all -> 0x0048 }
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x0048 }
            byte[] r4 = (byte[]) r4     // Catch:{ all -> 0x0048 }
            r2.<init>(r4)     // Catch:{ all -> 0x0048 }
            r1.<init>(r2)     // Catch:{ all -> 0x0048 }
            s0.a.f.b.a.e r4 = a(r1)     // Catch:{ all -> 0x0045 }
            r1.close()
            return r4
        L_0x0045:
            r4 = move-exception
            r0 = r1
            goto L_0x0049
        L_0x0048:
            r4 = move-exception
        L_0x0049:
            if (r0 == 0) goto L_0x004e
            r0.close()
        L_0x004e:
            throw r4
        L_0x004f:
            boolean r0 = r4 instanceof java.io.InputStream
            if (r0 == 0) goto L_0x005e
            java.io.InputStream r4 = (java.io.InputStream) r4
            byte[] r4 = s0.a.g.l.a.a(r4)
            s0.a.f.b.a.e r4 = a(r4)
            return r4
        L_0x005e:
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
        throw new UnsupportedOperationException("Method not decompiled: s0.a.f.b.a.e.a(java.lang.Object):s0.a.f.b.a.e");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        LMOtsParameters lMOtsParameters = this.c;
        if (lMOtsParameters == null ? eVar.c != null : !lMOtsParameters.equals(eVar.c)) {
            return false;
        }
        if (!Arrays.equals(this.d, eVar.d)) {
            return false;
        }
        return Arrays.equals(this.q, eVar.q);
    }

    public byte[] getEncoded() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = this.c.f;
        byteArrayOutputStream.write((byte) (i >>> 24));
        byteArrayOutputStream.write((byte) (i >>> 16));
        byteArrayOutputStream.write((byte) (i >>> 8));
        byteArrayOutputStream.write((byte) i);
        try {
            byteArrayOutputStream.write(this.d);
            try {
                byteArrayOutputStream.write(this.q);
                return byteArrayOutputStream.toByteArray();
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage(), e);
            }
        } catch (Exception e2) {
            throw new RuntimeException(e2.getMessage(), e2);
        }
    }

    public int hashCode() {
        LMOtsParameters lMOtsParameters = this.c;
        int hashCode = lMOtsParameters != null ? lMOtsParameters.hashCode() : 0;
        return Arrays.hashCode(this.q) + ((Arrays.hashCode(this.d) + (hashCode * 31)) * 31);
    }
}
