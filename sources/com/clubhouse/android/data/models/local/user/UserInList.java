package com.clubhouse.android.data.models.local.user;

import android.os.Parcel;
import android.os.Parcelable;
import com.clubhouse.android.user.model.User;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
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
import n0.c.k.h0;
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: UserInList.kt */
public final class UserInList implements User, i0.e.b.b3.a.a.b {
    public static final Parcelable.Creator<UserInList> CREATOR = new b();
    public static final Companion Companion = new Companion((f) null);
    public final String Y1;
    public final String Z1;
    public final String a2;
    public final Map<String, Object> b2;
    public final String c;
    public final Integer d;
    public final String q;
    public final int x;
    public final String y;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/local/user/UserInList$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/local/user/UserInList;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: UserInList.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<UserInList> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: UserInList.kt */
    public static final class a implements v<UserInList> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.local.user.UserInList", aVar, 9);
            pluginGeneratedSerialDescriptor.i("bio", true);
            pluginGeneratedSerialDescriptor.i("last_active_minutes", true);
            pluginGeneratedSerialDescriptor.i("twitter", true);
            pluginGeneratedSerialDescriptor.i("user_id", false);
            pluginGeneratedSerialDescriptor.i("name", false);
            pluginGeneratedSerialDescriptor.i("username", false);
            pluginGeneratedSerialDescriptor.i("photo_url", false);
            pluginGeneratedSerialDescriptor.i("reason", true);
            pluginGeneratedSerialDescriptor.i("logging_context", true);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            g1 g1Var = g1.b;
            e0 e0Var = e0.b;
            return new KSerializer[]{m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(e0Var), m0.r.t.a.r.m.a1.a.R1(g1Var), e0Var, m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(new h0(g1Var, i0.e.b.b3.a.b.c.a.a))};
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0089, code lost:
            r14 = r5;
            r4 = r16;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x00d1, code lost:
            r5 = r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x00d2, code lost:
            r4 = r16;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x00e3, code lost:
            r14 = r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x00ea, code lost:
            r4 = r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x00eb, code lost:
            r16 = r4;
            r4 = 8;
         */
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
                r3 = 0
                r4 = 8
                r5 = 3
                r6 = 5
                r7 = 6
                r8 = 7
                r9 = 0
                r10 = 1
                r11 = 2
                r12 = 4
                if (r2 == 0) goto L_0x0054
                n0.c.k.g1 r2 = n0.c.k.g1.b
                java.lang.Object r9 = r0.v(r1, r9, r2, r3)
                n0.c.k.e0 r13 = n0.c.k.e0.b
                java.lang.Object r10 = r0.v(r1, r10, r13, r3)
                java.lang.Object r11 = r0.v(r1, r11, r2, r3)
                int r5 = r0.k(r1, r5)
                java.lang.Object r12 = r0.v(r1, r12, r2, r3)
                java.lang.Object r6 = r0.v(r1, r6, r2, r3)
                java.lang.Object r7 = r0.v(r1, r7, r2, r3)
                java.lang.Object r8 = r0.v(r1, r8, r2, r3)
                n0.c.k.h0 r13 = new n0.c.k.h0
                i0.e.b.b3.a.b.c.a r14 = i0.e.b.b3.a.b.c.a.a
                r13.<init>(r2, r14)
                java.lang.Object r2 = r0.v(r1, r4, r13, r3)
                r3 = 511(0x1ff, float:7.16E-43)
                r4 = r3
                r17 = r5
                goto L_0x00fe
            L_0x0054:
                r2 = r3
                r11 = r2
                r13 = r11
                r15 = r13
                r16 = r15
                r14 = r9
                r17 = r14
                r18 = r10
                r9 = r16
                r10 = r9
            L_0x0062:
                if (r18 == 0) goto L_0x00f3
                int r5 = r0.x(r1)
                switch(r5) {
                    case -1: goto L_0x00e5;
                    case 0: goto L_0x00d6;
                    case 1: goto L_0x00c6;
                    case 2: goto L_0x00bb;
                    case 3: goto L_0x00b2;
                    case 4: goto L_0x00a8;
                    case 5: goto L_0x009c;
                    case 6: goto L_0x008f;
                    case 7: goto L_0x0081;
                    case 8: goto L_0x0071;
                    default: goto L_0x006b;
                }
            L_0x006b:
                kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
                r0.<init>(r5)
                throw r0
            L_0x0071:
                n0.c.k.h0 r5 = new n0.c.k.h0
                n0.c.k.g1 r12 = n0.c.k.g1.b
                i0.e.b.b3.a.b.c.a r6 = i0.e.b.b3.a.b.c.a.a
                r5.<init>(r12, r6)
                java.lang.Object r11 = r0.v(r1, r4, r5, r11)
                r5 = r14 | 256(0x100, float:3.59E-43)
                goto L_0x0089
            L_0x0081:
                n0.c.k.g1 r5 = n0.c.k.g1.b
                java.lang.Object r3 = r0.v(r1, r8, r5, r3)
                r5 = r14 | 128(0x80, float:1.794E-43)
            L_0x0089:
                r14 = r5
                r4 = r16
                r6 = 0
                r12 = 4
                goto L_0x00eb
            L_0x008f:
                n0.c.k.g1 r5 = n0.c.k.g1.b
                java.lang.Object r2 = r0.v(r1, r7, r5, r2)
                r14 = r14 | 64
                r5 = r16
                r6 = 0
                r12 = 4
                goto L_0x00ea
            L_0x009c:
                n0.c.k.g1 r5 = n0.c.k.g1.b
                r6 = 5
                java.lang.Object r13 = r0.v(r1, r6, r5, r13)
                r14 = r14 | 32
                r5 = 3
                r12 = 4
                goto L_0x0062
            L_0x00a8:
                n0.c.k.g1 r5 = n0.c.k.g1.b
                r12 = 4
                java.lang.Object r10 = r0.v(r1, r12, r5, r10)
                r5 = r14 | 16
                goto L_0x00d2
            L_0x00b2:
                r5 = 3
                int r17 = r0.k(r1, r5)
                r14 = r14 | 8
                r5 = r14
                goto L_0x00d2
            L_0x00bb:
                r5 = 3
                n0.c.k.g1 r4 = n0.c.k.g1.b
                r6 = 2
                java.lang.Object r9 = r0.v(r1, r6, r4, r9)
                r4 = r14 | 4
                goto L_0x00d1
            L_0x00c6:
                r5 = 3
                r6 = 2
                n0.c.k.e0 r4 = n0.c.k.e0.b
                r6 = 1
                java.lang.Object r15 = r0.v(r1, r6, r4, r15)
                r4 = r14 | 2
            L_0x00d1:
                r5 = r4
            L_0x00d2:
                r4 = r16
                r6 = 0
                goto L_0x00e3
            L_0x00d6:
                r5 = 3
                r6 = 1
                n0.c.k.g1 r4 = n0.c.k.g1.b
                r5 = r16
                r6 = 0
                java.lang.Object r4 = r0.v(r1, r6, r4, r5)
                r5 = r14 | 1
            L_0x00e3:
                r14 = r5
                goto L_0x00eb
            L_0x00e5:
                r5 = r16
                r6 = 0
                r18 = r6
            L_0x00ea:
                r4 = r5
            L_0x00eb:
                r16 = r4
                r4 = 8
                r5 = 3
                r6 = 5
                goto L_0x0062
            L_0x00f3:
                r5 = r16
                r7 = r2
                r8 = r3
                r12 = r10
                r2 = r11
                r6 = r13
                r4 = r14
                r10 = r15
                r11 = r9
                r9 = r5
            L_0x00fe:
                r0.b(r1)
                com.clubhouse.android.data.models.local.user.UserInList r0 = new com.clubhouse.android.data.models.local.user.UserInList
                r5 = r9
                java.lang.String r5 = (java.lang.String) r5
                r1 = r10
                java.lang.Integer r1 = (java.lang.Integer) r1
                r9 = r11
                java.lang.String r9 = (java.lang.String) r9
                r10 = r12
                java.lang.String r10 = (java.lang.String) r10
                r11 = r6
                java.lang.String r11 = (java.lang.String) r11
                r12 = r7
                java.lang.String r12 = (java.lang.String) r12
                r13 = r8
                java.lang.String r13 = (java.lang.String) r13
                java.util.Map r2 = (java.util.Map) r2
                r3 = r0
                r6 = r1
                r7 = r9
                r8 = r17
                r9 = r10
                r10 = r11
                r11 = r12
                r12 = r13
                r13 = r2
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.models.local.user.UserInList.a.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            UserInList userInList = (UserInList) obj;
            i.e(encoder, "encoder");
            i.e(userInList, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(userInList, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            boolean z = false;
            if (c.v(serialDescriptor, 0) || userInList.c != null) {
                c.l(serialDescriptor, 0, g1.b, userInList.c);
            }
            if (c.v(serialDescriptor, 1) || userInList.d != null) {
                c.l(serialDescriptor, 1, e0.b, userInList.d);
            }
            if (c.v(serialDescriptor, 2) || userInList.q != null) {
                c.l(serialDescriptor, 2, g1.b, userInList.q);
            }
            c.q(serialDescriptor, 3, userInList.getId().intValue());
            g1 g1Var = g1.b;
            c.l(serialDescriptor, 4, g1Var, userInList.y);
            c.l(serialDescriptor, 5, g1Var, userInList.Y1);
            c.l(serialDescriptor, 6, g1Var, userInList.Z1);
            if (c.v(serialDescriptor, 7) || userInList.a2 != null) {
                c.l(serialDescriptor, 7, g1Var, userInList.a2);
            }
            if (c.v(serialDescriptor, 8) || userInList.b2 != null) {
                z = true;
            }
            if (z) {
                c.l(serialDescriptor, 8, new h0(g1Var, i0.e.b.b3.a.b.c.a.a), userInList.b2);
            }
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    /* compiled from: UserInList.kt */
    public static final class b implements Parcelable.Creator<UserInList> {
        public Object createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            i.e(parcel, "parcel");
            String readString = parcel.readString();
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt2 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt2);
                int i = 0;
                while (i != readInt2) {
                    i = i0.d.a.a.a.y(UserInList.class, parcel, linkedHashMap2, parcel.readString(), i, 1);
                    linkedHashMap2 = linkedHashMap2;
                }
                linkedHashMap = linkedHashMap2;
            }
            return new UserInList(readString, valueOf, readString2, readInt, readString3, readString4, readString5, readString6, linkedHashMap);
        }

