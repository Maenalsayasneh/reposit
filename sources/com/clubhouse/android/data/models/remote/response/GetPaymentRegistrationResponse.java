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
/* compiled from: GetPaymentRegistrationResponse.kt */
public final class GetPaymentRegistrationResponse {
    public static final Companion Companion = new Companion((f) null);
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/remote/response/GetPaymentRegistrationResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/remote/response/GetPaymentRegistrationResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: GetPaymentRegistrationResponse.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<GetPaymentRegistrationResponse> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: GetPaymentRegistrationResponse.kt */
    public static final class a implements v<GetPaymentRegistrationResponse> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.remote.response.GetPaymentRegistrationResponse", aVar, 6);
            pluginGeneratedSerialDescriptor.i("url", true);
            pluginGeneratedSerialDescriptor.i("is_registered", true);
            pluginGeneratedSerialDescriptor.i("is_active", true);
            pluginGeneratedSerialDescriptor.i("is_enabled", true);
            pluginGeneratedSerialDescriptor.i("needs_action", true);
            pluginGeneratedSerialDescriptor.i("needs_email_verification", true);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            h hVar = h.b;
            return new KSerializer[]{m0.r.t.a.r.m.a1.a.R1(g1.b), hVar, hVar, hVar, hVar, hVar};
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0079, code lost:
            r14 = r9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0088, code lost:
            r9 = r4;
            r4 = 3;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder r18) {
            /*
                r17 = this;
                r0 = r18
                java.lang.String r1 = "decoder"
                m0.n.b.i.e(r0, r1)
                kotlinx.serialization.descriptors.SerialDescriptor r1 = b
                r2 = 0
                n0.c.j.c r0 = r0.c(r1)
                boolean r3 = r0.y()
                r4 = 3
                r5 = 1
                r6 = 2
                r7 = 4
                r8 = 5
                r9 = 0
                if (r3 == 0) goto L_0x0041
                n0.c.k.g1 r3 = n0.c.k.g1.b
                java.lang.Object r2 = r0.v(r1, r9, r3, r2)
                boolean r3 = r0.s(r1, r5)
                boolean r5 = r0.s(r1, r6)
                boolean r4 = r0.s(r1, r4)
                boolean r6 = r0.s(r1, r7)
                boolean r7 = r0.s(r1, r8)
                r8 = 63
                r9 = r6
                r10 = r7
                r6 = r3
                r7 = r5
                r16 = r8
                r8 = r4
                r4 = r16
                goto L_0x0091
            L_0x0041:
                r15 = r5
                r3 = r9
                r10 = r3
                r11 = r10
                r12 = r11
                r13 = r12
                r14 = r13
            L_0x0048:
                if (r15 == 0) goto L_0x008b
                int r9 = r0.x(r1)
                switch(r9) {
                    case -1: goto L_0x0086;
                    case 0: goto L_0x007c;
                    case 1: goto L_0x0073;
                    case 2: goto L_0x006c;
                    case 3: goto L_0x0065;
                    case 4: goto L_0x005e;
                    case 5: goto L_0x0057;
                    default: goto L_0x0051;
                }
            L_0x0051:
                kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
                r0.<init>(r9)
                throw r0
            L_0x0057:
                boolean r13 = r0.s(r1, r8)
                r9 = r14 | 32
                goto L_0x0079
            L_0x005e:
                boolean r12 = r0.s(r1, r7)
                r9 = r14 | 16
                goto L_0x0079
            L_0x0065:
                boolean r10 = r0.s(r1, r4)
                r9 = r14 | 8
                goto L_0x0079
            L_0x006c:
                boolean r11 = r0.s(r1, r6)
                r9 = r14 | 4
                goto L_0x0079
            L_0x0073:
                boolean r3 = r0.s(r1, r5)
                r9 = r14 | 2
            L_0x0079:
                r14 = r9
                r9 = 0
                goto L_0x0048
            L_0x007c:
                n0.c.k.g1 r9 = n0.c.k.g1.b
                r4 = 0
                java.lang.Object r2 = r0.v(r1, r4, r9, r2)
                r14 = r14 | 1
                goto L_0x0088
            L_0x0086:
                r4 = 0
                r15 = r4
            L_0x0088:
                r9 = r4
                r4 = 3
                goto L_0x0048
            L_0x008b:
                r6 = r3
                r8 = r10
                r7 = r11
                r9 = r12
                r10 = r13
                r4 = r14
            L_0x0091:
                r0.b(r1)
                com.clubhouse.android.data.models.remote.response.GetPaymentRegistrationResponse r0 = new com.clubhouse.android.data.models.remote.response.GetPaymentRegistrationResponse
                r5 = r2
                java.lang.String r5 = (java.lang.String) r5
                r3 = r0
                r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.models.remote.response.GetPaymentRegistrationResponse.a.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            GetPaymentRegistrationResponse getPaymentRegistrationResponse = (GetPaymentRegistrationResponse) obj;
            i.e(encoder, "encoder");
            i.e(getPaymentRegistrationResponse, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(getPaymentRegistrationResponse, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            boolean z = false;
            if (c.v(serialDescriptor, 0) || getPaymentRegistrationResponse.a != null) {
                c.l(serialDescriptor, 0, g1.b, getPaymentRegistrationResponse.a);
            }
            if (c.v(serialDescriptor, 1) || getPaymentRegistrationResponse.b) {
                c.r(serialDescriptor, 1, getPaymentRegistrationResponse.b);
            }
            if (c.v(serialDescriptor, 2) || getPaymentRegistrationResponse.c) {
                c.r(serialDescriptor, 2, getPaymentRegistrationResponse.c);
            }
            if (c.v(serialDescriptor, 3) || getPaymentRegistrationResponse.d) {
                c.r(serialDescriptor, 3, getPaymentRegistrationResponse.d);
            }
            if (c.v(serialDescriptor, 4) || getPaymentRegistrationResponse.e) {
                c.r(serialDescriptor, 4, getPaymentRegistrationResponse.e);
            }
            if (c.v(serialDescriptor, 5) || getPaymentRegistrationResponse.f) {
                z = true;
            }
            if (z) {
                c.r(serialDescriptor, 5, getPaymentRegistrationResponse.f);
            }
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    public GetPaymentRegistrationResponse() {
        this.a = null;
        this.b = false;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetPaymentRegistrationResponse)) {
            return false;
        }
        GetPaymentRegistrationResponse getPaymentRegistrationResponse = (GetPaymentRegistrationResponse) obj;
        return i.a(this.a, getPaymentRegistrationResponse.a) && this.b == getPaymentRegistrationResponse.b && this.c == getPaymentRegistrationResponse.c && this.d == getPaymentRegistrationResponse.d && this.e == getPaymentRegistrationResponse.e && this.f == getPaymentRegistrationResponse.f;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z = this.b;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.c;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.d;
        if (z4) {
            z4 = true;
        }
        int i3 = (i2 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.e;
        if (z5) {
            z5 = true;
        }
        int i4 = (i3 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.f;
        if (!z6) {
            z2 = z6;
        }
        return i4 + (z2 ? 1 : 0);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("GetPaymentRegistrationResponse(url=");
        P0.append(this.a);
        P0.append(", isRegistered=");
        P0.append(this.b);
        P0.append(", isActive=");
        P0.append(this.c);
        P0.append(", isEnabled=");
        P0.append(this.d);
        P0.append(", needsAction=");
        P0.append(this.e);
        P0.append(", needsEmailVerification=");
        return i0.d.a.a.a.C0(P0, this.f, ')');
    }

    public GetPaymentRegistrationResponse(int i, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        if ((i & 0) == 0) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = false;
            } else {
                this.b = z;
            }
            if ((i & 4) == 0) {
                this.c = false;
            } else {
                this.c = z2;
            }
            if ((i & 8) == 0) {
                this.d = false;
            } else {
                this.d = z3;
            }
            if ((i & 16) == 0) {
                this.e = false;
            } else {
                this.e = z4;
            }
            if ((i & 32) == 0) {
                this.f = false;
            } else {
                this.f = z5;
            }
        } else {
            a aVar = a.a;
            m0.r.t.a.r.m.a1.a.W3(i, 0, a.b);
            throw null;
        }
    }
}
