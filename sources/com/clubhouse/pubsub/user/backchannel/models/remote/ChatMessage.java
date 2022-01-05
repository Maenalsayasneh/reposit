package com.clubhouse.pubsub.user.backchannel.models.remote;

import androidx.recyclerview.widget.RecyclerView;
import i0.e.d.b.a.a.b.d;
import j$.time.OffsetDateTime;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import m0.n.b.f;
import m0.n.b.i;
import m0.n.b.m;
import n0.c.e;
import n0.c.k.e0;
import n0.c.k.g1;
import n0.c.k.h;
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: ChatMessage.kt */
public final class ChatMessage implements i0.e.b.a3.e.a<String> {
    public static final Companion Companion = new Companion((f) null);
    public final MessageData Y1;
    public final OffsetDateTime Z1;
    public final boolean a2;
    public final Integer b2;
    public final Integer c;
    public final String c2;
    public final String d;
    public final Integer d2;
    public final String q;
    public final int x;
    public final BackchannelMessageType y;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/pubsub/user/backchannel/models/remote/ChatMessage$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/pubsub/user/backchannel/models/remote/ChatMessage;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "pubsub_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: ChatMessage.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<ChatMessage> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: ChatMessage.kt */
    public static final class a implements v<ChatMessage> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.pubsub.user.backchannel.models.remote.ChatMessage", aVar, 11);
            pluginGeneratedSerialDescriptor.i("message_id", true);
            pluginGeneratedSerialDescriptor.i("client_message_id", false);
            pluginGeneratedSerialDescriptor.i("chat_id", false);
            pluginGeneratedSerialDescriptor.i("sender_user_profile_id", false);
            pluginGeneratedSerialDescriptor.i("message_type", false);
            pluginGeneratedSerialDescriptor.i("message_data", false);
            pluginGeneratedSerialDescriptor.i("time_received", false);
            pluginGeneratedSerialDescriptor.i("sendingFailed", true);
            pluginGeneratedSerialDescriptor.i("afterMessageId", true);
            pluginGeneratedSerialDescriptor.i("id", true);
            pluginGeneratedSerialDescriptor.i("sortId", true);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            e0 e0Var = e0.b;
            g1 g1Var = g1.b;
            return new KSerializer[]{m0.r.t.a.r.m.a1.a.R1(e0Var), g1Var, g1Var, e0Var, i0.e.d.b.a.a.b.a.a, d.c, new n0.c.a(m.a(OffsetDateTime.class), (KSerializer) null, new KSerializer[0]), h.b, m0.r.t.a.r.m.a1.a.R1(e0Var), g1Var, m0.r.t.a.r.m.a1.a.R1(e0Var)};
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x00a3, code lost:
            r10 = 4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x00d9, code lost:
            r11 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0105, code lost:
            r13 = r10;
            r2 = 10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x011d, code lost:
            r13 = r10;
            r2 = 10;
            r3 = 6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0121, code lost:
            r10 = 7;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder r26) {
            /*
                r25 = this;
                r0 = r26
                java.lang.String r1 = "decoder"
                m0.n.b.i.e(r0, r1)
                kotlinx.serialization.descriptors.SerialDescriptor r1 = b
                n0.c.j.c r0 = r0.c(r1)
                boolean r2 = r0.y()
                r3 = 6
                r4 = 5
                r5 = 0
                r6 = 0
                r9 = 3
                r10 = 7
                r11 = 1
                r12 = 2
                r13 = 4
                r14 = 8
                if (r2 == 0) goto L_0x006c
                n0.c.k.e0 r2 = n0.c.k.e0.b
                java.lang.Object r15 = r0.v(r1, r5, r2, r6)
                java.lang.String r11 = r0.t(r1, r11)
                java.lang.String r12 = r0.t(r1, r12)
                int r9 = r0.k(r1, r9)
                i0.e.d.b.a.a.b.a r7 = i0.e.d.b.a.a.b.a.a
                java.lang.Object r7 = r0.m(r1, r13, r7, r6)
                i0.e.d.b.a.a.b.d r13 = i0.e.d.b.a.a.b.d.c
                java.lang.Object r4 = r0.m(r1, r4, r13, r6)
                n0.c.a r13 = new n0.c.a
                java.lang.Class<j$.time.OffsetDateTime> r16 = j$.time.OffsetDateTime.class
                m0.r.d r8 = m0.n.b.m.a(r16)
                kotlinx.serialization.KSerializer[] r5 = new kotlinx.serialization.KSerializer[r5]
                r13.<init>(r8, r6, r5)
                java.lang.Object r3 = r0.m(r1, r3, r13, r6)
                boolean r5 = r0.s(r1, r10)
                java.lang.Object r8 = r0.v(r1, r14, r2, r6)
                r10 = 9
                java.lang.String r10 = r0.t(r1, r10)
                r13 = 10
                java.lang.Object r2 = r0.v(r1, r13, r2, r6)
                r6 = 2047(0x7ff, float:2.868E-42)
                r14 = r5
                r16 = r10
                r20 = r11
                r10 = r9
                r9 = r12
                goto L_0x0135
            L_0x006c:
                r2 = 10
                r16 = r5
                r18 = r16
                r7 = r6
                r8 = r7
                r9 = r8
                r12 = r9
                r15 = r12
                r19 = r15
                r20 = r19
                r21 = r20
                r22 = r21
                r23 = r11
                r11 = r18
            L_0x0083:
                if (r23 == 0) goto L_0x0124
                int r13 = r0.x(r1)
                switch(r13) {
                    case -1: goto L_0x0117;
                    case 0: goto L_0x0109;
                    case 1: goto L_0x00fc;
                    case 2: goto L_0x00f1;
                    case 3: goto L_0x00e6;
                    case 4: goto L_0x00db;
                    case 5: goto L_0x00d1;
                    case 6: goto L_0x00bb;
                    case 7: goto L_0x00b2;
                    case 8: goto L_0x00a7;
                    case 9: goto L_0x009b;
                    case 10: goto L_0x0092;
                    default: goto L_0x008c;
                }
            L_0x008c:
                kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
                r0.<init>(r13)
                throw r0
            L_0x0092:
                n0.c.k.e0 r13 = n0.c.k.e0.b
                java.lang.Object r7 = r0.v(r1, r2, r13, r7)
                r11 = r11 | 1024(0x400, float:1.435E-42)
                goto L_0x00a3
            L_0x009b:
                r13 = 9
                java.lang.String r19 = r0.t(r1, r13)
                r11 = r11 | 512(0x200, float:7.175E-43)
            L_0x00a3:
                r10 = 4
                r13 = 2
                goto L_0x011d
            L_0x00a7:
                r13 = 9
                n0.c.k.e0 r2 = n0.c.k.e0.b
                java.lang.Object r9 = r0.v(r1, r14, r2, r9)
                r2 = r11 | 256(0x100, float:3.59E-43)
                goto L_0x00d9
            L_0x00b2:
                r13 = 9
                boolean r16 = r0.s(r1, r10)
                r2 = r11 | 128(0x80, float:1.794E-43)
                goto L_0x00d9
            L_0x00bb:
                r13 = 9
                n0.c.a r2 = new n0.c.a
                java.lang.Class<j$.time.OffsetDateTime> r24 = j$.time.OffsetDateTime.class
                m0.r.d r10 = m0.n.b.m.a(r24)
                kotlinx.serialization.KSerializer[] r13 = new kotlinx.serialization.KSerializer[r5]
                r2.<init>(r10, r6, r13)
                java.lang.Object r8 = r0.m(r1, r3, r2, r8)
                r2 = r11 | 64
                goto L_0x00d9
            L_0x00d1:
                i0.e.d.b.a.a.b.d r2 = i0.e.d.b.a.a.b.d.c
                java.lang.Object r15 = r0.m(r1, r4, r2, r15)
                r2 = r11 | 32
            L_0x00d9:
                r11 = r2
                goto L_0x00a3
            L_0x00db:
                i0.e.d.b.a.a.b.a r2 = i0.e.d.b.a.a.b.a.a
                r10 = 4
                java.lang.Object r12 = r0.m(r1, r10, r2, r12)
                r2 = r11 | 16
                r11 = r2
                goto L_0x00ee
            L_0x00e6:
                r2 = 3
                r10 = 4
                int r18 = r0.k(r1, r2)
                r11 = r11 | 8
            L_0x00ee:
                r2 = 1
                r13 = 2
                goto L_0x0105
            L_0x00f1:
                r2 = 3
                r10 = 4
                r13 = 2
                java.lang.String r21 = r0.t(r1, r13)
                r11 = r11 | 4
                r2 = 1
                goto L_0x0105
            L_0x00fc:
                r2 = 1
                r10 = 4
                r13 = 2
                java.lang.String r20 = r0.t(r1, r2)
                r11 = r11 | 2
            L_0x0105:
                r13 = r10
                r2 = 10
                goto L_0x0121
            L_0x0109:
                r10 = 4
                r13 = 2
                n0.c.k.e0 r2 = n0.c.k.e0.b
                r3 = r22
                java.lang.Object r22 = r0.v(r1, r5, r2, r3)
                r2 = r11 | 1
                r11 = r2
                goto L_0x011d
            L_0x0117:
                r3 = r22
                r10 = 4
                r13 = 2
                r23 = r5
            L_0x011d:
                r13 = r10
                r2 = 10
                r3 = 6
            L_0x0121:
                r10 = 7
                goto L_0x0083
            L_0x0124:
                r3 = r22
                r2 = r7
                r6 = r11
                r7 = r12
                r4 = r15
                r14 = r16
                r10 = r18
                r16 = r19
                r15 = r3
                r3 = r8
                r8 = r9
                r9 = r21
            L_0x0135:
                r0.b(r1)
                com.clubhouse.pubsub.user.backchannel.models.remote.ChatMessage r0 = new com.clubhouse.pubsub.user.backchannel.models.remote.ChatMessage
                r1 = r15
                java.lang.Integer r1 = (java.lang.Integer) r1
                r11 = r7
                com.clubhouse.pubsub.user.backchannel.models.remote.BackchannelMessageType r11 = (com.clubhouse.pubsub.user.backchannel.models.remote.BackchannelMessageType) r11
                r12 = r4
                com.clubhouse.pubsub.user.backchannel.models.remote.MessageData r12 = (com.clubhouse.pubsub.user.backchannel.models.remote.MessageData) r12
                r13 = r3
                j$.time.OffsetDateTime r13 = (j$.time.OffsetDateTime) r13
                r15 = r8
                java.lang.Integer r15 = (java.lang.Integer) r15
                r17 = r2
                java.lang.Integer r17 = (java.lang.Integer) r17
                r5 = r0
                r7 = r1
                r8 = r20
                r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.pubsub.user.backchannel.models.remote.ChatMessage.a.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d0, code lost:
            if (m0.n.b.i.a(r4, r5) == false) goto L_0x00d2;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void serialize(kotlinx.serialization.encoding.Encoder r9, java.lang.Object r10) {
            /*
                r8 = this;
                com.clubhouse.pubsub.user.backchannel.models.remote.ChatMessage r10 = (com.clubhouse.pubsub.user.backchannel.models.remote.ChatMessage) r10
                java.lang.String r0 = "encoder"
                m0.n.b.i.e(r9, r0)
                java.lang.String r0 = "value"
                m0.n.b.i.e(r10, r0)
                kotlinx.serialization.descriptors.SerialDescriptor r0 = b
                n0.c.j.d r9 = r9.c(r0)
                java.lang.String r1 = "self"
                m0.n.b.i.e(r10, r1)
                java.lang.String r1 = "output"
                m0.n.b.i.e(r9, r1)
                java.lang.String r1 = "serialDesc"
                m0.n.b.i.e(r0, r1)
                r1 = 0
                boolean r2 = r9.v(r0, r1)
                r3 = 1
                if (r2 == 0) goto L_0x002a
                goto L_0x002e
            L_0x002a:
                java.lang.Integer r2 = r10.c
                if (r2 == 0) goto L_0x0030
            L_0x002e:
                r2 = r3
                goto L_0x0031
            L_0x0030:
                r2 = r1
            L_0x0031:
                if (r2 == 0) goto L_0x003a
                n0.c.k.e0 r2 = n0.c.k.e0.b
                java.lang.Integer r4 = r10.c
                r9.l(r0, r1, r2, r4)
            L_0x003a:
                java.lang.String r2 = r10.d
                r9.s(r0, r3, r2)
                r2 = 2
                java.lang.String r4 = r10.q
                r9.s(r0, r2, r4)
                r2 = 3
                int r4 = r10.x
                r9.q(r0, r2, r4)
                r2 = 4
                i0.e.d.b.a.a.b.a r4 = i0.e.d.b.a.a.b.a.a
                com.clubhouse.pubsub.user.backchannel.models.remote.BackchannelMessageType r5 = r10.y
                r9.z(r0, r2, r4, r5)
                r2 = 5
                i0.e.d.b.a.a.b.d r4 = i0.e.d.b.a.a.b.d.c
                com.clubhouse.pubsub.user.backchannel.models.remote.MessageData r5 = r10.Y1
                r9.z(r0, r2, r4, r5)
                r2 = 6
                n0.c.a r4 = new n0.c.a
                java.lang.Class<j$.time.OffsetDateTime> r5 = j$.time.OffsetDateTime.class
                m0.r.d r5 = m0.n.b.m.a(r5)
                r6 = 0
                kotlinx.serialization.KSerializer[] r7 = new kotlinx.serialization.KSerializer[r1]
                r4.<init>(r5, r6, r7)
                j$.time.OffsetDateTime r5 = r10.Z1
                r9.z(r0, r2, r4, r5)
                r2 = 7
                boolean r4 = r9.v(r0, r2)
                if (r4 == 0) goto L_0x0077
                goto L_0x007b
            L_0x0077:
                boolean r4 = r10.a2
                if (r4 == 0) goto L_0x007d
            L_0x007b:
                r4 = r3
                goto L_0x007e
            L_0x007d:
                r4 = r1
            L_0x007e:
                if (r4 == 0) goto L_0x0085
                boolean r4 = r10.a2
                r9.r(r0, r2, r4)
            L_0x0085:
                r2 = 8
                boolean r4 = r9.v(r0, r2)
                if (r4 == 0) goto L_0x008e
                goto L_0x0092
            L_0x008e:
                java.lang.Integer r4 = r10.b2
                if (r4 == 0) goto L_0x0094
            L_0x0092:
                r4 = r3
                goto L_0x0095
            L_0x0094:
                r4 = r1
            L_0x0095:
                if (r4 == 0) goto L_0x009e
                n0.c.k.e0 r4 = n0.c.k.e0.b
                java.lang.Integer r5 = r10.b2
                r9.l(r0, r2, r4, r5)
            L_0x009e:
                r2 = 9
                boolean r4 = r9.v(r0, r2)
                if (r4 == 0) goto L_0x00a7
                goto L_0x00b1
            L_0x00a7:
                java.lang.String r4 = r10.c2
                java.lang.String r5 = r10.d
                boolean r4 = m0.n.b.i.a(r4, r5)
                if (r4 != 0) goto L_0x00b3
            L_0x00b1:
                r4 = r3
                goto L_0x00b4
            L_0x00b3:
                r4 = r1
            L_0x00b4:
                if (r4 == 0) goto L_0x00bb
                java.lang.String r4 = r10.c2
                r9.s(r0, r2, r4)
            L_0x00bb:
                r2 = 10
                boolean r4 = r9.v(r0, r2)
                if (r4 == 0) goto L_0x00c4
                goto L_0x00d2
            L_0x00c4:
                java.lang.Integer r4 = r10.d2
                java.lang.Integer r5 = r10.c
                if (r5 != 0) goto L_0x00cc
                java.lang.Integer r5 = r10.b2
            L_0x00cc:
                boolean r4 = m0.n.b.i.a(r4, r5)
                if (r4 != 0) goto L_0x00d3
            L_0x00d2:
                r1 = r3
            L_0x00d3:
                if (r1 == 0) goto L_0x00dc
                n0.c.k.e0 r1 = n0.c.k.e0.b
                java.lang.Integer r10 = r10.d2
                r9.l(r0, r2, r1, r10)
            L_0x00dc:
                r9.b(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.pubsub.user.backchannel.models.remote.ChatMessage.a.serialize(kotlinx.serialization.encoding.Encoder, java.lang.Object):void");
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    public ChatMessage(int i, Integer num, String str, String str2, int i2, BackchannelMessageType backchannelMessageType, MessageData messageData, OffsetDateTime offsetDateTime, boolean z, Integer num2, String str3, Integer num3) {
        if (126 == (i & 126)) {
            if ((i & 1) == 0) {
                this.c = null;
            } else {
                this.c = num;
            }
            this.d = str;
            this.q = str2;
            this.x = i2;
            this.y = backchannelMessageType;
            this.Y1 = messageData;
            this.Z1 = offsetDateTime;
            if ((i & 128) == 0) {
                this.a2 = false;
            } else {
                this.a2 = z;
            }
            if ((i & 256) == 0) {
                this.b2 = null;
            } else {
                this.b2 = num2;
            }
            if ((i & 512) == 0) {
                this.c2 = str;
            } else {
                this.c2 = str3;
            }
            if ((i & RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE) == 0) {
                Integer num4 = this.c;
                this.d2 = num4 == null ? this.b2 : num4;
                return;
            }
            this.d2 = num3;
            return;
        }
        a aVar = a.a;
        m0.r.t.a.r.m.a1.a.W3(i, 126, a.b);
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatMessage)) {
            return false;
        }
        ChatMessage chatMessage = (ChatMessage) obj;
        return i.a(this.c, chatMessage.c) && i.a(this.d, chatMessage.d) && i.a(this.q, chatMessage.q) && this.x == chatMessage.x && this.y == chatMessage.y && i.a(this.Y1, chatMessage.Y1) && i.a(this.Z1, chatMessage.Z1) && this.a2 == chatMessage.a2 && i.a(this.b2, chatMessage.b2);
    }

    public Object getId() {
        return this.c2;
    }

    public int hashCode() {
        Integer num = this.c;
        int i = 0;
        int M = i0.d.a.a.a.M(this.x, i0.d.a.a.a.F(this.q, i0.d.a.a.a.F(this.d, (num == null ? 0 : num.hashCode()) * 31, 31), 31), 31);
        int hashCode = (this.Z1.hashCode() + ((this.Y1.hashCode() + ((this.y.hashCode() + M) * 31)) * 31)) * 31;
        boolean z = this.a2;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        Integer num2 = this.b2;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ChatMessage(messageId=");
        P0.append(this.c);
        P0.append(", clientMessageId=");
        P0.append(this.d);
        P0.append(", chatId=");
        P0.append(this.q);
        P0.append(", senderUserId=");
        P0.append(this.x);
        P0.append(", type=");
        P0.append(this.y);
        P0.append(", messageData=");
        P0.append(this.Y1);
        P0.append(", timeReceived=");
        P0.append(this.Z1);
        P0.append(", sendingFailed=");
        P0.append(this.a2);
        P0.append(", afterMessageId=");
        return i0.d.a.a.a.v0(P0, this.b2, ')');
    }

    public ChatMessage(Integer num, String str, String str2, int i, BackchannelMessageType backchannelMessageType, MessageData messageData, OffsetDateTime offsetDateTime, boolean z, Integer num2) {
        i.e(str, "clientMessageId");
        i.e(str2, "chatId");
        i.e(backchannelMessageType, "type");
        i.e(messageData, "messageData");
        i.e(offsetDateTime, "timeReceived");
        this.c = num;
        this.d = str;
        this.q = str2;
        this.x = i;
        this.y = backchannelMessageType;
        this.Y1 = messageData;
        this.Z1 = offsetDateTime;
        this.a2 = z;
        this.b2 = num2;
        this.c2 = str;
        this.d2 = num == null ? num2 : num;
    }
}
