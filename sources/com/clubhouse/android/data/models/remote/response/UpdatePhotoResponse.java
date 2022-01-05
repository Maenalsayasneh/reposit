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
import n0.c.k.g1;
import n0.c.k.h;
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: UpdatePhotoResponse.kt */
public final class UpdatePhotoResponse {
    public static final Companion Companion = new Companion((f) null);
    public final boolean a;
    public final String b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/remote/response/UpdatePhotoResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/remote/response/UpdatePhotoResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: UpdatePhotoResponse.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<UpdatePhotoResponse> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: UpdatePhotoResponse.kt */
    public static final class a implements v<UpdatePhotoResponse> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.remote.response.UpdatePhotoResponse", aVar, 2);
            pluginGeneratedSerialDescriptor.i("success", false);
            pluginGeneratedSerialDescriptor.i("photo_url", false);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            return new KSerializer[]{h.b, g1.b};
        }

        public Object deserialize(Decoder decoder) {
            int i;
            String str;
            boolean z;
            i.e(decoder, "decoder");
            SerialDescriptor serialDescriptor = b;
            c c = decoder.c(serialDescriptor);
            if (c.y()) {
                z = c.s(serialDescriptor, 0);
                str = c.t(serialDescriptor, 1);
                i = 3;
            } else {
                str = null;
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
                        str = c.t(serialDescriptor, 1);
                        i2 |= 2;
                    } else {
                        throw new UnknownFieldException(x);
                    }
                }
                i = i2;
            }
            c.b(serialDescriptor);
            return new UpdatePhotoResponse(i, z, str);
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            UpdatePhotoResponse updatePhotoResponse = (UpdatePhotoResponse) obj;
            i.e(encoder, "encoder");
            i.e(updatePhotoResponse, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(updatePhotoResponse, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            c.r(serialDescriptor, 0, updatePhotoResponse.a);
            c.s(serialDescriptor, 1, updatePhotoResponse.b);
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    public UpdatePhotoResponse(int i, boolean z, String str) {
        if (3 == (i & 3)) {
            this.a = z;
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
        if (!(obj instanceof UpdatePhotoResponse)) {
            return false;
        }
        UpdatePhotoResponse updatePhotoResponse = (UpdatePhotoResponse) obj;
        return this.a == updatePhotoResponse.a && i.a(this.b, updatePhotoResponse.b);
    }

    public int hashCode() {
        boolean z = this.a;
        if (z) {
            z = true;
        }
        return this.b.hashCode() + ((z ? 1 : 0) * true);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("UpdatePhotoResponse(success=");
        P0.append(this.a);
        P0.append(", photoUrl=");
        return i0.d.a.a.a.x0(P0, this.b, ')');
    }
}
