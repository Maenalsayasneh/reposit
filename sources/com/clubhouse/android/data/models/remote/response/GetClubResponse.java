package com.clubhouse.android.data.models.remote.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import com.clubhouse.android.data.models.local.Topic;
import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.data.models.local.user.BasicUser;
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
import n0.c.k.e0;
import n0.c.k.g1;
import n0.c.k.h;
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: GetClubResponse.kt */
public final class GetClubResponse implements Parcelable {
    public static final Parcelable.Creator<GetClubResponse> CREATOR = new b();
    public static final Companion Companion = new Companion((f) null);
    public final boolean Y1;
    public final boolean Z1;
    public final BasicUser a2;
    public final List<Integer> b2;
    public final ClubWithAdmin c;
    public final String c2;
    public final boolean d;
    public final List<Topic> d2;
    public final Integer e2;
    public final boolean q;
    public final boolean x;
    public final boolean y;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/remote/response/GetClubResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/remote/response/GetClubResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: GetClubResponse.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<GetClubResponse> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: GetClubResponse.kt */
    public static final class a implements v<GetClubResponse> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.remote.response.GetClubResponse", aVar, 12);
            pluginGeneratedSerialDescriptor.i("club", false);
            pluginGeneratedSerialDescriptor.i("is_admin", false);
            pluginGeneratedSerialDescriptor.i("is_member", false);
            pluginGeneratedSerialDescriptor.i("is_leader", false);
            pluginGeneratedSerialDescriptor.i("is_pending_accept", false);
            pluginGeneratedSerialDescriptor.i("is_pending_approval", false);
            pluginGeneratedSerialDescriptor.i("can_delete_club", false);
            pluginGeneratedSerialDescriptor.i("added_by_user_profile", true);
            pluginGeneratedSerialDescriptor.i("member_user_ids", false);
            pluginGeneratedSerialDescriptor.i("invite_link", true);
            pluginGeneratedSerialDescriptor.i("topics", false);
            pluginGeneratedSerialDescriptor.i("num_pending_nominations", true);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            h hVar = h.b;
            e0 e0Var = e0.b;
            return new KSerializer[]{ClubWithAdmin.a.a, hVar, hVar, hVar, hVar, hVar, hVar, m0.r.t.a.r.m.a1.a.R1(BasicUser.a.a), new n0.c.k.e(e0Var), m0.r.t.a.r.m.a1.a.R1(g1.b), new n0.c.k.e(Topic.a.a), m0.r.t.a.r.m.a1.a.R1(e0Var)};
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x00df, code lost:
            r8 = r2;
            r14 = r14;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x00ee, code lost:
            r8 = r2;
            r2 = 11;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x00f1, code lost:
            r14 = r14;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x00fa, code lost:
            r14 = r14;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x010e, code lost:
            r14 = r14;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0118, code lost:
            r14 = r14;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x012d, code lost:
            r2 = 11;
            r3 = 9;
            r4 = 7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00f1, code lost:
            r14 = r14;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00f1, code lost:
            r14 = r14;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder r30) {
            /*
                r29 = this;
                r0 = r30
                java.lang.String r1 = "decoder"
                m0.n.b.i.e(r0, r1)
                kotlinx.serialization.descriptors.SerialDescriptor r1 = b
                n0.c.j.c r0 = r0.c(r1)
                boolean r2 = r0.y()
                r3 = 9
                r4 = 7
                r5 = 0
                r7 = 8
                r8 = 3
                r9 = 5
                r10 = 6
                r11 = 10
                r12 = 0
                r13 = 1
                r14 = 2
                r15 = 4
                if (r2 == 0) goto L_0x007f
                com.clubhouse.android.data.models.local.club.ClubWithAdmin$a r2 = com.clubhouse.android.data.models.local.club.ClubWithAdmin.a.a
                java.lang.Object r2 = r0.m(r1, r12, r2, r5)
                boolean r12 = r0.s(r1, r13)
                boolean r13 = r0.s(r1, r14)
                boolean r8 = r0.s(r1, r8)
                boolean r14 = r0.s(r1, r15)
                boolean r9 = r0.s(r1, r9)
                boolean r10 = r0.s(r1, r10)
                com.clubhouse.android.data.models.local.user.BasicUser$a r15 = com.clubhouse.android.data.models.local.user.BasicUser.a.a
                java.lang.Object r4 = r0.v(r1, r4, r15, r5)
                n0.c.k.e r15 = new n0.c.k.e
                n0.c.k.e0 r6 = n0.c.k.e0.b
                r15.<init>(r6)
                java.lang.Object r7 = r0.m(r1, r7, r15, r5)
                n0.c.k.g1 r15 = n0.c.k.g1.b
                java.lang.Object r3 = r0.v(r1, r3, r15, r5)
                n0.c.k.e r15 = new n0.c.k.e
                r16 = r2
                com.clubhouse.android.data.models.local.Topic$a r2 = com.clubhouse.android.data.models.local.Topic.a.a
                r15.<init>(r2)
                java.lang.Object r2 = r0.m(r1, r11, r15, r5)
                r11 = 11
                java.lang.Object r5 = r0.v(r1, r11, r6, r5)
                r6 = 4095(0xfff, float:5.738E-42)
                r20 = r8
                r22 = r9
                r23 = r10
                r18 = r12
                r19 = r13
                r21 = r14
                r14 = r2
                r2 = r16
                r16 = r6
                goto L_0x0146
            L_0x007f:
                r2 = 11
                r6 = r5
                r14 = r6
                r17 = r14
                r8 = r12
                r20 = r8
                r21 = r20
                r22 = r21
                r23 = r22
                r24 = r23
                r25 = r24
                r26 = r13
                r12 = r17
                r13 = r12
            L_0x0097:
                if (r26 == 0) goto L_0x0133
                int r15 = r0.x(r1)
                switch(r15) {
                    case -1: goto L_0x0127;
                    case 0: goto L_0x011a;
                    case 1: goto L_0x0110;
                    case 2: goto L_0x0106;
                    case 3: goto L_0x00fd;
                    case 4: goto L_0x00f3;
                    case 5: goto L_0x00e8;
                    case 6: goto L_0x00e1;
                    case 7: goto L_0x00d7;
                    case 8: goto L_0x00c9;
                    case 9: goto L_0x00c0;
                    case 10: goto L_0x00b2;
                    case 11: goto L_0x00a6;
                    default: goto L_0x00a0;
                }
            L_0x00a0:
                kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
                r0.<init>(r15)
                throw r0
            L_0x00a6:
                n0.c.k.e0 r15 = n0.c.k.e0.b
                java.lang.Object r13 = r0.v(r1, r2, r15, r13)
                r8 = r8 | 2048(0x800, float:2.87E-42)
                r4 = 0
                r15 = 3
                goto L_0x012d
            L_0x00b2:
                n0.c.k.e r15 = new n0.c.k.e
                com.clubhouse.android.data.models.local.Topic$a r2 = com.clubhouse.android.data.models.local.Topic.a.a
                r15.<init>(r2)
                java.lang.Object r14 = r0.m(r1, r11, r15, r14)
                r2 = r8 | 1024(0x400, float:1.435E-42)
                goto L_0x00df
            L_0x00c0:
                n0.c.k.g1 r2 = n0.c.k.g1.b
                java.lang.Object r5 = r0.v(r1, r3, r2, r5)
                r2 = r8 | 512(0x200, float:7.175E-43)
                goto L_0x00df
            L_0x00c9:
                n0.c.k.e r2 = new n0.c.k.e
                n0.c.k.e0 r15 = n0.c.k.e0.b
                r2.<init>(r15)
                java.lang.Object r6 = r0.m(r1, r7, r2, r6)
                r2 = r8 | 256(0x100, float:3.59E-43)
                goto L_0x00df
            L_0x00d7:
                com.clubhouse.android.data.models.local.user.BasicUser$a r2 = com.clubhouse.android.data.models.local.user.BasicUser.a.a
                java.lang.Object r12 = r0.v(r1, r4, r2, r12)
                r2 = r8 | 128(0x80, float:1.794E-43)
            L_0x00df:
                r8 = r2
                goto L_0x00fa
            L_0x00e1:
                boolean r22 = r0.s(r1, r10)
                r2 = r8 | 64
                goto L_0x00ee
            L_0x00e8:
                boolean r21 = r0.s(r1, r9)
                r2 = r8 | 32
            L_0x00ee:
                r8 = r2
                r2 = 11
            L_0x00f1:
                r15 = 4
                goto L_0x0097
            L_0x00f3:
                r2 = 4
                boolean r25 = r0.s(r1, r2)
                r8 = r8 | 16
            L_0x00fa:
                r2 = 1
                r15 = 3
                goto L_0x0118
            L_0x00fd:
                r2 = 4
                r15 = 3
                boolean r20 = r0.s(r1, r15)
                r8 = r8 | 8
                goto L_0x010e
            L_0x0106:
                r2 = 2
                r15 = 3
                boolean r24 = r0.s(r1, r2)
                r8 = r8 | 4
            L_0x010e:
                r2 = 1
                goto L_0x0118
            L_0x0110:
                r2 = 1
                r15 = 3
                boolean r23 = r0.s(r1, r2)
                r8 = r8 | 2
            L_0x0118:
                r4 = 0
                goto L_0x012d
            L_0x011a:
                r15 = 3
                com.clubhouse.android.data.models.local.club.ClubWithAdmin$a r2 = com.clubhouse.android.data.models.local.club.ClubWithAdmin.a.a
                r3 = r17
                r4 = 0
                java.lang.Object r17 = r0.m(r1, r4, r2, r3)
                r8 = r8 | 1
                goto L_0x012d
            L_0x0127:
                r3 = r17
                r4 = 0
                r15 = 3
                r26 = r4
            L_0x012d:
                r2 = 11
                r3 = 9
                r4 = 7
                goto L_0x00f1
            L_0x0133:
                r3 = r17
                r2 = r3
                r3 = r5
                r7 = r6
                r16 = r8
                r4 = r12
                r5 = r13
                r18 = r23
                r19 = r24
                r23 = r22
                r22 = r21
                r21 = r25
            L_0x0146:
                r0.b(r1)
                com.clubhouse.android.data.models.remote.response.GetClubResponse r0 = new com.clubhouse.android.data.models.remote.response.GetClubResponse
                r17 = r2
                com.clubhouse.android.data.models.local.club.ClubWithAdmin r17 = (com.clubhouse.android.data.models.local.club.ClubWithAdmin) r17
                r24 = r4
                com.clubhouse.android.data.models.local.user.BasicUser r24 = (com.clubhouse.android.data.models.local.user.BasicUser) r24
                r25 = r7
                java.util.List r25 = (java.util.List) r25
                r26 = r3
                java.lang.String r26 = (java.lang.String) r26
                r27 = r14
                java.util.List r27 = (java.util.List) r27
                r28 = r5
                java.lang.Integer r28 = (java.lang.Integer) r28
                r15 = r0
                r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.models.remote.response.GetClubResponse.a.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            GetClubResponse getClubResponse = (GetClubResponse) obj;
            i.e(encoder, "encoder");
            i.e(getClubResponse, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(getClubResponse, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            boolean z = false;
            c.z(serialDescriptor, 0, ClubWithAdmin.a.a, getClubResponse.c);
            c.r(serialDescriptor, 1, getClubResponse.d);
            c.r(serialDescriptor, 2, getClubResponse.q);
            c.r(serialDescriptor, 3, getClubResponse.x);
            c.r(serialDescriptor, 4, getClubResponse.y);
            c.r(serialDescriptor, 5, getClubResponse.Y1);
            c.r(serialDescriptor, 6, getClubResponse.Z1);
            if (c.v(serialDescriptor, 7) || getClubResponse.a2 != null) {
                c.l(serialDescriptor, 7, BasicUser.a.a, getClubResponse.a2);
            }
            e0 e0Var = e0.b;
            c.z(serialDescriptor, 8, new n0.c.k.e(e0Var), getClubResponse.b2);
            if (c.v(serialDescriptor, 9) || getClubResponse.c2 != null) {
                c.l(serialDescriptor, 9, g1.b, getClubResponse.c2);
            }
            c.z(serialDescriptor, 10, new n0.c.k.e(Topic.a.a), getClubResponse.d2);
            if (c.v(serialDescriptor, 11) || getClubResponse.e2 != null) {
                z = true;
            }
            if (z) {
                c.l(serialDescriptor, 11, e0Var, getClubResponse.e2);
            }
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    /* compiled from: GetClubResponse.kt */
    public static final class b implements Parcelable.Creator<GetClubResponse> {
        public Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            i.e(parcel2, "parcel");
            ClubWithAdmin createFromParcel = ClubWithAdmin.CREATOR.createFromParcel(parcel2);
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            boolean z3 = parcel.readInt() != 0;
            boolean z4 = parcel.readInt() != 0;
            boolean z5 = parcel.readInt() != 0;
            boolean z6 = parcel.readInt() != 0;
            BasicUser createFromParcel2 = parcel.readInt() == 0 ? null : BasicUser.CREATOR.createFromParcel(parcel2);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(Integer.valueOf(parcel.readInt()));
            }
            String readString = parcel.readString();
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i2 = 0; i2 != readInt2; i2 = i0.d.a.a.a.n(Topic.CREATOR, parcel2, arrayList2, i2, 1)) {
            }
            return new GetClubResponse(createFromParcel, z, z2, z3, z4, z5, z6, createFromParcel2, arrayList, readString, arrayList2, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        public Object[] newArray(int i) {
            return new GetClubResponse[i];
        }
    }

    public GetClubResponse(int i, ClubWithAdmin clubWithAdmin, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, BasicUser basicUser, List list, String str, List list2, Integer num) {
        int i2 = i;
        if (1407 == (i2 & 1407)) {
            this.c = clubWithAdmin;
            this.d = z;
            this.q = z2;
            this.x = z3;
            this.y = z4;
            this.Y1 = z5;
            this.Z1 = z6;
            if ((i2 & 128) == 0) {
                this.a2 = null;
            } else {
                this.a2 = basicUser;
            }
            this.b2 = list;
            if ((i2 & 512) == 0) {
                this.c2 = null;
            } else {
                this.c2 = str;
            }
            this.d2 = list2;
            if ((i2 & 2048) == 0) {
                this.e2 = null;
            } else {
                this.e2 = num;
            }
        } else {
            a aVar = a.a;
            m0.r.t.a.r.m.a1.a.W3(i, 1407, a.b);
            throw null;
        }
    }

    public static GetClubResponse a(GetClubResponse getClubResponse, ClubWithAdmin clubWithAdmin, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, BasicUser basicUser, List list, String str, List list2, Integer num, int i) {
        GetClubResponse getClubResponse2 = getClubResponse;
        int i2 = i;
        ClubWithAdmin clubWithAdmin2 = (i2 & 1) != 0 ? getClubResponse2.c : clubWithAdmin;
        boolean z7 = (i2 & 2) != 0 ? getClubResponse2.d : z;
        boolean z8 = (i2 & 4) != 0 ? getClubResponse2.q : z2;
        boolean z9 = (i2 & 8) != 0 ? getClubResponse2.x : z3;
        boolean z10 = (i2 & 16) != 0 ? getClubResponse2.y : z4;
        boolean z11 = (i2 & 32) != 0 ? getClubResponse2.Y1 : z5;
        boolean z12 = (i2 & 64) != 0 ? getClubResponse2.Z1 : z6;
        Integer num2 = null;
        BasicUser basicUser2 = (i2 & 128) != 0 ? getClubResponse2.a2 : null;
        List<Integer> list3 = (i2 & 256) != 0 ? getClubResponse2.b2 : null;
        String str2 = (i2 & 512) != 0 ? getClubResponse2.c2 : null;
        List list4 = (i2 & RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? getClubResponse2.d2 : list2;
        if ((i2 & 2048) != 0) {
            num2 = getClubResponse2.e2;
        }
        i.e(clubWithAdmin2, "club");
        i.e(list3, "memberUserIds");
        i.e(list4, "topics");
        return new GetClubResponse(clubWithAdmin2, z7, z8, z9, z10, z11, z12, basicUser2, list3, str2, list4, num2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetClubResponse)) {
            return false;
        }
        GetClubResponse getClubResponse = (GetClubResponse) obj;
        return i.a(this.c, getClubResponse.c) && this.d == getClubResponse.d && this.q == getClubResponse.q && this.x == getClubResponse.x && this.y == getClubResponse.y && this.Y1 == getClubResponse.Y1 && this.Z1 == getClubResponse.Z1 && i.a(this.a2, getClubResponse.a2) && i.a(this.b2, getClubResponse.b2) && i.a(this.c2, getClubResponse.c2) && i.a(this.d2, getClubResponse.d2) && i.a(this.e2, getClubResponse.e2);
    }

    public int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        boolean z = this.d;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.q;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.x;
        if (z4) {
            z4 = true;
        }
        int i3 = (i2 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.y;
        if (z5) {
            z5 = true;
        }
        int i4 = (i3 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.Y1;
        if (z6) {
            z6 = true;
        }
        int i5 = (i4 + (z6 ? 1 : 0)) * 31;
        boolean z7 = this.Z1;
        if (!z7) {
            z2 = z7;
        }
        int i6 = (i5 + (z2 ? 1 : 0)) * 31;
        BasicUser basicUser = this.a2;
        int i7 = 0;
        int H = i0.d.a.a.a.H(this.b2, (i6 + (basicUser == null ? 0 : basicUser.hashCode())) * 31, 31);
        String str = this.c2;
        int H2 = i0.d.a.a.a.H(this.d2, (H + (str == null ? 0 : str.hashCode())) * 31, 31);
        Integer num = this.e2;
        if (num != null) {
            i7 = num.hashCode();
        }
        return H2 + i7;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("GetClubResponse(club=");
        P0.append(this.c);
        P0.append(", isAdmin=");
        P0.append(this.d);
        P0.append(", isMember=");
        P0.append(this.q);
        P0.append(", isLeader=");
        P0.append(this.x);
        P0.append(", isPendingAccept=");
        P0.append(this.y);
        P0.append(", isPendingApproval=");
        P0.append(this.Y1);
        P0.append(", canDeleteClub=");
        P0.append(this.Z1);
        P0.append(", addByUser=");
        P0.append(this.a2);
        P0.append(", memberUserIds=");
        P0.append(this.b2);
        P0.append(", inviteLink=");
        P0.append(this.c2);
        P0.append(", topics=");
        P0.append(this.d2);
        P0.append(", numPendingNominations=");
        return i0.d.a.a.a.v0(P0, this.e2, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        this.c.writeToParcel(parcel, i);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.q ? 1 : 0);
        parcel.writeInt(this.x ? 1 : 0);
        parcel.writeInt(this.y ? 1 : 0);
        parcel.writeInt(this.Y1 ? 1 : 0);
        parcel.writeInt(this.Z1 ? 1 : 0);
        BasicUser basicUser = this.a2;
        if (basicUser == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            basicUser.writeToParcel(parcel, i);
        }
        List<Integer> list = this.b2;
        parcel.writeInt(list.size());
        for (Integer intValue : list) {
            parcel.writeInt(intValue.intValue());
        }
        parcel.writeString(this.c2);
        List<Topic> list2 = this.d2;
        parcel.writeInt(list2.size());
        for (Topic writeToParcel : list2) {
            writeToParcel.writeToParcel(parcel, i);
        }
        Integer num = this.e2;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            i0.d.a.a.a.i(parcel, 1, num);
        }
    }

    public GetClubResponse(ClubWithAdmin clubWithAdmin, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, BasicUser basicUser, List<Integer> list, String str, List<Topic> list2, Integer num) {
        i.e(clubWithAdmin, "club");
        i.e(list, "memberUserIds");
        i.e(list2, "topics");
        this.c = clubWithAdmin;
        this.d = z;
        this.q = z2;
        this.x = z3;
        this.y = z4;
        this.Y1 = z5;
        this.Z1 = z6;
        this.a2 = basicUser;
        this.b2 = list;
        this.c2 = str;
        this.d2 = list2;
        this.e2 = num;
    }
}
