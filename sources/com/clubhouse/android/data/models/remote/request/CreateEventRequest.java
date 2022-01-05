package com.clubhouse.android.data.models.remote.request;

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
import n0.c.k.g1;
import n0.c.k.h;
import n0.c.k.o0;
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: CreateEventRequest.kt */
public final class CreateEventRequest {
    public static final Companion Companion = new Companion((f) null);
    public final List<Integer> a;
    public final Integer b;
    public final boolean c;
    public final String d;
    public final Long e;
    public final String f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/remote/request/CreateEventRequest$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/remote/request/CreateEventRequest;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: CreateEventRequest.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<CreateEventRequest> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: CreateEventRequest.kt */
    public static final class a implements v<CreateEventRequest> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.remote.request.CreateEventRequest", aVar, 6);
            pluginGeneratedSerialDescriptor.i("user_ids", false);
            pluginGeneratedSerialDescriptor.i("club_id", true);
            pluginGeneratedSerialDescriptor.i("is_member_only", true);
            pluginGeneratedSerialDescriptor.i(InstabugDbContract.FeatureRequestEntry.COLUMN_DESCRIPTION, false);
            pluginGeneratedSerialDescriptor.i("time_start_epoch", true);
            pluginGeneratedSerialDescriptor.i("name", false);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            e0 e0Var = e0.b;
            g1 g1Var = g1.b;
            return new KSerializer[]{new n0.c.k.e(e0Var), m0.r.t.a.r.m.a1.a.R1(e0Var), h.b, g1Var, m0.r.t.a.r.m.a1.a.R1(o0.b), g1Var};
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0083, code lost:
            r14 = r9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0098, code lost:
            r9 = r3;
            r3 = 3;
         */
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
                r5 = 1
                r6 = 2
                r7 = 4
                r8 = 5
                r9 = 0
                if (r2 == 0) goto L_0x0043
                n0.c.k.e r2 = new n0.c.k.e
                n0.c.k.e0 r10 = n0.c.k.e0.b
                r2.<init>(r10)
                java.lang.Object r2 = r0.m(r1, r9, r2, r4)
                java.lang.Object r5 = r0.v(r1, r5, r10, r4)
                boolean r6 = r0.s(r1, r6)
                java.lang.String r3 = r0.t(r1, r3)
                n0.c.k.o0 r9 = n0.c.k.o0.b
                java.lang.Object r4 = r0.v(r1, r7, r9, r4)
                java.lang.String r7 = r0.t(r1, r8)
                r8 = 63
                r10 = r7
                r14 = r8
                r8 = r3
                r7 = r6
                goto L_0x00a1
            L_0x0043:
                r2 = r4
                r10 = r2
                r11 = r10
                r12 = r11
                r15 = r5
                r13 = r9
                r14 = r13
            L_0x004a:
                if (r15 == 0) goto L_0x009b
                int r9 = r0.x(r1)
                switch(r9) {
                    case -1: goto L_0x0096;
                    case 0: goto L_0x0086;
                    case 1: goto L_0x007b;
                    case 2: goto L_0x0074;
                    case 3: goto L_0x006b;
                    case 4: goto L_0x0062;
                    case 5: goto L_0x0059;
                    default: goto L_0x0053;
                }
            L_0x0053:
                kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
                r0.<init>(r9)
                throw r0
            L_0x0059:
                java.lang.String r9 = r0.t(r1, r8)
                r11 = r14 | 32
                r14 = r11
                r11 = r9
                goto L_0x0084
            L_0x0062:
                n0.c.k.o0 r9 = n0.c.k.o0.b
                java.lang.Object r2 = r0.v(r1, r7, r9, r2)
                r9 = r14 | 16
                goto L_0x0083
            L_0x006b:
                java.lang.String r9 = r0.t(r1, r3)
                r12 = r14 | 8
                r14 = r12
                r12 = r9
                goto L_0x0084
            L_0x0074:
                boolean r13 = r0.s(r1, r6)
                r9 = r14 | 4
                goto L_0x0083
            L_0x007b:
                n0.c.k.e0 r9 = n0.c.k.e0.b
                java.lang.Object r4 = r0.v(r1, r5, r9, r4)
                r9 = r14 | 2
            L_0x0083:
                r14 = r9
            L_0x0084:
                r9 = 0
                goto L_0x004a
            L_0x0086:
                n0.c.k.e r9 = new n0.c.k.e
                n0.c.k.e0 r3 = n0.c.k.e0.b
                r9.<init>(r3)
                r3 = 0
                java.lang.Object r9 = r0.m(r1, r3, r9, r10)
                r14 = r14 | 1
                r10 = r9
                goto L_0x0098
            L_0x0096:
                r3 = 0
                r15 = r3
            L_0x0098:
                r9 = r3
                r3 = 3
                goto L_0x004a
            L_0x009b:
                r5 = r4
                r8 = r12
                r7 = r13
                r4 = r2
                r2 = r10
                r10 = r11
            L_0x00a1:
                r0.b(r1)
                com.clubhouse.android.data.models.remote.request.CreateEventRequest r0 = new com.clubhouse.android.data.models.remote.request.CreateEventRequest
                r1 = r2
                java.util.List r1 = (java.util.List) r1
                r6 = r5
                java.lang.Integer r6 = (java.lang.Integer) r6
                r9 = r4
                java.lang.Long r9 = (java.lang.Long) r9
                r3 = r0
                r4 = r14
                r5 = r1
                r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.models.remote.request.CreateEventRequest.a.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            CreateEventRequest createEventRequest = (CreateEventRequest) obj;
            i.e(encoder, "encoder");
            i.e(createEventRequest, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(createEventRequest, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            e0 e0Var = e0.b;
            boolean z = false;
            c.z(serialDescriptor, 0, new n0.c.k.e(e0Var), createEventRequest.a);
            if (c.v(serialDescriptor, 1) || createEventRequest.b != null) {
                c.l(serialDescriptor, 1, e0Var, createEventRequest.b);
            }
            if (c.v(serialDescriptor, 2) || createEventRequest.c) {
                c.r(serialDescriptor, 2, createEventRequest.c);
            }
            c.s(serialDescriptor, 3, createEventRequest.d);
            if (c.v(serialDescriptor, 4) || createEventRequest.e != null) {
                z = true;
            }
            if (z) {
                c.l(serialDescriptor, 4, o0.b, createEventRequest.e);
            }
            c.s(serialDescriptor, 5, createEventRequest.f);
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    public CreateEventRequest(int i, List list, Integer num, boolean z, String str, Long l, String str2) {
        if (41 == (i & 41)) {
            this.a = list;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = num;
            }
            if ((i & 4) == 0) {
                this.c = false;
            } else {
                this.c = z;
            }
            this.d = str;
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = l;
            }
            this.f = str2;
            return;
        }
        a aVar = a.a;
        m0.r.t.a.r.m.a1.a.W3(i, 41, a.b);
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateEventRequest)) {
            return false;
        }
        CreateEventRequest createEventRequest = (CreateEventRequest) obj;
        return i.a(this.a, createEventRequest.a) && i.a(this.b, createEventRequest.b) && this.c == createEventRequest.c && i.a(this.d, createEventRequest.d) && i.a(this.e, createEventRequest.e) && i.a(this.f, createEventRequest.f);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int i = 0;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        boolean z = this.c;
        if (z) {
            z = true;
        }
        int F = i0.d.a.a.a.F(this.d, (hashCode2 + (z ? 1 : 0)) * 31, 31);
        Long l = this.e;
        if (l != null) {
            i = l.hashCode();
        }
        return this.f.hashCode() + ((F + i) * 31);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("CreateEventRequest(userIds=");
        P0.append(this.a);
        P0.append(", clubId=");
        P0.append(this.b);
        P0.append(", isMemberOnly=");
        P0.append(this.c);
        P0.append(", description=");
        P0.append(this.d);
        P0.append(", timeStartEpoch=");
        P0.append(this.e);
        P0.append(", name=");
        return i0.d.a.a.a.x0(P0, this.f, ')');
    }

    public CreateEventRequest(List<Integer> list, Integer num, boolean z, String str, Long l, String str2) {
        i.e(list, "userIds");
        i.e(str, InstabugDbContract.FeatureRequestEntry.COLUMN_DESCRIPTION);
        i.e(str2, "name");
        this.a = list;
        this.b = num;
        this.c = z;
        this.d = str;
        this.e = l;
        this.f = str2;
    }
}
