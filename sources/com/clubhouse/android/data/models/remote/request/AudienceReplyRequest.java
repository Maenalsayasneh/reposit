package com.clubhouse.android.data.models.remote.request;

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
import n0.c.k.g1;
import n0.c.k.h;
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: AudienceReplyRequest.kt */
public final class AudienceReplyRequest {
    public static final Companion Companion = new Companion((f) null);
    public final String a;
    public final boolean b;
    public final boolean c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/remote/request/AudienceReplyRequest$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/remote/request/AudienceReplyRequest;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: AudienceReplyRequest.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<AudienceReplyRequest> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: AudienceReplyRequest.kt */
    public static final class a implements v<AudienceReplyRequest> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.remote.request.AudienceReplyRequest", aVar, 3);
            pluginGeneratedSerialDescriptor.i(Include.INCLUDE_CHANNEL_PARAM_VALUE, false);
            pluginGeneratedSerialDescriptor.i("raise_hands", true);
            pluginGeneratedSerialDescriptor.i("unraise_hands", true);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            h hVar = h.b;
            return new KSerializer[]{g1.b, hVar, hVar};
        }

        public Object deserialize(Decoder decoder) {
            int i;
            boolean z;
            boolean z2;
            i.e(decoder, "decoder");
            SerialDescriptor serialDescriptor = b;
            String str = null;
            c c = decoder.c(serialDescriptor);
            if (c.y()) {
                str = c.t(serialDescriptor, 0);
                z2 = c.s(serialDescriptor, 1);
                z = c.s(serialDescriptor, 2);
                i = 7;
            } else {
                z2 = false;
                boolean z3 = false;
                int i2 = 0;
                boolean z4 = true;
                while (z4) {
                    int x = c.x(serialDescriptor);
                    if (x == -1) {
                        z4 = false;
                    } else if (x == 0) {
                        str = c.t(serialDescriptor, 0);
                        i2 |= 1;
                    } else if (x == 1) {
                        z2 = c.s(serialDescriptor, 1);
                        i2 |= 2;
                    } else if (x == 2) {
                        z3 = c.s(serialDescriptor, 2);
                        i2 |= 4;
                    } else {
                        throw new UnknownFieldException(x);
                    }
                }
                z = z3;
                i = i2;
            }
            c.b(serialDescriptor);
            return new AudienceReplyRequest(i, str, z2, z);
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            AudienceReplyRequest audienceReplyRequest = (AudienceReplyRequest) obj;
            i.e(encoder, "encoder");
            i.e(audienceReplyRequest, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(audienceReplyRequest, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            boolean z = false;
            c.s(serialDescriptor, 0, audienceReplyRequest.a);
            if (c.v(serialDescriptor, 1) || audienceReplyRequest.b) {
                c.r(serialDescriptor, 1, audienceReplyRequest.b);
            }
            if (c.v(serialDescriptor, 2) || audienceReplyRequest.c) {
                z = true;
            }
            if (z) {
                c.r(serialDescriptor, 2, audienceReplyRequest.c);
            }
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    public AudienceReplyRequest(String str, boolean z, boolean z2, int i) {
        z = (i & 2) != 0 ? false : z;
        z2 = (i & 4) != 0 ? false : z2;
        i.e(str, Include.INCLUDE_CHANNEL_PARAM_VALUE);
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudienceReplyRequest)) {
            return false;
        }
        AudienceReplyRequest audienceReplyRequest = (AudienceReplyRequest) obj;
        return i.a(this.a, audienceReplyRequest.a) && this.b == audienceReplyRequest.b && this.c == audienceReplyRequest.c;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        boolean z = this.b;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.c;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("AudienceReplyRequest(channel=");
        P0.append(this.a);
        P0.append(", raiseHands=");
        P0.append(this.b);
        P0.append(", unraiseHands=");
        return i0.d.a.a.a.C0(P0, this.c, ')');
    }

    public AudienceReplyRequest(int i, String str, boolean z, boolean z2) {
        if (1 == (i & 1)) {
            this.a = str;
            if ((i & 2) == 0) {
                this.b = false;
            } else {
                this.b = z;
            }
            if ((i & 4) == 0) {
                this.c = false;
            } else {
                this.c = z2;
            }
        } else {
            a aVar = a.a;
            m0.r.t.a.r.m.a1.a.W3(i, 1, a.b);
            throw null;
        }
    }
}
