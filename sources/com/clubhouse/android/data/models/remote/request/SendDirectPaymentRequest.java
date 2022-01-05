package com.clubhouse.android.data.models.remote.request;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.pubnub.api.endpoints.objects_api.utils.Include;
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
/* compiled from: SendDirectPaymentRequest.kt */
public final class SendDirectPaymentRequest {
    public static final Companion Companion = new Companion((f) null);
    public final int a;
    public final int b;
    public final String c;
    public final String d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/remote/request/SendDirectPaymentRequest$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/remote/request/SendDirectPaymentRequest;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: SendDirectPaymentRequest.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<SendDirectPaymentRequest> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: SendDirectPaymentRequest.kt */
    public static final class a implements v<SendDirectPaymentRequest> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.remote.request.SendDirectPaymentRequest", aVar, 4);
            pluginGeneratedSerialDescriptor.i("receiving_user_id", false);
            pluginGeneratedSerialDescriptor.i("amount", false);
            pluginGeneratedSerialDescriptor.i("payment_method_id", false);
            pluginGeneratedSerialDescriptor.i(Include.INCLUDE_CHANNEL_PARAM_VALUE, false);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            e0 e0Var = e0.b;
            g1 g1Var = g1.b;
            return new KSerializer[]{e0Var, e0Var, g1Var, m0.r.t.a.r.m.a1.a.R1(g1Var)};
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
                r3 = 0
                r4 = 3
                r5 = 0
                r6 = 1
                r7 = 2
                if (r2 == 0) goto L_0x0032
                int r2 = r0.k(r1, r5)
                int r5 = r0.k(r1, r6)
                java.lang.String r6 = r0.t(r1, r7)
                n0.c.k.g1 r7 = n0.c.k.g1.b
                java.lang.Object r3 = r0.v(r1, r4, r7, r3)
                r4 = 15
                r14 = r2
                r13 = r4
                r15 = r5
                r16 = r6
                goto L_0x0074
            L_0x0032:
                r8 = r3
                r2 = r5
                r9 = r2
                r10 = r9
                r11 = r6
            L_0x0037:
                if (r11 == 0) goto L_0x006e
                int r12 = r0.x(r1)
                r13 = -1
                if (r12 == r13) goto L_0x006c
                if (r12 == 0) goto L_0x0065
                if (r12 == r6) goto L_0x005e
                if (r12 == r7) goto L_0x0057
                if (r12 != r4) goto L_0x0051
                n0.c.k.g1 r12 = n0.c.k.g1.b
                java.lang.Object r8 = r0.v(r1, r4, r12, r8)
                r9 = r9 | 8
                goto L_0x0037
            L_0x0051:
                kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
                r0.<init>(r12)
                throw r0
            L_0x0057:
                java.lang.String r3 = r0.t(r1, r7)
                r9 = r9 | 4
                goto L_0x0037
            L_0x005e:
                int r10 = r0.k(r1, r6)
                r9 = r9 | 2
                goto L_0x0037
            L_0x0065:
                int r2 = r0.k(r1, r5)
                r9 = r9 | 1
                goto L_0x0037
            L_0x006c:
                r11 = r5
                goto L_0x0037
            L_0x006e:
                r14 = r2
                r16 = r3
                r3 = r8
                r13 = r9
                r15 = r10
            L_0x0074:
                r0.b(r1)
                com.clubhouse.android.data.models.remote.request.SendDirectPaymentRequest r0 = new com.clubhouse.android.data.models.remote.request.SendDirectPaymentRequest
                r17 = r3
                java.lang.String r17 = (java.lang.String) r17
                r12 = r0
                r12.<init>(r13, r14, r15, r16, r17)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.models.remote.request.SendDirectPaymentRequest.a.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            SendDirectPaymentRequest sendDirectPaymentRequest = (SendDirectPaymentRequest) obj;
            i.e(encoder, "encoder");
            i.e(sendDirectPaymentRequest, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(sendDirectPaymentRequest, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            c.q(serialDescriptor, 0, sendDirectPaymentRequest.a);
            c.q(serialDescriptor, 1, sendDirectPaymentRequest.b);
            c.s(serialDescriptor, 2, sendDirectPaymentRequest.c);
            c.l(serialDescriptor, 3, g1.b, sendDirectPaymentRequest.d);
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    public SendDirectPaymentRequest(int i, int i2, int i3, String str, String str2) {
        if (15 == (i & 15)) {
            this.a = i2;
            this.b = i3;
            this.c = str;
            this.d = str2;
            return;
        }
        a aVar = a.a;
        m0.r.t.a.r.m.a1.a.W3(i, 15, a.b);
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SendDirectPaymentRequest)) {
            return false;
        }
        SendDirectPaymentRequest sendDirectPaymentRequest = (SendDirectPaymentRequest) obj;
        return this.a == sendDirectPaymentRequest.a && this.b == sendDirectPaymentRequest.b && i.a(this.c, sendDirectPaymentRequest.c) && i.a(this.d, sendDirectPaymentRequest.d);
    }

    public int hashCode() {
        int F = i0.d.a.a.a.F(this.c, i0.d.a.a.a.M(this.b, Integer.hashCode(this.a) * 31, 31), 31);
        String str = this.d;
        return F + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("SendDirectPaymentRequest(recipientId=");
        P0.append(this.a);
        P0.append(", amount=");
        P0.append(this.b);
        P0.append(", paymentMethodId=");
        P0.append(this.c);
        P0.append(", channel=");
        return i0.d.a.a.a.w0(P0, this.d, ')');
    }

    public SendDirectPaymentRequest(int i, int i2, String str, String str2) {
        i.e(str, "paymentMethodId");
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
    }
}