        public Object[] newArray(int i) {
            return new UserInList[i];
        }
    }

    public UserInList(int i, String str, Integer num, String str2, int i2, String str3, String str4, String str5, String str6, Map map) {
        if (120 == (i & 120)) {
            if ((i & 1) == 0) {
                this.c = null;
            } else {
                this.c = str;
            }
            if ((i & 2) == 0) {
                this.d = null;
            } else {
                this.d = num;
            }
            if ((i & 4) == 0) {
                this.q = null;
            } else {
                this.q = str2;
            }
            this.x = i2;
            this.y = str3;
            this.Y1 = str4;
            this.Z1 = str5;
            if ((i & 128) == 0) {
                this.a2 = null;
            } else {
                this.a2 = str6;
            }
            if ((i & 256) == 0) {
                this.b2 = null;
            } else {
                this.b2 = map;
            }
        } else {
            a aVar = a.a;
            m0.r.t.a.r.m.a1.a.W3(i, 120, a.b);
            throw null;
        }
    }

    public String C() {
        return this.Y1;
    }

    public String F() {
        return h0.b0.v.f0(this);
    }

    public String I() {
        return h0.b0.v.O0(this);
    }

    public String a() {
        return this.a2;
    }

    public String b() {
        return this.Z1;
    }

    public Map<String, Object> c() {
        return this.b2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserInList)) {
            return false;
        }
        UserInList userInList = (UserInList) obj;
        return i.a(this.c, userInList.c) && i.a(this.d, userInList.d) && i.a(this.q, userInList.q) && getId().intValue() == userInList.getId().intValue() && i.a(this.y, userInList.y) && i.a(this.Y1, userInList.Y1) && i.a(this.Z1, userInList.Z1) && i.a(this.a2, userInList.a2) && i.a(this.b2, userInList.b2);
    }

    public String getName() {
        return this.y;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        String str = this.c;
        int i5 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.d;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.q;
        int hashCode3 = (getId().hashCode() + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.y;
        if (str3 == null) {
            i = 0;
        } else {
            i = str3.hashCode();
        }
        int i6 = (hashCode3 + i) * 31;
        String str4 = this.Y1;
        if (str4 == null) {
            i2 = 0;
        } else {
            i2 = str4.hashCode();
        }
        int i7 = (i6 + i2) * 31;
        String str5 = this.Z1;
        if (str5 == null) {
            i3 = 0;
        } else {
            i3 = str5.hashCode();
        }
        int i8 = (i7 + i3) * 31;
        String str6 = this.a2;
        if (str6 == null) {
            i4 = 0;
        } else {
            i4 = str6.hashCode();
        }
        int i9 = (i8 + i4) * 31;
        Map<String, Object> map = this.b2;
        if (map != null) {
            i5 = map.hashCode();
        }
        return i9 + i5;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("UserInList(bio=");
        P0.append(this.c);
        P0.append(", lastActiveMinutes=");
        P0.append(this.d);
        P0.append(", twitter=");
        P0.append(this.q);
        P0.append(", id=");
        P0.append(getId().intValue());
        P0.append(", name=");
        P0.append(this.y);
        P0.append(", username=");
        P0.append(this.Y1);
        P0.append(", photoUrl=");
        P0.append(this.Z1);
        P0.append(", reason=");
        P0.append(this.a2);
        P0.append(", loggingContext=");
        return i0.d.a.a.a.B0(P0, this.b2, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        parcel.writeString(this.c);
        Integer num = this.d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            i0.d.a.a.a.i(parcel, 1, num);
        }
        parcel.writeString(this.q);
        parcel.writeInt(this.x);
        parcel.writeString(this.y);
        parcel.writeString(this.Y1);
        parcel.writeString(this.Z1);
        parcel.writeString(this.a2);
        Map<String, Object> map = this.b2;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator l1 = i0.d.a.a.a.l1(parcel, 1, map);
        while (l1.hasNext()) {
            Map.Entry entry = (Map.Entry) l1.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeValue(entry.getValue());
        }
    }

    public Integer getId() {
        return Integer.valueOf(this.x);
    }

    public UserInList(String str, Integer num, String str2, int i, String str3, String str4, String str5, String str6, Map<String, ? extends Object> map) {
        this.c = str;
        this.d = num;
        this.q = str2;
        this.x = i;
        this.y = str3;
        this.Y1 = str4;
        this.Z1 = str5;
        this.a2 = str6;
        this.b2 = map;
    }
}
