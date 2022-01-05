package com.clubhouse.android.data.models.remote.response;

import com.clubhouse.android.data.models.local.payment.RecentPayment;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
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
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: PaginatedGetRecentPaymentsResponse.kt */
public final class PaginatedGetRecentPaymentsResponse {
    public static final Companion Companion = new Companion((f) null);
    public final List<RecentPayment> a;
    public final Integer b;
    public final Integer c;
    public final Integer d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/remote/response/PaginatedGetRecentPaymentsResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/remote/response/PaginatedGetRecentPaymentsResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: PaginatedGetRecentPaymentsResponse.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<PaginatedGetRecentPaymentsResponse> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: PaginatedGetRecentPaymentsResponse.kt */
    public static final class a implements v<PaginatedGetRecentPaymentsResponse> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.remote.response.PaginatedGetRecentPaymentsResponse", aVar, 4);
            pluginGeneratedSerialDescriptor.i("payments", false);
            pluginGeneratedSerialDescriptor.i("count", true);
            pluginGeneratedSerialDescriptor.i("next", true);
            pluginGeneratedSerialDescriptor.i("previous", true);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            e0 e0Var = e0.b;
            return new KSerializer[]{new n0.c.k.e(RecentPayment.a.a), m0.r.t.a.r.m.a1.a.R1(e0Var), m0.r.t.a.r.m.a1.a.R1(e0Var), m0.r.t.a.r.m.a1.a.R1(e0Var)};
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
                if (r1 == 0) goto L_0x0033
                n0.c.k.e r1 = new n0.c.k.e
                com.clubhouse.android.data.models.local.payment.RecentPayment$a r7 = com.clubhouse.android.data.models.local.payment.RecentPayment.a.a
                r1.<init>(r7)
                java.lang.Object r1 = r14.m(r0, r4, r1, r3)
                n0.c.k.e0 r4 = n0.c.k.e0.b
                java.lang.Object r5 = r14.v(r0, r5, r4, r3)
                java.lang.Object r6 = r14.v(r0, r6, r4, r3)
                java.lang.Object r2 = r14.v(r0, r2, r4, r3)
                r3 = 15
                r4 = r3
                goto L_0x0080
            L_0x0033:
                r1 = r3
                r7 = r1
                r8 = r7
                r9 = r8
                r3 = r4
                r10 = r5
            L_0x0039:
                if (r10 == 0) goto L_0x007b
                int r11 = r14.x(r0)
                r12 = -1
                if (r11 == r12) goto L_0x0079
                if (r11 == 0) goto L_0x006b
                if (r11 == r5) goto L_0x0062
                if (r11 == r6) goto L_0x0059
                if (r11 != r2) goto L_0x0053
                n0.c.k.e0 r11 = n0.c.k.e0.b
                java.lang.Object r8 = r14.v(r0, r2, r11, r8)
                r3 = r3 | 8
                goto L_0x0039
            L_0x0053:
                kotlinx.serialization.UnknownFieldException r14 = new kotlinx.serialization.UnknownFieldException
                r14.<init>(r11)
                throw r14
            L_0x0059:
                n0.c.k.e0 r11 = n0.c.k.e0.b
                java.lang.Object r7 = r14.v(r0, r6, r11, r7)
                r3 = r3 | 4
                goto L_0x0039
            L_0x0062:
                n0.c.k.e0 r11 = n0.c.k.e0.b
                java.lang.Object r1 = r14.v(r0, r5, r11, r1)
                r3 = r3 | 2
                goto L_0x0039
            L_0x006b:
                n0.c.k.e r11 = new n0.c.k.e
                com.clubhouse.android.data.models.local.payment.RecentPayment$a r12 = com.clubhouse.android.data.models.local.payment.RecentPayment.a.a
                r11.<init>(r12)
                java.lang.Object r9 = r14.m(r0, r4, r11, r9)
                r3 = r3 | 1
                goto L_0x0039
            L_0x0079:
                r10 = r4
                goto L_0x0039
            L_0x007b:
                r5 = r1
                r4 = r3
                r6 = r7
                r2 = r8
                r1 = r9
            L_0x0080:
                r14.b(r0)
                com.clubhouse.android.data.models.remote.response.PaginatedGetRecentPaymentsResponse r14 = new com.clubhouse.android.data.models.remote.response.PaginatedGetRecentPaymentsResponse
                r0 = r1
                java.util.List r0 = (java.util.List) r0
                r1 = r5
                java.lang.Integer r1 = (java.lang.Integer) r1
                r7 = r6
                java.lang.Integer r7 = (java.lang.Integer) r7
                r8 = r2
                java.lang.Integer r8 = (java.lang.Integer) r8
                r3 = r14
                r5 = r0
                r6 = r1
                r3.<init>(r4, r5, r6, r7, r8)
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.models.remote.response.PaginatedGetRecentPaymentsResponse.a.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            PaginatedGetRecentPaymentsResponse paginatedGetRecentPaymentsResponse = (PaginatedGetRecentPaymentsResponse) obj;
            i.e(encoder, "encoder");
            i.e(paginatedGetRecentPaymentsResponse, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(paginatedGetRecentPaymentsResponse, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            boolean z = false;
            c.z(serialDescriptor, 0, new n0.c.k.e(RecentPayment.a.a), paginatedGetRecentPaymentsResponse.a);
            if (c.v(serialDescriptor, 1) || paginatedGetRecentPaymentsResponse.b != null) {
                c.l(serialDescriptor, 1, e0.b, paginatedGetRecentPaymentsResponse.b);
            }
            if (c.v(serialDescriptor, 2) || paginatedGetRecentPaymentsResponse.c != null) {
                c.l(serialDescriptor, 2, e0.b, paginatedGetRecentPaymentsResponse.c);
            }
            if (c.v(serialDescriptor, 3) || paginatedGetRecentPaymentsResponse.d != null) {
                z = true;
            }
            if (z) {
                c.l(serialDescriptor, 3, e0.b, paginatedGetRecentPaymentsResponse.d);
            }
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    public PaginatedGetRecentPaymentsResponse(int i, List list, Integer num, Integer num2, Integer num3) {
        if (1 == (i & 1)) {
            this.a = list;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = num;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = num2;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = num3;
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
        if (!(obj instanceof PaginatedGetRecentPaymentsResponse)) {
            return false;
        }
        PaginatedGetRecentPaymentsResponse paginatedGetRecentPaymentsResponse = (PaginatedGetRecentPaymentsResponse) obj;
        return i.a(this.a, paginatedGetRecentPaymentsResponse.a) && i.a(this.b, paginatedGetRecentPaymentsResponse.b) && i.a(this.c, paginatedGetRecentPaymentsResponse.c) && i.a(this.d, paginatedGetRecentPaymentsResponse.d);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int i = 0;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.d;
        if (num3 != null) {
            i = num3.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("PaginatedGetRecentPaymentsResponse(payments=");
        P0.append(this.a);
        P0.append(", count=");
        P0.append(this.b);
        P0.append(", next=");
        P0.append(this.c);
        P0.append(", previous=");
        return i0.d.a.a.a.v0(P0, this.d, ')');
    }
}
