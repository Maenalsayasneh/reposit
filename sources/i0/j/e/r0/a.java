package i0.j.e.r0;

/* compiled from: SessionsBatcherImpl */
public final class a {
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0090, code lost:
        r4 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.instabug.library.model.session.SessionsBatchDTO> a(java.util.List<com.instabug.library.model.session.CoreSession> r17, int r18) {
        /*
            r16 = this;
            java.util.List r0 = com.instabug.library.util.ListUtils.split(r17, r18)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x000d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0135
            java.lang.Object r2 = r0.next()
            java.util.List r2 = (java.util.List) r2
            int r3 = r2.size()
            if (r3 == 0) goto L_0x0124
            r4 = 0
            r5 = 1
            if (r3 == r5) goto L_0x0114
            java.lang.Object r3 = r2.get(r4)
            com.instabug.library.model.session.CoreSession r3 = (com.instabug.library.model.session.CoreSession) r3
            int r6 = r2.size()
            java.util.List r6 = r2.subList(r5, r6)
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.lang.Class r8 = r3.getClass()
            java.lang.reflect.Field[] r8 = r8.getDeclaredFields()
            int r9 = r8.length
            r10 = r4
        L_0x0040:
            if (r10 >= r9) goto L_0x00ab
            r11 = r8[r10]
            r11.setAccessible(r5)
            java.lang.Class<i0.j.e.l0.a.b> r12 = i0.j.e.l0.a.b.class
            java.lang.annotation.Annotation r12 = r11.getAnnotation(r12)
            if (r12 == 0) goto L_0x0051
            r12 = r5
            goto L_0x0052
        L_0x0051:
            r12 = r4
        L_0x0052:
            if (r12 == 0) goto L_0x00a6
            java.util.Iterator r12 = r6.iterator()
        L_0x0058:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0092
            java.lang.Object r13 = r12.next()
            com.instabug.library.model.session.CoreSession r13 = (com.instabug.library.model.session.CoreSession) r13
            java.lang.Class r14 = r13.getClass()
            java.lang.String r15 = r11.getName()
            com.instabug.library.internal.utils.stability.handler.exception.ExceptionHandler r4 = i0.j.e.c0.a
            i0.j.e.b0 r5 = new i0.j.e.b0
            r5.<init>(r14, r15)
            java.lang.Object r4 = r4.executeAndGet(r5)
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            if (r4 != 0) goto L_0x007c
            goto L_0x0090
        L_0x007c:
            java.lang.Object r5 = i0.j.e.c0.a(r11, r3)
            java.lang.Object r4 = i0.j.e.c0.a(r4, r13)
            if (r5 == 0) goto L_0x0090
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x008d
            goto L_0x0090
        L_0x008d:
            r4 = 0
            r5 = 1
            goto L_0x0058
        L_0x0090:
            r4 = 0
            goto L_0x0093
        L_0x0092:
            r4 = 1
        L_0x0093:
            if (r4 == 0) goto L_0x00a6
            boolean r4 = r3.isUsersPageEnabled()
            java.lang.String r4 = i0.j.c.l.a.p(r11, r4)
            java.lang.Object r5 = i0.j.e.c0.a(r11, r3)
            if (r5 == 0) goto L_0x00a6
            r7.put(r4, r5)
        L_0x00a6:
            int r10 = r10 + 1
            r4 = 0
            r5 = 1
            goto L_0x0040
        L_0x00ab:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x00b4:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x010f
            java.lang.Object r4 = r2.next()
            com.instabug.library.model.session.CoreSession r4 = (com.instabug.library.model.session.CoreSession) r4
            java.util.Set r5 = r7.keySet()
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.lang.Class r8 = r4.getClass()
            java.lang.reflect.Field[] r8 = r8.getDeclaredFields()
            int r9 = r8.length
            r10 = 0
        L_0x00d3:
            if (r10 >= r9) goto L_0x0102
            r11 = r8[r10]
            r12 = 1
            r11.setAccessible(r12)
            java.lang.Class<i0.j.e.l0.a.b> r13 = i0.j.e.l0.a.b.class
            java.lang.annotation.Annotation r13 = r11.getAnnotation(r13)
            if (r13 == 0) goto L_0x00e5
            r13 = r12
            goto L_0x00e6
        L_0x00e5:
            r13 = 0
        L_0x00e6:
            if (r13 == 0) goto L_0x00ff
            boolean r13 = r4.isUsersPageEnabled()
            java.lang.String r13 = i0.j.c.l.a.p(r11, r13)
            boolean r14 = r5.contains(r13)
            if (r14 != 0) goto L_0x00ff
            java.lang.Object r11 = i0.j.e.c0.a(r11, r4)
            if (r11 == 0) goto L_0x00ff
            r6.put(r13, r11)
        L_0x00ff:
            int r10 = r10 + 1
            goto L_0x00d3
        L_0x0102:
            r12 = 1
            java.lang.String r4 = r4.getId()
            com.instabug.library.model.session.SessionRemoteEntity r4 = com.instabug.library.model.session.SessionMapper.toRemoteEntity(r4, r6)
            r3.add(r4)
            goto L_0x00b4
        L_0x010f:
            com.instabug.library.model.session.SessionsBatchDTO r2 = com.instabug.library.model.session.SessionMapper.toDTO(r7, r3)
            goto L_0x0130
        L_0x0114:
            r3 = r4
            java.lang.Object r2 = r2.get(r3)
            com.instabug.library.model.session.CoreSession r2 = (com.instabug.library.model.session.CoreSession) r2
            com.instabug.library.model.session.SessionRemoteEntity r2 = com.instabug.library.model.session.SessionMapper.toRemoteEntity(r2)
            com.instabug.library.model.session.SessionsBatchDTO r2 = com.instabug.library.model.session.SessionMapper.toDTO(r2)
            goto L_0x0130
        L_0x0124:
            java.util.Map r2 = java.util.Collections.emptyMap()
            java.util.List r3 = java.util.Collections.emptyList()
            com.instabug.library.model.session.SessionsBatchDTO r2 = com.instabug.library.model.session.SessionMapper.toDTO(r2, r3)
        L_0x0130:
            r1.add(r2)
            goto L_0x000d
        L_0x0135:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.j.e.r0.a.a(java.util.List, int):java.util.List");
    }
}
