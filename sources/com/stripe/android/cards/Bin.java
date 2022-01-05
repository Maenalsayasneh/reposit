package com.stripe.android.cards;

import android.os.Parcel;
import android.os.Parcelable;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.stripe.android.model.StripeModel;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0011\b\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0007\u001a\u00020\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u0004¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/cards/Bin;", "Lcom/stripe/android/model/StripeModel;", "", "toString", "()Ljava/lang/String;", "component1$payments_core_release", "component1", "value", "copy", "(Ljava/lang/String;)Lcom/stripe/android/cards/Bin;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getValue$payments_core_release", "<init>", "(Ljava/lang/String;)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: Bin.kt */
public final class Bin implements StripeModel {
    private static final int BIN_LENGTH = 6;
    public static final Parcelable.Creator<Bin> CREATOR = new Creator();
    public static final Companion Companion = new Companion((f) null);
    private final String value;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/stripe/android/cards/Bin$Companion;", "", "", "cardNumber", "Lcom/stripe/android/cards/Bin;", "create", "(Ljava/lang/String;)Lcom/stripe/android/cards/Bin;", "", "BIN_LENGTH", "I", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: Bin.kt */
    public static final class Companion {
        private Companion() {
        }

        public final Bin create(String str) {
            i.e(str, "cardNumber");
            String S3 = a.S3(str, 6);
            if (!(S3.length() == 6)) {
                S3 = null;
            }
            if (S3 != null) {
                return new Bin(S3);
            }
            return null;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public static class Creator implements Parcelable.Creator<Bin> {
        public final Bin createFromParcel(Parcel parcel) {
            i.e(parcel, "in");
            return new Bin(parcel.readString());
        }

        public final Bin[] newArray(int i) {
            return new Bin[i];
        }
    }

    public Bin(String str) {
        i.e(str, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        this.value = str;
    }

    public static /* synthetic */ Bin copy$default(Bin bin, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bin.value;
        }
        return bin.copy(str);
    }

    public final String component1$payments_core_release() {
        return this.value;
    }

    public final Bin copy(String str) {
        i.e(str, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        return new Bin(str);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof Bin) && i.a(this.value, ((Bin) obj).value);
        }
        return true;
    }

    public final String getValue$payments_core_release() {
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
}
