package com.clubhouse.pubsub.user.backchannel.models;

import com.clubhouse.pubsub.user.backchannel.models.remote.Chat;
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
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: BackchannelPubSubMessage.kt */
public final class NewChat extends BackchannelPubSubMessage {
    public static final Companion Companion = new Companion((f) null);
    public final Chat a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/pubsub/user/backchannel/models/NewChat$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/pubsub/user/backchannel/models/NewChat;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "pubsub_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: BackchannelPubSubMessage.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<NewChat> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: BackchannelPubSubMessage.kt */
    public static final class a implements v<NewChat> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.pubsub.user.backchannel.models.NewChat", aVar, 1);
            pluginGeneratedSerialDescriptor.i("payload", false);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            return new KSerializer[]{Chat.a.a};
        }

        public Object deserialize(Decoder decoder) {
            i.e(decoder, "decoder");
            SerialDescriptor serialDescriptor = b;
            Object obj = null;
            c c = decoder.c(serialDescriptor);
            int i = 1;
            if (c.y()) {
                obj = c.m(serialDescriptor, 0, Chat.a.a, null);
            } else {
                int i2 = 0;
                while (i != 0) {
                    int x = c.x(serialDescriptor);
                    if (x == -1) {
                        i = 0;
                    } else if (x == 0) {
                        obj = c.m(serialDescriptor, 0, Chat.a.a, obj);
                        i2 |= 1;
                    } else {
                        throw new UnknownFieldException(x);
                    }
                }
                i = i2;
            }
            c.b(serialDescriptor);
            return new NewChat(i, (Chat) obj);
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            NewChat newChat = (NewChat) obj;
            i.e(encoder, "encoder");
            i.e(newChat, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(newChat, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            c.z(serialDescriptor, 0, Chat.a.a, newChat.a);
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewChat(int i, Chat chat) {
        super((f) null);
        if (1 == (i & 1)) {
            this.a = chat;
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
        return (obj instanceof NewChat) && i.a(this.a, ((NewChat) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("NewChat(payload=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
