package com.clubhouse.android.data.models.remote.request;

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
/* compiled from: StartPhoneNumberAuthRequest.kt */
public final class StartPhoneNumberAuthRequest {
    public static final Companion Companion = new Companion((f) null);
    public final String a;
    public final Boolean b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/remote/request/StartPhoneNumberAuthRequest$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/remote/request/StartPhoneNumberAuthRequest;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: StartPhoneNumberAuthRequest.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<StartPhoneNumberAuthRequest> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: StartPhoneNumberAuthRequest.kt */
    public static final class a implements v<StartPhoneNumberAuthRequest> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.remote.request.StartPhoneNumberAuthRequest", aVar, 2);
            pluginGeneratedSerialDescriptor.i("phone_number", false);
            pluginGeneratedSerialDescriptor.i("force_sms", true);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            return new KSerializer[]{g1.b, m0.r.t.a.r.m.a1.a.R1(h.b)};
        }

        public Object deserialize(Decoder decoder) {
            int i;
            Object obj;
            String str;
            i.e(decoder, "decoder");
            SerialDescriptor serialDescriptor = b;
            c c = decoder.c(serialDescriptor);
            String str2 = null;
            if (c.y()) {
                str = c.t(serialDescriptor, 0);
                obj = c.v(serialDescriptor, 1, h.b, null);
                i = 3;
            } else {
                Object obj2 = null;
                int i2 = 0;
                boolean z = true;
                while (z) {
                    int x = c.x(serialDescriptor);
                    if (x == -1) {
                        z = false;
                    } else if (x == 0) {
                        str2 = c.t(serialDescriptor, 0);
                        i2 |= 1;
                    } else if (x == 1) {
                        obj2 = c.v(serialDescriptor, 1, h.b, obj2);
                        i2 |= 2;
                    } else {
                        throw new UnknownFieldException(x);
                    }
                }
                i = i2;
                String str3 = str2;
                obj = obj2;
                str = str3;
            }
            c.b(serialDescriptor);
            return new StartPhoneNumberAuthRequest(i, str, (Boolean) obj);
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            StartPhoneNumberAuthRequest startPhoneNumberAuthRequest = (StartPhoneNumberAuthRequest) obj;
            i.e(encoder, "encoder");
            i.e(startPhoneNumberAuthRequest, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(startPhoneNumberAuthRequest, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            boolean z = false;
            c.s(serialDescriptor, 0, startPhoneNumberAuthRequest.a);
            if (c.v(serialDescriptor, 1) || !i.a(startPhoneNumberAuthRequest.b, Boolean.FALSE)) {
                z = true;
            }
            if (z) {
                c.l(serialDescriptor, 1, h.b, startPhoneNumberAuthRequest.b);
            }
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    public StartPhoneNumberAuthRequest(int i, String str, Boolean bool) {
        if (1 == (i & 1)) {
            this.a = str;
            if ((i & 2) == 0) {
                this.b = Boolean.FALSE;
            } else {
                this.b = bool;
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
        if (!(obj instanceof StartPhoneNumberAuthRequest)) {
            return false;
        }
        StartPhoneNumberAuthRequest startPhoneNumberAuthRequest = (StartPhoneNumberAuthRequest) obj;
        return i.a(this.a, startPhoneNumberAuthRequest.a) && i.a(this.b, startPhoneNumberAuthRequest.b);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Boolean bool = this.b;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("StartPhoneNumberAuthRequest(phoneNumber=");
        P0.append(this.a);
        P0.append(", forceSms=");
        P0.append(this.b);
        P0.append(')');
        return P0.toString();
    }

    public StartPhoneNumberAuthRequest(String str, Boolean bool) {
        i.e(str, "phoneNumber");
        this.a = str;
        this.b = bool;
    }
}
