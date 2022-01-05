package r0;

import com.stripe.android.model.Stripe3ds2AuthParams;
import java.io.IOException;
import java.util.zip.Inflater;
import m0.n.b.i;

/* compiled from: InflaterSource.kt */
public final class n implements y {
    public int c;
    public boolean d;
    public final i q;
    public final Inflater x;

    public n(i iVar, Inflater inflater) {
        i.e(iVar, Stripe3ds2AuthParams.FIELD_SOURCE);
        i.e(inflater, "inflater");
        this.q = iVar;
        this.x = inflater;
    }

    public void close() throws IOException {
        if (!this.d) {
            this.x.end();
            this.d = true;
            this.q.close();
        }
    }

    public z d() {
        return this.q.d();
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0099 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long q0(r0.f r10, long r11) throws java.io.IOException {
        /*
            r9 = this;
            java.lang.String r0 = "sink"
            m0.n.b.i.e(r10, r0)
        L_0x0005:
            m0.n.b.i.e(r10, r0)
            r1 = 0
            int r3 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            r4 = 1
            if (r3 < 0) goto L_0x0011
            r5 = r4
            goto L_0x0012
        L_0x0011:
            r5 = 0
        L_0x0012:
            if (r5 == 0) goto L_0x00d3
            boolean r5 = r9.d
            r5 = r5 ^ r4
            if (r5 == 0) goto L_0x00c7
            if (r3 != 0) goto L_0x001d
            goto L_0x0094
        L_0x001d:
            r0.u r3 = r10.E(r4)     // Catch:{ DataFormatException -> 0x00c0 }
            int r4 = r3.c     // Catch:{ DataFormatException -> 0x00c0 }
            int r4 = 8192 - r4
            long r4 = (long) r4     // Catch:{ DataFormatException -> 0x00c0 }
            long r4 = java.lang.Math.min(r11, r4)     // Catch:{ DataFormatException -> 0x00c0 }
            int r4 = (int) r4     // Catch:{ DataFormatException -> 0x00c0 }
            java.util.zip.Inflater r5 = r9.x     // Catch:{ DataFormatException -> 0x00c0 }
            boolean r5 = r5.needsInput()     // Catch:{ DataFormatException -> 0x00c0 }
            if (r5 != 0) goto L_0x0034
            goto L_0x0056
        L_0x0034:
            r0.i r5 = r9.q     // Catch:{ DataFormatException -> 0x00c0 }
            boolean r5 = r5.t()     // Catch:{ DataFormatException -> 0x00c0 }
            if (r5 == 0) goto L_0x003d
            goto L_0x0056
        L_0x003d:
            r0.i r5 = r9.q     // Catch:{ DataFormatException -> 0x00c0 }
            r0.f r5 = r5.c()     // Catch:{ DataFormatException -> 0x00c0 }
            r0.u r5 = r5.c     // Catch:{ DataFormatException -> 0x00c0 }
            m0.n.b.i.c(r5)     // Catch:{ DataFormatException -> 0x00c0 }
            int r6 = r5.c     // Catch:{ DataFormatException -> 0x00c0 }
            int r7 = r5.b     // Catch:{ DataFormatException -> 0x00c0 }
            int r6 = r6 - r7
            r9.c = r6     // Catch:{ DataFormatException -> 0x00c0 }
            java.util.zip.Inflater r8 = r9.x     // Catch:{ DataFormatException -> 0x00c0 }
            byte[] r5 = r5.a     // Catch:{ DataFormatException -> 0x00c0 }
            r8.setInput(r5, r7, r6)     // Catch:{ DataFormatException -> 0x00c0 }
        L_0x0056:
            java.util.zip.Inflater r5 = r9.x     // Catch:{ DataFormatException -> 0x00c0 }
            byte[] r6 = r3.a     // Catch:{ DataFormatException -> 0x00c0 }
            int r7 = r3.c     // Catch:{ DataFormatException -> 0x00c0 }
            int r4 = r5.inflate(r6, r7, r4)     // Catch:{ DataFormatException -> 0x00c0 }
            int r5 = r9.c     // Catch:{ DataFormatException -> 0x00c0 }
            if (r5 != 0) goto L_0x0065
            goto L_0x0077
        L_0x0065:
            java.util.zip.Inflater r6 = r9.x     // Catch:{ DataFormatException -> 0x00c0 }
            int r6 = r6.getRemaining()     // Catch:{ DataFormatException -> 0x00c0 }
            int r5 = r5 - r6
            int r6 = r9.c     // Catch:{ DataFormatException -> 0x00c0 }
            int r6 = r6 - r5
            r9.c = r6     // Catch:{ DataFormatException -> 0x00c0 }
            r0.i r6 = r9.q     // Catch:{ DataFormatException -> 0x00c0 }
            long r7 = (long) r5     // Catch:{ DataFormatException -> 0x00c0 }
            r6.skip(r7)     // Catch:{ DataFormatException -> 0x00c0 }
        L_0x0077:
            if (r4 <= 0) goto L_0x0085
            int r5 = r3.c     // Catch:{ DataFormatException -> 0x00c0 }
            int r5 = r5 + r4
            r3.c = r5     // Catch:{ DataFormatException -> 0x00c0 }
            long r5 = r10.d     // Catch:{ DataFormatException -> 0x00c0 }
            long r3 = (long) r4     // Catch:{ DataFormatException -> 0x00c0 }
            long r5 = r5 + r3
            r10.d = r5     // Catch:{ DataFormatException -> 0x00c0 }
            goto L_0x0095
        L_0x0085:
            int r4 = r3.b     // Catch:{ DataFormatException -> 0x00c0 }
            int r5 = r3.c     // Catch:{ DataFormatException -> 0x00c0 }
            if (r4 != r5) goto L_0x0094
            r0.u r4 = r3.a()     // Catch:{ DataFormatException -> 0x00c0 }
            r10.c = r4     // Catch:{ DataFormatException -> 0x00c0 }
            r0.v.a(r3)     // Catch:{ DataFormatException -> 0x00c0 }
        L_0x0094:
            r3 = r1
        L_0x0095:
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x009a
            return r3
        L_0x009a:
            java.util.zip.Inflater r1 = r9.x
            boolean r1 = r1.finished()
            if (r1 != 0) goto L_0x00bd
            java.util.zip.Inflater r1 = r9.x
            boolean r1 = r1.needsDictionary()
            if (r1 == 0) goto L_0x00ab
            goto L_0x00bd
        L_0x00ab:
            r0.i r1 = r9.q
            boolean r1 = r1.t()
            if (r1 != 0) goto L_0x00b5
            goto L_0x0005
        L_0x00b5:
            java.io.EOFException r10 = new java.io.EOFException
            java.lang.String r11 = "source exhausted prematurely"
            r10.<init>(r11)
            throw r10
        L_0x00bd:
            r10 = -1
            return r10
        L_0x00c0:
            r10 = move-exception
            java.io.IOException r11 = new java.io.IOException
            r11.<init>(r10)
            throw r11
        L_0x00c7:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "closed"
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L_0x00d3:
            java.lang.String r10 = "byteCount < 0: "
            java.lang.String r10 = i0.d.a.a.a.k0(r10, r11)
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r10 = r10.toString()
            r11.<init>(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.n.q0(r0.f, long):long");
    }
}
