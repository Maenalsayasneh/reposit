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
/* compiled from: RemoveClubTopicRequest.kt */
public final class RemoveClubTopicRequest {
    public static final Companion Companion = new Companion((f) null);
    public final int a;
    public final int b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/remote/request/RemoveClubTopicRequest$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/remote/request/RemoveClubTopicRequest;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: RemoveClubTopicRequest.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<RemoveClubTopicRequest> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: RemoveClubTopicRequest.kt */
    public static final class a implements v<RemoveClubTopicRequest> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.remote.request.RemoveClubTopicRequest", aVar, 2);
            pluginGeneratedSerialDescriptor.i("club_id", false);
            pluginGeneratedSerialDescriptor.i("topic_id", false);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            e0 e0Var = e0.b;
            return new KSerializer[]{e0Var, e0Var};
        }

        public Object deserialize(Decoder decoder) {
            int i;
            int i2;
            int i3;
            i.e(decoder, "decoder");
            SerialDescriptor serialDescriptor = b;
            c c = decoder.c(serialDescriptor);
            if (c.y()) {
                i3 = c.k(serialDescriptor, 0);
                i2 = c.k(serialDescriptor, 1);
                i = 3;
            } else {
                i3 = 0;
                int i4 = 0;
                int i5 = 0;
                boolean z = true;
                while (z) {
                    int x = c.x(serialDescriptor);
                    if (x == -1) {
                        z = false;
                    } else if (x == 0) {
                        i3 = c.k(serialDescriptor, 0);
                        i5 |= 1;
                    } else if (x == 1) {
                        i4 = c.k(serialDescriptor, 1);
                        i5 |= 2;
                    } else {
                        throw new UnknownFieldException(x);
                    }
                }
                i2 = i4;
                i = i5;
            }
            c.b(serialDescriptor);
            return new RemoveClubTopicRequest(i, i3, i2);
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            RemoveClubTopicRequest removeClubTopicRequest = (RemoveClubTopicRequest) obj;
            i.e(encoder, "encoder");
            i.e(removeClubTopicRequest, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(removeClubTopicRequest, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            c.q(serialDescriptor, 0, removeClubTopicRequest.a);
            c.q(serialDescriptor, 1, removeClubTopicRequest.b);
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    public RemoveClubTopicRequest(int i, int i2, int i3) {
        if (3 == (i & 3)) {
            this.a = i2;
            this.b = i3;
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
        if (!(obj instanceof RemoveClubTopicRequest)) {
            return false;
        }
        RemoveClubTopicRequest removeClubTopicRequest = (RemoveClubTopicRequest) obj;
        return this.a == removeClubTopicRequest.a && this.b == removeClubTopicRequest.b;
    }

    public int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("RemoveClubTopicRequest(clubId=");
        P0.append(this.a);
        P0.append(", topicId=");
        return i0.d.a.a.a.s0(P0, this.b, ')');
    }
}
