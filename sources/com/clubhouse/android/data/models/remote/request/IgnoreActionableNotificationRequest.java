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
import n0.c.k.o0;
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: IgnoreActionableNotificationRequest.kt */
public final class IgnoreActionableNotificationRequest {
    public static final Companion Companion = new Companion((f) null);
    public final long a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/remote/request/IgnoreActionableNotificationRequest$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/remote/request/IgnoreActionableNotificationRequest;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: IgnoreActionableNotificationRequest.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<IgnoreActionableNotificationRequest> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: IgnoreActionableNotificationRequest.kt */
    public static final class a implements v<IgnoreActionableNotificationRequest> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.remote.request.IgnoreActionableNotificationRequest", aVar, 1);
            pluginGeneratedSerialDescriptor.i("actionable_notification_id", false);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            return new KSerializer[]{o0.b};
        }

        public Object deserialize(Decoder decoder) {
            i.e(decoder, "decoder");
            SerialDescriptor serialDescriptor = b;
            long j = 0;
            c c = decoder.c(serialDescriptor);
            int i = 1;
            if (c.y()) {
                j = c.h(serialDescriptor, 0);
            } else {
                int i2 = 0;
                while (i != 0) {
                    int x = c.x(serialDescriptor);
                    if (x == -1) {
                        i = 0;
                    } else if (x == 0) {
                        j = c.h(serialDescriptor, 0);
                        i2 |= 1;
                    } else {
                        throw new UnknownFieldException(x);
                    }
                }
                i = i2;
            }
            c.b(serialDescriptor);
            return new IgnoreActionableNotificationRequest(i, j);
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            IgnoreActionableNotificationRequest ignoreActionableNotificationRequest = (IgnoreActionableNotificationRequest) obj;
            i.e(encoder, "encoder");
            i.e(ignoreActionableNotificationRequest, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(ignoreActionableNotificationRequest, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            c.D(serialDescriptor, 0, ignoreActionableNotificationRequest.a);
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    public IgnoreActionableNotificationRequest(int i, long j) {
        if (1 == (i & 1)) {
            this.a = j;
            return;
        }
        a aVar = a.a;
        m0.r.t.a.r.m.a1.a.W3(i, 1, a.b);
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IgnoreActionableNotificationRequest) && this.a == ((IgnoreActionableNotificationRequest) obj).a;
    }

    public int hashCode() {
        return Long.hashCode(this.a);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("IgnoreActionableNotificationRequest(actionableNotificationId=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }

    public IgnoreActionableNotificationRequest(long j) {
        this.a = j;
    }
}
