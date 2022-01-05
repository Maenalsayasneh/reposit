package com.clubhouse.android.data.models.local;

import android.os.Parcel;
import android.os.Parcelable;
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
import n0.c.k.g1;
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: Topic.kt */
public final class Topic implements Parcelable {
    public static final Parcelable.Creator<Topic> CREATOR = new b();
    public static final Companion Companion = new Companion((f) null);
    public final int c;
    public final String d;
    public final String q;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/local/Topic$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/local/Topic;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: Topic.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<Topic> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: Topic.kt */
    public static final class a implements v<Topic> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.local.Topic", aVar, 3);
            pluginGeneratedSerialDescriptor.i("id", false);
            pluginGeneratedSerialDescriptor.i(InstabugDbContract.FeatureRequestEntry.COLUMN_TITLE, false);
            pluginGeneratedSerialDescriptor.i("abbreviated_title", false);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            g1 g1Var = g1.b;
            return new KSerializer[]{e0.b, g1Var, m0.r.t.a.r.m.a1.a.R1(g1Var)};
        }

        public Object deserialize(Decoder decoder) {
            int i;
            String str;
            Object obj;
            int i2;
            i.e(decoder, "decoder");
            SerialDescriptor serialDescriptor = b;
            c c = decoder.c(serialDescriptor);
            String str2 = null;
            if (c.y()) {
                i2 = c.k(serialDescriptor, 0);
                str = c.t(serialDescriptor, 1);
                obj = c.v(serialDescriptor, 2, g1.b, null);
                i = 7;
            } else {
                Object obj2 = null;
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
                        str2 = c.t(serialDescriptor, 1);
                        i3 |= 2;
                    } else if (x == 2) {
                        obj2 = c.v(serialDescriptor, 2, g1.b, obj2);
                        i3 |= 4;
                    } else {
                        throw new UnknownFieldException(x);
                    }
                }
                str = str2;
                obj = obj2;
                i = i3;
            }
            c.b(serialDescriptor);
            return new Topic(i, i2, str, (String) obj);
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            Topic topic = (Topic) obj;
            i.e(encoder, "encoder");
            i.e(topic, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(topic, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            c.q(serialDescriptor, 0, topic.c);
            c.s(serialDescriptor, 1, topic.d);
            c.l(serialDescriptor, 2, g1.b, topic.q);
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    /* compiled from: Topic.kt */
    public static final class b implements Parcelable.Creator<Topic> {
        public Object createFromParcel(Parcel parcel) {
            i.e(parcel, "parcel");
            return new Topic(parcel.readInt(), parcel.readString(), parcel.readString());
        }

        public Object[] newArray(int i) {
            return new Topic[i];
        }
    }

    public Topic(int i, int i2, String str, String str2) {
        if (7 == (i & 7)) {
            this.c = i2;
            this.d = str;
            this.q = str2;
            return;
        }
        a aVar = a.a;
        m0.r.t.a.r.m.a1.a.W3(i, 7, a.b);
        throw null;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Topic)) {
            return false;
        }
        Topic topic = (Topic) obj;
        return this.c == topic.c && i.a(this.d, topic.d) && i.a(this.q, topic.q);
    }

    public int hashCode() {
        int F = i0.d.a.a.a.F(this.d, Integer.hashCode(this.c) * 31, 31);
        String str = this.q;
        return F + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("Topic(id=");
        P0.append(this.c);
        P0.append(", title=");
        P0.append(this.d);
        P0.append(", abbreviatedTitle=");
        return i0.d.a.a.a.w0(P0, this.q, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.q);
    }

    public Topic(int i, String str, String str2) {
        i.e(str, InstabugDbContract.FeatureRequestEntry.COLUMN_TITLE);
        this.c = i;
        this.d = str;
        this.q = str2;
    }
}
