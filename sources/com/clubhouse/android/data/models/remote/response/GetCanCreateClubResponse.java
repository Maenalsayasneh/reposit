package com.clubhouse.android.data.models.remote.response;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import m0.n.b.f;
import m0.n.b.i;
import n0.c.e;
import n0.c.j.d;
import n0.c.k.g1;
import n0.c.k.h;
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: GetCanCreateClubResponse.kt */
public final class GetCanCreateClubResponse {
    public static final Companion Companion = new Companion((f) null);
    public final boolean a;
    public final boolean b;
    public final String c;
    public final String d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/remote/response/GetCanCreateClubResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/remote/response/GetCanCreateClubResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: GetCanCreateClubResponse.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<GetCanCreateClubResponse> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: GetCanCreateClubResponse.kt */
    public static final class a implements v<GetCanCreateClubResponse> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.remote.response.GetCanCreateClubResponse", aVar, 4);
            pluginGeneratedSerialDescriptor.i("success", false);
            pluginGeneratedSerialDescriptor.i("can_create_club", false);
            pluginGeneratedSerialDescriptor.i("reason_title", true);
            pluginGeneratedSerialDescriptor.i("reason_message", true);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            h hVar = h.b;
            g1 g1Var = g1.b;
            return new KSerializer[]{hVar, hVar, m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(g1Var)};
        }

        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder r19) {
            /*
                r18 = this;
                r0 = r19
                java.lang.String r1 = "decoder"
                m0.n.b.i.e(r0, r1)
                kotlinx.serialization.descriptors.SerialDescriptor r1 = b
                n0.c.j.c r0 = r0.c(r1)
                boolean r2 = r0.y()
                r3 = 0
                r4 = 3
                r5 = 0
                r6 = 1
                r7 = 2
                if (r2 == 0) goto L_0x0030
                boolean r2 = r0.s(r1, r5)
                boolean r5 = r0.s(r1, r6)
                n0.c.k.g1 r6 = n0.c.k.g1.b
                java.lang.Object r7 = r0.v(r1, r7, r6, r3)
                java.lang.Object r3 = r0.v(r1, r4, r6, r3)
                r4 = 15
                r14 = r2
                r13 = r4
                r15 = r5
                goto L_0x0073
            L_0x0030:
                r8 = r3
                r2 = r5
                r9 = r2
                r10 = r9
                r11 = r6
            L_0x0035:
                if (r11 == 0) goto L_0x006e
                int r12 = r0.x(r1)
                r13 = -1
                if (r12 == r13) goto L_0x006c
                if (r12 == 0) goto L_0x0065
                if (r12 == r6) goto L_0x005e
                if (r12 == r7) goto L_0x0055
                if (r12 != r4) goto L_0x004f
                n0.c.k.g1 r12 = n0.c.k.g1.b
                java.lang.Object r8 = r0.v(r1, r4, r12, r8)
                r9 = r9 | 8
                goto L_0x0035
            L_0x004f:
                kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
                r0.<init>(r12)
                throw r0
            L_0x0055:
                n0.c.k.g1 r12 = n0.c.k.g1.b
                java.lang.Object r3 = r0.v(r1, r7, r12, r3)
                r9 = r9 | 4
                goto L_0x0035
            L_0x005e:
                boolean r10 = r0.s(r1, r6)
                r9 = r9 | 2
                goto L_0x0035
            L_0x0065:
                boolean r2 = r0.s(r1, r5)
                r9 = r9 | 1
                goto L_0x0035
            L_0x006c:
                r11 = r5
                goto L_0x0035
            L_0x006e:
                r14 = r2
                r7 = r3
                r3 = r8
                r13 = r9
                r15 = r10
            L_0x0073:
                r0.b(r1)
                com.clubhouse.android.data.models.remote.response.GetCanCreateClubResponse r0 = new com.clubhouse.android.data.models.remote.response.GetCanCreateClubResponse
                r16 = r7
                java.lang.String r16 = (java.lang.String) r16
                r17 = r3
                java.lang.String r17 = (java.lang.String) r17
                r12 = r0
                r12.<init>(r13, r14, r15, r16, r17)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.models.remote.response.GetCanCreateClubResponse.a.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            GetCanCreateClubResponse getCanCreateClubResponse = (GetCanCreateClubResponse) obj;
            i.e(encoder, "encoder");
            i.e(getCanCreateClubResponse, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(getCanCreateClubResponse, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            boolean z = false;
            c.r(serialDescriptor, 0, getCanCreateClubResponse.a);
            c.r(serialDescriptor, 1, getCanCreateClubResponse.b);
            if (c.v(serialDescriptor, 2) || getCanCreateClubResponse.c != null) {
                c.l(serialDescriptor, 2, g1.b, getCanCreateClubResponse.c);
            }
            if (c.v(serialDescriptor, 3) || getCanCreateClubResponse.d != null) {
                z = true;
            }
            if (z) {
                c.l(serialDescriptor, 3, g1.b, getCanCreateClubResponse.d);
            }
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    public GetCanCreateClubResponse(int i, boolean z, boolean z2, String str, String str2) {
        if (3 == (i & 3)) {
            this.a = z;
            this.b = z2;
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = str2;
            }
        } else {
            a aVar = a.a;
            m0.r.t.a.r.m.a1.a.W3(i, 3, a.b);
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetCanCreateClubResponse)) {
            return false;
        }
        GetCanCreateClubResponse getCanCreateClubResponse = (GetCanCreateClubResponse) obj;
        return this.a == getCanCreateClubResponse.a && this.b == getCanCreateClubResponse.b && i.a(this.c, getCanCreateClubResponse.c) && i.a(this.d, getCanCreateClubResponse.d);
    }

    public int hashCode() {
        boolean z = this.a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.b;
        if (!z3) {
            z2 = z3;
        }
        int i2 = (i + (z2 ? 1 : 0)) * 31;
        String str = this.c;
        int i3 = 0;
        int hashCode = (i2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return hashCode + i3;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("GetCanCreateClubResponse(success=");
        P0.append(this.a);
        P0.append(", canCreateClub=");
        P0.append(this.b);
        P0.append(", reasonTitle=");
        P0.append(this.c);
        P0.append(", reasonMessage=");
        return i0.d.a.a.a.w0(P0, this.d, ')');
    }
}
