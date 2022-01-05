package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.SourceTypeModel;
import i0.d.a.a.a;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0000\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b)\u0010*J\u0010\u0010\u0003\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010\u000e8V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0010R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\"R\u0013\u0010$\u001a\u00020\u000e8F@\u0006¢\u0006\u0006\u001a\u0004\b#\u0010\u0010R\u0015\u0010(\u001a\u0004\u0018\u00010%8F@\u0006¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lcom/stripe/android/model/CustomerSource;", "Lcom/stripe/android/model/StripeModel;", "Lcom/stripe/android/model/StripePaymentSource;", "component1", "()Lcom/stripe/android/model/StripePaymentSource;", "Lcom/stripe/android/model/Source;", "asSource", "()Lcom/stripe/android/model/Source;", "Lcom/stripe/android/model/Card;", "asCard", "()Lcom/stripe/android/model/Card;", "stripePaymentSource", "copy", "(Lcom/stripe/android/model/StripePaymentSource;)Lcom/stripe/android/model/CustomerSource;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "getId", "id", "Lcom/stripe/android/model/StripePaymentSource;", "getSourceType", "sourceType", "Lcom/stripe/android/model/TokenizationMethod;", "getTokenizationMethod", "()Lcom/stripe/android/model/TokenizationMethod;", "tokenizationMethod", "<init>", "(Lcom/stripe/android/model/StripePaymentSource;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: CustomerSource.kt */
public final class CustomerSource implements StripeModel, StripePaymentSource {
    public static final Parcelable.Creator<CustomerSource> CREATOR = new Creator();
    private final StripePaymentSource stripePaymentSource;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public static class Creator implements Parcelable.Creator<CustomerSource> {
        public final CustomerSource createFromParcel(Parcel parcel) {
            i.e(parcel, "in");
            return new CustomerSource((StripePaymentSource) parcel.readParcelable(CustomerSource.class.getClassLoader()));
        }

        public final CustomerSource[] newArray(int i) {
            return new CustomerSource[i];
        }
    }

    public CustomerSource(StripePaymentSource stripePaymentSource2) {
        i.e(stripePaymentSource2, "stripePaymentSource");
        this.stripePaymentSource = stripePaymentSource2;
    }

    private final StripePaymentSource component1() {
        return this.stripePaymentSource;
    }

    public static /* synthetic */ CustomerSource copy$default(CustomerSource customerSource, StripePaymentSource stripePaymentSource2, int i, Object obj) {
        if ((i & 1) != 0) {
            stripePaymentSource2 = customerSource.stripePaymentSource;
        }
        return customerSource.copy(stripePaymentSource2);
    }

    public final Card asCard() {
        StripePaymentSource stripePaymentSource2 = this.stripePaymentSource;
        if (!(stripePaymentSource2 instanceof Card)) {
            stripePaymentSource2 = null;
        }
        return (Card) stripePaymentSource2;
    }

    public final Source asSource() {
        StripePaymentSource stripePaymentSource2 = this.stripePaymentSource;
        if (!(stripePaymentSource2 instanceof Source)) {
            stripePaymentSource2 = null;
        }
        return (Source) stripePaymentSource2;
    }

    public final CustomerSource copy(StripePaymentSource stripePaymentSource2) {
        i.e(stripePaymentSource2, "stripePaymentSource");
        return new CustomerSource(stripePaymentSource2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof CustomerSource) && i.a(this.stripePaymentSource, ((CustomerSource) obj).stripePaymentSource);
        }
        return true;
    }

    public String getId() {
        return this.stripePaymentSource.getId();
    }

    public final String getSourceType() {
        StripePaymentSource stripePaymentSource2 = this.stripePaymentSource;
        if (stripePaymentSource2 instanceof Card) {
            return "card";
        }
        return stripePaymentSource2 instanceof Source ? ((Source) stripePaymentSource2).getType() : "unknown";
    }

    public final TokenizationMethod getTokenizationMethod() {
        Source asSource = asSource();
        if (asSource != null) {
            TokenizationMethod tokenizationMethod = asSource.getSourceTypeModel() instanceof SourceTypeModel.Card ? ((SourceTypeModel.Card) asSource.getSourceTypeModel()).getTokenizationMethod() : null;
            if (tokenizationMethod != null) {
                return tokenizationMethod;
            }
        }
        Card asCard = asCard();
        if (asCard != null) {
            return asCard.getTokenizationMethod();
        }
        return null;
    }

    public int hashCode() {
        StripePaymentSource stripePaymentSource2 = this.stripePaymentSource;
        if (stripePaymentSource2 != null) {
            return stripePaymentSource2.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder P0 = a.P0("CustomerSource(stripePaymentSource=");
        P0.append(this.stripePaymentSource);
        P0.append(")");
        return P0.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "parcel");
        parcel.writeParcelable(this.stripePaymentSource, i);
    }
}
