package com.clubhouse.android.ui.hallway.feed;

import i0.e.b.g3.p.c0.v;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;

/* compiled from: FeedViewModel.kt */
public final class FeedViewModel$updateFeedItemsCacheOnRSVP$1 extends Lambda implements l<v, v> {
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FeedViewModel$updateFeedItemsCacheOnRSVP$1(int i, boolean z) {
        super(1);
        this.c = i;
        this.d = z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: kotlin.collections.EmptyList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r32) {
        /*
            r31 = this;
            r0 = r31
            r1 = r32
            i0.e.b.g3.p.c0.v r1 = (i0.e.b.g3.p.c0.v) r1
            java.lang.String r2 = "$this$setState"
            m0.n.b.i.e(r1, r2)
            i0.b.b.b<java.util.List<i0.e.b.b3.a.a.d.a.e>> r2 = r1.a
            java.lang.Object r2 = r2.a()
            java.util.List r2 = (java.util.List) r2
            r3 = 0
            if (r2 != 0) goto L_0x0018
            goto L_0x00a3
        L_0x0018:
            int r4 = r0.c
            boolean r5 = r0.d
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r7 = i0.j.f.p.h.K(r2, r7)
            r6.<init>(r7)
            java.util.Iterator r2 = r2.iterator()
        L_0x002b:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x00a2
            java.lang.Object r7 = r2.next()
            i0.e.b.b3.a.a.d.a.e r7 = (i0.e.b.b3.a.a.d.a.e) r7
            boolean r8 = r7 instanceof i0.e.b.b3.a.a.d.a.c
            if (r8 == 0) goto L_0x009e
            i0.e.b.b3.a.a.d.a.c r7 = (i0.e.b.b3.a.a.d.a.c) r7
            java.util.List<com.clubhouse.android.data.models.local.EventInClub> r8 = r7.b
            java.util.List r8 = m0.j.g.A0(r8)
            r9 = r8
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            java.util.Iterator r10 = r9.iterator()
        L_0x004a:
            boolean r11 = r10.hasNext()
            r12 = 1
            if (r11 == 0) goto L_0x0062
            java.lang.Object r11 = r10.next()
            r13 = r11
            com.clubhouse.android.data.models.local.EventInClub r13 = (com.clubhouse.android.data.models.local.EventInClub) r13
            int r13 = r13.Y1
            if (r13 != r4) goto L_0x005e
            r13 = r12
            goto L_0x005f
        L_0x005e:
            r13 = 0
        L_0x005f:
            if (r13 == 0) goto L_0x004a
            goto L_0x0063
        L_0x0062:
            r11 = r3
        L_0x0063:
            r13 = r11
            com.clubhouse.android.data.models.local.EventInClub r13 = (com.clubhouse.android.data.models.local.EventInClub) r13
            if (r13 != 0) goto L_0x0069
            goto L_0x009a
        L_0x0069:
            int r10 = r9.indexOf(r13)
            r14 = 0
            r15 = 0
            r16 = 0
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r5)
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 65527(0xfff7, float:9.1823E-41)
            com.clubhouse.android.data.models.local.EventInClub r11 = com.clubhouse.android.data.models.local.EventInClub.d(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            java.lang.Object r9 = r9.set(r10, r11)
            com.clubhouse.android.data.models.local.EventInClub r9 = (com.clubhouse.android.data.models.local.EventInClub) r9
        L_0x009a:
            i0.e.b.b3.a.a.d.a.c r7 = i0.e.b.b3.a.a.d.a.c.a(r7, r3, r8, r12)
        L_0x009e:
            r6.add(r7)
            goto L_0x002b
        L_0x00a2:
            r3 = r6
        L_0x00a3:
            if (r3 != 0) goto L_0x00a7
            kotlin.collections.EmptyList r3 = kotlin.collections.EmptyList.c
        L_0x00a7:
            i0.b.b.f0 r2 = new i0.b.b.f0
            r2.<init>(r3)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 4094(0xffe, float:5.737E-42)
            r16 = 0
            i0.e.b.g3.p.c0.v r1 = i0.e.b.g3.p.c0.v.copy$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r14, r15, r16)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.ui.hallway.feed.FeedViewModel$updateFeedItemsCacheOnRSVP$1.invoke(java.lang.Object):java.lang.Object");
    }
}
