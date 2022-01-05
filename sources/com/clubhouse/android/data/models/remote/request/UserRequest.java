package com.clubhouse.android.data.models.remote.request;

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
/* compiled from: UserRequest.kt */
public final class UserRequest {
    public static final Companion Companion = new Companion((f) null);
    public final Integer a;
    public final String b;
    public final Map<String, Object> c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/remote/request/UserRequest$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/remote/request/UserRequest;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: UserRequest.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<UserRequest> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: UserRequest.kt */
    public static final class a implements v<UserRequest> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.remote.request.UserRequest", aVar, 3);
            pluginGeneratedSerialDescriptor.i("user_id", true);
            pluginGeneratedSerialDescriptor.i("username", true);
            pluginGeneratedSerialDescriptor.i("logging_context", true);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            g1 g1Var = g1.b;
            return new KSerializer[]{m0.r.t.a.r.m.a1.a.R1(e0.b), m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(new h0(g1Var, i0.e.b.b3.a.b.c.a.a))};
        }

        public Object deserialize(Decoder decoder) {
            Object obj;
            int i;
            Object obj2;
            Object obj3;
            i.e(decoder, "decoder");
            SerialDescriptor serialDescriptor = b;
            c c = decoder.c(serialDescriptor);
            Object obj4 = null;
            if (c.y()) {
                obj3 = c.v(serialDescriptor, 0, e0.b, null);
                g1 g1Var = g1.b;
                obj = c.v(serialDescriptor, 1, g1Var, null);
                obj2 = c.v(serialDescriptor, 2, new h0(g1Var, i0.e.b.b3.a.b.c.a.a), null);
                i = 7;
            } else {
                obj3 = null;
                Object obj5 = null;
                int i2 = 0;
                boolean z = true;
                while (z) {
                    int x = c.x(serialDescriptor);
                    if (x == -1) {
                        z = false;
                    } else if (x == 0) {
                        obj3 = c.v(serialDescriptor, 0, e0.b, obj3);
                        i2 |= 1;
                    } else if (x == 1) {
                        obj4 = c.v(serialDescriptor, 1, g1.b, obj4);
                        i2 |= 2;
                    } else if (x == 2) {
                        obj5 = c.v(serialDescriptor, 2, new h0(g1.b, i0.e.b.b3.a.b.c.a.a), obj5);
                        i2 |= 4;
                    } else {
                        throw new UnknownFieldException(x);
                    }
                }
                obj = obj4;
                obj2 = obj5;
                i = i2;
            }
            c.b(serialDescriptor);
            return new UserRequest(i, (Integer) obj3, (String) obj, (Map) obj2);
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            UserRequest userRequest = (UserRequest) obj;
            i.e(encoder, "encoder");
            i.e(userRequest, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(userRequest, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            boolean z = false;
            if (c.v(serialDescriptor, 0) || userRequest.a != null) {
                c.l(serialDescriptor, 0, e0.b, userRequest.a);
            }
            if (c.v(serialDescriptor, 1) || userRequest.b != null) {
                c.l(serialDescriptor, 1, g1.b, userRequest.b);
            }
            if (c.v(serialDescriptor, 2) || userRequest.c != null) {
                z = true;
            }
            if (z) {
                c.l(serialDescriptor, 2, new h0(g1.b, i0.e.b.b3.a.b.c.a.a), userRequest.c);
            }
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    public UserRequest() {
        this((Integer) null, (String) null, (Map) null, 7);
    }

    public UserRequest(int i, Integer num, String str, Map map) {
        if ((i & 0) == 0) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = num;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = map;
            }
        } else {
            a aVar = a.a;
            m0.r.t.a.r.m.a1.a.W3(i, 0, a.b);
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserRequest)) {
            return false;
        }
        UserRequest userRequest = (UserRequest) obj;
        return i.a(this.a, userRequest.a) && i.a(this.b, userRequest.b) && i.a(this.c, userRequest.c);
    }

    public int hashCode() {
        Integer num = this.a;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, Object> map = this.c;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("UserRequest(userId=");
        P0.append(this.a);
        P0.append(", username=");
        P0.append(this.b);
        P0.append(", loggingContext=");
        return i0.d.a.a.a.B0(P0, this.c, ')');
    }

    public UserRequest(Integer num, String str, Map<String, ? extends Object> map) {
        this.a = num;
        this.b = str;
        this.c = map;
    }

    public UserRequest(Integer num, String str, Map map, int i) {
        int i2 = i & 2;
        int i3 = i & 4;
        this.a = (i & 1) != 0 ? null : num;
        this.b = null;
        this.c = null;
    }
}
