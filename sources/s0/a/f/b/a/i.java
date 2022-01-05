package s0.a.f.b.a;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import org.bouncycastle.pqc.crypto.lms.LMSigParameters;
import s0.a.g.d;

public class i implements d {
    public final int c;
    public final e d;
    public final LMSigParameters q;
    public final byte[][] x;

    public i(int i, e eVar, LMSigParameters lMSigParameters, byte[][] bArr) {
        this.c = i;
        this.d = eVar;
        this.q = lMSigParameters;
        this.x = bArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0058  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static s0.a.f.b.a.i a(java.lang.Object r7) throws java.io.IOException {
        /*
            boolean r0 = r7 instanceof s0.a.f.b.a.i
            if (r0 == 0) goto L_0x0007
            s0.a.f.b.a.i r7 = (s0.a.f.b.a.i) r7
            return r7
        L_0x0007:
            boolean r0 = r7 instanceof java.io.DataInputStream
            if (r0 == 0) goto L_0x0039
            r0 = r7
            java.io.DataInputStream r0 = (java.io.DataInputStream) r0
            int r1 = r0.readInt()
            s0.a.f.b.a.e r7 = s0.a.f.b.a.e.a(r7)
            int r2 = r0.readInt()
            org.bouncycastle.pqc.crypto.lms.LMSigParameters r2 = org.bouncycastle.pqc.crypto.lms.LMSigParameters.a(r2)
            int r3 = r2.i
            byte[][] r4 = new byte[r3][]
            r5 = 0
        L_0x0023:
            if (r5 >= r3) goto L_0x0033
            int r6 = r2.h
            byte[] r6 = new byte[r6]
            r4[r5] = r6
            r6 = r4[r5]
            r0.readFully(r6)
            int r5 = r5 + 1
            goto L_0x0023
        L_0x0033:
            s0.a.f.b.a.i r0 = new s0.a.f.b.a.i
            r0.<init>(r1, r7, r2, r4)
            return r0
        L_0x0039:
            boolean r0 = r7 instanceof byte[]
            if (r0 == 0) goto L_0x005c
            r0 = 0
            java.io.DataInputStream r1 = new java.io.DataInputStream     // Catch:{ all -> 0x0055 }
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x0055 }
            byte[] r7 = (byte[]) r7     // Catch:{ all -> 0x0055 }
            r2.<init>(r7)     // Catch:{ all -> 0x0055 }
            r1.<init>(r2)     // Catch:{ all -> 0x0055 }
            s0.a.f.b.a.i r7 = a(r1)     // Catch:{ all -> 0x0052 }
            r1.close()
            return r7
        L_0x0052:
            r7 = move-exception
            r0 = r1
            goto L_0x0056
        L_0x0055:
            r7 = move-exception
        L_0x0056:
            if (r0 == 0) goto L_0x005b
            r0.close()
        L_0x005b:
            throw r7
        L_0x005c:
            boolean r0 = r7 instanceof java.io.InputStream
            if (r0 == 0) goto L_0x006b
            java.io.InputStream r7 = (java.io.InputStream) r7
            byte[] r7 = s0.a.g.l.a.a(r7)
            s0.a.f.b.a.i r7 = a(r7)
            return r7
        L_0x006b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "cannot parse "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.a.f.b.a.i.a(java.lang.Object):s0.a.f.b.a.i");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (this.c != iVar.c) {
            return false;
        }
        e eVar = this.d;
        if (eVar == null ? iVar.d != null : !eVar.equals(iVar.d)) {
            return false;
        }
        LMSigParameters lMSigParameters = this.q;
        if (lMSigParameters == null ? iVar.q == null : lMSigParameters.equals(iVar.q)) {
            return Arrays.deepEquals(this.x, iVar.x);
        }
        return false;
    }

    public byte[] getEncoded() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = this.c;
        byteArrayOutputStream.write((byte) (i >>> 24));
        byteArrayOutputStream.write((byte) (i >>> 16));
        byteArrayOutputStream.write((byte) (i >>> 8));
        byteArrayOutputStream.write((byte) i);
        try {
            byteArrayOutputStream.write(this.d.getEncoded());
            int i2 = this.q.g;
            byteArrayOutputStream.write((byte) (i2 >>> 24));
            byteArrayOutputStream.write((byte) (i2 >>> 16));
            byteArrayOutputStream.write((byte) (i2 >>> 8));
            byteArrayOutputStream.write((byte) i2);
            try {
                for (byte[] write : this.x) {
                    byteArrayOutputStream.write(write);
                }
                return byteArrayOutputStream.toByteArray();
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage(), e);
            }
        } catch (Exception e2) {
            throw new RuntimeException(e2.getMessage(), e2);
        }
    }

    public int hashCode() {
        int i = this.c * 31;
        e eVar = this.d;
        int i2 = 0;
        int hashCode = (i + (eVar != null ? eVar.hashCode() : 0)) * 31;
        LMSigParameters lMSigParameters = this.q;
        if (lMSigParameters != null) {
            i2 = lMSigParameters.hashCode();
        }
        return Arrays.deepHashCode(this.x) + ((hashCode + i2) * 31);
    }
}
