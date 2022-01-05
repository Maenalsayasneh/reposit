package com.stripe.android.paymentsheet.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.StripeIntent;
import i0.d.a.a.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b/\u00100J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ>\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00022\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001aJ \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b$\u0010%R\u0019\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058F@\u0006¢\u0006\u0006\u001a\u0004\b&\u0010\bR\u0019\u0010\u0012\u001a\u00020\f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010(\u001a\u0004\b)\u0010\u000eR\u0019\u0010\u0011\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010*\u001a\u0004\b\u0011\u0010\u000bR\u0019\u0010\u000f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010+\u001a\u0004\b,\u0010\u0004R\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010-\u001a\u0004\b.\u0010\b¨\u00061"}, d2 = {"Lcom/stripe/android/paymentsheet/model/FragmentConfig;", "Landroid/os/Parcelable;", "Lcom/stripe/android/model/StripeIntent;", "component1", "()Lcom/stripe/android/model/StripeIntent;", "", "Lcom/stripe/android/model/PaymentMethod;", "component2", "()Ljava/util/List;", "", "component3", "()Z", "Lcom/stripe/android/paymentsheet/model/SavedSelection;", "component4", "()Lcom/stripe/android/paymentsheet/model/SavedSelection;", "stripeIntent", "paymentMethods", "isGooglePayReady", "savedSelection", "copy", "(Lcom/stripe/android/model/StripeIntent;Ljava/util/List;ZLcom/stripe/android/paymentsheet/model/SavedSelection;)Lcom/stripe/android/paymentsheet/model/FragmentConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "getSortedPaymentMethods", "sortedPaymentMethods", "Lcom/stripe/android/paymentsheet/model/SavedSelection;", "getSavedSelection", "Z", "Lcom/stripe/android/model/StripeIntent;", "getStripeIntent", "Ljava/util/List;", "getPaymentMethods", "<init>", "(Lcom/stripe/android/model/StripeIntent;Ljava/util/List;ZLcom/stripe/android/paymentsheet/model/SavedSelection;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: FragmentConfig.kt */
public final class FragmentConfig implements Parcelable {
    public static final Parcelable.Creator<FragmentConfig> CREATOR = new Creator();
    private final boolean isGooglePayReady;
    private final List<PaymentMethod> paymentMethods;
    private final SavedSelection savedSelection;
    private final StripeIntent stripeIntent;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public static class Creator implements Parcelable.Creator<FragmentConfig> {
        public final FragmentConfig createFromParcel(Parcel parcel) {
            i.e(parcel, "in");
            StripeIntent stripeIntent = (StripeIntent) parcel.readParcelable(FragmentConfig.class.getClassLoader());
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add(PaymentMethod.CREATOR.createFromParcel(parcel));
                readInt--;
            }
            return new FragmentConfig(stripeIntent, arrayList, parcel.readInt() != 0, (SavedSelection) parcel.readParcelable(FragmentConfig.class.getClassLoader()));
        }

