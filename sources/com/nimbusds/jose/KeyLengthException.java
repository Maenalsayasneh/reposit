package com.nimbusds.jose;

public class KeyLengthException extends KeyException {
    public KeyLengthException(String str) {
        super(str);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public KeyLengthException(int r4, com.nimbusds.jose.Algorithm r5) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            if (r4 <= 0) goto L_0x0010
            java.lang.String r1 = "The expected key length is "
            java.lang.String r2 = " bits"
            java.lang.String r4 = i0.d.a.a.a.g0(r1, r4, r2)
            goto L_0x0012
        L_0x0010:
            java.lang.String r4 = "Unexpected key length"
        L_0x0012:
            r0.append(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = " (for "
            r4.append(r1)
            r4.append(r5)
            java.lang.String r5 = " algorithm)"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nimbusds.jose.KeyLengthException.<init>(int, com.nimbusds.jose.Algorithm):void");
    }
}
