package com.google.android.play.core.install;

import com.google.android.play.core.tasks.j;

public class InstallException extends j {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0063 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public InstallException(int r8) {
        /*
            r7 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r2 = 0
            r0[r2] = r1
            java.util.Map<java.lang.Integer, java.lang.String> r1 = i0.h.a.d.a.d.b.a.a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            boolean r3 = r1.containsKey(r2)
            if (r3 == 0) goto L_0x0053
            java.util.Map<java.lang.Integer, java.lang.String> r3 = i0.h.a.d.a.d.b.a.b
            boolean r4 = r3.containsKey(r2)
            if (r4 != 0) goto L_0x001f
            goto L_0x0053
        L_0x001f:
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r3.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r3 = r3.length()
            java.lang.String r4 = java.lang.String.valueOf(r2)
            int r4 = r4.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r3 = r3 + 103
            int r3 = r3 + r4
            r5.<init>(r3)
            java.lang.String r3 = " ("
            java.lang.String r4 = "https://developer.android.com/reference/com/google/android/play/core/install/model/InstallErrorCode"
            java.lang.String r6 = "#"
            i0.d.a.a.a.s(r5, r1, r3, r4, r6)
            java.lang.String r1 = ")"
            java.lang.String r1 = i0.d.a.a.a.y0(r5, r2, r1)
            goto L_0x0055
        L_0x0053:
            java.lang.String r1 = ""
        L_0x0055:
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = "Install Error(%d): %s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r7.<init>((java.lang.String) r0)
            if (r8 == 0) goto L_0x0064
            return
        L_0x0064:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "errorCode should not be 0."
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.install.InstallException.<init>(int):void");
    }
}
