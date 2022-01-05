package com.clubhouse.android.data.models.local.club;

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
import n0.c.k.g1;
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: ClubRule.kt */
public final class ClubRule implements Parcelable {
    public static final Parcelable.Creator<ClubRule> CREATOR = new b();
    public static final Companion Companion = new Companion((f) null);
    public final String c;
    public final String d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/local/club/ClubRule$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/local/club/ClubRule;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: ClubRule.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<ClubRule> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: ClubRule.kt */
    public static final class a implements v<ClubRule> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.local.club.ClubRule", aVar, 2);
            pluginGeneratedSerialDescriptor.i(InstabugDbContract.FeatureRequestEntry.COLUMN_TITLE, false);
            pluginGeneratedSerialDescriptor.i("desc", false);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            g1 g1Var = g1.b;
            return new KSerializer[]{g1Var, g1Var};
        }

        public Object deserialize(Decoder decoder) {
            int i;
            String str;
            String str2;
            i.e(decoder, "decoder");
            SerialDescriptor serialDescriptor = b;
            c c = decoder.c(serialDescriptor);
            if (c.y()) {
                str2 = c.t(serialDescriptor, 0);
                str = c.t(serialDescriptor, 1);
                i = 3;
            } else {
                str2 = null;
                String str3 = null;
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
                        str3 = c.t(serialDescriptor, 1);
                        i2 |= 2;
                    } else {
                        throw new UnknownFieldException(x);
                    }
                }
                str = str3;
                i = i2;
            }
            c.b(serialDescriptor);
            return new ClubRule(i, str2, str);
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            ClubRule clubRule = (ClubRule) obj;
            i.e(encoder, "encoder");
            i.e(clubRule, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(clubRule, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            c.s(serialDescriptor, 0, clubRule.c);
            c.s(serialDescriptor, 1, clubRule.d);
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    /* compiled from: ClubRule.kt */
    public static final class b implements Parcelable.Creator<ClubRule> {
        public Object createFromParcel(Parcel parcel) {
            i.e(parcel, "parcel");
            return new ClubRule(parcel.readString(), parcel.readString());
        }

        public Object[] newArray(int i) {
            return new ClubRule[i];
        }
    }

    public ClubRule(int i, String str, String str2) {
        if (3 == (i & 3)) {
            this.c = str;
            this.d = str2;
            return;
        }
        a aVar = a.a;
        m0.r.t.a.r.m.a1.a.W3(i, 3, a.b);
        throw null;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClubRule)) {
            return false;
        }
        ClubRule clubRule = (ClubRule) obj;
        return i.a(this.c, clubRule.c) && i.a(this.d, clubRule.d);
    }

    public int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ClubRule(title=");
        P0.append(this.c);
        P0.append(", description=");
        return i0.d.a.a.a.x0(P0, this.d, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }

    public ClubRule(String str, String str2) {
        i.e(str, InstabugDbContract.FeatureRequestEntry.COLUMN_TITLE);
        i.e(str2, InstabugDbContract.FeatureRequestEntry.COLUMN_DESCRIPTION);
        this.c = str;
        this.d = str2;
    }
}
