package com.stripe.android.stripe3ds2.transaction;

import android.os.Parcel;
import android.os.Parcelable;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.io.Serializable;
import java.util.UUID;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\b\u0018\u0000  2\u00020\u00012\u00020\u0002:\u0001 B\u0011\b\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\u001b\u0010\u001cB\u0011\b\u0010\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001b\u0010\u001fJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u0005¨\u0006!"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "", "toString", "()Ljava/lang/String;", "component1", "value", "copy", "(Ljava/lang/String;)Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getValue", "<init>", "(Ljava/lang/String;)V", "Ljava/util/UUID;", "uuidValue", "(Ljava/util/UUID;)V", "Companion", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: SdkTransactionId.kt */
public final class SdkTransactionId implements Parcelable, Serializable {
    public static final Parcelable.Creator<SdkTransactionId> CREATOR = new Creator();
    public static final Companion Companion = new Companion((f) null);
    private final String value;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId$Companion;", "", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "create", "()Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "<init>", "()V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: SdkTransactionId.kt */
    public static final class Companion {
        private Companion() {
        }

        public final SdkTransactionId create() {
            UUID randomUUID = UUID.randomUUID();
            i.d(randomUUID, "UUID.randomUUID()");
            return new SdkTransactionId(randomUUID);
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public static class Creator implements Parcelable.Creator<SdkTransactionId> {
        public final SdkTransactionId createFromParcel(Parcel parcel) {
            i.e(parcel, "in");
            return new SdkTransactionId(parcel.readString());
        }

        public final SdkTransactionId[] newArray(int i) {
            return new SdkTransactionId[i];
        }
    }

    public SdkTransactionId(String str) {
        i.e(str, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        this.value = str;
    }

    public static /* synthetic */ SdkTransactionId copy$default(SdkTransactionId sdkTransactionId, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sdkTransactionId.value;
        }
        return sdkTransactionId.copy(str);
    }

    public final String component1() {
        return this.value;
    }

    public final SdkTransactionId copy(String str) {
        i.e(str, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        return new SdkTransactionId(str);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof SdkTransactionId) && i.a(this.value, ((SdkTransactionId) obj).value);
        }
        return true;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.value;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return this.value;
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "parcel");
        parcel.writeString(this.value);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SdkTransactionId(java.util.UUID r2) {
        /*
            r1 = this;
            java.lang.String r0 = "uuidValue"
            m0.n.b.i.e(r2, r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = "uuidValue.toString()"
            m0.n.b.i.d(r2, r0)
            r1.<init>((java.lang.String) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.transaction.SdkTransactionId.<init>(java.util.UUID):void");
    }
}
