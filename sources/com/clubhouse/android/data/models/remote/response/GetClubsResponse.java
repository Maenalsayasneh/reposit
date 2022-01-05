package com.clubhouse.android.data.models.remote.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
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
/* compiled from: GetClubsResponse.kt */
public final class GetClubsResponse implements Parcelable {
    public static final Parcelable.Creator<GetClubsResponse> CREATOR = new b();
    public static final Companion Companion = new Companion((f) null);
    public final List<ClubWithAdmin> c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/remote/response/GetClubsResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/remote/response/GetClubsResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: GetClubsResponse.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<GetClubsResponse> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: GetClubsResponse.kt */
    public static final class a implements v<GetClubsResponse> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.remote.response.GetClubsResponse", aVar, 1);
            pluginGeneratedSerialDescriptor.i("clubs", true);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            return new KSerializer[]{m0.r.t.a.r.m.a1.a.R1(new n0.c.k.e(ClubWithAdmin.a.a))};
        }

        public Object deserialize(Decoder decoder) {
            i.e(decoder, "decoder");
            SerialDescriptor serialDescriptor = b;
            Object obj = null;
            c c = decoder.c(serialDescriptor);
            int i = 1;
            if (c.y()) {
                obj = c.v(serialDescriptor, 0, new n0.c.k.e(ClubWithAdmin.a.a), null);
            } else {
                int i2 = 0;
                while (i != 0) {
                    int x = c.x(serialDescriptor);
                    if (x == -1) {
                        i = 0;
                    } else if (x == 0) {
                        obj = c.v(serialDescriptor, 0, new n0.c.k.e(ClubWithAdmin.a.a), obj);
                        i2 |= 1;
                    } else {
                        throw new UnknownFieldException(x);
                    }
                }
                i = i2;
            }
            c.b(serialDescriptor);
            return new GetClubsResponse(i, (List) obj);
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            GetClubsResponse getClubsResponse = (GetClubsResponse) obj;
            i.e(encoder, "encoder");
            i.e(getClubsResponse, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(getClubsResponse, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            boolean z = true;
            if (!c.v(serialDescriptor, 0) && getClubsResponse.c == null) {
                z = false;
            }
            if (z) {
                c.l(serialDescriptor, 0, new n0.c.k.e(ClubWithAdmin.a.a), getClubsResponse.c);
            }
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    /* compiled from: GetClubsResponse.kt */
    public static final class b implements Parcelable.Creator<GetClubsResponse> {
        public Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            i.e(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = i0.d.a.a.a.n(ClubWithAdmin.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new GetClubsResponse(arrayList);
        }

        public Object[] newArray(int i) {
            return new GetClubsResponse[i];
        }
    }

    public GetClubsResponse() {
        this.c = null;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetClubsResponse) && i.a(this.c, ((GetClubsResponse) obj).c);
    }

    public int hashCode() {
        List<ClubWithAdmin> list = this.c;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return i0.d.a.a.a.A0(i0.d.a.a.a.P0("GetClubsResponse(clubs="), this.c, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        List<ClubWithAdmin> list = this.c;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        for (ClubWithAdmin writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
    }

    public GetClubsResponse(int i, List list) {
        if ((i & 0) != 0) {
            a aVar = a.a;
            m0.r.t.a.r.m.a1.a.W3(i, 0, a.b);
            throw null;
        } else if ((i & 1) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
    }

    public GetClubsResponse(List<ClubWithAdmin> list) {
        this.c = list;
    }
}
