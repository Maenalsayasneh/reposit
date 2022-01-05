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
import n0.c.k.e0;
import n0.c.k.h;
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: StartPhoneNumberAuthResponse.kt */
public final class StartPhoneNumberAuthResponse {
    public static final Companion Companion = new Companion((f) null);
    public final boolean a;
    public final Boolean b;
    public final Integer c;
    public final Boolean d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/remote/response/StartPhoneNumberAuthResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/remote/response/StartPhoneNumberAuthResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: StartPhoneNumberAuthResponse.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<StartPhoneNumberAuthResponse> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: StartPhoneNumberAuthResponse.kt */
    public static final class a implements v<StartPhoneNumberAuthResponse> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.remote.response.StartPhoneNumberAuthResponse", aVar, 4);
            pluginGeneratedSerialDescriptor.i("is_blocked", false);
            pluginGeneratedSerialDescriptor.i("send_rc_token", false);
            pluginGeneratedSerialDescriptor.i("num_digits", true);
            pluginGeneratedSerialDescriptor.i("use_flashcall", true);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            h hVar = h.b;
            return new KSerializer[]{hVar, m0.r.t.a.r.m.a1.a.R1(hVar), m0.r.t.a.r.m.a1.a.R1(e0.b), m0.r.t.a.r.m.a1.a.R1(hVar)};
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
                if (r2 == 0) goto L_0x0031
                boolean r2 = r0.s(r1, r5)
                n0.c.k.h r5 = n0.c.k.h.b
                java.lang.Object r6 = r0.v(r1, r6, r5, r4)
                n0.c.k.e0 r8 = n0.c.k.e0.b
                java.lang.Object r7 = r0.v(r1, r7, r8, r4)
                java.lang.Object r3 = r0.v(r1, r3, r5, r4)
                r4 = 15
                r14 = r2
                r13 = r4
                goto L_0x0077
            L_0x0031:
                r8 = r4
                r9 = r8
                r10 = r9
                r2 = r5
                r4 = r2
                r11 = r6
            L_0x0037:
                if (r11 == 0) goto L_0x0072
                int r12 = r0.x(r1)
                r13 = -1
                if (r12 == r13) goto L_0x0070
                if (r12 == 0) goto L_0x0069
                if (r12 == r6) goto L_0x0060
                if (r12 == r7) goto L_0x0057
                if (r12 != r3) goto L_0x0051
                n0.c.k.h r12 = n0.c.k.h.b
                java.lang.Object r10 = r0.v(r1, r3, r12, r10)
                r4 = r4 | 8
                goto L_0x0037
            L_0x0051:
                kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
                r0.<init>(r12)
                throw r0
            L_0x0057:
                n0.c.k.e0 r12 = n0.c.k.e0.b
                java.lang.Object r9 = r0.v(r1, r7, r12, r9)
                r4 = r4 | 4
                goto L_0x0037
            L_0x0060:
                n0.c.k.h r12 = n0.c.k.h.b
                java.lang.Object r8 = r0.v(r1, r6, r12, r8)
                r4 = r4 | 2
                goto L_0x0037
            L_0x0069:
                boolean r2 = r0.s(r1, r5)
                r4 = r4 | 1
                goto L_0x0037
            L_0x0070:
                r11 = r5
                goto L_0x0037
            L_0x0072:
                r14 = r2
                r13 = r4
                r6 = r8
                r7 = r9
                r3 = r10
            L_0x0077:
                r0.b(r1)
                com.clubhouse.android.data.models.remote.response.StartPhoneNumberAuthResponse r0 = new com.clubhouse.android.data.models.remote.response.StartPhoneNumberAuthResponse
                r15 = r6
                java.lang.Boolean r15 = (java.lang.Boolean) r15
                r16 = r7
                java.lang.Integer r16 = (java.lang.Integer) r16
                r17 = r3
                java.lang.Boolean r17 = (java.lang.Boolean) r17
                r12 = r0
                r12.<init>(r13, r14, r15, r16, r17)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.models.remote.response.StartPhoneNumberAuthResponse.a.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            StartPhoneNumberAuthResponse startPhoneNumberAuthResponse = (StartPhoneNumberAuthResponse) obj;
            i.e(encoder, "encoder");
            i.e(startPhoneNumberAuthResponse, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(startPhoneNumberAuthResponse, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            boolean z = false;
            c.r(serialDescriptor, 0, startPhoneNumberAuthResponse.a);
            h hVar = h.b;
            c.l(serialDescriptor, 1, hVar, startPhoneNumberAuthResponse.b);
            if (c.v(serialDescriptor, 2) || startPhoneNumberAuthResponse.c != null) {
                c.l(serialDescriptor, 2, e0.b, startPhoneNumberAuthResponse.c);
            }
            if (c.v(serialDescriptor, 3) || startPhoneNumberAuthResponse.d != null) {
                z = true;
            }
            if (z) {
                c.l(serialDescriptor, 3, hVar, startPhoneNumberAuthResponse.d);
            }
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    public StartPhoneNumberAuthResponse(int i, boolean z, Boolean bool, Integer num, Boolean bool2) {
        if (3 == (i & 3)) {
            this.a = z;
            this.b = bool;
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = num;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = bool2;
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
        if (!(obj instanceof StartPhoneNumberAuthResponse)) {
            return false;
        }
        StartPhoneNumberAuthResponse startPhoneNumberAuthResponse = (StartPhoneNumberAuthResponse) obj;
        return this.a == startPhoneNumberAuthResponse.a && i.a(this.b, startPhoneNumberAuthResponse.b) && i.a(this.c, startPhoneNumberAuthResponse.c) && i.a(this.d, startPhoneNumberAuthResponse.d);
    }

    public int hashCode() {
        boolean z = this.a;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        Boolean bool = this.b;
        int i2 = 0;
        int hashCode = (i + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.c;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool2 = this.d;
        if (bool2 != null) {
            i2 = bool2.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("StartPhoneNumberAuthResponse(isBlocked=");
        P0.append(this.a);
        P0.append(", sendRcToken=");
        P0.append(this.b);
        P0.append(", numDigitsForValidation=");
        P0.append(this.c);
        P0.append(", useFlashCall=");
        P0.append(this.d);
        P0.append(')');
        return P0.toString();
    }
}
