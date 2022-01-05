package com.clubhouse.backchannel.chat;

import i0.b.a.o;
import i0.e.c.c.y;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: BackchannelChatFragment.kt */
public final class BackchannelChatFragment$buildModels$1 extends Lambda implements l<y, i> {
    public final /* synthetic */ BackchannelChatFragment c;
    public final /* synthetic */ o d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackchannelChatFragment$buildModels$1(BackchannelChatFragment backchannelChatFragment, o oVar) {
        super(1);
        this.c = backchannelChatFragment;
        this.d = oVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:74:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0218  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0254  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            i0.e.c.c.y r1 = (i0.e.c.c.y) r1
            java.lang.String r2 = "state"
            m0.n.b.i.e(r1, r2)
            java.util.List<i0.e.c.f.b.a.b> r2 = r1.c
            com.clubhouse.backchannel.chat.BackchannelChatFragment r3 = r0.c
            i0.b.a.o r4 = r0.d
            java.util.Iterator r2 = r2.iterator()
        L_0x0015:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x03b7
            java.lang.Object r5 = r2.next()
            i0.e.c.f.b.a.b r5 = (i0.e.c.f.b.a.b) r5
            boolean r6 = r5 instanceof i0.e.c.f.b.a.i
            if (r6 == 0) goto L_0x0363
            i0.e.c.f.b.a.i r5 = (i0.e.c.f.b.a.i) r5
            android.content.Context r6 = r3.requireContext()
            java.lang.String r7 = "requireContext()"
            m0.n.b.i.d(r6, r7)
            java.lang.String r7 = "<this>"
            m0.n.b.i.e(r5, r7)
            java.lang.String r8 = "context"
            m0.n.b.i.e(r6, r8)
            java.util.List<i0.e.c.f.b.a.c> r9 = r5.a
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r9 = r9.iterator()
            r12 = 0
        L_0x0046:
            boolean r13 = r9.hasNext()
            if (r13 == 0) goto L_0x01a9
            java.lang.Object r13 = r9.next()
            int r11 = r12 + 1
            if (r12 < 0) goto L_0x01a4
            i0.e.c.f.b.a.c r13 = (i0.e.c.f.b.a.c) r13
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.List<i0.e.c.f.b.a.c> r15 = r5.a
            java.lang.Object r15 = m0.j.g.z(r15, r11)
            i0.e.c.f.b.a.c r15 = (i0.e.c.f.b.a.c) r15
            java.util.List<i0.e.c.f.b.a.c> r0 = r5.a
            int r12 = r12 + -1
            java.lang.Object r0 = m0.j.g.z(r0, r12)
            i0.e.c.f.b.a.c r0 = (i0.e.c.f.b.a.c) r0
            boolean r12 = r13 instanceof i0.e.c.f.b.a.c.f
            if (r12 == 0) goto L_0x00c3
            j$.time.Duration r12 = h0.b0.v.Y(r13, r15)
            r16 = 15
            r18 = r2
            j$.time.Duration r2 = j$.time.Duration.ofMinutes(r16)
            int r2 = r12.compareTo((j$.time.Duration) r2)
            if (r2 >= 0) goto L_0x008b
            boolean r2 = h0.b0.v.Q1(r13, r15)
            if (r2 == 0) goto L_0x008b
            r2 = 1
            goto L_0x008c
        L_0x008b:
            r2 = 0
        L_0x008c:
            j$.time.Duration r12 = h0.b0.v.Y(r13, r0)
            r19 = r5
            j$.time.Duration r5 = j$.time.Duration.ofMinutes(r16)
            int r5 = r12.compareTo((j$.time.Duration) r5)
            if (r5 >= 0) goto L_0x00a4
            boolean r0 = h0.b0.v.Q1(r13, r0)
            if (r0 == 0) goto L_0x00a4
            r0 = 1
            goto L_0x00a5
        L_0x00a4:
            r0 = 0
        L_0x00a5:
            if (r2 == 0) goto L_0x00ac
            if (r0 == 0) goto L_0x00ac
            com.clubhouse.backchannel.data.models.local.Position r0 = com.clubhouse.backchannel.data.models.local.Position.MIDDLE
            goto L_0x00b8
        L_0x00ac:
            if (r2 == 0) goto L_0x00b1
            com.clubhouse.backchannel.data.models.local.Position r0 = com.clubhouse.backchannel.data.models.local.Position.BOTTOM
            goto L_0x00b8
        L_0x00b1:
            if (r0 == 0) goto L_0x00b6
            com.clubhouse.backchannel.data.models.local.Position r0 = com.clubhouse.backchannel.data.models.local.Position.TOP
            goto L_0x00b8
        L_0x00b6:
            com.clubhouse.backchannel.data.models.local.Position r0 = com.clubhouse.backchannel.data.models.local.Position.ONLY
        L_0x00b8:
            r2 = r13
            i0.e.c.f.b.a.c$f r2 = (i0.e.c.f.b.a.c.f) r2
            i0.e.c.f.b.a.c r0 = r2.d(r0)
            r14.add(r0)
            goto L_0x00ca
        L_0x00c3:
            r18 = r2
            r19 = r5
            r14.add(r13)
        L_0x00ca:
            j$.time.Duration r0 = h0.b0.v.Y(r13, r15)
            r16 = 1
            j$.time.Duration r2 = j$.time.Duration.ofHours(r16)
            int r0 = r0.compareTo((j$.time.Duration) r2)
            if (r0 > 0) goto L_0x00e9
            java.lang.Integer r0 = r13.e()
            if (r0 != 0) goto L_0x00e2
            goto L_0x0198
        L_0x00e2:
            int r0 = r0.intValue()
            r2 = 1
            if (r0 != r2) goto L_0x0198
        L_0x00e9:
            j$.time.OffsetDateTime r0 = r13.f()
            m0.n.b.i.e(r0, r7)
            m0.n.b.i.e(r6, r8)
            boolean r2 = h0.b0.v.K0(r0)
            if (r2 == 0) goto L_0x0109
            android.content.res.Resources r0 = r6.getResources()
            int r2 = com.clubhouse.backchannel.R.string.today
            java.lang.String r0 = r0.getString(r2)
            java.lang.String r2 = "context.resources.getString(R.string.today)"
            m0.n.b.i.d(r0, r2)
            goto L_0x016a
        L_0x0109:
            boolean r2 = h0.b0.v.L0(r0)
            if (r2 == 0) goto L_0x011f
            android.content.res.Resources r0 = r6.getResources()
            int r2 = com.clubhouse.backchannel.R.string.tomorrow
            java.lang.String r0 = r0.getString(r2)
            java.lang.String r2 = "context.resources.getString(R.string.tomorrow)"
            m0.n.b.i.d(r0, r2)
            goto L_0x016a
        L_0x011f:
            m0.n.b.i.e(r0, r7)
            j$.time.OffsetDateTime r2 = j$.time.OffsetDateTime.now()
            j$.time.Duration r2 = j$.time.Duration.between(r0, r2)
            r16 = 7
            j$.time.Duration r5 = j$.time.Duration.ofDays(r16)
            int r2 = r2.compareTo((j$.time.Duration) r5)
            if (r2 >= 0) goto L_0x0138
            r15 = 1
            goto L_0x0139
        L_0x0138:
            r15 = 0
        L_0x0139:
            if (r15 == 0) goto L_0x0153
            java.lang.String r2 = "EEE"
            j$.time.format.DateTimeFormatter r2 = j$.time.format.DateTimeFormatter.ofPattern(r2)
            j$.time.ZoneId r5 = j$.time.ZoneId.systemDefault()
            j$.time.format.DateTimeFormatter r2 = r2.withZone(r5)
            java.lang.String r0 = r0.format(r2)
            java.lang.String r2 = "format(DateTimeFormatter.ofPattern(\"EEE\").withZone(ZoneId.systemDefault()))"
            m0.n.b.i.d(r0, r2)
            goto L_0x016a
        L_0x0153:
            java.lang.String r2 = "MMM d"
            j$.time.format.DateTimeFormatter r2 = j$.time.format.DateTimeFormatter.ofPattern(r2)
            j$.time.ZoneId r5 = j$.time.ZoneId.systemDefault()
            j$.time.format.DateTimeFormatter r2 = r2.withZone(r5)
            java.lang.String r0 = r0.format(r2)
            java.lang.String r2 = "format(DateTimeFormatter.ofPattern(\"MMM d\").withZone(ZoneId.systemDefault()))"
            m0.n.b.i.d(r0, r2)
        L_0x016a:
            j$.time.OffsetDateTime r2 = r13.f()
            java.lang.String r2 = h0.b0.v.L1(r2)
            i0.e.c.f.b.a.c$d r5 = new i0.e.c.f.b.a.c$d
            j$.time.OffsetDateTime r12 = r13.f()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r0)
            r15 = 32
            r13.append(r15)
            r13.append(r2)
            java.lang.String r2 = r13.toString()
            android.text.SpannableString r0 = i0.e.b.d3.k.x(r2, r0, r6)
            r2 = 2
            r13 = 0
            r5.<init>(r12, r13, r0, r2)
            r14.add(r5)
        L_0x0198:
            m0.j.g.b(r10, r14)
            r0 = r20
            r12 = r11
            r2 = r18
            r5 = r19
            goto L_0x0046
        L_0x01a4:
            r13 = 0
            m0.j.g.r0()
            throw r13
        L_0x01a9:
            r18 = r2
            r13 = 0
            java.util.Iterator r0 = r10.iterator()
        L_0x01b0:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x03b1
            java.lang.Object r2 = r0.next()
            i0.e.c.f.b.a.c r2 = (i0.e.c.f.b.a.c) r2
            boolean r5 = r2 instanceof i0.e.c.f.b.a.c.a
            if (r5 == 0) goto L_0x027d
            i0.e.c.c.k0.g r5 = new i0.e.c.c.k0.g
            r5.<init>()
            r6 = r2
            i0.e.c.f.b.a.c$a r6 = (i0.e.c.f.b.a.c.a) r6
            java.lang.String r8 = r6.c
            r5.H(r8)
            com.clubhouse.pubsub.user.backchannel.models.remote.ChatMember r8 = r6.f
            java.lang.String r8 = r8.Y1
            r5.Q(r8)
            java.lang.String r8 = r6.i
            r5.M(r8)
            com.clubhouse.pubsub.user.backchannel.models.remote.ChatMember r8 = r6.f
            java.lang.String r8 = r8.Z1
            r5.E(r8)
            r8 = r2
            i0.e.c.f.b.a.c$f r8 = (i0.e.c.f.b.a.c.f) r8
            boolean r9 = h0.b0.v.q0(r8)
            r5.U(r9)
            boolean r9 = h0.b0.v.q0(r8)
            if (r9 == 0) goto L_0x01fe
            i0.e.c.f.b.a.a r9 = r1.b
            if (r9 != 0) goto L_0x01f6
            r9 = r13
            goto L_0x01f8
        L_0x01f6:
            com.clubhouse.pubsub.user.backchannel.models.remote.ChatType r9 = r9.f
        L_0x01f8:
            com.clubhouse.pubsub.user.backchannel.models.remote.ChatType r10 = com.clubhouse.pubsub.user.backchannel.models.remote.ChatType.GROUP
            if (r9 != r10) goto L_0x01fe
            r9 = 1
            goto L_0x01ff
        L_0x01fe:
            r9 = 0
        L_0x01ff:
            r5.V(r9)
            boolean r9 = r6.e
            r5.J(r9)
            com.clubhouse.backchannel.data.models.local.DeliveryStatus r9 = r6.h
            r5.G(r9)
            java.lang.String r9 = "message"
            m0.n.b.i.e(r6, r9)
            boolean r9 = r6.e
            if (r9 == 0) goto L_0x0218
            com.clubhouse.backchannel.chat.style.MessageColor r9 = com.clubhouse.backchannel.chat.style.MessageColor.SELF
            goto L_0x0233
        L_0x0218:
            com.clubhouse.pubsub.user.backchannel.models.remote.ChatDestination r9 = r6.j
            com.clubhouse.pubsub.user.backchannel.models.remote.ChatDestination r10 = com.clubhouse.pubsub.user.backchannel.models.remote.ChatDestination.REQUESTS
            if (r9 != r10) goto L_0x0221
            com.clubhouse.backchannel.chat.style.MessageColor r9 = com.clubhouse.backchannel.chat.style.MessageColor.REQUEST
            goto L_0x0233
        L_0x0221:
            java.util.Map<java.lang.Integer, com.clubhouse.backchannel.chat.style.MessageColor> r9 = r1.f
            com.clubhouse.pubsub.user.backchannel.models.remote.ChatMember r10 = r6.f
            java.lang.Integer r10 = r10.getId()
            java.lang.Object r9 = r9.get(r10)
            com.clubhouse.backchannel.chat.style.MessageColor r9 = (com.clubhouse.backchannel.chat.style.MessageColor) r9
            if (r9 != 0) goto L_0x0233
            com.clubhouse.backchannel.chat.style.MessageColor r9 = com.clubhouse.backchannel.chat.style.MessageColor.BLUE
        L_0x0233:
            r5.O(r9)
            com.clubhouse.backchannel.chat.style.MessageBubbleStyle r8 = h0.b0.v.j0(r8)
            r5.N(r8)
            m0.n.b.i.e(r6, r7)
            java.lang.String r8 = r6.i
            boolean r8 = h0.b0.v.F0(r8)
            if (r8 == 0) goto L_0x0254
            java.lang.String r6 = r6.i
            int r6 = r6.length()
            r8 = 10
            if (r6 >= r8) goto L_0x0254
            r6 = 1
            goto L_0x0255
        L_0x0254:
            r6 = 0
        L_0x0255:
            r5.I(r6)
            i0.e.c.c.d r6 = new i0.e.c.c.d
            r6.<init>(r3, r2)
            r5.T(r6)
            i0.e.c.c.h r6 = new i0.e.c.c.h
            r6.<init>(r3, r2)
            r5.S(r6)
            i0.e.c.c.j r6 = new i0.e.c.c.j
            r6.<init>(r3, r2, r1)
            r5.K(r6)
            i0.e.c.c.g r6 = new i0.e.c.c.g
            r6.<init>(r3, r2)
            r5.R(r6)
            r4.add(r5)
            goto L_0x01b0
        L_0x027d:
            boolean r5 = r2 instanceof i0.e.c.f.b.a.c.b
            java.lang.String r6 = "resources"
            if (r5 == 0) goto L_0x02ab
            i0.e.c.c.k0.n r5 = new i0.e.c.c.k0.n
            r5.<init>()
            r8 = r2
            i0.e.c.f.b.a.c$b r8 = (i0.e.c.f.b.a.c.b) r8
            java.lang.String r9 = r8.c
            r5.D(r9)
            android.content.res.Resources r9 = r3.getResources()
            m0.n.b.i.d(r9, r6)
            java.lang.CharSequence r6 = h0.b0.v.W(r8, r9)
            r5.F(r6)
            i0.e.c.c.k r6 = new i0.e.c.c.k
            r6.<init>(r3, r2)
            r5.G(r6)
            r4.add(r5)
            goto L_0x01b0
        L_0x02ab:
            boolean r5 = r2 instanceof i0.e.c.f.b.a.c.C0216c
            if (r5 == 0) goto L_0x02d7
            i0.e.c.c.k0.n r5 = new i0.e.c.c.k0.n
            r5.<init>()
            r8 = r2
            i0.e.c.f.b.a.c$c r8 = (i0.e.c.f.b.a.c.C0216c) r8
            java.lang.String r9 = r8.c
            r5.D(r9)
            android.content.res.Resources r9 = r3.getResources()
            m0.n.b.i.d(r9, r6)
            java.lang.CharSequence r6 = h0.b0.v.X(r8, r9)
            r5.F(r6)
            i0.e.c.c.i r6 = new i0.e.c.c.i
            r6.<init>(r3, r2)
            r5.G(r6)
            r4.add(r5)
            goto L_0x01b0
        L_0x02d7:
            boolean r5 = r2 instanceof i0.e.c.f.b.a.c.d
            if (r5 == 0) goto L_0x0301
            i0.e.c.c.k0.n r5 = new i0.e.c.c.k0.n
            r5.<init>()
            r6 = 1
            java.lang.Number[] r8 = new java.lang.Number[r6]
            j$.time.OffsetDateTime r9 = r2.f()
            int r9 = r9.hashCode()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r10 = 0
            r8[r10] = r9
            r5.E(r8)
            i0.e.c.f.b.a.c$d r2 = (i0.e.c.f.b.a.c.d) r2
            java.lang.CharSequence r2 = r2.c
            r5.F(r2)
            r4.add(r5)
            goto L_0x01b0
        L_0x0301:
            r6 = 1
            r10 = 0
            boolean r5 = r2 instanceof i0.e.c.f.b.a.c.e
            if (r5 == 0) goto L_0x01b0
            i0.e.c.c.k0.g r5 = new i0.e.c.c.k0.g
            r5.<init>()
            r8 = r2
            i0.e.c.f.b.a.c$e r8 = (i0.e.c.f.b.a.c.e) r8
            java.lang.String r9 = r8.c
            r5.H(r9)
            int r9 = com.clubhouse.backchannel.R.string.clubhouse_user
            r5.P(r9)
            int r9 = com.clubhouse.backchannel.R.string.message_content_unavailable
            r5.L(r9)
            int r9 = com.clubhouse.backchannel.R.drawable.ic_avatar_unavailable
            r5.D(r9)
            r9 = r2
            i0.e.c.f.b.a.c$f r9 = (i0.e.c.f.b.a.c.f) r9
            boolean r11 = h0.b0.v.q0(r9)
            r5.U(r11)
            boolean r11 = h0.b0.v.q0(r9)
            if (r11 == 0) goto L_0x0341
            i0.e.c.f.b.a.a r11 = r1.b
            if (r11 != 0) goto L_0x0339
            r11 = r13
            goto L_0x033b
        L_0x0339:
            com.clubhouse.pubsub.user.backchannel.models.remote.ChatType r11 = r11.f
        L_0x033b:
            com.clubhouse.pubsub.user.backchannel.models.remote.ChatType r12 = com.clubhouse.pubsub.user.backchannel.models.remote.ChatType.GROUP
            if (r11 != r12) goto L_0x0341
            r11 = r6
            goto L_0x0342
        L_0x0341:
            r11 = r10
        L_0x0342:
            r5.V(r11)
            boolean r8 = r8.e
            r5.J(r8)
            com.clubhouse.backchannel.chat.style.MessageColor r8 = com.clubhouse.backchannel.chat.style.MessageColor.REQUEST
            r5.O(r8)
            com.clubhouse.backchannel.chat.style.MessageBubbleStyle r8 = h0.b0.v.j0(r9)
            r5.N(r8)
            i0.e.c.c.f r8 = new i0.e.c.c.f
            r8.<init>(r3, r2)
            r5.R(r8)
            r4.add(r5)
            goto L_0x01b0
        L_0x0363:
            r18 = r2
            boolean r0 = r5 instanceof i0.e.c.f.b.a.g
            if (r0 == 0) goto L_0x0387
            i0.e.c.c.k0.k r0 = new i0.e.c.c.k0.k
            r0.<init>()
            i0.e.c.f.b.a.g r5 = (i0.e.c.f.b.a.g) r5
            i0.e.c.f.b.a.j r2 = r5.a
            int r2 = r2.hashCode()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r5 = "loading"
            java.lang.String r2 = m0.n.b.i.k(r5, r2)
            r0.D(r2)
            r4.add(r0)
            goto L_0x03b1
        L_0x0387:
            boolean r0 = r5 instanceof i0.e.c.f.b.a.k
            if (r0 == 0) goto L_0x03b1
            i0.e.c.c.k0.k r0 = new i0.e.c.c.k0.k
            r0.<init>()
            r2 = r5
            i0.e.c.f.b.a.k r2 = (i0.e.c.f.b.a.k) r2
            i0.e.c.f.b.a.j r2 = r2.a
            int r2 = r2.hashCode()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r6 = "unknown"
            java.lang.String r2 = m0.n.b.i.k(r6, r2)
            r0.D(r2)
            i0.e.c.c.e r2 = new i0.e.c.c.e
            r2.<init>(r3, r5)
            r0.E(r2)
            r4.add(r0)
        L_0x03b1:
            r0 = r20
            r2 = r18
            goto L_0x0015
        L_0x03b7:
            m0.i r0 = m0.i.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.backchannel.chat.BackchannelChatFragment$buildModels$1.invoke(java.lang.Object):java.lang.Object");
    }
}
