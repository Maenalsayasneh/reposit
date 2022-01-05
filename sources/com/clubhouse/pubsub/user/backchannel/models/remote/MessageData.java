package com.clubhouse.pubsub.user.backchannel.models.remote;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.e.d.b.a.a.b.d;
import i0.j.f.p.h;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import m0.n.b.f;
import m0.n.b.i;
import n0.c.e;
import n0.c.j.c;
import n0.c.k.e0;
import n0.c.k.g1;
import n0.c.k.v;
import n0.c.k.v0;

@e(with = d.class)
/* compiled from: MessageData.kt */
public abstract class MessageData {
    public static final Companion Companion = new Companion((f) null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/pubsub/user/backchannel/models/remote/MessageData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/pubsub/user/backchannel/models/remote/MessageData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "pubsub_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: MessageData.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<MessageData> serializer() {
            return d.c;
        }

        public Companion(f fVar) {
        }
    }

    @e
    /* compiled from: MessageData.kt */
    public static final class MemberAdded extends MessageData {
        public static final Companion Companion = new Companion((f) null);
        public final int a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/pubsub/user/backchannel/models/remote/MessageData$MemberAdded$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/pubsub/user/backchannel/models/remote/MessageData$MemberAdded;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "pubsub_release"}, k = 1, mv = {1, 5, 1})
        /* compiled from: MessageData.kt */
        public static final class Companion {
            public Companion() {
            }

            public final KSerializer<MemberAdded> serializer() {
                return a.a;
            }

            public Companion(f fVar) {
            }
        }

        /* compiled from: MessageData.kt */
        public static final class a implements v<MemberAdded> {
            public static final a a;
            public static final /* synthetic */ SerialDescriptor b;

            static {
                a aVar = new a();
                a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.pubsub.user.backchannel.models.remote.MessageData.MemberAdded", aVar, 1);
                pluginGeneratedSerialDescriptor.i("member_added", false);
                b = pluginGeneratedSerialDescriptor;
            }

            public KSerializer<?>[] childSerializers() {
                return new KSerializer[]{e0.b};
            }

            public Object deserialize(Decoder decoder) {
                int i;
                i.e(decoder, "decoder");
                SerialDescriptor serialDescriptor = b;
                c c = decoder.c(serialDescriptor);
                int i2 = 1;
                if (c.y()) {
                    i = c.k(serialDescriptor, 0);
                } else {
                    i = 0;
                    int i3 = 0;
                    while (i2 != 0) {
                        int x = c.x(serialDescriptor);
                        if (x == -1) {
                            i2 = 0;
                        } else if (x == 0) {
                            i = c.k(serialDescriptor, 0);
                            i3 |= 1;
                        } else {
                            throw new UnknownFieldException(x);
                        }
                    }
                    i2 = i3;
                }
                c.b(serialDescriptor);
                return new MemberAdded(i2, i);
            }

            public SerialDescriptor getDescriptor() {
                return b;
            }

            public void serialize(Encoder encoder, Object obj) {
                MemberAdded memberAdded = (MemberAdded) obj;
                i.e(encoder, "encoder");
                i.e(memberAdded, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
                SerialDescriptor serialDescriptor = b;
                n0.c.j.d c = encoder.c(serialDescriptor);
                i.e(memberAdded, "self");
                i.e(c, "output");
                i.e(serialDescriptor, "serialDesc");
                c.q(serialDescriptor, 0, memberAdded.a);
                c.b(serialDescriptor);
            }

            public KSerializer<?>[] typeParametersSerializers() {
                return v0.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public MemberAdded(int i, int i2) {
            super((f) null);
            if (1 == (i & 1)) {
                this.a = i2;
                return;
            }
            a aVar = a.a;
            m0.r.t.a.r.m.a1.a.W3(i, 1, a.b);
            throw null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MemberAdded) && this.a == ((MemberAdded) obj).a;
        }

        public int hashCode() {
            return Integer.hashCode(this.a);
        }

        public String toString() {
            return i0.d.a.a.a.s0(i0.d.a.a.a.P0("MemberAdded(addedId="), this.a, ')');
        }
    }

    @e
    /* compiled from: MessageData.kt */
    public static final class MemberRemoved extends MessageData {
        public static final Companion Companion = new Companion((f) null);
        public final int a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/pubsub/user/backchannel/models/remote/MessageData$MemberRemoved$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/pubsub/user/backchannel/models/remote/MessageData$MemberRemoved;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "pubsub_release"}, k = 1, mv = {1, 5, 1})
        /* compiled from: MessageData.kt */
        public static final class Companion {
            public Companion() {
            }

            public final KSerializer<MemberRemoved> serializer() {
                return a.a;
            }

            public Companion(f fVar) {
            }
        }

        /* compiled from: MessageData.kt */
        public static final class a implements v<MemberRemoved> {
            public static final a a;
            public static final /* synthetic */ SerialDescriptor b;

            static {
                a aVar = new a();
                a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.pubsub.user.backchannel.models.remote.MessageData.MemberRemoved", aVar, 1);
                pluginGeneratedSerialDescriptor.i("member_removed", false);
                b = pluginGeneratedSerialDescriptor;
            }

            public KSerializer<?>[] childSerializers() {
                return new KSerializer[]{e0.b};
            }

            public Object deserialize(Decoder decoder) {
                int i;
                i.e(decoder, "decoder");
                SerialDescriptor serialDescriptor = b;
                c c = decoder.c(serialDescriptor);
                int i2 = 1;
                if (c.y()) {
                    i = c.k(serialDescriptor, 0);
                } else {
                    i = 0;
                    int i3 = 0;
                    while (i2 != 0) {
                        int x = c.x(serialDescriptor);
                        if (x == -1) {
                            i2 = 0;
                        } else if (x == 0) {
                            i = c.k(serialDescriptor, 0);
                            i3 |= 1;
                        } else {
                            throw new UnknownFieldException(x);
                        }
                    }
                    i2 = i3;
                }
                c.b(serialDescriptor);
                return new MemberRemoved(i2, i);
            }

            public SerialDescriptor getDescriptor() {
                return b;
            }

            public void serialize(Encoder encoder, Object obj) {
                MemberRemoved memberRemoved = (MemberRemoved) obj;
                i.e(encoder, "encoder");
                i.e(memberRemoved, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
                SerialDescriptor serialDescriptor = b;
                n0.c.j.d c = encoder.c(serialDescriptor);
                i.e(memberRemoved, "self");
                i.e(c, "output");
                i.e(serialDescriptor, "serialDesc");
                c.q(serialDescriptor, 0, memberRemoved.a);
                c.b(serialDescriptor);
            }

            public KSerializer<?>[] typeParametersSerializers() {
                return v0.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public MemberRemoved(int i, int i2) {
            super((f) null);
            if (1 == (i & 1)) {
                this.a = i2;
                return;
            }
            a aVar = a.a;
            m0.r.t.a.r.m.a1.a.W3(i, 1, a.b);
            throw null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MemberRemoved) && this.a == ((MemberRemoved) obj).a;
        }

        public int hashCode() {
            return Integer.hashCode(this.a);
        }

        public String toString() {
            return i0.d.a.a.a.s0(i0.d.a.a.a.P0("MemberRemoved(removedId="), this.a, ')');
        }
    }

    @e
    /* compiled from: MessageData.kt */
    public static final class Unavailable extends MessageData {
        public static final Unavailable a = new Unavailable();
        public static final /* synthetic */ m0.c<KSerializer<Object>> b = h.G2(LazyThreadSafetyMode.PUBLICATION, MessageData$Unavailable$$cachedSerializer$delegate$2.c);

        public Unavailable() {
            super((f) null);
        }
    }

    public MessageData() {
    }

    public MessageData(f fVar) {
    }

    @e
    /* compiled from: MessageData.kt */
    public static final class Chat extends MessageData {
        public static final Companion Companion = new Companion((f) null);
        public final String a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/pubsub/user/backchannel/models/remote/MessageData$Chat$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/pubsub/user/backchannel/models/remote/MessageData$Chat;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "pubsub_release"}, k = 1, mv = {1, 5, 1})
        /* compiled from: MessageData.kt */
        public static final class Companion {
            public Companion() {
            }

            public final KSerializer<Chat> serializer() {
                return a.a;
            }

            public Companion(f fVar) {
            }
        }

        /* compiled from: MessageData.kt */
        public static final class a implements v<Chat> {
            public static final a a;
            public static final /* synthetic */ SerialDescriptor b;

            static {
                a aVar = new a();
                a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.pubsub.user.backchannel.models.remote.MessageData.Chat", aVar, 1);
                pluginGeneratedSerialDescriptor.i("message_body", false);
                b = pluginGeneratedSerialDescriptor;
            }

            public KSerializer<?>[] childSerializers() {
                return new KSerializer[]{g1.b};
            }

            public Object deserialize(Decoder decoder) {
                i.e(decoder, "decoder");
                SerialDescriptor serialDescriptor = b;
                String str = null;
                c c = decoder.c(serialDescriptor);
                int i = 1;
                if (c.y()) {
                    str = c.t(serialDescriptor, 0);
                } else {
                    int i2 = 0;
                    while (i != 0) {
                        int x = c.x(serialDescriptor);
                        if (x == -1) {
                            i = 0;
                        } else if (x == 0) {
                            str = c.t(serialDescriptor, 0);
                            i2 |= 1;
                        } else {
                            throw new UnknownFieldException(x);
                        }
                    }
                    i = i2;
                }
                c.b(serialDescriptor);
                return new Chat(i, str);
            }

            public SerialDescriptor getDescriptor() {
                return b;
            }

            public void serialize(Encoder encoder, Object obj) {
                Chat chat = (Chat) obj;
                i.e(encoder, "encoder");
                i.e(chat, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
                SerialDescriptor serialDescriptor = b;
                n0.c.j.d c = encoder.c(serialDescriptor);
                i.e(chat, "self");
                i.e(c, "output");
                i.e(serialDescriptor, "serialDesc");
                c.s(serialDescriptor, 0, chat.a);
                c.b(serialDescriptor);
            }

            public KSerializer<?>[] typeParametersSerializers() {
                return v0.a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Chat(int i, String str) {
            super((f) null);
            if (1 == (i & 1)) {
                this.a = str;
                return;
            }
            a aVar = a.a;
            m0.r.t.a.r.m.a1.a.W3(i, 1, a.b);
            throw null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Chat) && i.a(this.a, ((Chat) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return i0.d.a.a.a.x0(i0.d.a.a.a.P0("Chat(messageBody="), this.a, ')');
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Chat(String str) {
            super((f) null);
            i.e(str, "messageBody");
            this.a = str;
        }
    }
}
