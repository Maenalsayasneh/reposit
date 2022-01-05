package com.clubhouse.android.ui.events;

import com.clubhouse.android.data.models.local.EventInClub;
import i0.e.b.g3.o.l0;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: HalfEventViewModel.kt */
public final class HalfEventViewModel$createRoom$1 extends Lambda implements l<l0, i> {
    public final /* synthetic */ EventInClub c;
    public final /* synthetic */ HalfEventViewModel d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfEventViewModel$createRoom$1(EventInClub eventInClub, HalfEventViewModel halfEventViewModel) {
        super(1);
        this.c = eventInClub;
        this.d = halfEventViewModel;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: kotlin.collections.EmptyList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            i0.e.b.g3.o.l0 r1 = (i0.e.b.g3.o.l0) r1
            java.lang.String r2 = "state"
            m0.n.b.i.e(r1, r2)
            i0.b.b.b<com.clubhouse.android.data.models.local.channel.ChannelInRoomWithAccess> r1 = r1.a
            boolean r1 = r1 instanceof i0.b.b.f
            if (r1 == 0) goto L_0x0013
            goto L_0x009d
        L_0x0013:
            r3 = 0
            com.clubhouse.android.data.models.local.EventInClub r1 = r0.c
            r2 = 1
            if (r1 != 0) goto L_0x001a
            goto L_0x001e
        L_0x001a:
            com.clubhouse.android.data.models.local.club.ClubWithAdmin r4 = r1.c
            if (r4 != 0) goto L_0x0020
        L_0x001e:
            r4 = r2
            goto L_0x0023
        L_0x0020:
            boolean r2 = r4.i2
            goto L_0x001e
        L_0x0023:
            r12 = 0
            if (r1 != 0) goto L_0x0027
            goto L_0x002b
        L_0x0027:
            java.util.List<com.clubhouse.android.data.models.local.user.UserInList> r1 = r1.b2
            if (r1 != 0) goto L_0x002d
        L_0x002b:
            r2 = r12
            goto L_0x0058
        L_0x002d:
            java.util.ArrayList r2 = new java.util.ArrayList
            r5 = 10
            int r5 = i0.j.f.p.h.K(r1, r5)
            r2.<init>(r5)
            java.util.Iterator r1 = r1.iterator()
        L_0x003c:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x0058
            java.lang.Object r5 = r1.next()
            com.clubhouse.android.data.models.local.user.UserInList r5 = (com.clubhouse.android.data.models.local.user.UserInList) r5
            java.lang.Integer r5 = r5.getId()
            int r5 = r5.intValue()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r2.add(r5)
            goto L_0x003c
        L_0x0058:
            if (r2 != 0) goto L_0x005e
            kotlin.collections.EmptyList r1 = kotlin.collections.EmptyList.c
            r5 = r1
            goto L_0x005f
        L_0x005e:
            r5 = r2
        L_0x005f:
            com.clubhouse.android.data.models.local.EventInClub r1 = r0.c
            if (r1 != 0) goto L_0x0064
            goto L_0x0068
        L_0x0064:
            com.clubhouse.android.data.models.local.club.ClubWithAdmin r1 = r1.c
            if (r1 != 0) goto L_0x006a
        L_0x0068:
            r6 = r12
            goto L_0x0071
        L_0x006a:
            int r1 = r1.x
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r6 = r1
        L_0x0071:
            com.clubhouse.android.data.models.local.EventInClub r1 = r0.c
            if (r1 != 0) goto L_0x0077
            r7 = r12
            goto L_0x007e
        L_0x0077:
            int r1 = r1.Y1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r7 = r1
        L_0x007e:
            r8 = 0
            r9 = 0
            com.clubhouse.android.data.models.local.user.SourceLocation r10 = com.clubhouse.android.data.models.local.user.SourceLocation.BULLETIN
            r11 = 96
            com.clubhouse.android.data.models.remote.request.CreateChannelRequest r1 = new com.clubhouse.android.data.models.remote.request.CreateChannelRequest
            r2 = r1
            r2.<init>((boolean) r3, (boolean) r4, (java.util.List) r5, (java.lang.Integer) r6, (java.lang.Integer) r7, (java.lang.String) r8, (java.lang.String) r9, (com.clubhouse.android.data.models.local.user.SourceLocation) r10, (int) r11)
            com.clubhouse.android.ui.events.HalfEventViewModel r13 = r0.d
            com.clubhouse.android.ui.events.HalfEventViewModel$createRoom$1$1 r14 = new com.clubhouse.android.ui.events.HalfEventViewModel$createRoom$1$1
            r14.<init>(r1, r12)
            r15 = 0
            r16 = 0
            com.clubhouse.android.ui.events.HalfEventViewModel$createRoom$1$2 r17 = com.clubhouse.android.ui.events.HalfEventViewModel$createRoom$1.AnonymousClass2.c
            r18 = 3
            r19 = 0
            com.airbnb.mvrx.MavericksViewModel.f(r13, r14, r15, r16, r17, r18, r19)
        L_0x009d:
            m0.i r1 = m0.i.a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.ui.events.HalfEventViewModel$createRoom$1.invoke(java.lang.Object):java.lang.Object");
    }
}
