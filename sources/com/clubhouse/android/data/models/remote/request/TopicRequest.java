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
import n0.c.k.e0;
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: TopicRequest.kt */
public final class TopicRequest {
    public static final Companion Companion = new Companion((f) null);
    public final int a;
    public final Integer b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/remote/request/TopicRequest$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/remote/request/TopicRequest;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: TopicRequest.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<TopicRequest> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: TopicRequest.kt */
    public static final class a implements v<TopicRequest> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.remote.request.TopicRequest", aVar, 2);
            pluginGeneratedSerialDescriptor.i("topic_id", false);
            pluginGeneratedSerialDescriptor.i("club_id", true);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            e0 e0Var = e0.b;
            return new KSerializer[]{e0Var, m0.r.t.a.r.m.a1.a.R1(e0Var)};
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
                obj = c.v(serialDescriptor, 1, e0.b, null);
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
                        obj = c.v(serialDescriptor, 1, e0.b, obj);
                        i3 |= 2;
                    } else {
                        throw new UnknownFieldException(x);
                    }
                }
                i = i3;
            }
            c.b(serialDescriptor);
            return new TopicRequest(i, i2, (Integer) obj);
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            TopicRequest topicRequest = (TopicRequest) obj;
            i.e(encoder, "encoder");
            i.e(topicRequest, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(topicRequest, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            boolean z = false;
            c.q(serialDescriptor, 0, topicRequest.a);
            if (c.v(serialDescriptor, 1) || topicRequest.b != null) {
                z = true;
            }
            if (z) {
                c.l(serialDescriptor, 1, e0.b, topicRequest.b);
            }
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    public TopicRequest(int i, int i2, Integer num) {
        if (1 == (i & 1)) {
            this.a = i2;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = num;
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
        if (!(obj instanceof TopicRequest)) {
            return false;
        }
        TopicRequest topicRequest = (TopicRequest) obj;
        return this.a == topicRequest.a && i.a(this.b, topicRequest.b);
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("TopicRequest(topicId=");
        P0.append(this.a);
        P0.append(", clubId=");
        return i0.d.a.a.a.v0(P0, this.b, ')');
    }

    public TopicRequest(int i, Integer num, int i2) {
        int i3 = i2 & 2;
        this.a = i;
        this.b = null;
    }
}
