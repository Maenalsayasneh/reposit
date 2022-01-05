package com.clubhouse.android.data.models.remote.request;

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
import n0.c.k.g1;
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: UpdateTwitterProfileRequest.kt */
public final class UpdateTwitterProfileRequest {
    public static final Companion Companion = new Companion((f) null);
    public final String a;
    public final String b;
    public final String c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/remote/request/UpdateTwitterProfileRequest$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/remote/request/UpdateTwitterProfileRequest;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: UpdateTwitterProfileRequest.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<UpdateTwitterProfileRequest> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: UpdateTwitterProfileRequest.kt */
    public static final class a implements v<UpdateTwitterProfileRequest> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.remote.request.UpdateTwitterProfileRequest", aVar, 3);
            pluginGeneratedSerialDescriptor.i("twitter_token", false);
            pluginGeneratedSerialDescriptor.i("twitter_secret", false);
            pluginGeneratedSerialDescriptor.i("username", false);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            g1 g1Var = g1.b;
            return new KSerializer[]{m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(g1Var)};
        }

        public Object deserialize(Decoder decoder) {
            Object obj;
            Object obj2;
            int i;
            Object obj3;
            i.e(decoder, "decoder");
            SerialDescriptor serialDescriptor = b;
            c c = decoder.c(serialDescriptor);
            Object obj4 = null;
            if (c.y()) {
                g1 g1Var = g1.b;
                obj2 = c.v(serialDescriptor, 0, g1Var, null);
                obj = c.v(serialDescriptor, 1, g1Var, null);
                obj3 = c.v(serialDescriptor, 2, g1Var, null);
                i = 7;
            } else {
                Object obj5 = null;
                Object obj6 = null;
                int i2 = 0;
                boolean z = true;
                while (z) {
                    int x = c.x(serialDescriptor);
                    if (x == -1) {
                        z = false;
                    } else if (x == 0) {
                        obj4 = c.v(serialDescriptor, 0, g1.b, obj4);
                        i2 |= 1;
                    } else if (x == 1) {
                        obj5 = c.v(serialDescriptor, 1, g1.b, obj5);
                        i2 |= 2;
                    } else if (x == 2) {
                        obj6 = c.v(serialDescriptor, 2, g1.b, obj6);
                        i2 |= 4;
                    } else {
                        throw new UnknownFieldException(x);
                    }
                }
                obj = obj5;
                obj2 = obj4;
                obj3 = obj6;
                i = i2;
            }
            c.b(serialDescriptor);
            return new UpdateTwitterProfileRequest(i, (String) obj2, (String) obj, (String) obj3);
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            UpdateTwitterProfileRequest updateTwitterProfileRequest = (UpdateTwitterProfileRequest) obj;
            i.e(encoder, "encoder");
            i.e(updateTwitterProfileRequest, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(updateTwitterProfileRequest, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            g1 g1Var = g1.b;
            c.l(serialDescriptor, 0, g1Var, updateTwitterProfileRequest.a);
            c.l(serialDescriptor, 1, g1Var, updateTwitterProfileRequest.b);
            c.l(serialDescriptor, 2, g1Var, updateTwitterProfileRequest.c);
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    public UpdateTwitterProfileRequest(int i, String str, String str2, String str3) {
        if (7 == (i & 7)) {
            this.a = str;
            this.b = str2;
            this.c = str3;
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
        if (!(obj instanceof UpdateTwitterProfileRequest)) {
            return false;
        }
        UpdateTwitterProfileRequest updateTwitterProfileRequest = (UpdateTwitterProfileRequest) obj;
        return i.a(this.a, updateTwitterProfileRequest.a) && i.a(this.b, updateTwitterProfileRequest.b) && i.a(this.c, updateTwitterProfileRequest.c);
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("UpdateTwitterProfileRequest(twitterToken=");
        P0.append(this.a);
        P0.append(", twitterSecret=");
        P0.append(this.b);
        P0.append(", username=");
        return i0.d.a.a.a.w0(P0, this.c, ')');
    }

    public UpdateTwitterProfileRequest(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
