package com.clubhouse.android.data.models.remote.response;

import com.clubhouse.android.data.models.local.notification.Notification;
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
import n0.c.k.h;
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: PaginatedNotificationsResponse.kt */
public final class PaginatedNotificationsResponse {
    public static final Companion Companion = new Companion((f) null);
    public final List<Notification> a;
    public final boolean b;
    public final Integer c;
    public final Integer d;
    public final Integer e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/remote/response/PaginatedNotificationsResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/remote/response/PaginatedNotificationsResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: PaginatedNotificationsResponse.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<PaginatedNotificationsResponse> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: PaginatedNotificationsResponse.kt */
    public static final class a implements v<PaginatedNotificationsResponse> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.remote.response.PaginatedNotificationsResponse", aVar, 5);
            pluginGeneratedSerialDescriptor.i("notifications", false);
            pluginGeneratedSerialDescriptor.i("disabled", false);
            pluginGeneratedSerialDescriptor.i("count", true);
            pluginGeneratedSerialDescriptor.i("next", true);
            pluginGeneratedSerialDescriptor.i("previous", true);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            e0 e0Var = e0.b;
            return new KSerializer[]{new n0.c.k.e(Notification.a.a), h.b, m0.r.t.a.r.m.a1.a.R1(e0Var), m0.r.t.a.r.m.a1.a.R1(e0Var), m0.r.t.a.r.m.a1.a.R1(e0Var)};
        }

        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder r17) {
            /*
                r16 = this;
                r0 = r17
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
                r8 = 4
                if (r2 == 0) goto L_0x003b
                n0.c.k.e r2 = new n0.c.k.e
                com.clubhouse.android.data.models.local.notification.Notification$a r9 = com.clubhouse.android.data.models.local.notification.Notification.a.a
                r2.<init>(r9)
                java.lang.Object r2 = r0.m(r1, r5, r2, r4)
                boolean r5 = r0.s(r1, r6)
                n0.c.k.e0 r6 = n0.c.k.e0.b
                java.lang.Object r7 = r0.v(r1, r7, r6, r4)
                java.lang.Object r3 = r0.v(r1, r3, r6, r4)
                java.lang.Object r4 = r0.v(r1, r8, r6, r4)
                r6 = 31
                r8 = r5
                goto L_0x0092
            L_0x003b:
                r2 = r4
                r9 = r2
                r10 = r9
                r11 = r5
                r12 = r11
                r13 = r6
            L_0x0041:
                if (r13 == 0) goto L_0x008c
                int r14 = r0.x(r1)
                r15 = -1
                if (r14 == r15) goto L_0x008a
                if (r14 == 0) goto L_0x007c
                if (r14 == r6) goto L_0x0075
                if (r14 == r7) goto L_0x006c
                if (r14 == r3) goto L_0x0063
                if (r14 != r8) goto L_0x005d
                n0.c.k.e0 r14 = n0.c.k.e0.b
                java.lang.Object r9 = r0.v(r1, r8, r14, r9)
                r12 = r12 | 16
                goto L_0x0041
            L_0x005d:
                kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
                r0.<init>(r14)
                throw r0
            L_0x0063:
                n0.c.k.e0 r14 = n0.c.k.e0.b
                java.lang.Object r2 = r0.v(r1, r3, r14, r2)
                r12 = r12 | 8
                goto L_0x0041
            L_0x006c:
                n0.c.k.e0 r14 = n0.c.k.e0.b
                java.lang.Object r4 = r0.v(r1, r7, r14, r4)
                r12 = r12 | 4
                goto L_0x0041
            L_0x0075:
                boolean r11 = r0.s(r1, r6)
                r12 = r12 | 2
                goto L_0x0041
            L_0x007c:
                n0.c.k.e r14 = new n0.c.k.e
                com.clubhouse.android.data.models.local.notification.Notification$a r15 = com.clubhouse.android.data.models.local.notification.Notification.a.a
                r14.<init>(r15)
                java.lang.Object r10 = r0.m(r1, r5, r14, r10)
                r12 = r12 | 1
                goto L_0x0041
            L_0x008a:
                r13 = r5
                goto L_0x0041
            L_0x008c:
                r3 = r2
                r7 = r4
                r4 = r9
                r2 = r10
                r8 = r11
                r6 = r12
            L_0x0092:
                r0.b(r1)
                com.clubhouse.android.data.models.remote.response.PaginatedNotificationsResponse r0 = new com.clubhouse.android.data.models.remote.response.PaginatedNotificationsResponse
                r1 = r2
                java.util.List r1 = (java.util.List) r1
                r9 = r7
                java.lang.Integer r9 = (java.lang.Integer) r9
                r10 = r3
                java.lang.Integer r10 = (java.lang.Integer) r10
                r11 = r4
                java.lang.Integer r11 = (java.lang.Integer) r11
                r5 = r0
                r7 = r1
                r5.<init>(r6, r7, r8, r9, r10, r11)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.models.remote.response.PaginatedNotificationsResponse.a.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            PaginatedNotificationsResponse paginatedNotificationsResponse = (PaginatedNotificationsResponse) obj;
            i.e(encoder, "encoder");
            i.e(paginatedNotificationsResponse, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(paginatedNotificationsResponse, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            boolean z = false;
            c.z(serialDescriptor, 0, new n0.c.k.e(Notification.a.a), paginatedNotificationsResponse.a);
            c.r(serialDescriptor, 1, paginatedNotificationsResponse.b);
            if (c.v(serialDescriptor, 2) || paginatedNotificationsResponse.c != null) {
                c.l(serialDescriptor, 2, e0.b, paginatedNotificationsResponse.c);
            }
            if (c.v(serialDescriptor, 3) || paginatedNotificationsResponse.d != null) {
                c.l(serialDescriptor, 3, e0.b, paginatedNotificationsResponse.d);
            }
            if (c.v(serialDescriptor, 4) || paginatedNotificationsResponse.e != null) {
                z = true;
            }
            if (z) {
                c.l(serialDescriptor, 4, e0.b, paginatedNotificationsResponse.e);
            }
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    public PaginatedNotificationsResponse(int i, List list, boolean z, Integer num, Integer num2, Integer num3) {
        if (3 == (i & 3)) {
            this.a = list;
            this.b = z;
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = num;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = num2;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = num3;
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
        if (!(obj instanceof PaginatedNotificationsResponse)) {
            return false;
        }
        PaginatedNotificationsResponse paginatedNotificationsResponse = (PaginatedNotificationsResponse) obj;
        return i.a(this.a, paginatedNotificationsResponse.a) && this.b == paginatedNotificationsResponse.b && i.a(this.c, paginatedNotificationsResponse.c) && i.a(this.d, paginatedNotificationsResponse.d) && i.a(this.e, paginatedNotificationsResponse.e);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        boolean z = this.b;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        Integer num = this.c;
        int i2 = 0;
        int hashCode2 = (i + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.e;
        if (num3 != null) {
            i2 = num3.hashCode();
        }
        return hashCode3 + i2;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("PaginatedNotificationsResponse(notifications=");
        P0.append(this.a);
        P0.append(", disabled=");
        P0.append(this.b);
        P0.append(", count=");
        P0.append(this.c);
        P0.append(", next=");
        P0.append(this.d);
        P0.append(", previous=");
        return i0.d.a.a.a.v0(P0, this.e, ')');
    }
}
