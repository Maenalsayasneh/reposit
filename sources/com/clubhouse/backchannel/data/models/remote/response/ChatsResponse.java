package com.clubhouse.backchannel.data.models.remote.response;

import com.clubhouse.pubsub.user.backchannel.models.remote.Chat;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
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
import n0.c.k.h;
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: ChatsResponse.kt */
public final class ChatsResponse {
    public static final Companion Companion = new Companion((f) null);
    public final boolean a;
    public final List<Chat> b;
    public final List<Chat> c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/backchannel/data/models/remote/response/ChatsResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/backchannel/data/models/remote/response/ChatsResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "backchannel_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: ChatsResponse.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<ChatsResponse> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: ChatsResponse.kt */
    public static final class a implements v<ChatsResponse> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.backchannel.data.models.remote.response.ChatsResponse", aVar, 3);
            pluginGeneratedSerialDescriptor.i("message_requests_enabled", false);
            pluginGeneratedSerialDescriptor.i("chats", false);
            pluginGeneratedSerialDescriptor.i("requests", true);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            Chat.a aVar = Chat.a.a;
            return new KSerializer[]{h.b, new n0.c.k.e(aVar), new n0.c.k.e(aVar)};
        }

        public Object deserialize(Decoder decoder) {
            int i;
            Object obj;
            Object obj2;
            boolean z;
            i.e(decoder, "decoder");
            SerialDescriptor serialDescriptor = b;
            c c = decoder.c(serialDescriptor);
            Object obj3 = null;
            if (c.y()) {
                z = c.s(serialDescriptor, 0);
                Chat.a aVar = Chat.a.a;
                obj = c.m(serialDescriptor, 1, new n0.c.k.e(aVar), null);
                obj2 = c.m(serialDescriptor, 2, new n0.c.k.e(aVar), null);
                i = 7;
            } else {
                Object obj4 = null;
                z = false;
                int i2 = 0;
                boolean z2 = true;
                while (z2) {
                    int x = c.x(serialDescriptor);
                    if (x == -1) {
                        z2 = false;
                    } else if (x == 0) {
                        z = c.s(serialDescriptor, 0);
                        i2 |= 1;
                    } else if (x == 1) {
                        obj3 = c.m(serialDescriptor, 1, new n0.c.k.e(Chat.a.a), obj3);
                        i2 |= 2;
                    } else if (x == 2) {
                        obj4 = c.m(serialDescriptor, 2, new n0.c.k.e(Chat.a.a), obj4);
                        i2 |= 4;
                    } else {
                        throw new UnknownFieldException(x);
                    }
                }
                obj = obj3;
                obj2 = obj4;
                i = i2;
            }
            c.b(serialDescriptor);
            return new ChatsResponse(i, z, (List) obj, (List) obj2);
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            ChatsResponse chatsResponse = (ChatsResponse) obj;
            i.e(encoder, "encoder");
            i.e(chatsResponse, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(chatsResponse, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            boolean z = false;
            c.r(serialDescriptor, 0, chatsResponse.a);
            Chat.a aVar = Chat.a.a;
            c.z(serialDescriptor, 1, new n0.c.k.e(aVar), chatsResponse.b);
            if (c.v(serialDescriptor, 2) || !i.a(chatsResponse.c, EmptyList.c)) {
                z = true;
            }
            if (z) {
                c.z(serialDescriptor, 2, new n0.c.k.e(aVar), chatsResponse.c);
            }
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    public ChatsResponse(int i, boolean z, List list, List list2) {
        if (3 == (i & 3)) {
            this.a = z;
            this.b = list;
            if ((i & 4) == 0) {
                this.c = EmptyList.c;
            } else {
                this.c = list2;
            }
        } else {
            a aVar = a.a;
            m0.r.t.a.r.m.a1.a.W3(i, 3, a.b);
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatsResponse)) {
            return false;
        }
        ChatsResponse chatsResponse = (ChatsResponse) obj;
        return this.a == chatsResponse.a && i.a(this.b, chatsResponse.b) && i.a(this.c, chatsResponse.c);
    }

    public int hashCode() {
        boolean z = this.a;
        if (z) {
            z = true;
        }
        return this.c.hashCode() + i0.d.a.a.a.H(this.b, (z ? 1 : 0) * true, 31);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ChatsResponse(messageRequestsEnabled=");
        P0.append(this.a);
        P0.append(", chats=");
        P0.append(this.b);
        P0.append(", requests=");
        return i0.d.a.a.a.A0(P0, this.c, ')');
    }
}
