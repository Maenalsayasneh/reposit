package com.clubhouse.android.ui.events;

import i0.b.a.o;
import i0.e.b.g3.o.l0;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: HalfEventFragment.kt */
public final class HalfEventFragment$buildEventsModels$1 extends Lambda implements l<l0, i> {
    public final /* synthetic */ o c;
    public final /* synthetic */ HalfEventFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfEventFragment$buildEventsModels$1(o oVar, HalfEventFragment halfEventFragment) {
        super(1);
        this.c = oVar;
        this.d = halfEventFragment;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: kotlin.collections.EmptyList} */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r12) {
        /*
            r11 = this;
            i0.e.b.g3.o.l0 r12 = (i0.e.b.g3.o.l0) r12
            java.lang.String r0 = "state"
            m0.n.b.i.e(r12, r0)
            com.clubhouse.android.data.models.local.EventInClub r0 = r12.c
            r1 = 0
            if (r0 != 0) goto L_0x000e
            goto L_0x00f7
        L_0x000e:
            i0.b.a.o r2 = r11.c
            com.clubhouse.android.ui.events.HalfEventFragment r3 = r11.d
            i0.e.b.g3.o.x0.z r4 = new i0.e.b.g3.o.x0.z
            r4.<init>()
            r5 = 1
            java.lang.Number[] r6 = new java.lang.Number[r5]
            int r7 = r0.Y1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8 = 0
            r6[r8] = r7
            r4.U(r6)
            r4.R(r0)
            boolean r6 = r12.d
            r4.L(r6)
            r4.S(r5)
            com.clubhouse.android.data.models.local.club.ClubWithAdmin r6 = r0.c
            if (r6 != 0) goto L_0x0036
            goto L_0x0046
        L_0x0036:
            java.lang.String r6 = r6.y
            if (r6 != 0) goto L_0x003b
            goto L_0x0046
        L_0x003b:
            r4.X(r6)
            i0.e.b.g3.o.r r6 = new i0.e.b.g3.o.r
            r6.<init>(r3, r0)
            r4.O(r6)
        L_0x0046:
            com.clubhouse.android.ui.events.HalfEventFragment$b r6 = com.clubhouse.android.ui.events.HalfEventFragment.p2
            com.clubhouse.android.ui.events.HalfEventViewModel r6 = r3.V0()
            boolean r6 = r6.q(r0)
            r4.Q(r6)
            i0.e.b.g3.o.p r6 = new i0.e.b.g3.o.p
            r6.<init>(r3, r12, r0)
            r4.M(r6)
            i0.e.b.g3.o.q r12 = new i0.e.b.g3.o.q
            r12.<init>(r3, r0)
            r4.V(r12)
            i0.e.b.g3.o.t r12 = new i0.e.b.g3.o.t
            r12.<init>(r3, r0)
            r4.P(r12)
            r2.add(r4)
            i0.b.a.g r12 = new i0.b.a.g
            r12.<init>()
            int r4 = r0.Y1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r6 = "hosts"
            java.lang.String r4 = m0.n.b.i.k(r6, r4)
            r12.E(r4)
            java.util.List<com.clubhouse.android.data.models.local.user.UserInList> r4 = r0.b2
            if (r4 != 0) goto L_0x0087
            goto L_0x00c5
        L_0x0087:
            java.util.ArrayList r1 = new java.util.ArrayList
            r6 = 10
            int r6 = i0.j.f.p.h.K(r4, r6)
            r1.<init>(r6)
            java.util.Iterator r4 = r4.iterator()
        L_0x0096:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x00c5
            java.lang.Object r6 = r4.next()
            com.clubhouse.android.data.models.local.user.UserInList r6 = (com.clubhouse.android.data.models.local.user.UserInList) r6
            i0.e.b.g3.o.x0.b0 r7 = new i0.e.b.g3.o.x0.b0
            r7.<init>()
            java.lang.Number[] r9 = new java.lang.Number[r5]
            java.lang.Integer r10 = r6.getId()
            r9[r8] = r10
            r7.t(r9)
            r7.w()
            r7.j = r6
            i0.e.b.g3.o.s r9 = new i0.e.b.g3.o.s
            r9.<init>(r3, r6)
            r7.w()
            r7.k = r9
            r1.add(r7)
            goto L_0x0096
        L_0x00c5:
            if (r1 != 0) goto L_0x00c9
            kotlin.collections.EmptyList r1 = kotlin.collections.EmptyList.c
        L_0x00c9:
            r12.F(r1)
            android.content.Context r1 = r3.requireContext()
            java.lang.String r3 = "requireContext()"
            m0.n.b.i.d(r1, r3)
            h0.b0.v.h(r12, r1)
            m0.i r1 = m0.i.a
            r2.add(r12)
            i0.e.b.g3.o.x0.q r12 = new i0.e.b.g3.o.x0.q
            r12.<init>()
            int r3 = r0.Y1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "desc"
            java.lang.String r3 = m0.n.b.i.k(r4, r3)
            r12.P(r3)
            r12.O(r0)
            r2.add(r12)
        L_0x00f7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.ui.events.HalfEventFragment$buildEventsModels$1.invoke(java.lang.Object):java.lang.Object");
    }
}
