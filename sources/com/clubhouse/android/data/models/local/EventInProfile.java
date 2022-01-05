package com.clubhouse.android.data.models.local;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.data.models.local.user.UserInList;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.pubnub.api.endpoints.objects_api.utils.Include;
import j$.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import m0.n.b.f;
import m0.n.b.i;
import m0.n.b.m;
import n0.c.e;
import n0.c.j.d;
import n0.c.k.e0;
import n0.c.k.g1;
import n0.c.k.h;
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: EventInProfile.kt */
public final class EventInProfile implements i0.e.b.b3.a.a.a, Parcelable {
    public static final Parcelable.Creator<EventInProfile> CREATOR = new b();
    public static final Companion Companion = new Companion((f) null);
    public final List<UserInList> Y1;
    public final OffsetDateTime Z1;
    public final boolean a2;
    public final String b2;
    public final ClubWithAdmin c;
    public final String c2;
    public final boolean d;
    public final boolean d2;
    public final int q;
    public final String x;
    public final String y;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/local/EventInProfile$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/local/EventInProfile;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: EventInProfile.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<EventInProfile> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: EventInProfile.kt */
    public static final class a implements v<EventInProfile> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.local.EventInProfile", aVar, 11);
            pluginGeneratedSerialDescriptor.i("club", false);
            pluginGeneratedSerialDescriptor.i("is_attending", false);
            pluginGeneratedSerialDescriptor.i("event_id", false);
            pluginGeneratedSerialDescriptor.i(InstabugDbContract.FeatureRequestEntry.COLUMN_DESCRIPTION, false);
            pluginGeneratedSerialDescriptor.i("name", false);
            pluginGeneratedSerialDescriptor.i("hosts", false);
            pluginGeneratedSerialDescriptor.i("time_start", false);
            pluginGeneratedSerialDescriptor.i("is_member_only", false);
            pluginGeneratedSerialDescriptor.i("url", false);
            pluginGeneratedSerialDescriptor.i(Include.INCLUDE_CHANNEL_PARAM_VALUE, false);
            pluginGeneratedSerialDescriptor.i("is_expired", false);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            h hVar = h.b;
            g1 g1Var = g1.b;
            return new KSerializer[]{m0.r.t.a.r.m.a1.a.R1(ClubWithAdmin.a.a), hVar, e0.b, m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(new n0.c.k.e(UserInList.a.a)), m0.r.t.a.r.m.a1.a.R1(new n0.c.a(m.a(OffsetDateTime.class), (KSerializer) null, new KSerializer[0])), hVar, m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(g1Var), hVar};
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x00c1, code lost:
            r13 = r8;
            r14 = r22;
            r10 = 5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x00fe, code lost:
            r13 = r8;
            r14 = r22;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0148, code lost:
            r8 = r10;
            r22 = r14;
            r3 = null;
            r10 = 7;
            r14 = 8;
            r15 = 10;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder r25) {
            /*
                r24 = this;
                r0 = r25
                java.lang.String r1 = "decoder"
                m0.n.b.i.e(r0, r1)
                kotlinx.serialization.descriptors.SerialDescriptor r1 = b
                n0.c.j.c r0 = r0.c(r1)
                boolean r2 = r0.y()
                r3 = 0
                r4 = 0
                r7 = 3
                r8 = 5
                r9 = 6
                r10 = 7
                r11 = 1
                r12 = 2
                r13 = 4
                r14 = 8
                if (r2 == 0) goto L_0x0070
                com.clubhouse.android.data.models.local.club.ClubWithAdmin$a r2 = com.clubhouse.android.data.models.local.club.ClubWithAdmin.a.a
                java.lang.Object r2 = r0.v(r1, r4, r2, r3)
                boolean r11 = r0.s(r1, r11)
                int r12 = r0.k(r1, r12)
                n0.c.k.g1 r15 = n0.c.k.g1.b
                java.lang.Object r7 = r0.v(r1, r7, r15, r3)
                java.lang.Object r13 = r0.v(r1, r13, r15, r3)
                n0.c.k.e r5 = new n0.c.k.e
                com.clubhouse.android.data.models.local.user.UserInList$a r6 = com.clubhouse.android.data.models.local.user.UserInList.a.a
                r5.<init>(r6)
                java.lang.Object r5 = r0.v(r1, r8, r5, r3)
                n0.c.a r6 = new n0.c.a
                java.lang.Class<j$.time.OffsetDateTime> r8 = j$.time.OffsetDateTime.class
                m0.r.d r8 = m0.n.b.m.a(r8)
                kotlinx.serialization.KSerializer[] r4 = new kotlinx.serialization.KSerializer[r4]
                r6.<init>(r8, r3, r4)
                java.lang.Object r4 = r0.v(r1, r9, r6, r3)
                boolean r6 = r0.s(r1, r10)
                java.lang.Object r8 = r0.v(r1, r14, r15, r3)
                r9 = 9
                java.lang.Object r3 = r0.v(r1, r9, r15, r3)
                r15 = 10
                boolean r9 = r0.s(r1, r15)
                r10 = 2047(0x7ff, float:2.868E-42)
                r15 = r6
                r18 = r9
                r9 = r11
                r21 = r12
                goto L_0x0162
            L_0x0070:
                r15 = 10
                r2 = r3
                r5 = r2
                r6 = r5
                r7 = r6
                r12 = r7
                r22 = r12
                r13 = r4
                r17 = r13
                r19 = r17
                r20 = r19
                r21 = r20
                r23 = r11
                r11 = r22
            L_0x0086:
                if (r23 == 0) goto L_0x0153
                int r8 = r0.x(r1)
                switch(r8) {
                    case -1: goto L_0x0140;
                    case 0: goto L_0x0130;
                    case 1: goto L_0x0122;
                    case 2: goto L_0x0114;
                    case 3: goto L_0x0102;
                    case 4: goto L_0x00f0;
                    case 5: goto L_0x00df;
                    case 6: goto L_0x00c8;
                    case 7: goto L_0x00b9;
                    case 8: goto L_0x00ae;
                    case 9: goto L_0x00a3;
                    case 10: goto L_0x0095;
                    default: goto L_0x008f;
                }
            L_0x008f:
                kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
                r0.<init>(r8)
                throw r0
            L_0x0095:
                boolean r19 = r0.s(r1, r15)
                r13 = r13 | 1024(0x400, float:1.435E-42)
                r14 = r22
                r8 = 2
                r10 = 5
                r15 = 9
                goto L_0x0148
            L_0x00a3:
                n0.c.k.g1 r8 = n0.c.k.g1.b
                r15 = 9
                java.lang.Object r5 = r0.v(r1, r15, r8, r5)
                r8 = r13 | 512(0x200, float:7.175E-43)
                goto L_0x00c1
            L_0x00ae:
                r15 = 9
                n0.c.k.g1 r8 = n0.c.k.g1.b
                java.lang.Object r7 = r0.v(r1, r14, r8, r7)
                r8 = r13 | 256(0x100, float:3.59E-43)
                goto L_0x00c1
            L_0x00b9:
                r15 = 9
                boolean r17 = r0.s(r1, r10)
                r8 = r13 | 128(0x80, float:1.794E-43)
            L_0x00c1:
                r13 = r8
                r14 = r22
                r8 = 2
                r10 = 5
                goto L_0x0148
            L_0x00c8:
                r15 = 9
                n0.c.a r8 = new n0.c.a
                java.lang.Class<j$.time.OffsetDateTime> r16 = j$.time.OffsetDateTime.class
                m0.r.d r10 = m0.n.b.m.a(r16)
                kotlinx.serialization.KSerializer[] r14 = new kotlinx.serialization.KSerializer[r4]
                r8.<init>(r10, r3, r14)
                java.lang.Object r6 = r0.v(r1, r9, r8, r6)
                r8 = r13 | 64
                r10 = 5
                goto L_0x00fe
            L_0x00df:
                r15 = 9
                n0.c.k.e r8 = new n0.c.k.e
                com.clubhouse.android.data.models.local.user.UserInList$a r10 = com.clubhouse.android.data.models.local.user.UserInList.a.a
                r8.<init>(r10)
                r10 = 5
                java.lang.Object r11 = r0.v(r1, r10, r8, r11)
                r8 = r13 | 32
                goto L_0x00fe
            L_0x00f0:
                r10 = 5
                r15 = 9
                n0.c.k.g1 r8 = n0.c.k.g1.b
                r14 = r22
                r3 = 4
                java.lang.Object r22 = r0.v(r1, r3, r8, r14)
                r8 = r13 | 16
            L_0x00fe:
                r13 = r8
                r14 = r22
                goto L_0x0112
            L_0x0102:
                r14 = r22
                r3 = 4
                r10 = 5
                r15 = 9
                n0.c.k.g1 r8 = n0.c.k.g1.b
                r3 = 3
                java.lang.Object r12 = r0.v(r1, r3, r8, r12)
                r8 = r13 | 8
                r13 = r8
            L_0x0112:
                r8 = 2
                goto L_0x0148
            L_0x0114:
                r14 = r22
                r3 = 3
                r8 = 2
                r10 = 5
                r15 = 9
                int r21 = r0.k(r1, r8)
                r13 = r13 | 4
                goto L_0x0148
            L_0x0122:
                r14 = r22
                r3 = 1
                r8 = 2
                r10 = 5
                r15 = 9
                boolean r20 = r0.s(r1, r3)
                r13 = r13 | 2
                goto L_0x0148
            L_0x0130:
                r14 = r22
                r8 = 2
                r10 = 5
                r15 = 9
                com.clubhouse.android.data.models.local.club.ClubWithAdmin$a r3 = com.clubhouse.android.data.models.local.club.ClubWithAdmin.a.a
                java.lang.Object r2 = r0.v(r1, r4, r3, r2)
                r3 = r13 | 1
                r13 = r3
                goto L_0x0148
            L_0x0140:
                r14 = r22
                r8 = 2
                r10 = 5
                r15 = 9
                r23 = r4
            L_0x0148:
                r8 = r10
                r22 = r14
                r3 = 0
                r10 = 7
                r14 = 8
                r15 = 10
                goto L_0x0086
            L_0x0153:
                r14 = r22
                r3 = r5
                r4 = r6
                r8 = r7
                r5 = r11
                r7 = r12
                r10 = r13
                r13 = r14
                r15 = r17
                r18 = r19
                r9 = r20
            L_0x0162:
                r0.b(r1)
                com.clubhouse.android.data.models.local.EventInProfile r0 = new com.clubhouse.android.data.models.local.EventInProfile
                r1 = r2
                com.clubhouse.android.data.models.local.club.ClubWithAdmin r1 = (com.clubhouse.android.data.models.local.club.ClubWithAdmin) r1
                r11 = r7
                java.lang.String r11 = (java.lang.String) r11
                r12 = r13
                java.lang.String r12 = (java.lang.String) r12
                r13 = r5
                java.util.List r13 = (java.util.List) r13
                r14 = r4
                j$.time.OffsetDateTime r14 = (j$.time.OffsetDateTime) r14
                r16 = r8
                java.lang.String r16 = (java.lang.String) r16
                r17 = r3
                java.lang.String r17 = (java.lang.String) r17
                r6 = r0
                r7 = r10
                r8 = r1
                r10 = r21
                r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.models.local.EventInProfile.a.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            EventInProfile eventInProfile = (EventInProfile) obj;
            i.e(encoder, "encoder");
            i.e(eventInProfile, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(eventInProfile, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            c.l(serialDescriptor, 0, ClubWithAdmin.a.a, eventInProfile.c);
            c.r(serialDescriptor, 1, eventInProfile.g().booleanValue());
            c.q(serialDescriptor, 2, eventInProfile.q);
            g1 g1Var = g1.b;
            c.l(serialDescriptor, 3, g1Var, eventInProfile.x);
            c.l(serialDescriptor, 4, g1Var, eventInProfile.y);
            c.l(serialDescriptor, 5, new n0.c.k.e(UserInList.a.a), eventInProfile.Y1);
            c.l(serialDescriptor, 6, new n0.c.a(m.a(OffsetDateTime.class), (KSerializer) null, new KSerializer[0]), eventInProfile.Z1);
            c.r(serialDescriptor, 7, eventInProfile.a2);
            c.l(serialDescriptor, 8, g1Var, eventInProfile.b2);
            c.l(serialDescriptor, 9, g1Var, eventInProfile.c2);
            c.r(serialDescriptor, 10, eventInProfile.d2);
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    /* compiled from: EventInProfile.kt */
    public static final class b implements Parcelable.Creator<EventInProfile> {
        public Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            i.e(parcel, "parcel");
            ClubWithAdmin createFromParcel = parcel.readInt() == 0 ? null : ClubWithAdmin.CREATOR.createFromParcel(parcel);
            boolean z = parcel.readInt() != 0;
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                int i = 0;
                while (i != readInt2) {
                    i = i0.d.a.a.a.n(UserInList.CREATOR, parcel, arrayList, i, 1);
                }
            }
            return new EventInProfile(createFromParcel, z, readInt, readString, readString2, arrayList, (OffsetDateTime) parcel.readSerializable(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        public Object[] newArray(int i) {
            return new EventInProfile[i];
        }
    }

    public EventInProfile(int i, ClubWithAdmin clubWithAdmin, boolean z, int i2, String str, String str2, List list, OffsetDateTime offsetDateTime, boolean z2, String str3, String str4, boolean z3) {
        if (2047 == (i & 2047)) {
            this.c = clubWithAdmin;
            this.d = z;
            this.q = i2;
            this.x = str;
            this.y = str2;
            this.Y1 = list;
            this.Z1 = offsetDateTime;
            this.a2 = z2;
            this.b2 = str3;
            this.c2 = str4;
            this.d2 = z3;
            return;
        }
        a aVar = a.a;
        m0.r.t.a.r.m.a1.a.W3(i, 2047, a.b);
        throw null;
    }

    public static EventInProfile c(EventInProfile eventInProfile, ClubWithAdmin clubWithAdmin, boolean z, int i, String str, String str2, List list, OffsetDateTime offsetDateTime, boolean z2, String str3, String str4, boolean z3, int i2) {
        EventInProfile eventInProfile2 = eventInProfile;
        int i3 = i2;
        String str5 = null;
        ClubWithAdmin clubWithAdmin2 = (i3 & 1) != 0 ? eventInProfile2.c : null;
        boolean booleanValue = (i3 & 2) != 0 ? eventInProfile.g().booleanValue() : z;
        int i4 = (i3 & 4) != 0 ? eventInProfile2.q : i;
        String str6 = (i3 & 8) != 0 ? eventInProfile2.x : null;
        String str7 = (i3 & 16) != 0 ? eventInProfile2.y : null;
        List<UserInList> list2 = (i3 & 32) != 0 ? eventInProfile2.Y1 : null;
        OffsetDateTime offsetDateTime2 = (i3 & 64) != 0 ? eventInProfile2.Z1 : null;
        boolean z4 = (i3 & 128) != 0 ? eventInProfile2.a2 : z2;
        String str8 = (i3 & 256) != 0 ? eventInProfile2.b2 : null;
        if ((i3 & 512) != 0) {
            str5 = eventInProfile2.c2;
        }
        return new EventInProfile(clubWithAdmin2, booleanValue, i4, str6, str7, list2, offsetDateTime2, z4, str8, str5, (i3 & RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? eventInProfile2.d2 : z3);
    }

    public final EventInProfile a(EventInClub eventInClub) {
        i.e(eventInClub, "event");
        ClubWithAdmin clubWithAdmin = eventInClub.c;
        Boolean bool = eventInClub.x;
        if (bool == null) {
            bool = g();
        }
        return new EventInProfile(clubWithAdmin, bool.booleanValue(), eventInClub.Y1, eventInClub.Z1, eventInClub.a2, eventInClub.b2, eventInClub.c2, eventInClub.d2, eventInClub.e2, eventInClub.f2, eventInClub.g2);
    }

    public List<UserInList> d() {
        return this.Y1;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventInProfile)) {
            return false;
        }
        EventInProfile eventInProfile = (EventInProfile) obj;
        return i.a(this.c, eventInProfile.c) && g().booleanValue() == eventInProfile.g().booleanValue() && this.q == eventInProfile.q && i.a(this.x, eventInProfile.x) && i.a(this.y, eventInProfile.y) && i.a(this.Y1, eventInProfile.Y1) && i.a(this.Z1, eventInProfile.Z1) && this.a2 == eventInProfile.a2 && i.a(this.b2, eventInProfile.b2) && i.a(this.c2, eventInProfile.c2) && this.d2 == eventInProfile.d2;
    }

    public Boolean g() {
        return Boolean.valueOf(this.d);
    }

    public int getId() {
        return this.q;
    }

    public boolean h(Integer num) {
        boolean z;
        i.e(this, "this");
        List<UserInList> d3 = d();
        if (d3 == null || d3.isEmpty()) {
            return false;
        }
        for (UserInList id : d3) {
            int intValue = id.getId().intValue();
            if (num != null && intValue == num.intValue()) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        ClubWithAdmin clubWithAdmin = this.c;
        int i6 = 0;
        int M = i0.d.a.a.a.M(this.q, (g().hashCode() + ((clubWithAdmin == null ? 0 : clubWithAdmin.hashCode()) * 31)) * 31, 31);
        String str = this.x;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i7 = (M + i) * 31;
        String str2 = this.y;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i8 = (i7 + i2) * 31;
        List<UserInList> list = this.Y1;
        if (list == null) {
            i3 = 0;
        } else {
            i3 = list.hashCode();
        }
        int i9 = (i8 + i3) * 31;
        OffsetDateTime offsetDateTime = this.Z1;
        if (offsetDateTime == null) {
            i4 = 0;
        } else {
            i4 = offsetDateTime.hashCode();
        }
        int i10 = (i9 + i4) * 31;
        boolean z = this.a2;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i11 = (i10 + (z ? 1 : 0)) * 31;
        String str3 = this.b2;
        if (str3 == null) {
            i5 = 0;
        } else {
            i5 = str3.hashCode();
        }
        int i12 = (i11 + i5) * 31;
        String str4 = this.c2;
        if (str4 != null) {
            i6 = str4.hashCode();
        }
        int i13 = (i12 + i6) * 31;
        boolean z3 = this.d2;
        if (!z3) {
            z2 = z3;
        }
        return i13 + (z2 ? 1 : 0);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("EventInProfile(club=");
        P0.append(this.c);
        P0.append(", isAttending=");
        P0.append(g().booleanValue());
        P0.append(", id=");
        P0.append(this.q);
        P0.append(", description=");
        P0.append(this.x);
        P0.append(", name=");
        P0.append(this.y);
        P0.append(", hosts=");
        P0.append(this.Y1);
        P0.append(", timeStart=");
        P0.append(this.Z1);
        P0.append(", isMemberOnly=");
        P0.append(this.a2);
        P0.append(", url=");
        P0.append(this.b2);
        P0.append(", channel=");
        P0.append(this.c2);
        P0.append(", isExpired=");
        return i0.d.a.a.a.C0(P0, this.d2, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        ClubWithAdmin clubWithAdmin = this.c;
        if (clubWithAdmin == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            clubWithAdmin.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.q);
        parcel.writeString(this.x);
        parcel.writeString(this.y);
        List<UserInList> list = this.Y1;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (UserInList writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, i);
            }
        }
        parcel.writeSerializable(this.Z1);
        parcel.writeInt(this.a2 ? 1 : 0);
        parcel.writeString(this.b2);
        parcel.writeString(this.c2);
        parcel.writeInt(this.d2 ? 1 : 0);
    }

    public EventInProfile(ClubWithAdmin clubWithAdmin, boolean z, int i, String str, String str2, List<UserInList> list, OffsetDateTime offsetDateTime, boolean z2, String str3, String str4, boolean z3) {
        this.c = clubWithAdmin;
        this.d = z;
        this.q = i;
        this.x = str;
        this.y = str2;
        this.Y1 = list;
        this.Z1 = offsetDateTime;
        this.a2 = z2;
        this.b2 = str3;
        this.c2 = str4;
        this.d2 = z3;
    }
}
