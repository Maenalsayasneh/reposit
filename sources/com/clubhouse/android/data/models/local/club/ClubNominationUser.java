package com.clubhouse.android.data.models.local.club;

import android.os.Parcel;
import android.os.Parcelable;
import com.clubhouse.android.user.model.User;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
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
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: ClubNominationUser.kt */
public final class ClubNominationUser implements User {
    public static final Parcelable.Creator<ClubNominationUser> CREATOR = new b();
    public static final Companion Companion = new Companion((f) null);
    public final String Y1;
    public final String Z1;
    public final int c;
    public final String d;
    public final String q;
    public final String x;
    public final Integer y;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/local/club/ClubNominationUser$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/local/club/ClubNominationUser;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: ClubNominationUser.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<ClubNominationUser> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: ClubNominationUser.kt */
    public static final class a implements v<ClubNominationUser> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.local.club.ClubNominationUser", aVar, 7);
            pluginGeneratedSerialDescriptor.i("user_id", true);
            pluginGeneratedSerialDescriptor.i("name", false);
            pluginGeneratedSerialDescriptor.i("username", true);
            pluginGeneratedSerialDescriptor.i("photo_url", true);
            pluginGeneratedSerialDescriptor.i("invite_nomination_id", true);
            pluginGeneratedSerialDescriptor.i("reason", true);
            pluginGeneratedSerialDescriptor.i("nominated_by_name", true);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            e0 e0Var = e0.b;
            g1 g1Var = g1.b;
            return new KSerializer[]{e0Var, g1Var, m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(e0Var), m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(g1Var)};
        }

        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder r20) {
            /*
                r19 = this;
                r0 = r20
                java.lang.String r1 = "decoder"
                m0.n.b.i.e(r0, r1)
                kotlinx.serialization.descriptors.SerialDescriptor r1 = b
                n0.c.j.c r0 = r0.c(r1)
                boolean r2 = r0.y()
                r3 = 6
                r4 = 5
                r5 = 3
                r6 = 0
                r7 = 2
                r8 = 4
                r9 = 0
                r10 = 1
                if (r2 == 0) goto L_0x0042
                int r2 = r0.k(r1, r9)
                java.lang.String r9 = r0.t(r1, r10)
                n0.c.k.g1 r10 = n0.c.k.g1.b
                java.lang.Object r7 = r0.v(r1, r7, r10, r6)
                java.lang.Object r5 = r0.v(r1, r5, r10, r6)
                n0.c.k.e0 r11 = n0.c.k.e0.b
                java.lang.Object r8 = r0.v(r1, r8, r11, r6)
                java.lang.Object r4 = r0.v(r1, r4, r10, r6)
                java.lang.Object r3 = r0.v(r1, r3, r10, r6)
                r6 = 127(0x7f, float:1.78E-43)
                r12 = r2
                r11 = r6
                r13 = r9
                goto L_0x00a9
            L_0x0042:
                r11 = r6
                r12 = r11
                r13 = r12
                r14 = r13
                r15 = r14
                r2 = r9
                r16 = r2
                r17 = r10
            L_0x004c:
                if (r17 == 0) goto L_0x00a0
                int r9 = r0.x(r1)
                switch(r9) {
                    case -1: goto L_0x009c;
                    case 0: goto L_0x0094;
                    case 1: goto L_0x008c;
                    case 2: goto L_0x0082;
                    case 3: goto L_0x0078;
                    case 4: goto L_0x006e;
                    case 5: goto L_0x0064;
                    case 6: goto L_0x005b;
                    default: goto L_0x0055;
                }
            L_0x0055:
                kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
                r0.<init>(r9)
                throw r0
            L_0x005b:
                n0.c.k.g1 r9 = n0.c.k.g1.b
                java.lang.Object r6 = r0.v(r1, r3, r9, r6)
                r16 = r16 | 64
                goto L_0x0092
            L_0x0064:
                n0.c.k.g1 r9 = n0.c.k.g1.b
                java.lang.Object r9 = r0.v(r1, r4, r9, r14)
                r16 = r16 | 32
                r14 = r9
                goto L_0x0092
            L_0x006e:
                n0.c.k.e0 r9 = n0.c.k.e0.b
                java.lang.Object r9 = r0.v(r1, r8, r9, r13)
                r16 = r16 | 16
                r13 = r9
                goto L_0x0092
            L_0x0078:
                n0.c.k.g1 r9 = n0.c.k.g1.b
                java.lang.Object r9 = r0.v(r1, r5, r9, r12)
                r16 = r16 | 8
                r12 = r9
                goto L_0x0092
            L_0x0082:
                n0.c.k.g1 r9 = n0.c.k.g1.b
                java.lang.Object r9 = r0.v(r1, r7, r9, r11)
                r16 = r16 | 4
                r11 = r9
                goto L_0x0092
            L_0x008c:
                java.lang.String r15 = r0.t(r1, r10)
                r16 = r16 | 2
            L_0x0092:
                r9 = 0
                goto L_0x004c
            L_0x0094:
                r9 = 0
                int r2 = r0.k(r1, r9)
                r16 = r16 | 1
                goto L_0x004c
            L_0x009c:
                r9 = 0
                r17 = r9
                goto L_0x004c
            L_0x00a0:
                r3 = r6
                r7 = r11
                r5 = r12
                r8 = r13
                r4 = r14
                r13 = r15
                r11 = r16
                r12 = r2
            L_0x00a9:
                r0.b(r1)
                com.clubhouse.android.data.models.local.club.ClubNominationUser r0 = new com.clubhouse.android.data.models.local.club.ClubNominationUser
                r14 = r7
                java.lang.String r14 = (java.lang.String) r14
                r15 = r5
                java.lang.String r15 = (java.lang.String) r15
                r16 = r8
                java.lang.Integer r16 = (java.lang.Integer) r16
                r17 = r4
                java.lang.String r17 = (java.lang.String) r17
                r18 = r3
                java.lang.String r18 = (java.lang.String) r18
                r10 = r0
                r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.models.local.club.ClubNominationUser.a.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            ClubNominationUser clubNominationUser = (ClubNominationUser) obj;
            i.e(encoder, "encoder");
            i.e(clubNominationUser, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(clubNominationUser, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            boolean z = false;
            if (c.v(serialDescriptor, 0) || clubNominationUser.getId().intValue() != 0) {
                c.q(serialDescriptor, 0, clubNominationUser.getId().intValue());
            }
            c.s(serialDescriptor, 1, clubNominationUser.d);
            if (c.v(serialDescriptor, 2) || clubNominationUser.q != null) {
                c.l(serialDescriptor, 2, g1.b, clubNominationUser.q);
            }
            if (c.v(serialDescriptor, 3) || clubNominationUser.x != null) {
                c.l(serialDescriptor, 3, g1.b, clubNominationUser.x);
            }
            if (c.v(serialDescriptor, 4) || clubNominationUser.y != null) {
                c.l(serialDescriptor, 4, e0.b, clubNominationUser.y);
            }
            if (c.v(serialDescriptor, 5) || clubNominationUser.Y1 != null) {
                c.l(serialDescriptor, 5, g1.b, clubNominationUser.Y1);
            }
            if (c.v(serialDescriptor, 6) || clubNominationUser.Z1 != null) {
                z = true;
            }
            if (z) {
                c.l(serialDescriptor, 6, g1.b, clubNominationUser.Z1);
            }
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    /* compiled from: ClubNominationUser.kt */
    public static final class b implements Parcelable.Creator<ClubNominationUser> {
        public Object createFromParcel(Parcel parcel) {
            i.e(parcel, "parcel");
            return new ClubNominationUser(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString());
        }

        public Object[] newArray(int i) {
            return new ClubNominationUser[i];
        }
    }

    public ClubNominationUser(int i, int i2, String str, String str2, String str3, Integer num, String str4, String str5) {
        if (2 == (i & 2)) {
            this.c = (i & 1) == 0 ? 0 : i2;
            this.d = str;
            if ((i & 4) == 0) {
                this.q = null;
            } else {
                this.q = str2;
            }
            if ((i & 8) == 0) {
                this.x = null;
            } else {
                this.x = str3;
            }
            if ((i & 16) == 0) {
                this.y = null;
            } else {
                this.y = num;
            }
            if ((i & 32) == 0) {
                this.Y1 = null;
            } else {
                this.Y1 = str4;
            }
            if ((i & 64) == 0) {
                this.Z1 = null;
            } else {
                this.Z1 = str5;
            }
        } else {
            a aVar = a.a;
            m0.r.t.a.r.m.a1.a.W3(i, 2, a.b);
            throw null;
        }
    }

    public String C() {
        return this.q;
    }

    public String F() {
        return h0.b0.v.f0(this);
    }

    public String I() {
        return h0.b0.v.O0(this);
    }

    public String b() {
        return this.x;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClubNominationUser)) {
            return false;
        }
        ClubNominationUser clubNominationUser = (ClubNominationUser) obj;
        return getId().intValue() == clubNominationUser.getId().intValue() && i.a(this.d, clubNominationUser.d) && i.a(this.q, clubNominationUser.q) && i.a(this.x, clubNominationUser.x) && i.a(this.y, clubNominationUser.y) && i.a(this.Y1, clubNominationUser.Y1) && i.a(this.Z1, clubNominationUser.Z1);
    }

    public String getName() {
        return this.d;
    }

    public int hashCode() {
        int i;
        int i2;
        int F = i0.d.a.a.a.F(this.d, getId().hashCode() * 31, 31);
        String str = this.q;
        int i3 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i4 = (F + i) * 31;
        String str2 = this.x;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i5 = (i4 + i2) * 31;
        Integer num = this.y;
        int hashCode = (i5 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.Y1;
        int hashCode2 = (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.Z1;
        if (str4 != null) {
            i3 = str4.hashCode();
        }
        return hashCode2 + i3;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ClubNominationUser(id=");
        P0.append(getId().intValue());
        P0.append(", name=");
        P0.append(this.d);
        P0.append(", username=");
        P0.append(this.q);
        P0.append(", photoUrl=");
        P0.append(this.x);
        P0.append(", inviteNominationId=");
        P0.append(this.y);
        P0.append(", reason=");
        P0.append(this.Y1);
        P0.append(", nominatedByName=");
        return i0.d.a.a.a.w0(P0, this.Z1, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        i.e(parcel, "out");
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.q);
        parcel.writeString(this.x);
        Integer num = this.y;
        if (num == null) {
            i2 = 0;
        } else {
            parcel.writeInt(1);
            i2 = num.intValue();
        }
        parcel.writeInt(i2);
        parcel.writeString(this.Y1);
        parcel.writeString(this.Z1);
    }

    public Integer getId() {
        return Integer.valueOf(this.c);
    }

    public ClubNominationUser(int i, String str, String str2, String str3, Integer num, String str4, String str5) {
        i.e(str, "name");
        this.c = i;
        this.d = str;
        this.q = str2;
        this.x = str3;
        this.y = num;
        this.Y1 = str4;
        this.Z1 = str5;
    }
}
