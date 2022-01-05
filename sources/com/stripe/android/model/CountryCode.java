package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.d.a.a.a;
import java.util.Locale;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\u0004J\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u0004¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/model/CountryCode;", "Landroid/os/Parcelable;", "", "component1", "()Ljava/lang/String;", "value", "copy", "(Ljava/lang/String;)Lcom/stripe/android/model/CountryCode;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getValue", "<init>", "(Ljava/lang/String;)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: CountryCode.kt */
public final class CountryCode implements Parcelable {
    /* access modifiers changed from: private */
    public static final CountryCode CA = new CountryCode("CA");
    public static final Parcelable.Creator<CountryCode> CREATOR = new Creator();
    public static final Companion Companion = new Companion((f) null);
    /* access modifiers changed from: private */
    public static final CountryCode GB = new CountryCode("GB");
    /* access modifiers changed from: private */
    public static final CountryCode US = new CountryCode("US");
    private final String value;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0011\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u0019\u0010\u0013\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/model/CountryCode$Companion;", "", "Lcom/stripe/android/model/CountryCode;", "countryCode", "", "isUS", "(Lcom/stripe/android/model/CountryCode;)Z", "isCA", "isGB", "", "value", "create", "(Ljava/lang/String;)Lcom/stripe/android/model/CountryCode;", "CA", "Lcom/stripe/android/model/CountryCode;", "getCA", "()Lcom/stripe/android/model/CountryCode;", "US", "getUS", "GB", "getGB", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: CountryCode.kt */
    public static final class Companion {
        private Companion() {
        }

        public final CountryCode create(String str) {
            i.e(str, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            Locale locale = Locale.ROOT;
            i.d(locale, "Locale.ROOT");
            String upperCase = str.toUpperCase(locale);
            i.d(upperCase, "(this as java.lang.String).toUpperCase(locale)");
            return new CountryCode(upperCase, (f) null);
        }

        public final CountryCode getCA() {
            return CountryCode.CA;
        }

        public final CountryCode getGB() {
            return CountryCode.GB;
        }

        public final CountryCode getUS() {
            return CountryCode.US;
        }

        public final boolean isCA(CountryCode countryCode) {
            return i.a(countryCode, getCA());
        }

        public final boolean isGB(CountryCode countryCode) {
            return i.a(countryCode, getGB());
        }

        public final boolean isUS(CountryCode countryCode) {
            return i.a(countryCode, getUS());
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public static class Creator implements Parcelable.Creator<CountryCode> {
        public final CountryCode createFromParcel(Parcel parcel) {
            i.e(parcel, "in");
            return new CountryCode(parcel.readString());
        }

        public final CountryCode[] newArray(int i) {
            return new CountryCode[i];
        }
    }

    private CountryCode(String str) {
        this.value = str;
    }

    public static /* synthetic */ CountryCode copy$default(CountryCode countryCode, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = countryCode.value;
        }
        return countryCode.copy(str);
    }

    public final String component1() {
        return this.value;
    }

    public final CountryCode copy(String str) {
        i.e(str, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        return new CountryCode(str);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof CountryCode) && i.a(this.value, ((CountryCode) obj).value);
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
        return a.y0(a.P0("CountryCode(value="), this.value, ")");
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "parcel");
        parcel.writeString(this.value);
    }

    public /* synthetic */ CountryCode(String str, f fVar) {
        this(str);
    }
}
