package i0.l.a.i.a.i;

/* compiled from: BeansWriter */
public class b implements n<Object> {
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d0 A[Catch:{ Exception -> 0x00ff }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d1 A[Catch:{ Exception -> 0x00ff }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <E> void a(E r20, java.lang.Appendable r21, i0.l.a.i.a.e r22) throws java.io.IOException {
        /*
            r19 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            java.lang.Class r3 = r20.getClass()     // Catch:{ Exception -> 0x00ff }
            java.util.Objects.requireNonNull(r22)     // Catch:{ Exception -> 0x00ff }
            r4 = 123(0x7b, float:1.72E-43)
            r1.append(r4)     // Catch:{ Exception -> 0x00ff }
            r4 = 0
            r5 = r4
        L_0x0014:
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            if (r3 == r6) goto L_0x00f9
            java.lang.reflect.Field[] r6 = r3.getDeclaredFields()     // Catch:{ Exception -> 0x00ff }
            int r7 = r6.length     // Catch:{ Exception -> 0x00ff }
            r8 = r4
        L_0x001e:
            if (r8 >= r7) goto L_0x00f3
            r9 = r6[r8]     // Catch:{ Exception -> 0x00ff }
            int r10 = r9.getModifiers()     // Catch:{ Exception -> 0x00ff }
            r11 = r10 & 152(0x98, float:2.13E-43)
            if (r11 <= 0) goto L_0x002c
            goto L_0x00ef
        L_0x002c:
            r10 = r10 & 1
            r11 = 1
            if (r10 <= 0) goto L_0x0039
            java.lang.Object r10 = r9.get(r0)     // Catch:{ Exception -> 0x00ff }
            r16 = r11
            goto L_0x00d7
        L_0x0039:
            java.lang.String r10 = r9.getName()     // Catch:{ Exception -> 0x00ff }
            int r12 = r10.length()     // Catch:{ Exception -> 0x00ff }
            int r13 = r12 + 3
            char[] r13 = new char[r13]     // Catch:{ Exception -> 0x00ff }
            r14 = 103(0x67, float:1.44E-43)
            r13[r4] = r14     // Catch:{ Exception -> 0x00ff }
            r14 = 101(0x65, float:1.42E-43)
            r13[r11] = r14     // Catch:{ Exception -> 0x00ff }
            r14 = 116(0x74, float:1.63E-43)
            r15 = 2
            r13[r15] = r14     // Catch:{ Exception -> 0x00ff }
            char r14 = r10.charAt(r4)     // Catch:{ Exception -> 0x00ff }
            r15 = 122(0x7a, float:1.71E-43)
            r11 = 97
            if (r14 < r11) goto L_0x0061
            if (r14 > r15) goto L_0x0061
            int r14 = r14 + -32
            char r14 = (char) r14     // Catch:{ Exception -> 0x00ff }
        L_0x0061:
            r17 = 3
            r13[r17] = r14     // Catch:{ Exception -> 0x00ff }
            r14 = 1
        L_0x0066:
            if (r14 >= r12) goto L_0x0073
            int r17 = r14 + 3
            char r18 = r10.charAt(r14)     // Catch:{ Exception -> 0x00ff }
            r13[r17] = r18     // Catch:{ Exception -> 0x00ff }
            int r14 = r14 + 1
            goto L_0x0066
        L_0x0073:
            java.lang.String r10 = new java.lang.String     // Catch:{ Exception -> 0x00ff }
            r10.<init>(r13)     // Catch:{ Exception -> 0x00ff }
            r12 = 0
            java.lang.Class[] r13 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x007f }
            java.lang.reflect.Method r12 = r3.getDeclaredMethod(r10, r13)     // Catch:{ Exception -> 0x007f }
        L_0x007f:
            if (r12 != 0) goto L_0x00cc
            java.lang.Class r10 = r9.getType()     // Catch:{ Exception -> 0x00ff }
            java.lang.Class r13 = java.lang.Boolean.TYPE     // Catch:{ Exception -> 0x00ff }
            if (r10 == r13) goto L_0x008d
            java.lang.Class<java.lang.Boolean> r13 = java.lang.Boolean.class
            if (r10 != r13) goto L_0x00cc
        L_0x008d:
            java.lang.String r10 = r9.getName()     // Catch:{ Exception -> 0x00ff }
            int r12 = r10.length()     // Catch:{ Exception -> 0x00ff }
            int r13 = r12 + 2
            char[] r13 = new char[r13]     // Catch:{ Exception -> 0x00ff }
            r14 = 105(0x69, float:1.47E-43)
            r13[r4] = r14     // Catch:{ Exception -> 0x00ff }
            r14 = 115(0x73, float:1.61E-43)
            r16 = 1
            r13[r16] = r14     // Catch:{ Exception -> 0x00ff }
            char r14 = r10.charAt(r4)     // Catch:{ Exception -> 0x00ff }
            if (r14 < r11) goto L_0x00ae
            if (r14 > r15) goto L_0x00ae
            int r14 = r14 + -32
            char r14 = (char) r14     // Catch:{ Exception -> 0x00ff }
        L_0x00ae:
            r11 = 2
            r13[r11] = r14     // Catch:{ Exception -> 0x00ff }
            r11 = r16
        L_0x00b3:
            if (r11 >= r12) goto L_0x00c0
            int r14 = r11 + 2
            char r15 = r10.charAt(r11)     // Catch:{ Exception -> 0x00ff }
            r13[r14] = r15     // Catch:{ Exception -> 0x00ff }
            int r11 = r11 + 1
            goto L_0x00b3
        L_0x00c0:
            java.lang.String r10 = new java.lang.String     // Catch:{ Exception -> 0x00ff }
            r10.<init>(r13)     // Catch:{ Exception -> 0x00ff }
            java.lang.Class[] r11 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x00ff }
            java.lang.reflect.Method r12 = r3.getDeclaredMethod(r10, r11)     // Catch:{ Exception -> 0x00ff }
            goto L_0x00ce
        L_0x00cc:
            r16 = 1
        L_0x00ce:
            if (r12 != 0) goto L_0x00d1
            goto L_0x00ef
        L_0x00d1:
            java.lang.Object[] r10 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x00ff }
            java.lang.Object r10 = r12.invoke(r0, r10)     // Catch:{ Exception -> 0x00ff }
        L_0x00d7:
            if (r10 != 0) goto L_0x00de
            boolean r11 = r2.e     // Catch:{ Exception -> 0x00ff }
            if (r11 == 0) goto L_0x00de
            goto L_0x00ef
        L_0x00de:
            if (r5 == 0) goto L_0x00e6
            r11 = 44
            r1.append(r11)     // Catch:{ Exception -> 0x00ff }
            goto L_0x00e8
        L_0x00e6:
            r5 = r16
        L_0x00e8:
            java.lang.String r9 = r9.getName()     // Catch:{ Exception -> 0x00ff }
            i0.l.a.i.a.i.l.b(r9, r10, r1, r2)     // Catch:{ Exception -> 0x00ff }
        L_0x00ef:
            int r8 = r8 + 1
            goto L_0x001e
        L_0x00f3:
            java.lang.Class r3 = r3.getSuperclass()     // Catch:{ Exception -> 0x00ff }
            goto L_0x0014
        L_0x00f9:
            r0 = 125(0x7d, float:1.75E-43)
            r1.append(r0)     // Catch:{ Exception -> 0x00ff }
            return
        L_0x00ff:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.l.a.i.a.i.b.a(java.lang.Object, java.lang.Appendable, i0.l.a.i.a.e):void");
    }
}
