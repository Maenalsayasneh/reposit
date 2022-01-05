package com.clubhouse.android.data.models.remote.response;

import com.clubhouse.android.data.models.local.Topic;
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
import n0.c.k.e0;
import n0.c.k.g1;
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: OnboardingSuggestedTopicsResponse.kt */
public final class OnboardingSuggestedTopicsResponse {
    public static final Companion Companion = new Companion((f) null);
    public final List<Topic> a;
    public final String b;
    public final int c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/remote/response/OnboardingSuggestedTopicsResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/remote/response/OnboardingSuggestedTopicsResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: OnboardingSuggestedTopicsResponse.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<OnboardingSuggestedTopicsResponse> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: OnboardingSuggestedTopicsResponse.kt */
    public static final class a implements v<OnboardingSuggestedTopicsResponse> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.remote.response.OnboardingSuggestedTopicsResponse", aVar, 3);
            pluginGeneratedSerialDescriptor.i("topics", false);
            pluginGeneratedSerialDescriptor.i(InstabugDbContract.FeatureRequestEntry.COLUMN_TITLE, false);
            pluginGeneratedSerialDescriptor.i("num_to_chose", false);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            return new KSerializer[]{new n0.c.k.e(Topic.a.a), g1.b, e0.b};
        }

        public Object deserialize(Decoder decoder) {
            int i;
            int i2;
            String str;
            Object obj;
            i.e(decoder, "decoder");
            SerialDescriptor serialDescriptor = b;
            c c = decoder.c(serialDescriptor);
            Object obj2 = null;
            if (c.y()) {
                obj = c.m(serialDescriptor, 0, new n0.c.k.e(Topic.a.a), null);
                str = c.t(serialDescriptor, 1);
                i2 = c.k(serialDescriptor, 2);
                i = 7;
            } else {
                String str2 = null;
                int i3 = 0;
                int i4 = 0;
                boolean z = true;
                while (z) {
                    int x = c.x(serialDescriptor);
                    if (x == -1) {
                        z = false;
                    } else if (x == 0) {
                        obj2 = c.m(serialDescriptor, 0, new n0.c.k.e(Topic.a.a), obj2);
                        i4 |= 1;
                    } else if (x == 1) {
                        str2 = c.t(serialDescriptor, 1);
                        i4 |= 2;
                    } else if (x == 2) {
                        i3 = c.k(serialDescriptor, 2);
                        i4 |= 4;
                    } else {
                        throw new UnknownFieldException(x);
                    }
                }
                i2 = i3;
                i = i4;
                Object obj3 = obj2;
                str = str2;
                obj = obj3;
            }
            c.b(serialDescriptor);
            return new OnboardingSuggestedTopicsResponse(i, (List) obj, str, i2);
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            OnboardingSuggestedTopicsResponse onboardingSuggestedTopicsResponse = (OnboardingSuggestedTopicsResponse) obj;
            i.e(encoder, "encoder");
            i.e(onboardingSuggestedTopicsResponse, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(onboardingSuggestedTopicsResponse, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            c.z(serialDescriptor, 0, new n0.c.k.e(Topic.a.a), onboardingSuggestedTopicsResponse.a);
            c.s(serialDescriptor, 1, onboardingSuggestedTopicsResponse.b);
            c.q(serialDescriptor, 2, onboardingSuggestedTopicsResponse.c);
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    public OnboardingSuggestedTopicsResponse(int i, List list, String str, int i2) {
        if (7 == (i & 7)) {
            this.a = list;
            this.b = str;
            this.c = i2;
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
        if (!(obj instanceof OnboardingSuggestedTopicsResponse)) {
            return false;
        }
        OnboardingSuggestedTopicsResponse onboardingSuggestedTopicsResponse = (OnboardingSuggestedTopicsResponse) obj;
        return i.a(this.a, onboardingSuggestedTopicsResponse.a) && i.a(this.b, onboardingSuggestedTopicsResponse.b) && this.c == onboardingSuggestedTopicsResponse.c;
    }

    public int hashCode() {
        return Integer.hashCode(this.c) + i0.d.a.a.a.F(this.b, this.a.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("OnboardingSuggestedTopicsResponse(topics=");
        P0.append(this.a);
        P0.append(", title=");
        P0.append(this.b);
        P0.append(", numToChoose=");
        return i0.d.a.a.a.s0(P0, this.c, ')');
    }
}
