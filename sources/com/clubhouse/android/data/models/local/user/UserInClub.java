package com.clubhouse.android.data.models.local.user;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.FrameMetricsAggregator;
import com.clubhouse.android.user.model.User;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.util.Objects;
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
/* compiled from: UserInClub.kt */
public final class UserInClub implements User {
    public static final Parcelable.Creator<UserInClub> CREATOR = new b();
    public static final Companion Companion = new Companion((f) null);
    public final int Y1;
    public final String Z1;
    public final String a2;
    public final String b2;
    public final boolean c;
    public final boolean d;
    public final boolean q;
    public final boolean x;
    public final String y;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/local/user/UserInClub$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/local/user/UserInClub;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: UserInClub.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<UserInClub> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: UserInClub.kt */
    public static final class a implements v<UserInClub> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.local.user.UserInClub", aVar, 9);
            pluginGeneratedSerialDescriptor.i("is_admin", false);
            pluginGeneratedSerialDescriptor.i("is_pending_accept", false);
            pluginGeneratedSerialDescriptor.i("is_pending_approval", false);
            pluginGeneratedSerialDescriptor.i("is_leader", false);
            pluginGeneratedSerialDescriptor.i("bio", false);
            pluginGeneratedSerialDescriptor.i("user_id", false);
            pluginGeneratedSerialDescriptor.i("name", false);
            pluginGeneratedSerialDescriptor.i("username", false);
            pluginGeneratedSerialDescriptor.i("photo_url", false);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            h hVar = h.b;
            g1 g1Var = g1.b;
            return new KSerializer[]{hVar, hVar, hVar, hVar, m0.r.t.a.r.m.a1.a.R1(g1Var), e0.b, m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(g1Var)};
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:0x00d1, code lost:
            r3 = 6;
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
                r3 = 6
                r4 = 5
                r5 = 0
                r6 = 8
                r7 = 3
                r8 = 7
                r9 = 0
                r10 = 1
                r11 = 2
                r12 = 4
                if (r2 == 0) goto L_0x0051
                boolean r2 = r0.s(r1, r9)
                boolean r9 = r0.s(r1, r10)
                boolean r10 = r0.s(r1, r11)
                boolean r7 = r0.s(r1, r7)
                n0.c.k.g1 r11 = n0.c.k.g1.b
                java.lang.Object r12 = r0.v(r1, r12, r11, r5)
                int r4 = r0.k(r1, r4)
                java.lang.Object r3 = r0.v(r1, r3, r11, r5)
                java.lang.Object r8 = r0.v(r1, r8, r11, r5)
                java.lang.Object r5 = r0.v(r1, r6, r11, r5)
                r6 = 511(0x1ff, float:7.16E-43)
                r14 = r2
                r19 = r4
                r13 = r6
                r17 = r7
                r15 = r9
                r16 = r10
                goto L_0x00df
            L_0x0051:
                r13 = r5
                r14 = r13
                r15 = r14
                r2 = r9
                r17 = r2
                r18 = r17
                r19 = r18
                r20 = r10
                r5 = r19
                r10 = r5
                r9 = r15
            L_0x0061:
                if (r20 == 0) goto L_0x00d3
                int r11 = r0.x(r1)
                switch(r11) {
                    case -1: goto L_0x00cb;
                    case 0: goto L_0x00bb;
                    case 1: goto L_0x00b2;
                    case 2: goto L_0x00aa;
                    case 3: goto L_0x00a2;
                    case 4: goto L_0x0099;
                    case 5: goto L_0x008e;
                    case 6: goto L_0x0084;
                    case 7: goto L_0x007a;
                    case 8: goto L_0x0070;
                    default: goto L_0x006a;
                }
            L_0x006a:
                kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
                r0.<init>(r11)
                throw r0
            L_0x0070:
                n0.c.k.g1 r11 = n0.c.k.g1.b
                java.lang.Object r11 = r0.v(r1, r6, r11, r13)
                r10 = r10 | 256(0x100, float:3.59E-43)
                r13 = r11
                goto L_0x0094
            L_0x007a:
                n0.c.k.g1 r11 = n0.c.k.g1.b
                java.lang.Object r11 = r0.v(r1, r8, r11, r14)
                r10 = r10 | 128(0x80, float:1.794E-43)
                r14 = r11
                goto L_0x0094
            L_0x0084:
                n0.c.k.g1 r11 = n0.c.k.g1.b
                java.lang.Object r11 = r0.v(r1, r3, r11, r15)
                r10 = r10 | 64
                r15 = r11
                goto L_0x0094
            L_0x008e:
                int r5 = r0.k(r1, r4)
                r10 = r10 | 32
            L_0x0094:
                r3 = 1
                r11 = 2
            L_0x0096:
                r16 = 0
                goto L_0x00d1
            L_0x0099:
                n0.c.k.g1 r11 = n0.c.k.g1.b
                java.lang.Object r9 = r0.v(r1, r12, r11, r9)
                r10 = r10 | 16
                goto L_0x00a8
            L_0x00a2:
                boolean r17 = r0.s(r1, r7)
                r10 = r10 | 8
            L_0x00a8:
                r11 = 2
                goto L_0x0061
            L_0x00aa:
                r11 = 2
                boolean r19 = r0.s(r1, r11)
                r10 = r10 | 4
                goto L_0x0061
            L_0x00b2:
                r3 = 1
                r11 = 2
                boolean r18 = r0.s(r1, r3)
                r10 = r10 | 2
                goto L_0x0096
            L_0x00bb:
                r2 = 0
                r3 = 1
                r11 = 2
                boolean r16 = r0.s(r1, r2)
                r10 = r10 | 1
                r23 = r16
                r16 = r2
                r2 = r23
                goto L_0x00d1
            L_0x00cb:
                r3 = 1
                r11 = 2
                r16 = 0
                r20 = r16
            L_0x00d1:
                r3 = 6
                goto L_0x0061
            L_0x00d3:
                r12 = r9
                r8 = r14
                r3 = r15
                r15 = r18
                r16 = r19
                r14 = r2
                r19 = r5
                r5 = r13
                r13 = r10
            L_0x00df:
                r0.b(r1)
                com.clubhouse.android.data.models.local.user.UserInClub r0 = new com.clubhouse.android.data.models.local.user.UserInClub
                r18 = r12
                java.lang.String r18 = (java.lang.String) r18
                r20 = r3
                java.lang.String r20 = (java.lang.String) r20
                r21 = r8
                java.lang.String r21 = (java.lang.String) r21
                r22 = r5
                java.lang.String r22 = (java.lang.String) r22
                r12 = r0
                r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.models.local.user.UserInClub.a.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            UserInClub userInClub = (UserInClub) obj;
            i.e(encoder, "encoder");
            i.e(userInClub, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(userInClub, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            c.r(serialDescriptor, 0, userInClub.c);
            c.r(serialDescriptor, 1, userInClub.d);
            c.r(serialDescriptor, 2, userInClub.q);
            c.r(serialDescriptor, 3, userInClub.x);
            g1 g1Var = g1.b;
            c.l(serialDescriptor, 4, g1Var, userInClub.y);
            c.q(serialDescriptor, 5, userInClub.getId().intValue());
            c.l(serialDescriptor, 6, g1Var, userInClub.Z1);
            c.l(serialDescriptor, 7, g1Var, userInClub.a2);
            c.l(serialDescriptor, 8, g1Var, userInClub.b2);
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    /* compiled from: UserInClub.kt */
    public static final class b implements Parcelable.Creator<UserInClub> {
        public Object createFromParcel(Parcel parcel) {
            i.e(parcel, "parcel");
            return new UserInClub(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public Object[] newArray(int i) {
            return new UserInClub[i];
        }
    }

    public UserInClub(int i, boolean z, boolean z2, boolean z3, boolean z4, String str, int i2, String str2, String str3, String str4) {
        if (511 == (i & FrameMetricsAggregator.EVERY_DURATION)) {
            this.c = z;
            this.d = z2;
            this.q = z3;
            this.x = z4;
            this.y = str;
            this.Y1 = i2;
            this.Z1 = str2;
            this.a2 = str3;
            this.b2 = str4;
            return;
        }
        a aVar = a.a;
        m0.r.t.a.r.m.a1.a.W3(i, FrameMetricsAggregator.EVERY_DURATION, a.b);
        throw null;
    }

    public static UserInClub a(UserInClub userInClub, boolean z, boolean z2, boolean z3, boolean z4, String str, int i, String str2, String str3, String str4, int i2) {
        UserInClub userInClub2 = userInClub;
        int i3 = i2;
        boolean z5 = (i3 & 1) != 0 ? userInClub2.c : z;
        boolean z6 = (i3 & 2) != 0 ? userInClub2.d : z2;
        boolean z7 = (i3 & 4) != 0 ? userInClub2.q : z3;
        boolean z8 = (i3 & 8) != 0 ? userInClub2.x : z4;
        String str5 = null;
        String str6 = (i3 & 16) != 0 ? userInClub2.y : null;
        int intValue = (i3 & 32) != 0 ? userInClub.getId().intValue() : i;
        String str7 = (i3 & 64) != 0 ? userInClub2.Z1 : null;
        String str8 = (i3 & 128) != 0 ? userInClub2.a2 : null;
        if ((i3 & 256) != 0) {
            str5 = userInClub2.b2;
        }
        Objects.requireNonNull(userInClub);
        return new UserInClub(z5, z6, z7, z8, str6, intValue, str7, str8, str5);
    }

    public String C() {
        return this.a2;
    }

    public String F() {
        return h0.b0.v.f0(this);
    }

    public String I() {
        return h0.b0.v.O0(this);
    }

    public String b() {
        return this.b2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserInClub)) {
            return false;
        }
        UserInClub userInClub = (UserInClub) obj;
        return this.c == userInClub.c && this.d == userInClub.d && this.q == userInClub.q && this.x == userInClub.x && i.a(this.y, userInClub.y) && getId().intValue() == userInClub.getId().intValue() && i.a(this.Z1, userInClub.Z1) && i.a(this.a2, userInClub.a2) && i.a(this.b2, userInClub.b2);
    }

    public String getName() {
        return this.Z1;
    }

    public int hashCode() {
        int i;
        int i2;
        boolean z = this.c;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i3 = (z ? 1 : 0) * true;
        boolean z3 = this.d;
        if (z3) {
            z3 = true;
        }
        int i4 = (i3 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.q;
        if (z4) {
            z4 = true;
        }
        int i5 = (i4 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.x;
        if (!z5) {
            z2 = z5;
        }
        int i6 = (i5 + (z2 ? 1 : 0)) * 31;
        String str = this.y;
        int i7 = 0;
        int hashCode = (getId().hashCode() + ((i6 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.Z1;
        if (str2 == null) {
            i = 0;
        } else {
            i = str2.hashCode();
        }
        int i8 = (hashCode + i) * 31;
        String str3 = this.a2;
        if (str3 == null) {
            i2 = 0;
        } else {
            i2 = str3.hashCode();
        }
        int i9 = (i8 + i2) * 31;
        String str4 = this.b2;
        if (str4 != null) {
            i7 = str4.hashCode();
        }
        return i9 + i7;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("UserInClub(isAdmin=");
        P0.append(this.c);
        P0.append(", isPendingAccept=");
        P0.append(this.d);
        P0.append(", isPendingApproval=");
        P0.append(this.q);
        P0.append(", isLeader=");
        P0.append(this.x);
        P0.append(", bio=");
        P0.append(this.y);
        P0.append(", id=");
        P0.append(getId().intValue());
        P0.append(", name=");
        P0.append(this.Z1);
        P0.append(", username=");
        P0.append(this.a2);
        P0.append(", photoUrl=");
        return i0.d.a.a.a.w0(P0, this.b2, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.q ? 1 : 0);
        parcel.writeInt(this.x ? 1 : 0);
        parcel.writeString(this.y);
        parcel.writeInt(this.Y1);
        parcel.writeString(this.Z1);
        parcel.writeString(this.a2);
        parcel.writeString(this.b2);
    }

    public Integer getId() {
        return Integer.valueOf(this.Y1);
    }

    public UserInClub(boolean z, boolean z2, boolean z3, boolean z4, String str, int i, String str2, String str3, String str4) {
        this.c = z;
        this.d = z2;
        this.q = z3;
        this.x = z4;
        this.y = str;
        this.Y1 = i;
        this.Z1 = str2;
        this.a2 = str3;
        this.b2 = str4;
    }
}
