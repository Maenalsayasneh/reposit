package com.clubhouse.android.data.models.remote.request;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import m0.n.b.f;
import m0.n.b.i;
import n0.c.e;
import n0.c.j.d;
import n0.c.k.e0;
import n0.c.k.g1;
import n0.c.k.h0;
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: GetClubRequest.kt */
public final class GetClubRequest {
    public static final Companion Companion = new Companion((f) null);
    public final Integer a;
    public final String b;
    public final String c;
    public final Map<String, Object> d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/remote/request/GetClubRequest$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/remote/request/GetClubRequest;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: GetClubRequest.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<GetClubRequest> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: GetClubRequest.kt */
    public static final class a implements v<GetClubRequest> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.remote.request.GetClubRequest", aVar, 4);
            pluginGeneratedSerialDescriptor.i("club_id", true);
            pluginGeneratedSerialDescriptor.i("slug", true);
            pluginGeneratedSerialDescriptor.i("invite_code", true);
            pluginGeneratedSerialDescriptor.i("logging_context", true);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            g1 g1Var = g1.b;
            return new KSerializer[]{m0.r.t.a.r.m.a1.a.R1(e0.b), m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(new h0(g1Var, i0.e.b.b3.a.b.c.a.a))};
        }

        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder r15) {
            /*
                r14 = this;
                java.lang.String r0 = "decoder"
                m0.n.b.i.e(r15, r0)
                kotlinx.serialization.descriptors.SerialDescriptor r0 = b
                n0.c.j.c r15 = r15.c(r0)
                boolean r1 = r15.y()
                r2 = 3
                r3 = 0
                r4 = 0
                r5 = 1
                r6 = 2
                if (r1 == 0) goto L_0x0035
                n0.c.k.e0 r1 = n0.c.k.e0.b
                java.lang.Object r1 = r15.v(r0, r4, r1, r3)
                n0.c.k.g1 r4 = n0.c.k.g1.b
                java.lang.Object r5 = r15.v(r0, r5, r4, r3)
                java.lang.Object r6 = r15.v(r0, r6, r4, r3)
                n0.c.k.h0 r7 = new n0.c.k.h0
                i0.e.b.b3.a.b.c.a r8 = i0.e.b.b3.a.b.c.a.a
                r7.<init>(r4, r8)
                java.lang.Object r2 = r15.v(r0, r2, r7, r3)
                r3 = 15
                r4 = r3
                goto L_0x0084
            L_0x0035:
                r1 = r3
                r7 = r1
                r8 = r7
                r9 = r8
                r3 = r4
                r10 = r5
            L_0x003b:
                if (r10 == 0) goto L_0x007f
                int r11 = r15.x(r0)
                r12 = -1
                if (r11 == r12) goto L_0x007d
                if (r11 == 0) goto L_0x0074
                if (r11 == r5) goto L_0x006b
                if (r11 == r6) goto L_0x0062
                if (r11 != r2) goto L_0x005c
                n0.c.k.h0 r11 = new n0.c.k.h0
                n0.c.k.g1 r12 = n0.c.k.g1.b
                i0.e.b.b3.a.b.c.a r13 = i0.e.b.b3.a.b.c.a.a
                r11.<init>(r12, r13)
                java.lang.Object r8 = r15.v(r0, r2, r11, r8)
                r3 = r3 | 8
                goto L_0x003b
            L_0x005c:
                kotlinx.serialization.UnknownFieldException r15 = new kotlinx.serialization.UnknownFieldException
                r15.<init>(r11)
                throw r15
            L_0x0062:
                n0.c.k.g1 r11 = n0.c.k.g1.b
                java.lang.Object r7 = r15.v(r0, r6, r11, r7)
                r3 = r3 | 4
                goto L_0x003b
            L_0x006b:
                n0.c.k.g1 r11 = n0.c.k.g1.b
                java.lang.Object r1 = r15.v(r0, r5, r11, r1)
                r3 = r3 | 2
                goto L_0x003b
            L_0x0074:
                n0.c.k.e0 r11 = n0.c.k.e0.b
                java.lang.Object r9 = r15.v(r0, r4, r11, r9)
                r3 = r3 | 1
                goto L_0x003b
            L_0x007d:
                r10 = r4
                goto L_0x003b
            L_0x007f:
                r5 = r1
                r4 = r3
                r6 = r7
                r2 = r8
                r1 = r9
            L_0x0084:
                r15.b(r0)
                com.clubhouse.android.data.models.remote.request.GetClubRequest r15 = new com.clubhouse.android.data.models.remote.request.GetClubRequest
                r0 = r1
                java.lang.Integer r0 = (java.lang.Integer) r0
                r1 = r5
                java.lang.String r1 = (java.lang.String) r1
                r7 = r6
                java.lang.String r7 = (java.lang.String) r7
                r8 = r2
                java.util.Map r8 = (java.util.Map) r8
                r3 = r15
                r5 = r0
                r6 = r1
                r3.<init>((int) r4, (java.lang.Integer) r5, (java.lang.String) r6, (java.lang.String) r7, (java.util.Map) r8)
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.models.remote.request.GetClubRequest.a.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            GetClubRequest getClubRequest = (GetClubRequest) obj;
            i.e(encoder, "encoder");
            i.e(getClubRequest, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(getClubRequest, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            boolean z = false;
            if (c.v(serialDescriptor, 0) || getClubRequest.a != null) {
                c.l(serialDescriptor, 0, e0.b, getClubRequest.a);
            }
            if (c.v(serialDescriptor, 1) || getClubRequest.b != null) {
                c.l(serialDescriptor, 1, g1.b, getClubRequest.b);
            }
            if (c.v(serialDescriptor, 2) || getClubRequest.c != null) {
                c.l(serialDescriptor, 2, g1.b, getClubRequest.c);
            }
            if (c.v(serialDescriptor, 3) || getClubRequest.d != null) {
                z = true;
            }
            if (z) {
                c.l(serialDescriptor, 3, new h0(g1.b, i0.e.b.b3.a.b.c.a.a), getClubRequest.d);
            }
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    public GetClubRequest() {
        this((Integer) null, (String) null, (String) null, (Map) null, 15);
    }

    public GetClubRequest(int i, Integer num, String str, String str2, Map map) {
        if ((i & 0) == 0) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = num;
            }
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
                this.d = map;
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
        if (!(obj instanceof GetClubRequest)) {
            return false;
        }
        GetClubRequest getClubRequest = (GetClubRequest) obj;
        return i.a(this.a, getClubRequest.a) && i.a(this.b, getClubRequest.b) && i.a(this.c, getClubRequest.c) && i.a(this.d, getClubRequest.d);
    }

    public int hashCode() {
        Integer num = this.a;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, Object> map = this.d;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("GetClubRequest(clubId=");
        P0.append(this.a);
        P0.append(", slug=");
        P0.append(this.b);
        P0.append(", inviteCode=");
        P0.append(this.c);
        P0.append(", loggingContext=");
        return i0.d.a.a.a.B0(P0, this.d, ')');
    }

    public GetClubRequest(Integer num, String str, String str2, Map<String, ? extends Object> map) {
        this.a = num;
        this.b = str;
        this.c = str2;
        this.d = map;
    }

    public GetClubRequest(Integer num, String str, String str2, Map map, int i) {
        int i2 = i & 2;
        int i3 = i & 4;
        int i4 = i & 8;
        this.a = (i & 1) != 0 ? null : num;
        this.b = null;
        this.c = null;
        this.d = null;
    }
}
