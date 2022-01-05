package com.clubhouse.pubsub.user.backchannel.models.remote;

import com.clubhouse.pubsub.user.backchannel.models.remote.ChatMember;
import com.clubhouse.pubsub.user.backchannel.models.remote.ChatMessage;
import i0.e.d.b.a.a.b.c;
import i0.j.f.p.h;
import j$.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: Chat.kt */
public final class Chat implements i0.e.b.a3.e.a<String> {
    public static final Companion Companion = new Companion((f) null);
    public final ChatMessage Y1;
    public final List<ChatMember> Z1;
    public final List<Integer> a2;
    public final String c;
    public final ChatType d;
    public final Integer q;
    public final OffsetDateTime x;
    public final OffsetDateTime y;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/pubsub/user/backchannel/models/remote/Chat$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/pubsub/user/backchannel/models/remote/Chat;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "pubsub_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: Chat.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<Chat> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: Chat.kt */
    public static final class a implements v<Chat> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.pubsub.user.backchannel.models.remote.Chat", aVar, 8);
            pluginGeneratedSerialDescriptor.i("chat_id", false);
            pluginGeneratedSerialDescriptor.i("chat_type", false);
            pluginGeneratedSerialDescriptor.i("creator_user_profile_id", false);
            pluginGeneratedSerialDescriptor.i("time_created", false);
            pluginGeneratedSerialDescriptor.i("time_updated", false);
            pluginGeneratedSerialDescriptor.i("last_message", false);
            pluginGeneratedSerialDescriptor.i("members", false);
            pluginGeneratedSerialDescriptor.i("memberIds", true);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            e0 e0Var = e0.b;
            return new KSerializer[]{g1.b, c.a, m0.r.t.a.r.m.a1.a.R1(e0Var), new n0.c.a(m.a(OffsetDateTime.class), (KSerializer) null, new KSerializer[0]), new n0.c.a(m.a(OffsetDateTime.class), (KSerializer) null, new KSerializer[0]), m0.r.t.a.r.m.a1.a.R1(ChatMessage.a.a), new n0.c.k.e(ChatMember.a.a), new n0.c.k.e(e0Var)};
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x00b0, code lost:
            r10 = r5;
            r11 = r17;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x00f2, code lost:
            r3 = r16;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0111, code lost:
            r10 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0112, code lost:
            r17 = r11;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x011c, code lost:
            r16 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x011e, code lost:
            r3 = 5;
            r6 = 6;
            r11 = 4;
         */
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
                r4 = 0
                r5 = 3
                r6 = 6
                r7 = 7
                r8 = 0
                r9 = 1
                r10 = 2
                r11 = 4
                if (r2 == 0) goto L_0x006f
                java.lang.String r2 = r0.t(r1, r4)
                i0.e.d.b.a.a.b.c r12 = i0.e.d.b.a.a.b.c.a
                java.lang.Object r9 = r0.m(r1, r9, r12, r8)
                n0.c.k.e0 r12 = n0.c.k.e0.b
                java.lang.Object r10 = r0.v(r1, r10, r12, r8)
                n0.c.a r13 = new n0.c.a
                java.lang.Class<j$.time.OffsetDateTime> r14 = j$.time.OffsetDateTime.class
                m0.r.d r14 = m0.n.b.m.a(r14)
                kotlinx.serialization.KSerializer[] r15 = new kotlinx.serialization.KSerializer[r4]
                r13.<init>(r14, r8, r15)
                java.lang.Object r5 = r0.m(r1, r5, r13, r8)
                n0.c.a r13 = new n0.c.a
                java.lang.Class<j$.time.OffsetDateTime> r14 = j$.time.OffsetDateTime.class
                m0.r.d r14 = m0.n.b.m.a(r14)
                kotlinx.serialization.KSerializer[] r4 = new kotlinx.serialization.KSerializer[r4]
                r13.<init>(r14, r8, r4)
                java.lang.Object r4 = r0.m(r1, r11, r13, r8)
                com.clubhouse.pubsub.user.backchannel.models.remote.ChatMessage$a r11 = com.clubhouse.pubsub.user.backchannel.models.remote.ChatMessage.a.a
                java.lang.Object r3 = r0.v(r1, r3, r11, r8)
                n0.c.k.e r11 = new n0.c.k.e
                com.clubhouse.pubsub.user.backchannel.models.remote.ChatMember$a r13 = com.clubhouse.pubsub.user.backchannel.models.remote.ChatMember.a.a
                r11.<init>(r13)
                java.lang.Object r6 = r0.m(r1, r6, r11, r8)
                n0.c.k.e r11 = new n0.c.k.e
                r11.<init>(r12)
                java.lang.Object r7 = r0.m(r1, r7, r11, r8)
                r8 = 255(0xff, float:3.57E-43)
                r11 = r10
                r10 = r8
                r8 = r2
                goto L_0x012f
            L_0x006f:
                r10 = r4
                r2 = r8
                r12 = r2
                r13 = r12
                r14 = r13
                r15 = r14
                r16 = r15
                r17 = r16
                r18 = r9
                r9 = r17
            L_0x007d:
                if (r18 == 0) goto L_0x0124
                int r5 = r0.x(r1)
                switch(r5) {
                    case -1: goto L_0x0115;
                    case 0: goto L_0x0105;
                    case 1: goto L_0x00f6;
                    case 2: goto L_0x00e5;
                    case 3: goto L_0x00cd;
                    case 4: goto L_0x00b5;
                    case 5: goto L_0x00a8;
                    case 6: goto L_0x009a;
                    case 7: goto L_0x008c;
                    default: goto L_0x0086;
                }
            L_0x0086:
                kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
                r0.<init>(r5)
                throw r0
            L_0x008c:
                n0.c.k.e r5 = new n0.c.k.e
                n0.c.k.e0 r11 = n0.c.k.e0.b
                r5.<init>(r11)
                java.lang.Object r9 = r0.m(r1, r7, r5, r9)
                r5 = r10 | 128(0x80, float:1.794E-43)
                goto L_0x00b0
            L_0x009a:
                n0.c.k.e r5 = new n0.c.k.e
                com.clubhouse.pubsub.user.backchannel.models.remote.ChatMember$a r11 = com.clubhouse.pubsub.user.backchannel.models.remote.ChatMember.a.a
                r5.<init>(r11)
                java.lang.Object r15 = r0.m(r1, r6, r5, r15)
                r5 = r10 | 64
                goto L_0x00b0
            L_0x00a8:
                com.clubhouse.pubsub.user.backchannel.models.remote.ChatMessage$a r5 = com.clubhouse.pubsub.user.backchannel.models.remote.ChatMessage.a.a
                java.lang.Object r12 = r0.v(r1, r3, r5, r12)
                r5 = r10 | 32
            L_0x00b0:
                r10 = r5
                r11 = r17
                r6 = 1
                goto L_0x0112
            L_0x00b5:
                n0.c.a r5 = new n0.c.a
                java.lang.Class<j$.time.OffsetDateTime> r11 = j$.time.OffsetDateTime.class
                m0.r.d r11 = m0.n.b.m.a(r11)
                kotlinx.serialization.KSerializer[] r3 = new kotlinx.serialization.KSerializer[r4]
                r5.<init>(r11, r8, r3)
                r3 = 4
                java.lang.Object r13 = r0.m(r1, r3, r5, r13)
                r10 = r10 | 16
                r11 = r3
                r3 = 5
                r5 = 3
                goto L_0x007d
            L_0x00cd:
                r3 = r11
                n0.c.a r5 = new n0.c.a
                java.lang.Class<j$.time.OffsetDateTime> r11 = j$.time.OffsetDateTime.class
                m0.r.d r11 = m0.n.b.m.a(r11)
                kotlinx.serialization.KSerializer[] r3 = new kotlinx.serialization.KSerializer[r4]
                r5.<init>(r11, r8, r3)
                r3 = 3
                java.lang.Object r14 = r0.m(r1, r3, r5, r14)
                r5 = r10 | 8
                r10 = r5
                r3 = 2
                goto L_0x00f2
            L_0x00e5:
                r3 = 3
                n0.c.k.e0 r5 = n0.c.k.e0.b
                r11 = r17
                r3 = 2
                java.lang.Object r17 = r0.v(r1, r3, r5, r11)
                r5 = r10 | 4
                r10 = r5
            L_0x00f2:
                r3 = r16
                r6 = 1
                goto L_0x011c
            L_0x00f6:
                r11 = r17
                r3 = 2
                i0.e.d.b.a.a.b.c r5 = i0.e.d.b.a.a.b.c.a
                r3 = r16
                r6 = 1
                java.lang.Object r16 = r0.m(r1, r6, r5, r3)
                r3 = r10 | 2
                goto L_0x0111
            L_0x0105:
                r3 = r16
                r11 = r17
                r6 = 1
                java.lang.String r2 = r0.t(r1, r4)
                r5 = r10 | 1
                r3 = r5
            L_0x0111:
                r10 = r3
            L_0x0112:
                r17 = r11
                goto L_0x011e
            L_0x0115:
                r3 = r16
                r11 = r17
                r6 = 1
                r18 = r4
            L_0x011c:
                r16 = r3
            L_0x011e:
                r3 = 5
                r5 = 3
                r6 = 6
                r11 = 4
                goto L_0x007d
            L_0x0124:
                r3 = r16
                r11 = r17
                r8 = r2
                r7 = r9
                r4 = r13
                r5 = r14
                r6 = r15
                r9 = r3
                r3 = r12
            L_0x012f:
                r0.b(r1)
                com.clubhouse.pubsub.user.backchannel.models.remote.Chat r0 = new com.clubhouse.pubsub.user.backchannel.models.remote.Chat
                com.clubhouse.pubsub.user.backchannel.models.remote.ChatType r9 = (com.clubhouse.pubsub.user.backchannel.models.remote.ChatType) r9
                r1 = r11
                java.lang.Integer r1 = (java.lang.Integer) r1
                r11 = r5
                j$.time.OffsetDateTime r11 = (j$.time.OffsetDateTime) r11
                r12 = r4
                j$.time.OffsetDateTime r12 = (j$.time.OffsetDateTime) r12
                r13 = r3
                com.clubhouse.pubsub.user.backchannel.models.remote.ChatMessage r13 = (com.clubhouse.pubsub.user.backchannel.models.remote.ChatMessage) r13
                r14 = r6
                java.util.List r14 = (java.util.List) r14
                r15 = r7
                java.util.List r15 = (java.util.List) r15
                r6 = r0
                r7 = r10
                r10 = r1
                r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.pubsub.user.backchannel.models.remote.Chat.a.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x00ae, code lost:
            if (m0.n.b.i.a(r3, r6) == false) goto L_0x00b0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void serialize(kotlinx.serialization.encoding.Encoder r9, java.lang.Object r10) {
            /*
                r8 = this;
                com.clubhouse.pubsub.user.backchannel.models.remote.Chat r10 = (com.clubhouse.pubsub.user.backchannel.models.remote.Chat) r10
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
                java.lang.String r1 = r10.c
                r2 = 0
                r9.s(r0, r2, r1)
                i0.e.d.b.a.a.b.c r1 = i0.e.d.b.a.a.b.c.a
                com.clubhouse.pubsub.user.backchannel.models.remote.ChatType r3 = r10.d
                r4 = 1
                r9.z(r0, r4, r1, r3)
                r1 = 2
                n0.c.k.e0 r3 = n0.c.k.e0.b
                java.lang.Integer r5 = r10.q
                r9.l(r0, r1, r3, r5)
                r1 = 3
                n0.c.a r3 = new n0.c.a
                java.lang.Class<j$.time.OffsetDateTime> r5 = j$.time.OffsetDateTime.class
                m0.r.d r5 = m0.n.b.m.a(r5)
                kotlinx.serialization.KSerializer[] r6 = new kotlinx.serialization.KSerializer[r2]
                r7 = 0
                r3.<init>(r5, r7, r6)
                j$.time.OffsetDateTime r5 = r10.x
                r9.z(r0, r1, r3, r5)
                r1 = 4
                n0.c.a r3 = new n0.c.a
                java.lang.Class<j$.time.OffsetDateTime> r5 = j$.time.OffsetDateTime.class
                m0.r.d r5 = m0.n.b.m.a(r5)
                kotlinx.serialization.KSerializer[] r6 = new kotlinx.serialization.KSerializer[r2]
                r3.<init>(r5, r7, r6)
                j$.time.OffsetDateTime r5 = r10.y
                r9.z(r0, r1, r3, r5)
                r1 = 5
                com.clubhouse.pubsub.user.backchannel.models.remote.ChatMessage$a r3 = com.clubhouse.pubsub.user.backchannel.models.remote.ChatMessage.a.a
                com.clubhouse.pubsub.user.backchannel.models.remote.ChatMessage r5 = r10.Y1
                r9.l(r0, r1, r3, r5)
                r1 = 6
                n0.c.k.e r3 = new n0.c.k.e
                com.clubhouse.pubsub.user.backchannel.models.remote.ChatMember$a r5 = com.clubhouse.pubsub.user.backchannel.models.remote.ChatMember.a.a
                r3.<init>(r5)
                java.util.List<com.clubhouse.pubsub.user.backchannel.models.remote.ChatMember> r5 = r10.Z1
                r9.z(r0, r1, r3, r5)
                r1 = 7
                boolean r3 = r9.v(r0, r1)
                if (r3 == 0) goto L_0x007b
                goto L_0x00b0
            L_0x007b:
                java.util.List<java.lang.Integer> r3 = r10.a2
                java.util.List<com.clubhouse.pubsub.user.backchannel.models.remote.ChatMember> r5 = r10.Z1
                java.util.ArrayList r6 = new java.util.ArrayList
                r7 = 10
                int r7 = i0.j.f.p.h.K(r5, r7)
                r6.<init>(r7)
                java.util.Iterator r5 = r5.iterator()
            L_0x008e:
                boolean r7 = r5.hasNext()
                if (r7 == 0) goto L_0x00aa
                java.lang.Object r7 = r5.next()
                com.clubhouse.pubsub.user.backchannel.models.remote.ChatMember r7 = (com.clubhouse.pubsub.user.backchannel.models.remote.ChatMember) r7
                java.lang.Integer r7 = r7.getId()
                int r7 = r7.intValue()
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                r6.add(r7)
                goto L_0x008e
            L_0x00aa:
                boolean r3 = m0.n.b.i.a(r3, r6)
                if (r3 != 0) goto L_0x00b1
            L_0x00b0:
                r2 = r4
            L_0x00b1:
                if (r2 == 0) goto L_0x00bf
                n0.c.k.e r2 = new n0.c.k.e
                n0.c.k.e0 r3 = n0.c.k.e0.b
                r2.<init>(r3)
                java.util.List<java.lang.Integer> r10 = r10.a2
                r9.z(r0, r1, r2, r10)
            L_0x00bf:
                r9.b(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.pubsub.user.backchannel.models.remote.Chat.a.serialize(kotlinx.serialization.encoding.Encoder, java.lang.Object):void");
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    public Chat(int i, String str, ChatType chatType, Integer num, OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2, ChatMessage chatMessage, List list, List list2) {
        if (127 == (i & 127)) {
            this.c = str;
            this.d = chatType;
            this.q = num;
            this.x = offsetDateTime;
            this.y = offsetDateTime2;
            this.Y1 = chatMessage;
            this.Z1 = list;
            if ((i & 128) == 0) {
                ArrayList arrayList = new ArrayList(h.K(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((ChatMember) it.next()).getId().intValue()));
                }
                this.a2 = arrayList;
                return;
            }
            this.a2 = list2;
            return;
        }
        a aVar = a.a;
        m0.r.t.a.r.m.a1.a.W3(i, 127, a.b);
        throw null;
    }

    public static Chat a(Chat chat, String str, ChatType chatType, Integer num, OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2, ChatMessage chatMessage, List list, int i) {
        Chat chat2 = chat;
        OffsetDateTime offsetDateTime3 = null;
        String str2 = (i & 1) != 0 ? chat2.c : null;
        ChatType chatType2 = (i & 2) != 0 ? chat2.d : null;
        Integer num2 = (i & 4) != 0 ? chat2.q : null;
        if ((i & 8) != 0) {
            offsetDateTime3 = chat2.x;
        }
        OffsetDateTime offsetDateTime4 = (i & 16) != 0 ? chat2.y : offsetDateTime2;
        ChatMessage chatMessage2 = (i & 32) != 0 ? chat2.Y1 : chatMessage;
        List list2 = (i & 64) != 0 ? chat2.Z1 : list;
        i.e(str2, "id");
        i.e(chatType2, "chatType");
        i.e(offsetDateTime3, "timeCreated");
        i.e(offsetDateTime4, "timeUpdated");
        i.e(list2, "members");
        return new Chat(str2, chatType2, num2, offsetDateTime3, offsetDateTime4, chatMessage2, list2);
    }

    public final Chat c(int i, boolean z) {
        List<ChatMember> list = this.Z1;
        ArrayList arrayList = new ArrayList(h.K(list, 10));
        for (ChatMember chatMember : list) {
            if (chatMember.getId().intValue() == i) {
                chatMember = ChatMember.a(chatMember, (String) null, 0, false, (Role) null, 0, (String) null, (String) null, (String) null, (ChatDestination) null, (Integer) null, (Boolean) null, Boolean.valueOf(z), 2047);
            }
            arrayList.add(chatMember);
        }
        return a(this, (String) null, (ChatType) null, (Integer) null, (OffsetDateTime) null, (OffsetDateTime) null, (ChatMessage) null, arrayList, 63);
    }

    public final Chat d(int i, int i2) {
        List<ChatMember> list = this.Z1;
        ArrayList arrayList = new ArrayList(h.K(list, 10));
        for (ChatMember chatMember : list) {
            if (chatMember.getId().intValue() == i) {
                chatMember = ChatMember.a(chatMember, (String) null, 0, false, (Role) null, Math.max(i2, chatMember.y), (String) null, (String) null, (String) null, (ChatDestination) null, (Integer) null, (Boolean) null, (Boolean) null, 4079);
            } else {
                int i3 = i2;
            }
            arrayList.add(chatMember);
        }
        return a(this, (String) null, (ChatType) null, (Integer) null, (OffsetDateTime) null, (OffsetDateTime) null, (ChatMessage) null, arrayList, 63);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Chat)) {
            return false;
        }
        Chat chat = (Chat) obj;
        return i.a(this.c, chat.c) && this.d == chat.d && i.a(this.q, chat.q) && i.a(this.x, chat.x) && i.a(this.y, chat.y) && i.a(this.Y1, chat.Y1) && i.a(this.Z1, chat.Z1);
    }

    public Object getId() {
        return this.c;
    }

    public int hashCode() {
        int hashCode = (this.d.hashCode() + (this.c.hashCode() * 31)) * 31;
        Integer num = this.q;
        int i = 0;
        int hashCode2 = num == null ? 0 : num.hashCode();
        int hashCode3 = (this.y.hashCode() + ((this.x.hashCode() + ((hashCode + hashCode2) * 31)) * 31)) * 31;
        ChatMessage chatMessage = this.Y1;
        if (chatMessage != null) {
            i = chatMessage.hashCode();
        }
        return this.Z1.hashCode() + ((hashCode3 + i) * 31);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("Chat(id=");
        P0.append(this.c);
        P0.append(", chatType=");
        P0.append(this.d);
        P0.append(", creatorUserId=");
        P0.append(this.q);
        P0.append(", timeCreated=");
        P0.append(this.x);
        P0.append(", timeUpdated=");
        P0.append(this.y);
        P0.append(", lastMessage=");
        P0.append(this.Y1);
        P0.append(", members=");
        return i0.d.a.a.a.A0(P0, this.Z1, ')');
    }

    public Chat(String str, ChatType chatType, Integer num, OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2, ChatMessage chatMessage, List<ChatMember> list) {
        i.e(str, "id");
        i.e(chatType, "chatType");
        i.e(offsetDateTime, "timeCreated");
        i.e(offsetDateTime2, "timeUpdated");
        i.e(list, "members");
        this.c = str;
        this.d = chatType;
        this.q = num;
        this.x = offsetDateTime;
        this.y = offsetDateTime2;
        this.Y1 = chatMessage;
        this.Z1 = list;
        ArrayList arrayList = new ArrayList(h.K(list, 10));
        for (ChatMember id : list) {
            arrayList.add(Integer.valueOf(id.getId().intValue()));
        }
        this.a2 = arrayList;
    }
}
