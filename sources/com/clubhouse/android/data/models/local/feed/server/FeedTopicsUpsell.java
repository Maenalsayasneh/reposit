package com.clubhouse.android.data.models.local.feed.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.clubhouse.android.data.models.local.Topic;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
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
/* compiled from: FeedTopicsUpsell.kt */
public final class FeedTopicsUpsell implements Parcelable {
    public static final Parcelable.Creator<FeedTopicsUpsell> CREATOR = new b();
    public static final Companion Companion = new Companion((f) null);
    public final String c;
    public final List<Topic> d;
    public final Map<String, Object> q;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/local/feed/server/FeedTopicsUpsell$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/local/feed/server/FeedTopicsUpsell;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: FeedTopicsUpsell.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<FeedTopicsUpsell> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: FeedTopicsUpsell.kt */
    public static final class a implements v<FeedTopicsUpsell> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.local.feed.server.FeedTopicsUpsell", aVar, 3);
            pluginGeneratedSerialDescriptor.i(InstabugDbContract.FeatureRequestEntry.COLUMN_TITLE, true);
            pluginGeneratedSerialDescriptor.i("topics", true);
            pluginGeneratedSerialDescriptor.i("logging_context", true);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            g1 g1Var = g1.b;
            return new KSerializer[]{m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(new n0.c.k.e(Topic.a.a)), m0.r.t.a.r.m.a1.a.R1(new h0(g1Var, i0.e.b.b3.a.b.c.a.a))};
        }

        public Object deserialize(Decoder decoder) {
            Object obj;
            Object obj2;
            int i;
            Object obj3;
            i.e(decoder, "decoder");
            SerialDescriptor serialDescriptor = b;
            c c = decoder.c(serialDescriptor);
            Object obj4 = null;
            if (c.y()) {
                g1 g1Var = g1.b;
                obj2 = c.v(serialDescriptor, 0, g1Var, null);
                obj = c.v(serialDescriptor, 1, new n0.c.k.e(Topic.a.a), null);
                obj3 = c.v(serialDescriptor, 2, new h0(g1Var, i0.e.b.b3.a.b.c.a.a), null);
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
                        obj4 = c.v(serialDescriptor, 0, g1.b, obj4);
                        i2 |= 1;
                    } else if (x == 1) {
                        obj5 = c.v(serialDescriptor, 1, new n0.c.k.e(Topic.a.a), obj5);
                        i2 |= 2;
                    } else if (x == 2) {
                        obj6 = c.v(serialDescriptor, 2, new h0(g1.b, i0.e.b.b3.a.b.c.a.a), obj6);
                        i2 |= 4;
                    } else {
                        throw new UnknownFieldException(x);
                    }
                }
                obj = obj5;
                obj2 = obj4;
                obj3 = obj6;
                i = i2;
            }
            c.b(serialDescriptor);
            return new FeedTopicsUpsell(i, (String) obj2, (List) obj, (Map) obj3);
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            FeedTopicsUpsell feedTopicsUpsell = (FeedTopicsUpsell) obj;
            i.e(encoder, "encoder");
            i.e(feedTopicsUpsell, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(feedTopicsUpsell, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            boolean z = false;
            if (c.v(serialDescriptor, 0) || feedTopicsUpsell.c != null) {
                c.l(serialDescriptor, 0, g1.b, feedTopicsUpsell.c);
            }
            if (c.v(serialDescriptor, 1) || feedTopicsUpsell.d != null) {
                c.l(serialDescriptor, 1, new n0.c.k.e(Topic.a.a), feedTopicsUpsell.d);
            }
            if (c.v(serialDescriptor, 2) || feedTopicsUpsell.q != null) {
                z = true;
            }
            if (z) {
                c.l(serialDescriptor, 2, new h0(g1.b, i0.e.b.b3.a.b.c.a.a), feedTopicsUpsell.q);
            }
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    /* compiled from: FeedTopicsUpsell.kt */
    public static final class b implements Parcelable.Creator<FeedTopicsUpsell> {
        public Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            i.e(parcel, "parcel");
            String readString = parcel.readString();
            LinkedHashMap linkedHashMap = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = i0.d.a.a.a.n(Topic.CREATOR, parcel, arrayList, i, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = i0.d.a.a.a.y(FeedTopicsUpsell.class, parcel, linkedHashMap, parcel.readString(), i2, 1);
                }
            }
            return new FeedTopicsUpsell(readString, arrayList, linkedHashMap);
        }

        public Object[] newArray(int i) {
            return new FeedTopicsUpsell[i];
        }
    }

    public FeedTopicsUpsell() {
        this.c = null;
        this.d = null;
        this.q = null;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedTopicsUpsell)) {
            return false;
        }
        FeedTopicsUpsell feedTopicsUpsell = (FeedTopicsUpsell) obj;
        return i.a(this.c, feedTopicsUpsell.c) && i.a(this.d, feedTopicsUpsell.d) && i.a(this.q, feedTopicsUpsell.q);
    }

    public int hashCode() {
        String str = this.c;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<Topic> list = this.d;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Map<String, Object> map = this.q;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("FeedTopicsUpsell(title=");
        P0.append(this.c);
        P0.append(", topics=");
        P0.append(this.d);
        P0.append(", loggingContext=");
        return i0.d.a.a.a.B0(P0, this.q, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        parcel.writeString(this.c);
        List<Topic> list = this.d;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (Topic writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, i);
            }
        }
        Map<String, Object> map = this.q;
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

    public FeedTopicsUpsell(int i, String str, List list, Map map) {
        if ((i & 0) == 0) {
            if ((i & 1) == 0) {
                this.c = null;
            } else {
                this.c = str;
            }
            if ((i & 2) == 0) {
                this.d = null;
            } else {
                this.d = list;
            }
            if ((i & 4) == 0) {
                this.q = null;
            } else {
                this.q = map;
            }
        } else {
            a aVar = a.a;
            m0.r.t.a.r.m.a1.a.W3(i, 0, a.b);
            throw null;
        }
    }

    public FeedTopicsUpsell(String str, List<Topic> list, Map<String, ? extends Object> map) {
        this.c = str;
        this.d = list;
        this.q = map;
    }
}
