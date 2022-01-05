package com.clubhouse.android.data.models.remote.response;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.util.Map;
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
import n0.c.k.e0;
import n0.c.k.g1;
import n0.c.k.h0;
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: IgnoreSuggestionRequest.kt */
public final class IgnoreSuggestionRequest {
    public static final Companion Companion = new Companion((f) null);
    public final Integer a;
    public final Integer b;
    public final Map<String, Object> c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/remote/response/IgnoreSuggestionRequest$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/remote/response/IgnoreSuggestionRequest;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: IgnoreSuggestionRequest.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<IgnoreSuggestionRequest> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: IgnoreSuggestionRequest.kt */
    public static final class a implements v<IgnoreSuggestionRequest> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.remote.response.IgnoreSuggestionRequest", aVar, 3);
            pluginGeneratedSerialDescriptor.i("club_id", false);
            pluginGeneratedSerialDescriptor.i("user_id", false);
            pluginGeneratedSerialDescriptor.i("logging_context", false);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            e0 e0Var = e0.b;
            return new KSerializer[]{m0.r.t.a.r.m.a1.a.R1(e0Var), m0.r.t.a.r.m.a1.a.R1(e0Var), m0.r.t.a.r.m.a1.a.R1(new h0(g1.b, i0.e.b.b3.a.b.c.a.a))};
        }

        public Object deserialize(Decoder decoder) {
            int i;
            Object obj;
            Object obj2;
            Object obj3;
            i.e(decoder, "decoder");
            SerialDescriptor serialDescriptor = b;
            c c = decoder.c(serialDescriptor);
            Object obj4 = null;
            if (c.y()) {
                e0 e0Var = e0.b;
                obj = c.v(serialDescriptor, 0, e0Var, null);
                obj3 = c.v(serialDescriptor, 1, e0Var, null);
                obj2 = c.v(serialDescriptor, 2, new h0(g1.b, i0.e.b.b3.a.b.c.a.a), null);
                i = 7;
            } else {
                Object obj5 = null;
                Object obj6 = null;
                int i2 = 0;
                boolean z = true;
                while (z) {
                    int x = c.x(serialDescriptor);
                    if (x == -1) {
                        z = false;
                    } else if (x == 0) {
                        obj4 = c.v(serialDescriptor, 0, e0.b, obj4);
                        i2 |= 1;
                    } else if (x == 1) {
                        obj6 = c.v(serialDescriptor, 1, e0.b, obj6);
                        i2 |= 2;
                    } else if (x == 2) {
                        obj5 = c.v(serialDescriptor, 2, new h0(g1.b, i0.e.b.b3.a.b.c.a.a), obj5);
                        i2 |= 4;
                    } else {
                        throw new UnknownFieldException(x);
                    }
                }
                obj = obj4;
                i = i2;
                obj2 = obj5;
                obj3 = obj6;
            }
            c.b(serialDescriptor);
            return new IgnoreSuggestionRequest(i, (Integer) obj, (Integer) obj3, (Map) obj2);
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            IgnoreSuggestionRequest ignoreSuggestionRequest = (IgnoreSuggestionRequest) obj;
            i.e(encoder, "encoder");
            i.e(ignoreSuggestionRequest, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(ignoreSuggestionRequest, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            e0 e0Var = e0.b;
            c.l(serialDescriptor, 0, e0Var, ignoreSuggestionRequest.a);
            c.l(serialDescriptor, 1, e0Var, ignoreSuggestionRequest.b);
            c.l(serialDescriptor, 2, new h0(g1.b, i0.e.b.b3.a.b.c.a.a), ignoreSuggestionRequest.c);
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    public IgnoreSuggestionRequest(int i, Integer num, Integer num2, Map map) {
        if (7 == (i & 7)) {
            this.a = num;
            this.b = num2;
            this.c = map;
            return;
        }
        a aVar = a.a;
        m0.r.t.a.r.m.a1.a.W3(i, 7, a.b);
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IgnoreSuggestionRequest)) {
            return false;
        }
        IgnoreSuggestionRequest ignoreSuggestionRequest = (IgnoreSuggestionRequest) obj;
        return i.a(this.a, ignoreSuggestionRequest.a) && i.a(this.b, ignoreSuggestionRequest.b) && i.a(this.c, ignoreSuggestionRequest.c);
    }

    public int hashCode() {
        Integer num = this.a;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Map<String, Object> map = this.c;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("IgnoreSuggestionRequest(clubId=");
        P0.append(this.a);
        P0.append(", userId=");
        P0.append(this.b);
        P0.append(", loggingContext=");
        return i0.d.a.a.a.B0(P0, this.c, ')');
    }

    public IgnoreSuggestionRequest(Integer num, Integer num2, Map<String, ? extends Object> map) {
        this.a = num;
        this.b = num2;
        this.c = map;
    }
}
