package com.stripe.android.paymentsheet.flowcontroller;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.model.ClientSecret;
import com.stripe.android.paymentsheet.model.SavedSelection;
import i0.d.a.a.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\b\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b\u0012\u0006\u0010\u001c\u001a\u00020\u0011\u0012\u0006\u0010\u001d\u001a\u00020\u0014¢\u0006\u0004\b=\u0010>J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000bHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0012\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016Jd\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\b2\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\u00112\b\b\u0002\u0010\u001d\u001a\u00020\u0014HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020\u00142\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020#HÖ\u0001¢\u0006\u0004\b*\u0010%J \u0010/\u001a\u00020.2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020#HÖ\u0001¢\u0006\u0004\b/\u00100R\u0019\u0010\u001c\u001a\u00020\u00118\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u00101\u001a\u0004\b2\u0010\u0013R\u0019\u0010\u001d\u001a\u00020\u00148\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u00103\u001a\u0004\b\u001d\u0010\u0016R\u001f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u00104\u001a\u0004\b5\u0010\u000eR\u0019\u0010\u0019\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u00106\u001a\u0004\b7\u0010\nR\u001f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u00104\u001a\u0004\b8\u0010\u000eR\u0019\u0010\u0018\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u00109\u001a\u0004\b:\u0010\u0007R\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010;\u001a\u0004\b<\u0010\u0004¨\u0006?"}, d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/InitData;", "Landroid/os/Parcelable;", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "component1", "()Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "Lcom/stripe/android/paymentsheet/model/ClientSecret;", "component2", "()Lcom/stripe/android/paymentsheet/model/ClientSecret;", "Lcom/stripe/android/model/StripeIntent;", "component3", "()Lcom/stripe/android/model/StripeIntent;", "", "Lcom/stripe/android/model/PaymentMethod$Type;", "component4", "()Ljava/util/List;", "Lcom/stripe/android/model/PaymentMethod;", "component5", "Lcom/stripe/android/paymentsheet/model/SavedSelection;", "component6", "()Lcom/stripe/android/paymentsheet/model/SavedSelection;", "", "component7", "()Z", "config", "clientSecret", "stripeIntent", "paymentMethodTypes", "paymentMethods", "savedSelection", "isGooglePayReady", "copy", "(Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lcom/stripe/android/paymentsheet/model/ClientSecret;Lcom/stripe/android/model/StripeIntent;Ljava/util/List;Ljava/util/List;Lcom/stripe/android/paymentsheet/model/SavedSelection;Z)Lcom/stripe/android/paymentsheet/flowcontroller/InitData;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/paymentsheet/model/SavedSelection;", "getSavedSelection", "Z", "Ljava/util/List;", "getPaymentMethodTypes", "Lcom/stripe/android/model/StripeIntent;", "getStripeIntent", "getPaymentMethods", "Lcom/stripe/android/paymentsheet/model/ClientSecret;", "getClientSecret", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "getConfig", "<init>", "(Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lcom/stripe/android/paymentsheet/model/ClientSecret;Lcom/stripe/android/model/StripeIntent;Ljava/util/List;Ljava/util/List;Lcom/stripe/android/paymentsheet/model/SavedSelection;Z)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: InitData.kt */
public final class InitData implements Parcelable {
    public static final Parcelable.Creator<InitData> CREATOR = new Creator();
    private final ClientSecret clientSecret;
    private final PaymentSheet.Configuration config;
    private final boolean isGooglePayReady;
    private final List<PaymentMethod.Type> paymentMethodTypes;
    private final List<PaymentMethod> paymentMethods;
    private final SavedSelection savedSelection;
    private final StripeIntent stripeIntent;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public static class Creator implements Parcelable.Creator<InitData> {
        public final InitData createFromParcel(Parcel parcel) {
            i.e(parcel, "in");
            PaymentSheet.Configuration createFromParcel = parcel.readInt() != 0 ? PaymentSheet.Configuration.CREATOR.createFromParcel(parcel) : null;
            ClientSecret clientSecret = (ClientSecret) parcel.readParcelable(InitData.class.getClassLoader());
            StripeIntent stripeIntent = (StripeIntent) parcel.readParcelable(InitData.class.getClassLoader());
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add((PaymentMethod.Type) Enum.valueOf(PaymentMethod.Type.class, parcel.readString()));
                readInt--;
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            while (readInt2 != 0) {
                arrayList2.add(PaymentMethod.CREATOR.createFromParcel(parcel));
                readInt2--;
            }
            return new InitData(createFromParcel, clientSecret, stripeIntent, arrayList, arrayList2, (SavedSelection) parcel.readParcelable(InitData.class.getClassLoader()), parcel.readInt() != 0);
        }

        public final InitData[] newArray(int i) {
            return new InitData[i];
        }
    }

