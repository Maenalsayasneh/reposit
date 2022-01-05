package com.clubhouse.android.data.models.remote.request;

import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.stripe.android.model.Stripe3ds2AuthParams;
import i0.e.b.b3.a.b.c.h;
import java.util.List;
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
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: FollowMultipleRequest.kt */
public final class FollowMultipleRequest {
    public static final Companion Companion = new Companion((f) null);
    public final List<Integer> a;
    public final SourceLocation b;
    public final String c;
    public final String d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/remote/request/FollowMultipleRequest$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/remote/request/FollowMultipleRequest;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: FollowMultipleRequest.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<FollowMultipleRequest> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: FollowMultipleRequest.kt */
    public static final class a implements v<FollowMultipleRequest> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.remote.request.FollowMultipleRequest", aVar, 4);
            pluginGeneratedSerialDescriptor.i("user_ids", false);
            pluginGeneratedSerialDescriptor.i(Stripe3ds2AuthParams.FIELD_SOURCE, false);
            pluginGeneratedSerialDescriptor.i("user_id", true);
            pluginGeneratedSerialDescriptor.i("source_topic_id", true);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            g1 g1Var = g1.b;
            return new KSerializer[]{new n0.c.k.e(e0.b), h.a, m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(g1Var)};
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
                if (r1 == 0) goto L_0x0036
                n0.c.k.e r1 = new n0.c.k.e
                n0.c.k.e0 r7 = n0.c.k.e0.b
                r1.<init>(r7)
                java.lang.Object r1 = r14.m(r0, r4, r1, r3)
                i0.e.b.b3.a.b.c.h r4 = i0.e.b.b3.a.b.c.h.a
                java.lang.Object r4 = r14.m(r0, r5, r4, r3)
                n0.c.k.g1 r5 = n0.c.k.g1.b
                java.lang.Object r6 = r14.v(r0, r6, r5, r3)
                java.lang.Object r2 = r14.v(r0, r2, r5, r3)
                r3 = 15
                r9 = r4
                r4 = r3
                goto L_0x0082
            L_0x0036:
                r1 = r3
                r7 = r1
                r8 = r7
                r9 = r8
                r3 = r4
                r10 = r5
            L_0x003c:
                if (r10 == 0) goto L_0x007e
                int r11 = r14.x(r0)
                r12 = -1
                if (r11 == r12) goto L_0x007c
                if (r11 == 0) goto L_0x006e
                if (r11 == r5) goto L_0x0065
                if (r11 == r6) goto L_0x005c
                if (r11 != r2) goto L_0x0056
                n0.c.k.g1 r11 = n0.c.k.g1.b
                java.lang.Object r7 = r14.v(r0, r2, r11, r7)
                r3 = r3 | 8
                goto L_0x003c
            L_0x0056:
                kotlinx.serialization.UnknownFieldException r14 = new kotlinx.serialization.UnknownFieldException
                r14.<init>(r11)
                throw r14
            L_0x005c:
                n0.c.k.g1 r11 = n0.c.k.g1.b
                java.lang.Object r1 = r14.v(r0, r6, r11, r1)
                r3 = r3 | 4
                goto L_0x003c
            L_0x0065:
                i0.e.b.b3.a.b.c.h r11 = i0.e.b.b3.a.b.c.h.a
                java.lang.Object r9 = r14.m(r0, r5, r11, r9)
                r3 = r3 | 2
                goto L_0x003c
            L_0x006e:
                n0.c.k.e r11 = new n0.c.k.e
                n0.c.k.e0 r12 = n0.c.k.e0.b
                r11.<init>(r12)
                java.lang.Object r8 = r14.m(r0, r4, r11, r8)
                r3 = r3 | 1
                goto L_0x003c
            L_0x007c:
                r10 = r4
                goto L_0x003c
            L_0x007e:
                r6 = r1
                r4 = r3
                r2 = r7
                r1 = r8
            L_0x0082:
                r14.b(r0)
                com.clubhouse.android.data.models.remote.request.FollowMultipleRequest r14 = new com.clubhouse.android.data.models.remote.request.FollowMultipleRequest
                r5 = r1
                java.util.List r5 = (java.util.List) r5
                r0 = r9
                com.clubhouse.android.data.models.local.user.SourceLocation r0 = (com.clubhouse.android.data.models.local.user.SourceLocation) r0
                r7 = r6
                java.lang.String r7 = (java.lang.String) r7
                r8 = r2
                java.lang.String r8 = (java.lang.String) r8
                r3 = r14
                r6 = r0
                r3.<init>((int) r4, (java.util.List) r5, (com.clubhouse.android.data.models.local.user.SourceLocation) r6, (java.lang.String) r7, (java.lang.String) r8)
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.models.remote.request.FollowMultipleRequest.a.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            FollowMultipleRequest followMultipleRequest = (FollowMultipleRequest) obj;
            i.e(encoder, "encoder");
            i.e(followMultipleRequest, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(followMultipleRequest, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            boolean z = false;
            c.z(serialDescriptor, 0, new n0.c.k.e(e0.b), followMultipleRequest.a);
            c.z(serialDescriptor, 1, h.a, followMultipleRequest.b);
            if (c.v(serialDescriptor, 2) || !i.a(followMultipleRequest.c, "")) {
                c.l(serialDescriptor, 2, g1.b, followMultipleRequest.c);
            }
            if (c.v(serialDescriptor, 3) || !i.a(followMultipleRequest.d, "")) {
                z = true;
            }
            if (z) {
                c.l(serialDescriptor, 3, g1.b, followMultipleRequest.d);
            }
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    public FollowMultipleRequest(List list, SourceLocation sourceLocation, String str, String str2, int i) {
        String str3 = null;
        String str4 = (i & 4) != 0 ? "" : null;
        str3 = (i & 8) != 0 ? "" : str3;
        i.e(list, "userIds");
        i.e(sourceLocation, Stripe3ds2AuthParams.FIELD_SOURCE);
        this.a = list;
        this.b = sourceLocation;
        this.c = str4;
        this.d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FollowMultipleRequest)) {
            return false;
        }
        FollowMultipleRequest followMultipleRequest = (FollowMultipleRequest) obj;
        return i.a(this.a, followMultipleRequest.a) && this.b == followMultipleRequest.b && i.a(this.c, followMultipleRequest.c) && i.a(this.d, followMultipleRequest.d);
    }

    public int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("FollowMultipleRequest(userIds=");
        P0.append(this.a);
        P0.append(", source=");
        P0.append(this.b);
        P0.append(", userId=");
        P0.append(this.c);
        P0.append(", sourceTopicId=");
        return i0.d.a.a.a.w0(P0, this.d, ')');
    }

    public FollowMultipleRequest(int i, List list, SourceLocation sourceLocation, String str, String str2) {
        if (3 == (i & 3)) {
            this.a = list;
            this.b = sourceLocation;
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str;
            }
            if ((i & 8) == 0) {
                this.d = "";
            } else {
                this.d = str2;
            }
        } else {
            a aVar = a.a;
            m0.r.t.a.r.m.a1.a.W3(i, 3, a.b);
            throw null;
        }
    }
}
