package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import i0.d.a.a.a;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001:\u0001!B\u0017\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\u0005\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0006HÀ\u0003¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u000b\u001a\u00020\u00068\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\bR\u001c\u0010\n\u001a\u00020\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001b\u0010\u0004R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lcom/stripe/android/model/StripeFileParams;", "", "Ljava/io/File;", "component1$payments_core_release", "()Ljava/io/File;", "component1", "Lcom/stripe/android/model/StripeFilePurpose;", "component2$payments_core_release", "()Lcom/stripe/android/model/StripeFilePurpose;", "component2", "file", "purpose", "copy", "(Ljava/io/File;Lcom/stripe/android/model/StripeFilePurpose;)Lcom/stripe/android/model/StripeFileParams;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/stripe/android/model/StripeFilePurpose;", "getPurpose$payments_core_release", "Ljava/io/File;", "getFile$payments_core_release", "Lcom/stripe/android/model/StripeFileParams$FileLink;", "fileLink", "Lcom/stripe/android/model/StripeFileParams$FileLink;", "<init>", "(Ljava/io/File;Lcom/stripe/android/model/StripeFilePurpose;)V", "FileLink", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: StripeFileParams.kt */
public final class StripeFileParams {
    private final File file;
    private final FileLink fileLink;
    private final StripeFilePurpose purpose;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B7\b\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0003\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÂ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÂ\u0003¢\u0006\u0004\b\n\u0010\u000bJ>\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0015J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010!R$\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\"R\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010#¨\u0006&"}, d2 = {"Lcom/stripe/android/model/StripeFileParams$FileLink;", "Landroid/os/Parcelable;", "", "component1", "()Z", "", "component2", "()Ljava/lang/Long;", "", "", "component3", "()Ljava/util/Map;", "create", "expiresAt", "metadata", "copy", "(ZLjava/lang/Long;Ljava/util/Map;)Lcom/stripe/android/model/StripeFileParams$FileLink;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Long;", "Ljava/util/Map;", "Z", "<init>", "(ZLjava/lang/Long;Ljava/util/Map;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: StripeFileParams.kt */
    public static final class FileLink implements Parcelable {
        public static final Parcelable.Creator<FileLink> CREATOR = new Creator();
        private final boolean create;
        private final Long expiresAt;
        private final Map<String, String> metadata;

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<FileLink> {
            public final FileLink createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                boolean z = parcel.readInt() != 0;
                LinkedHashMap linkedHashMap = null;
                Long valueOf = parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null;
                if (parcel.readInt() != 0) {
                    int readInt = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                    while (readInt != 0) {
                        linkedHashMap2.put(parcel.readString(), parcel.readString());
                        readInt--;
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new FileLink(z, valueOf, linkedHashMap);
            }

            public final FileLink[] newArray(int i) {
                return new FileLink[i];
            }
        }

        public FileLink() {
            this(false, (Long) null, (Map) null, 7, (f) null);
        }

        public FileLink(boolean z) {
            this(z, (Long) null, (Map) null, 6, (f) null);
        }

        public FileLink(boolean z, Long l) {
            this(z, l, (Map) null, 4, (f) null);
        }

        public FileLink(boolean z, Long l, Map<String, String> map) {
            this.create = z;
            this.expiresAt = l;
            this.metadata = map;
        }

        private final boolean component1() {
            return this.create;
        }

        private final Long component2() {
            return this.expiresAt;
        }

        private final Map<String, String> component3() {
            return this.metadata;
        }

        public static /* synthetic */ FileLink copy$default(FileLink fileLink, boolean z, Long l, Map<String, String> map, int i, Object obj) {
            if ((i & 1) != 0) {
                z = fileLink.create;
            }
            if ((i & 2) != 0) {
                l = fileLink.expiresAt;
            }
            if ((i & 4) != 0) {
                map = fileLink.metadata;
            }
            return fileLink.copy(z, l, map);
        }

        public final FileLink copy(boolean z, Long l, Map<String, String> map) {
            return new FileLink(z, l, map);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FileLink)) {
                return false;
            }
            FileLink fileLink = (FileLink) obj;
            return this.create == fileLink.create && i.a(this.expiresAt, fileLink.expiresAt) && i.a(this.metadata, fileLink.metadata);
        }

        public int hashCode() {
            boolean z = this.create;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            Long l = this.expiresAt;
            int i2 = 0;
            int hashCode = (i + (l != null ? l.hashCode() : 0)) * 31;
            Map<String, String> map = this.metadata;
            if (map != null) {
                i2 = map.hashCode();
            }
            return hashCode + i2;
        }

        public String toString() {
            StringBuilder P0 = a.P0("FileLink(create=");
            P0.append(this.create);
            P0.append(", expiresAt=");
            P0.append(this.expiresAt);
            P0.append(", metadata=");
            P0.append(this.metadata);
            P0.append(")");
            return P0.toString();
        }

        /* JADX WARNING: type inference failed for: r0v2, types: [java.util.Map$Entry, java.lang.Object] */
        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            parcel.writeInt(this.create ? 1 : 0);
            Long l = this.expiresAt;
            if (l != null) {
                parcel.writeInt(1);
                parcel.writeLong(l.longValue());
            } else {
                parcel.writeInt(0);
            }
            Map<String, String> map = this.metadata;
            if (map != null) {
                Iterator l1 = a.l1(parcel, 1, map);
                while (l1.hasNext()) {
                    ? next = l1.next();
                    parcel.writeString((String) next.getKey());
                    parcel.writeString((String) next.getValue());
                }
                return;
            }
            parcel.writeInt(0);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ FileLink(boolean z, Long l, Map map, int i, f fVar) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : map);
        }
    }

    public StripeFileParams(File file2, StripeFilePurpose stripeFilePurpose) {
        i.e(file2, "file");
        i.e(stripeFilePurpose, "purpose");
        this.file = file2;
        this.purpose = stripeFilePurpose;
    }

    public static /* synthetic */ StripeFileParams copy$default(StripeFileParams stripeFileParams, File file2, StripeFilePurpose stripeFilePurpose, int i, Object obj) {
        if ((i & 1) != 0) {
            file2 = stripeFileParams.file;
        }
        if ((i & 2) != 0) {
            stripeFilePurpose = stripeFileParams.purpose;
        }
        return stripeFileParams.copy(file2, stripeFilePurpose);
    }

    public final File component1$payments_core_release() {
        return this.file;
    }

    public final StripeFilePurpose component2$payments_core_release() {
        return this.purpose;
    }

    public final StripeFileParams copy(File file2, StripeFilePurpose stripeFilePurpose) {
        i.e(file2, "file");
        i.e(stripeFilePurpose, "purpose");
        return new StripeFileParams(file2, stripeFilePurpose);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StripeFileParams)) {
            return false;
        }
        StripeFileParams stripeFileParams = (StripeFileParams) obj;
        return i.a(this.file, stripeFileParams.file) && i.a(this.purpose, stripeFileParams.purpose);
    }

    public final File getFile$payments_core_release() {
        return this.file;
    }

    public final StripeFilePurpose getPurpose$payments_core_release() {
        return this.purpose;
    }

    public int hashCode() {
        File file2 = this.file;
        int i = 0;
        int hashCode = (file2 != null ? file2.hashCode() : 0) * 31;
        StripeFilePurpose stripeFilePurpose = this.purpose;
        if (stripeFilePurpose != null) {
            i = stripeFilePurpose.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("StripeFileParams(file=");
        P0.append(this.file);
        P0.append(", purpose=");
        P0.append(this.purpose);
        P0.append(")");
        return P0.toString();
    }
}
