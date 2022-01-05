package com.clubhouse.android.data.models.remote.response;

import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.util.List;
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
/* compiled from: OnboardingSuggestedClubsResponse.kt */
public final class OnboardingSuggestedClubsResponse {
    public static final Companion Companion = new Companion((f) null);
    public final List<ClubWithAdmin> a;
    public final String b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/remote/response/OnboardingSuggestedClubsResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/remote/response/OnboardingSuggestedClubsResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: OnboardingSuggestedClubsResponse.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<OnboardingSuggestedClubsResponse> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: OnboardingSuggestedClubsResponse.kt */
    public static final class a implements v<OnboardingSuggestedClubsResponse> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.remote.response.OnboardingSuggestedClubsResponse", aVar, 2);
            pluginGeneratedSerialDescriptor.i("clubs", false);
            pluginGeneratedSerialDescriptor.i(InstabugDbContract.FeatureRequestEntry.COLUMN_TITLE, false);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            return new KSerializer[]{new n0.c.k.e(ClubWithAdmin.a.a), g1.b};
        }

        public Object deserialize(Decoder decoder) {
            int i;
            String str;
            Object obj;
            i.e(decoder, "decoder");
            SerialDescriptor serialDescriptor = b;
            c c = decoder.c(serialDescriptor);
            Object obj2 = null;
            if (c.y()) {
                obj = c.m(serialDescriptor, 0, new n0.c.k.e(ClubWithAdmin.a.a), null);
                str = c.t(serialDescriptor, 1);
                i = 3;
            } else {
                String str2 = null;
                int i2 = 0;
                boolean z = true;
                while (z) {
                    int x = c.x(serialDescriptor);
                    if (x == -1) {
                        z = false;
                    } else if (x == 0) {
                        obj2 = c.m(serialDescriptor, 0, new n0.c.k.e(ClubWithAdmin.a.a), obj2);
                        i2 |= 1;
                    } else if (x == 1) {
                        str2 = c.t(serialDescriptor, 1);
                        i2 |= 2;
                    } else {
                        throw new UnknownFieldException(x);
                    }
                }
                i = i2;
                Object obj3 = obj2;
                str = str2;
                obj = obj3;
            }
            c.b(serialDescriptor);
            return new OnboardingSuggestedClubsResponse(i, (List) obj, str);
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            OnboardingSuggestedClubsResponse onboardingSuggestedClubsResponse = (OnboardingSuggestedClubsResponse) obj;
            i.e(encoder, "encoder");
            i.e(onboardingSuggestedClubsResponse, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(onboardingSuggestedClubsResponse, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            c.z(serialDescriptor, 0, new n0.c.k.e(ClubWithAdmin.a.a), onboardingSuggestedClubsResponse.a);
            c.s(serialDescriptor, 1, onboardingSuggestedClubsResponse.b);
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    public OnboardingSuggestedClubsResponse(int i, List list, String str) {
        if (3 == (i & 3)) {
            this.a = list;
            this.b = str;
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
        if (!(obj instanceof OnboardingSuggestedClubsResponse)) {
            return false;
        }
        OnboardingSuggestedClubsResponse onboardingSuggestedClubsResponse = (OnboardingSuggestedClubsResponse) obj;
        return i.a(this.a, onboardingSuggestedClubsResponse.a) && i.a(this.b, onboardingSuggestedClubsResponse.b);
    }

    public int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("OnboardingSuggestedClubsResponse(clubs=");
        P0.append(this.a);
        P0.append(", title=");
        return i0.d.a.a.a.x0(P0, this.b, ')');
    }
}
