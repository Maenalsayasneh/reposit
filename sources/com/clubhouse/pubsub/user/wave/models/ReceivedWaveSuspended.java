package com.clubhouse.pubsub.user.wave.models;

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
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: WavePubSubMessage.kt */
public final class ReceivedWaveSuspended extends WavePubSubMessage {
    public static final Companion Companion = new Companion((f) null);
    public final int a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/pubsub/user/wave/models/ReceivedWaveSuspended$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/pubsub/user/wave/models/ReceivedWaveSuspended;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "pubsub_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: WavePubSubMessage.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<ReceivedWaveSuspended> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: WavePubSubMessage.kt */
    public static final class a implements v<ReceivedWaveSuspended> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.pubsub.user.wave.models.ReceivedWaveSuspended", aVar, 1);
            pluginGeneratedSerialDescriptor.i("from_user_profile_id", false);
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
            return new ReceivedWaveSuspended(i2, i);
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            ReceivedWaveSuspended receivedWaveSuspended = (ReceivedWaveSuspended) obj;
            i.e(encoder, "encoder");
            i.e(receivedWaveSuspended, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(receivedWaveSuspended, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            c.q(serialDescriptor, 0, receivedWaveSuspended.a);
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReceivedWaveSuspended(int i, int i2) {
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
        return (obj instanceof ReceivedWaveSuspended) && this.a == ((ReceivedWaveSuspended) obj).a;
    }

    public int hashCode() {
        return Integer.hashCode(this.a);
    }

    public String toString() {
        return i0.d.a.a.a.s0(i0.d.a.a.a.P0("ReceivedWaveSuspended(fromUserId="), this.a, ')');
    }
}
