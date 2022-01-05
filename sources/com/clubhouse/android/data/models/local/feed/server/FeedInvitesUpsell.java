package com.clubhouse.android.data.models.local.feed.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.util.Iterator;
import java.util.LinkedHashMap;
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
import n0.c.k.g1;
import n0.c.k.h0;
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: FeedInvitesUpsell.kt */
public final class FeedInvitesUpsell implements Parcelable {
    public static final Parcelable.Creator<FeedInvitesUpsell> CREATOR = new b();
    public static final Companion Companion = new Companion((f) null);
    public final Map<String, Object> c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/local/feed/server/FeedInvitesUpsell$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/local/feed/server/FeedInvitesUpsell;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: FeedInvitesUpsell.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<FeedInvitesUpsell> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: FeedInvitesUpsell.kt */
    public static final class a implements v<FeedInvitesUpsell> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.local.feed.server.FeedInvitesUpsell", aVar, 1);
            pluginGeneratedSerialDescriptor.i("logging_context", true);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            return new KSerializer[]{m0.r.t.a.r.m.a1.a.R1(new h0(g1.b, i0.e.b.b3.a.b.c.a.a))};
        }

        public Object deserialize(Decoder decoder) {
            i.e(decoder, "decoder");
            SerialDescriptor serialDescriptor = b;
            Object obj = null;
            c c = decoder.c(serialDescriptor);
            int i = 1;
            if (c.y()) {
                obj = c.v(serialDescriptor, 0, new h0(g1.b, i0.e.b.b3.a.b.c.a.a), null);
            } else {
                int i2 = 0;
                while (i != 0) {
                    int x = c.x(serialDescriptor);
                    if (x == -1) {
                        i = 0;
                    } else if (x == 0) {
                        obj = c.v(serialDescriptor, 0, new h0(g1.b, i0.e.b.b3.a.b.c.a.a), obj);
                        i2 |= 1;
                    } else {
                        throw new UnknownFieldException(x);
                    }
                }
                i = i2;
            }
            c.b(serialDescriptor);
            return new FeedInvitesUpsell(i, (Map) obj);
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            FeedInvitesUpsell feedInvitesUpsell = (FeedInvitesUpsell) obj;
            i.e(encoder, "encoder");
            i.e(feedInvitesUpsell, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(feedInvitesUpsell, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            boolean z = true;
            if (!c.v(serialDescriptor, 0) && feedInvitesUpsell.c == null) {
                z = false;
            }
            if (z) {
                c.l(serialDescriptor, 0, new h0(g1.b, i0.e.b.b3.a.b.c.a.a), feedInvitesUpsell.c);
            }
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    /* compiled from: FeedInvitesUpsell.kt */
    public static final class b implements Parcelable.Creator<FeedInvitesUpsell> {
        public Object createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            i.e(parcel, "parcel");
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                int i = 0;
                while (i != readInt) {
                    i = i0.d.a.a.a.y(FeedInvitesUpsell.class, parcel, linkedHashMap2, parcel.readString(), i, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new FeedInvitesUpsell(linkedHashMap);
        }

        public Object[] newArray(int i) {
            return new FeedInvitesUpsell[i];
        }
    }

    public FeedInvitesUpsell() {
        this.c = null;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FeedInvitesUpsell) && i.a(this.c, ((FeedInvitesUpsell) obj).c);
    }

    public int hashCode() {
        Map<String, Object> map = this.c;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    public String toString() {
        return i0.d.a.a.a.B0(i0.d.a.a.a.P0("FeedInvitesUpsell(loggingContext="), this.c, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        Map<String, Object> map = this.c;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator l1 = i0.d.a.a.a.l1(parcel, 1, map);
        while (l1.hasNext()) {
            Map.Entry entry = (Map.Entry) l1.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeValue(entry.getValue());
        }
    }

    public FeedInvitesUpsell(int i, Map map) {
        if ((i & 0) != 0) {
            a aVar = a.a;
            m0.r.t.a.r.m.a1.a.W3(i, 0, a.b);
            throw null;
        } else if ((i & 1) == 0) {
            this.c = null;
        } else {
            this.c = map;
        }
    }

    public FeedInvitesUpsell(Map<String, ? extends Object> map) {
        this.c = map;
    }
}
