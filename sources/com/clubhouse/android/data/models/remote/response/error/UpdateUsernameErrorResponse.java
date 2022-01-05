package com.clubhouse.android.data.models.remote.response.error;

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
/* compiled from: UpdateUsernameErrorResponse.kt */
public final class UpdateUsernameErrorResponse extends ErrorResponse {
    public static final Companion Companion = new Companion((f) null);
    public final String a;
    public final String b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/remote/response/error/UpdateUsernameErrorResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/remote/response/error/UpdateUsernameErrorResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: UpdateUsernameErrorResponse.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<UpdateUsernameErrorResponse> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: UpdateUsernameErrorResponse.kt */
    public static final class a implements v<UpdateUsernameErrorResponse> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.remote.response.error.UpdateUsernameErrorResponse", aVar, 2);
            pluginGeneratedSerialDescriptor.i("suggested_username", false);
            pluginGeneratedSerialDescriptor.i("error_message", false);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            g1 g1Var = g1.b;
            return new KSerializer[]{m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(g1Var)};
        }

        public Object deserialize(Decoder decoder) {
            Object obj;
            int i;
            Object obj2;
            i.e(decoder, "decoder");
            SerialDescriptor serialDescriptor = b;
            c c = decoder.c(serialDescriptor);
            Object obj3 = null;
            if (c.y()) {
                g1 g1Var = g1.b;
                obj = c.v(serialDescriptor, 0, g1Var, null);
                obj2 = c.v(serialDescriptor, 1, g1Var, null);
                i = 3;
            } else {
                obj2 = null;
                int i2 = 0;
                boolean z = true;
                while (z) {
                    int x = c.x(serialDescriptor);
                    if (x == -1) {
                        z = false;
                    } else if (x == 0) {
                        obj3 = c.v(serialDescriptor, 0, g1.b, obj3);
                        i2 |= 1;
                    } else if (x == 1) {
                        obj2 = c.v(serialDescriptor, 1, g1.b, obj2);
                        i2 |= 2;
                    } else {
                        throw new UnknownFieldException(x);
                    }
                }
                obj = obj3;
                i = i2;
            }
            c.b(serialDescriptor);
            return new UpdateUsernameErrorResponse(i, (String) obj, (String) obj2);
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            UpdateUsernameErrorResponse updateUsernameErrorResponse = (UpdateUsernameErrorResponse) obj;
            i.e(encoder, "encoder");
            i.e(updateUsernameErrorResponse, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(updateUsernameErrorResponse, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            g1 g1Var = g1.b;
            c.l(serialDescriptor, 0, g1Var, updateUsernameErrorResponse.a);
            c.l(serialDescriptor, 1, g1Var, updateUsernameErrorResponse.b);
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdateUsernameErrorResponse(int i, String str, String str2) {
        super((f) null);
        if (3 == (i & 3)) {
            this.a = str;
            this.b = str2;
            return;
        }
        a aVar = a.a;
        m0.r.t.a.r.m.a1.a.W3(i, 3, a.b);
        throw null;
    }

    public String a() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateUsernameErrorResponse)) {
            return false;
        }
        UpdateUsernameErrorResponse updateUsernameErrorResponse = (UpdateUsernameErrorResponse) obj;
        return i.a(this.a, updateUsernameErrorResponse.a) && i.a(this.b, updateUsernameErrorResponse.b);
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("UpdateUsernameErrorResponse(suggestedUsername=");
        P0.append(this.a);
        P0.append(", errorMessage=");
        return i0.d.a.a.a.w0(P0, this.b, ')');
    }
}
