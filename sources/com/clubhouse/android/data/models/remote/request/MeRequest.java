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
import n0.c.k.h;
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: MeRequest.kt */
public final class MeRequest {
    public static final Companion Companion = new Companion((f) null);
    public final boolean a;
    public final String b;
    public final boolean c;
    public final String d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/remote/request/MeRequest$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/remote/request/MeRequest;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: MeRequest.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<MeRequest> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: MeRequest.kt */
    public static final class a implements v<MeRequest> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.remote.request.MeRequest", aVar, 4);
            pluginGeneratedSerialDescriptor.i("return_blocked_ids", false);
            pluginGeneratedSerialDescriptor.i("timezone_identifier", false);
            pluginGeneratedSerialDescriptor.i("return_following_ids", false);
            pluginGeneratedSerialDescriptor.i("keyboard_languages", false);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            h hVar = h.b;
            g1 g1Var = g1.b;
            return new KSerializer[]{hVar, g1Var, hVar, g1Var};
        }

        public Object deserialize(Decoder decoder) {
            String str;
            boolean z;
            String str2;
            boolean z2;
            int i;
            Decoder decoder2 = decoder;
            i.e(decoder2, "decoder");
            SerialDescriptor serialDescriptor = b;
            c c = decoder2.c(serialDescriptor);
            if (c.y()) {
                boolean s = c.s(serialDescriptor, 0);
                String t = c.t(serialDescriptor, 1);
                boolean s2 = c.s(serialDescriptor, 2);
                z2 = s;
                str = c.t(serialDescriptor, 3);
                str2 = t;
                z = s2;
                i = 15;
            } else {
                String str3 = null;
                String str4 = null;
                boolean z3 = false;
                boolean z4 = false;
                int i2 = 0;
                boolean z5 = true;
                while (z5) {
                    int x = c.x(serialDescriptor);
                    if (x == -1) {
                        z5 = false;
                    } else if (x == 0) {
                        z3 = c.s(serialDescriptor, 0);
                        i2 |= 1;
                    } else if (x == 1) {
                        str4 = c.t(serialDescriptor, 1);
                        i2 |= 2;
                    } else if (x == 2) {
                        z4 = c.s(serialDescriptor, 2);
                        i2 |= 4;
                    } else if (x == 3) {
                        str3 = c.t(serialDescriptor, 3);
                        i2 |= 8;
                    } else {
                        throw new UnknownFieldException(x);
                    }
                }
                z2 = z3;
                str = str3;
                str2 = str4;
                z = z4;
                i = i2;
            }
            c.b(serialDescriptor);
            return new MeRequest(i, z2, str2, z, str);
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            MeRequest meRequest = (MeRequest) obj;
            i.e(encoder, "encoder");
            i.e(meRequest, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(meRequest, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            c.r(serialDescriptor, 0, meRequest.a);
            c.s(serialDescriptor, 1, meRequest.b);
            c.r(serialDescriptor, 2, meRequest.c);
            c.s(serialDescriptor, 3, meRequest.d);
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    public MeRequest(int i, boolean z, String str, boolean z2, String str2) {
        if (15 == (i & 15)) {
            this.a = z;
            this.b = str;
            this.c = z2;
            this.d = str2;
            return;
        }
        a aVar = a.a;
        m0.r.t.a.r.m.a1.a.W3(i, 15, a.b);
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MeRequest)) {
            return false;
        }
        MeRequest meRequest = (MeRequest) obj;
        return this.a == meRequest.a && i.a(this.b, meRequest.b) && this.c == meRequest.c && i.a(this.d, meRequest.d);
    }

    public int hashCode() {
        boolean z = this.a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int F = i0.d.a.a.a.F(this.b, (z ? 1 : 0) * true, 31);
        boolean z3 = this.c;
        if (!z3) {
            z2 = z3;
        }
        return this.d.hashCode() + ((F + (z2 ? 1 : 0)) * 31);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("MeRequest(returnBlocked=");
        P0.append(this.a);
        P0.append(", timezoneIdentifier=");
        P0.append(this.b);
        P0.append(", returnFollowing=");
        P0.append(this.c);
        P0.append(", keyboardLanguages=");
        return i0.d.a.a.a.x0(P0, this.d, ')');
    }

    public MeRequest(boolean z, String str, boolean z2, String str2) {
        i.e(str, "timezoneIdentifier");
        i.e(str2, "keyboardLanguages");
        this.a = z;
        this.b = str;
        this.c = z2;
        this.d = str2;
    }
}
