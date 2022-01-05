package com.clubhouse.backchannel.data.models.remote.request;

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
import n0.c.k.e0;
import n0.c.k.g1;
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: UpdateLastReadMessageRequest.kt */
public final class UpdateLastReadMessageRequest {
    public static final Companion Companion = new Companion((f) null);
    public final String a;
    public final int b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/backchannel/data/models/remote/request/UpdateLastReadMessageRequest$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/backchannel/data/models/remote/request/UpdateLastReadMessageRequest;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "backchannel_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: UpdateLastReadMessageRequest.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<UpdateLastReadMessageRequest> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: UpdateLastReadMessageRequest.kt */
    public static final class a implements v<UpdateLastReadMessageRequest> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.backchannel.data.models.remote.request.UpdateLastReadMessageRequest", aVar, 2);
            pluginGeneratedSerialDescriptor.i("chat_id", false);
            pluginGeneratedSerialDescriptor.i("last_read_message_id", false);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            return new KSerializer[]{g1.b, e0.b};
        }

        public Object deserialize(Decoder decoder) {
            int i;
            int i2;
            i.e(decoder, "decoder");
            SerialDescriptor serialDescriptor = b;
            String str = null;
            c c = decoder.c(serialDescriptor);
            if (c.y()) {
                str = c.t(serialDescriptor, 0);
                i2 = c.k(serialDescriptor, 1);
                i = 3;
            } else {
                i2 = 0;
                int i3 = 0;
                boolean z = true;
                while (z) {
                    int x = c.x(serialDescriptor);
                    if (x == -1) {
                        z = false;
                    } else if (x == 0) {
                        str = c.t(serialDescriptor, 0);
                        i3 |= 1;
                    } else if (x == 1) {
                        i2 = c.k(serialDescriptor, 1);
                        i3 |= 2;
                    } else {
                        throw new UnknownFieldException(x);
                    }
                }
                i = i3;
            }
            c.b(serialDescriptor);
            return new UpdateLastReadMessageRequest(i, str, i2);
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            UpdateLastReadMessageRequest updateLastReadMessageRequest = (UpdateLastReadMessageRequest) obj;
            i.e(encoder, "encoder");
            i.e(updateLastReadMessageRequest, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(updateLastReadMessageRequest, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            c.s(serialDescriptor, 0, updateLastReadMessageRequest.a);
            c.q(serialDescriptor, 1, updateLastReadMessageRequest.b);
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    public UpdateLastReadMessageRequest(int i, String str, int i2) {
        if (3 == (i & 3)) {
            this.a = str;
            this.b = i2;
            return;
        }
        a aVar = a.a;
        m0.r.t.a.r.m.a1.a.W3(i, 3, a.b);
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateLastReadMessageRequest)) {
            return false;
        }
        UpdateLastReadMessageRequest updateLastReadMessageRequest = (UpdateLastReadMessageRequest) obj;
        return i.a(this.a, updateLastReadMessageRequest.a) && this.b == updateLastReadMessageRequest.b;
    }

    public int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("UpdateLastReadMessageRequest(chatId=");
        P0.append(this.a);
        P0.append(", lastReadMessageId=");
        return i0.d.a.a.a.s0(P0, this.b, ')');
    }

    public UpdateLastReadMessageRequest(String str, int i) {
        i.e(str, "chatId");
        this.a = str;
        this.b = i;
    }
}
