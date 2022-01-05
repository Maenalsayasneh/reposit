package com.clubhouse.android.data.models.remote.response;

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
import n0.c.k.h;
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: GetCreateClubResponse.kt */
public final class GetCreateClubResponse {
    public static final Companion Companion = new Companion((f) null);
    public final boolean a;
    public final int b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/remote/response/GetCreateClubResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/remote/response/GetCreateClubResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: GetCreateClubResponse.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<GetCreateClubResponse> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: GetCreateClubResponse.kt */
    public static final class a implements v<GetCreateClubResponse> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.remote.response.GetCreateClubResponse", aVar, 2);
            pluginGeneratedSerialDescriptor.i("success", false);
            pluginGeneratedSerialDescriptor.i("club_id", false);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            return new KSerializer[]{h.b, e0.b};
        }

        public Object deserialize(Decoder decoder) {
            int i;
            int i2;
            boolean z;
            i.e(decoder, "decoder");
            SerialDescriptor serialDescriptor = b;
            c c = decoder.c(serialDescriptor);
            if (c.y()) {
                z = c.s(serialDescriptor, 0);
                i2 = c.k(serialDescriptor, 1);
                i = 3;
            } else {
                z = false;
                int i3 = 0;
                int i4 = 0;
                boolean z2 = true;
                while (z2) {
                    int x = c.x(serialDescriptor);
                    if (x == -1) {
                        z2 = false;
                    } else if (x == 0) {
                        z = c.s(serialDescriptor, 0);
                        i4 |= 1;
                    } else if (x == 1) {
                        i3 = c.k(serialDescriptor, 1);
                        i4 |= 2;
                    } else {
                        throw new UnknownFieldException(x);
                    }
                }
                i2 = i3;
                i = i4;
            }
            c.b(serialDescriptor);
            return new GetCreateClubResponse(i, z, i2);
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            GetCreateClubResponse getCreateClubResponse = (GetCreateClubResponse) obj;
            i.e(encoder, "encoder");
            i.e(getCreateClubResponse, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(getCreateClubResponse, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            c.r(serialDescriptor, 0, getCreateClubResponse.a);
            c.q(serialDescriptor, 1, getCreateClubResponse.b);
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    public GetCreateClubResponse(int i, boolean z, int i2) {
        if (3 == (i & 3)) {
            this.a = z;
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
        if (!(obj instanceof GetCreateClubResponse)) {
            return false;
        }
        GetCreateClubResponse getCreateClubResponse = (GetCreateClubResponse) obj;
        return this.a == getCreateClubResponse.a && this.b == getCreateClubResponse.b;
    }

    public int hashCode() {
        boolean z = this.a;
        if (z) {
            z = true;
        }
        return Integer.hashCode(this.b) + ((z ? 1 : 0) * true);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("GetCreateClubResponse(success=");
        P0.append(this.a);
        P0.append(", id=");
        return i0.d.a.a.a.s0(P0, this.b, ')');
    }
}
