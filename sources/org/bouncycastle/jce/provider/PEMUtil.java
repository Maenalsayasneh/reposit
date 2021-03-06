package org.bouncycastle.jce.provider;

import i0.d.a.a.a;
import java.io.IOException;
import java.io.InputStream;
import s0.a.a.j;
import s0.a.a.r;
import s0.a.a.s;

public class PEMUtil {
    private final String _footer1;
    private final String _footer2;
    private final String _header1;
    private final String _header2;

    public PEMUtil(String str) {
        this._header1 = a.o0("-----BEGIN ", str, "-----");
        this._header2 = a.o0("-----BEGIN X509 ", str, "-----");
        this._footer1 = a.o0("-----END ", str, "-----");
        this._footer2 = a.o0("-----END X509 ", str, "-----");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0025 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String readLine(java.io.InputStream r5) throws java.io.IOException {
        /*
            r4 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
        L_0x0005:
            int r1 = r5.read()
            r2 = 13
            if (r1 == r2) goto L_0x001b
            r3 = 10
            if (r1 == r3) goto L_0x001b
            if (r1 < 0) goto L_0x001b
            if (r1 != r2) goto L_0x0016
            goto L_0x0005
        L_0x0016:
            char r1 = (char) r1
            r0.append(r1)
            goto L_0x0005
        L_0x001b:
            if (r1 < 0) goto L_0x0023
            int r2 = r0.length()
            if (r2 == 0) goto L_0x0005
        L_0x0023:
            if (r1 >= 0) goto L_0x0027
            r5 = 0
            return r5
        L_0x0027:
            java.lang.String r5 = r0.toString()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.PEMUtil.readLine(java.io.InputStream):java.lang.String");
    }

    public s readPEMObject(InputStream inputStream) throws IOException {
        String readLine;
        StringBuffer stringBuffer = new StringBuffer();
        do {
            readLine = readLine(inputStream);
            if (readLine == null || readLine.startsWith(this._header1) || readLine.startsWith(this._header2)) {
            }
            readLine = readLine(inputStream);
            break;
        } while (readLine.startsWith(this._header2));
        while (true) {
            String readLine2 = readLine(inputStream);
            if (readLine2 != null && !readLine2.startsWith(this._footer1) && !readLine2.startsWith(this._footer2)) {
                stringBuffer.append(readLine2);
            }
        }
        if (stringBuffer.length() == 0) {
            return null;
        }
        r i = new j(s0.a.g.k.a.a(stringBuffer.toString())).i();
        if (i instanceof s) {
            return (s) i;
        }
        throw new IOException("malformed PEM data encountered");
    }
}
