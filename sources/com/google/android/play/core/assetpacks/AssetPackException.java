package com.google.android.play.core.assetpacks;

import com.google.android.play.core.tasks.j;

public class AssetPackException extends j {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AssetPackException(int r8) {
        /*
            r7 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r2 = 0
            r0[r2] = r1
            java.util.Map<java.lang.Integer, java.lang.String> r1 = i0.h.a.d.a.b.u2.a.a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            boolean r3 = r1.containsKey(r2)
            if (r3 != 0) goto L_0x0019
            java.lang.String r1 = ""
            goto L_0x004e
        L_0x0019:
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Map<java.lang.Integer, java.lang.String> r3 = i0.h.a.d.a.b.u2.a.b
            java.lang.Object r2 = r3.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r3 = r3.length()
            java.lang.String r4 = java.lang.String.valueOf(r2)
            int r4 = r4.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r3 = r3 + 113
            int r3 = r3 + r4
            r5.<init>(r3)
            java.lang.String r3 = " ("
            java.lang.String r4 = "https://developer.android.com/reference/com/google/android/play/core/assetpacks/model/AssetPackErrorCode.html"
            java.lang.String r6 = "#"
            i0.d.a.a.a.s(r5, r1, r3, r4, r6)
            java.lang.String r1 = ")"
            java.lang.String r1 = i0.d.a.a.a.y0(r5, r2, r1)
        L_0x004e:
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = "Asset Pack Download Error(%d): %s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r7.<init>((java.lang.String) r0)
            if (r8 == 0) goto L_0x005d
            return
        L_0x005d:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "errorCode should not be 0."
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.AssetPackException.<init>(int):void");
    }
}
