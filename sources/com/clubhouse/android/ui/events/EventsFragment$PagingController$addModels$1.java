package com.clubhouse.android.ui.events;

import com.clubhouse.android.ui.events.EventsFragment;
import i0.b.a.t;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: EventsFragment.kt */
public final class EventsFragment$PagingController$addModels$1 extends Lambda implements l<EventsViewState, i> {
    public final /* synthetic */ List<t<?>> c;
    public final /* synthetic */ EventsFragment.PagingController d;
    public final /* synthetic */ EventsFragment q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventsFragment$PagingController$addModels$1(List<? extends t<?>> list, EventsFragment.PagingController pagingController, EventsFragment eventsFragment) {
        super(1);
        this.c = list;
        this.d = pagingController;
        this.q = eventsFragment;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: kotlin.collections.EmptyList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x013e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r13) {
        /*
            r12 = this;
            com.clubhouse.android.ui.events.EventsViewState r13 = (com.clubhouse.android.ui.events.EventsViewState) r13
            java.lang.String r0 = "state"
            m0.n.b.i.e(r13, r0)
            java.util.List<i0.b.a.t<?>> r13 = r12.c
            com.clubhouse.android.ui.events.EventsFragment$PagingController r0 = r12.d
            com.clubhouse.android.ui.events.EventsFragment r1 = r12.q
            java.util.Iterator r13 = r13.iterator()
        L_0x0011:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L_0x0176
            java.lang.Object r2 = r13.next()
            i0.b.a.t r2 = (i0.b.a.t) r2
            boolean r3 = r2 instanceof com.clubhouse.android.ui.events.EventsFragment.b
            if (r3 == 0) goto L_0x0011
            com.clubhouse.android.ui.events.EventsFragment$b r2 = (com.clubhouse.android.ui.events.EventsFragment.b) r2
            java.lang.String r3 = r2.k
            if (r3 != 0) goto L_0x0028
            goto L_0x0036
        L_0x0028:
            i0.e.b.g3.o.x0.w r4 = new i0.e.b.g3.o.x0.w
            r4.<init>()
            r4.M(r3)
            r4.L(r3)
            r0.add(r4)
        L_0x0036:
            com.clubhouse.android.data.models.local.EventInClub r2 = r2.j
            if (r2 != 0) goto L_0x003b
            goto L_0x0011
        L_0x003b:
            i0.e.b.g3.o.x0.z r3 = new i0.e.b.g3.o.x0.z
            r3.<init>()
            r4 = 1
            java.lang.Number[] r5 = new java.lang.Number[r4]
            int r6 = r2.Y1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7 = 0
            r5[r7] = r6
            r3.U(r5)
            r3.R(r2)
            java.lang.Boolean r5 = r2.x
            if (r5 != 0) goto L_0x0058
            r5 = r7
            goto L_0x005c
        L_0x0058:
            boolean r5 = r5.booleanValue()
        L_0x005c:
            r3.L(r5)
            com.clubhouse.android.data.models.local.club.ClubWithAdmin r5 = r2.c
            if (r5 != 0) goto L_0x0064
            goto L_0x0074
        L_0x0064:
            java.lang.String r5 = r5.y
            if (r5 != 0) goto L_0x0069
            goto L_0x0074
        L_0x0069:
            r3.X(r5)
            i0.e.b.g3.o.d r5 = new i0.e.b.g3.o.d
            r5.<init>(r1, r2)
            r3.O(r5)
        L_0x0074:
            m0.r.k<java.lang.Object>[] r5 = com.clubhouse.android.ui.events.EventsFragment.Z1
            com.clubhouse.android.ui.events.EventsViewModel r5 = r1.P0()
            java.util.Objects.requireNonNull(r5)
            java.lang.String r6 = "event"
            m0.n.b.i.e(r2, r6)
            java.util.List<com.clubhouse.android.data.models.local.user.UserInList> r6 = r2.b2
            if (r6 != 0) goto L_0x0087
            goto L_0x00bc
        L_0x0087:
            boolean r8 = r6.isEmpty()
            if (r8 == 0) goto L_0x008e
            goto L_0x00bc
        L_0x008e:
            java.util.Iterator r6 = r6.iterator()
        L_0x0092:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x00bc
            java.lang.Object r8 = r6.next()
            com.clubhouse.android.data.models.local.user.UserInList r8 = (com.clubhouse.android.data.models.local.user.UserInList) r8
            java.lang.Integer r8 = r8.getId()
            int r8 = r8.intValue()
            com.clubhouse.android.shared.auth.UserManager r9 = r5.n
            java.lang.Integer r9 = r9.b()
            if (r9 != 0) goto L_0x00af
            goto L_0x00b7
        L_0x00af:
            int r9 = r9.intValue()
            if (r8 != r9) goto L_0x00b7
            r8 = r4
            goto L_0x00b8
        L_0x00b7:
            r8 = r7
        L_0x00b8:
            if (r8 == 0) goto L_0x0092
            r5 = r4
            goto L_0x00bd
        L_0x00bc:
            r5 = r7
        L_0x00bd:
            r3.Q(r5)
            i0.e.b.g3.o.f r5 = new i0.e.b.g3.o.f
            r5.<init>(r1, r2, r0)
            r3.M(r5)
            i0.e.b.g3.o.g r5 = new i0.e.b.g3.o.g
            r5.<init>(r1, r2)
            r3.V(r5)
            i0.e.b.g3.o.c r5 = new i0.e.b.g3.o.c
            r5.<init>(r1, r2)
            r3.P(r5)
            i0.e.b.g3.o.b r5 = new i0.e.b.g3.o.b
            r5.<init>(r1, r2)
            r3.N(r5)
            r0.add(r3)
            i0.b.a.g r3 = new i0.b.a.g
            r3.<init>()
            int r5 = r2.Y1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "hosts"
            java.lang.String r5 = m0.n.b.i.k(r6, r5)
            r3.E(r5)
            java.util.List<com.clubhouse.android.data.models.local.user.UserInList> r5 = r2.b2
            if (r5 != 0) goto L_0x00fd
            r4 = 0
            goto L_0x013c
        L_0x00fd:
            java.util.ArrayList r6 = new java.util.ArrayList
            r8 = 10
            int r8 = i0.j.f.p.h.K(r5, r8)
            r6.<init>(r8)
            java.util.Iterator r5 = r5.iterator()
        L_0x010c:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x013b
            java.lang.Object r8 = r5.next()
            com.clubhouse.android.data.models.local.user.UserInList r8 = (com.clubhouse.android.data.models.local.user.UserInList) r8
            i0.e.b.g3.o.x0.b0 r9 = new i0.e.b.g3.o.x0.b0
            r9.<init>()
            java.lang.Number[] r10 = new java.lang.Number[r4]
            java.lang.Integer r11 = r8.getId()
            r10[r7] = r11
            r9.t(r10)
            r9.w()
            r9.j = r8
            i0.e.b.g3.o.h r10 = new i0.e.b.g3.o.h
            r10.<init>(r1, r8)
            r9.w()
            r9.k = r10
            r6.add(r9)
            goto L_0x010c
        L_0x013b:
            r4 = r6
        L_0x013c:
            if (r4 != 0) goto L_0x0140
            kotlin.collections.EmptyList r4 = kotlin.collections.EmptyList.c
        L_0x0140:
            r3.F(r4)
            android.content.Context r4 = r1.requireContext()
            java.lang.String r5 = "requireContext()"
            m0.n.b.i.d(r4, r5)
            h0.b0.v.h(r3, r4)
            r0.add(r3)
            i0.e.b.g3.o.x0.q r3 = new i0.e.b.g3.o.x0.q
            r3.<init>()
            int r4 = r2.Y1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "desc"
            java.lang.String r4 = m0.n.b.i.k(r5, r4)
            r3.P(r4)
            r3.O(r2)
            i0.e.b.g3.o.e r4 = new i0.e.b.g3.o.e
            r4.<init>(r1, r2)
            r3.M(r4)
            r0.add(r3)
            goto L_0x0011
        L_0x0176:
            m0.i r13 = m0.i.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.ui.events.EventsFragment$PagingController$addModels$1.invoke(java.lang.Object):java.lang.Object");
    }
}
