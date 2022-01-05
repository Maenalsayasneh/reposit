package h0.i.b.d;

import android.util.TypedValue;

/* compiled from: ColorStateListInflaterCompat */
public final class a {
    public static final ThreadLocal<TypedValue> a = new ThreadLocal<>();

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0011  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList a(android.content.res.Resources r4, org.xmlpull.v1.XmlPullParser r5, android.content.res.Resources.Theme r6) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)
        L_0x0004:
            int r1 = r5.next()
            r2 = 2
            if (r1 == r2) goto L_0x000f
            r3 = 1
            if (r1 == r3) goto L_0x000f
            goto L_0x0004
        L_0x000f:
            if (r1 != r2) goto L_0x0016
            android.content.res.ColorStateList r4 = b(r4, r5, r0, r6)
            return r4
        L_0x0016:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.i.b.d.a.a(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    /* JADX WARNING: type inference failed for: r9v16, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0110  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList b(android.content.res.Resources r17, org.xmlpull.v1.XmlPullParser r18, android.util.AttributeSet r19, android.content.res.Resources.Theme r20) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r0 = r17
            r1 = r19
            r2 = r20
            java.lang.String r3 = r18.getName()
            java.lang.String r4 = "selector"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x013f
            int r3 = r18.getDepth()
            r4 = 1
            int r3 = r3 + r4
            r5 = 20
            int[][] r6 = new int[r5][]
            int[] r5 = new int[r5]
            r7 = 0
            r8 = r7
        L_0x0020:
            int r9 = r18.next()
            if (r9 == r4) goto L_0x012f
            int r10 = r18.getDepth()
            if (r10 >= r3) goto L_0x002f
            r11 = 3
            if (r9 == r11) goto L_0x012f
        L_0x002f:
            r11 = 2
            if (r9 != r11) goto L_0x012c
            if (r10 > r3) goto L_0x012c
            java.lang.String r9 = r18.getName()
            java.lang.String r10 = "item"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x0042
            goto L_0x012c
        L_0x0042:
            int[] r9 = androidx.core.R.styleable.ColorStateListItem
            if (r2 != 0) goto L_0x004b
            android.content.res.TypedArray r9 = r0.obtainAttributes(r1, r9)
            goto L_0x004f
        L_0x004b:
            android.content.res.TypedArray r9 = r2.obtainStyledAttributes(r1, r9, r7, r7)
        L_0x004f:
            int r10 = androidx.core.R.styleable.ColorStateListItem_android_color
            r11 = -1
            int r12 = r9.getResourceId(r10, r11)
            r13 = -65281(0xffffffffffff00ff, float:NaN)
            if (r12 == r11) goto L_0x0093
            java.lang.ThreadLocal<android.util.TypedValue> r11 = a
            java.lang.Object r14 = r11.get()
            android.util.TypedValue r14 = (android.util.TypedValue) r14
            if (r14 != 0) goto L_0x006d
            android.util.TypedValue r14 = new android.util.TypedValue
            r14.<init>()
            r11.set(r14)
        L_0x006d:
            r0.getValue(r12, r14, r4)
            int r11 = r14.type
            r14 = 28
            if (r11 < r14) goto L_0x007c
            r14 = 31
            if (r11 > r14) goto L_0x007c
            r11 = r4
            goto L_0x007d
        L_0x007c:
            r11 = r7
        L_0x007d:
            if (r11 != 0) goto L_0x0093
            android.content.res.XmlResourceParser r10 = r0.getXml(r12)     // Catch:{ Exception -> 0x008c }
            android.content.res.ColorStateList r10 = a(r0, r10, r2)     // Catch:{ Exception -> 0x008c }
            int r10 = r10.getDefaultColor()     // Catch:{ Exception -> 0x008c }
            goto L_0x0097
        L_0x008c:
            int r10 = androidx.core.R.styleable.ColorStateListItem_android_color
            int r10 = r9.getColor(r10, r13)
            goto L_0x0097
        L_0x0093:
            int r10 = r9.getColor(r10, r13)
        L_0x0097:
            r11 = 1065353216(0x3f800000, float:1.0)
            int r12 = androidx.core.R.styleable.ColorStateListItem_android_alpha
            boolean r13 = r9.hasValue(r12)
            if (r13 == 0) goto L_0x00a6
            float r11 = r9.getFloat(r12, r11)
            goto L_0x00b2
        L_0x00a6:
            int r12 = androidx.core.R.styleable.ColorStateListItem_alpha
            boolean r13 = r9.hasValue(r12)
            if (r13 == 0) goto L_0x00b2
            float r11 = r9.getFloat(r12, r11)
        L_0x00b2:
            r9.recycle()
            int r9 = r19.getAttributeCount()
            int[] r12 = new int[r9]
            r13 = r7
            r14 = r13
        L_0x00bd:
            if (r13 >= r9) goto L_0x00e2
            int r15 = r1.getAttributeNameResource(r13)
            r4 = 16843173(0x10101a5, float:2.3694738E-38)
            if (r15 == r4) goto L_0x00de
            r4 = 16843551(0x101031f, float:2.3695797E-38)
            if (r15 == r4) goto L_0x00de
            int r4 = androidx.core.R.attr.alpha
            if (r15 == r4) goto L_0x00de
            int r4 = r14 + 1
            boolean r16 = r1.getAttributeBooleanValue(r13, r7)
            if (r16 == 0) goto L_0x00da
            goto L_0x00db
        L_0x00da:
            int r15 = -r15
        L_0x00db:
            r12[r14] = r15
            r14 = r4
        L_0x00de:
            int r13 = r13 + 1
            r4 = 1
            goto L_0x00bd
        L_0x00e2:
            int[] r4 = android.util.StateSet.trimStateSet(r12, r14)
            int r9 = android.graphics.Color.alpha(r10)
            float r9 = (float) r9
            float r9 = r9 * r11
            int r9 = java.lang.Math.round(r9)
            r11 = 16777215(0xffffff, float:2.3509886E-38)
            r10 = r10 & r11
            int r9 = r9 << 24
            r9 = r9 | r10
            int r10 = r8 + 1
            int r11 = r5.length
            r12 = 8
            r13 = 4
            if (r10 <= r11) goto L_0x010b
            if (r8 > r13) goto L_0x0103
            r11 = r12
            goto L_0x0105
        L_0x0103:
            int r11 = r8 * 2
        L_0x0105:
            int[] r11 = new int[r11]
            java.lang.System.arraycopy(r5, r7, r11, r7, r8)
            r5 = r11
        L_0x010b:
            r5[r8] = r9
            int r9 = r6.length
            if (r10 <= r9) goto L_0x0127
            java.lang.Class r9 = r6.getClass()
            java.lang.Class r9 = r9.getComponentType()
            if (r8 > r13) goto L_0x011b
            goto L_0x011d
        L_0x011b:
            int r12 = r8 * 2
        L_0x011d:
            java.lang.Object r9 = java.lang.reflect.Array.newInstance(r9, r12)
            java.lang.Object[] r9 = (java.lang.Object[]) r9
            java.lang.System.arraycopy(r6, r7, r9, r7, r8)
            r6 = r9
        L_0x0127:
            r6[r8] = r4
            int[][] r6 = (int[][]) r6
            r8 = r10
        L_0x012c:
            r4 = 1
            goto L_0x0020
        L_0x012f:
            int[] r0 = new int[r8]
            int[][] r1 = new int[r8][]
            java.lang.System.arraycopy(r5, r7, r0, r7, r8)
            java.lang.System.arraycopy(r6, r7, r1, r7, r8)
            android.content.res.ColorStateList r2 = new android.content.res.ColorStateList
            r2.<init>(r1, r0)
            return r2
        L_0x013f:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r18.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": invalid color state list tag "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.i.b.d.a.b(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }
}
