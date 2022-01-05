package com.clubhouse.android.ui.clubs.viewholder;

import com.clubhouse.android.data.models.local.EventInClub;
import i0.b.a.o;
import i0.e.b.g3.l.c3.i;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ClubEvent.kt */
public final class ClubEvent$bindEvents$1$1 extends Lambda implements l<o, i> {
    public final /* synthetic */ EventInClub c;
    public final /* synthetic */ i0.e.b.g3.l.c3.i d;
    public final /* synthetic */ i.a q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubEvent$bindEvents$1$1(EventInClub eventInClub, i0.e.b.g3.l.c3.i iVar, i.a aVar) {
        super(1);
        this.c = eventInClub;
        this.d = iVar;
        this.q = aVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: kotlin.collections.EmptyList} */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r13) {
        /*
            r12 = this;
            i0.b.a.o r13 = (i0.b.a.o) r13
            java.lang.String r0 = "$this$safeWithModels"
            m0.n.b.i.e(r13, r0)
            com.clubhouse.android.data.models.local.EventInClub r0 = r12.c
            i0.e.b.g3.l.c3.i r1 = r12.d
            i0.e.b.g3.o.x0.z r2 = new i0.e.b.g3.o.x0.z
            r2.<init>()
            int r3 = r0.Y1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "info"
            java.lang.String r3 = m0.n.b.i.k(r4, r3)
            r2.T(r3)
            r2.R(r0)
            r0 = 1
            r2.S(r0)
            r3 = 0
            r2.W(r3)
            android.view.View$OnClickListener r4 = r1.k
            r2.V(r4)
            android.view.View$OnClickListener r1 = r1.l
            r2.N(r1)
            r13.add(r2)
            com.clubhouse.android.data.models.local.EventInClub r1 = r12.c
            i0.e.b.g3.l.c3.i$a r2 = r12.q
            i0.e.b.g3.l.c3.i r4 = r12.d
            i0.b.a.g r5 = new i0.b.a.g
            r5.<init>()
            int r6 = r1.Y1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r7 = "hosts"
            java.lang.String r6 = m0.n.b.i.k(r7, r6)
            r5.E(r6)
            java.util.List<com.clubhouse.android.data.models.local.user.UserInList> r1 = r1.b2
            r6 = 0
            if (r1 != 0) goto L_0x0058
            r7 = r6
            goto L_0x0093
        L_0x0058:
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 10
            int r8 = i0.j.f.p.h.K(r1, r8)
            r7.<init>(r8)
            java.util.Iterator r1 = r1.iterator()
        L_0x0067:
            boolean r8 = r1.hasNext()
            if (r8 == 0) goto L_0x0093
            java.lang.Object r8 = r1.next()
            com.clubhouse.android.data.models.local.user.UserInList r8 = (com.clubhouse.android.data.models.local.user.UserInList) r8
            i0.e.b.g3.o.x0.b0 r9 = new i0.e.b.g3.o.x0.b0
            r9.<init>()
            java.lang.Number[] r10 = new java.lang.Number[r0]
            java.lang.Integer r11 = r8.getId()
            r10[r3] = r11
            r9.t(r10)
            r9.w()
            r9.j = r8
            android.view.View$OnClickListener r8 = r4.l
            r9.w()
            r9.k = r8
            r7.add(r9)
            goto L_0x0067
        L_0x0093:
            if (r7 != 0) goto L_0x0097
            kotlin.collections.EmptyList r7 = kotlin.collections.EmptyList.c
        L_0x0097:
            r5.F(r7)
            com.clubhouse.android.databinding.ClubEventBinding r1 = r2.b
            if (r1 == 0) goto L_0x00db
            com.airbnb.epoxy.EpoxyRecyclerView r1 = r1.a
            android.content.Context r1 = r1.getContext()
            java.lang.String r2 = "binding.clubEvent.context"
            m0.n.b.i.d(r1, r2)
            h0.b0.v.h(r5, r1)
            r13.add(r5)
            com.clubhouse.android.data.models.local.EventInClub r1 = r12.c
            i0.e.b.g3.l.c3.i r2 = r12.d
            i0.e.b.g3.o.x0.q r3 = new i0.e.b.g3.o.x0.q
            r3.<init>()
            int r4 = r1.Y1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "desc"
            java.lang.String r4 = m0.n.b.i.k(r5, r4)
            r3.P(r4)
            r3.O(r1)
            r3.L(r0)
            r3.N(r0)
            android.view.View$OnClickListener r0 = r2.l
            r3.M(r0)
            r13.add(r3)
            m0.i r13 = m0.i.a
            return r13
        L_0x00db:
            java.lang.String r13 = "binding"
            m0.n.b.i.m(r13)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.ui.clubs.viewholder.ClubEvent$bindEvents$1$1.invoke(java.lang.Object):java.lang.Object");
    }
}
