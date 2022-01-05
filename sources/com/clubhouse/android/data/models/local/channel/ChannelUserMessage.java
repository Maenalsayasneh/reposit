package com.clubhouse.android.data.models.local.channel;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.pubnub.api.endpoints.objects_api.utils.Include;
import i0.e.b.b3.a.a.c.b;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import m0.n.b.f;
import m0.n.b.i;
import n0.c.e;
import n0.c.j.d;
import n0.c.k.e0;
import n0.c.k.g1;
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: Message.kt */
public final class ChannelUserMessage implements b {
    public static final Companion Companion = new Companion((f) null);
    public final MessageType a;
    public final Integer b;
    public final String c;
    public final String d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/local/channel/ChannelUserMessage$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/local/channel/ChannelUserMessage;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: Message.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<ChannelUserMessage> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: Message.kt */
    public static final class a implements v<ChannelUserMessage> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.local.channel.ChannelUserMessage", aVar, 4);
            pluginGeneratedSerialDescriptor.i("action", false);
            pluginGeneratedSerialDescriptor.i("from_user_id", true);
            pluginGeneratedSerialDescriptor.i("from_name", true);
            pluginGeneratedSerialDescriptor.i(Include.INCLUDE_CHANNEL_PARAM_VALUE, false);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            g1 g1Var = g1.b;
            return new KSerializer[]{i0.e.b.b3.a.b.c.f.a, m0.r.t.a.r.m.a1.a.R1(e0.b), m0.r.t.a.r.m.a1.a.R1(g1Var), g1Var};
        }

        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder r15) {
            /*
                r14 = this;
                java.lang.String r0 = "decoder"
                m0.n.b.i.e(r15, r0)
                kotlinx.serialization.descriptors.SerialDescriptor r0 = b
                n0.c.j.c r15 = r15.c(r0)
                boolean r1 = r15.y()
                r2 = 3
                r3 = 0
                r4 = 0
                r5 = 1
                r6 = 2
                if (r1 == 0) goto L_0x0030
                i0.e.b.b3.a.b.c.f r1 = i0.e.b.b3.a.b.c.f.a
                java.lang.Object r1 = r15.m(r0, r4, r1, r3)
                n0.c.k.e0 r4 = n0.c.k.e0.b
                java.lang.Object r4 = r15.v(r0, r5, r4, r3)
                n0.c.k.g1 r5 = n0.c.k.g1.b
                java.lang.Object r3 = r15.v(r0, r6, r5, r3)
                java.lang.String r2 = r15.t(r0, r2)
                r5 = 15
                r7 = r2
                goto L_0x0076
            L_0x0030:
                r1 = r3
                r7 = r1
                r8 = r7
                r9 = r4
                r10 = r5
            L_0x0035:
                if (r10 == 0) goto L_0x0070
                int r11 = r15.x(r0)
                r12 = -1
                if (r11 == r12) goto L_0x006e
                if (r11 == 0) goto L_0x0065
                if (r11 == r5) goto L_0x005c
                if (r11 == r6) goto L_0x0053
                if (r11 != r2) goto L_0x004d
                java.lang.String r1 = r15.t(r0, r2)
                r9 = r9 | 8
                goto L_0x0035
            L_0x004d:
                kotlinx.serialization.UnknownFieldException r15 = new kotlinx.serialization.UnknownFieldException
                r15.<init>(r11)
                throw r15
            L_0x0053:
                n0.c.k.g1 r11 = n0.c.k.g1.b
                java.lang.Object r8 = r15.v(r0, r6, r11, r8)
                r9 = r9 | 4
                goto L_0x0035
            L_0x005c:
                n0.c.k.e0 r11 = n0.c.k.e0.b
                java.lang.Object r3 = r15.v(r0, r5, r11, r3)
                r9 = r9 | 2
                goto L_0x0035
            L_0x0065:
                i0.e.b.b3.a.b.c.f r11 = i0.e.b.b3.a.b.c.f.a
                java.lang.Object r7 = r15.m(r0, r4, r11, r7)
                r9 = r9 | 1
                goto L_0x0035
            L_0x006e:
                r10 = r4
                goto L_0x0035
            L_0x0070:
                r4 = r3
                r3 = r8
                r5 = r9
                r13 = r7
                r7 = r1
                r1 = r13
            L_0x0076:
                r15.b(r0)
                com.clubhouse.android.data.models.local.channel.ChannelUserMessage r15 = new com.clubhouse.android.data.models.local.channel.ChannelUserMessage
                r0 = r1
                com.clubhouse.android.data.models.local.channel.MessageType r0 = (com.clubhouse.android.data.models.local.channel.MessageType) r0
                r1 = r4
                java.lang.Integer r1 = (java.lang.Integer) r1
                r6 = r3
                java.lang.String r6 = (java.lang.String) r6
                r2 = r15
                r3 = r5
                r4 = r0
                r5 = r1
                r2.<init>(r3, r4, r5, r6, r7)
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.models.local.channel.ChannelUserMessage.a.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            ChannelUserMessage channelUserMessage = (ChannelUserMessage) obj;
            i.e(encoder, "encoder");
            i.e(channelUserMessage, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(channelUserMessage, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            boolean z = false;
            c.z(serialDescriptor, 0, i0.e.b.b3.a.b.c.f.a, channelUserMessage.a);
            if (c.v(serialDescriptor, 1) || channelUserMessage.b != null) {
                c.l(serialDescriptor, 1, e0.b, channelUserMessage.b);
            }
            if (c.v(serialDescriptor, 2) || channelUserMessage.c != null) {
                z = true;
            }
            if (z) {
                c.l(serialDescriptor, 2, g1.b, channelUserMessage.c);
            }
            c.s(serialDescriptor, 3, channelUserMessage.d);
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    public ChannelUserMessage(int i, MessageType messageType, Integer num, String str, String str2) {
        if (9 == (i & 9)) {
            this.a = messageType;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = num;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str;
            }
            this.d = str2;
            return;
        }
        a aVar = a.a;
        m0.r.t.a.r.m.a1.a.W3(i, 9, a.b);
        throw null;
    }

    public Integer a() {
        return this.b;
    }

    public MessageType b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelUserMessage)) {
            return false;
        }
        ChannelUserMessage channelUserMessage = (ChannelUserMessage) obj;
        return this.a == channelUserMessage.a && i.a(this.b, channelUserMessage.b) && i.a(this.c, channelUserMessage.c) && i.a(this.d, channelUserMessage.d);
    }

    public int hashCode() {
        int i;
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int i2 = 0;
        if (num == null) {
            i = 0;
        } else {
            i = num.hashCode();
        }
        int i3 = (hashCode + i) * 31;
        String str = this.c;
        if (str != null) {
            i2 = str.hashCode();
        }
        return this.d.hashCode() + ((i3 + i2) * 31);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ChannelUserMessage(action=");
        P0.append(this.a);
        P0.append(", userId=");
        P0.append(this.b);
        P0.append(", userName=");
        P0.append(this.c);
        P0.append(", channel=");
        return i0.d.a.a.a.x0(P0, this.d, ')');
    }
}
