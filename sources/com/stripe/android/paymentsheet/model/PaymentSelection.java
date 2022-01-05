package com.stripe.android.paymentsheet.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.parsers.AccountRangeJsonParser;
import i0.d.a.a.a;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "Landroid/os/Parcelable;", "<init>", "()V", "GooglePay", "New", "Saved", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$GooglePay;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentSelection.kt */
public abstract class PaymentSelection implements Parcelable {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentSelection$GooglePay;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentSelection.kt */
    public static final class GooglePay extends PaymentSelection {
        public static final Parcelable.Creator<GooglePay> CREATOR = new Creator();
        public static final GooglePay INSTANCE = new GooglePay();

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<GooglePay> {
            public final GooglePay createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                if (parcel.readInt() != 0) {
                    return GooglePay.INSTANCE;
                }
                return null;
            }

            public final GooglePay[] newArray(int i) {
                return new GooglePay[i];
            }
        }

        private GooglePay() {
            super((f) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            parcel.writeInt(1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00028&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00068&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0001\u0001\r¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "", "getShouldSavePaymentMethod", "()Z", "shouldSavePaymentMethod", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "getPaymentMethodCreateParams", "()Lcom/stripe/android/model/PaymentMethodCreateParams;", "paymentMethodCreateParams", "<init>", "()V", "Card", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$Card;", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentSelection.kt */
    public static abstract class New extends PaymentSelection {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b'\u0010(J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0015J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001c\u0010\u000b\u001a\u00020\u00028\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b\"\u0010\u0004R\u0019\u0010\f\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010\u0007R\u001c\u0010\r\u001a\u00020\b8\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b&\u0010\n¨\u0006)"}, d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$Card;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "component1", "()Lcom/stripe/android/model/PaymentMethodCreateParams;", "Lcom/stripe/android/model/CardBrand;", "component2", "()Lcom/stripe/android/model/CardBrand;", "", "component3", "()Z", "paymentMethodCreateParams", "brand", "shouldSavePaymentMethod", "copy", "(Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/model/CardBrand;Z)Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$Card;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "getPaymentMethodCreateParams", "Lcom/stripe/android/model/CardBrand;", "getBrand", "Z", "getShouldSavePaymentMethod", "<init>", "(Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/model/CardBrand;Z)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentSelection.kt */
        public static final class Card extends New {
            public static final Parcelable.Creator<Card> CREATOR = new Creator();
            private final CardBrand brand;
            private final PaymentMethodCreateParams paymentMethodCreateParams;
            private final boolean shouldSavePaymentMethod;

            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
            public static class Creator implements Parcelable.Creator<Card> {
                public final Card createFromParcel(Parcel parcel) {
                    i.e(parcel, "in");
                    return new Card(PaymentMethodCreateParams.CREATOR.createFromParcel(parcel), (CardBrand) Enum.valueOf(CardBrand.class, parcel.readString()), parcel.readInt() != 0);
                }

                public final Card[] newArray(int i) {
                    return new Card[i];
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public Card(PaymentMethodCreateParams paymentMethodCreateParams2, CardBrand cardBrand, boolean z) {
                super((f) null);
                i.e(paymentMethodCreateParams2, "paymentMethodCreateParams");
                i.e(cardBrand, AccountRangeJsonParser.FIELD_BRAND);
                this.paymentMethodCreateParams = paymentMethodCreateParams2;
                this.brand = cardBrand;
                this.shouldSavePaymentMethod = z;
            }

            public static /* synthetic */ Card copy$default(Card card, PaymentMethodCreateParams paymentMethodCreateParams2, CardBrand cardBrand, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    paymentMethodCreateParams2 = card.getPaymentMethodCreateParams();
                }
                if ((i & 2) != 0) {
                    cardBrand = card.brand;
                }
                if ((i & 4) != 0) {
                    z = card.getShouldSavePaymentMethod();
                }
                return card.copy(paymentMethodCreateParams2, cardBrand, z);
            }

            public final PaymentMethodCreateParams component1() {
                return getPaymentMethodCreateParams();
            }

            public final CardBrand component2() {
                return this.brand;
            }

            public final boolean component3() {
                return getShouldSavePaymentMethod();
            }

            public final Card copy(PaymentMethodCreateParams paymentMethodCreateParams2, CardBrand cardBrand, boolean z) {
                i.e(paymentMethodCreateParams2, "paymentMethodCreateParams");
                i.e(cardBrand, AccountRangeJsonParser.FIELD_BRAND);
                return new Card(paymentMethodCreateParams2, cardBrand, z);
            }

            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Card)) {
                    return false;
                }
                Card card = (Card) obj;
                return i.a(getPaymentMethodCreateParams(), card.getPaymentMethodCreateParams()) && i.a(this.brand, card.brand) && getShouldSavePaymentMethod() == card.getShouldSavePaymentMethod();
            }

            public final CardBrand getBrand() {
                return this.brand;
            }

            public PaymentMethodCreateParams getPaymentMethodCreateParams() {
                return this.paymentMethodCreateParams;
            }

            public boolean getShouldSavePaymentMethod() {
                return this.shouldSavePaymentMethod;
            }

            public int hashCode() {
                PaymentMethodCreateParams paymentMethodCreateParams2 = getPaymentMethodCreateParams();
                int i = 0;
                int hashCode = (paymentMethodCreateParams2 != null ? paymentMethodCreateParams2.hashCode() : 0) * 31;
                CardBrand cardBrand = this.brand;
                if (cardBrand != null) {
                    i = cardBrand.hashCode();
                }
                int i2 = (hashCode + i) * 31;
                boolean shouldSavePaymentMethod2 = getShouldSavePaymentMethod();
                if (shouldSavePaymentMethod2) {
                    shouldSavePaymentMethod2 = true;
                }
                return i2 + (shouldSavePaymentMethod2 ? 1 : 0);
            }

            public String toString() {
                StringBuilder P0 = a.P0("Card(paymentMethodCreateParams=");
                P0.append(getPaymentMethodCreateParams());
                P0.append(", brand=");
                P0.append(this.brand);
                P0.append(", shouldSavePaymentMethod=");
                P0.append(getShouldSavePaymentMethod());
                P0.append(")");
                return P0.toString();
            }

            public void writeToParcel(Parcel parcel, int i) {
                i.e(parcel, "parcel");
                this.paymentMethodCreateParams.writeToParcel(parcel, 0);
                parcel.writeString(this.brand.name());
                parcel.writeInt(this.shouldSavePaymentMethod ? 1 : 0);
            }
        }

        private New() {
            super((f) null);
        }

        public abstract PaymentMethodCreateParams getPaymentMethodCreateParams();

        public abstract boolean getShouldSavePaymentMethod();

        public /* synthetic */ New(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u0004¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "Lcom/stripe/android/model/PaymentMethod;", "component1", "()Lcom/stripe/android/model/PaymentMethod;", "paymentMethod", "copy", "(Lcom/stripe/android/model/PaymentMethod;)Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/model/PaymentMethod;", "getPaymentMethod", "<init>", "(Lcom/stripe/android/model/PaymentMethod;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentSelection.kt */
    public static final class Saved extends PaymentSelection {
        public static final Parcelable.Creator<Saved> CREATOR = new Creator();
        private final PaymentMethod paymentMethod;

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<Saved> {
            public final Saved createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                return new Saved(PaymentMethod.CREATOR.createFromParcel(parcel));
            }

            public final Saved[] newArray(int i) {
                return new Saved[i];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Saved(PaymentMethod paymentMethod2) {
            super((f) null);
            i.e(paymentMethod2, "paymentMethod");
            this.paymentMethod = paymentMethod2;
        }

        public static /* synthetic */ Saved copy$default(Saved saved, PaymentMethod paymentMethod2, int i, Object obj) {
            if ((i & 1) != 0) {
                paymentMethod2 = saved.paymentMethod;
            }
            return saved.copy(paymentMethod2);
        }

        public final PaymentMethod component1() {
            return this.paymentMethod;
        }

        public final Saved copy(PaymentMethod paymentMethod2) {
            i.e(paymentMethod2, "paymentMethod");
            return new Saved(paymentMethod2);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof Saved) && i.a(this.paymentMethod, ((Saved) obj).paymentMethod);
            }
            return true;
        }

        public final PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        public int hashCode() {
            PaymentMethod paymentMethod2 = this.paymentMethod;
            if (paymentMethod2 != null) {
                return paymentMethod2.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder P0 = a.P0("Saved(paymentMethod=");
            P0.append(this.paymentMethod);
            P0.append(")");
            return P0.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            this.paymentMethod.writeToParcel(parcel, 0);
        }
    }

    private PaymentSelection() {
    }

    public /* synthetic */ PaymentSelection(f fVar) {
        this();
    }
}
