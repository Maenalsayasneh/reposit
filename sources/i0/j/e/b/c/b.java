package i0.j.e.b.c;

import com.instabug.library.annotation.e.e;

/* compiled from: PathRecognizer */
public class b {

    /* compiled from: PathRecognizer */
    public static class a {
        public e a;
        public int b;
        public float c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b2, code lost:
        if (r7 != com.instabug.library.annotation.e.g.a.TOP) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c3, code lost:
        if (r7 == com.instabug.library.annotation.e.g.a.BOTTOM) goto L_0x00df;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i0.j.e.b.c.b.a a(android.graphics.Path r11) {
        /*
            r10 = this;
            i0.j.e.b.c.b$a r0 = new i0.j.e.b.c.b$a
            r0.<init>()
            i0.j.e.b.c.a r1 = new i0.j.e.b.c.a
            r1.<init>(r11)
            com.instabug.library.annotation.e.e r11 = com.instabug.library.annotation.e.e.OVAL
            com.instabug.library.annotation.e.g r11 = r1.c(r11)
            android.graphics.Path r2 = r1.g
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            android.graphics.PointF r4 = new android.graphics.PointF
            r5 = 0
            r6 = 1096810496(0x41600000, float:14.0)
            r4.<init>(r5, r6)
            android.graphics.PointF r5 = new android.graphics.PointF
            r7 = 1105199104(0x41e00000, float:28.0)
            r5.<init>(r7, r6)
            float r6 = r5.x
            float r7 = r5.y
            float r8 = r4.x
            float r9 = r4.y
            float r6 = i0.j.c.l.a.b(r6, r7, r8, r9)
            r7 = 1130430464(0x43610000, float:225.0)
            float r7 = r7 + r6
            r8 = 1091567616(0x41100000, float:9.0)
            android.graphics.PointF r7 = i0.j.c.l.a.j(r8, r7, r5)
            r9 = 1124532224(0x43070000, float:135.0)
            float r6 = r6 + r9
            android.graphics.PointF r6 = i0.j.c.l.a.j(r8, r6, r5)
            android.graphics.Path r8 = new android.graphics.Path
            r8.<init>()
            float r9 = r4.x
            float r4 = r4.y
            r8.moveTo(r9, r4)
            float r4 = r5.x
            float r9 = r5.y
            r8.lineTo(r4, r9)
            float r4 = r7.x
            float r7 = r7.y
            r8.moveTo(r4, r7)
            float r4 = r5.x
            float r5 = r5.y
            r8.lineTo(r4, r5)
            float r4 = r6.x
            float r5 = r6.y
            r8.lineTo(r4, r5)
            r4 = 0
        L_0x006b:
            r5 = 36
            if (r4 >= r5) goto L_0x0081
            int r5 = r4 * 10
            android.graphics.Path r6 = i0.j.e.b.c.d.b(r8, r5)
            com.instabug.library.annotation.e.g r6 = r1.b(r6, r2)
            r6.d = r5
            r3.add(r6)
            int r4 = r4 + 1
            goto L_0x006b
        L_0x0081:
            java.lang.Object r2 = java.util.Collections.max(r3)
            com.instabug.library.annotation.e.g r2 = (com.instabug.library.annotation.e.g) r2
            int r4 = r2.d
            r5 = 10
            if (r4 < 0) goto L_0x0091
            r6 = 20
            if (r4 <= r6) goto L_0x00df
        L_0x0091:
            r6 = 360(0x168, float:5.04E-43)
            if (r4 > r6) goto L_0x0099
            r6 = 340(0x154, float:4.76E-43)
            if (r4 >= r6) goto L_0x00df
        L_0x0099:
            r6 = 160(0xa0, float:2.24E-43)
            if (r4 < r6) goto L_0x00a1
            r6 = 200(0xc8, float:2.8E-43)
            if (r4 <= r6) goto L_0x00df
        L_0x00a1:
            r6 = 180(0xb4, float:2.52E-43)
            if (r4 <= r6) goto L_0x00b4
            int r7 = r2.c2
            int r8 = r2.a2
            if (r7 <= r8) goto L_0x00ae
            com.instabug.library.annotation.e.g$a r7 = com.instabug.library.annotation.e.g.a.BOTTOM
            goto L_0x00b0
        L_0x00ae:
            com.instabug.library.annotation.e.g$a r7 = com.instabug.library.annotation.e.g.a.TOP
        L_0x00b0:
            com.instabug.library.annotation.e.g$a r8 = com.instabug.library.annotation.e.g.a.TOP
            if (r7 == r8) goto L_0x00df
        L_0x00b4:
            if (r4 >= r6) goto L_0x00c6
            int r7 = r2.c2
            int r8 = r2.a2
            if (r7 <= r8) goto L_0x00bf
            com.instabug.library.annotation.e.g$a r7 = com.instabug.library.annotation.e.g.a.BOTTOM
            goto L_0x00c1
        L_0x00bf:
            com.instabug.library.annotation.e.g$a r7 = com.instabug.library.annotation.e.g.a.TOP
        L_0x00c1:
            com.instabug.library.annotation.e.g$a r8 = com.instabug.library.annotation.e.g.a.BOTTOM
            if (r7 != r8) goto L_0x00c6
            goto L_0x00df
        L_0x00c6:
            if (r4 >= r6) goto L_0x00d1
            int r4 = r4 + r6
            int r4 = r4 / r5
            java.lang.Object r2 = r3.get(r4)
            com.instabug.library.annotation.e.g r2 = (com.instabug.library.annotation.e.g) r2
            goto L_0x00d9
        L_0x00d1:
            int r4 = r4 - r6
            int r4 = r4 / r5
            java.lang.Object r2 = r3.get(r4)
            com.instabug.library.annotation.e.g r2 = (com.instabug.library.annotation.e.g) r2
        L_0x00d9:
            r1.a(r3)
            java.util.Objects.requireNonNull(r2)
        L_0x00df:
            com.instabug.library.annotation.e.e r3 = com.instabug.library.annotation.e.e.RECT
            com.instabug.library.annotation.e.g r1 = r1.c(r3)
            float r4 = r2.q
            float r6 = r1.q
            int r7 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r8 = 1056964608(0x3f000000, float:0.5)
            if (r7 <= 0) goto L_0x0138
            float r7 = r11.q
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 <= 0) goto L_0x0138
            float r11 = r2.y
            int r11 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r11 > 0) goto L_0x0133
            float r11 = r2.Y1
            int r11 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r11 <= 0) goto L_0x0102
            goto L_0x0133
        L_0x0102:
            float r11 = r2.d2
            r1 = 1120403456(0x42c80000, float:100.0)
            int r11 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r11 >= 0) goto L_0x012e
            int r11 = r2.a2
            int r1 = r2.c2
            int r11 = r11 - r1
            int r11 = java.lang.Math.abs(r11)
            if (r11 >= r5) goto L_0x0125
            int r11 = r2.b2
            int r1 = r2.Z1
            int r11 = r11 - r1
            int r11 = java.lang.Math.abs(r11)
            if (r11 >= r5) goto L_0x0125
            com.instabug.library.annotation.e.e r11 = com.instabug.library.annotation.e.e.LINE
            r0.a = r11
            goto L_0x0129
        L_0x0125:
            com.instabug.library.annotation.e.e r11 = com.instabug.library.annotation.e.e.ARROW
            r0.a = r11
        L_0x0129:
            int r11 = r2.d
            r0.b = r11
            goto L_0x0179
        L_0x012e:
            com.instabug.library.annotation.e.e r11 = com.instabug.library.annotation.e.e.NONE
            r0.a = r11
            goto L_0x0179
        L_0x0133:
            com.instabug.library.annotation.e.e r11 = com.instabug.library.annotation.e.e.NONE
            r0.a = r11
            goto L_0x0179
        L_0x0138:
            float r2 = r11.q
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x015b
            float r11 = r1.y
            int r11 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r11 > 0) goto L_0x0156
            float r11 = r1.Y1
            int r11 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r11 <= 0) goto L_0x014b
            goto L_0x0156
        L_0x014b:
            r0.a = r3
            int r11 = r1.d
            r0.b = r11
            float r11 = r1.x
            r0.c = r11
            goto L_0x0179
        L_0x0156:
            com.instabug.library.annotation.e.e r11 = com.instabug.library.annotation.e.e.NONE
            r0.a = r11
            goto L_0x0179
        L_0x015b:
            float r1 = r11.y
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 > 0) goto L_0x0175
            float r1 = r11.Y1
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 <= 0) goto L_0x0168
            goto L_0x0175
        L_0x0168:
            com.instabug.library.annotation.e.e r1 = com.instabug.library.annotation.e.e.OVAL
            r0.a = r1
            int r1 = r11.d
            r0.b = r1
            float r11 = r11.x
            r0.c = r11
            goto L_0x0179
        L_0x0175:
            com.instabug.library.annotation.e.e r11 = com.instabug.library.annotation.e.e.NONE
            r0.a = r11
        L_0x0179:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.j.e.b.c.b.a(android.graphics.Path):i0.j.e.b.c.b$a");
    }
}
