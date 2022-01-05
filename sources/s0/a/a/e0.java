package s0.a.a;

import java.io.IOException;
import java.util.Enumeration;
import java.util.NoSuchElementException;

public class e0 extends o {
    public final int d;
    public final o[] q;

    public class a implements Enumeration {
        public int a = 0;

        public a() {
        }

        public boolean hasMoreElements() {
            return this.a < e0.this.c.length;
        }

        public Object nextElement() {
            int i = this.a;
            e0 e0Var = e0.this;
            byte[] bArr = e0Var.c;
            if (i < bArr.length) {
                int min = Math.min(bArr.length - i, e0Var.d);
                byte[] bArr2 = new byte[min];
                System.arraycopy(e0.this.c, this.a, bArr2, 0, min);
                this.a += min;
                return new x0(bArr2);
            }
            throw new NoSuchElementException();
        }
    }

    public class b implements Enumeration {
        public int a = 0;

        public b() {
        }

        public boolean hasMoreElements() {
            return this.a < e0.this.q.length;
        }

        public Object nextElement() {
            int i = this.a;
            o[] oVarArr = e0.this.q;
            if (i < oVarArr.length) {
                this.a = i + 1;
                return oVarArr[i];
            }
            throw new NoSuchElementException();
        }
    }

    public e0(byte[] bArr) {
        super(bArr);
        this.q = null;
        this.d = 1000;
    }

    public static e0 D(s sVar) {
        int size = sVar.size();
        o[] oVarArr = new o[size];
        for (int i = 0; i < size; i++) {
            oVarArr[i] = o.B(sVar.D(i));
        }
        return new e0(oVarArr);
    }

    public Enumeration E() {
        return this.q == null ? new a() : new b();
    }

    public void t(q qVar, boolean z) throws IOException {
        Enumeration E = E();
        if (z) {
            qVar.a.write(36);
        }
        qVar.a.write(128);
        qVar.d(E);
        qVar.a.write(0);
        qVar.a.write(0);
    }

    public int u() throws IOException {
        Enumeration E = E();
        int i = 0;
        while (E.hasMoreElements()) {
            i += ((e) E.nextElement()).c().u();
        }
        return i + 2 + 2;
    }

    public boolean y() {
        return true;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e0(s0.a.a.o[] r4) {
        /*
            r3 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 0
        L_0x0006:
            int r2 = r4.length
            if (r1 == r2) goto L_0x002b
            r2 = r4[r1]     // Catch:{ IOException -> 0x0013 }
            byte[] r2 = r2.c     // Catch:{ IOException -> 0x0013 }
            r0.write(r2)     // Catch:{ IOException -> 0x0013 }
            int r1 = r1 + 1
            goto L_0x0006
        L_0x0013:
            r4 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "exception converting octets "
            java.lang.StringBuilder r1 = i0.d.a.a.a.P0(r1)
            java.lang.String r4 = r4.toString()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L_0x002b:
            byte[] r0 = r0.toByteArray()
            r3.<init>(r0)
            r3.q = r4
            r4 = 1000(0x3e8, float:1.401E-42)
            r3.d = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.a.a.e0.<init>(s0.a.a.o[]):void");
    }
}
