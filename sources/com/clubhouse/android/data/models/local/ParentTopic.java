package com.clubhouse.android.data.models.local;

import android.os.Parcel;
import android.os.Parcelable;
import com.clubhouse.android.data.models.local.Topic;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.util.ArrayList;
import java.util.List;
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
/* compiled from: ParentTopic.kt */
public final class ParentTopic implements Parcelable {
    public static final Parcelable.Creator<ParentTopic> CREATOR = new b();
    public static final Companion Companion = new Companion((f) null);
    public final int c;
    public final String d;
    public final String q;
    public final List<Topic> x;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/local/ParentTopic$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/local/ParentTopic;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: ParentTopic.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<ParentTopic> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: ParentTopic.kt */
    public static final class a implements v<ParentTopic> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.local.ParentTopic", aVar, 4);
            pluginGeneratedSerialDescriptor.i("id", false);
            pluginGeneratedSerialDescriptor.i(InstabugDbContract.FeatureRequestEntry.COLUMN_TITLE, false);
            pluginGeneratedSerialDescriptor.i("abbreviated_title", false);
            pluginGeneratedSerialDescriptor.i("topics", true);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            g1 g1Var = g1.b;
            return new KSerializer[]{e0.b, g1Var, m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(new n0.c.k.e(Topic.a.a))};
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
                if (r2 == 0) goto L_0x0037
                int r2 = r0.k(r1, r5)
                java.lang.String r5 = r0.t(r1, r6)
                n0.c.k.g1 r6 = n0.c.k.g1.b
                java.lang.Object r6 = r0.v(r1, r7, r6, r4)
                n0.c.k.e r7 = new n0.c.k.e
                com.clubhouse.android.data.models.local.Topic$a r8 = com.clubhouse.android.data.models.local.Topic.a.a
                r7.<init>(r8)
                java.lang.Object r3 = r0.v(r1, r3, r7, r4)
                r4 = 15
                r14 = r2
                r13 = r4
                r15 = r5
                goto L_0x0080
            L_0x0037:
                r8 = r4
                r9 = r8
                r10 = r9
                r2 = r5
                r4 = r2
                r11 = r6
            L_0x003d:
                if (r11 == 0) goto L_0x007b
                int r12 = r0.x(r1)
                r13 = -1
                if (r12 == r13) goto L_0x0079
                if (r12 == 0) goto L_0x0072
                if (r12 == r6) goto L_0x006b
                if (r12 == r7) goto L_0x0062
                if (r12 != r3) goto L_0x005c
                n0.c.k.e r12 = new n0.c.k.e
                com.clubhouse.android.data.models.local.Topic$a r13 = com.clubhouse.android.data.models.local.Topic.a.a
                r12.<init>(r13)
                java.lang.Object r10 = r0.v(r1, r3, r12, r10)
                r4 = r4 | 8
                goto L_0x003d
            L_0x005c:
                kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
                r0.<init>(r12)
                throw r0
            L_0x0062:
                n0.c.k.g1 r12 = n0.c.k.g1.b
                java.lang.Object r9 = r0.v(r1, r7, r12, r9)
                r4 = r4 | 4
                goto L_0x003d
            L_0x006b:
                java.lang.String r8 = r0.t(r1, r6)
                r4 = r4 | 2
                goto L_0x003d
            L_0x0072:
                int r2 = r0.k(r1, r5)
                r4 = r4 | 1
                goto L_0x003d
            L_0x0079:
                r11 = r5
                goto L_0x003d
            L_0x007b:
                r14 = r2
                r13 = r4
                r15 = r8
                r6 = r9
                r3 = r10
            L_0x0080:
                r0.b(r1)
                com.clubhouse.android.data.models.local.ParentTopic r0 = new com.clubhouse.android.data.models.local.ParentTopic
                r16 = r6
                java.lang.String r16 = (java.lang.String) r16
                r17 = r3
                java.util.List r17 = (java.util.List) r17
                r12 = r0
                r12.<init>(r13, r14, r15, r16, r17)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.models.local.ParentTopic.a.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            ParentTopic parentTopic = (ParentTopic) obj;
            i.e(encoder, "encoder");
            i.e(parentTopic, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(parentTopic, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            boolean z = false;
            c.q(serialDescriptor, 0, parentTopic.c);
            c.s(serialDescriptor, 1, parentTopic.d);
            c.l(serialDescriptor, 2, g1.b, parentTopic.q);
            if (c.v(serialDescriptor, 3) || parentTopic.x != null) {
                z = true;
            }
            if (z) {
                c.l(serialDescriptor, 3, new n0.c.k.e(Topic.a.a), parentTopic.x);
            }
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    /* compiled from: ParentTopic.kt */
    public static final class b implements Parcelable.Creator<ParentTopic> {
        public Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            i.e(parcel, "parcel");
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                int i = 0;
                while (i != readInt2) {
                    i = i0.d.a.a.a.n(Topic.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new ParentTopic(readInt, readString, readString2, arrayList);
        }

        public Object[] newArray(int i) {
            return new ParentTopic[i];
        }
    }

    public ParentTopic(int i, int i2, String str, String str2, List list) {
        if (7 == (i & 7)) {
            this.c = i2;
            this.d = str;
            this.q = str2;
            if ((i & 8) == 0) {
                this.x = null;
            } else {
                this.x = list;
            }
        } else {
            a aVar = a.a;
            m0.r.t.a.r.m.a1.a.W3(i, 7, a.b);
            throw null;
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParentTopic)) {
            return false;
        }
        ParentTopic parentTopic = (ParentTopic) obj;
        return this.c == parentTopic.c && i.a(this.d, parentTopic.d) && i.a(this.q, parentTopic.q) && i.a(this.x, parentTopic.x);
    }

    public int hashCode() {
        int F = i0.d.a.a.a.F(this.d, Integer.hashCode(this.c) * 31, 31);
        String str = this.q;
        int i = 0;
        int hashCode = (F + (str == null ? 0 : str.hashCode())) * 31;
        List<Topic> list = this.x;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ParentTopic(id=");
        P0.append(this.c);
        P0.append(", title=");
        P0.append(this.d);
        P0.append(", abbreviatedTitle=");
        P0.append(this.q);
        P0.append(", topics=");
        return i0.d.a.a.a.A0(P0, this.x, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.q);
        List<Topic> list = this.x;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        for (Topic writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
    }

    public ParentTopic(int i, String str, String str2, List<Topic> list) {
        i.e(str, InstabugDbContract.FeatureRequestEntry.COLUMN_TITLE);
        this.c = i;
        this.d = str;
        this.q = str2;
        this.x = list;
    }
}
