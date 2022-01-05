package h0.i.b.d;

import android.content.res.ColorStateList;
import android.graphics.Shader;

/* compiled from: ComplexColorCompat */
public final class b {
    public final Shader a;
    public final ColorStateList b;
    public int c;

    public b(Shader shader, ColorStateList colorStateList, int i) {
        this.a = shader;
        this.b = colorStateList;
        this.c = i;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [android.graphics.Shader] */
    /* JADX WARNING: type inference failed for: r16v2, types: [android.graphics.RadialGradient] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r11v11, types: [android.graphics.LinearGradient] */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0209, code lost:
        r1 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x020c, code lost:
        r1 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x020e, code lost:
        r11 = new android.graphics.LinearGradient(r12, r26, r25, r24, r4, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x021f, code lost:
        r3 = new android.graphics.SweepGradient(r20, r22, r0.a, r0.b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x022d, code lost:
        r7 = r20;
        r8 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0234, code lost:
        if (r21 <= 0.0f) goto L_0x0263;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0236, code lost:
        r1 = r0.a;
        r0 = r0.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x023d, code lost:
        if (r6 == 1) goto L_0x0248;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0240, code lost:
        if (r6 == 2) goto L_0x0245;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0242, code lost:
        r2 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0245, code lost:
        r2 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0248, code lost:
        r2 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x024a, code lost:
        r16 = new android.graphics.RadialGradient(r7, r8, r21, r1, r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0262, code lost:
        return new h0.i.b.d.b(r3, (android.content.res.ColorStateList) null, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x026a, code lost:
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01dc, code lost:
        if (r8.size() <= 0) goto L_0x01e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01de, code lost:
        r0 = new h0.i.b.d.g((java.util.List<java.lang.Integer>) r8, (java.util.List<java.lang.Float>) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01e4, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01e5, code lost:
        if (r0 == null) goto L_0x01e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01e9, code lost:
        if (r18 == false) goto L_0x01f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01eb, code lost:
        r0 = new h0.i.b.d.g(r5, r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01f1, code lost:
        r0 = new h0.i.b.d.g(r5, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01f7, code lost:
        if (r9 == 1) goto L_0x022d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01fa, code lost:
        if (r9 == 2) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01fc, code lost:
        r4 = r0.a;
        r0 = r0.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0202, code lost:
        if (r6 == 1) goto L_0x020c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0204, code lost:
        if (r6 == 2) goto L_0x0209;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0206, code lost:
        r1 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static h0.i.b.d.b a(android.content.res.Resources r28, int r29, android.content.res.Resources.Theme r30) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        /*
            r0 = r28
            r1 = r30
            android.content.res.XmlResourceParser r2 = r28.getXml(r29)
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r2)
        L_0x000c:
            int r4 = r2.next()
            r5 = 1
            r6 = 2
            if (r4 == r6) goto L_0x0017
            if (r4 == r5) goto L_0x0017
            goto L_0x000c
        L_0x0017:
            if (r4 != r6) goto L_0x0289
            java.lang.String r4 = r2.getName()
            r4.hashCode()
            java.lang.String r7 = "gradient"
            boolean r8 = r4.equals(r7)
            r9 = 0
            if (r8 != 0) goto L_0x005d
            java.lang.String r5 = "selector"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x003f
            android.content.res.ColorStateList r0 = h0.i.b.d.a.b(r0, r2, r3, r1)
            h0.i.b.d.b r1 = new h0.i.b.d.b
            int r2 = r0.getDefaultColor()
            r1.<init>(r9, r0, r2)
            return r1
        L_0x003f:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r2.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": unsupported complex color tag "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x005d:
            java.lang.String r4 = r2.getName()
            boolean r7 = r4.equals(r7)
            if (r7 == 0) goto L_0x026b
            int[] r4 = androidx.core.R.styleable.GradientColor
            android.content.res.TypedArray r4 = g0.a.b.b.a.h0(r0, r1, r3, r4)
            int r7 = androidx.core.R.styleable.GradientColor_android_startX
            java.lang.String r8 = "startX"
            boolean r8 = g0.a.b.b.a.U(r2, r8)
            r10 = 0
            if (r8 != 0) goto L_0x007a
            r12 = r10
            goto L_0x007f
        L_0x007a:
            float r7 = r4.getFloat(r7, r10)
            r12 = r7
        L_0x007f:
            int r7 = androidx.core.R.styleable.GradientColor_android_startY
            java.lang.String r8 = "startY"
            boolean r8 = g0.a.b.b.a.U(r2, r8)
            if (r8 != 0) goto L_0x008b
            r13 = r10
            goto L_0x0090
        L_0x008b:
            float r7 = r4.getFloat(r7, r10)
            r13 = r7
        L_0x0090:
            int r7 = androidx.core.R.styleable.GradientColor_android_endX
            java.lang.String r8 = "endX"
            boolean r8 = g0.a.b.b.a.U(r2, r8)
            if (r8 != 0) goto L_0x009c
            r14 = r10
            goto L_0x00a1
        L_0x009c:
            float r7 = r4.getFloat(r7, r10)
            r14 = r7
        L_0x00a1:
            int r7 = androidx.core.R.styleable.GradientColor_android_endY
            java.lang.String r8 = "endY"
            boolean r8 = g0.a.b.b.a.U(r2, r8)
            if (r8 != 0) goto L_0x00ad
            r15 = r10
            goto L_0x00b2
        L_0x00ad:
            float r7 = r4.getFloat(r7, r10)
            r15 = r7
        L_0x00b2:
            int r7 = androidx.core.R.styleable.GradientColor_android_centerX
            java.lang.String r8 = "centerX"
            boolean r8 = g0.a.b.b.a.U(r2, r8)
            if (r8 != 0) goto L_0x00be
            r7 = r10
            goto L_0x00c2
        L_0x00be:
            float r7 = r4.getFloat(r7, r10)
        L_0x00c2:
            int r8 = androidx.core.R.styleable.GradientColor_android_centerY
            java.lang.String r11 = "centerY"
            boolean r11 = g0.a.b.b.a.U(r2, r11)
            if (r11 != 0) goto L_0x00ce
            r8 = r10
            goto L_0x00d2
        L_0x00ce:
            float r8 = r4.getFloat(r8, r10)
        L_0x00d2:
            int r11 = androidx.core.R.styleable.GradientColor_android_type
            java.lang.String r9 = "type"
            boolean r9 = g0.a.b.b.a.U(r2, r9)
            r6 = 0
            if (r9 != 0) goto L_0x00df
            r9 = r6
            goto L_0x00e3
        L_0x00df:
            int r9 = r4.getInt(r11, r6)
        L_0x00e3:
            int r11 = androidx.core.R.styleable.GradientColor_android_startColor
            java.lang.String r5 = "startColor"
            boolean r5 = g0.a.b.b.a.U(r2, r5)
            if (r5 != 0) goto L_0x00ef
            r5 = r6
            goto L_0x00f3
        L_0x00ef:
            int r5 = r4.getColor(r11, r6)
        L_0x00f3:
            java.lang.String r11 = "centerColor"
            boolean r18 = g0.a.b.b.a.U(r2, r11)
            int r10 = androidx.core.R.styleable.GradientColor_android_centerColor
            boolean r11 = g0.a.b.b.a.U(r2, r11)
            if (r11 != 0) goto L_0x0103
            r10 = r6
            goto L_0x0107
        L_0x0103:
            int r10 = r4.getColor(r10, r6)
        L_0x0107:
            int r11 = androidx.core.R.styleable.GradientColor_android_endColor
            java.lang.String r6 = "endColor"
            boolean r6 = g0.a.b.b.a.U(r2, r6)
            if (r6 != 0) goto L_0x0113
            r11 = 0
            goto L_0x011a
        L_0x0113:
            r6 = 0
            int r23 = r4.getColor(r11, r6)
            r11 = r23
        L_0x011a:
            int r6 = androidx.core.R.styleable.GradientColor_android_tileMode
            java.lang.String r0 = "tileMode"
            boolean r0 = g0.a.b.b.a.U(r2, r0)
            if (r0 != 0) goto L_0x0126
            r6 = 0
            goto L_0x012b
        L_0x0126:
            r0 = 0
            int r6 = r4.getInt(r6, r0)
        L_0x012b:
            int r0 = androidx.core.R.styleable.GradientColor_android_gradientRadius
            r20 = r7
            java.lang.String r7 = "gradientRadius"
            boolean r7 = g0.a.b.b.a.U(r2, r7)
            if (r7 != 0) goto L_0x0139
            r0 = 0
            goto L_0x013e
        L_0x0139:
            r7 = 0
            float r0 = r4.getFloat(r0, r7)
        L_0x013e:
            r4.recycle()
            int r4 = r2.getDepth()
            r7 = 1
            int r4 = r4 + r7
            java.util.ArrayList r7 = new java.util.ArrayList
            r21 = r0
            r0 = 20
            r7.<init>(r0)
            r22 = r8
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r0)
            r0 = r28
            r24 = r15
        L_0x015b:
            int r15 = r2.next()
            r25 = r14
            r14 = 1
            if (r15 == r14) goto L_0x01d6
            int r14 = r2.getDepth()
            r26 = r13
            if (r14 >= r4) goto L_0x016f
            r13 = 3
            if (r15 == r13) goto L_0x01d8
        L_0x016f:
            r13 = 2
            if (r15 == r13) goto L_0x0173
            goto L_0x01d1
        L_0x0173:
            if (r14 > r4) goto L_0x01cf
            java.lang.String r13 = r2.getName()
            java.lang.String r14 = "item"
            boolean r13 = r13.equals(r14)
            if (r13 != 0) goto L_0x0182
            goto L_0x01d1
        L_0x0182:
            int[] r13 = androidx.core.R.styleable.GradientColorItem
            android.content.res.TypedArray r0 = g0.a.b.b.a.h0(r0, r1, r3, r13)
            int r13 = androidx.core.R.styleable.GradientColorItem_android_color
            boolean r14 = r0.hasValue(r13)
            int r15 = androidx.core.R.styleable.GradientColorItem_android_offset
            boolean r27 = r0.hasValue(r15)
            if (r14 == 0) goto L_0x01b4
            if (r27 == 0) goto L_0x01b4
            r14 = 0
            int r13 = r0.getColor(r13, r14)
            r14 = 0
            float r15 = r0.getFloat(r15, r14)
            r0.recycle()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            r8.add(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r15)
            r7.add(r0)
            goto L_0x01cf
        L_0x01b4:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r2.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01cf:
            r0 = r28
        L_0x01d1:
            r14 = r25
            r13 = r26
            goto L_0x015b
        L_0x01d6:
            r26 = r13
        L_0x01d8:
            int r0 = r8.size()
            if (r0 <= 0) goto L_0x01e4
            h0.i.b.d.g r0 = new h0.i.b.d.g
            r0.<init>((java.util.List<java.lang.Integer>) r8, (java.util.List<java.lang.Float>) r7)
            goto L_0x01e5
        L_0x01e4:
            r0 = 0
        L_0x01e5:
            if (r0 == 0) goto L_0x01e9
        L_0x01e7:
            r1 = 1
            goto L_0x01f7
        L_0x01e9:
            if (r18 == 0) goto L_0x01f1
            h0.i.b.d.g r0 = new h0.i.b.d.g
            r0.<init>(r5, r10, r11)
            goto L_0x01e7
        L_0x01f1:
            h0.i.b.d.g r0 = new h0.i.b.d.g
            r0.<init>((int) r5, (int) r11)
            goto L_0x01e7
        L_0x01f7:
            if (r9 == r1) goto L_0x022d
            r2 = 2
            if (r9 == r2) goto L_0x021f
            android.graphics.LinearGradient r3 = new android.graphics.LinearGradient
            int[] r4 = r0.a
            float[] r0 = r0.b
            if (r6 == r1) goto L_0x020c
            if (r6 == r2) goto L_0x0209
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.CLAMP
            goto L_0x020e
        L_0x0209:
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.MIRROR
            goto L_0x020e
        L_0x020c:
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.REPEAT
        L_0x020e:
            r18 = r1
            r11 = r3
            r13 = r26
            r14 = r25
            r15 = r24
            r16 = r4
            r17 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x025b
        L_0x021f:
            android.graphics.SweepGradient r3 = new android.graphics.SweepGradient
            int[] r1 = r0.a
            float[] r0 = r0.b
            r7 = r20
            r8 = r22
            r3.<init>(r7, r8, r1, r0)
            goto L_0x025b
        L_0x022d:
            r7 = r20
            r8 = r22
            r1 = 0
            int r1 = (r21 > r1 ? 1 : (r21 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0263
            android.graphics.RadialGradient r3 = new android.graphics.RadialGradient
            int[] r1 = r0.a
            float[] r0 = r0.b
            r2 = 1
            if (r6 == r2) goto L_0x0248
            r2 = 2
            if (r6 == r2) goto L_0x0245
            android.graphics.Shader$TileMode r2 = android.graphics.Shader.TileMode.CLAMP
            goto L_0x024a
        L_0x0245:
            android.graphics.Shader$TileMode r2 = android.graphics.Shader.TileMode.MIRROR
            goto L_0x024a
        L_0x0248:
            android.graphics.Shader$TileMode r2 = android.graphics.Shader.TileMode.REPEAT
        L_0x024a:
            r22 = r2
            r16 = r3
            r17 = r7
            r18 = r8
            r19 = r21
            r20 = r1
            r21 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22)
        L_0x025b:
            h0.i.b.d.b r0 = new h0.i.b.d.b
            r1 = 0
            r2 = 0
            r0.<init>(r3, r1, r2)
            return r0
        L_0x0263:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "<gradient> tag requires 'gradientRadius' attribute with radial type"
            r0.<init>(r1)
            throw r0
        L_0x026b:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r2.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": invalid gradient color tag "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0289:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "No start tag found"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.i.b.d.b.a(android.content.res.Resources, int, android.content.res.Resources$Theme):h0.i.b.d.b");
    }

    public boolean b() {
        return this.a != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean c() {
        /*
            r1 = this;
            android.graphics.Shader r0 = r1.a
            if (r0 != 0) goto L_0x0010
            android.content.res.ColorStateList r0 = r1.b
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.i.b.d.b.c():boolean");
    }

    public boolean d(int[] iArr) {
        if (c()) {
            ColorStateList colorStateList = this.b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.c) {
                this.c = colorForState;
                return true;
            }
        }
        return false;
    }
}