        public final FragmentConfig[] newArray(int i) {
            return new FragmentConfig[i];
        }
    }

    public FragmentConfig(StripeIntent stripeIntent2, List<PaymentMethod> list, boolean z, SavedSelection savedSelection2) {
        i.e(stripeIntent2, "stripeIntent");
        i.e(list, "paymentMethods");
        i.e(savedSelection2, "savedSelection");
        this.stripeIntent = stripeIntent2;
        this.paymentMethods = list;
        this.isGooglePayReady = z;
        this.savedSelection = savedSelection2;
    }

    public static /* synthetic */ FragmentConfig copy$default(FragmentConfig fragmentConfig, StripeIntent stripeIntent2, List<PaymentMethod> list, boolean z, SavedSelection savedSelection2, int i, Object obj) {
        if ((i & 1) != 0) {
            stripeIntent2 = fragmentConfig.stripeIntent;
        }
        if ((i & 2) != 0) {
            list = fragmentConfig.paymentMethods;
        }
        if ((i & 4) != 0) {
            z = fragmentConfig.isGooglePayReady;
        }
        if ((i & 8) != 0) {
            savedSelection2 = fragmentConfig.savedSelection;
        }
        return fragmentConfig.copy(stripeIntent2, list, z, savedSelection2);
    }

    public final StripeIntent component1() {
        return this.stripeIntent;
    }

    public final List<PaymentMethod> component2() {
        return this.paymentMethods;
    }

    public final boolean component3() {
        return this.isGooglePayReady;
    }

    public final SavedSelection component4() {
        return this.savedSelection;
    }

    public final FragmentConfig copy(StripeIntent stripeIntent2, List<PaymentMethod> list, boolean z, SavedSelection savedSelection2) {
        i.e(stripeIntent2, "stripeIntent");
        i.e(list, "paymentMethods");
        i.e(savedSelection2, "savedSelection");
        return new FragmentConfig(stripeIntent2, list, z, savedSelection2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FragmentConfig)) {
            return false;
        }
        FragmentConfig fragmentConfig = (FragmentConfig) obj;
        return i.a(this.stripeIntent, fragmentConfig.stripeIntent) && i.a(this.paymentMethods, fragmentConfig.paymentMethods) && this.isGooglePayReady == fragmentConfig.isGooglePayReady && i.a(this.savedSelection, fragmentConfig.savedSelection);
    }

    public final List<PaymentMethod> getPaymentMethods() {
        return this.paymentMethods;
    }

    public final SavedSelection getSavedSelection() {
        return this.savedSelection;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.stripe.android.model.PaymentMethod> getSortedPaymentMethods() {
        /*
            r6 = this;
            com.stripe.android.paymentsheet.model.SavedSelection r0 = r6.savedSelection
            boolean r0 = r0 instanceof com.stripe.android.paymentsheet.model.SavedSelection.PaymentMethod
            r1 = 0
            r2 = -1
            if (r0 == 0) goto L_0x002f
            java.util.List<com.stripe.android.model.PaymentMethod> r0 = r6.paymentMethods
            java.util.Iterator r0 = r0.iterator()
            r3 = r1
        L_0x000f:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x002f
            java.lang.Object r4 = r0.next()
            com.stripe.android.model.PaymentMethod r4 = (com.stripe.android.model.PaymentMethod) r4
            java.lang.String r4 = r4.id
            com.stripe.android.paymentsheet.model.SavedSelection r5 = r6.savedSelection
            com.stripe.android.paymentsheet.model.SavedSelection$PaymentMethod r5 = (com.stripe.android.paymentsheet.model.SavedSelection.PaymentMethod) r5
            java.lang.String r5 = r5.getId()
            boolean r4 = m0.n.b.i.a(r4, r5)
            if (r4 == 0) goto L_0x002c
            goto L_0x0030
        L_0x002c:
            int r3 = r3 + 1
            goto L_0x000f
        L_0x002f:
            r3 = r2
        L_0x0030:
            if (r3 == r2) goto L_0x0045
            java.util.List<com.stripe.android.model.PaymentMethod> r0 = r6.paymentMethods
            java.util.List r0 = m0.j.g.A0(r0)
            r2 = r0
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r3 = r2.remove(r3)
            com.stripe.android.model.PaymentMethod r3 = (com.stripe.android.model.PaymentMethod) r3
            r2.add(r1, r3)
            goto L_0x0047
        L_0x0045:
            java.util.List<com.stripe.android.model.PaymentMethod> r0 = r6.paymentMethods
        L_0x0047:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.model.FragmentConfig.getSortedPaymentMethods():java.util.List");
    }

    public final StripeIntent getStripeIntent() {
        return this.stripeIntent;
    }

    public int hashCode() {
        StripeIntent stripeIntent2 = this.stripeIntent;
        int i = 0;
        int hashCode = (stripeIntent2 != null ? stripeIntent2.hashCode() : 0) * 31;
        List<PaymentMethod> list = this.paymentMethods;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        boolean z = this.isGooglePayReady;
        if (z) {
            z = true;
        }
        int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
        SavedSelection savedSelection2 = this.savedSelection;
        if (savedSelection2 != null) {
            i = savedSelection2.hashCode();
        }
        return i2 + i;
    }

    public final boolean isGooglePayReady() {
        return this.isGooglePayReady;
    }

    public String toString() {
        StringBuilder P0 = a.P0("FragmentConfig(stripeIntent=");
        P0.append(this.stripeIntent);
        P0.append(", paymentMethods=");
        P0.append(this.paymentMethods);
        P0.append(", isGooglePayReady=");
        P0.append(this.isGooglePayReady);
        P0.append(", savedSelection=");
        P0.append(this.savedSelection);
        P0.append(")");
        return P0.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "parcel");
        parcel.writeParcelable(this.stripeIntent, i);
        List<PaymentMethod> list = this.paymentMethods;
        parcel.writeInt(list.size());
        for (PaymentMethod writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, 0);
        }
        parcel.writeInt(this.isGooglePayReady ? 1 : 0);
        parcel.writeParcelable(this.savedSelection, i);
    }
}
