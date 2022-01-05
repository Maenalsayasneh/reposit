package com.clubhouse.android.data.models.local.channel;

import android.os.Parcel;
import android.os.Parcelable;
import com.clubhouse.android.user.model.UserInRoom;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import j$.time.OffsetDateTime;
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
/* compiled from: UserInChannel.kt */
public final class UserInChannel implements UserInRoom {
    public static final Parcelable.Creator<UserInChannel> CREATOR = new b();
    public static final Companion Companion = new Companion((f) null);
    public final boolean Y1;
    public final boolean Z1;
    public final OffsetDateTime a2;
    public final boolean b2;
    public final String c;
    public final boolean c2;
    public final Integer d;
    public final int d2;
    public final String e2;
    public final String f2;
    public final String g2;
    public final String q;
    public final boolean x;
    public final String y;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/local/channel/UserInChannel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/local/channel/UserInChannel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: UserInChannel.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<UserInChannel> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: UserInChannel.kt */
    public static final class a implements v<UserInChannel> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.local.channel.UserInChannel", aVar, 14);
            pluginGeneratedSerialDescriptor.i("first_name", false);
            pluginGeneratedSerialDescriptor.i("skin_tone", true);
            pluginGeneratedSerialDescriptor.i("channel_emoji", true);
            pluginGeneratedSerialDescriptor.i("is_new", false);
            pluginGeneratedSerialDescriptor.i("bio_short", true);
            pluginGeneratedSerialDescriptor.i("is_speaker", false);
            pluginGeneratedSerialDescriptor.i("is_moderator", false);
            pluginGeneratedSerialDescriptor.i("time_joined_as_speaker", false);
            pluginGeneratedSerialDescriptor.i("is_followed_by_speaker", false);
            pluginGeneratedSerialDescriptor.i("is_invited_as_speaker", false);
            pluginGeneratedSerialDescriptor.i("user_id", false);
            pluginGeneratedSerialDescriptor.i("name", false);
            pluginGeneratedSerialDescriptor.i("username", false);
            pluginGeneratedSerialDescriptor.i("photo_url", false);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            g1 g1Var = g1.b;
            e0 e0Var = e0.b;
            h hVar = h.b;
            return new KSerializer[]{m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(e0Var), m0.r.t.a.r.m.a1.a.R1(g1Var), hVar, m0.r.t.a.r.m.a1.a.R1(g1Var), hVar, hVar, m0.r.t.a.r.m.a1.a.R1(new n0.c.a(m.a(OffsetDateTime.class), (KSerializer) null, new KSerializer[0])), hVar, hVar, e0Var, m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(g1Var)};
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x00fe, code lost:
            r10 = r21;
            r8 = r27;
            r11 = r28;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0127, code lost:
            r10 = r21;
            r8 = r27;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0155, code lost:
            r10 = r21;
            r8 = r27;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0195, code lost:
            r15 = r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x01a2, code lost:
            r28 = r11;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x01a4, code lost:
            r27 = r8;
            r21 = r10;
            r5 = 8;
            r8 = null;
            r11 = 6;
            r13 = 9;
            r14 = 13;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder r32) {
            /*
                r31 = this;
                r0 = r32
                java.lang.String r1 = "decoder"
                m0.n.b.i.e(r0, r1)
                kotlinx.serialization.descriptors.SerialDescriptor r1 = b
                n0.c.j.c r0 = r0.c(r1)
                boolean r2 = r0.y()
                r3 = 0
                r8 = 0
                r9 = 3
                r10 = 5
                r11 = 6
                r12 = 7
                r13 = 9
                r14 = 1
                r15 = 2
                r4 = 4
                r5 = 8
                if (r2 == 0) goto L_0x0086
                n0.c.k.g1 r2 = n0.c.k.g1.b
                java.lang.Object r17 = r0.v(r1, r3, r2, r8)
                n0.c.k.e0 r6 = n0.c.k.e0.b
                java.lang.Object r6 = r0.v(r1, r14, r6, r8)
                java.lang.Object r14 = r0.v(r1, r15, r2, r8)
                boolean r9 = r0.s(r1, r9)
                java.lang.Object r4 = r0.v(r1, r4, r2, r8)
                boolean r10 = r0.s(r1, r10)
                boolean r11 = r0.s(r1, r11)
                n0.c.a r15 = new n0.c.a
                java.lang.Class<j$.time.OffsetDateTime> r19 = j$.time.OffsetDateTime.class
                m0.r.d r7 = m0.n.b.m.a(r19)
                kotlinx.serialization.KSerializer[] r3 = new kotlinx.serialization.KSerializer[r3]
                r15.<init>(r7, r8, r3)
                java.lang.Object r3 = r0.v(r1, r12, r15, r8)
                boolean r5 = r0.s(r1, r5)
                boolean r7 = r0.s(r1, r13)
                r12 = 10
                int r12 = r0.k(r1, r12)
                r13 = 11
                java.lang.Object r13 = r0.v(r1, r13, r2, r8)
                r15 = 12
                java.lang.Object r15 = r0.v(r1, r15, r2, r8)
                r16 = r14
                r14 = 13
                java.lang.Object r2 = r0.v(r1, r14, r2, r8)
                r8 = 16383(0x3fff, float:2.2957E-41)
                r25 = r11
                r26 = r12
                r14 = r16
                r16 = r7
                r12 = r10
                r10 = r9
                r30 = r15
                r15 = r5
                r5 = r30
                goto L_0x01cb
            L_0x0086:
                r2 = r14
                r14 = 13
                r29 = r2
                r15 = r3
                r19 = r15
                r22 = r19
                r23 = r22
                r24 = r23
                r25 = r24
                r26 = r25
                r2 = r8
                r4 = r2
                r6 = r4
                r7 = r6
                r9 = r7
                r21 = r9
                r27 = r21
                r28 = r27
            L_0x00a3:
                if (r29 == 0) goto L_0x01b3
                int r10 = r0.x(r1)
                switch(r10) {
                    case -1: goto L_0x0197;
                    case 0: goto L_0x0183;
                    case 1: goto L_0x016e;
                    case 2: goto L_0x015a;
                    case 3: goto L_0x014a;
                    case 4: goto L_0x013b;
                    case 5: goto L_0x012e;
                    case 6: goto L_0x011f;
                    case 7: goto L_0x0107;
                    case 8: goto L_0x00f4;
                    case 9: goto L_0x00e9;
                    case 10: goto L_0x00de;
                    case 11: goto L_0x00d1;
                    case 12: goto L_0x00bc;
                    case 13: goto L_0x00b2;
                    default: goto L_0x00ac;
                }
            L_0x00ac:
                kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
                r0.<init>(r10)
                throw r0
            L_0x00b2:
                n0.c.k.g1 r10 = n0.c.k.g1.b
                java.lang.Object r6 = r0.v(r1, r14, r10, r6)
                r15 = r15 | 8192(0x2000, float:1.14794E-41)
                r10 = 5
                goto L_0x00a3
            L_0x00bc:
                n0.c.k.g1 r10 = n0.c.k.g1.b
                r14 = 12
                java.lang.Object r4 = r0.v(r1, r14, r10, r4)
                r15 = r15 | 4096(0x1000, float:5.74E-42)
                r10 = r21
                r8 = r27
                r11 = r28
                r13 = 4
                r14 = 11
                goto L_0x01a2
            L_0x00d1:
                r14 = 12
                n0.c.k.g1 r10 = n0.c.k.g1.b
                r14 = 11
                java.lang.Object r9 = r0.v(r1, r14, r10, r9)
                r15 = r15 | 2048(0x800, float:2.87E-42)
                goto L_0x00fe
            L_0x00de:
                r10 = 10
                r14 = 11
                int r26 = r0.k(r1, r10)
                r15 = r15 | 1024(0x400, float:1.435E-42)
                goto L_0x00fe
            L_0x00e9:
                r10 = 10
                r14 = 11
                boolean r22 = r0.s(r1, r13)
                r15 = r15 | 512(0x200, float:7.175E-43)
                goto L_0x00fe
            L_0x00f4:
                r10 = 10
                r14 = 11
                boolean r19 = r0.s(r1, r5)
                r15 = r15 | 256(0x100, float:3.59E-43)
            L_0x00fe:
                r10 = r21
                r8 = r27
                r11 = r28
                r13 = 4
                goto L_0x01a2
            L_0x0107:
                r10 = 10
                r14 = 11
                n0.c.a r5 = new n0.c.a
                java.lang.Class<j$.time.OffsetDateTime> r20 = j$.time.OffsetDateTime.class
                m0.r.d r10 = m0.n.b.m.a(r20)
                kotlinx.serialization.KSerializer[] r13 = new kotlinx.serialization.KSerializer[r3]
                r5.<init>(r10, r8, r13)
                java.lang.Object r7 = r0.v(r1, r12, r5, r7)
                r5 = r15 | 128(0x80, float:1.794E-43)
                goto L_0x0127
            L_0x011f:
                r14 = 11
                boolean r25 = r0.s(r1, r11)
                r5 = r15 | 64
            L_0x0127:
                r10 = r21
                r8 = r27
                r13 = 4
                goto L_0x0195
            L_0x012e:
                r5 = 5
                r14 = 11
                boolean r24 = r0.s(r1, r5)
                r10 = r15 | 32
                r15 = r10
                r10 = 3
                r13 = 4
                goto L_0x0155
            L_0x013b:
                r5 = 5
                r14 = 11
                n0.c.k.g1 r10 = n0.c.k.g1.b
                r13 = 4
                java.lang.Object r2 = r0.v(r1, r13, r10, r2)
                r10 = r15 | 16
                r15 = r10
                r10 = 3
                goto L_0x0155
            L_0x014a:
                r5 = 5
                r10 = 3
                r13 = 4
                r14 = 11
                boolean r23 = r0.s(r1, r10)
                r15 = r15 | 8
            L_0x0155:
                r10 = r21
                r8 = r27
                goto L_0x01a4
            L_0x015a:
                r10 = 3
                r13 = 4
                r14 = 11
                n0.c.k.g1 r5 = n0.c.k.g1.b
                r8 = r27
                r11 = 2
                java.lang.Object r27 = r0.v(r1, r11, r5, r8)
                r5 = r15 | 4
                r10 = r21
                r8 = r27
                goto L_0x0195
            L_0x016e:
                r8 = r27
                r10 = 3
                r11 = 2
                r13 = 4
                r14 = 11
                n0.c.k.e0 r5 = n0.c.k.e0.b
                r10 = r21
                r11 = 1
                java.lang.Object r21 = r0.v(r1, r11, r5, r10)
                r5 = r15 | 2
                r10 = r21
                goto L_0x0195
            L_0x0183:
                r10 = r21
                r8 = r27
                r11 = 1
                r13 = 4
                r14 = 11
                n0.c.k.g1 r5 = n0.c.k.g1.b
                r11 = r28
                java.lang.Object r28 = r0.v(r1, r3, r5, r11)
                r5 = r15 | 1
            L_0x0195:
                r15 = r5
                goto L_0x01a4
            L_0x0197:
                r10 = r21
                r8 = r27
                r11 = r28
                r13 = 4
                r14 = 11
                r29 = r3
            L_0x01a2:
                r28 = r11
            L_0x01a4:
                r27 = r8
                r21 = r10
                r5 = 8
                r8 = 0
                r10 = 5
                r11 = 6
                r13 = 9
                r14 = 13
                goto L_0x00a3
            L_0x01b3:
                r10 = r21
                r8 = r27
                r11 = r28
                r5 = r4
                r3 = r7
                r14 = r8
                r13 = r9
                r17 = r11
                r8 = r15
                r15 = r19
                r16 = r22
                r12 = r24
                r4 = r2
                r2 = r6
                r6 = r10
                r10 = r23
            L_0x01cb:
                r0.b(r1)
                com.clubhouse.android.data.models.local.channel.UserInChannel r0 = new com.clubhouse.android.data.models.local.channel.UserInChannel
                r7 = r17
                java.lang.String r7 = (java.lang.String) r7
                r1 = r6
                java.lang.Integer r1 = (java.lang.Integer) r1
                r9 = r14
                java.lang.String r9 = (java.lang.String) r9
                r11 = r4
                java.lang.String r11 = (java.lang.String) r11
                r14 = r3
                j$.time.OffsetDateTime r14 = (j$.time.OffsetDateTime) r14
                r18 = r13
                java.lang.String r18 = (java.lang.String) r18
                r19 = r5
                java.lang.String r19 = (java.lang.String) r19
                r20 = r2
                java.lang.String r20 = (java.lang.String) r20
                r5 = r0
                r6 = r8
                r8 = r1
                r13 = r25
                r17 = r26
                r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.models.local.channel.UserInChannel.a.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            UserInChannel userInChannel = (UserInChannel) obj;
            i.e(encoder, "encoder");
            i.e(userInChannel, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(userInChannel, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            g1 g1Var = g1.b;
            c.l(serialDescriptor, 0, g1Var, userInChannel.c);
            boolean z = true;
            if (c.v(serialDescriptor, 1) || userInChannel.d != null) {
                c.l(serialDescriptor, 1, e0.b, userInChannel.d);
            }
            if (c.v(serialDescriptor, 2) || userInChannel.q != null) {
                c.l(serialDescriptor, 2, g1Var, userInChannel.q);
            }
            c.r(serialDescriptor, 3, userInChannel.x);
            if (!c.v(serialDescriptor, 4) && userInChannel.y == null) {
                z = false;
            }
            if (z) {
                c.l(serialDescriptor, 4, g1Var, userInChannel.y);
            }
            c.r(serialDescriptor, 5, userInChannel.Y1);
            c.r(serialDescriptor, 6, userInChannel.Z1);
            c.l(serialDescriptor, 7, new n0.c.a(m.a(OffsetDateTime.class), (KSerializer) null, new KSerializer[0]), userInChannel.a2);
            c.r(serialDescriptor, 8, userInChannel.b2);
            c.r(serialDescriptor, 9, userInChannel.c2);
            c.q(serialDescriptor, 10, userInChannel.getId().intValue());
            c.l(serialDescriptor, 11, g1Var, userInChannel.e2);
            c.l(serialDescriptor, 12, g1Var, userInChannel.f2);
            c.l(serialDescriptor, 13, g1Var, userInChannel.g2);
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    /* compiled from: UserInChannel.kt */
    public static final class b implements Parcelable.Creator<UserInChannel> {
        public Object createFromParcel(Parcel parcel) {
            i.e(parcel, "parcel");
            return new UserInChannel(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, (OffsetDateTime) parcel.readSerializable(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public Object[] newArray(int i) {
            return new UserInChannel[i];
        }
    }

    public UserInChannel(int i, String str, Integer num, String str2, boolean z, String str3, boolean z2, boolean z3, OffsetDateTime offsetDateTime, boolean z4, boolean z5, int i2, String str4, String str5, String str6) {
        int i3 = i;
        if (16361 == (i3 & 16361)) {
            this.c = str;
            if ((i3 & 2) == 0) {
                this.d = null;
            } else {
                this.d = num;
            }
            if ((i3 & 4) == 0) {
                this.q = null;
            } else {
                this.q = str2;
            }
            this.x = z;
            if ((i3 & 16) == 0) {
                this.y = null;
            } else {
                this.y = str3;
            }
            this.Y1 = z2;
            this.Z1 = z3;
            this.a2 = offsetDateTime;
            this.b2 = z4;
            this.c2 = z5;
            this.d2 = i2;
            this.e2 = str4;
            this.f2 = str5;
            this.g2 = str6;
            return;
        }
        a aVar = a.a;
        m0.r.t.a.r.m.a1.a.W3(i, 16361, a.b);
        throw null;
    }

    public String C() {
        return this.f2;
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
        return this.Y1;
    }

    public String b() {
        return this.g2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserInChannel)) {
            return false;
        }
        UserInChannel userInChannel = (UserInChannel) obj;
        return i.a(this.c, userInChannel.c) && i.a(this.d, userInChannel.d) && i.a(this.q, userInChannel.q) && this.x == userInChannel.x && i.a(this.y, userInChannel.y) && this.Y1 == userInChannel.Y1 && this.Z1 == userInChannel.Z1 && i.a(this.a2, userInChannel.a2) && this.b2 == userInChannel.b2 && this.c2 == userInChannel.c2 && getId().intValue() == userInChannel.getId().intValue() && i.a(this.e2, userInChannel.e2) && i.a(this.f2, userInChannel.f2) && i.a(this.g2, userInChannel.g2);
    }

    public String getName() {
        return this.e2;
    }

    public int hashCode() {
        int i;
        int i2;
        String str = this.c;
        int i3 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.d;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.q;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        boolean z = this.x;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i4 = (hashCode3 + (z ? 1 : 0)) * 31;
        String str3 = this.y;
        int hashCode4 = (i4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        boolean z3 = this.Y1;
        if (z3) {
            z3 = true;
        }
        int i5 = (hashCode4 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.Z1;
        if (z4) {
            z4 = true;
        }
        int i6 = (i5 + (z4 ? 1 : 0)) * 31;
        OffsetDateTime offsetDateTime = this.a2;
        int hashCode5 = (i6 + (offsetDateTime == null ? 0 : offsetDateTime.hashCode())) * 31;
        boolean z5 = this.b2;
        if (z5) {
            z5 = true;
        }
        int i7 = (hashCode5 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.c2;
        if (!z6) {
            z2 = z6;
        }
        int hashCode6 = (getId().hashCode() + ((i7 + (z2 ? 1 : 0)) * 31)) * 31;
        String str4 = this.e2;
        if (str4 == null) {
            i = 0;
        } else {
            i = str4.hashCode();
        }
        int i8 = (hashCode6 + i) * 31;
        String str5 = this.f2;
        if (str5 == null) {
            i2 = 0;
        } else {
            i2 = str5.hashCode();
        }
        int i9 = (i8 + i2) * 31;
        String str6 = this.g2;
        if (str6 != null) {
            i3 = str6.hashCode();
        }
        return i9 + i3;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("UserInChannel(firstName=");
        P0.append(this.c);
        P0.append(", skinTone=");
        P0.append(this.d);
        P0.append(", channelEmoji=");
        P0.append(this.q);
        P0.append(", isNew=");
        P0.append(this.x);
        P0.append(", shortBio=");
        P0.append(this.y);
        P0.append(", isSpeaker=");
        P0.append(this.Y1);
        P0.append(", isModerator=");
        P0.append(this.Z1);
        P0.append(", timeJoinedAsSpeaker=");
        P0.append(this.a2);
        P0.append(", isFollowedBySpeaker=");
        P0.append(this.b2);
        P0.append(", isInvitedAsSpeaker=");
        P0.append(this.c2);
        P0.append(", id=");
        P0.append(getId().intValue());
        P0.append(", name=");
        P0.append(this.e2);
        P0.append(", username=");
        P0.append(this.f2);
        P0.append(", photoUrl=");
        return i0.d.a.a.a.w0(P0, this.g2, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        i.e(parcel, "out");
        parcel.writeString(this.c);
        Integer num = this.d;
        if (num == null) {
            i2 = 0;
        } else {
            parcel.writeInt(1);
            i2 = num.intValue();
        }
        parcel.writeInt(i2);
        parcel.writeString(this.q);
        parcel.writeInt(this.x ? 1 : 0);
        parcel.writeString(this.y);
        parcel.writeInt(this.Y1 ? 1 : 0);
        parcel.writeInt(this.Z1 ? 1 : 0);
        parcel.writeSerializable(this.a2);
        parcel.writeInt(this.b2 ? 1 : 0);
        parcel.writeInt(this.c2 ? 1 : 0);
        parcel.writeInt(this.d2);
        parcel.writeString(this.e2);
        parcel.writeString(this.f2);
        parcel.writeString(this.g2);
    }

    public Integer getId() {
        return Integer.valueOf(this.d2);
    }

    public UserInChannel(String str, Integer num, String str2, boolean z, String str3, boolean z2, boolean z3, OffsetDateTime offsetDateTime, boolean z4, boolean z5, int i, String str4, String str5, String str6) {
        this.c = str;
        this.d = num;
        this.q = str2;
        this.x = z;
        this.y = str3;
        this.Y1 = z2;
        this.Z1 = z3;
        this.a2 = offsetDateTime;
        this.b2 = z4;
        this.c2 = z5;
        this.d2 = i;
        this.e2 = str4;
        this.f2 = str5;
        this.g2 = str6;
    }
}
