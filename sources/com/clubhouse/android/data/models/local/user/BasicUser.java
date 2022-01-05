package com.clubhouse.android.data.models.local.user;

import android.os.Parcel;
import android.os.Parcelable;
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
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: BasicUser.kt */
public final class BasicUser implements User {
    public static final Parcelable.Creator<BasicUser> CREATOR = new b();
    public static final Companion Companion = new Companion((f) null);
    public final int c;
    public final String d;
    public final String q;
    public final String x;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/local/user/BasicUser$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/local/user/BasicUser;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: BasicUser.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<BasicUser> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: BasicUser.kt */
    public static final class a implements v<BasicUser> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.local.user.BasicUser", aVar, 4);
            pluginGeneratedSerialDescriptor.i("user_id", true);
            pluginGeneratedSerialDescriptor.i("name", true);
            pluginGeneratedSerialDescriptor.i("username", true);
            pluginGeneratedSerialDescriptor.i("photo_url", true);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            g1 g1Var = g1.b;
            return new KSerializer[]{e0.b, m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(g1Var)};
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
                r3 = 3
                r4 = 0
                r5 = 0
                r6 = 1
                r7 = 2
                if (r2 == 0) goto L_0x002f
                int r2 = r0.k(r1, r5)
                n0.c.k.g1 r5 = n0.c.k.g1.b
                java.lang.Object r6 = r0.v(r1, r6, r5, r4)
                java.lang.Object r7 = r0.v(r1, r7, r5, r4)
                java.lang.Object r3 = r0.v(r1, r3, r5, r4)
                r4 = 15
                r14 = r2
                r13 = r4
                goto L_0x0075
            L_0x002f:
                r8 = r4
                r9 = r8
                r10 = r9
                r2 = r5
                r4 = r2
                r11 = r6
            L_0x0035:
                if (r11 == 0) goto L_0x0070
                int r12 = r0.x(r1)
                r13 = -1
                if (r12 == r13) goto L_0x006e
                if (r12 == 0) goto L_0x0067
                if (r12 == r6) goto L_0x005e
                if (r12 == r7) goto L_0x0055
                if (r12 != r3) goto L_0x004f
                n0.c.k.g1 r12 = n0.c.k.g1.b
                java.lang.Object r10 = r0.v(r1, r3, r12, r10)
                r4 = r4 | 8
                goto L_0x0035
            L_0x004f:
                kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
                r0.<init>(r12)
                throw r0
            L_0x0055:
                n0.c.k.g1 r12 = n0.c.k.g1.b
                java.lang.Object r9 = r0.v(r1, r7, r12, r9)
                r4 = r4 | 4
                goto L_0x0035
            L_0x005e:
                n0.c.k.g1 r12 = n0.c.k.g1.b
                java.lang.Object r8 = r0.v(r1, r6, r12, r8)
                r4 = r4 | 2
                goto L_0x0035
            L_0x0067:
                int r2 = r0.k(r1, r5)
                r4 = r4 | 1
                goto L_0x0035
            L_0x006e:
                r11 = r5
                goto L_0x0035
            L_0x0070:
                r14 = r2
                r13 = r4
                r6 = r8
                r7 = r9
                r3 = r10
            L_0x0075:
                r0.b(r1)
                com.clubhouse.android.data.models.local.user.BasicUser r0 = new com.clubhouse.android.data.models.local.user.BasicUser
                r15 = r6
                java.lang.String r15 = (java.lang.String) r15
                r16 = r7
                java.lang.String r16 = (java.lang.String) r16
                r17 = r3
                java.lang.String r17 = (java.lang.String) r17
                r12 = r0
                r12.<init>((int) r13, (int) r14, (java.lang.String) r15, (java.lang.String) r16, (java.lang.String) r17)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.models.local.user.BasicUser.a.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            BasicUser basicUser = (BasicUser) obj;
            i.e(encoder, "encoder");
            i.e(basicUser, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(basicUser, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            boolean z = false;
            if (c.v(serialDescriptor, 0) || basicUser.getId().intValue() != 0) {
                c.q(serialDescriptor, 0, basicUser.getId().intValue());
            }
            if (c.v(serialDescriptor, 1) || basicUser.d != null) {
                c.l(serialDescriptor, 1, g1.b, basicUser.d);
            }
            if (c.v(serialDescriptor, 2) || basicUser.q != null) {
                c.l(serialDescriptor, 2, g1.b, basicUser.q);
            }
            if (c.v(serialDescriptor, 3) || basicUser.x != null) {
                z = true;
            }
            if (z) {
                c.l(serialDescriptor, 3, g1.b, basicUser.x);
            }
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    /* compiled from: BasicUser.kt */
    public static final class b implements Parcelable.Creator<BasicUser> {
        public Object createFromParcel(Parcel parcel) {
            i.e(parcel, "parcel");
            return new BasicUser(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public Object[] newArray(int i) {
            return new BasicUser[i];
        }
    }

    public BasicUser() {
        this(0, (String) null, (String) null, (String) null, 15);
    }

    public BasicUser(int i, int i2, String str, String str2, String str3) {
        if ((i & 0) == 0) {
            if ((i & 1) == 0) {
                this.c = 0;
            } else {
                this.c = i2;
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
                this.x = str3;
            }
        } else {
            a aVar = a.a;
            m0.r.t.a.r.m.a1.a.W3(i, 0, a.b);
            throw null;
        }
    }

    public static BasicUser a(BasicUser basicUser, int i, String str, String str2, String str3, int i2) {
        if ((i2 & 1) != 0) {
            i = basicUser.getId().intValue();
        }
        String str4 = null;
        String str5 = (i2 & 2) != 0 ? basicUser.d : null;
        if ((i2 & 4) != 0) {
            str4 = basicUser.q;
        }
        if ((i2 & 8) != 0) {
            str3 = basicUser.x;
        }
        Objects.requireNonNull(basicUser);
        return new BasicUser(i, str5, str4, str3);
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
        if (!(obj instanceof BasicUser)) {
            return false;
        }
        BasicUser basicUser = (BasicUser) obj;
        return getId().intValue() == basicUser.getId().intValue() && i.a(this.d, basicUser.d) && i.a(this.q, basicUser.q) && i.a(this.x, basicUser.x);
    }

    public String getName() {
        return this.d;
    }

    public int hashCode() {
        int i;
        int i2;
        int hashCode = getId().hashCode() * 31;
        String str = this.d;
        int i3 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i4 = (hashCode + i) * 31;
        String str2 = this.q;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i5 = (i4 + i2) * 31;
        String str3 = this.x;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return i5 + i3;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("BasicUser(id=");
        P0.append(getId().intValue());
        P0.append(", name=");
        P0.append(this.d);
        P0.append(", username=");
        P0.append(this.q);
        P0.append(", photoUrl=");
        return i0.d.a.a.a.w0(P0, this.x, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.q);
        parcel.writeString(this.x);
    }

    public Integer getId() {
        return Integer.valueOf(this.c);
    }

    public BasicUser(int i, String str, String str2, String str3) {
        this.c = i;
        this.d = str;
        this.q = str2;
        this.x = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BasicUser(int i, String str, String str2, String str3, int i2) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : str, (String) null, (String) null);
        int i3 = i2 & 4;
        int i4 = i2 & 8;
    }
}
