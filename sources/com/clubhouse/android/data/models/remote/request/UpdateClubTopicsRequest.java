package com.clubhouse.android.data.models.remote.request;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.util.List;
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
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: UpdateClubTopicsRequest.kt */
public final class UpdateClubTopicsRequest {
    public static final Companion Companion = new Companion((f) null);
    public final int a;
    public final List<Integer> b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/remote/request/UpdateClubTopicsRequest$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/remote/request/UpdateClubTopicsRequest;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: UpdateClubTopicsRequest.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<UpdateClubTopicsRequest> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: UpdateClubTopicsRequest.kt */
    public static final class a implements v<UpdateClubTopicsRequest> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.remote.request.UpdateClubTopicsRequest", aVar, 2);
            pluginGeneratedSerialDescriptor.i("club_id", false);
            pluginGeneratedSerialDescriptor.i("topic_ids", false);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            e0 e0Var = e0.b;
            return new KSerializer[]{e0Var, new n0.c.k.e(e0Var)};
        }

        public Object deserialize(Decoder decoder) {
            int i;
            int i2;
            i.e(decoder, "decoder");
            SerialDescriptor serialDescriptor = b;
            Object obj = null;
            c c = decoder.c(serialDescriptor);
            if (c.y()) {
                i2 = c.k(serialDescriptor, 0);
                obj = c.m(serialDescriptor, 1, new n0.c.k.e(e0.b), null);
                i = 3;
            } else {
                i2 = 0;
                int i3 = 0;
                boolean z = true;
                while (z) {
                    int x = c.x(serialDescriptor);
                    if (x == -1) {
                        z = false;
                    } else if (x == 0) {
                        i2 = c.k(serialDescriptor, 0);
                        i3 |= 1;
                    } else if (x == 1) {
                        obj = c.m(serialDescriptor, 1, new n0.c.k.e(e0.b), obj);
                        i3 |= 2;
                    } else {
                        throw new UnknownFieldException(x);
                    }
                }
                i = i3;
            }
            c.b(serialDescriptor);
            return new UpdateClubTopicsRequest(i, i2, (List) obj);
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            UpdateClubTopicsRequest updateClubTopicsRequest = (UpdateClubTopicsRequest) obj;
            i.e(encoder, "encoder");
            i.e(updateClubTopicsRequest, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(updateClubTopicsRequest, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            c.q(serialDescriptor, 0, updateClubTopicsRequest.a);
            c.z(serialDescriptor, 1, new n0.c.k.e(e0.b), updateClubTopicsRequest.b);
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    public UpdateClubTopicsRequest(int i, int i2, List list) {
        if (3 == (i & 3)) {
            this.a = i2;
            this.b = list;
            return;
        }
        a aVar = a.a;
        m0.r.t.a.r.m.a1.a.W3(i, 3, a.b);
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateClubTopicsRequest)) {
            return false;
        }
        UpdateClubTopicsRequest updateClubTopicsRequest = (UpdateClubTopicsRequest) obj;
        return this.a == updateClubTopicsRequest.a && i.a(this.b, updateClubTopicsRequest.b);
    }

    public int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("UpdateClubTopicsRequest(clubId=");
        P0.append(this.a);
        P0.append(", topicIds=");
        return i0.d.a.a.a.A0(P0, this.b, ')');
    }

    public UpdateClubTopicsRequest(int i, List<Integer> list) {
        i.e(list, "topicIds");
        this.a = i;
        this.b = list;
    }
}
