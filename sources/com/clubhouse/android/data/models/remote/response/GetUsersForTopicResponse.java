package com.clubhouse.android.data.models.remote.response;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.util.ArrayList;
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
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: GetUsersForTopicResponse.kt */
public final class GetUsersForTopicResponse {
    public static final Companion Companion = new Companion((f) null);
    public final ArrayList<String> a;
    public final int b;
    public final int c;
    public final int d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/remote/response/GetUsersForTopicResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/remote/response/GetUsersForTopicResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: GetUsersForTopicResponse.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<GetUsersForTopicResponse> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: GetUsersForTopicResponse.kt */
    public static final class a implements v<GetUsersForTopicResponse> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.remote.response.GetUsersForTopicResponse", aVar, 4);
            pluginGeneratedSerialDescriptor.i("clubs", false);
            pluginGeneratedSerialDescriptor.i("count", false);
            pluginGeneratedSerialDescriptor.i("next", false);
            pluginGeneratedSerialDescriptor.i("previous", false);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            e0 e0Var = e0.b;
            return new KSerializer[]{new n0.c.k.e(g1.b), e0Var, e0Var, e0Var};
        }

        public Object deserialize(Decoder decoder) {
            int i;
            int i2;
            int i3;
            int i4;
            i.e(decoder, "decoder");
            SerialDescriptor serialDescriptor = b;
            Object obj = null;
            c c = decoder.c(serialDescriptor);
            if (c.y()) {
                obj = c.m(serialDescriptor, 0, new n0.c.k.e(g1.b), null);
                int k = c.k(serialDescriptor, 1);
                int k2 = c.k(serialDescriptor, 2);
                i = c.k(serialDescriptor, 3);
                i2 = k2;
                i4 = 15;
                i3 = k;
            } else {
                int i5 = 0;
                i = 0;
                int i6 = 0;
                int i7 = 0;
                boolean z = true;
                while (z) {
                    int x = c.x(serialDescriptor);
                    if (x == -1) {
                        z = false;
                    } else if (x == 0) {
                        obj = c.m(serialDescriptor, 0, new n0.c.k.e(g1.b), obj);
                        i7 |= 1;
                    } else if (x == 1) {
                        i5 = c.k(serialDescriptor, 1);
                        i7 |= 2;
                    } else if (x == 2) {
                        i6 = c.k(serialDescriptor, 2);
                        i7 |= 4;
                    } else if (x == 3) {
                        i = c.k(serialDescriptor, 3);
                        i7 |= 8;
                    } else {
                        throw new UnknownFieldException(x);
                    }
                }
                i3 = i5;
                i2 = i6;
                i4 = i7;
            }
            c.b(serialDescriptor);
            return new GetUsersForTopicResponse(i4, (ArrayList) obj, i3, i2, i);
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            GetUsersForTopicResponse getUsersForTopicResponse = (GetUsersForTopicResponse) obj;
            i.e(encoder, "encoder");
            i.e(getUsersForTopicResponse, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(getUsersForTopicResponse, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            c.z(serialDescriptor, 0, new n0.c.k.e(g1.b), getUsersForTopicResponse.a);
            c.q(serialDescriptor, 1, getUsersForTopicResponse.b);
            c.q(serialDescriptor, 2, getUsersForTopicResponse.c);
            c.q(serialDescriptor, 3, getUsersForTopicResponse.d);
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    public GetUsersForTopicResponse(int i, ArrayList arrayList, int i2, int i3, int i4) {
        if (15 == (i & 15)) {
            this.a = arrayList;
            this.b = i2;
            this.c = i3;
            this.d = i4;
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
        if (!(obj instanceof GetUsersForTopicResponse)) {
            return false;
        }
        GetUsersForTopicResponse getUsersForTopicResponse = (GetUsersForTopicResponse) obj;
        return i.a(this.a, getUsersForTopicResponse.a) && this.b == getUsersForTopicResponse.b && this.c == getUsersForTopicResponse.c && this.d == getUsersForTopicResponse.d;
    }

    public int hashCode() {
        return Integer.hashCode(this.d) + i0.d.a.a.a.M(this.c, i0.d.a.a.a.M(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("GetUsersForTopicResponse(clubs=");
        P0.append(this.a);
        P0.append(", count=");
        P0.append(this.b);
        P0.append(", next=");
        P0.append(this.c);
        P0.append(", previous=");
        return i0.d.a.a.a.s0(P0, this.d, ')');
    }
}
