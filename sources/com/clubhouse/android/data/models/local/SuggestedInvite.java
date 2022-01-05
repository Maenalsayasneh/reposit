package com.clubhouse.android.data.models.local;

import android.os.Parcel;
import android.os.Parcelable;
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
/* compiled from: SuggestedInvite.kt */
public final class SuggestedInvite implements Parcelable {
    public static final Parcelable.Creator<SuggestedInvite> CREATOR = new b();
    public static final Companion Companion = new Companion((f) null);
    public final String Y1;
    public final String c;
    public final boolean d;
    public final boolean q;
    public final int x;
    public final String y;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/local/SuggestedInvite$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/local/SuggestedInvite;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: SuggestedInvite.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<SuggestedInvite> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: SuggestedInvite.kt */
    public static final class a implements v<SuggestedInvite> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.local.SuggestedInvite", aVar, 6);
            pluginGeneratedSerialDescriptor.i("phone_number", false);
            pluginGeneratedSerialDescriptor.i("in_app", false);
            pluginGeneratedSerialDescriptor.i("is_invited", false);
            pluginGeneratedSerialDescriptor.i("num_friends", true);
            pluginGeneratedSerialDescriptor.i("name", true);
            pluginGeneratedSerialDescriptor.i("photoUri", true);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            g1 g1Var = g1.b;
            h hVar = h.b;
            return new KSerializer[]{g1Var, hVar, hVar, e0.b, m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(g1Var)};
        }

        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder r18) {
            /*
                r17 = this;
                r0 = r18
                java.lang.String r1 = "decoder"
                m0.n.b.i.e(r0, r1)
                kotlinx.serialization.descriptors.SerialDescriptor r1 = b
                n0.c.j.c r0 = r0.c(r1)
                boolean r2 = r0.y()
                r3 = 5
                r4 = 3
                r5 = 0
                r6 = 1
                r7 = 2
                r8 = 4
                r9 = 0
                if (r2 == 0) goto L_0x0041
                java.lang.String r2 = r0.t(r1, r9)
                boolean r6 = r0.s(r1, r6)
                boolean r7 = r0.s(r1, r7)
                int r4 = r0.k(r1, r4)
                n0.c.k.g1 r9 = n0.c.k.g1.b
                java.lang.Object r8 = r0.v(r1, r8, r9, r5)
                java.lang.Object r3 = r0.v(r1, r3, r9, r5)
                r5 = 63
                r12 = r3
                r3 = r2
                r2 = r5
                r5 = r7
                r16 = r6
                r6 = r4
                r4 = r16
                goto L_0x0093
            L_0x0041:
                r10 = r5
                r11 = r10
                r12 = r11
                r15 = r6
                r2 = r9
                r5 = r2
                r13 = r5
                r14 = r13
            L_0x0049:
                if (r15 == 0) goto L_0x008d
                int r9 = r0.x(r1)
                switch(r9) {
                    case -1: goto L_0x008a;
                    case 0: goto L_0x0082;
                    case 1: goto L_0x007a;
                    case 2: goto L_0x0073;
                    case 3: goto L_0x006c;
                    case 4: goto L_0x0062;
                    case 5: goto L_0x0058;
                    default: goto L_0x0052;
                }
            L_0x0052:
                kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
                r0.<init>(r9)
                throw r0
            L_0x0058:
                n0.c.k.g1 r9 = n0.c.k.g1.b
                java.lang.Object r9 = r0.v(r1, r3, r9, r12)
                r5 = r5 | 32
                r12 = r9
                goto L_0x0080
            L_0x0062:
                n0.c.k.g1 r9 = n0.c.k.g1.b
                java.lang.Object r9 = r0.v(r1, r8, r9, r11)
                r5 = r5 | 16
                r11 = r9
                goto L_0x0080
            L_0x006c:
                int r2 = r0.k(r1, r4)
                r5 = r5 | 8
                goto L_0x0080
            L_0x0073:
                boolean r14 = r0.s(r1, r7)
                r5 = r5 | 4
                goto L_0x0080
            L_0x007a:
                boolean r13 = r0.s(r1, r6)
                r5 = r5 | 2
            L_0x0080:
                r9 = 0
                goto L_0x0049
            L_0x0082:
                r9 = 0
                java.lang.String r10 = r0.t(r1, r9)
                r5 = r5 | 1
                goto L_0x0049
            L_0x008a:
                r9 = 0
                r15 = r9
                goto L_0x0049
            L_0x008d:
                r6 = r2
                r2 = r5
                r3 = r10
                r8 = r11
                r4 = r13
                r5 = r14
            L_0x0093:
                r0.b(r1)
                com.clubhouse.android.data.models.local.SuggestedInvite r0 = new com.clubhouse.android.data.models.local.SuggestedInvite
                r7 = r8
                java.lang.String r7 = (java.lang.String) r7
                r8 = r12
                java.lang.String r8 = (java.lang.String) r8
                r1 = r0
                r1.<init>(r2, r3, r4, r5, r6, r7, r8)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.models.local.SuggestedInvite.a.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            SuggestedInvite suggestedInvite = (SuggestedInvite) obj;
            i.e(encoder, "encoder");
            i.e(suggestedInvite, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(suggestedInvite, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            boolean z = false;
            c.s(serialDescriptor, 0, suggestedInvite.c);
            c.r(serialDescriptor, 1, suggestedInvite.d);
            c.r(serialDescriptor, 2, suggestedInvite.q);
            if (c.v(serialDescriptor, 3) || suggestedInvite.x != 0) {
                c.q(serialDescriptor, 3, suggestedInvite.x);
            }
            if (c.v(serialDescriptor, 4) || suggestedInvite.y != null) {
                c.l(serialDescriptor, 4, g1.b, suggestedInvite.y);
            }
            if (c.v(serialDescriptor, 5) || suggestedInvite.Y1 != null) {
                z = true;
            }
            if (z) {
                c.l(serialDescriptor, 5, g1.b, suggestedInvite.Y1);
            }
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    /* compiled from: SuggestedInvite.kt */
    public static final class b implements Parcelable.Creator<SuggestedInvite> {
        public Object createFromParcel(Parcel parcel) {
            i.e(parcel, "parcel");
            String readString = parcel.readString();
            boolean z = false;
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = true;
            }
            return new SuggestedInvite(readString, z2, z, parcel.readInt(), parcel.readString(), parcel.readString());
        }

        public Object[] newArray(int i) {
            return new SuggestedInvite[i];
        }
    }

    public SuggestedInvite(int i, String str, boolean z, boolean z2, int i2, String str2, String str3) {
        if (7 == (i & 7)) {
            this.c = str;
            this.d = z;
            this.q = z2;
            if ((i & 8) == 0) {
                this.x = 0;
            } else {
                this.x = i2;
            }
            if ((i & 16) == 0) {
                this.y = null;
            } else {
                this.y = str2;
            }
            if ((i & 32) == 0) {
                this.Y1 = null;
            } else {
                this.Y1 = str3;
            }
        } else {
            a aVar = a.a;
            m0.r.t.a.r.m.a1.a.W3(i, 7, a.b);
            throw null;
        }
    }

    public static SuggestedInvite a(SuggestedInvite suggestedInvite, String str, boolean z, boolean z2, int i, String str2, String str3, int i2) {
        String str4 = (i2 & 1) != 0 ? suggestedInvite.c : null;
        if ((i2 & 2) != 0) {
            z = suggestedInvite.d;
        }
        boolean z3 = z;
        if ((i2 & 4) != 0) {
            z2 = suggestedInvite.q;
        }
        boolean z4 = z2;
        if ((i2 & 8) != 0) {
            i = suggestedInvite.x;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            str2 = suggestedInvite.y;
        }
        String str5 = str2;
        if ((i2 & 32) != 0) {
            str3 = suggestedInvite.Y1;
        }
        Objects.requireNonNull(suggestedInvite);
        i.e(str4, "phoneNumber");
        return new SuggestedInvite(str4, z3, z4, i3, str5, str3);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuggestedInvite)) {
            return false;
        }
        SuggestedInvite suggestedInvite = (SuggestedInvite) obj;
        return i.a(this.c, suggestedInvite.c) && this.d == suggestedInvite.d && this.q == suggestedInvite.q && this.x == suggestedInvite.x && i.a(this.y, suggestedInvite.y) && i.a(this.Y1, suggestedInvite.Y1);
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
        if (!z3) {
            z2 = z3;
        }
        int M = i0.d.a.a.a.M(this.x, (i + (z2 ? 1 : 0)) * 31, 31);
        String str = this.y;
        int i2 = 0;
        int hashCode2 = (M + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.Y1;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("SuggestedInvite(phoneNumber=");
        P0.append(this.c);
        P0.append(", inApp=");
        P0.append(this.d);
        P0.append(", isInvited=");
        P0.append(this.q);
        P0.append(", numFriends=");
        P0.append(this.x);
        P0.append(", name=");
        P0.append(this.y);
        P0.append(", photoUri=");
        return i0.d.a.a.a.w0(P0, this.Y1, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.q ? 1 : 0);
        parcel.writeInt(this.x);
        parcel.writeString(this.y);
        parcel.writeString(this.Y1);
    }

    public SuggestedInvite(String str, boolean z, boolean z2, int i, String str2, String str3) {
        i.e(str, "phoneNumber");
        this.c = str;
        this.d = z;
        this.q = z2;
        this.x = i;
        this.y = str2;
        this.Y1 = str3;
    }
}
