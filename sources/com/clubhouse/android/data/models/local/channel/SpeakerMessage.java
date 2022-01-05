package com.clubhouse.android.data.models.local.channel;

import com.clubhouse.android.data.models.local.channel.UserInChannel;
import i0.e.b.b3.a.a.c.b;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import m0.n.b.f;
import m0.n.b.i;
import n0.c.e;
import n0.c.k.e0;
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: Message.kt */
public final class SpeakerMessage implements b {
    public static final Companion Companion = new Companion((f) null);
    public final MessageType a;
    public final UserInChannel b;
    public final Integer c;
    public final Integer d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/local/channel/SpeakerMessage$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/local/channel/SpeakerMessage;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: Message.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<SpeakerMessage> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: Message.kt */
    public static final class a implements v<SpeakerMessage> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.local.channel.SpeakerMessage", aVar, 4);
            pluginGeneratedSerialDescriptor.i("action", false);
            pluginGeneratedSerialDescriptor.i("user_profile", true);
            pluginGeneratedSerialDescriptor.i("user_id", true);
            pluginGeneratedSerialDescriptor.i("userId", true);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            e0 e0Var = e0.b;
            return new KSerializer[]{i0.e.b.b3.a.b.c.f.a, m0.r.t.a.r.m.a1.a.R1(UserInChannel.a.a), m0.r.t.a.r.m.a1.a.R1(e0Var), m0.r.t.a.r.m.a1.a.R1(e0Var)};
        }

        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder r14) {
            /*
                r13 = this;
                java.lang.String r0 = "decoder"
                m0.n.b.i.e(r14, r0)
                kotlinx.serialization.descriptors.SerialDescriptor r0 = b
                n0.c.j.c r14 = r14.c(r0)
                boolean r1 = r14.y()
                r2 = 3
                r3 = 0
                r4 = 0
                r5 = 1
                r6 = 2
                if (r1 == 0) goto L_0x0031
                i0.e.b.b3.a.b.c.f r1 = i0.e.b.b3.a.b.c.f.a
                java.lang.Object r1 = r14.m(r0, r4, r1, r3)
                com.clubhouse.android.data.models.local.channel.UserInChannel$a r4 = com.clubhouse.android.data.models.local.channel.UserInChannel.a.a
                java.lang.Object r4 = r14.v(r0, r5, r4, r3)
                n0.c.k.e0 r5 = n0.c.k.e0.b
                java.lang.Object r6 = r14.v(r0, r6, r5, r3)
                java.lang.Object r2 = r14.v(r0, r2, r5, r3)
                r3 = 15
                r9 = r4
                r4 = r3
                goto L_0x0078
            L_0x0031:
                r1 = r3
                r7 = r1
                r8 = r7
                r9 = r8
                r3 = r4
                r10 = r5
            L_0x0037:
                if (r10 == 0) goto L_0x0074
                int r11 = r14.x(r0)
                r12 = -1
                if (r11 == r12) goto L_0x0072
                if (r11 == 0) goto L_0x0069
                if (r11 == r5) goto L_0x0060
                if (r11 == r6) goto L_0x0057
                if (r11 != r2) goto L_0x0051
                n0.c.k.e0 r11 = n0.c.k.e0.b
                java.lang.Object r7 = r14.v(r0, r2, r11, r7)
                r3 = r3 | 8
                goto L_0x0037
            L_0x0051:
                kotlinx.serialization.UnknownFieldException r14 = new kotlinx.serialization.UnknownFieldException
                r14.<init>(r11)
                throw r14
            L_0x0057:
                n0.c.k.e0 r11 = n0.c.k.e0.b
                java.lang.Object r1 = r14.v(r0, r6, r11, r1)
                r3 = r3 | 4
                goto L_0x0037
            L_0x0060:
                com.clubhouse.android.data.models.local.channel.UserInChannel$a r11 = com.clubhouse.android.data.models.local.channel.UserInChannel.a.a
                java.lang.Object r9 = r14.v(r0, r5, r11, r9)
                r3 = r3 | 2
                goto L_0x0037
            L_0x0069:
                i0.e.b.b3.a.b.c.f r11 = i0.e.b.b3.a.b.c.f.a
                java.lang.Object r8 = r14.m(r0, r4, r11, r8)
                r3 = r3 | 1
                goto L_0x0037
            L_0x0072:
                r10 = r4
                goto L_0x0037
            L_0x0074:
                r6 = r1
                r4 = r3
                r2 = r7
                r1 = r8
            L_0x0078:
                r14.b(r0)
                com.clubhouse.android.data.models.local.channel.SpeakerMessage r14 = new com.clubhouse.android.data.models.local.channel.SpeakerMessage
                r5 = r1
                com.clubhouse.android.data.models.local.channel.MessageType r5 = (com.clubhouse.android.data.models.local.channel.MessageType) r5
                r0 = r9
                com.clubhouse.android.data.models.local.channel.UserInChannel r0 = (com.clubhouse.android.data.models.local.channel.UserInChannel) r0
                r7 = r6
                java.lang.Integer r7 = (java.lang.Integer) r7
                r8 = r2
                java.lang.Integer r8 = (java.lang.Integer) r8
                r3 = r14
                r6 = r0
                r3.<init>(r4, r5, r6, r7, r8)
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.models.local.channel.SpeakerMessage.a.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0075, code lost:
            if (m0.n.b.i.a(r4, r5) == false) goto L_0x0077;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void serialize(kotlinx.serialization.encoding.Encoder r7, java.lang.Object r8) {
            /*
                r6 = this;
                com.clubhouse.android.data.models.local.channel.SpeakerMessage r8 = (com.clubhouse.android.data.models.local.channel.SpeakerMessage) r8
                java.lang.String r0 = "encoder"
                m0.n.b.i.e(r7, r0)
                java.lang.String r0 = "value"
                m0.n.b.i.e(r8, r0)
                kotlinx.serialization.descriptors.SerialDescriptor r0 = b
                n0.c.j.d r7 = r7.c(r0)
                java.lang.String r1 = "self"
                m0.n.b.i.e(r8, r1)
                java.lang.String r1 = "output"
                m0.n.b.i.e(r7, r1)
                java.lang.String r1 = "serialDesc"
                m0.n.b.i.e(r0, r1)
                i0.e.b.b3.a.b.c.f r1 = i0.e.b.b3.a.b.c.f.a
                com.clubhouse.android.data.models.local.channel.MessageType r2 = r8.a
                r3 = 0
                r7.z(r0, r3, r1, r2)
                r1 = 1
                boolean r2 = r7.v(r0, r1)
                if (r2 == 0) goto L_0x0031
                goto L_0x0035
            L_0x0031:
                com.clubhouse.android.data.models.local.channel.UserInChannel r2 = r8.b
                if (r2 == 0) goto L_0x0037
            L_0x0035:
                r2 = r1
                goto L_0x0038
            L_0x0037:
                r2 = r3
            L_0x0038:
                if (r2 == 0) goto L_0x0041
                com.clubhouse.android.data.models.local.channel.UserInChannel$a r2 = com.clubhouse.android.data.models.local.channel.UserInChannel.a.a
                com.clubhouse.android.data.models.local.channel.UserInChannel r4 = r8.b
                r7.l(r0, r1, r2, r4)
            L_0x0041:
                r2 = 2
                boolean r4 = r7.v(r0, r2)
                if (r4 == 0) goto L_0x0049
                goto L_0x004d
            L_0x0049:
                java.lang.Integer r4 = r8.c
                if (r4 == 0) goto L_0x004f
            L_0x004d:
                r4 = r1
                goto L_0x0050
            L_0x004f:
                r4 = r3
            L_0x0050:
                if (r4 == 0) goto L_0x0059
                n0.c.k.e0 r4 = n0.c.k.e0.b
                java.lang.Integer r5 = r8.c
                r7.l(r0, r2, r4, r5)
            L_0x0059:
                r2 = 3
                boolean r4 = r7.v(r0, r2)
                if (r4 == 0) goto L_0x0061
                goto L_0x0077
            L_0x0061:
                java.lang.Integer r4 = r8.d
                java.lang.Integer r5 = r8.c
                if (r5 != 0) goto L_0x0071
                com.clubhouse.android.data.models.local.channel.UserInChannel r5 = r8.b
                if (r5 != 0) goto L_0x006d
                r5 = 0
                goto L_0x0071
            L_0x006d:
                java.lang.Integer r5 = r5.getId()
            L_0x0071:
                boolean r4 = m0.n.b.i.a(r4, r5)
                if (r4 != 0) goto L_0x0078
            L_0x0077:
                r3 = r1
            L_0x0078:
                if (r3 == 0) goto L_0x0081
                n0.c.k.e0 r1 = n0.c.k.e0.b
                java.lang.Integer r8 = r8.d
                r7.l(r0, r2, r1, r8)
            L_0x0081:
                r7.b(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.models.local.channel.SpeakerMessage.a.serialize(kotlinx.serialization.encoding.Encoder, java.lang.Object):void");
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    public SpeakerMessage(int i, MessageType messageType, UserInChannel userInChannel, Integer num, Integer num2) {
        Integer num3 = null;
        if (1 == (i & 1)) {
            this.a = messageType;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = userInChannel;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = num;
            }
            if ((i & 8) == 0) {
                Integer num4 = this.c;
                if (num4 == null) {
                    UserInChannel userInChannel2 = this.b;
                    if (userInChannel2 != null) {
                        num3 = userInChannel2.getId();
                    }
                } else {
                    num3 = num4;
                }
                this.d = num3;
                return;
            }
            this.d = num2;
            return;
        }
        a aVar = a.a;
        m0.r.t.a.r.m.a1.a.W3(i, 1, a.b);
        throw null;
    }

    public Integer a() {
        return this.d;
    }

    public MessageType b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpeakerMessage)) {
            return false;
        }
        SpeakerMessage speakerMessage = (SpeakerMessage) obj;
        return this.a == speakerMessage.a && i.a(this.b, speakerMessage.b) && i.a(this.c, speakerMessage.c);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        UserInChannel userInChannel = this.b;
        int i = 0;
        int hashCode2 = (hashCode + (userInChannel == null ? 0 : userInChannel.hashCode())) * 31;
        Integer num = this.c;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("SpeakerMessage(action=");
        P0.append(this.a);
        P0.append(", user=");
        P0.append(this.b);
        P0.append(", messageUserId=");
        return i0.d.a.a.a.v0(P0, this.c, ')');
    }
}
