package com.clubhouse.android.data.models.local.payment;

import android.os.Parcel;
import android.os.Parcelable;
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
/* compiled from: RecentPayment.kt */
public final class RecentPayment implements Parcelable {
    public static final Parcelable.Creator<RecentPayment> CREATOR = new b();
    public static final Companion Companion = new Companion((f) null);
    public final boolean Y1;
    public final OffsetDateTime Z1;
    public final int c;
    public final int d;
    public final int q;
    public final String x;
    public final String y;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/local/payment/RecentPayment$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/local/payment/RecentPayment;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: RecentPayment.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<RecentPayment> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: RecentPayment.kt */
    public static final class a implements v<RecentPayment> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.local.payment.RecentPayment", aVar, 7);
            pluginGeneratedSerialDescriptor.i("id", false);
            pluginGeneratedSerialDescriptor.i("amount_cents", false);
            pluginGeneratedSerialDescriptor.i("from_id", false);
            pluginGeneratedSerialDescriptor.i("from_name", false);
            pluginGeneratedSerialDescriptor.i("from_photo_url", true);
            pluginGeneratedSerialDescriptor.i("is_acknowledged", false);
            pluginGeneratedSerialDescriptor.i("time_created", false);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            e0 e0Var = e0.b;
            g1 g1Var = g1.b;
            return new KSerializer[]{e0Var, e0Var, e0Var, g1Var, m0.r.t.a.r.m.a1.a.R1(g1Var), h.b, new n0.c.a(m.a(OffsetDateTime.class), (KSerializer) null, new KSerializer[0])};
        }

        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder r21) {
            /*
                r20 = this;
                r0 = r21
                java.lang.String r1 = "decoder"
                m0.n.b.i.e(r0, r1)
                kotlinx.serialization.descriptors.SerialDescriptor r1 = b
                n0.c.j.c r0 = r0.c(r1)
                boolean r2 = r0.y()
                r3 = 6
                r4 = 5
                r5 = 0
                r6 = 0
                r7 = 4
                r8 = 3
                r9 = 1
                r10 = 2
                if (r2 == 0) goto L_0x0051
                int r2 = r0.k(r1, r6)
                int r9 = r0.k(r1, r9)
                int r10 = r0.k(r1, r10)
                java.lang.String r8 = r0.t(r1, r8)
                n0.c.k.g1 r11 = n0.c.k.g1.b
                java.lang.Object r7 = r0.v(r1, r7, r11, r5)
                boolean r4 = r0.s(r1, r4)
                n0.c.a r11 = new n0.c.a
                java.lang.Class<j$.time.OffsetDateTime> r12 = j$.time.OffsetDateTime.class
                m0.r.d r12 = m0.n.b.m.a(r12)
                kotlinx.serialization.KSerializer[] r6 = new kotlinx.serialization.KSerializer[r6]
                r11.<init>(r12, r5, r6)
                java.lang.Object r3 = r0.m(r1, r3, r11, r5)
                r5 = 127(0x7f, float:1.78E-43)
                r12 = r2
                r17 = r4
                r11 = r5
                r15 = r8
                r13 = r9
                r14 = r10
                goto L_0x00c3
            L_0x0051:
                r11 = r5
                r14 = r11
                r15 = r14
                r2 = r6
                r12 = r2
                r13 = r12
                r16 = r13
                r17 = r16
                r18 = r9
            L_0x005d:
                if (r18 == 0) goto L_0x00b9
                int r9 = r0.x(r1)
                switch(r9) {
                    case -1: goto L_0x00b5;
                    case 0: goto L_0x00ad;
                    case 1: goto L_0x00a5;
                    case 2: goto L_0x009d;
                    case 3: goto L_0x0092;
                    case 4: goto L_0x0087;
                    case 5: goto L_0x0080;
                    case 6: goto L_0x006c;
                    default: goto L_0x0066;
                }
            L_0x0066:
                kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
                r0.<init>(r9)
                throw r0
            L_0x006c:
                n0.c.a r9 = new n0.c.a
                java.lang.Class<j$.time.OffsetDateTime> r19 = j$.time.OffsetDateTime.class
                m0.r.d r10 = m0.n.b.m.a(r19)
                kotlinx.serialization.KSerializer[] r8 = new kotlinx.serialization.KSerializer[r6]
                r9.<init>(r10, r5, r8)
                java.lang.Object r11 = r0.m(r1, r3, r9, r11)
                r8 = r13 | 64
                goto L_0x008f
            L_0x0080:
                boolean r12 = r0.s(r1, r4)
                r8 = r13 | 32
                goto L_0x008f
            L_0x0087:
                n0.c.k.g1 r8 = n0.c.k.g1.b
                java.lang.Object r14 = r0.v(r1, r7, r8, r14)
                r8 = r13 | 16
            L_0x008f:
                r13 = r8
                r8 = 3
                goto L_0x009a
            L_0x0092:
                java.lang.String r9 = r0.t(r1, r8)
                r10 = r13 | 8
                r15 = r9
                r13 = r10
            L_0x009a:
                r9 = 1
                r10 = 2
                goto L_0x005d
            L_0x009d:
                int r17 = r0.k(r1, r10)
                r13 = r13 | 4
                r9 = 1
                goto L_0x005d
            L_0x00a5:
                r9 = 1
                int r16 = r0.k(r1, r9)
                r13 = r13 | 2
                goto L_0x005d
            L_0x00ad:
                r9 = 1
                int r2 = r0.k(r1, r6)
                r13 = r13 | 1
                goto L_0x005d
            L_0x00b5:
                r9 = 1
                r18 = r6
                goto L_0x005d
            L_0x00b9:
                r3 = r11
                r11 = r13
                r7 = r14
                r13 = r16
                r14 = r17
                r17 = r12
                r12 = r2
            L_0x00c3:
                r0.b(r1)
                com.clubhouse.android.data.models.local.payment.RecentPayment r0 = new com.clubhouse.android.data.models.local.payment.RecentPayment
                r16 = r7
                java.lang.String r16 = (java.lang.String) r16
                r18 = r3
                j$.time.OffsetDateTime r18 = (j$.time.OffsetDateTime) r18
                r10 = r0
                r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.models.local.payment.RecentPayment.a.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            RecentPayment recentPayment = (RecentPayment) obj;
            i.e(encoder, "encoder");
            i.e(recentPayment, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(recentPayment, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            c.q(serialDescriptor, 0, recentPayment.c);
            boolean z = true;
            c.q(serialDescriptor, 1, recentPayment.d);
            c.q(serialDescriptor, 2, recentPayment.q);
            c.s(serialDescriptor, 3, recentPayment.x);
            if (!c.v(serialDescriptor, 4) && recentPayment.y == null) {
                z = false;
            }
            if (z) {
                c.l(serialDescriptor, 4, g1.b, recentPayment.y);
            }
            c.r(serialDescriptor, 5, recentPayment.Y1);
            c.z(serialDescriptor, 6, new n0.c.a(m.a(OffsetDateTime.class), (KSerializer) null, new KSerializer[0]), recentPayment.Z1);
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    /* compiled from: RecentPayment.kt */
    public static final class b implements Parcelable.Creator<RecentPayment> {
        public Object createFromParcel(Parcel parcel) {
            i.e(parcel, "parcel");
            return new RecentPayment(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, (OffsetDateTime) parcel.readSerializable());
        }

        public Object[] newArray(int i) {
            return new RecentPayment[i];
        }
    }

    public RecentPayment(int i, int i2, int i3, int i4, String str, String str2, boolean z, OffsetDateTime offsetDateTime) {
        if (111 == (i & 111)) {
            this.c = i2;
            this.d = i3;
            this.q = i4;
            this.x = str;
            if ((i & 16) == 0) {
                this.y = null;
            } else {
                this.y = str2;
            }
            this.Y1 = z;
            this.Z1 = offsetDateTime;
            return;
        }
        a aVar = a.a;
        m0.r.t.a.r.m.a1.a.W3(i, 111, a.b);
        throw null;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecentPayment)) {
            return false;
        }
        RecentPayment recentPayment = (RecentPayment) obj;
        return this.c == recentPayment.c && this.d == recentPayment.d && this.q == recentPayment.q && i.a(this.x, recentPayment.x) && i.a(this.y, recentPayment.y) && this.Y1 == recentPayment.Y1 && i.a(this.Z1, recentPayment.Z1);
    }

    public int hashCode() {
        int F = i0.d.a.a.a.F(this.x, i0.d.a.a.a.M(this.q, i0.d.a.a.a.M(this.d, Integer.hashCode(this.c) * 31, 31), 31), 31);
        String str = this.y;
        int hashCode = (F + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.Y1;
        if (z) {
            z = true;
        }
        return this.Z1.hashCode() + ((hashCode + (z ? 1 : 0)) * 31);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("RecentPayment(id=");
        P0.append(this.c);
        P0.append(", amountCents=");
        P0.append(this.d);
        P0.append(", fromId=");
        P0.append(this.q);
        P0.append(", fromName=");
        P0.append(this.x);
        P0.append(", fromPhotoUrl=");
        P0.append(this.y);
        P0.append(", isAcknowledged=");
        P0.append(this.Y1);
        P0.append(", timeCreated=");
        P0.append(this.Z1);
        P0.append(')');
        return P0.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.q);
        parcel.writeString(this.x);
        parcel.writeString(this.y);
        parcel.writeInt(this.Y1 ? 1 : 0);
        parcel.writeSerializable(this.Z1);
    }

    public RecentPayment(int i, int i2, int i3, String str, String str2, boolean z, OffsetDateTime offsetDateTime) {
        i.e(str, "fromName");
        i.e(offsetDateTime, "timeCreated");
        this.c = i;
        this.d = i2;
        this.q = i3;
        this.x = str;
        this.y = str2;
        this.Y1 = z;
        this.Z1 = offsetDateTime;
    }
}
