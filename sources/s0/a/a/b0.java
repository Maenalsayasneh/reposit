package s0.a.a;

import java.io.IOException;

public class b0 extends a {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b0(int r5, s0.a.a.f r6) {
        /*
            r4 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 0
        L_0x0006:
            int r2 = r6.c
            if (r1 == r2) goto L_0x0034
            s0.a.a.e r2 = r6.c(r1)     // Catch:{ IOException -> 0x001c }
            s0.a.a.m r2 = (s0.a.a.m) r2     // Catch:{ IOException -> 0x001c }
            java.lang.String r3 = "BER"
            byte[] r2 = r2.r(r3)     // Catch:{ IOException -> 0x001c }
            r0.write(r2)     // Catch:{ IOException -> 0x001c }
            int r1 = r1 + 1
            goto L_0x0006
        L_0x001c:
            r5 = move-exception
            org.bouncycastle.asn1.ASN1ParsingException r6 = new org.bouncycastle.asn1.ASN1ParsingException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "malformed object: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0, r5)
            throw r6
        L_0x0034:
            byte[] r6 = r0.toByteArray()
            r0 = 1
            r4.<init>(r0, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.a.a.b0.<init>(int, s0.a.a.f):void");
    }

    public void t(q qVar, boolean z) throws IOException {
        int i = this.c ? 96 : 64;
        int i2 = this.d;
        byte[] bArr = this.q;
        qVar.m(z, i, i2);
        qVar.a.write(128);
        qVar.a.write(bArr, 0, bArr.length);
        qVar.a.write(0);
        qVar.a.write(0);
    }
}
