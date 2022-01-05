package s0.a.f.b.a;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class d extends f {
    public final int d;
    public final h q;

    public d(int i, h hVar) {
        super(false);
        this.d = i;
        this.q = hVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x003b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static s0.a.f.b.a.d a(java.lang.Object r3) throws java.io.IOException {
        /*
            boolean r0 = r3 instanceof s0.a.f.b.a.d
            if (r0 == 0) goto L_0x0007
            s0.a.f.b.a.d r3 = (s0.a.f.b.a.d) r3
            return r3
        L_0x0007:
            boolean r0 = r3 instanceof java.io.DataInputStream
            if (r0 == 0) goto L_0x001c
            r0 = r3
            java.io.DataInputStream r0 = (java.io.DataInputStream) r0
            int r0 = r0.readInt()
            s0.a.f.b.a.h r3 = s0.a.f.b.a.h.a(r3)
            s0.a.f.b.a.d r1 = new s0.a.f.b.a.d
            r1.<init>(r0, r3)
            return r1
        L_0x001c:
            boolean r0 = r3 instanceof byte[]
            if (r0 == 0) goto L_0x003f
            r0 = 0
            java.io.DataInputStream r1 = new java.io.DataInputStream     // Catch:{ all -> 0x0038 }
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x0038 }
            byte[] r3 = (byte[]) r3     // Catch:{ all -> 0x0038 }
            r2.<init>(r3)     // Catch:{ all -> 0x0038 }
            r1.<init>(r2)     // Catch:{ all -> 0x0038 }
            s0.a.f.b.a.d r3 = a(r1)     // Catch:{ all -> 0x0035 }
            r1.close()
            return r3
        L_0x0035:
            r3 = move-exception
            r0 = r1
            goto L_0x0039
        L_0x0038:
            r3 = move-exception
        L_0x0039:
            if (r0 == 0) goto L_0x003e
            r0.close()
        L_0x003e:
            throw r3
        L_0x003f:
            boolean r0 = r3 instanceof java.io.InputStream
            if (r0 == 0) goto L_0x004e
            java.io.InputStream r3 = (java.io.InputStream) r3
            byte[] r3 = s0.a.g.l.a.a(r3)
            s0.a.f.b.a.d r3 = a(r3)
            return r3
        L_0x004e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "cannot parse "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.a.f.b.a.d.a(java.lang.Object):s0.a.f.b.a.d");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.d != dVar.d) {
            return false;
        }
        return this.q.equals(dVar.q);
    }

    public byte[] getEncoded() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = this.d;
        byteArrayOutputStream.write((byte) (i >>> 24));
        byteArrayOutputStream.write((byte) (i >>> 16));
        byteArrayOutputStream.write((byte) (i >>> 8));
        byteArrayOutputStream.write((byte) i);
        try {
            byteArrayOutputStream.write(this.q.getEncoded());
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public int hashCode() {
        return this.q.hashCode() + (this.d * 31);
    }
}
