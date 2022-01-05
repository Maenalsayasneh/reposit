package com.clubhouse.pubsub.user.backchannel.models;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
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
import n0.c.j.d;
import n0.c.k.g1;
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: BackchannelPubSubMessage.kt */
public final class ChatPromoted extends BackchannelPubSubMessage {
    public static final Companion Companion = new Companion((f) null);
    public final ChatId a;

    @e
    /* compiled from: BackchannelPubSubMessage.kt */
    public static final class ChatId {
        public static final Companion Companion = new Companion((f) null);
        public final String a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/pubsub/user/backchannel/models/ChatPromoted$ChatId$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/pubsub/user/backchannel/models/ChatPromoted$ChatId;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "pubsub_release"}, k = 1, mv = {1, 5, 1})
        /* compiled from: BackchannelPubSubMessage.kt */
        public static final class Companion {
            public Companion() {
            }

            public final KSerializer<ChatId> serializer() {
                return a.a;
            }

            public Companion(f fVar) {
            }
        }

        /* compiled from: BackchannelPubSubMessage.kt */
        public static final class a implements v<ChatId> {
            public static final a a;
            public static final /* synthetic */ SerialDescriptor b;

            static {
                a aVar = new a();
                a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.pubsub.user.backchannel.models.ChatPromoted.ChatId", aVar, 1);
                pluginGeneratedSerialDescriptor.i("chat_id", false);
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
                return new ChatId(i, str);
            }

            public SerialDescriptor getDescriptor() {
                return b;
            }

            public void serialize(Encoder encoder, Object obj) {
                ChatId chatId = (ChatId) obj;
                i.e(encoder, "encoder");
                i.e(chatId, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
                SerialDescriptor serialDescriptor = b;
                d c = encoder.c(serialDescriptor);
                i.e(chatId, "self");
                i.e(c, "output");
                i.e(serialDescriptor, "serialDesc");
                c.s(serialDescriptor, 0, chatId.a);
                c.b(serialDescriptor);
            }

            public KSerializer<?>[] typeParametersSerializers() {
                return v0.a;
            }
        }

        public ChatId(int i, String str) {
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
            return (obj instanceof ChatId) && i.a(this.a, ((ChatId) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return i0.d.a.a.a.x0(i0.d.a.a.a.P0("ChatId(chatId="), this.a, ')');
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/pubsub/user/backchannel/models/ChatPromoted$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/pubsub/user/backchannel/models/ChatPromoted;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "pubsub_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: BackchannelPubSubMessage.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<ChatPromoted> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: BackchannelPubSubMessage.kt */
    public static final class a implements v<ChatPromoted> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.pubsub.user.backchannel.models.ChatPromoted", aVar, 1);
            pluginGeneratedSerialDescriptor.i("payload", false);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            return new KSerializer[]{ChatId.a.a};
        }

        public Object deserialize(Decoder decoder) {
            i.e(decoder, "decoder");
            SerialDescriptor serialDescriptor = b;
            Object obj = null;
            c c = decoder.c(serialDescriptor);
            int i = 1;
            if (c.y()) {
                obj = c.m(serialDescriptor, 0, ChatId.a.a, null);
            } else {
                int i2 = 0;
                while (i != 0) {
                    int x = c.x(serialDescriptor);
                    if (x == -1) {
                        i = 0;
                    } else if (x == 0) {
                        obj = c.m(serialDescriptor, 0, ChatId.a.a, obj);
                        i2 |= 1;
                    } else {
                        throw new UnknownFieldException(x);
                    }
                }
                i = i2;
            }
            c.b(serialDescriptor);
            return new ChatPromoted(i, (ChatId) obj);
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            ChatPromoted chatPromoted = (ChatPromoted) obj;
            i.e(encoder, "encoder");
            i.e(chatPromoted, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(chatPromoted, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            c.z(serialDescriptor, 0, ChatId.a.a, chatPromoted.a);
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatPromoted(int i, ChatId chatId) {
        super((f) null);
        if (1 == (i & 1)) {
            this.a = chatId;
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
        return (obj instanceof ChatPromoted) && i.a(this.a, ((ChatPromoted) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ChatPromoted(payload=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
