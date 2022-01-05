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
/* compiled from: UpdateInstagramProfileRsponse.kt */
public final class UpdateInstagramProfileResponse {
    public static final Companion Companion = new Companion((f) null);
    public final String a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/remote/request/UpdateInstagramProfileResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/remote/request/UpdateInstagramProfileResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: UpdateInstagramProfileRsponse.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<UpdateInstagramProfileResponse> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: UpdateInstagramProfileRsponse.kt */
    public static final class a implements v<UpdateInstagramProfileResponse> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.remote.request.UpdateInstagramProfileResponse", aVar, 1);
            pluginGeneratedSerialDescriptor.i("username", true);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            return new KSerializer[]{m0.r.t.a.r.m.a1.a.R1(g1.b)};
        }

        public Object deserialize(Decoder decoder) {
            i.e(decoder, "decoder");
            SerialDescriptor serialDescriptor = b;
            Object obj = null;
            c c = decoder.c(serialDescriptor);
            int i = 1;
            if (c.y()) {
                obj = c.v(serialDescriptor, 0, g1.b, null);
            } else {
                int i2 = 0;
                while (i != 0) {
                    int x = c.x(serialDescriptor);
                    if (x == -1) {
                        i = 0;
                    } else if (x == 0) {
                        obj = c.v(serialDescriptor, 0, g1.b, obj);
                        i2 |= 1;
                    } else {
                        throw new UnknownFieldException(x);
                    }
                }
                i = i2;
            }
            c.b(serialDescriptor);
            return new UpdateInstagramProfileResponse(i, (String) obj);
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            UpdateInstagramProfileResponse updateInstagramProfileResponse = (UpdateInstagramProfileResponse) obj;
            i.e(encoder, "encoder");
            i.e(updateInstagramProfileResponse, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(updateInstagramProfileResponse, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            boolean z = true;
            if (!c.v(serialDescriptor, 0) && updateInstagramProfileResponse.a == null) {
                z = false;
            }
            if (z) {
                c.l(serialDescriptor, 0, g1.b, updateInstagramProfileResponse.a);
            }
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    public UpdateInstagramProfileResponse() {
        this.a = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UpdateInstagramProfileResponse) && i.a(this.a, ((UpdateInstagramProfileResponse) obj).a);
    }

    public int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return i0.d.a.a.a.w0(i0.d.a.a.a.P0("UpdateInstagramProfileResponse(username="), this.a, ')');
    }

    public UpdateInstagramProfileResponse(int i, String str) {
        if ((i & 0) != 0) {
            a aVar = a.a;
            m0.r.t.a.r.m.a1.a.W3(i, 0, a.b);
            throw null;
        } else if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
    }
}
