package com.clubhouse.android.data.models.remote.request;

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
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: CompletePhoneNumberAuthRequest.kt */
public final class CompletePhoneNumberAuthRequest {
    public static final Companion Companion = new Companion((f) null);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/remote/request/CompletePhoneNumberAuthRequest$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/remote/request/CompletePhoneNumberAuthRequest;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: CompletePhoneNumberAuthRequest.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<CompletePhoneNumberAuthRequest> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: CompletePhoneNumberAuthRequest.kt */
    public static final class a implements v<CompletePhoneNumberAuthRequest> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.remote.request.CompletePhoneNumberAuthRequest", aVar, 6);
            pluginGeneratedSerialDescriptor.i("verification_code", true);
            pluginGeneratedSerialDescriptor.i("flashcall_guid", true);
            pluginGeneratedSerialDescriptor.i("phone_number", false);
            pluginGeneratedSerialDescriptor.i("safety_net_nonce", true);
            pluginGeneratedSerialDescriptor.i("safety_net_response", true);
            pluginGeneratedSerialDescriptor.i("rc_token", true);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            g1 g1Var = g1.b;
            return new KSerializer[]{m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(g1Var), g1Var, m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(g1Var)};
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x008f, code lost:
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
                if (r2 == 0) goto L_0x003b
                n0.c.k.g1 r2 = n0.c.k.g1.b
                java.lang.Object r9 = r0.v(r1, r9, r2, r4)
                java.lang.Object r5 = r0.v(r1, r5, r2, r4)
                java.lang.String r6 = r0.t(r1, r6)
                java.lang.Object r3 = r0.v(r1, r3, r2, r4)
                java.lang.Object r7 = r0.v(r1, r7, r2, r4)
                java.lang.Object r2 = r0.v(r1, r8, r2, r4)
                r4 = 63
                r10 = r5
                r8 = r6
                r5 = r4
                goto L_0x0098
            L_0x003b:
                r2 = r4
                r10 = r2
                r11 = r10
                r12 = r11
                r13 = r12
                r14 = r13
                r15 = r5
                r4 = r9
            L_0x0043:
                if (r15 == 0) goto L_0x0092
                int r9 = r0.x(r1)
                switch(r9) {
                    case -1: goto L_0x008d;
                    case 0: goto L_0x0083;
                    case 1: goto L_0x0078;
                    case 2: goto L_0x0070;
                    case 3: goto L_0x0066;
                    case 4: goto L_0x005c;
                    case 5: goto L_0x0052;
                    default: goto L_0x004c;
                }
            L_0x004c:
                kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
                r0.<init>(r9)
                throw r0
            L_0x0052:
                n0.c.k.g1 r9 = n0.c.k.g1.b
                java.lang.Object r9 = r0.v(r1, r8, r9, r12)
                r4 = r4 | 32
                r12 = r9
                goto L_0x0081
            L_0x005c:
                n0.c.k.g1 r9 = n0.c.k.g1.b
                java.lang.Object r9 = r0.v(r1, r7, r9, r11)
                r4 = r4 | 16
                r11 = r9
                goto L_0x0081
            L_0x0066:
                n0.c.k.g1 r9 = n0.c.k.g1.b
                java.lang.Object r9 = r0.v(r1, r3, r9, r14)
                r4 = r4 | 8
                r14 = r9
                goto L_0x0081
            L_0x0070:
                java.lang.String r9 = r0.t(r1, r6)
                r4 = r4 | 4
                r13 = r9
                goto L_0x0081
            L_0x0078:
                n0.c.k.g1 r9 = n0.c.k.g1.b
                java.lang.Object r9 = r0.v(r1, r5, r9, r10)
                r4 = r4 | 2
                r10 = r9
            L_0x0081:
                r9 = 0
                goto L_0x0043
            L_0x0083:
                n0.c.k.g1 r9 = n0.c.k.g1.b
                r3 = 0
                java.lang.Object r2 = r0.v(r1, r3, r9, r2)
                r4 = r4 | 1
                goto L_0x008f
            L_0x008d:
                r3 = 0
                r15 = r3
            L_0x008f:
                r9 = r3
                r3 = 3
                goto L_0x0043
            L_0x0092:
                r9 = r2
                r5 = r4
                r7 = r11
                r2 = r12
                r8 = r13
                r3 = r14
            L_0x0098:
                r0.b(r1)
                com.clubhouse.android.data.models.remote.request.CompletePhoneNumberAuthRequest r0 = new com.clubhouse.android.data.models.remote.request.CompletePhoneNumberAuthRequest
                r6 = r9
                java.lang.String r6 = (java.lang.String) r6
                r1 = r10
                java.lang.String r1 = (java.lang.String) r1
                r9 = r3
                java.lang.String r9 = (java.lang.String) r9
                r10 = r7
                java.lang.String r10 = (java.lang.String) r10
                r11 = r2
                java.lang.String r11 = (java.lang.String) r11
                r4 = r0
                r7 = r1
                r4.<init>(r5, r6, r7, r8, r9, r10, r11)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.models.remote.request.CompletePhoneNumberAuthRequest.a.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            CompletePhoneNumberAuthRequest completePhoneNumberAuthRequest = (CompletePhoneNumberAuthRequest) obj;
            i.e(encoder, "encoder");
            i.e(completePhoneNumberAuthRequest, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(completePhoneNumberAuthRequest, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            boolean z = false;
            if (c.v(serialDescriptor, 0) || completePhoneNumberAuthRequest.a != null) {
                c.l(serialDescriptor, 0, g1.b, completePhoneNumberAuthRequest.a);
            }
            if (c.v(serialDescriptor, 1) || completePhoneNumberAuthRequest.b != null) {
                c.l(serialDescriptor, 1, g1.b, completePhoneNumberAuthRequest.b);
            }
            c.s(serialDescriptor, 2, completePhoneNumberAuthRequest.c);
            if (c.v(serialDescriptor, 3) || completePhoneNumberAuthRequest.d != null) {
                c.l(serialDescriptor, 3, g1.b, completePhoneNumberAuthRequest.d);
            }
            if (c.v(serialDescriptor, 4) || completePhoneNumberAuthRequest.e != null) {
                c.l(serialDescriptor, 4, g1.b, completePhoneNumberAuthRequest.e);
            }
            if (c.v(serialDescriptor, 5) || completePhoneNumberAuthRequest.f != null) {
                z = true;
            }
            if (z) {
                c.l(serialDescriptor, 5, g1.b, completePhoneNumberAuthRequest.f);
            }
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    public CompletePhoneNumberAuthRequest(int i, String str, String str2, String str3, String str4, String str5, String str6) {
        if (4 == (i & 4)) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
            this.c = str3;
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = str4;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = str5;
            }
            if ((i & 32) == 0) {
                this.f = null;
            } else {
                this.f = str6;
            }
        } else {
            a aVar = a.a;
            m0.r.t.a.r.m.a1.a.W3(i, 4, a.b);
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompletePhoneNumberAuthRequest)) {
            return false;
        }
        CompletePhoneNumberAuthRequest completePhoneNumberAuthRequest = (CompletePhoneNumberAuthRequest) obj;
        return i.a(this.a, completePhoneNumberAuthRequest.a) && i.a(this.b, completePhoneNumberAuthRequest.b) && i.a(this.c, completePhoneNumberAuthRequest.c) && i.a(this.d, completePhoneNumberAuthRequest.d) && i.a(this.e, completePhoneNumberAuthRequest.e) && i.a(this.f, completePhoneNumberAuthRequest.f);
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int F = i0.d.a.a.a.F(this.c, (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.d;
        int hashCode2 = (F + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int hashCode3 = (hashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("CompletePhoneNumberAuthRequest(verificationCode=");
        P0.append(this.a);
        P0.append(", flashcallGuid=");
        P0.append(this.b);
        P0.append(", phoneNumber=");
        P0.append(this.c);
        P0.append(", safetyNetNonce=");
        P0.append(this.d);
        P0.append(", safetyNetResponse=");
        P0.append(this.e);
        P0.append(", rcToken=");
        return i0.d.a.a.a.w0(P0, this.f, ')');
    }

    public CompletePhoneNumberAuthRequest(String str, String str2, String str3, String str4, String str5, String str6) {
        i.e(str3, "phoneNumber");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }
}
