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
import n0.c.k.o0;
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: Message.kt */
public final class UserMessage implements b {
    public static final Companion Companion = new Companion((f) null);
    public final MessageType a;
    public final int b;
    public final String c;
    public final Long d;
    public final String e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/local/channel/UserMessage$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/local/channel/UserMessage;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: Message.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<UserMessage> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: Message.kt */
    public static final class a implements v<UserMessage> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.local.channel.UserMessage", aVar, 5);
            pluginGeneratedSerialDescriptor.i("action", false);
            pluginGeneratedSerialDescriptor.i("from_user_id", false);
            pluginGeneratedSerialDescriptor.i("from_name", false);
            pluginGeneratedSerialDescriptor.i("channel_invite_id", true);
            pluginGeneratedSerialDescriptor.i(Include.INCLUDE_CHANNEL_PARAM_VALUE, true);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            g1 g1Var = g1.b;
            return new KSerializer[]{i0.e.b.b3.a.b.c.f.a, e0.b, g1Var, m0.r.t.a.r.m.a1.a.R1(o0.b), m0.r.t.a.r.m.a1.a.R1(g1Var)};
        }

        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder r17) {
            /*
                r16 = this;
                r0 = r17
                java.lang.String r1 = "decoder"
                m0.n.b.i.e(r0, r1)
                kotlinx.serialization.descriptors.SerialDescriptor r1 = b
                n0.c.j.c r0 = r0.c(r1)
                boolean r2 = r0.y()
                r3 = 3
                r4 = 0
                r5 = 0
                r6 = 1
                r7 = 2
                r8 = 4
                if (r2 == 0) goto L_0x003a
                i0.e.b.b3.a.b.c.f r2 = i0.e.b.b3.a.b.c.f.a
                java.lang.Object r2 = r0.m(r1, r5, r2, r4)
                int r5 = r0.k(r1, r6)
                java.lang.String r6 = r0.t(r1, r7)
                n0.c.k.o0 r7 = n0.c.k.o0.b
                java.lang.Object r3 = r0.v(r1, r3, r7, r4)
                n0.c.k.g1 r7 = n0.c.k.g1.b
                java.lang.Object r4 = r0.v(r1, r8, r7, r4)
                r7 = 31
                r8 = r5
                r9 = r6
                r6 = r7
                goto L_0x008a
            L_0x003a:
                r2 = r4
                r9 = r2
                r10 = r9
                r11 = r5
                r12 = r11
                r13 = r6
            L_0x0040:
                if (r13 == 0) goto L_0x0084
                int r14 = r0.x(r1)
                r15 = -1
                if (r14 == r15) goto L_0x0082
                if (r14 == 0) goto L_0x0079
                if (r14 == r6) goto L_0x0072
                if (r14 == r7) goto L_0x006b
                if (r14 == r3) goto L_0x0062
                if (r14 != r8) goto L_0x005c
                n0.c.k.g1 r14 = n0.c.k.g1.b
                java.lang.Object r2 = r0.v(r1, r8, r14, r2)
                r12 = r12 | 16
                goto L_0x0040
            L_0x005c:
                kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
                r0.<init>(r14)
                throw r0
            L_0x0062:
                n0.c.k.o0 r14 = n0.c.k.o0.b
                java.lang.Object r4 = r0.v(r1, r3, r14, r4)
                r12 = r12 | 8
                goto L_0x0040
            L_0x006b:
                java.lang.String r10 = r0.t(r1, r7)
                r12 = r12 | 4
                goto L_0x0040
            L_0x0072:
                int r11 = r0.k(r1, r6)
                r12 = r12 | 2
                goto L_0x0040
            L_0x0079:
                i0.e.b.b3.a.b.c.f r14 = i0.e.b.b3.a.b.c.f.a
                java.lang.Object r9 = r0.m(r1, r5, r14, r9)
                r12 = r12 | 1
                goto L_0x0040
            L_0x0082:
                r13 = r5
                goto L_0x0040
            L_0x0084:
                r3 = r4
                r8 = r11
                r6 = r12
                r4 = r2
                r2 = r9
                r9 = r10
            L_0x008a:
                r0.b(r1)
                com.clubhouse.android.data.models.local.channel.UserMessage r0 = new com.clubhouse.android.data.models.local.channel.UserMessage
                r7 = r2
                com.clubhouse.android.data.models.local.channel.MessageType r7 = (com.clubhouse.android.data.models.local.channel.MessageType) r7
                r10 = r3
                java.lang.Long r10 = (java.lang.Long) r10
                r11 = r4
                java.lang.String r11 = (java.lang.String) r11
                r5 = r0
                r5.<init>(r6, r7, r8, r9, r10, r11)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.models.local.channel.UserMessage.a.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            UserMessage userMessage = (UserMessage) obj;
            i.e(encoder, "encoder");
            i.e(userMessage, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(userMessage, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            boolean z = false;
            c.z(serialDescriptor, 0, i0.e.b.b3.a.b.c.f.a, userMessage.a);
            c.q(serialDescriptor, 1, userMessage.a().intValue());
            c.s(serialDescriptor, 2, userMessage.c);
            if (c.v(serialDescriptor, 3) || userMessage.d != null) {
                c.l(serialDescriptor, 3, o0.b, userMessage.d);
            }
            if (c.v(serialDescriptor, 4) || userMessage.e != null) {
                z = true;
            }
            if (z) {
                c.l(serialDescriptor, 4, g1.b, userMessage.e);
            }
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    public UserMessage(int i, MessageType messageType, int i2, String str, Long l, String str2) {
        if (7 == (i & 7)) {
            this.a = messageType;
            this.b = i2;
            this.c = str;
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = l;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = str2;
            }
        } else {
            a aVar = a.a;
            m0.r.t.a.r.m.a1.a.W3(i, 7, a.b);
            throw null;
        }
    }

    public Integer a() {
        return Integer.valueOf(this.b);
    }

    public MessageType b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserMessage)) {
            return false;
        }
        UserMessage userMessage = (UserMessage) obj;
        return this.a == userMessage.a && a().intValue() == userMessage.a().intValue() && i.a(this.c, userMessage.c) && i.a(this.d, userMessage.d) && i.a(this.e, userMessage.e);
    }

    public int hashCode() {
        int F = i0.d.a.a.a.F(this.c, (a().hashCode() + (this.a.hashCode() * 31)) * 31, 31);
        Long l = this.d;
        int i = 0;
        int hashCode = (F + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.e;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("UserMessage(action=");
        P0.append(this.a);
        P0.append(", userId=");
        P0.append(a().intValue());
        P0.append(", userName=");
        P0.append(this.c);
        P0.append(", channelInviteId=");
        P0.append(this.d);
        P0.append(", channel=");
        return i0.d.a.a.a.w0(P0, this.e, ')');
    }
}
