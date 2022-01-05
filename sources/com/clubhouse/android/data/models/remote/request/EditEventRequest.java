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
/* compiled from: EditEventRequest.kt */
public final class EditEventRequest {
    public static final Companion Companion = new Companion((f) null);
    public final List<Integer> a;
    public final Integer b;
    public final boolean c;
    public final int d;
    public final String e;
    public final String f;
    public final Long g;
    public final String h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/remote/request/EditEventRequest$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/remote/request/EditEventRequest;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: EditEventRequest.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<EditEventRequest> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: EditEventRequest.kt */
    public static final class a implements v<EditEventRequest> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.remote.request.EditEventRequest", aVar, 8);
            pluginGeneratedSerialDescriptor.i("user_ids", false);
            pluginGeneratedSerialDescriptor.i("club_id", true);
            pluginGeneratedSerialDescriptor.i("is_member_only", true);
            pluginGeneratedSerialDescriptor.i("event_id", false);
            pluginGeneratedSerialDescriptor.i("event_hashid", true);
            pluginGeneratedSerialDescriptor.i(InstabugDbContract.FeatureRequestEntry.COLUMN_DESCRIPTION, false);
            pluginGeneratedSerialDescriptor.i("time_start_epoch", false);
            pluginGeneratedSerialDescriptor.i("name", false);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            e0 e0Var = e0.b;
            g1 g1Var = g1.b;
            return new KSerializer[]{new n0.c.k.e(e0Var), m0.r.t.a.r.m.a1.a.R1(e0Var), h.b, e0Var, m0.r.t.a.r.m.a1.a.R1(g1Var), g1Var, m0.r.t.a.r.m.a1.a.R1(o0.b), g1Var};
        }

        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder r20) {
            /*
                r19 = this;
                r0 = r20
                java.lang.String r1 = "decoder"
                m0.n.b.i.e(r0, r1)
                kotlinx.serialization.descriptors.SerialDescriptor r1 = b
                n0.c.j.c r0 = r0.c(r1)
                boolean r2 = r0.y()
                r3 = 6
                r4 = 5
                r5 = 3
                r6 = 0
                r7 = 2
                r8 = 4
                r9 = 7
                r10 = 0
                r11 = 1
                if (r2 == 0) goto L_0x0054
                n0.c.k.e r2 = new n0.c.k.e
                n0.c.k.e0 r12 = n0.c.k.e0.b
                r2.<init>(r12)
                java.lang.Object r2 = r0.m(r1, r10, r2, r6)
                java.lang.Object r10 = r0.v(r1, r11, r12, r6)
                boolean r7 = r0.s(r1, r7)
                int r5 = r0.k(r1, r5)
                n0.c.k.g1 r11 = n0.c.k.g1.b
                java.lang.Object r8 = r0.v(r1, r8, r11, r6)
                java.lang.String r4 = r0.t(r1, r4)
                n0.c.k.o0 r11 = n0.c.k.o0.b
                java.lang.Object r3 = r0.v(r1, r3, r11, r6)
                java.lang.String r6 = r0.t(r1, r9)
                r9 = 255(0xff, float:3.57E-43)
                r11 = r4
                r13 = r6
                r16 = r7
                r18 = r9
                r9 = r5
                r5 = r18
                goto L_0x00d3
            L_0x0054:
                r12 = r6
                r13 = r12
                r14 = r13
                r15 = r14
                r2 = r10
                r16 = r2
                r17 = r11
                r11 = r16
                r10 = r15
            L_0x0060:
                if (r17 == 0) goto L_0x00cb
                int r7 = r0.x(r1)
                switch(r7) {
                    case -1: goto L_0x00c6;
                    case 0: goto L_0x00b5;
                    case 1: goto L_0x00a8;
                    case 2: goto L_0x009f;
                    case 3: goto L_0x0095;
                    case 4: goto L_0x0089;
                    case 5: goto L_0x0081;
                    case 6: goto L_0x0077;
                    case 7: goto L_0x006f;
                    default: goto L_0x0069;
                }
            L_0x0069:
                kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
                r0.<init>(r7)
                throw r0
            L_0x006f:
                java.lang.String r7 = r0.t(r1, r9)
                r11 = r11 | 128(0x80, float:1.794E-43)
                r14 = r7
                goto L_0x009c
            L_0x0077:
                n0.c.k.o0 r7 = n0.c.k.o0.b
                java.lang.Object r7 = r0.v(r1, r3, r7, r15)
                r11 = r11 | 64
                r15 = r7
                goto L_0x009c
            L_0x0081:
                java.lang.String r7 = r0.t(r1, r4)
                r11 = r11 | 32
                r13 = r7
                goto L_0x009c
            L_0x0089:
                n0.c.k.g1 r7 = n0.c.k.g1.b
                java.lang.Object r7 = r0.v(r1, r8, r7, r10)
                r10 = r11 | 16
                r11 = r10
                r4 = 0
                r10 = r7
                goto L_0x009d
            L_0x0095:
                int r2 = r0.k(r1, r5)
                r7 = r11 | 8
                r11 = r7
            L_0x009c:
                r4 = 0
            L_0x009d:
                r7 = 2
                goto L_0x00b2
            L_0x009f:
                r7 = 2
                boolean r16 = r0.s(r1, r7)
                r11 = r11 | 4
                r4 = 0
                goto L_0x00b2
            L_0x00a8:
                r7 = 2
                n0.c.k.e0 r3 = n0.c.k.e0.b
                r4 = 1
                java.lang.Object r12 = r0.v(r1, r4, r3, r12)
                r11 = r11 | 2
            L_0x00b2:
                r3 = 6
                r4 = 5
                goto L_0x0060
            L_0x00b5:
                r4 = 1
                r7 = 2
                n0.c.k.e r3 = new n0.c.k.e
                n0.c.k.e0 r4 = n0.c.k.e0.b
                r3.<init>(r4)
                r4 = 0
                java.lang.Object r6 = r0.m(r1, r4, r3, r6)
                r11 = r11 | 1
                goto L_0x00b2
            L_0x00c6:
                r4 = 0
                r7 = 2
                r17 = r4
                goto L_0x00b2
            L_0x00cb:
                r9 = r2
                r2 = r6
                r8 = r10
                r5 = r11
                r10 = r12
                r11 = r13
                r13 = r14
                r3 = r15
            L_0x00d3:
                r0.b(r1)
                com.clubhouse.android.data.models.remote.request.EditEventRequest r0 = new com.clubhouse.android.data.models.remote.request.EditEventRequest
                r6 = r2
                java.util.List r6 = (java.util.List) r6
                r7 = r10
                java.lang.Integer r7 = (java.lang.Integer) r7
                r10 = r8
                java.lang.String r10 = (java.lang.String) r10
                r12 = r3
                java.lang.Long r12 = (java.lang.Long) r12
                r4 = r0
                r8 = r16
                r4.<init>((int) r5, (java.util.List) r6, (java.lang.Integer) r7, (boolean) r8, (int) r9, (java.lang.String) r10, (java.lang.String) r11, (java.lang.Long) r12, (java.lang.String) r13)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.models.remote.request.EditEventRequest.a.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            EditEventRequest editEventRequest = (EditEventRequest) obj;
            i.e(encoder, "encoder");
            i.e(editEventRequest, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(editEventRequest, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            e0 e0Var = e0.b;
            boolean z = false;
            c.z(serialDescriptor, 0, new n0.c.k.e(e0Var), editEventRequest.a);
            if (c.v(serialDescriptor, 1) || editEventRequest.b != null) {
                c.l(serialDescriptor, 1, e0Var, editEventRequest.b);
            }
            if (c.v(serialDescriptor, 2) || editEventRequest.c) {
                c.r(serialDescriptor, 2, editEventRequest.c);
            }
            c.q(serialDescriptor, 3, editEventRequest.d);
            if (c.v(serialDescriptor, 4) || editEventRequest.e != null) {
                z = true;
            }
            if (z) {
                c.l(serialDescriptor, 4, g1.b, editEventRequest.e);
            }
            c.s(serialDescriptor, 5, editEventRequest.f);
            c.l(serialDescriptor, 6, o0.b, editEventRequest.g);
            c.s(serialDescriptor, 7, editEventRequest.h);
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    public EditEventRequest(List list, Integer num, boolean z, int i, String str, String str2, Long l, String str3, int i2) {
        num = (i2 & 2) != 0 ? null : num;
        z = (i2 & 4) != 0 ? false : z;
        int i3 = i2 & 16;
        i.e(list, "userIds");
        i.e(str2, InstabugDbContract.FeatureRequestEntry.COLUMN_DESCRIPTION);
        i.e(str3, "name");
        this.a = list;
        this.b = num;
        this.c = z;
        this.d = i;
        this.e = null;
        this.f = str2;
        this.g = l;
        this.h = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditEventRequest)) {
            return false;
        }
        EditEventRequest editEventRequest = (EditEventRequest) obj;
        return i.a(this.a, editEventRequest.a) && i.a(this.b, editEventRequest.b) && this.c == editEventRequest.c && this.d == editEventRequest.d && i.a(this.e, editEventRequest.e) && i.a(this.f, editEventRequest.f) && i.a(this.g, editEventRequest.g) && i.a(this.h, editEventRequest.h);
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
        int M = i0.d.a.a.a.M(this.d, (hashCode2 + (z ? 1 : 0)) * 31, 31);
        String str = this.e;
        int F = i0.d.a.a.a.F(this.f, (M + (str == null ? 0 : str.hashCode())) * 31, 31);
        Long l = this.g;
        if (l != null) {
            i = l.hashCode();
        }
        return this.h.hashCode() + ((F + i) * 31);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("EditEventRequest(userIds=");
        P0.append(this.a);
        P0.append(", clubId=");
        P0.append(this.b);
        P0.append(", isMemberOnly=");
        P0.append(this.c);
        P0.append(", eventId=");
        P0.append(this.d);
        P0.append(", eventHashid=");
        P0.append(this.e);
        P0.append(", description=");
        P0.append(this.f);
        P0.append(", timeStartEpoch=");
        P0.append(this.g);
        P0.append(", name=");
        return i0.d.a.a.a.x0(P0, this.h, ')');
    }

    public EditEventRequest(int i, List list, Integer num, boolean z, int i2, String str, String str2, Long l, String str3) {
        if (233 == (i & 233)) {
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
            this.d = i2;
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = str;
            }
            this.f = str2;
            this.g = l;
            this.h = str3;
            return;
        }
        a aVar = a.a;
        m0.r.t.a.r.m.a1.a.W3(i, 233, a.b);
        throw null;
    }
}
