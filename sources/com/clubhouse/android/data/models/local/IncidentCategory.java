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
import n0.c.k.g1;
import n0.c.k.h;
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: IncidentCategory.kt */
public final class IncidentCategory implements Parcelable {
    public static final Parcelable.Creator<IncidentCategory> CREATOR = new b();
    public static final Companion Companion = new Companion((f) null);
    public final String c;
    public final String d;
    public final boolean q;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/local/IncidentCategory$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/local/IncidentCategory;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: IncidentCategory.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<IncidentCategory> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: IncidentCategory.kt */
    public static final class a implements v<IncidentCategory> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.local.IncidentCategory", aVar, 3);
            pluginGeneratedSerialDescriptor.i("label", false);
            pluginGeneratedSerialDescriptor.i("slug", false);
            pluginGeneratedSerialDescriptor.i("has_subcategories", true);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            g1 g1Var = g1.b;
            return new KSerializer[]{g1Var, m0.r.t.a.r.m.a1.a.R1(g1Var), h.b};
        }

        public Object deserialize(Decoder decoder) {
            int i;
            boolean z;
            Object obj;
            String str;
            i.e(decoder, "decoder");
            SerialDescriptor serialDescriptor = b;
            c c = decoder.c(serialDescriptor);
            String str2 = null;
            if (c.y()) {
                str = c.t(serialDescriptor, 0);
                obj = c.v(serialDescriptor, 1, g1.b, null);
                z = c.s(serialDescriptor, 2);
                i = 7;
            } else {
                Object obj2 = null;
                boolean z2 = false;
                int i2 = 0;
                boolean z3 = true;
                while (z3) {
                    int x = c.x(serialDescriptor);
                    if (x == -1) {
                        z3 = false;
                    } else if (x == 0) {
                        str2 = c.t(serialDescriptor, 0);
                        i2 |= 1;
                    } else if (x == 1) {
                        obj2 = c.v(serialDescriptor, 1, g1.b, obj2);
                        i2 |= 2;
                    } else if (x == 2) {
                        z2 = c.s(serialDescriptor, 2);
                        i2 |= 4;
                    } else {
                        throw new UnknownFieldException(x);
                    }
                }
                z = z2;
                i = i2;
                String str3 = str2;
                obj = obj2;
                str = str3;
            }
            c.b(serialDescriptor);
            return new IncidentCategory(i, str, (String) obj, z);
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            IncidentCategory incidentCategory = (IncidentCategory) obj;
            i.e(encoder, "encoder");
            i.e(incidentCategory, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(incidentCategory, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            boolean z = false;
            c.s(serialDescriptor, 0, incidentCategory.c);
            c.l(serialDescriptor, 1, g1.b, incidentCategory.d);
            if (c.v(serialDescriptor, 2) || incidentCategory.q) {
                z = true;
            }
            if (z) {
                c.r(serialDescriptor, 2, incidentCategory.q);
            }
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    /* compiled from: IncidentCategory.kt */
    public static final class b implements Parcelable.Creator<IncidentCategory> {
        public Object createFromParcel(Parcel parcel) {
            i.e(parcel, "parcel");
            return new IncidentCategory(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        public Object[] newArray(int i) {
            return new IncidentCategory[i];
        }
    }

    public IncidentCategory(int i, String str, String str2, boolean z) {
        if (3 == (i & 3)) {
            this.c = str;
            this.d = str2;
            if ((i & 4) == 0) {
                this.q = false;
            } else {
                this.q = z;
            }
        } else {
            a aVar = a.a;
            m0.r.t.a.r.m.a1.a.W3(i, 3, a.b);
            throw null;
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IncidentCategory)) {
            return false;
        }
        IncidentCategory incidentCategory = (IncidentCategory) obj;
        return i.a(this.c, incidentCategory.c) && i.a(this.d, incidentCategory.d) && this.q == incidentCategory.q;
    }

    public int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.q;
        if (z) {
            z = true;
        }
        return hashCode2 + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("IncidentCategory(label=");
        P0.append(this.c);
        P0.append(", slug=");
        P0.append(this.d);
        P0.append(", hasSubcategories=");
        return i0.d.a.a.a.C0(P0, this.q, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.q ? 1 : 0);
    }

    public IncidentCategory(String str, String str2, boolean z) {
        i.e(str, "label");
        this.c = str;
        this.d = str2;
        this.q = z;
    }
}
