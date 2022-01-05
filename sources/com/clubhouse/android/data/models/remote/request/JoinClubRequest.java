package com.clubhouse.android.data.models.remote.request;

import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.stripe.android.model.Stripe3ds2AuthParams;
import i0.e.b.b3.a.b.c.h;
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
/* compiled from: JoinClubRequest.kt */
public final class JoinClubRequest {
    public static final Companion Companion = new Companion((f) null);
    public final Integer a;
    public final String b;
    public final SourceLocation c;
    public final Map<String, Object> d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/remote/request/JoinClubRequest$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/remote/request/JoinClubRequest;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: JoinClubRequest.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<JoinClubRequest> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: JoinClubRequest.kt */
    public static final class a implements v<JoinClubRequest> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.remote.request.JoinClubRequest", aVar, 4);
            pluginGeneratedSerialDescriptor.i("club_id", true);
            pluginGeneratedSerialDescriptor.i("reason", true);
            pluginGeneratedSerialDescriptor.i(Stripe3ds2AuthParams.FIELD_SOURCE, true);
            pluginGeneratedSerialDescriptor.i("logging_context", true);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            g1 g1Var = g1.b;
            return new KSerializer[]{m0.r.t.a.r.m.a1.a.R1(e0.b), m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(h.a), m0.r.t.a.r.m.a1.a.R1(new h0(g1Var, i0.e.b.b3.a.b.c.a.a))};
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
                if (r1 == 0) goto L_0x0037
                n0.c.k.e0 r1 = n0.c.k.e0.b
                java.lang.Object r1 = r15.v(r0, r4, r1, r3)
                n0.c.k.g1 r4 = n0.c.k.g1.b
                java.lang.Object r5 = r15.v(r0, r5, r4, r3)
                i0.e.b.b3.a.b.c.h r7 = i0.e.b.b3.a.b.c.h.a
                java.lang.Object r6 = r15.v(r0, r6, r7, r3)
                n0.c.k.h0 r7 = new n0.c.k.h0
                i0.e.b.b3.a.b.c.a r8 = i0.e.b.b3.a.b.c.a.a
                r7.<init>(r4, r8)
                java.lang.Object r2 = r15.v(r0, r2, r7, r3)
                r3 = 15
                r4 = r3
                goto L_0x0086
            L_0x0037:
                r1 = r3
                r7 = r1
                r8 = r7
                r9 = r8
                r3 = r4
                r10 = r5
            L_0x003d:
                if (r10 == 0) goto L_0x0081
                int r11 = r15.x(r0)
                r12 = -1
                if (r11 == r12) goto L_0x007f
                if (r11 == 0) goto L_0x0076
                if (r11 == r5) goto L_0x006d
                if (r11 == r6) goto L_0x0064
                if (r11 != r2) goto L_0x005e
                n0.c.k.h0 r11 = new n0.c.k.h0
                n0.c.k.g1 r12 = n0.c.k.g1.b
                i0.e.b.b3.a.b.c.a r13 = i0.e.b.b3.a.b.c.a.a
                r11.<init>(r12, r13)
                java.lang.Object r8 = r15.v(r0, r2, r11, r8)
                r3 = r3 | 8
                goto L_0x003d
            L_0x005e:
                kotlinx.serialization.UnknownFieldException r15 = new kotlinx.serialization.UnknownFieldException
                r15.<init>(r11)
                throw r15
            L_0x0064:
                i0.e.b.b3.a.b.c.h r11 = i0.e.b.b3.a.b.c.h.a
                java.lang.Object r7 = r15.v(r0, r6, r11, r7)
                r3 = r3 | 4
                goto L_0x003d
            L_0x006d:
                n0.c.k.g1 r11 = n0.c.k.g1.b
                java.lang.Object r1 = r15.v(r0, r5, r11, r1)
                r3 = r3 | 2
                goto L_0x003d
            L_0x0076:
                n0.c.k.e0 r11 = n0.c.k.e0.b
                java.lang.Object r9 = r15.v(r0, r4, r11, r9)
                r3 = r3 | 1
                goto L_0x003d
            L_0x007f:
                r10 = r4
                goto L_0x003d
            L_0x0081:
                r5 = r1
                r4 = r3
                r6 = r7
                r2 = r8
                r1 = r9
            L_0x0086:
                r15.b(r0)
                com.clubhouse.android.data.models.remote.request.JoinClubRequest r15 = new com.clubhouse.android.data.models.remote.request.JoinClubRequest
                r0 = r1
                java.lang.Integer r0 = (java.lang.Integer) r0
                r1 = r5
                java.lang.String r1 = (java.lang.String) r1
                r7 = r6
                com.clubhouse.android.data.models.local.user.SourceLocation r7 = (com.clubhouse.android.data.models.local.user.SourceLocation) r7
                r8 = r2
                java.util.Map r8 = (java.util.Map) r8
                r3 = r15
                r5 = r0
                r6 = r1
                r3.<init>(r4, r5, r6, r7, r8)
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.models.remote.request.JoinClubRequest.a.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            JoinClubRequest joinClubRequest = (JoinClubRequest) obj;
            i.e(encoder, "encoder");
            i.e(joinClubRequest, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(joinClubRequest, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            boolean z = false;
            if (c.v(serialDescriptor, 0) || joinClubRequest.a != null) {
                c.l(serialDescriptor, 0, e0.b, joinClubRequest.a);
            }
            if (c.v(serialDescriptor, 1) || joinClubRequest.b != null) {
                c.l(serialDescriptor, 1, g1.b, joinClubRequest.b);
            }
            if (c.v(serialDescriptor, 2) || joinClubRequest.c != null) {
                c.l(serialDescriptor, 2, h.a, joinClubRequest.c);
            }
            if (c.v(serialDescriptor, 3) || joinClubRequest.d != null) {
                z = true;
            }
            if (z) {
                c.l(serialDescriptor, 3, new h0(g1.b, i0.e.b.b3.a.b.c.a.a), joinClubRequest.d);
            }
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    public JoinClubRequest() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JoinClubRequest)) {
            return false;
        }
        JoinClubRequest joinClubRequest = (JoinClubRequest) obj;
        return i.a(this.a, joinClubRequest.a) && i.a(this.b, joinClubRequest.b) && this.c == joinClubRequest.c && i.a(this.d, joinClubRequest.d);
    }

    public int hashCode() {
        Integer num = this.a;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        SourceLocation sourceLocation = this.c;
        int hashCode3 = (hashCode2 + (sourceLocation == null ? 0 : sourceLocation.hashCode())) * 31;
        Map<String, Object> map = this.d;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("JoinClubRequest(clubId=");
        P0.append(this.a);
        P0.append(", reason=");
        P0.append(this.b);
        P0.append(", source=");
        P0.append(this.c);
        P0.append(", loggingContext=");
        return i0.d.a.a.a.B0(P0, this.d, ')');
    }

    public JoinClubRequest(int i, Integer num, String str, SourceLocation sourceLocation, Map map) {
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
                this.c = sourceLocation;
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

    public JoinClubRequest(Integer num, String str, SourceLocation sourceLocation, Map<String, ? extends Object> map) {
        this.a = num;
        this.b = str;
        this.c = sourceLocation;
        this.d = map;
    }
}
