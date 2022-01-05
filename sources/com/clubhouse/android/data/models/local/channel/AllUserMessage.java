package com.clubhouse.android.data.models.local.channel;

import com.clubhouse.android.data.models.local.channel.UserInChannel;
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
import n0.c.k.h;
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: Message.kt */
public final class AllUserMessage implements b {
    public static final Companion Companion = new Companion((f) null);
    public final MessageType a;
    public final Integer b;
    public final UserInChannel c;
    public final HandraisePermission d;
    public final Boolean e;
    public final String f;
    public final Boolean g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/local/channel/AllUserMessage$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/local/channel/AllUserMessage;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: Message.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<AllUserMessage> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: Message.kt */
    public static final class a implements v<AllUserMessage> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.local.channel.AllUserMessage", aVar, 7);
            pluginGeneratedSerialDescriptor.i("action", false);
            pluginGeneratedSerialDescriptor.i("user_id", true);
            pluginGeneratedSerialDescriptor.i("user_profile", true);
            pluginGeneratedSerialDescriptor.i("handraise_permission", true);
            pluginGeneratedSerialDescriptor.i("is_enabled", true);
            pluginGeneratedSerialDescriptor.i(Include.INCLUDE_CHANNEL_PARAM_VALUE, true);
            pluginGeneratedSerialDescriptor.i("enabled", true);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            h hVar = h.b;
            return new KSerializer[]{i0.e.b.b3.a.b.c.f.a, m0.r.t.a.r.m.a1.a.R1(e0.b), m0.r.t.a.r.m.a1.a.R1(UserInChannel.a.a), m0.r.t.a.r.m.a1.a.R1(i0.e.b.b3.a.b.c.e.a), m0.r.t.a.r.m.a1.a.R1(hVar), m0.r.t.a.r.m.a1.a.R1(g1.b), m0.r.t.a.r.m.a1.a.R1(hVar)};
        }

        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder r20) {
            /*
                r19 = this;
                r0 = r20
                java.lang.String r1 = "decoder"
                m0.n.b.i.e(r0, r1)
                kotlinx.serialization.descriptors.SerialDescriptor r1 = b
                n0.c.j.c r0 = r0.c(r1)
                boolean r2 = r0.y()
                r3 = 5
                r4 = 3
                r5 = 0
                r6 = 2
                r7 = 4
                r8 = 6
                r9 = 1
                r10 = 0
                if (r2 == 0) goto L_0x004c
                i0.e.b.b3.a.b.c.f r2 = i0.e.b.b3.a.b.c.f.a
                java.lang.Object r2 = r0.m(r1, r10, r2, r5)
                n0.c.k.e0 r10 = n0.c.k.e0.b
                java.lang.Object r9 = r0.v(r1, r9, r10, r5)
                com.clubhouse.android.data.models.local.channel.UserInChannel$a r10 = com.clubhouse.android.data.models.local.channel.UserInChannel.a.a
                java.lang.Object r6 = r0.v(r1, r6, r10, r5)
                i0.e.b.b3.a.b.c.e r10 = i0.e.b.b3.a.b.c.e.a
                java.lang.Object r4 = r0.v(r1, r4, r10, r5)
                n0.c.k.h r10 = n0.c.k.h.b
                java.lang.Object r7 = r0.v(r1, r7, r10, r5)
                n0.c.k.g1 r11 = n0.c.k.g1.b
                java.lang.Object r3 = r0.v(r1, r3, r11, r5)
                java.lang.Object r5 = r0.v(r1, r8, r10, r5)
                r8 = 127(0x7f, float:1.78E-43)
                r18 = r9
                r9 = r8
                r8 = r18
                goto L_0x00c7
            L_0x004c:
                r2 = r5
                r11 = r2
                r12 = r11
                r13 = r12
                r14 = r13
                r15 = r14
                r17 = r9
                r16 = r10
            L_0x0056:
                if (r17 == 0) goto L_0x00bf
                int r10 = r0.x(r1)
                switch(r10) {
                    case -1: goto L_0x00b9;
                    case 0: goto L_0x00af;
                    case 1: goto L_0x00a5;
                    case 2: goto L_0x0098;
                    case 3: goto L_0x008b;
                    case 4: goto L_0x007e;
                    case 5: goto L_0x0071;
                    case 6: goto L_0x0065;
                    default: goto L_0x005f;
                }
            L_0x005f:
                kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
                r0.<init>(r10)
                throw r0
            L_0x0065:
                n0.c.k.h r10 = n0.c.k.h.b
                java.lang.Object r5 = r0.v(r1, r8, r10, r5)
                r10 = r16 | 64
                r16 = r10
                r3 = 0
                goto L_0x00bc
            L_0x0071:
                n0.c.k.g1 r10 = n0.c.k.g1.b
                java.lang.Object r10 = r0.v(r1, r3, r10, r14)
                r14 = r16 | 32
                r16 = r14
                r3 = 0
                r14 = r10
                goto L_0x00bc
            L_0x007e:
                n0.c.k.h r10 = n0.c.k.h.b
                java.lang.Object r10 = r0.v(r1, r7, r10, r13)
                r13 = r16 | 16
                r16 = r13
                r3 = 0
                r13 = r10
                goto L_0x00bc
            L_0x008b:
                i0.e.b.b3.a.b.c.e r10 = i0.e.b.b3.a.b.c.e.a
                java.lang.Object r10 = r0.v(r1, r4, r10, r12)
                r12 = r16 | 8
                r16 = r12
                r3 = 0
                r12 = r10
                goto L_0x00bc
            L_0x0098:
                com.clubhouse.android.data.models.local.channel.UserInChannel$a r10 = com.clubhouse.android.data.models.local.channel.UserInChannel.a.a
                java.lang.Object r10 = r0.v(r1, r6, r10, r11)
                r11 = r16 | 4
                r16 = r11
                r3 = 0
                r11 = r10
                goto L_0x00bc
            L_0x00a5:
                n0.c.k.e0 r10 = n0.c.k.e0.b
                java.lang.Object r2 = r0.v(r1, r9, r10, r2)
                r16 = r16 | 2
                r10 = 0
                goto L_0x0056
            L_0x00af:
                i0.e.b.b3.a.b.c.f r10 = i0.e.b.b3.a.b.c.f.a
                r3 = 0
                java.lang.Object r15 = r0.m(r1, r3, r10, r15)
                r16 = r16 | 1
                goto L_0x00bc
            L_0x00b9:
                r3 = 0
                r17 = r3
            L_0x00bc:
                r10 = r3
                r3 = 5
                goto L_0x0056
            L_0x00bf:
                r8 = r2
                r6 = r11
                r4 = r12
                r7 = r13
                r3 = r14
                r2 = r15
                r9 = r16
            L_0x00c7:
                r0.b(r1)
                com.clubhouse.android.data.models.local.channel.AllUserMessage r0 = new com.clubhouse.android.data.models.local.channel.AllUserMessage
                r10 = r2
                com.clubhouse.android.data.models.local.channel.MessageType r10 = (com.clubhouse.android.data.models.local.channel.MessageType) r10
                r11 = r8
                java.lang.Integer r11 = (java.lang.Integer) r11
                r12 = r6
                com.clubhouse.android.data.models.local.channel.UserInChannel r12 = (com.clubhouse.android.data.models.local.channel.UserInChannel) r12
                r13 = r4
                com.clubhouse.android.data.models.local.channel.HandraisePermission r13 = (com.clubhouse.android.data.models.local.channel.HandraisePermission) r13
                r14 = r7
                java.lang.Boolean r14 = (java.lang.Boolean) r14
                r15 = r3
                java.lang.String r15 = (java.lang.String) r15
                r16 = r5
                java.lang.Boolean r16 = (java.lang.Boolean) r16
                r8 = r0
                r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.models.local.channel.AllUserMessage.a.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            AllUserMessage allUserMessage = (AllUserMessage) obj;
            i.e(encoder, "encoder");
            i.e(allUserMessage, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(allUserMessage, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            boolean z = false;
            c.z(serialDescriptor, 0, i0.e.b.b3.a.b.c.f.a, allUserMessage.a);
            if (c.v(serialDescriptor, 1) || allUserMessage.b != null) {
                c.l(serialDescriptor, 1, e0.b, allUserMessage.b);
            }
            if (c.v(serialDescriptor, 2) || allUserMessage.c != null) {
                c.l(serialDescriptor, 2, UserInChannel.a.a, allUserMessage.c);
            }
            if (c.v(serialDescriptor, 3) || allUserMessage.d != null) {
                c.l(serialDescriptor, 3, i0.e.b.b3.a.b.c.e.a, allUserMessage.d);
            }
            if (c.v(serialDescriptor, 4) || allUserMessage.e != null) {
                c.l(serialDescriptor, 4, h.b, allUserMessage.e);
            }
            if (c.v(serialDescriptor, 5) || allUserMessage.f != null) {
                c.l(serialDescriptor, 5, g1.b, allUserMessage.f);
            }
            if (c.v(serialDescriptor, 6) || allUserMessage.g != null) {
                z = true;
            }
            if (z) {
                c.l(serialDescriptor, 6, h.b, allUserMessage.g);
            }
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    public AllUserMessage(int i, MessageType messageType, Integer num, UserInChannel userInChannel, HandraisePermission handraisePermission, Boolean bool, String str, Boolean bool2) {
        if (1 == (i & 1)) {
            this.a = messageType;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = num;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = userInChannel;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = handraisePermission;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = bool;
            }
            if ((i & 32) == 0) {
                this.f = null;
            } else {
                this.f = str;
            }
            if ((i & 64) == 0) {
                this.g = null;
            } else {
                this.g = bool2;
            }
        } else {
            a aVar = a.a;
            m0.r.t.a.r.m.a1.a.W3(i, 1, a.b);
            throw null;
        }
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
        if (!(obj instanceof AllUserMessage)) {
            return false;
        }
        AllUserMessage allUserMessage = (AllUserMessage) obj;
        return this.a == allUserMessage.a && i.a(this.b, allUserMessage.b) && i.a(this.c, allUserMessage.c) && this.d == allUserMessage.d && i.a(this.e, allUserMessage.e) && i.a(this.f, allUserMessage.f) && i.a(this.g, allUserMessage.g);
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
        UserInChannel userInChannel = this.c;
        int hashCode2 = (i3 + (userInChannel == null ? 0 : userInChannel.hashCode())) * 31;
        HandraisePermission handraisePermission = this.d;
        int hashCode3 = (hashCode2 + (handraisePermission == null ? 0 : handraisePermission.hashCode())) * 31;
        Boolean bool = this.e;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool2 = this.g;
        if (bool2 != null) {
            i2 = bool2.hashCode();
        }
        return hashCode5 + i2;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("AllUserMessage(action=");
        P0.append(this.a);
        P0.append(", userId=");
        P0.append(this.b);
        P0.append(", user=");
        P0.append(this.c);
        P0.append(", handraisePermission=");
        P0.append(this.d);
        P0.append(", isHandraiseEnabled=");
        P0.append(this.e);
        P0.append(", channel=");
        P0.append(this.f);
        P0.append(", isClipsEnabled=");
        P0.append(this.g);
        P0.append(')');
        return P0.toString();
    }
}
