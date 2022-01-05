package com.clubhouse.android.data.models.remote.request;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.pubnub.api.endpoints.objects_api.utils.Include;
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
/* compiled from: AcceptSpeakerInviteRequest.kt */
public final class AcceptSpeakerInviteRequest {
    public static final Companion Companion = new Companion((f) null);
    public final String a;
    public final Integer b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/remote/request/AcceptSpeakerInviteRequest$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/remote/request/AcceptSpeakerInviteRequest;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: AcceptSpeakerInviteRequest.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<AcceptSpeakerInviteRequest> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: AcceptSpeakerInviteRequest.kt */
    public static final class a implements v<AcceptSpeakerInviteRequest> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.remote.request.AcceptSpeakerInviteRequest", aVar, 2);
            pluginGeneratedSerialDescriptor.i(Include.INCLUDE_CHANNEL_PARAM_VALUE, false);
            pluginGeneratedSerialDescriptor.i("user_id", false);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            return new KSerializer[]{g1.b, m0.r.t.a.r.m.a1.a.R1(e0.b)};
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
                obj = c.v(serialDescriptor, 1, e0.b, null);
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
                        obj2 = c.v(serialDescriptor, 1, e0.b, obj2);
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
            return new AcceptSpeakerInviteRequest(i, str, (Integer) obj);
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            AcceptSpeakerInviteRequest acceptSpeakerInviteRequest = (AcceptSpeakerInviteRequest) obj;
            i.e(encoder, "encoder");
            i.e(acceptSpeakerInviteRequest, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(acceptSpeakerInviteRequest, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            c.s(serialDescriptor, 0, acceptSpeakerInviteRequest.a);
            c.l(serialDescriptor, 1, e0.b, acceptSpeakerInviteRequest.b);
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    public AcceptSpeakerInviteRequest(int i, String str, Integer num) {
        if (3 == (i & 3)) {
            this.a = str;
            this.b = num;
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
        if (!(obj instanceof AcceptSpeakerInviteRequest)) {
            return false;
        }
        AcceptSpeakerInviteRequest acceptSpeakerInviteRequest = (AcceptSpeakerInviteRequest) obj;
        return i.a(this.a, acceptSpeakerInviteRequest.a) && i.a(this.b, acceptSpeakerInviteRequest.b);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("AcceptSpeakerInviteRequest(channel=");
        P0.append(this.a);
        P0.append(", userId=");
        return i0.d.a.a.a.v0(P0, this.b, ')');
    }

    public AcceptSpeakerInviteRequest(String str, Integer num) {
        i.e(str, Include.INCLUDE_CHANNEL_PARAM_VALUE);
        this.a = str;
        this.b = num;
    }
}
