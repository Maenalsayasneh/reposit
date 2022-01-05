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
/* compiled from: FollowRequest.kt */
public final class FollowRequest {
    public static final Companion Companion = new Companion((f) null);
    public final int a;
    public final SourceLocation b;
    public final String c;
    public final Map<String, Object> d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/remote/request/FollowRequest$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/remote/request/FollowRequest;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: FollowRequest.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<FollowRequest> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: FollowRequest.kt */
    public static final class a implements v<FollowRequest> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.remote.request.FollowRequest", aVar, 4);
            pluginGeneratedSerialDescriptor.i("user_id", false);
            pluginGeneratedSerialDescriptor.i(Stripe3ds2AuthParams.FIELD_SOURCE, false);
            pluginGeneratedSerialDescriptor.i("rc_token", true);
            pluginGeneratedSerialDescriptor.i("logging_context", true);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            g1 g1Var = g1.b;
            return new KSerializer[]{e0.b, h.a, m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(new h0(g1Var, i0.e.b.b3.a.b.c.a.a))};
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
                r3 = 3
                r4 = 0
                r5 = 0
                r6 = 1
                r7 = 2
                if (r2 == 0) goto L_0x0038
                int r2 = r0.k(r1, r5)
                i0.e.b.b3.a.b.c.h r5 = i0.e.b.b3.a.b.c.h.a
                java.lang.Object r5 = r0.m(r1, r6, r5, r4)
                n0.c.k.g1 r6 = n0.c.k.g1.b
                java.lang.Object r7 = r0.v(r1, r7, r6, r4)
                n0.c.k.h0 r8 = new n0.c.k.h0
                i0.e.b.b3.a.b.c.a r9 = i0.e.b.b3.a.b.c.a.a
                r8.<init>(r6, r9)
                java.lang.Object r3 = r0.v(r1, r3, r8, r4)
                r4 = 15
                r14 = r2
                r13 = r4
                goto L_0x0085
            L_0x0038:
                r8 = r4
                r9 = r8
                r10 = r9
                r2 = r5
                r4 = r2
                r11 = r6
            L_0x003e:
                if (r11 == 0) goto L_0x0080
                int r12 = r0.x(r1)
                r13 = -1
                if (r12 == r13) goto L_0x007e
                if (r12 == 0) goto L_0x0077
                if (r12 == r6) goto L_0x006e
                if (r12 == r7) goto L_0x0065
                if (r12 != r3) goto L_0x005f
                n0.c.k.h0 r12 = new n0.c.k.h0
                n0.c.k.g1 r13 = n0.c.k.g1.b
                i0.e.b.b3.a.b.c.a r14 = i0.e.b.b3.a.b.c.a.a
                r12.<init>(r13, r14)
                java.lang.Object r10 = r0.v(r1, r3, r12, r10)
                r4 = r4 | 8
                goto L_0x003e
            L_0x005f:
                kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
                r0.<init>(r12)
                throw r0
            L_0x0065:
                n0.c.k.g1 r12 = n0.c.k.g1.b
                java.lang.Object r9 = r0.v(r1, r7, r12, r9)
                r4 = r4 | 4
                goto L_0x003e
            L_0x006e:
                i0.e.b.b3.a.b.c.h r12 = i0.e.b.b3.a.b.c.h.a
                java.lang.Object r8 = r0.m(r1, r6, r12, r8)
                r4 = r4 | 2
                goto L_0x003e
            L_0x0077:
                int r2 = r0.k(r1, r5)
                r4 = r4 | 1
                goto L_0x003e
            L_0x007e:
                r11 = r5
                goto L_0x003e
            L_0x0080:
                r14 = r2
                r13 = r4
                r5 = r8
                r7 = r9
                r3 = r10
            L_0x0085:
                r0.b(r1)
                com.clubhouse.android.data.models.remote.request.FollowRequest r0 = new com.clubhouse.android.data.models.remote.request.FollowRequest
                r15 = r5
                com.clubhouse.android.data.models.local.user.SourceLocation r15 = (com.clubhouse.android.data.models.local.user.SourceLocation) r15
                r16 = r7
                java.lang.String r16 = (java.lang.String) r16
                r17 = r3
                java.util.Map r17 = (java.util.Map) r17
                r12 = r0
                r12.<init>(r13, r14, r15, r16, r17)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.models.remote.request.FollowRequest.a.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            FollowRequest followRequest = (FollowRequest) obj;
            i.e(encoder, "encoder");
            i.e(followRequest, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(followRequest, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            boolean z = false;
            c.q(serialDescriptor, 0, followRequest.a);
            c.z(serialDescriptor, 1, h.a, followRequest.b);
            if (c.v(serialDescriptor, 2) || followRequest.c != null) {
                c.l(serialDescriptor, 2, g1.b, followRequest.c);
            }
            if (c.v(serialDescriptor, 3) || followRequest.d != null) {
                z = true;
            }
            if (z) {
                c.l(serialDescriptor, 3, new h0(g1.b, i0.e.b.b3.a.b.c.a.a), followRequest.d);
            }
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    public FollowRequest(int i, int i2, SourceLocation sourceLocation, String str, Map map) {
        if (3 == (i & 3)) {
            this.a = i2;
            this.b = sourceLocation;
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = map;
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
        if (!(obj instanceof FollowRequest)) {
            return false;
        }
        FollowRequest followRequest = (FollowRequest) obj;
        return this.a == followRequest.a && this.b == followRequest.b && i.a(this.c, followRequest.c) && i.a(this.d, followRequest.d);
    }

    public int hashCode() {
        int hashCode = (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31;
        String str = this.c;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, Object> map = this.d;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("FollowRequest(userId=");
        P0.append(this.a);
        P0.append(", source=");
        P0.append(this.b);
        P0.append(", rcToken=");
        P0.append(this.c);
        P0.append(", loggingContext=");
        return i0.d.a.a.a.B0(P0, this.d, ')');
    }

    public FollowRequest(int i, SourceLocation sourceLocation, String str, Map<String, ? extends Object> map) {
        i.e(sourceLocation, Stripe3ds2AuthParams.FIELD_SOURCE);
        this.a = i;
        this.b = sourceLocation;
        this.c = str;
        this.d = map;
    }
}
