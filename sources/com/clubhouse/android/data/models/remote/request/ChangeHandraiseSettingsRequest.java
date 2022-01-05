package com.clubhouse.android.data.models.remote.request;

import com.clubhouse.android.data.models.local.channel.HandraisePermission;
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
/* compiled from: ChangeHandraiseSettingsRequest.kt */
public final class ChangeHandraiseSettingsRequest {
    public static final Companion Companion = new Companion((f) null);
    public final String a;
    public final boolean b;
    public final HandraisePermission c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/remote/request/ChangeHandraiseSettingsRequest$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/remote/request/ChangeHandraiseSettingsRequest;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: ChangeHandraiseSettingsRequest.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<ChangeHandraiseSettingsRequest> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: ChangeHandraiseSettingsRequest.kt */
    public static final class a implements v<ChangeHandraiseSettingsRequest> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.remote.request.ChangeHandraiseSettingsRequest", aVar, 3);
            pluginGeneratedSerialDescriptor.i(Include.INCLUDE_CHANNEL_PARAM_VALUE, false);
            pluginGeneratedSerialDescriptor.i("is_enabled", false);
            pluginGeneratedSerialDescriptor.i("handraise_permission", false);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            return new KSerializer[]{g1.b, h.b, i0.e.b.b3.a.b.c.e.a};
        }

        public Object deserialize(Decoder decoder) {
            int i;
            boolean z;
            Object obj;
            String str;
            i.e(decoder, "decoder");
            SerialDescriptor serialDescriptor = b;
            c c = decoder.c(serialDescriptor);
            String str2 = null;
            if (c.y()) {
                str = c.t(serialDescriptor, 0);
                z = c.s(serialDescriptor, 1);
                obj = c.m(serialDescriptor, 2, i0.e.b.b3.a.b.c.e.a, null);
                i = 7;
            } else {
                Object obj2 = null;
                boolean z2 = false;
                int i2 = 0;
                boolean z3 = true;
                while (z3) {
                    int x = c.x(serialDescriptor);
                    if (x == -1) {
                        z3 = false;
                    } else if (x == 0) {
                        str2 = c.t(serialDescriptor, 0);
                        i2 |= 1;
                    } else if (x == 1) {
                        z2 = c.s(serialDescriptor, 1);
                        i2 |= 2;
                    } else if (x == 2) {
                        obj2 = c.m(serialDescriptor, 2, i0.e.b.b3.a.b.c.e.a, obj2);
                        i2 |= 4;
                    } else {
                        throw new UnknownFieldException(x);
                    }
                }
                z = z2;
                i = i2;
                String str3 = str2;
                obj = obj2;
                str = str3;
            }
            c.b(serialDescriptor);
            return new ChangeHandraiseSettingsRequest(i, str, z, (HandraisePermission) obj);
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            ChangeHandraiseSettingsRequest changeHandraiseSettingsRequest = (ChangeHandraiseSettingsRequest) obj;
            i.e(encoder, "encoder");
            i.e(changeHandraiseSettingsRequest, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(changeHandraiseSettingsRequest, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            c.s(serialDescriptor, 0, changeHandraiseSettingsRequest.a);
            c.r(serialDescriptor, 1, changeHandraiseSettingsRequest.b);
            c.z(serialDescriptor, 2, i0.e.b.b3.a.b.c.e.a, changeHandraiseSettingsRequest.c);
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    public ChangeHandraiseSettingsRequest(int i, String str, boolean z, HandraisePermission handraisePermission) {
        if (7 == (i & 7)) {
            this.a = str;
            this.b = z;
            this.c = handraisePermission;
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
        if (!(obj instanceof ChangeHandraiseSettingsRequest)) {
            return false;
        }
        ChangeHandraiseSettingsRequest changeHandraiseSettingsRequest = (ChangeHandraiseSettingsRequest) obj;
        return i.a(this.a, changeHandraiseSettingsRequest.a) && this.b == changeHandraiseSettingsRequest.b && this.c == changeHandraiseSettingsRequest.c;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        boolean z = this.b;
        if (z) {
            z = true;
        }
        return this.c.hashCode() + ((hashCode + (z ? 1 : 0)) * 31);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ChangeHandraiseSettingsRequest(channel=");
        P0.append(this.a);
        P0.append(", isEnabled=");
        P0.append(this.b);
        P0.append(", handraisePermission=");
        P0.append(this.c);
        P0.append(')');
        return P0.toString();
    }

    public ChangeHandraiseSettingsRequest(String str, boolean z, HandraisePermission handraisePermission) {
        i.e(str, Include.INCLUDE_CHANNEL_PARAM_VALUE);
        i.e(handraisePermission, "handraisePermission");
        this.a = str;
        this.b = z;
        this.c = handraisePermission;
    }
}
