package com.clubhouse.android.data.models.local.feed.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.clubhouse.android.data.models.local.EventInClub;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.util.ArrayList;
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
/* compiled from: FeedTodayView.kt */
public final class FeedTodayView implements Parcelable {
    public static final Parcelable.Creator<FeedTodayView> CREATOR = new b();
    public static final Companion Companion = new Companion((f) null);
    public final List<EventInClub> c;
    public final List<EventInClub> d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/local/feed/server/FeedTodayView$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/local/feed/server/FeedTodayView;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: FeedTodayView.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<FeedTodayView> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: FeedTodayView.kt */
    public static final class a implements v<FeedTodayView> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.local.feed.server.FeedTodayView", aVar, 2);
            pluginGeneratedSerialDescriptor.i("events", true);
            pluginGeneratedSerialDescriptor.i("featured_events", true);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            EventInClub.a aVar = EventInClub.a.a;
            return new KSerializer[]{m0.r.t.a.r.m.a1.a.R1(new n0.c.k.e(aVar)), m0.r.t.a.r.m.a1.a.R1(new n0.c.k.e(aVar))};
        }

        public Object deserialize(Decoder decoder) {
            int i;
            Object obj;
            Object obj2;
            i.e(decoder, "decoder");
            SerialDescriptor serialDescriptor = b;
            c c = decoder.c(serialDescriptor);
            Object obj3 = null;
            if (c.y()) {
                EventInClub.a aVar = EventInClub.a.a;
                obj2 = c.v(serialDescriptor, 0, new n0.c.k.e(aVar), null);
                obj = c.v(serialDescriptor, 1, new n0.c.k.e(aVar), null);
                i = 3;
            } else {
                Object obj4 = null;
                int i2 = 0;
                boolean z = true;
                while (z) {
                    int x = c.x(serialDescriptor);
                    if (x == -1) {
                        z = false;
                    } else if (x == 0) {
                        obj3 = c.v(serialDescriptor, 0, new n0.c.k.e(EventInClub.a.a), obj3);
                        i2 |= 1;
                    } else if (x == 1) {
                        obj4 = c.v(serialDescriptor, 1, new n0.c.k.e(EventInClub.a.a), obj4);
                        i2 |= 2;
                    } else {
                        throw new UnknownFieldException(x);
                    }
                }
                i = i2;
                Object obj5 = obj3;
                obj = obj4;
                obj2 = obj5;
            }
            c.b(serialDescriptor);
            return new FeedTodayView(i, (List) obj2, (List) obj);
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            FeedTodayView feedTodayView = (FeedTodayView) obj;
            i.e(encoder, "encoder");
            i.e(feedTodayView, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(feedTodayView, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            boolean z = false;
            if (c.v(serialDescriptor, 0) || feedTodayView.c != null) {
                c.l(serialDescriptor, 0, new n0.c.k.e(EventInClub.a.a), feedTodayView.c);
            }
            if (c.v(serialDescriptor, 1) || feedTodayView.d != null) {
                z = true;
            }
            if (z) {
                c.l(serialDescriptor, 1, new n0.c.k.e(EventInClub.a.a), feedTodayView.d);
            }
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    /* compiled from: FeedTodayView.kt */
    public static final class b implements Parcelable.Creator<FeedTodayView> {
        public Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            i.e(parcel, "parcel");
            ArrayList arrayList2 = null;
            int i = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = i0.d.a.a.a.n(EventInClub.CREATOR, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = i0.d.a.a.a.n(EventInClub.CREATOR, parcel, arrayList2, i, 1);
                }
            }
            return new FeedTodayView(arrayList, arrayList2);
        }

        public Object[] newArray(int i) {
            return new FeedTodayView[i];
        }
    }

    public FeedTodayView() {
        this.c = null;
        this.d = null;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedTodayView)) {
            return false;
        }
        FeedTodayView feedTodayView = (FeedTodayView) obj;
        return i.a(this.c, feedTodayView.c) && i.a(this.d, feedTodayView.d);
    }

    public int hashCode() {
        List<EventInClub> list = this.c;
        int i = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<EventInClub> list2 = this.d;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("FeedTodayView(events=");
        P0.append(this.c);
        P0.append(", featuredEvents=");
        return i0.d.a.a.a.A0(P0, this.d, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        List<EventInClub> list = this.c;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (EventInClub writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, i);
            }
        }
        List<EventInClub> list2 = this.d;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list2.size());
        for (EventInClub writeToParcel2 : list2) {
            writeToParcel2.writeToParcel(parcel, i);
        }
    }

    public FeedTodayView(int i, List list, List list2) {
        if ((i & 0) == 0) {
            if ((i & 1) == 0) {
                this.c = null;
            } else {
                this.c = list;
            }
            if ((i & 2) == 0) {
                this.d = null;
            } else {
                this.d = list2;
            }
        } else {
            a aVar = a.a;
            m0.r.t.a.r.m.a1.a.W3(i, 0, a.b);
            throw null;
        }
    }

    public FeedTodayView(List<EventInClub> list, List<EventInClub> list2) {
        this.c = list;
        this.d = list2;
    }
}
