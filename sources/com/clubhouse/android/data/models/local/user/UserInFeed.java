package com.clubhouse.android.data.models.local.user;

import android.os.Parcel;
import android.os.Parcelable;
import com.clubhouse.android.user.model.UserInRoom;
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
import n0.c.k.h;
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: UserInFeed.kt */
public final class UserInFeed implements UserInRoom {
    public static final Parcelable.Creator<UserInFeed> CREATOR = new b();
    public static final Companion Companion = new Companion((f) null);
    public final boolean c;
    public final int d;
    public final String q;
    public final String x;
    public final String y;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/local/user/UserInFeed$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/local/user/UserInFeed;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: UserInFeed.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<UserInFeed> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: UserInFeed.kt */
    public static final class a implements v<UserInFeed> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.local.user.UserInFeed", aVar, 5);
            pluginGeneratedSerialDescriptor.i("is_speaker", false);
            pluginGeneratedSerialDescriptor.i("user_id", false);
            pluginGeneratedSerialDescriptor.i("name", false);
            pluginGeneratedSerialDescriptor.i("username", true);
            pluginGeneratedSerialDescriptor.i("photo_url", false);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            g1 g1Var = g1.b;
            return new KSerializer[]{h.b, e0.b, m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(g1Var)};
        }

        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder r22) {
            /*
                r21 = this;
                r0 = r22
                java.lang.String r1 = "decoder"
                m0.n.b.i.e(r0, r1)
                kotlinx.serialization.descriptors.SerialDescriptor r1 = b
                n0.c.j.c r0 = r0.c(r1)
                boolean r2 = r0.y()
                r3 = 3
                r4 = 0
                r5 = 0
                r6 = 1
                r7 = 2
                r8 = 4
                if (r2 == 0) goto L_0x0038
                boolean r2 = r0.s(r1, r5)
                int r5 = r0.k(r1, r6)
                n0.c.k.g1 r6 = n0.c.k.g1.b
                java.lang.Object r7 = r0.v(r1, r7, r6, r4)
                java.lang.Object r3 = r0.v(r1, r3, r6, r4)
                java.lang.Object r4 = r0.v(r1, r8, r6, r4)
                r6 = 31
                r16 = r2
                r17 = r5
                r15 = r6
                goto L_0x008a
            L_0x0038:
                r9 = r4
                r10 = r9
                r2 = r5
                r11 = r2
                r12 = r11
                r13 = r6
            L_0x003e:
                if (r13 == 0) goto L_0x0082
                int r14 = r0.x(r1)
                r15 = -1
                if (r14 == r15) goto L_0x0080
                if (r14 == 0) goto L_0x0079
                if (r14 == r6) goto L_0x0072
                if (r14 == r7) goto L_0x0069
                if (r14 == r3) goto L_0x0060
                if (r14 != r8) goto L_0x005a
                n0.c.k.g1 r14 = n0.c.k.g1.b
                java.lang.Object r10 = r0.v(r1, r8, r14, r10)
                r12 = r12 | 16
                goto L_0x003e
            L_0x005a:
                kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
                r0.<init>(r14)
                throw r0
            L_0x0060:
                n0.c.k.g1 r14 = n0.c.k.g1.b
                java.lang.Object r9 = r0.v(r1, r3, r14, r9)
                r12 = r12 | 8
                goto L_0x003e
            L_0x0069:
                n0.c.k.g1 r14 = n0.c.k.g1.b
                java.lang.Object r4 = r0.v(r1, r7, r14, r4)
                r12 = r12 | 4
                goto L_0x003e
            L_0x0072:
                int r11 = r0.k(r1, r6)
                r12 = r12 | 2
                goto L_0x003e
            L_0x0079:
                boolean r2 = r0.s(r1, r5)
                r12 = r12 | 1
                goto L_0x003e
            L_0x0080:
                r13 = r5
                goto L_0x003e
            L_0x0082:
                r16 = r2
                r7 = r4
                r3 = r9
                r4 = r10
                r17 = r11
                r15 = r12
            L_0x008a:
                r0.b(r1)
                com.clubhouse.android.data.models.local.user.UserInFeed r0 = new com.clubhouse.android.data.models.local.user.UserInFeed
                r18 = r7
                java.lang.String r18 = (java.lang.String) r18
                r19 = r3
                java.lang.String r19 = (java.lang.String) r19
                r20 = r4
                java.lang.String r20 = (java.lang.String) r20
                r14 = r0
                r14.<init>(r15, r16, r17, r18, r19, r20)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.models.local.user.UserInFeed.a.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            UserInFeed userInFeed = (UserInFeed) obj;
            i.e(encoder, "encoder");
            i.e(userInFeed, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(userInFeed, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            boolean z = false;
            c.r(serialDescriptor, 0, userInFeed.c);
            c.q(serialDescriptor, 1, userInFeed.getId().intValue());
            g1 g1Var = g1.b;
            c.l(serialDescriptor, 2, g1Var, userInFeed.q);
            if (c.v(serialDescriptor, 3) || userInFeed.x != null) {
                z = true;
            }
            if (z) {
                c.l(serialDescriptor, 3, g1Var, userInFeed.x);
            }
            c.l(serialDescriptor, 4, g1Var, userInFeed.y);
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    /* compiled from: UserInFeed.kt */
    public static final class b implements Parcelable.Creator<UserInFeed> {
        public Object createFromParcel(Parcel parcel) {
            i.e(parcel, "parcel");
            return new UserInFeed(parcel.readInt() != 0, parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public Object[] newArray(int i) {
            return new UserInFeed[i];
        }
    }

    public UserInFeed(int i, boolean z, int i2, String str, String str2, String str3) {
        if (23 == (i & 23)) {
            this.c = z;
            this.d = i2;
            this.q = str;
            if ((i & 8) == 0) {
                this.x = null;
            } else {
                this.x = str2;
            }
            this.y = str3;
            return;
        }
        a aVar = a.a;
        m0.r.t.a.r.m.a1.a.W3(i, 23, a.b);
        throw null;
    }

    public String C() {
        return this.x;
    }

    public String F() {
        i.e(this, "this");
        return h0.b0.v.f0(this);
    }

    public String I() {
        i.e(this, "this");
        return h0.b0.v.O0(this);
    }

    public boolean M() {
        return this.c;
    }

    public String b() {
        return this.y;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserInFeed)) {
            return false;
        }
        UserInFeed userInFeed = (UserInFeed) obj;
        return this.c == userInFeed.c && getId().intValue() == userInFeed.getId().intValue() && i.a(this.q, userInFeed.q) && i.a(this.x, userInFeed.x) && i.a(this.y, userInFeed.y);
    }

    public String getName() {
        return this.q;
    }

    public int hashCode() {
        int i;
        int i2;
        boolean z = this.c;
        if (z) {
            z = true;
        }
        int hashCode = (getId().hashCode() + ((z ? 1 : 0) * true)) * 31;
        String str = this.q;
        int i3 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i4 = (hashCode + i) * 31;
        String str2 = this.x;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i5 = (i4 + i2) * 31;
        String str3 = this.y;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return i5 + i3;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("UserInFeed(isSpeaker=");
        P0.append(this.c);
        P0.append(", id=");
        P0.append(getId().intValue());
        P0.append(", name=");
        P0.append(this.q);
        P0.append(", username=");
        P0.append(this.x);
        P0.append(", photoUrl=");
        return i0.d.a.a.a.w0(P0, this.y, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d);
        parcel.writeString(this.q);
        parcel.writeString(this.x);
        parcel.writeString(this.y);
    }

    public Integer getId() {
        return Integer.valueOf(this.d);
    }

    public UserInFeed(boolean z, int i, String str, String str2, String str3) {
        this.c = z;
        this.d = i;
        this.q = str;
        this.x = str2;
        this.y = str3;
    }
}
