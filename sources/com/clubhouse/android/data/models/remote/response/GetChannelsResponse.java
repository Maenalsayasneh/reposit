package com.clubhouse.android.data.models.remote.response;

import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.data.models.local.channel.ChannelInFeed;
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
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: GetChannelsResponse.kt */
public final class GetChannelsResponse {
    public static final Companion Companion = new Companion((f) null);
    public final List<ChannelInFeed> a;
    public final List<EventInClub> b;
    public final List<EventInClub> c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/remote/response/GetChannelsResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/remote/response/GetChannelsResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: GetChannelsResponse.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<GetChannelsResponse> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: GetChannelsResponse.kt */
    public static final class a implements v<GetChannelsResponse> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.remote.response.GetChannelsResponse", aVar, 3);
            pluginGeneratedSerialDescriptor.i("channels", false);
            pluginGeneratedSerialDescriptor.i("events", true);
            pluginGeneratedSerialDescriptor.i("featured_events", true);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            EventInClub.a aVar = EventInClub.a.a;
            return new KSerializer[]{new n0.c.k.e(ChannelInFeed.a.a), m0.r.t.a.r.m.a1.a.R1(new n0.c.k.e(aVar)), m0.r.t.a.r.m.a1.a.R1(new n0.c.k.e(aVar))};
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
                obj3 = c.m(serialDescriptor, 0, new n0.c.k.e(ChannelInFeed.a.a), null);
                EventInClub.a aVar = EventInClub.a.a;
                obj = c.v(serialDescriptor, 1, new n0.c.k.e(aVar), null);
                obj2 = c.v(serialDescriptor, 2, new n0.c.k.e(aVar), null);
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
                        obj3 = c.m(serialDescriptor, 0, new n0.c.k.e(ChannelInFeed.a.a), obj3);
                        i2 |= 1;
                    } else if (x == 1) {
                        obj4 = c.v(serialDescriptor, 1, new n0.c.k.e(EventInClub.a.a), obj4);
                        i2 |= 2;
                    } else if (x == 2) {
                        obj5 = c.v(serialDescriptor, 2, new n0.c.k.e(EventInClub.a.a), obj5);
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
            return new GetChannelsResponse(i, (List) obj3, (List) obj, (List) obj2);
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            GetChannelsResponse getChannelsResponse = (GetChannelsResponse) obj;
            i.e(encoder, "encoder");
            i.e(getChannelsResponse, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(getChannelsResponse, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            boolean z = false;
            c.z(serialDescriptor, 0, new n0.c.k.e(ChannelInFeed.a.a), getChannelsResponse.a);
            if (c.v(serialDescriptor, 1) || getChannelsResponse.b != null) {
                c.l(serialDescriptor, 1, new n0.c.k.e(EventInClub.a.a), getChannelsResponse.b);
            }
            if (c.v(serialDescriptor, 2) || getChannelsResponse.c != null) {
                z = true;
            }
            if (z) {
                c.l(serialDescriptor, 2, new n0.c.k.e(EventInClub.a.a), getChannelsResponse.c);
            }
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    public GetChannelsResponse(int i, List list, List list2, List list3) {
        if (1 == (i & 1)) {
            this.a = list;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = list2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = list3;
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
        if (!(obj instanceof GetChannelsResponse)) {
            return false;
        }
        GetChannelsResponse getChannelsResponse = (GetChannelsResponse) obj;
        return i.a(this.a, getChannelsResponse.a) && i.a(this.b, getChannelsResponse.b) && i.a(this.c, getChannelsResponse.c);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List<EventInClub> list = this.b;
        int i = 0;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<EventInClub> list2 = this.c;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("GetChannelsResponse(channels=");
        P0.append(this.a);
        P0.append(", events=");
        P0.append(this.b);
        P0.append(", featuredEvents=");
        return i0.d.a.a.a.A0(P0, this.c, ')');
    }
}
