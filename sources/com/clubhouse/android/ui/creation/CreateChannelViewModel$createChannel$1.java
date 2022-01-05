package com.clubhouse.android.ui.creation;

import i0.e.b.g3.n.r;
import i0.e.b.g3.n.t;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: CreateChannelViewModel.kt */
public final class CreateChannelViewModel$createChannel$1 extends Lambda implements l<t, i> {
    public final /* synthetic */ r c;
    public final /* synthetic */ CreateChannelViewModel d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateChannelViewModel$createChannel$1(r rVar, CreateChannelViewModel createChannelViewModel) {
        super(1);
        this.c = rVar;
        this.d = createChannelViewModel;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0080  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r24) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            i0.e.b.g3.n.t r1 = (i0.e.b.g3.n.t) r1
            java.lang.String r2 = "state"
            m0.n.b.i.e(r1, r2)
            i0.b.b.b<com.clubhouse.android.data.models.local.channel.ChannelInRoomWithAccess> r2 = r1.a
            boolean r2 = r2 instanceof i0.b.b.f
            if (r2 == 0) goto L_0x0013
            goto L_0x00aa
        L_0x0013:
            i0.e.b.z2.f.a r2 = r1.c
            com.clubhouse.android.channels.model.AudienceType r3 = com.clubhouse.android.channels.model.AudienceType.Social
            r4 = 1
            r5 = 0
            if (r2 != r3) goto L_0x001d
            r7 = r4
            goto L_0x001e
        L_0x001d:
            r7 = r5
        L_0x001e:
            com.clubhouse.android.channels.model.AudienceType r3 = com.clubhouse.android.channels.model.AudienceType.Closed
            if (r2 != r3) goto L_0x0024
            r8 = r4
            goto L_0x0025
        L_0x0024:
            r8 = r5
        L_0x0025:
            java.util.List<com.clubhouse.android.data.models.local.user.UserInList> r2 = r1.d
            java.util.ArrayList r9 = new java.util.ArrayList
            r3 = 10
            int r3 = i0.j.f.p.h.K(r2, r3)
            r9.<init>(r3)
            java.util.Iterator r2 = r2.iterator()
        L_0x0036:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0052
            java.lang.Object r3 = r2.next()
            com.clubhouse.android.data.models.local.user.UserInList r3 = (com.clubhouse.android.data.models.local.user.UserInList) r3
            java.lang.Integer r3 = r3.getId()
            int r3 = r3.intValue()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r9.add(r3)
            goto L_0x0036
        L_0x0052:
            java.lang.String r12 = r1.e
            i0.e.b.z2.f.a r1 = r1.c
            boolean r2 = r1 instanceof i0.e.b.z2.f.d
            r3 = 0
            if (r2 == 0) goto L_0x0064
            i0.e.b.z2.f.d r1 = (i0.e.b.z2.f.d) r1
            com.clubhouse.android.data.models.local.club.Club r1 = r1.c
            int r1 = r1.getId()
            goto L_0x0073
        L_0x0064:
            i0.e.b.g3.n.r r1 = r0.c
            com.clubhouse.android.data.models.local.EventInClub r1 = r1.a
            if (r1 != 0) goto L_0x006b
            goto L_0x006f
        L_0x006b:
            com.clubhouse.android.data.models.local.club.ClubWithAdmin r1 = r1.c
            if (r1 != 0) goto L_0x0071
        L_0x006f:
            r10 = r3
            goto L_0x0078
        L_0x0071:
            int r1 = r1.x
        L_0x0073:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r10 = r1
        L_0x0078:
            i0.e.b.g3.n.r r1 = r0.c
            com.clubhouse.android.data.models.local.EventInClub r1 = r1.a
            if (r1 != 0) goto L_0x0080
            r11 = r3
            goto L_0x0087
        L_0x0080:
            int r1 = r1.Y1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r11 = r1
        L_0x0087:
            com.clubhouse.android.data.models.local.user.SourceLocation r14 = com.clubhouse.android.data.models.local.user.SourceLocation.HALLWAY
            com.clubhouse.android.data.models.remote.request.CreateChannelRequest r1 = new com.clubhouse.android.data.models.remote.request.CreateChannelRequest
            r13 = 0
            r15 = 64
            r6 = r1
            r6.<init>((boolean) r7, (boolean) r8, (java.util.List) r9, (java.lang.Integer) r10, (java.lang.Integer) r11, (java.lang.String) r12, (java.lang.String) r13, (com.clubhouse.android.data.models.local.user.SourceLocation) r14, (int) r15)
            com.clubhouse.android.ui.creation.CreateChannelViewModel r2 = r0.d
            com.clubhouse.android.ui.creation.CreateChannelViewModel$createChannel$1$1 r4 = new com.clubhouse.android.ui.creation.CreateChannelViewModel$createChannel$1$1
            r4.<init>(r1, r3)
            r18 = 0
            r19 = 0
            com.clubhouse.android.ui.creation.CreateChannelViewModel$createChannel$1$2 r20 = com.clubhouse.android.ui.creation.CreateChannelViewModel$createChannel$1.AnonymousClass2.c
            r21 = 3
            r22 = 0
            r16 = r2
            r17 = r4
            com.airbnb.mvrx.MavericksViewModel.f(r16, r17, r18, r19, r20, r21, r22)
        L_0x00aa:
            m0.i r1 = m0.i.a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.ui.creation.CreateChannelViewModel$createChannel$1.invoke(java.lang.Object):java.lang.Object");
    }
}