    public InitData(PaymentSheet.Configuration configuration, ClientSecret clientSecret2, StripeIntent stripeIntent2, List<? extends PaymentMethod.Type> list, List<PaymentMethod> list2, SavedSelection savedSelection2, boolean z) {
        i.e(clientSecret2, "clientSecret");
        i.e(stripeIntent2, "stripeIntent");
        i.e(list, "paymentMethodTypes");
        i.e(list2, "paymentMethods");
        i.e(savedSelection2, "savedSelection");
        this.config = configuration;
        this.clientSecret = clientSecret2;
        this.stripeIntent = stripeIntent2;
        this.paymentMethodTypes = list;
        this.paymentMethods = list2;
        this.savedSelection = savedSelection2;
        this.isGooglePayReady = z;
    }

    public static /* synthetic */ InitData copy$default(InitData initData, PaymentSheet.Configuration configuration, ClientSecret clientSecret2, StripeIntent stripeIntent2, List<PaymentMethod.Type> list, List<PaymentMethod> list2, SavedSelection savedSelection2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            configuration = initData.config;
        }
        if ((i & 2) != 0) {
            clientSecret2 = initData.clientSecret;
        }
        ClientSecret clientSecret3 = clientSecret2;
        if ((i & 4) != 0) {
            stripeIntent2 = initData.stripeIntent;
        }
        StripeIntent stripeIntent3 = stripeIntent2;
        if ((i & 8) != 0) {
            list = initData.paymentMethodTypes;
        }
        List<PaymentMethod.Type> list3 = list;
        if ((i & 16) != 0) {
            list2 = initData.paymentMethods;
        }
        List<PaymentMethod> list4 = list2;
        if ((i & 32) != 0) {
            savedSelection2 = initData.savedSelection;
        }
        SavedSelection savedSelection3 = savedSelection2;
        if ((i & 64) != 0) {
            z = initData.isGooglePayReady;
        }
        return initData.copy(configuration, clientSecret3, stripeIntent3, list3, list4, savedSelection3, z);
    }

    public final PaymentSheet.Configuration component1() {
        return this.config;
    }

    public final ClientSecret component2() {
        return this.clientSecret;
    }

    public final StripeIntent component3() {
        return this.stripeIntent;
    }

    public final List<PaymentMethod.Type> component4() {
        return this.paymentMethodTypes;
    }

    public final List<PaymentMethod> component5() {
        return this.paymentMethods;
    }

    public final SavedSelection component6() {
        return this.savedSelection;
    }

    public final boolean component7() {
        return this.isGooglePayReady;
    }

    public final InitData copy(PaymentSheet.Configuration configuration, ClientSecret clientSecret2, StripeIntent stripeIntent2, List<? extends PaymentMethod.Type> list, List<PaymentMethod> list2, SavedSelection savedSelection2, boolean z) {
        i.e(clientSecret2, "clientSecret");
        i.e(stripeIntent2, "stripeIntent");
        i.e(list, "paymentMethodTypes");
        i.e(list2, "paymentMethods");
        i.e(savedSelection2, "savedSelection");
        return new InitData(configuration, clientSecret2, stripeIntent2, list, list2, savedSelection2, z);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InitData)) {
            return false;
        }
        InitData initData = (InitData) obj;
        return i.a(this.config, initData.config) && i.a(this.clientSecret, initData.clientSecret) && i.a(this.stripeIntent, initData.stripeIntent) && i.a(this.paymentMethodTypes, initData.paymentMethodTypes) && i.a(this.paymentMethods, initData.paymentMethods) && i.a(this.savedSelection, initData.savedSelection) && this.isGooglePayReady == initData.isGooglePayReady;
    }

    public final ClientSecret getClientSecret() {
        return this.clientSecret;
    }

    public final PaymentSheet.Configuration getConfig() {
        return this.config;
    }

    public final List<PaymentMethod.Type> getPaymentMethodTypes() {
        return this.paymentMethodTypes;
    }

    public final List<PaymentMethod> getPaymentMethods() {
        return this.paymentMethods;
    }

    public final SavedSelection getSavedSelection() {
        return this.savedSelection;
    }

    public final StripeIntent getStripeIntent() {
        return this.stripeIntent;
    }

    public int hashCode() {
        PaymentSheet.Configuration configuration = this.config;
        int i = 0;
        int hashCode = (configuration != null ? configuration.hashCode() : 0) * 31;
        ClientSecret clientSecret2 = this.clientSecret;
        int hashCode2 = (hashCode + (clientSecret2 != null ? clientSecret2.hashCode() : 0)) * 31;
        StripeIntent stripeIntent2 = this.stripeIntent;
        int hashCode3 = (hashCode2 + (stripeIntent2 != null ? stripeIntent2.hashCode() : 0)) * 31;
        List<PaymentMethod.Type> list = this.paymentMethodTypes;
        int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        List<PaymentMethod> list2 = this.paymentMethods;
        int hashCode5 = (hashCode4 + (list2 != null ? list2.hashCode() : 0)) * 31;
        SavedSelection savedSelection2 = this.savedSelection;
        if (savedSelection2 != null) {
            i = savedSelection2.hashCode();
        }
        int i2 = (hashCode5 + i) * 31;
        boolean z = this.isGooglePayReady;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public final boolean isGooglePayReady() {
        return this.isGooglePayReady;
    }

    public String toString() {
        StringBuilder P0 = a.P0("InitData(config=");
        P0.append(this.config);
        P0.append(", clientSecret=");
        P0.append(this.clientSecret);
        P0.append(", stripeIntent=");
        P0.append(this.stripeIntent);
        P0.append(", paymentMethodTypes=");
        P0.append(this.paymentMethodTypes);
        P0.append(", paymentMethods=");
        P0.append(this.paymentMethods);
        P0.append(", savedSelection=");
        P0.append(this.savedSelection);
        P0.append(", isGooglePayReady=");
        return a.D0(P0, this.isGooglePayReady, ")");
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "parcel");
        PaymentSheet.Configuration configuration = this.config;
        if (configuration != null) {
            parcel.writeInt(1);
            configuration.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeParcelable(this.clientSecret, i);
        parcel.writeParcelable(this.stripeIntent, i);
        List<PaymentMethod.Type> list = this.paymentMethodTypes;
        parcel.writeInt(list.size());
        for (PaymentMethod.Type name : list) {
            parcel.writeString(name.name());
        }
        List<PaymentMethod> list2 = this.paymentMethods;
        parcel.writeInt(list2.size());
        for (PaymentMethod writeToParcel : list2) {
            writeToParcel.writeToParcel(parcel, 0);
        }
        parcel.writeParcelable(this.savedSelection, i);
        parcel.writeInt(this.isGooglePayReady ? 1 : 0);
    }
}
