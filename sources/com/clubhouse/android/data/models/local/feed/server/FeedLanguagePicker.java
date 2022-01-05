package com.clubhouse.android.data.models.local.feed.server;

import android.os.Parcel;
import android.os.Parcelable;
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
import n0.c.k.g1;
import n0.c.k.h0;
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: FeedLanguagePicker.kt */
public final class FeedLanguagePicker implements Parcelable {
    public static final Parcelable.Creator<FeedLanguagePicker> CREATOR = new b();
    public static final Companion Companion = new Companion((f) null);
    public final String c;
    public final String d;
    public final String q;
    public final Map<String, Object> x;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/local/feed/server/FeedLanguagePicker$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/local/feed/server/FeedLanguagePicker;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: FeedLanguagePicker.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<FeedLanguagePicker> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: FeedLanguagePicker.kt */
    public static final class a implements v<FeedLanguagePicker> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.local.feed.server.FeedLanguagePicker", aVar, 4);
            pluginGeneratedSerialDescriptor.i(InstabugDbContract.FeatureRequestEntry.COLUMN_TITLE, false);
            pluginGeneratedSerialDescriptor.i("dismiss_button_text", false);
            pluginGeneratedSerialDescriptor.i("accept_button_text", false);
            pluginGeneratedSerialDescriptor.i("logging_context", true);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            g1 g1Var = g1.b;
            return new KSerializer[]{g1Var, g1Var, g1Var, m0.r.t.a.r.m.a1.a.R1(new h0(g1Var, i0.e.b.b3.a.b.c.a.a))};
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
                if (r2 == 0) goto L_0x0039
                java.lang.String r2 = r0.t(r1, r5)
                java.lang.String r5 = r0.t(r1, r6)
                java.lang.String r6 = r0.t(r1, r7)
                n0.c.k.h0 r7 = new n0.c.k.h0
                n0.c.k.g1 r8 = n0.c.k.g1.b
                i0.e.b.b3.a.b.c.a r9 = i0.e.b.b3.a.b.c.a.a
                r7.<init>(r8, r9)
                java.lang.Object r3 = r0.v(r1, r3, r7, r4)
                r4 = 15
                r14 = r2
                r13 = r4
                r15 = r5
                r16 = r6
                goto L_0x0082
            L_0x0039:
                r8 = r4
                r9 = r8
                r10 = r9
                r2 = r5
                r11 = r6
            L_0x003e:
                if (r11 == 0) goto L_0x007c
                int r12 = r0.x(r1)
                r13 = -1
                if (r12 == r13) goto L_0x007a
                if (r12 == 0) goto L_0x0073
                if (r12 == r6) goto L_0x006c
                if (r12 == r7) goto L_0x0065
                if (r12 != r3) goto L_0x005f
                n0.c.k.h0 r12 = new n0.c.k.h0
                n0.c.k.g1 r13 = n0.c.k.g1.b
                i0.e.b.b3.a.b.c.a r14 = i0.e.b.b3.a.b.c.a.a
                r12.<init>(r13, r14)
                java.lang.Object r10 = r0.v(r1, r3, r12, r10)
                r2 = r2 | 8
                goto L_0x003e
            L_0x005f:
                kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
                r0.<init>(r12)
                throw r0
            L_0x0065:
                java.lang.String r9 = r0.t(r1, r7)
                r2 = r2 | 4
                goto L_0x003e
            L_0x006c:
                java.lang.String r8 = r0.t(r1, r6)
                r2 = r2 | 2
                goto L_0x003e
            L_0x0073:
                java.lang.String r4 = r0.t(r1, r5)
                r2 = r2 | 1
                goto L_0x003e
            L_0x007a:
                r11 = r5
                goto L_0x003e
            L_0x007c:
                r13 = r2
                r14 = r4
                r15 = r8
                r16 = r9
                r3 = r10
            L_0x0082:
                r0.b(r1)
                com.clubhouse.android.data.models.local.feed.server.FeedLanguagePicker r0 = new com.clubhouse.android.data.models.local.feed.server.FeedLanguagePicker
                r17 = r3
                java.util.Map r17 = (java.util.Map) r17
                r12 = r0
                r12.<init>(r13, r14, r15, r16, r17)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.models.local.feed.server.FeedLanguagePicker.a.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            FeedLanguagePicker feedLanguagePicker = (FeedLanguagePicker) obj;
            i.e(encoder, "encoder");
            i.e(feedLanguagePicker, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(feedLanguagePicker, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            boolean z = false;
            c.s(serialDescriptor, 0, feedLanguagePicker.c);
            c.s(serialDescriptor, 1, feedLanguagePicker.d);
            c.s(serialDescriptor, 2, feedLanguagePicker.q);
            if (c.v(serialDescriptor, 3) || feedLanguagePicker.x != null) {
                z = true;
            }
            if (z) {
                c.l(serialDescriptor, 3, new h0(g1.b, i0.e.b.b3.a.b.c.a.a), feedLanguagePicker.x);
            }
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    /* compiled from: FeedLanguagePicker.kt */
    public static final class b implements Parcelable.Creator<FeedLanguagePicker> {
        public Object createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            i.e(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                int i = 0;
                while (i != readInt) {
                    i = i0.d.a.a.a.y(FeedLanguagePicker.class, parcel, linkedHashMap2, parcel.readString(), i, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new FeedLanguagePicker(readString, readString2, readString3, linkedHashMap);
        }

        public Object[] newArray(int i) {
            return new FeedLanguagePicker[i];
        }
    }

    public FeedLanguagePicker(int i, String str, String str2, String str3, Map map) {
        if (7 == (i & 7)) {
            this.c = str;
            this.d = str2;
            this.q = str3;
            if ((i & 8) == 0) {
                this.x = null;
            } else {
                this.x = map;
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
        if (!(obj instanceof FeedLanguagePicker)) {
            return false;
        }
        FeedLanguagePicker feedLanguagePicker = (FeedLanguagePicker) obj;
        return i.a(this.c, feedLanguagePicker.c) && i.a(this.d, feedLanguagePicker.d) && i.a(this.q, feedLanguagePicker.q) && i.a(this.x, feedLanguagePicker.x);
    }

    public int hashCode() {
        int F = i0.d.a.a.a.F(this.q, i0.d.a.a.a.F(this.d, this.c.hashCode() * 31, 31), 31);
        Map<String, Object> map = this.x;
        return F + (map == null ? 0 : map.hashCode());
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("FeedLanguagePicker(title=");
        P0.append(this.c);
        P0.append(", dismissButtonText=");
        P0.append(this.d);
        P0.append(", acceptButtonText=");
        P0.append(this.q);
        P0.append(", loggingContext=");
        return i0.d.a.a.a.B0(P0, this.x, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.q);
        Map<String, Object> map = this.x;
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

    public FeedLanguagePicker(String str, String str2, String str3, Map<String, ? extends Object> map) {
        i.e(str, InstabugDbContract.FeatureRequestEntry.COLUMN_TITLE);
        i.e(str2, "dismissButtonText");
        i.e(str3, "acceptButtonText");
        this.c = str;
        this.d = str2;
        this.q = str3;
        this.x = map;
    }
}
