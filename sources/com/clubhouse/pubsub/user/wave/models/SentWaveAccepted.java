package com.clubhouse.pubsub.user.wave.models;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.pubnub.api.endpoints.objects_api.utils.Include;
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
import n0.c.k.h;
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: WavePubSubMessage.kt */
public final class SentWaveAccepted extends WavePubSubMessage {
    public static final Companion Companion = new Companion((f) null);
    public final int a;
    public final String b;
    public final boolean c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/pubsub/user/wave/models/SentWaveAccepted$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/pubsub/user/wave/models/SentWaveAccepted;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "pubsub_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: WavePubSubMessage.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<SentWaveAccepted> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: WavePubSubMessage.kt */
    public static final class a implements v<SentWaveAccepted> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.pubsub.user.wave.models.SentWaveAccepted", aVar, 3);
            pluginGeneratedSerialDescriptor.i("to_user_profile_id", false);
            pluginGeneratedSerialDescriptor.i(Include.INCLUDE_CHANNEL_PARAM_VALUE, false);
            pluginGeneratedSerialDescriptor.i("join_channel", false);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            return new KSerializer[]{e0.b, g1.b, h.b};
        }

        public Object deserialize(Decoder decoder) {
            int i;
            boolean z;
            String str;
            int i2;
            i.e(decoder, "decoder");
            SerialDescriptor serialDescriptor = b;
            c c = decoder.c(serialDescriptor);
            if (c.y()) {
                i2 = c.k(serialDescriptor, 0);
                str = c.t(serialDescriptor, 1);
                z = c.s(serialDescriptor, 2);
                i = 7;
            } else {
                str = null;
                i2 = 0;
                boolean z2 = false;
                int i3 = 0;
                boolean z3 = true;
                while (z3) {
                    int x = c.x(serialDescriptor);
                    if (x == -1) {
                        z3 = false;
                    } else if (x == 0) {
                        i2 = c.k(serialDescriptor, 0);
                        i3 |= 1;
                    } else if (x == 1) {
                        str = c.t(serialDescriptor, 1);
                        i3 |= 2;
                    } else if (x == 2) {
                        z2 = c.s(serialDescriptor, 2);
                        i3 |= 4;
                    } else {
                        throw new UnknownFieldException(x);
                    }
                }
                z = z2;
                i = i3;
            }
            c.b(serialDescriptor);
            return new SentWaveAccepted(i, i2, str, z);
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            SentWaveAccepted sentWaveAccepted = (SentWaveAccepted) obj;
            i.e(encoder, "encoder");
            i.e(sentWaveAccepted, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(sentWaveAccepted, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            c.q(serialDescriptor, 0, sentWaveAccepted.a);
            c.s(serialDescriptor, 1, sentWaveAccepted.b);
            c.r(serialDescriptor, 2, sentWaveAccepted.c);
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SentWaveAccepted(int i, int i2, String str, boolean z) {
        super((f) null);
        if (7 == (i & 7)) {
            this.a = i2;
            this.b = str;
            this.c = z;
            return;
        }
        a aVar = a.a;
        m0.r.t.a.r.m.a1.a.W3(i, 7, a.b);
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SentWaveAccepted)) {
            return false;
        }
        SentWaveAccepted sentWaveAccepted = (SentWaveAccepted) obj;
        return this.a == sentWaveAccepted.a && i.a(this.b, sentWaveAccepted.b) && this.c == sentWaveAccepted.c;
    }

    public int hashCode() {
        int F = i0.d.a.a.a.F(this.b, Integer.hashCode(this.a) * 31, 31);
        boolean z = this.c;
        if (z) {
            z = true;
        }
        return F + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("SentWaveAccepted(toUserId=");
        P0.append(this.a);
        P0.append(", channel=");
        P0.append(this.b);
        P0.append(", joinChannel=");
        return i0.d.a.a.a.C0(P0, this.c, ')');
    }
}
