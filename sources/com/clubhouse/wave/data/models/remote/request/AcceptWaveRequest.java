package com.clubhouse.wave.data.models.remote.request;

import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.stripe.android.model.Stripe3ds2AuthParams;
import i0.e.b.b3.a.b.c.h;
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
/* compiled from: AcceptWaveRequest.kt */
public final class AcceptWaveRequest {
    public static final Companion Companion = new Companion((f) null);
    public final int a;
    public final String b;
    public final SourceLocation c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/wave/data/models/remote/request/AcceptWaveRequest$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/wave/data/models/remote/request/AcceptWaveRequest;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "wave_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: AcceptWaveRequest.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<AcceptWaveRequest> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: AcceptWaveRequest.kt */
    public static final class a implements v<AcceptWaveRequest> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.wave.data.models.remote.request.AcceptWaveRequest", aVar, 3);
            pluginGeneratedSerialDescriptor.i("from_user_profile_id", false);
            pluginGeneratedSerialDescriptor.i("wave_id", false);
            pluginGeneratedSerialDescriptor.i(Stripe3ds2AuthParams.FIELD_SOURCE, false);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            return new KSerializer[]{e0.b, g1.b, h.a};
        }

        public Object deserialize(Decoder decoder) {
            int i;
            String str;
            Object obj;
            int i2;
            i.e(decoder, "decoder");
            SerialDescriptor serialDescriptor = b;
            c c = decoder.c(serialDescriptor);
            String str2 = null;
            if (c.y()) {
                i2 = c.k(serialDescriptor, 0);
                str = c.t(serialDescriptor, 1);
                obj = c.m(serialDescriptor, 2, h.a, null);
                i = 7;
            } else {
                Object obj2 = null;
                i2 = 0;
                int i3 = 0;
                boolean z = true;
                while (z) {
                    int x = c.x(serialDescriptor);
                    if (x == -1) {
                        z = false;
                    } else if (x == 0) {
                        i2 = c.k(serialDescriptor, 0);
                        i3 |= 1;
                    } else if (x == 1) {
                        str2 = c.t(serialDescriptor, 1);
                        i3 |= 2;
                    } else if (x == 2) {
                        obj2 = c.m(serialDescriptor, 2, h.a, obj2);
                        i3 |= 4;
                    } else {
                        throw new UnknownFieldException(x);
                    }
                }
                str = str2;
                obj = obj2;
                i = i3;
            }
            c.b(serialDescriptor);
            return new AcceptWaveRequest(i, i2, str, (SourceLocation) obj);
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            AcceptWaveRequest acceptWaveRequest = (AcceptWaveRequest) obj;
            i.e(encoder, "encoder");
            i.e(acceptWaveRequest, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(acceptWaveRequest, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            c.q(serialDescriptor, 0, acceptWaveRequest.a);
            c.s(serialDescriptor, 1, acceptWaveRequest.b);
            c.z(serialDescriptor, 2, h.a, acceptWaveRequest.c);
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    public AcceptWaveRequest(int i, int i2, String str, SourceLocation sourceLocation) {
        if (7 == (i & 7)) {
            this.a = i2;
            this.b = str;
            this.c = sourceLocation;
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
        if (!(obj instanceof AcceptWaveRequest)) {
            return false;
        }
        AcceptWaveRequest acceptWaveRequest = (AcceptWaveRequest) obj;
        return this.a == acceptWaveRequest.a && i.a(this.b, acceptWaveRequest.b) && this.c == acceptWaveRequest.c;
    }

    public int hashCode() {
        return this.c.hashCode() + i0.d.a.a.a.F(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("AcceptWaveRequest(fromUserId=");
        P0.append(this.a);
        P0.append(", waveId=");
        P0.append(this.b);
        P0.append(", source=");
        P0.append(this.c);
        P0.append(')');
        return P0.toString();
    }

    public AcceptWaveRequest(int i, String str, SourceLocation sourceLocation) {
        i.e(str, "waveId");
        i.e(sourceLocation, Stripe3ds2AuthParams.FIELD_SOURCE);
        this.a = i;
        this.b = str;
        this.c = sourceLocation;
    }
}
