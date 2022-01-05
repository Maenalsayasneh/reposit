package s0.a.f.b.a;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class c extends f {
    public final long Y1;
    public long Z1 = 0;
    public final int d;
    public final boolean q;
    public List<g> x;
    public List<i> y;

    public c(int i, List<g> list, List<i> list2, long j, long j2, boolean z) {
        super(true);
        this.d = i;
        this.x = Collections.unmodifiableList(list);
        this.y = Collections.unmodifiableList(list2);
        this.Z1 = j;
        this.Y1 = j2;
        this.q = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0078  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static s0.a.f.b.a.c a(java.lang.Object r11) throws java.io.IOException {
        /*
            boolean r0 = r11 instanceof s0.a.f.b.a.c
            if (r0 == 0) goto L_0x0007
            s0.a.f.b.a.c r11 = (s0.a.f.b.a.c) r11
            return r11
        L_0x0007:
            boolean r0 = r11 instanceof java.io.DataInputStream
            if (r0 == 0) goto L_0x0059
            r0 = r11
            java.io.DataInputStream r0 = (java.io.DataInputStream) r0
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x0051
            int r3 = r0.readInt()
            long r6 = r0.readLong()
            long r8 = r0.readLong()
            boolean r10 = r0.readBoolean()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r0 = 0
            r1 = r0
        L_0x0030:
            if (r1 >= r3) goto L_0x003c
            s0.a.f.b.a.g r2 = s0.a.f.b.a.g.e(r11)
            r4.add(r2)
            int r1 = r1 + 1
            goto L_0x0030
        L_0x003c:
            int r1 = r3 + -1
            if (r0 >= r1) goto L_0x004a
            s0.a.f.b.a.i r1 = s0.a.f.b.a.i.a(r11)
            r5.add(r1)
            int r0 = r0 + 1
            goto L_0x003c
        L_0x004a:
            s0.a.f.b.a.c r11 = new s0.a.f.b.a.c
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r8, r10)
            return r11
        L_0x0051:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "unknown version for hss private key"
            r11.<init>(r0)
            throw r11
        L_0x0059:
            boolean r0 = r11 instanceof byte[]
            if (r0 == 0) goto L_0x007c
            r0 = 0
            java.io.DataInputStream r1 = new java.io.DataInputStream     // Catch:{ all -> 0x0075 }
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x0075 }
            byte[] r11 = (byte[]) r11     // Catch:{ all -> 0x0075 }
            r2.<init>(r11)     // Catch:{ all -> 0x0075 }
            r1.<init>(r2)     // Catch:{ all -> 0x0075 }
            s0.a.f.b.a.c r11 = a(r1)     // Catch:{ all -> 0x0072 }
            r1.close()
            return r11
        L_0x0072:
            r11 = move-exception
            r0 = r1
            goto L_0x0076
        L_0x0075:
            r11 = move-exception
        L_0x0076:
            if (r0 == 0) goto L_0x007b
            r0.close()
        L_0x007b:
            throw r11
        L_0x007c:
            boolean r0 = r11 instanceof java.io.InputStream
            if (r0 == 0) goto L_0x008b
            java.io.InputStream r11 = (java.io.InputStream) r11
            byte[] r11 = s0.a.g.l.a.a(r11)
            s0.a.f.b.a.c r11 = a(r11)
            return r11
        L_0x008b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "cannot parse "
            r1.append(r2)
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r0.<init>(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.a.f.b.a.c.a(java.lang.Object):s0.a.f.b.a.c");
    }

    public Object clone() throws CloneNotSupportedException {
        try {
            return a(getEncoded());
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.d == cVar.d && this.q == cVar.q && this.Y1 == cVar.Y1 && this.Z1 == cVar.Z1 && this.x.equals(cVar.x)) {
            return this.y.equals(cVar.y);
        }
        return false;
    }

    public synchronized byte[] getEncoded() throws IOException {
        a aVar;
        aVar = new a();
        aVar.d(0);
        aVar.d(this.d);
        long j = this.Z1;
        aVar.d((int) (j >>> 32));
        aVar.d((int) j);
        long j2 = this.Y1;
        aVar.d((int) (j2 >>> 32));
        aVar.d((int) j2);
        aVar.a.write(this.q ? 1 : 0);
        for (g b : this.x) {
            aVar.b(b);
        }
        for (i b2 : this.y) {
            aVar.b(b2);
        }
        return aVar.a();
    }

    public int hashCode() {
        int hashCode = this.x.hashCode();
        int hashCode2 = this.y.hashCode();
        long j = this.Y1;
        long j2 = this.Z1;
        return ((((hashCode2 + ((hashCode + (((this.d * 31) + (this.q ? 1 : 0)) * 31)) * 31)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }
}
