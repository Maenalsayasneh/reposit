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
/* compiled from: CheckForUpdateResponse.kt */
public final class CheckForUpdateResponse {
    public static final Companion Companion = new Companion((f) null);
    public final boolean a;
    public final Boolean b;
    public final String c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/remote/response/CheckForUpdateResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/remote/response/CheckForUpdateResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: CheckForUpdateResponse.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<CheckForUpdateResponse> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: CheckForUpdateResponse.kt */
    public static final class a implements v<CheckForUpdateResponse> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.remote.response.CheckForUpdateResponse", aVar, 3);
            pluginGeneratedSerialDescriptor.i("has_update", false);
            pluginGeneratedSerialDescriptor.i("is_mandatory", true);
            pluginGeneratedSerialDescriptor.i("app_url", true);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            h hVar = h.b;
            return new KSerializer[]{hVar, m0.r.t.a.r.m.a1.a.R1(hVar), m0.r.t.a.r.m.a1.a.R1(g1.b)};
        }

        public Object deserialize(Decoder decoder) {
            int i;
            Object obj;
            Object obj2;
            boolean z;
            i.e(decoder, "decoder");
            SerialDescriptor serialDescriptor = b;
            c c = decoder.c(serialDescriptor);
            Object obj3 = null;
            if (c.y()) {
                z = c.s(serialDescriptor, 0);
                obj = c.v(serialDescriptor, 1, h.b, null);
                obj2 = c.v(serialDescriptor, 2, g1.b, null);
                i = 7;
            } else {
                Object obj4 = null;
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
                        obj3 = c.v(serialDescriptor, 1, h.b, obj3);
                        i2 |= 2;
                    } else if (x == 2) {
                        obj4 = c.v(serialDescriptor, 2, g1.b, obj4);
                        i2 |= 4;
                    } else {
                        throw new UnknownFieldException(x);
                    }
                }
                obj = obj3;
                obj2 = obj4;
                i = i2;
            }
            c.b(serialDescriptor);
            return new CheckForUpdateResponse(i, z, (Boolean) obj, (String) obj2);
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            CheckForUpdateResponse checkForUpdateResponse = (CheckForUpdateResponse) obj;
            i.e(encoder, "encoder");
            i.e(checkForUpdateResponse, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(checkForUpdateResponse, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            boolean z = false;
            c.r(serialDescriptor, 0, checkForUpdateResponse.a);
            if (c.v(serialDescriptor, 1) || checkForUpdateResponse.b != null) {
                c.l(serialDescriptor, 1, h.b, checkForUpdateResponse.b);
            }
            if (c.v(serialDescriptor, 2) || checkForUpdateResponse.c != null) {
                z = true;
            }
            if (z) {
                c.l(serialDescriptor, 2, g1.b, checkForUpdateResponse.c);
            }
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    public CheckForUpdateResponse(int i, boolean z, Boolean bool, String str) {
        if (1 == (i & 1)) {
            this.a = z;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = bool;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str;
            }
        } else {
            a aVar = a.a;
            m0.r.t.a.r.m.a1.a.W3(i, 1, a.b);
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckForUpdateResponse)) {
            return false;
        }
        CheckForUpdateResponse checkForUpdateResponse = (CheckForUpdateResponse) obj;
        return this.a == checkForUpdateResponse.a && i.a(this.b, checkForUpdateResponse.b) && i.a(this.c, checkForUpdateResponse.c);
    }

    public int hashCode() {
        boolean z = this.a;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        Boolean bool = this.b;
        int i2 = 0;
        int hashCode = (i + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.c;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("CheckForUpdateResponse(hasUpdate=");
        P0.append(this.a);
        P0.append(", isMandatory=");
        P0.append(this.b);
        P0.append(", appUrl=");
        return i0.d.a.a.a.w0(P0, this.c, ')');
    }
}
