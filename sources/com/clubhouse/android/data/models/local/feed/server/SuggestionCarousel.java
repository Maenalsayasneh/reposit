package com.clubhouse.android.data.models.local.feed.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.data.models.local.user.UserInList;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import m0.n.b.f;
import m0.n.b.i;
import n0.c.e;
import n0.c.j.d;
import n0.c.k.g1;
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: SuggestionCarousel.kt */
public final class SuggestionCarousel implements Parcelable {
    public static final Parcelable.Creator<SuggestionCarousel> CREATOR = new b();
    public static final Companion Companion = new Companion((f) null);
    public final String c;
    public final List<UserInList> d;
    public final List<ClubWithAdmin> q;
    public final List<EventInClub> x;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/local/feed/server/SuggestionCarousel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/local/feed/server/SuggestionCarousel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: SuggestionCarousel.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<SuggestionCarousel> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: SuggestionCarousel.kt */
    public static final class a implements v<SuggestionCarousel> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.local.feed.server.SuggestionCarousel", aVar, 4);
            pluginGeneratedSerialDescriptor.i(InstabugDbContract.FeatureRequestEntry.COLUMN_TITLE, true);
            pluginGeneratedSerialDescriptor.i("users", true);
            pluginGeneratedSerialDescriptor.i("clubs", true);
            pluginGeneratedSerialDescriptor.i("events", true);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            return new KSerializer[]{m0.r.t.a.r.m.a1.a.R1(g1.b), m0.r.t.a.r.m.a1.a.R1(new n0.c.k.e(UserInList.a.a)), m0.r.t.a.r.m.a1.a.R1(new n0.c.k.e(ClubWithAdmin.a.a)), m0.r.t.a.r.m.a1.a.R1(new n0.c.k.e(EventInClub.a.a))};
        }

        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder r14) {
            /*
                r13 = this;
                java.lang.String r0 = "decoder"
                m0.n.b.i.e(r14, r0)
                kotlinx.serialization.descriptors.SerialDescriptor r0 = b
                n0.c.j.c r14 = r14.c(r0)
                boolean r1 = r14.y()
                r2 = 3
                r3 = 0
                r4 = 0
                r5 = 1
                r6 = 2
                if (r1 == 0) goto L_0x0042
                n0.c.k.g1 r1 = n0.c.k.g1.b
                java.lang.Object r1 = r14.v(r0, r4, r1, r3)
                n0.c.k.e r4 = new n0.c.k.e
                com.clubhouse.android.data.models.local.user.UserInList$a r7 = com.clubhouse.android.data.models.local.user.UserInList.a.a
                r4.<init>(r7)
                java.lang.Object r4 = r14.v(r0, r5, r4, r3)
                n0.c.k.e r5 = new n0.c.k.e
                com.clubhouse.android.data.models.local.club.ClubWithAdmin$a r7 = com.clubhouse.android.data.models.local.club.ClubWithAdmin.a.a
                r5.<init>(r7)
                java.lang.Object r5 = r14.v(r0, r6, r5, r3)
                n0.c.k.e r6 = new n0.c.k.e
                com.clubhouse.android.data.models.local.EventInClub$a r7 = com.clubhouse.android.data.models.local.EventInClub.a.a
                r6.<init>(r7)
                java.lang.Object r2 = r14.v(r0, r2, r6, r3)
                r3 = 15
                r9 = r4
                r4 = r3
                goto L_0x0098
            L_0x0042:
                r1 = r3
                r7 = r1
                r8 = r7
                r9 = r8
                r3 = r4
                r10 = r5
            L_0x0048:
                if (r10 == 0) goto L_0x0094
                int r11 = r14.x(r0)
                r12 = -1
                if (r11 == r12) goto L_0x0092
                if (r11 == 0) goto L_0x0089
                if (r11 == r5) goto L_0x007b
                if (r11 == r6) goto L_0x006d
                if (r11 != r2) goto L_0x0067
                n0.c.k.e r11 = new n0.c.k.e
                com.clubhouse.android.data.models.local.EventInClub$a r12 = com.clubhouse.android.data.models.local.EventInClub.a.a
                r11.<init>(r12)
                java.lang.Object r7 = r14.v(r0, r2, r11, r7)
                r3 = r3 | 8
                goto L_0x0048
            L_0x0067:
                kotlinx.serialization.UnknownFieldException r14 = new kotlinx.serialization.UnknownFieldException
                r14.<init>(r11)
                throw r14
            L_0x006d:
                n0.c.k.e r11 = new n0.c.k.e
                com.clubhouse.android.data.models.local.club.ClubWithAdmin$a r12 = com.clubhouse.android.data.models.local.club.ClubWithAdmin.a.a
                r11.<init>(r12)
                java.lang.Object r1 = r14.v(r0, r6, r11, r1)
                r3 = r3 | 4
                goto L_0x0048
            L_0x007b:
                n0.c.k.e r11 = new n0.c.k.e
                com.clubhouse.android.data.models.local.user.UserInList$a r12 = com.clubhouse.android.data.models.local.user.UserInList.a.a
                r11.<init>(r12)
                java.lang.Object r9 = r14.v(r0, r5, r11, r9)
                r3 = r3 | 2
                goto L_0x0048
            L_0x0089:
                n0.c.k.g1 r11 = n0.c.k.g1.b
                java.lang.Object r8 = r14.v(r0, r4, r11, r8)
                r3 = r3 | 1
                goto L_0x0048
            L_0x0092:
                r10 = r4
                goto L_0x0048
            L_0x0094:
                r5 = r1
                r4 = r3
                r2 = r7
                r1 = r8
            L_0x0098:
                r14.b(r0)
                com.clubhouse.android.data.models.local.feed.server.SuggestionCarousel r14 = new com.clubhouse.android.data.models.local.feed.server.SuggestionCarousel
                r0 = r1
                java.lang.String r0 = (java.lang.String) r0
                r6 = r9
                java.util.List r6 = (java.util.List) r6
                r7 = r5
                java.util.List r7 = (java.util.List) r7
                r8 = r2
                java.util.List r8 = (java.util.List) r8
                r3 = r14
                r5 = r0
                r3.<init>(r4, r5, r6, r7, r8)
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.models.local.feed.server.SuggestionCarousel.a.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            SuggestionCarousel suggestionCarousel = (SuggestionCarousel) obj;
            i.e(encoder, "encoder");
            i.e(suggestionCarousel, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(suggestionCarousel, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            boolean z = false;
            if (c.v(serialDescriptor, 0) || suggestionCarousel.c != null) {
                c.l(serialDescriptor, 0, g1.b, suggestionCarousel.c);
            }
            if (c.v(serialDescriptor, 1) || suggestionCarousel.d != null) {
                c.l(serialDescriptor, 1, new n0.c.k.e(UserInList.a.a), suggestionCarousel.d);
            }
            if (c.v(serialDescriptor, 2) || suggestionCarousel.q != null) {
                c.l(serialDescriptor, 2, new n0.c.k.e(ClubWithAdmin.a.a), suggestionCarousel.q);
            }
            if (c.v(serialDescriptor, 3) || suggestionCarousel.x != null) {
                z = true;
            }
            if (z) {
                c.l(serialDescriptor, 3, new n0.c.k.e(EventInClub.a.a), suggestionCarousel.x);
            }
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    /* compiled from: SuggestionCarousel.kt */
    public static final class b implements Parcelable.Creator<SuggestionCarousel> {
        public Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            i.e(parcel, "parcel");
            String readString = parcel.readString();
            ArrayList arrayList3 = null;
            int i = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = i0.d.a.a.a.n(UserInList.CREATOR, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = i0.d.a.a.a.n(ClubWithAdmin.CREATOR, parcel, arrayList2, i3, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt3 = parcel.readInt();
                arrayList3 = new ArrayList(readInt3);
                while (i != readInt3) {
                    i = i0.d.a.a.a.n(EventInClub.CREATOR, parcel, arrayList3, i, 1);
                }
            }
            return new SuggestionCarousel(readString, arrayList, arrayList2, arrayList3);
        }

        public Object[] newArray(int i) {
            return new SuggestionCarousel[i];
        }
    }

    public SuggestionCarousel() {
        this.c = null;
        this.d = null;
        this.q = null;
        this.x = null;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuggestionCarousel)) {
            return false;
        }
        SuggestionCarousel suggestionCarousel = (SuggestionCarousel) obj;
        return i.a(this.c, suggestionCarousel.c) && i.a(this.d, suggestionCarousel.d) && i.a(this.q, suggestionCarousel.q) && i.a(this.x, suggestionCarousel.x);
    }

    public int hashCode() {
        String str = this.c;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<UserInList> list = this.d;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<ClubWithAdmin> list2 = this.q;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<EventInClub> list3 = this.x;
        if (list3 != null) {
            i = list3.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("SuggestionCarousel(title=");
        P0.append(this.c);
        P0.append(", users=");
        P0.append(this.d);
        P0.append(", clubs=");
        P0.append(this.q);
        P0.append(", events=");
        return i0.d.a.a.a.A0(P0, this.x, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        parcel.writeString(this.c);
        List<UserInList> list = this.d;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (UserInList writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, i);
            }
        }
        List<ClubWithAdmin> list2 = this.q;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            for (ClubWithAdmin writeToParcel2 : list2) {
                writeToParcel2.writeToParcel(parcel, i);
            }
        }
        List<EventInClub> list3 = this.x;
        if (list3 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list3.size());
        for (EventInClub writeToParcel3 : list3) {
            writeToParcel3.writeToParcel(parcel, i);
        }
    }

    public SuggestionCarousel(int i, String str, List list, List list2, List list3) {
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
                this.q = list2;
            }
            if ((i & 8) == 0) {
                this.x = null;
            } else {
                this.x = list3;
            }
        } else {
            a aVar = a.a;
            m0.r.t.a.r.m.a1.a.W3(i, 0, a.b);
            throw null;
        }
    }

    public SuggestionCarousel(String str, List<UserInList> list, List<ClubWithAdmin> list2, List<EventInClub> list3) {
        this.c = str;
        this.d = list;
        this.q = list2;
        this.x = list3;
    }
}
