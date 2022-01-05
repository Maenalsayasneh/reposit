package s0.a.a.b3.e;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1ParsingException;
import s0.a.a.b3.d;
import s0.a.a.e;
import s0.a.a.f1;
import s0.a.a.n;
import s0.a.a.r;

public abstract class a implements d {
    public static Hashtable e(Hashtable hashtable) {
        Hashtable hashtable2 = new Hashtable();
        Enumeration keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            Object nextElement = keys.nextElement();
            hashtable2.put(nextElement, hashtable.get(nextElement));
        }
        return hashtable2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0070 A[LOOP:0: B:10:0x0037->B:35:0x0070, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(s0.a.a.b3.c r9, s0.a.a.b3.c r10) {
        /*
            r8 = this;
            s0.a.a.b3.b[] r9 = r9.u()
            s0.a.a.b3.b[] r10 = r10.u()
            int r0 = r9.length
            int r1 = r10.length
            r2 = 0
            if (r0 == r1) goto L_0x000e
            return r2
        L_0x000e:
            r0 = r9[r2]
            s0.a.a.b3.a r0 = r0.s()
            r1 = 1
            if (r0 == 0) goto L_0x0035
            r0 = r10[r2]
            s0.a.a.b3.a r0 = r0.s()
            if (r0 == 0) goto L_0x0035
            r0 = r9[r2]
            s0.a.a.b3.a r0 = r0.s()
            s0.a.a.n r0 = r0.c
            r3 = r10[r2]
            s0.a.a.b3.a r3 = r3.s()
            s0.a.a.n r3 = r3.c
            boolean r0 = r0.w(r3)
            r0 = r0 ^ r1
            goto L_0x0036
        L_0x0035:
            r0 = r2
        L_0x0036:
            r3 = r2
        L_0x0037:
            int r4 = r9.length
            if (r3 == r4) goto L_0x0073
            r4 = r9[r3]
            r5 = 0
            if (r0 == 0) goto L_0x0055
            int r6 = r10.length
            int r6 = r6 - r1
        L_0x0041:
            if (r6 < 0) goto L_0x006c
            r7 = r10[r6]
            if (r7 == 0) goto L_0x0052
            r7 = r10[r6]
            boolean r7 = m0.r.t.a.r.m.a1.a.b3(r4, r7)
            if (r7 == 0) goto L_0x0052
            r10[r6] = r5
            goto L_0x0067
        L_0x0052:
            int r6 = r6 + -1
            goto L_0x0041
        L_0x0055:
            r6 = r2
        L_0x0056:
            int r7 = r10.length
            if (r6 == r7) goto L_0x006c
            r7 = r10[r6]
            if (r7 == 0) goto L_0x0069
            r7 = r10[r6]
            boolean r7 = m0.r.t.a.r.m.a1.a.b3(r4, r7)
            if (r7 == 0) goto L_0x0069
            r10[r6] = r5
        L_0x0067:
            r4 = r1
            goto L_0x006d
        L_0x0069:
            int r6 = r6 + 1
            goto L_0x0056
        L_0x006c:
            r4 = r2
        L_0x006d:
            if (r4 != 0) goto L_0x0070
            return r2
        L_0x0070:
            int r3 = r3 + 1
            goto L_0x0037
        L_0x0073:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.a.a.b3.e.a.a(s0.a.a.b3.c, s0.a.a.b3.c):boolean");
    }

    public e f(n nVar, String str) {
        return new f1(str);
    }

    public e g(n nVar, String str) {
        if (str.length() == 0 || str.charAt(0) != '#') {
            if (str.length() != 0 && str.charAt(0) == '\\') {
                str = str.substring(1);
            }
            return f(nVar, str);
        }
        try {
            int length = (str.length() - 1) / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i != length; i++) {
                int i2 = (i * 2) + 1;
                char charAt = str.charAt(i2);
                bArr[i] = (byte) (m0.r.t.a.r.m.a1.a.L0(str.charAt(i2 + 1)) | (m0.r.t.a.r.m.a1.a.L0(charAt) << 4));
            }
            return r.x(bArr);
        } catch (IOException unused) {
            StringBuilder P0 = i0.d.a.a.a.P0("can't recode value for oid ");
            P0.append(nVar.d);
            throw new ASN1ParsingException(P0.toString());
        }
    }
}
