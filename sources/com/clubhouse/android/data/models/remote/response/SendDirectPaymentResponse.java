package com.clubhouse.android.data.models.remote.response;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import m0.n.b.f;
import m0.n.b.i;
import n0.c.e;
import n0.c.j.c;
import n0.c.j.d;
import n0.c.k.g1;
import n0.c.k.h;
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: SendDirectPaymentResponse.kt */
public final class SendDirectPaymentResponse {
    public static final Companion Companion = new Companion((f) null);
    public final boolean a;
    public final String b;
    public final String c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/remote/response/SendDirectPaymentResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/remote/response/SendDirectPaymentResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: SendDirectPaymentResponse.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<SendDirectPaymentResponse> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: SendDirectPaymentResponse.kt */
    public static final class a implements v<SendDirectPaymentResponse> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.remote.response.SendDirectPaymentResponse", aVar, 3);
            pluginGeneratedSerialDescriptor.i("needs_action", true);
            pluginGeneratedSerialDescriptor.i("client_secret", false);
            pluginGeneratedSerialDescriptor.i("connect_account_id", false);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            g1 g1Var = g1.b;
            return new KSerializer[]{h.b, m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(g1Var)};
        }

        public Object deserialize(Decoder decoder) {
            Object obj;
            int i;
            Object obj2;
            boolean z;
            i.e(decoder, "decoder");
            SerialDescriptor serialDescriptor = b;
            c c = decoder.c(serialDescriptor);
            Object obj3 = null;
            if (c.y()) {
                z = c.s(serialDescriptor, 0);
                g1 g1Var = g1.b;
                obj = c.v(serialDescriptor, 1, g1Var, null);
                obj2 = c.v(serialDescriptor, 2, g1Var, null);
                i = 7;
            } else {
                Object obj4 = null;
                z = false;
                int i2 = 0;
                boolean z2 = true;
                while (z2) {
                    int x = c.x(serialDescriptor);
                    if (x == -1) {
                        z2 = false;
                    } else if (x == 0) {
                        z = c.s(serialDescriptor, 0);
                        i2 |= 1;
                    } else if (x == 1) {
                        obj3 = c.v(serialDescriptor, 1, g1.b, obj3);
                        i2 |= 2;
                    } else if (x == 2) {
                        obj4 = c.v(serialDescriptor, 2, g1.b, obj4);
                        i2 |= 4;
                    } else {
                        throw new UnknownFieldException(x);
                    }
                }
                obj = obj3;
                obj2 = obj4;
                i = i2;
            }
            c.b(serialDescriptor);
            return new SendDirectPaymentResponse(i, z, (String) obj, (String) obj2);
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            SendDirectPaymentResponse sendDirectPaymentResponse = (SendDirectPaymentResponse) obj;
            i.e(encoder, "encoder");
            i.e(sendDirectPaymentResponse, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(sendDirectPaymentResponse, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            if (c.v(serialDescriptor, 0) || sendDirectPaymentResponse.a) {
                c.r(serialDescriptor, 0, sendDirectPaymentResponse.a);
            }
            g1 g1Var = g1.b;
            c.l(serialDescriptor, 1, g1Var, sendDirectPaymentResponse.b);
            c.l(serialDescriptor, 2, g1Var, sendDirectPaymentResponse.c);
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    public SendDirectPaymentResponse(int i, boolean z, String str, String str2) {
        if (6 == (i & 6)) {
            if ((i & 1) == 0) {
                this.a = false;
            } else {
                this.a = z;
            }
            this.b = str;
            this.c = str2;
            return;
        }
        a aVar = a.a;
        m0.r.t.a.r.m.a1.a.W3(i, 6, a.b);
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SendDirectPaymentResponse)) {
            return false;
        }
        SendDirectPaymentResponse sendDirectPaymentResponse = (SendDirectPaymentResponse) obj;
        return this.a == sendDirectPaymentResponse.a && i.a(this.b, sendDirectPaymentResponse.b) && i.a(this.c, sendDirectPaymentResponse.c);
    }

    public int hashCode() {
        boolean z = this.a;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        String str = this.b;
        int i2 = 0;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("SendDirectPaymentResponse(needsAction=");
        P0.append(this.a);
        P0.append(", clientSecret=");
        P0.append(this.b);
        P0.append(", connectAccountId=");
        return i0.d.a.a.a.w0(P0, this.c, ')');
    }
}
