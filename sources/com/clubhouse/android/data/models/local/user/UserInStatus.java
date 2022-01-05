package com.clubhouse.android.data.models.local.user;

import android.os.Parcel;
import android.os.Parcelable;
import com.clubhouse.android.user.model.User;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.pubnub.api.endpoints.objects_api.utils.Include;
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
/* compiled from: UserInStatus.kt */
public final class UserInStatus implements User {
    public static final Parcelable.Creator<UserInStatus> CREATOR = new b();
    public static final Companion Companion = new Companion((f) null);
    public final String Y1;
    public final String Z1;
    public final String a2;
    public final Boolean c;
    public final String d;
    public final String q;
    public final Integer x;
    public final int y;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/local/user/UserInStatus$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/local/user/UserInStatus;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: UserInStatus.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<UserInStatus> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: UserInStatus.kt */
    public static final class a implements v<UserInStatus> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.local.user.UserInStatus", aVar, 8);
            pluginGeneratedSerialDescriptor.i("is_speaker", true);
            pluginGeneratedSerialDescriptor.i("topic", true);
            pluginGeneratedSerialDescriptor.i(Include.INCLUDE_CHANNEL_PARAM_VALUE, true);
            pluginGeneratedSerialDescriptor.i("last_active_minutes", true);
            pluginGeneratedSerialDescriptor.i("user_id", false);
            pluginGeneratedSerialDescriptor.i("name", false);
            pluginGeneratedSerialDescriptor.i("username", false);
            pluginGeneratedSerialDescriptor.i("photo_url", false);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            g1 g1Var = g1.b;
            e0 e0Var = e0.b;
            return new KSerializer[]{m0.r.t.a.r.m.a1.a.R1(h.b), m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(e0Var), e0Var, m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(g1Var)};
        }

        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder r19) {
            /*
                r18 = this;
                r0 = r19
                java.lang.String r1 = "decoder"
                m0.n.b.i.e(r0, r1)
                kotlinx.serialization.descriptors.SerialDescriptor r1 = b
                n0.c.j.c r0 = r0.c(r1)
                boolean r2 = r0.y()
                r3 = 6
                r4 = 5
                r5 = 0
                r6 = 4
                r7 = 3
                r8 = 7
                r9 = 0
                r10 = 1
                r11 = 2
                if (r2 == 0) goto L_0x0047
                n0.c.k.h r2 = n0.c.k.h.b
                java.lang.Object r2 = r0.v(r1, r9, r2, r5)
                n0.c.k.g1 r9 = n0.c.k.g1.b
                java.lang.Object r10 = r0.v(r1, r10, r9, r5)
                java.lang.Object r11 = r0.v(r1, r11, r9, r5)
                n0.c.k.e0 r12 = n0.c.k.e0.b
                java.lang.Object r7 = r0.v(r1, r7, r12, r5)
                int r6 = r0.k(r1, r6)
                java.lang.Object r4 = r0.v(r1, r4, r9, r5)
                java.lang.Object r3 = r0.v(r1, r3, r9, r5)
                java.lang.Object r5 = r0.v(r1, r8, r9, r5)
                r8 = 255(0xff, float:3.57E-43)
                r12 = r6
                goto L_0x00be
            L_0x0047:
                r2 = r5
                r12 = r2
                r13 = r12
                r14 = r13
                r15 = r14
                r16 = r9
                r17 = r10
                r10 = r16
                r9 = r15
            L_0x0053:
                if (r17 == 0) goto L_0x00b5
                int r11 = r0.x(r1)
                switch(r11) {
                    case -1: goto L_0x00b0;
                    case 0: goto L_0x00a5;
                    case 1: goto L_0x009a;
                    case 2: goto L_0x0090;
                    case 3: goto L_0x0086;
                    case 4: goto L_0x007e;
                    case 5: goto L_0x0074;
                    case 6: goto L_0x006b;
                    case 7: goto L_0x0062;
                    default: goto L_0x005c;
                }
            L_0x005c:
                kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
                r0.<init>(r11)
                throw r0
            L_0x0062:
                n0.c.k.g1 r11 = n0.c.k.g1.b
                java.lang.Object r5 = r0.v(r1, r8, r11, r5)
                r10 = r10 | 128(0x80, float:1.794E-43)
                goto L_0x0084
            L_0x006b:
                n0.c.k.g1 r11 = n0.c.k.g1.b
                java.lang.Object r2 = r0.v(r1, r3, r11, r2)
                r10 = r10 | 64
                goto L_0x0084
            L_0x0074:
                n0.c.k.g1 r11 = n0.c.k.g1.b
                java.lang.Object r11 = r0.v(r1, r4, r11, r12)
                r10 = r10 | 32
                r12 = r11
                goto L_0x0084
            L_0x007e:
                int r16 = r0.k(r1, r6)
                r10 = r10 | 16
            L_0x0084:
                r3 = 0
                goto L_0x00b3
            L_0x0086:
                n0.c.k.e0 r11 = n0.c.k.e0.b
                java.lang.Object r14 = r0.v(r1, r7, r11, r14)
                r10 = r10 | 8
            L_0x008e:
                r11 = 2
                goto L_0x0053
            L_0x0090:
                n0.c.k.g1 r11 = n0.c.k.g1.b
                r3 = 2
                java.lang.Object r9 = r0.v(r1, r3, r11, r9)
                r10 = r10 | 4
                goto L_0x0084
            L_0x009a:
                r3 = 2
                n0.c.k.g1 r11 = n0.c.k.g1.b
                r3 = 1
                java.lang.Object r13 = r0.v(r1, r3, r11, r13)
                r10 = r10 | 2
                goto L_0x0084
            L_0x00a5:
                r3 = 1
                n0.c.k.h r11 = n0.c.k.h.b
                r3 = 0
                java.lang.Object r15 = r0.v(r1, r3, r11, r15)
                r10 = r10 | 1
                goto L_0x00b3
            L_0x00b0:
                r3 = 0
                r17 = r3
            L_0x00b3:
                r3 = 6
                goto L_0x008e
            L_0x00b5:
                r3 = r2
                r11 = r9
                r8 = r10
                r4 = r12
                r10 = r13
                r7 = r14
                r2 = r15
                r12 = r16
            L_0x00be:
                r0.b(r1)
                com.clubhouse.android.data.models.local.user.UserInStatus r0 = new com.clubhouse.android.data.models.local.user.UserInStatus
                r1 = r2
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                r9 = r10
                java.lang.String r9 = (java.lang.String) r9
                r10 = r11
                java.lang.String r10 = (java.lang.String) r10
                r11 = r7
                java.lang.Integer r11 = (java.lang.Integer) r11
                r13 = r4
                java.lang.String r13 = (java.lang.String) r13
                r14 = r3
                java.lang.String r14 = (java.lang.String) r14
                r15 = r5
                java.lang.String r15 = (java.lang.String) r15
                r6 = r0
                r7 = r8
                r8 = r1
                r6.<init>((int) r7, (java.lang.Boolean) r8, (java.lang.String) r9, (java.lang.String) r10, (java.lang.Integer) r11, (int) r12, (java.lang.String) r13, (java.lang.String) r14, (java.lang.String) r15)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.models.local.user.UserInStatus.a.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            UserInStatus userInStatus = (UserInStatus) obj;
            i.e(encoder, "encoder");
            i.e(userInStatus, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(userInStatus, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            boolean z = false;
            if (c.v(serialDescriptor, 0) || userInStatus.c != null) {
                c.l(serialDescriptor, 0, h.b, userInStatus.c);
            }
            if (c.v(serialDescriptor, 1) || userInStatus.d != null) {
                c.l(serialDescriptor, 1, g1.b, userInStatus.d);
            }
            if (c.v(serialDescriptor, 2) || userInStatus.q != null) {
                c.l(serialDescriptor, 2, g1.b, userInStatus.q);
            }
            if (c.v(serialDescriptor, 3) || userInStatus.x != null) {
                z = true;
            }
            if (z) {
                c.l(serialDescriptor, 3, e0.b, userInStatus.x);
            }
            c.q(serialDescriptor, 4, userInStatus.getId().intValue());
            g1 g1Var = g1.b;
            c.l(serialDescriptor, 5, g1Var, userInStatus.Y1);
            c.l(serialDescriptor, 6, g1Var, userInStatus.Z1);
            c.l(serialDescriptor, 7, g1Var, userInStatus.a2);
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    /* compiled from: UserInStatus.kt */
    public static final class b implements Parcelable.Creator<UserInStatus> {
        public Object createFromParcel(Parcel parcel) {
            Boolean bool;
            i.e(parcel, "parcel");
            if (parcel.readInt() == 0) {
                bool = null;
            } else {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new UserInStatus(bool, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public Object[] newArray(int i) {
            return new UserInStatus[i];
        }
    }

    public UserInStatus(int i, Boolean bool, String str, String str2, Integer num, int i2, String str3, String str4, String str5) {
        if (240 == (i & 240)) {
            if ((i & 1) == 0) {
                this.c = null;
            } else {
                this.c = bool;
            }
            if ((i & 2) == 0) {
                this.d = null;
            } else {
                this.d = str;
            }
            if ((i & 4) == 0) {
                this.q = null;
            } else {
                this.q = str2;
            }
            if ((i & 8) == 0) {
                this.x = null;
            } else {
                this.x = num;
            }
            this.y = i2;
            this.Y1 = str3;
            this.Z1 = str4;
            this.a2 = str5;
            return;
        }
        a aVar = a.a;
        m0.r.t.a.r.m.a1.a.W3(i, 240, a.b);
        throw null;
    }

    public static UserInStatus a(UserInStatus userInStatus, Boolean bool, String str, String str2, Integer num, int i, String str3, String str4, String str5, int i2) {
        UserInStatus userInStatus2 = userInStatus;
        int i3 = i2;
        String str6 = null;
        Boolean bool2 = (i3 & 1) != 0 ? userInStatus2.c : null;
        String str7 = (i3 & 2) != 0 ? userInStatus2.d : null;
        String str8 = (i3 & 4) != 0 ? userInStatus2.q : null;
        Integer num2 = (i3 & 8) != 0 ? userInStatus2.x : num;
        int intValue = (i3 & 16) != 0 ? userInStatus.getId().intValue() : i;
        String str9 = (i3 & 32) != 0 ? userInStatus2.Y1 : null;
        String str10 = (i3 & 64) != 0 ? userInStatus2.Z1 : null;
        if ((i3 & 128) != 0) {
            str6 = userInStatus2.a2;
        }
        return new UserInStatus(bool2, str7, str8, num2, intValue, str9, str10, str6);
    }

    public String C() {
        return this.Z1;
    }

    public String F() {
        return h0.b0.v.f0(this);
    }

    public String I() {
        return h0.b0.v.O0(this);
    }

    public String b() {
        return this.a2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserInStatus)) {
            return false;
        }
        UserInStatus userInStatus = (UserInStatus) obj;
        return i.a(this.c, userInStatus.c) && i.a(this.d, userInStatus.d) && i.a(this.q, userInStatus.q) && i.a(this.x, userInStatus.x) && getId().intValue() == userInStatus.getId().intValue() && i.a(this.Y1, userInStatus.Y1) && i.a(this.Z1, userInStatus.Z1) && i.a(this.a2, userInStatus.a2);
    }

    public String getName() {
        return this.Y1;
    }

    public int hashCode() {
        int i;
        int i2;
        Boolean bool = this.c;
        int i3 = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.q;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.x;
        int hashCode4 = (getId().hashCode() + ((hashCode3 + (num == null ? 0 : num.hashCode())) * 31)) * 31;
        String str3 = this.Y1;
        if (str3 == null) {
            i = 0;
        } else {
            i = str3.hashCode();
        }
        int i4 = (hashCode4 + i) * 31;
        String str4 = this.Z1;
        if (str4 == null) {
            i2 = 0;
        } else {
            i2 = str4.hashCode();
        }
        int i5 = (i4 + i2) * 31;
        String str5 = this.a2;
        if (str5 != null) {
            i3 = str5.hashCode();
        }
        return i5 + i3;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("UserInStatus(isSpeaker=");
        P0.append(this.c);
        P0.append(", topic=");
        P0.append(this.d);
        P0.append(", channel=");
        P0.append(this.q);
        P0.append(", lastActiveMinutes=");
        P0.append(this.x);
        P0.append(", id=");
        P0.append(getId().intValue());
        P0.append(", name=");
        P0.append(this.Y1);
        P0.append(", username=");
        P0.append(this.Z1);
        P0.append(", photoUrl=");
        return i0.d.a.a.a.w0(P0, this.a2, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        Boolean bool = this.c;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.d);
        parcel.writeString(this.q);
        Integer num = this.x;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            i0.d.a.a.a.i(parcel, 1, num);
        }
        parcel.writeInt(this.y);
        parcel.writeString(this.Y1);
        parcel.writeString(this.Z1);
        parcel.writeString(this.a2);
    }

    public Integer getId() {
        return Integer.valueOf(this.y);
    }

    public UserInStatus(Boolean bool, String str, String str2, Integer num, int i, String str3, String str4, String str5) {
        this.c = bool;
        this.d = str;
        this.q = str2;
        this.x = num;
        this.y = i;
        this.Y1 = str3;
        this.Z1 = str4;
        this.a2 = str5;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UserInStatus(Boolean bool, String str, String str2, Integer num, int i, String str3, String str4, String str5, int i2) {
        this((Boolean) null, (String) null, (String) null, (Integer) null, i, str3, str4, str5);
        int i3 = i2 & 1;
        int i4 = i2 & 2;
        int i5 = i2 & 4;
        int i6 = i2 & 8;
    }
}
