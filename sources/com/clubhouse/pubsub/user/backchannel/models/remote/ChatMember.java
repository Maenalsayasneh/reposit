package com.clubhouse.pubsub.user.backchannel.models.remote;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.FrameMetricsAggregator;
import androidx.recyclerview.widget.RecyclerView;
import com.clubhouse.android.user.model.User;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
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
/* compiled from: ChatMember.kt */
public final class ChatMember implements User, i0.e.b.a3.e.a<Integer> {
    public static final Parcelable.Creator<ChatMember> CREATOR = new b();
    public static final Companion Companion = new Companion((f) null);
    public final String Y1;
    public final String Z1;
    public final String a2;
    public final ChatDestination b2;
    public final String c;
    public final Integer c2;
    public final int d;
    public final Boolean d2;
    public final Boolean e2;
    public final boolean q;
    public final Role x;
    public final int y;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/pubsub/user/backchannel/models/remote/ChatMember$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/pubsub/user/backchannel/models/remote/ChatMember;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "pubsub_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: ChatMember.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<ChatMember> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: ChatMember.kt */
    public static final class a implements v<ChatMember> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.pubsub.user.backchannel.models.remote.ChatMember", aVar, 12);
            pluginGeneratedSerialDescriptor.i("chat_id", false);
            pluginGeneratedSerialDescriptor.i("user_profile_id", false);
            pluginGeneratedSerialDescriptor.i("active", false);
            pluginGeneratedSerialDescriptor.i("role", false);
            pluginGeneratedSerialDescriptor.i("last_read_message_id", false);
            pluginGeneratedSerialDescriptor.i("name", false);
            pluginGeneratedSerialDescriptor.i("photo_url", false);
            pluginGeneratedSerialDescriptor.i("username", false);
            pluginGeneratedSerialDescriptor.i("chat_destination", false);
            pluginGeneratedSerialDescriptor.i("last_active_minutes", true);
            pluginGeneratedSerialDescriptor.i("follows_me", true);
            pluginGeneratedSerialDescriptor.i("archived", true);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            g1 g1Var = g1.b;
            e0 e0Var = e0.b;
            h hVar = h.b;
            return new KSerializer[]{g1Var, e0Var, hVar, i0.e.d.b.a.a.b.e.a, e0Var, m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(g1Var), i0.e.d.b.a.a.b.b.a, m0.r.t.a.r.m.a1.a.R1(e0Var), m0.r.t.a.r.m.a1.a.R1(hVar), m0.r.t.a.r.m.a1.a.R1(hVar)};
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x00dc, code lost:
            r7 = r21;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0115, code lost:
            r21 = r7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0117, code lost:
            r7 = 7;
            r8 = 9;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder r28) {
            /*
                r27 = this;
                r0 = r28
                java.lang.String r1 = "decoder"
                m0.n.b.i.e(r0, r1)
                kotlinx.serialization.descriptors.SerialDescriptor r1 = b
                n0.c.j.c r0 = r0.c(r1)
                boolean r2 = r0.y()
                r3 = 0
                r4 = 3
                r5 = 5
                r6 = 6
                r7 = 7
                r8 = 9
                r9 = 10
                r10 = 11
                r11 = 0
                r12 = 1
                r13 = 2
                r14 = 4
                r15 = 8
                if (r2 == 0) goto L_0x006a
                java.lang.String r2 = r0.t(r1, r11)
                int r11 = r0.k(r1, r12)
                boolean r12 = r0.s(r1, r13)
                i0.e.d.b.a.a.b.e r13 = i0.e.d.b.a.a.b.e.a
                java.lang.Object r4 = r0.m(r1, r4, r13, r3)
                int r13 = r0.k(r1, r14)
                n0.c.k.g1 r14 = n0.c.k.g1.b
                java.lang.Object r5 = r0.v(r1, r5, r14, r3)
                java.lang.Object r6 = r0.v(r1, r6, r14, r3)
                java.lang.Object r7 = r0.v(r1, r7, r14, r3)
                i0.e.d.b.a.a.b.b r14 = i0.e.d.b.a.a.b.b.a
                java.lang.Object r14 = r0.m(r1, r15, r14, r3)
                n0.c.k.e0 r15 = n0.c.k.e0.b
                java.lang.Object r8 = r0.v(r1, r8, r15, r3)
                n0.c.k.h r15 = n0.c.k.h.b
                java.lang.Object r9 = r0.v(r1, r9, r15, r3)
                java.lang.Object r3 = r0.v(r1, r10, r15, r3)
                r10 = 4095(0xfff, float:5.738E-42)
                r22 = r11
                r11 = r12
                r26 = r9
                r9 = r2
                r2 = r26
                goto L_0x012e
            L_0x006a:
                r2 = r3
                r4 = r2
                r13 = r4
                r14 = r13
                r18 = r14
                r21 = r18
                r5 = r11
                r22 = r5
                r23 = r22
                r24 = r23
                r25 = r12
                r11 = r21
                r12 = r11
            L_0x007e:
                if (r25 == 0) goto L_0x011d
                int r6 = r0.x(r1)
                switch(r6) {
                    case -1: goto L_0x010f;
                    case 0: goto L_0x0104;
                    case 1: goto L_0x00f9;
                    case 2: goto L_0x00ee;
                    case 3: goto L_0x00e1;
                    case 4: goto L_0x00d4;
                    case 5: goto L_0x00c9;
                    case 6: goto L_0x00bf;
                    case 7: goto L_0x00b6;
                    case 8: goto L_0x00ad;
                    case 9: goto L_0x00a3;
                    case 10: goto L_0x0097;
                    case 11: goto L_0x008d;
                    default: goto L_0x0087;
                }
            L_0x0087:
                kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
                r0.<init>(r6)
                throw r0
            L_0x008d:
                n0.c.k.h r6 = n0.c.k.h.b
                java.lang.Object r6 = r0.v(r1, r10, r6, r11)
                r5 = r5 | 2048(0x800, float:2.87E-42)
                r11 = r6
                goto L_0x009f
            L_0x0097:
                n0.c.k.h r6 = n0.c.k.h.b
                java.lang.Object r3 = r0.v(r1, r9, r6, r3)
                r5 = r5 | 1024(0x400, float:1.435E-42)
            L_0x009f:
                r6 = 2
            L_0x00a0:
                r8 = 0
                goto L_0x0117
            L_0x00a3:
                n0.c.k.e0 r6 = n0.c.k.e0.b
                java.lang.Object r2 = r0.v(r1, r8, r6, r2)
                r5 = r5 | 512(0x200, float:7.175E-43)
                r6 = 6
                goto L_0x007e
            L_0x00ad:
                i0.e.d.b.a.a.b.b r6 = i0.e.d.b.a.a.b.b.a
                java.lang.Object r13 = r0.m(r1, r15, r6, r13)
                r5 = r5 | 256(0x100, float:3.59E-43)
                goto L_0x00dc
            L_0x00b6:
                n0.c.k.g1 r6 = n0.c.k.g1.b
                java.lang.Object r12 = r0.v(r1, r7, r6, r12)
                r5 = r5 | 128(0x80, float:1.794E-43)
                goto L_0x00dc
            L_0x00bf:
                n0.c.k.g1 r6 = n0.c.k.g1.b
                r7 = 6
                java.lang.Object r4 = r0.v(r1, r7, r6, r4)
                r5 = r5 | 64
                goto L_0x00dc
            L_0x00c9:
                r7 = 6
                n0.c.k.g1 r6 = n0.c.k.g1.b
                r7 = 5
                java.lang.Object r14 = r0.v(r1, r7, r6, r14)
                r5 = r5 | 32
                goto L_0x00dc
            L_0x00d4:
                r6 = 4
                r7 = 5
                int r24 = r0.k(r1, r6)
                r5 = r5 | 16
            L_0x00dc:
                r7 = r21
                r6 = 2
                r8 = 0
                goto L_0x0115
            L_0x00e1:
                r7 = 5
                i0.e.d.b.a.a.b.e r6 = i0.e.d.b.a.a.b.e.a
                r7 = r21
                r8 = 3
                java.lang.Object r21 = r0.m(r1, r8, r6, r7)
                r5 = r5 | 8
                goto L_0x009f
            L_0x00ee:
                r7 = r21
                r6 = 2
                r8 = 3
                boolean r23 = r0.s(r1, r6)
                r5 = r5 | 4
                goto L_0x00a0
            L_0x00f9:
                r7 = r21
                r6 = 2
                r8 = 1
                int r22 = r0.k(r1, r8)
                r5 = r5 | 2
                goto L_0x00a0
            L_0x0104:
                r7 = r21
                r6 = 2
                r8 = 0
                java.lang.String r18 = r0.t(r1, r8)
                r5 = r5 | 1
                goto L_0x0117
            L_0x010f:
                r7 = r21
                r6 = 2
                r8 = 0
                r25 = r8
            L_0x0115:
                r21 = r7
            L_0x0117:
                r6 = 6
                r7 = 7
                r8 = 9
                goto L_0x007e
            L_0x011d:
                r7 = r21
                r8 = r2
                r2 = r3
                r6 = r4
                r10 = r5
                r4 = r7
                r3 = r11
                r7 = r12
                r5 = r14
                r9 = r18
                r11 = r23
                r14 = r13
                r13 = r24
            L_0x012e:
                r0.b(r1)
                com.clubhouse.pubsub.user.backchannel.models.remote.ChatMember r0 = new com.clubhouse.pubsub.user.backchannel.models.remote.ChatMember
                r12 = r4
                com.clubhouse.pubsub.user.backchannel.models.remote.Role r12 = (com.clubhouse.pubsub.user.backchannel.models.remote.Role) r12
                r1 = r5
                java.lang.String r1 = (java.lang.String) r1
                r15 = r6
                java.lang.String r15 = (java.lang.String) r15
                r16 = r7
                java.lang.String r16 = (java.lang.String) r16
                r17 = r14
                com.clubhouse.pubsub.user.backchannel.models.remote.ChatDestination r17 = (com.clubhouse.pubsub.user.backchannel.models.remote.ChatDestination) r17
                r18 = r8
                java.lang.Integer r18 = (java.lang.Integer) r18
                r19 = r2
                java.lang.Boolean r19 = (java.lang.Boolean) r19
                r20 = r3
                java.lang.Boolean r20 = (java.lang.Boolean) r20
                r7 = r0
                r8 = r10
                r10 = r22
                r14 = r1
                r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.pubsub.user.backchannel.models.remote.ChatMember.a.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            ChatMember chatMember = (ChatMember) obj;
            i.e(encoder, "encoder");
            i.e(chatMember, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(chatMember, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            boolean z = false;
            c.s(serialDescriptor, 0, chatMember.c);
            c.q(serialDescriptor, 1, chatMember.getId().intValue());
            c.r(serialDescriptor, 2, chatMember.q);
            c.z(serialDescriptor, 3, i0.e.d.b.a.a.b.e.a, chatMember.x);
            c.q(serialDescriptor, 4, chatMember.y);
            g1 g1Var = g1.b;
            c.l(serialDescriptor, 5, g1Var, chatMember.Y1);
            c.l(serialDescriptor, 6, g1Var, chatMember.Z1);
            c.l(serialDescriptor, 7, g1Var, chatMember.a2);
            c.z(serialDescriptor, 8, i0.e.d.b.a.a.b.b.a, chatMember.b2);
            if (c.v(serialDescriptor, 9) || chatMember.c2 != null) {
                c.l(serialDescriptor, 9, e0.b, chatMember.c2);
            }
            if (c.v(serialDescriptor, 10) || chatMember.d2 != null) {
                c.l(serialDescriptor, 10, h.b, chatMember.d2);
            }
            if (c.v(serialDescriptor, 11) || chatMember.e2 != null) {
                z = true;
            }
            if (z) {
                c.l(serialDescriptor, 11, h.b, chatMember.e2);
            }
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    /* compiled from: ChatMember.kt */
    public static final class b implements Parcelable.Creator<ChatMember> {
        public Object createFromParcel(Parcel parcel) {
            Boolean bool;
            i.e(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            boolean z = true;
            boolean z2 = parcel.readInt() != 0;
            Role valueOf = Role.valueOf(parcel.readString());
            int readInt2 = parcel.readInt();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            ChatDestination valueOf2 = ChatDestination.valueOf(parcel.readString());
            Boolean bool2 = null;
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                bool = null;
            } else {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                if (parcel.readInt() == 0) {
                    z = false;
                }
                bool2 = Boolean.valueOf(z);
            }
            return new ChatMember(readString, readInt, z2, valueOf, readInt2, readString2, readString3, readString4, valueOf2, valueOf3, bool, bool2);
        }

        public Object[] newArray(int i) {
            return new ChatMember[i];
        }
    }

    public ChatMember(int i, String str, int i2, boolean z, Role role, int i3, String str2, String str3, String str4, ChatDestination chatDestination, Integer num, Boolean bool, Boolean bool2) {
        int i4 = i;
        if (511 == (i4 & FrameMetricsAggregator.EVERY_DURATION)) {
            this.c = str;
            this.d = i2;
            this.q = z;
            this.x = role;
            this.y = i3;
            this.Y1 = str2;
            this.Z1 = str3;
            this.a2 = str4;
            this.b2 = chatDestination;
            if ((i4 & 512) == 0) {
                this.c2 = null;
            } else {
                this.c2 = num;
            }
            if ((i4 & RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE) == 0) {
                this.d2 = null;
            } else {
                this.d2 = bool;
            }
            if ((i4 & 2048) == 0) {
                this.e2 = null;
            } else {
                this.e2 = bool2;
            }
        } else {
            a aVar = a.a;
            m0.r.t.a.r.m.a1.a.W3(i, FrameMetricsAggregator.EVERY_DURATION, a.b);
            throw null;
        }
    }

    public static ChatMember a(ChatMember chatMember, String str, int i, boolean z, Role role, int i2, String str2, String str3, String str4, ChatDestination chatDestination, Integer num, Boolean bool, Boolean bool2, int i3) {
        ChatMember chatMember2 = chatMember;
        int i4 = i3;
        Boolean bool3 = null;
        String str5 = (i4 & 1) != 0 ? chatMember2.c : null;
        int intValue = (i4 & 2) != 0 ? chatMember.getId().intValue() : i;
        boolean z2 = (i4 & 4) != 0 ? chatMember2.q : z;
        Role role2 = (i4 & 8) != 0 ? chatMember2.x : null;
        int i5 = (i4 & 16) != 0 ? chatMember2.y : i2;
        String str6 = (i4 & 32) != 0 ? chatMember2.Y1 : null;
        String str7 = (i4 & 64) != 0 ? chatMember2.Z1 : null;
        String str8 = (i4 & 128) != 0 ? chatMember2.a2 : null;
        ChatDestination chatDestination2 = (i4 & 256) != 0 ? chatMember2.b2 : chatDestination;
        Integer num2 = (i4 & 512) != 0 ? chatMember2.c2 : num;
        if ((i4 & RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE) != 0) {
            bool3 = chatMember2.d2;
        }
        Boolean bool4 = (i4 & 2048) != 0 ? chatMember2.e2 : bool2;
        i.e(str5, "chatId");
        i.e(role2, "role");
        i.e(chatDestination2, "chatDestination");
        return new ChatMember(str5, intValue, z2, role2, i5, str6, str7, str8, chatDestination2, num2, bool3, bool4);
    }

    public String C() {
        return this.a2;
    }

    public String F() {
        return h0.b0.v.f0(this);
    }

    public String I() {
        return h0.b0.v.O0(this);
    }

    public String b() {
        return this.Z1;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatMember)) {
            return false;
        }
        ChatMember chatMember = (ChatMember) obj;
        return i.a(this.c, chatMember.c) && getId().intValue() == chatMember.getId().intValue() && this.q == chatMember.q && this.x == chatMember.x && this.y == chatMember.y && i.a(this.Y1, chatMember.Y1) && i.a(this.Z1, chatMember.Z1) && i.a(this.a2, chatMember.a2) && this.b2 == chatMember.b2 && i.a(this.c2, chatMember.c2) && i.a(this.d2, chatMember.d2) && i.a(this.e2, chatMember.e2);
    }

    public String getName() {
        return this.Y1;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int hashCode = (getId().hashCode() + (this.c.hashCode() * 31)) * 31;
        boolean z = this.q;
        if (z) {
            z = true;
        }
        int M = i0.d.a.a.a.M(this.y, (this.x.hashCode() + ((hashCode + (z ? 1 : 0)) * 31)) * 31, 31);
        String str = this.Y1;
        int i4 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i5 = (M + i) * 31;
        String str2 = this.Z1;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i6 = (i5 + i2) * 31;
        String str3 = this.a2;
        if (str3 == null) {
            i3 = 0;
        } else {
            i3 = str3.hashCode();
        }
        int hashCode2 = (this.b2.hashCode() + ((i6 + i3) * 31)) * 31;
        Integer num = this.c2;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.d2;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.e2;
        if (bool2 != null) {
            i4 = bool2.hashCode();
        }
        return hashCode4 + i4;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ChatMember(chatId=");
        P0.append(this.c);
        P0.append(", id=");
        P0.append(getId().intValue());
        P0.append(", active=");
        P0.append(this.q);
        P0.append(", role=");
        P0.append(this.x);
        P0.append(", lastReadMessageId=");
        P0.append(this.y);
        P0.append(", name=");
        P0.append(this.Y1);
        P0.append(", photoUrl=");
        P0.append(this.Z1);
        P0.append(", username=");
        P0.append(this.a2);
        P0.append(", chatDestination=");
        P0.append(this.b2);
        P0.append(", lastActiveMinutes=");
        P0.append(this.c2);
        P0.append(", followsMe=");
        P0.append(this.d2);
        P0.append(", archived=");
        P0.append(this.e2);
        P0.append(')');
        return P0.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.q ? 1 : 0);
        parcel.writeString(this.x.name());
        parcel.writeInt(this.y);
        parcel.writeString(this.Y1);
        parcel.writeString(this.Z1);
        parcel.writeString(this.a2);
        parcel.writeString(this.b2.name());
        Integer num = this.c2;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            i0.d.a.a.a.i(parcel, 1, num);
        }
        Boolean bool = this.d2;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.e2;
        if (bool2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(bool2.booleanValue() ? 1 : 0);
    }

    public Integer getId() {
        return Integer.valueOf(this.d);
    }

    public ChatMember(String str, int i, boolean z, Role role, int i2, String str2, String str3, String str4, ChatDestination chatDestination, Integer num, Boolean bool, Boolean bool2) {
        i.e(str, "chatId");
        i.e(role, "role");
        i.e(chatDestination, "chatDestination");
        this.c = str;
        this.d = i;
        this.q = z;
        this.x = role;
        this.y = i2;
        this.Y1 = str2;
        this.Z1 = str3;
        this.a2 = str4;
        this.b2 = chatDestination;
        this.c2 = num;
        this.d2 = bool;
        this.e2 = bool2;
    }
}
