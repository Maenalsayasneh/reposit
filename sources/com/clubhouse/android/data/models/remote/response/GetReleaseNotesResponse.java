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
/* compiled from: GetReleaseNotesResponse.kt */
public final class GetReleaseNotesResponse {
    public static final Companion Companion = new Companion((f) null);
    public final Boolean a;
    public final String b;
    public final String c;
    public final String d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/remote/response/GetReleaseNotesResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/remote/response/GetReleaseNotesResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: GetReleaseNotesResponse.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<GetReleaseNotesResponse> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: GetReleaseNotesResponse.kt */
    public static final class a implements v<GetReleaseNotesResponse> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.remote.response.GetReleaseNotesResponse", aVar, 4);
            pluginGeneratedSerialDescriptor.i("should_display", true);
            pluginGeneratedSerialDescriptor.i(InstabugDbContract.FeatureRequestEntry.COLUMN_TITLE, true);
            pluginGeneratedSerialDescriptor.i("action", true);
            pluginGeneratedSerialDescriptor.i("url", true);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            g1 g1Var = g1.b;
            return new KSerializer[]{m0.r.t.a.r.m.a1.a.R1(h.b), m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(g1Var)};
        }

        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder r14) {
            /*
                r13 = this;
                java.lang.String r0 = "decoder"
                m0.n.b.i.e(r14, r0)
                kotlinx.serialization.descriptors.SerialDescriptor r0 = b
                n0.c.j.c r14 = r14.c(r0)
                boolean r1 = r14.y()
                r2 = 3
                r3 = 0
                r4 = 0
                r5 = 1
                r6 = 2
                if (r1 == 0) goto L_0x002e
                n0.c.k.h r1 = n0.c.k.h.b
                java.lang.Object r1 = r14.v(r0, r4, r1, r3)
                n0.c.k.g1 r4 = n0.c.k.g1.b
                java.lang.Object r5 = r14.v(r0, r5, r4, r3)
                java.lang.Object r6 = r14.v(r0, r6, r4, r3)
                java.lang.Object r2 = r14.v(r0, r2, r4, r3)
                r3 = 15
                r4 = r3
                goto L_0x0076
            L_0x002e:
                r1 = r3
                r7 = r1
                r8 = r7
                r9 = r8
                r3 = r4
                r10 = r5
            L_0x0034:
                if (r10 == 0) goto L_0x0071
                int r11 = r14.x(r0)
                r12 = -1
                if (r11 == r12) goto L_0x006f
                if (r11 == 0) goto L_0x0066
                if (r11 == r5) goto L_0x005d
                if (r11 == r6) goto L_0x0054
                if (r11 != r2) goto L_0x004e
                n0.c.k.g1 r11 = n0.c.k.g1.b
                java.lang.Object r8 = r14.v(r0, r2, r11, r8)
                r3 = r3 | 8
                goto L_0x0034
            L_0x004e:
                kotlinx.serialization.UnknownFieldException r14 = new kotlinx.serialization.UnknownFieldException
                r14.<init>(r11)
                throw r14
            L_0x0054:
                n0.c.k.g1 r11 = n0.c.k.g1.b
                java.lang.Object r7 = r14.v(r0, r6, r11, r7)
                r3 = r3 | 4
                goto L_0x0034
            L_0x005d:
                n0.c.k.g1 r11 = n0.c.k.g1.b
                java.lang.Object r1 = r14.v(r0, r5, r11, r1)
                r3 = r3 | 2
                goto L_0x0034
            L_0x0066:
                n0.c.k.h r11 = n0.c.k.h.b
                java.lang.Object r9 = r14.v(r0, r4, r11, r9)
                r3 = r3 | 1
                goto L_0x0034
            L_0x006f:
                r10 = r4
                goto L_0x0034
            L_0x0071:
                r5 = r1
                r4 = r3
                r6 = r7
                r2 = r8
                r1 = r9
            L_0x0076:
                r14.b(r0)
                com.clubhouse.android.data.models.remote.response.GetReleaseNotesResponse r14 = new com.clubhouse.android.data.models.remote.response.GetReleaseNotesResponse
                r0 = r1
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                r1 = r5
                java.lang.String r1 = (java.lang.String) r1
                r7 = r6
                java.lang.String r7 = (java.lang.String) r7
                r8 = r2
                java.lang.String r8 = (java.lang.String) r8
                r3 = r14
                r5 = r0
                r6 = r1
                r3.<init>(r4, r5, r6, r7, r8)
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.models.remote.response.GetReleaseNotesResponse.a.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            GetReleaseNotesResponse getReleaseNotesResponse = (GetReleaseNotesResponse) obj;
            i.e(encoder, "encoder");
            i.e(getReleaseNotesResponse, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(getReleaseNotesResponse, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            boolean z = false;
            if (c.v(serialDescriptor, 0) || !i.a(getReleaseNotesResponse.a, Boolean.FALSE)) {
                c.l(serialDescriptor, 0, h.b, getReleaseNotesResponse.a);
            }
            if (c.v(serialDescriptor, 1) || getReleaseNotesResponse.b != null) {
                c.l(serialDescriptor, 1, g1.b, getReleaseNotesResponse.b);
            }
            if (c.v(serialDescriptor, 2) || getReleaseNotesResponse.c != null) {
                c.l(serialDescriptor, 2, g1.b, getReleaseNotesResponse.c);
            }
            if (c.v(serialDescriptor, 3) || getReleaseNotesResponse.d != null) {
                z = true;
            }
            if (z) {
                c.l(serialDescriptor, 3, g1.b, getReleaseNotesResponse.d);
            }
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    public GetReleaseNotesResponse(int i, Boolean bool, String str, String str2, String str3) {
        if ((i & 0) == 0) {
            this.a = (i & 1) == 0 ? Boolean.FALSE : bool;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str2;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = str3;
            }
        } else {
            a aVar = a.a;
            m0.r.t.a.r.m.a1.a.W3(i, 0, a.b);
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetReleaseNotesResponse)) {
            return false;
        }
        GetReleaseNotesResponse getReleaseNotesResponse = (GetReleaseNotesResponse) obj;
        return i.a(this.a, getReleaseNotesResponse.a) && i.a(this.b, getReleaseNotesResponse.b) && i.a(this.c, getReleaseNotesResponse.c) && i.a(this.d, getReleaseNotesResponse.d);
    }

    public int hashCode() {
        Boolean bool = this.a;
        int i = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("GetReleaseNotesResponse(shouldDisplay=");
        P0.append(this.a);
        P0.append(", title=");
        P0.append(this.b);
        P0.append(", action=");
        P0.append(this.c);
        P0.append(", url=");
        return i0.d.a.a.a.w0(P0, this.d, ')');
    }

    public GetReleaseNotesResponse() {
        this.a = Boolean.FALSE;
        this.b = null;
        this.c = null;
        this.d = null;
    }
}
