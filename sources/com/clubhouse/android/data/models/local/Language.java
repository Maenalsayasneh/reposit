package com.clubhouse.android.data.models.local;

import android.os.Parcel;
import android.os.Parcelable;
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
import n0.c.k.g1;
import n0.c.k.h;
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: Language.kt */
public final class Language implements Parcelable {
    public static final Parcelable.Creator<Language> CREATOR = new b();
    public static final Companion Companion = new Companion((f) null);
    public final String c;
    public final String d;
    public final String q;
    public final boolean x;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/local/Language$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/local/Language;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: Language.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<Language> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: Language.kt */
    public static final class a implements v<Language> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.local.Language", aVar, 4);
            pluginGeneratedSerialDescriptor.i("language", false);
            pluginGeneratedSerialDescriptor.i("native_name", false);
            pluginGeneratedSerialDescriptor.i("english_name", false);
            pluginGeneratedSerialDescriptor.i("selected", false);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            g1 g1Var = g1.b;
            return new KSerializer[]{m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(g1Var), h.b};
        }

        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder r14) {
            /*
                r13 = this;
                java.lang.String r0 = "decoder"
                m0.n.b.i.e(r14, r0)
                kotlinx.serialization.descriptors.SerialDescriptor r0 = b
                n0.c.j.c r14 = r14.c(r0)
                boolean r1 = r14.y()
                r2 = 3
                r3 = 0
                r4 = 0
                r5 = 1
                r6 = 2
                if (r1 == 0) goto L_0x002c
                n0.c.k.g1 r1 = n0.c.k.g1.b
                java.lang.Object r4 = r14.v(r0, r4, r1, r3)
                java.lang.Object r5 = r14.v(r0, r5, r1, r3)
                java.lang.Object r1 = r14.v(r0, r6, r1, r3)
                boolean r2 = r14.s(r0, r2)
                r3 = 15
                r7 = r2
                goto L_0x0071
            L_0x002c:
                r7 = r3
                r8 = r7
                r1 = r4
                r9 = r1
                r10 = r5
            L_0x0031:
                if (r10 == 0) goto L_0x006c
                int r11 = r14.x(r0)
                r12 = -1
                if (r11 == r12) goto L_0x006a
                if (r11 == 0) goto L_0x0061
                if (r11 == r5) goto L_0x0058
                if (r11 == r6) goto L_0x004f
                if (r11 != r2) goto L_0x0049
                boolean r1 = r14.s(r0, r2)
                r9 = r9 | 8
                goto L_0x0031
            L_0x0049:
                kotlinx.serialization.UnknownFieldException r14 = new kotlinx.serialization.UnknownFieldException
                r14.<init>(r11)
                throw r14
            L_0x004f:
                n0.c.k.g1 r11 = n0.c.k.g1.b
                java.lang.Object r8 = r14.v(r0, r6, r11, r8)
                r9 = r9 | 4
                goto L_0x0031
            L_0x0058:
                n0.c.k.g1 r11 = n0.c.k.g1.b
                java.lang.Object r7 = r14.v(r0, r5, r11, r7)
                r9 = r9 | 2
                goto L_0x0031
            L_0x0061:
                n0.c.k.g1 r11 = n0.c.k.g1.b
                java.lang.Object r3 = r14.v(r0, r4, r11, r3)
                r9 = r9 | 1
                goto L_0x0031
            L_0x006a:
                r10 = r4
                goto L_0x0031
            L_0x006c:
                r4 = r3
                r5 = r7
                r3 = r9
                r7 = r1
                r1 = r8
            L_0x0071:
                r14.b(r0)
                com.clubhouse.android.data.models.local.Language r14 = new com.clubhouse.android.data.models.local.Language
                java.lang.String r4 = (java.lang.String) r4
                java.lang.String r5 = (java.lang.String) r5
                r6 = r1
                java.lang.String r6 = (java.lang.String) r6
                r2 = r14
                r2.<init>(r3, r4, r5, r6, r7)
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.models.local.Language.a.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            Language language = (Language) obj;
            i.e(encoder, "encoder");
            i.e(language, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(language, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            g1 g1Var = g1.b;
            c.l(serialDescriptor, 0, g1Var, language.c);
            c.l(serialDescriptor, 1, g1Var, language.d);
            c.l(serialDescriptor, 2, g1Var, language.q);
            c.r(serialDescriptor, 3, language.x);
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    /* compiled from: Language.kt */
    public static final class b implements Parcelable.Creator<Language> {
        public Object createFromParcel(Parcel parcel) {
            i.e(parcel, "parcel");
            return new Language(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        public Object[] newArray(int i) {
            return new Language[i];
        }
    }

    public Language(int i, String str, String str2, String str3, boolean z) {
        if (15 == (i & 15)) {
            this.c = str;
            this.d = str2;
            this.q = str3;
            this.x = z;
            return;
        }
        a aVar = a.a;
        m0.r.t.a.r.m.a1.a.W3(i, 15, a.b);
        throw null;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Language)) {
            return false;
        }
        Language language = (Language) obj;
        return i.a(this.c, language.c) && i.a(this.d, language.d) && i.a(this.q, language.q) && this.x == language.x;
    }

    public int hashCode() {
        String str = this.c;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.q;
        if (str3 != null) {
            i = str3.hashCode();
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z = this.x;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("Language(language=");
        P0.append(this.c);
        P0.append(", nativeName=");
        P0.append(this.d);
        P0.append(", englishName=");
        P0.append(this.q);
        P0.append(", selected=");
        return i0.d.a.a.a.C0(P0, this.x, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.q);
        parcel.writeInt(this.x ? 1 : 0);
    }

    public Language(String str, String str2, String str3, boolean z) {
        this.c = str;
        this.d = str2;
        this.q = str3;
        this.x = z;
    }
}
