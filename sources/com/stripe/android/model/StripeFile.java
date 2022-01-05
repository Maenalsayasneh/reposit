package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import i0.d.a.a.a;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\b\u0018\u00002\u00020\u0001Bi\b\u0000\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b7\u00108J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\u0004J\u0012\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0004J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0004J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0004Jp\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0004J\u0010\u0010\u001d\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b$\u0010\u001eJ \u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b)\u0010*R\u001b\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010+\u001a\u0004\b,\u0010\u0004R\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010+\u001a\u0004\b-\u0010\u0004R\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010+\u001a\u0004\b.\u0010\u0004R\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010+\u001a\u0004\b/\u0010\u0004R\u001b\u0010\u0015\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u00100\u001a\u0004\b1\u0010\u000bR\u001b\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010+\u001a\u0004\b2\u0010\u0004R\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u00103\u001a\u0004\b4\u0010\u0007R\u001b\u0010\u0016\u001a\u0004\u0018\u00010\f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u00105\u001a\u0004\b6\u0010\u000e¨\u00069"}, d2 = {"Lcom/stripe/android/model/StripeFile;", "Lcom/stripe/android/model/StripeModel;", "", "component1", "()Ljava/lang/String;", "", "component2", "()Ljava/lang/Long;", "component3", "Lcom/stripe/android/model/StripeFilePurpose;", "component4", "()Lcom/stripe/android/model/StripeFilePurpose;", "", "component5", "()Ljava/lang/Integer;", "component6", "component7", "component8", "id", "created", "filename", "purpose", "size", "title", "type", "url", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/model/StripeFilePurpose;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/StripeFile;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getType", "getFilename", "getId", "getTitle", "Lcom/stripe/android/model/StripeFilePurpose;", "getPurpose", "getUrl", "Ljava/lang/Long;", "getCreated", "Ljava/lang/Integer;", "getSize", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/model/StripeFilePurpose;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: StripeFile.kt */
public final class StripeFile implements StripeModel {
    public static final Parcelable.Creator<StripeFile> CREATOR = new Creator();
    private final Long created;
    private final String filename;
    private final String id;
    private final StripeFilePurpose purpose;
    private final Integer size;
    private final String title;
    private final String type;
    private final String url;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public static class Creator implements Parcelable.Creator<StripeFile> {
        public final StripeFile createFromParcel(Parcel parcel) {
            i.e(parcel, "in");
            return new StripeFile(parcel.readString(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString(), parcel.readInt() != 0 ? (StripeFilePurpose) Enum.valueOf(StripeFilePurpose.class, parcel.readString()) : null, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final StripeFile[] newArray(int i) {
            return new StripeFile[i];
        }
    }

    public StripeFile() {
        this((String) null, (Long) null, (String) null, (StripeFilePurpose) null, (Integer) null, (String) null, (String) null, (String) null, 255, (f) null);
    }

    public StripeFile(String str, Long l, String str2, StripeFilePurpose stripeFilePurpose, Integer num, String str3, String str4, String str5) {
        this.id = str;
        this.created = l;
        this.filename = str2;
        this.purpose = stripeFilePurpose;
        this.size = num;
        this.title = str3;
        this.type = str4;
        this.url = str5;
    }

    public static /* synthetic */ StripeFile copy$default(StripeFile stripeFile, String str, Long l, String str2, StripeFilePurpose stripeFilePurpose, Integer num, String str3, String str4, String str5, int i, Object obj) {
        StripeFile stripeFile2 = stripeFile;
        int i2 = i;
        return stripeFile.copy((i2 & 1) != 0 ? stripeFile2.id : str, (i2 & 2) != 0 ? stripeFile2.created : l, (i2 & 4) != 0 ? stripeFile2.filename : str2, (i2 & 8) != 0 ? stripeFile2.purpose : stripeFilePurpose, (i2 & 16) != 0 ? stripeFile2.size : num, (i2 & 32) != 0 ? stripeFile2.title : str3, (i2 & 64) != 0 ? stripeFile2.type : str4, (i2 & 128) != 0 ? stripeFile2.url : str5);
    }

    public final String component1() {
        return this.id;
    }

    public final Long component2() {
        return this.created;
    }

    public final String component3() {
        return this.filename;
    }

    public final StripeFilePurpose component4() {
        return this.purpose;
    }

    public final Integer component5() {
        return this.size;
    }

    public final String component6() {
        return this.title;
    }

    public final String component7() {
        return this.type;
    }

    public final String component8() {
        return this.url;
    }

    public final StripeFile copy(String str, Long l, String str2, StripeFilePurpose stripeFilePurpose, Integer num, String str3, String str4, String str5) {
        return new StripeFile(str, l, str2, stripeFilePurpose, num, str3, str4, str5);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StripeFile)) {
            return false;
        }
        StripeFile stripeFile = (StripeFile) obj;
        return i.a(this.id, stripeFile.id) && i.a(this.created, stripeFile.created) && i.a(this.filename, stripeFile.filename) && i.a(this.purpose, stripeFile.purpose) && i.a(this.size, stripeFile.size) && i.a(this.title, stripeFile.title) && i.a(this.type, stripeFile.type) && i.a(this.url, stripeFile.url);
    }

    public final Long getCreated() {
        return this.created;
    }

    public final String getFilename() {
        return this.filename;
    }

    public final String getId() {
        return this.id;
    }

    public final StripeFilePurpose getPurpose() {
        return this.purpose;
    }

    public final Integer getSize() {
        return this.size;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Long l = this.created;
        int hashCode2 = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        String str2 = this.filename;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        StripeFilePurpose stripeFilePurpose = this.purpose;
        int hashCode4 = (hashCode3 + (stripeFilePurpose != null ? stripeFilePurpose.hashCode() : 0)) * 31;
        Integer num = this.size;
        int hashCode5 = (hashCode4 + (num != null ? num.hashCode() : 0)) * 31;
        String str3 = this.title;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.type;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.url;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode7 + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("StripeFile(id=");
        P0.append(this.id);
        P0.append(", created=");
        P0.append(this.created);
        P0.append(", filename=");
        P0.append(this.filename);
        P0.append(", purpose=");
        P0.append(this.purpose);
        P0.append(", size=");
        P0.append(this.size);
        P0.append(", title=");
        P0.append(this.title);
        P0.append(", type=");
        P0.append(this.type);
        P0.append(", url=");
        return a.y0(P0, this.url, ")");
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "parcel");
        parcel.writeString(this.id);
        Long l = this.created;
        if (l != null) {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.filename);
        StripeFilePurpose stripeFilePurpose = this.purpose;
        if (stripeFilePurpose != null) {
            parcel.writeInt(1);
            parcel.writeString(stripeFilePurpose.name());
        } else {
            parcel.writeInt(0);
        }
        Integer num = this.size;
        if (num != null) {
            a.i(parcel, 1, num);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.title);
        parcel.writeString(this.type);
        parcel.writeString(this.url);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ StripeFile(java.lang.String r10, java.lang.Long r11, java.lang.String r12, com.stripe.android.model.StripeFilePurpose r13, java.lang.Integer r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, int r18, m0.n.b.f r19) {
        /*
            r9 = this;
            r0 = r18
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r10
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r11
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r12
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x001f
        L_0x001e:
            r5 = r13
        L_0x001f:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0025
            r6 = r2
            goto L_0x0026
        L_0x0025:
            r6 = r14
        L_0x0026:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002c
            r7 = r2
            goto L_0x002d
        L_0x002c:
            r7 = r15
        L_0x002d:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0033
            r8 = r2
            goto L_0x0035
        L_0x0033:
            r8 = r16
        L_0x0035:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            r2 = r17
        L_0x003c:
            r10 = r9
            r11 = r1
            r12 = r3
            r13 = r4
            r14 = r5
            r15 = r6
            r16 = r7
            r17 = r8
            r18 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.StripeFile.<init>(java.lang.String, java.lang.Long, java.lang.String, com.stripe.android.model.StripeFilePurpose, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, int, m0.n.b.f):void");
    }
}
