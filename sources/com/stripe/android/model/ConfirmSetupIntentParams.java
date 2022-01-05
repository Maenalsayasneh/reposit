package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.MandateDataParams;
import com.stripe.android.model.PaymentMethodCreateParams;
import i0.d.a.a.a;
import i0.j.f.p.h;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import m0.j.g;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\b\b\u0018\u0000 G2\u00020\u00012\u00020\u0002:\u0001GBW\b\u0000\u0012\u0006\u0010\u001b\u001a\u00020\n\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\bE\u0010FJ\u0010\u0010\u0004\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\nHÀ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0012HÀ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000fJ\u0012\u0010\u0017\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u000fJ\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ`\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\n2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u001f\u001a\u00020\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0018HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b$\u0010\u000fJ\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010)\u001a\u00020\u00032\b\u0010(\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020%HÖ\u0001¢\u0006\u0004\b+\u0010'J \u00100\u001a\u00020/2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020%HÖ\u0001¢\u0006\u0004\b0\u00101R$\u00103\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8B@\u0002X\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\rR$\u0010!\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b!\u00104\u001a\u0004\b5\u0010\u001a\"\u0004\b6\u00107R$\u0010 \u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b \u00108\u001a\u0004\b9\u0010\u000f\"\u0004\b:\u0010;R$\u0010\u001e\u001a\u0004\u0018\u00010\n8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u001e\u00108\u001a\u0004\b<\u0010\u000f\"\u0004\b=\u0010;R\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u00128\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u001d\u0010>\u001a\u0004\b?\u0010\u0014R\u001e\u0010\u001c\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u001c\u00108\u001a\u0004\b@\u0010\u000fR\u001c\u0010\u001b\u001a\u00020\n8\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\u001b\u00108\u001a\u0004\bA\u0010\u000fR\"\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8B@\u0002X\u0004¢\u0006\u0006\u001a\u0004\bB\u0010\rR\u0016\u0010\u001f\u001a\u00020\u00038\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010D¨\u0006H"}, d2 = {"Lcom/stripe/android/model/ConfirmSetupIntentParams;", "Lcom/stripe/android/model/ConfirmStripeIntentParams;", "Landroid/os/Parcelable;", "", "component5", "()Z", "shouldUseStripeSdk", "withShouldUseStripeSdk", "(Z)Lcom/stripe/android/model/ConfirmSetupIntentParams;", "", "", "", "toParamMap", "()Ljava/util/Map;", "component1", "()Ljava/lang/String;", "component2$payments_core_release", "component2", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "component3$payments_core_release", "()Lcom/stripe/android/model/PaymentMethodCreateParams;", "component3", "component4", "component6", "Lcom/stripe/android/model/MandateDataParams;", "component7", "()Lcom/stripe/android/model/MandateDataParams;", "clientSecret", "paymentMethodId", "paymentMethodCreateParams", "returnUrl", "useStripeSdk", "mandateId", "mandateData", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;ZLjava/lang/String;Lcom/stripe/android/model/MandateDataParams;)Lcom/stripe/android/model/ConfirmSetupIntentParams;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "getMandateDataParams", "mandateDataParams", "Lcom/stripe/android/model/MandateDataParams;", "getMandateData", "setMandateData", "(Lcom/stripe/android/model/MandateDataParams;)V", "Ljava/lang/String;", "getMandateId", "setMandateId", "(Ljava/lang/String;)V", "getReturnUrl", "setReturnUrl", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "getPaymentMethodCreateParams$payments_core_release", "getPaymentMethodId$payments_core_release", "getClientSecret", "getPaymentMethodParamMap", "paymentMethodParamMap", "Z", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;ZLjava/lang/String;Lcom/stripe/android/model/MandateDataParams;)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ConfirmSetupIntentParams.kt */
public final class ConfirmSetupIntentParams implements ConfirmStripeIntentParams, Parcelable {
    public static final Parcelable.Creator<ConfirmSetupIntentParams> CREATOR = new Creator();
    public static final Companion Companion = new Companion((f) null);
    private final String clientSecret;
    private MandateDataParams mandateData;
    private String mandateId;
    private final PaymentMethodCreateParams paymentMethodCreateParams;
    private final String paymentMethodId;
    private String returnUrl;
    private final boolean useStripeSdk;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\bJ7\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\r\u0010\u000eJA\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\r\u0010\u000fJ7\u0010\r\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\r\u0010\u0012JA\u0010\r\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\r\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/model/ConfirmSetupIntentParams$Companion;", "", "", "clientSecret", "Lcom/stripe/android/model/ConfirmSetupIntentParams;", "createWithoutPaymentMethod", "(Ljava/lang/String;)Lcom/stripe/android/model/ConfirmSetupIntentParams;", "returnUrl", "(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/ConfirmSetupIntentParams;", "paymentMethodId", "Lcom/stripe/android/model/MandateDataParams;", "mandateData", "mandateId", "create", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/MandateDataParams;Ljava/lang/String;)Lcom/stripe/android/model/ConfirmSetupIntentParams;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/MandateDataParams;)Lcom/stripe/android/model/ConfirmSetupIntentParams;", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "paymentMethodCreateParams", "(Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;Lcom/stripe/android/model/MandateDataParams;Ljava/lang/String;)Lcom/stripe/android/model/ConfirmSetupIntentParams;", "(Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/MandateDataParams;)Lcom/stripe/android/model/ConfirmSetupIntentParams;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: ConfirmSetupIntentParams.kt */
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ ConfirmSetupIntentParams create$default(Companion companion, String str, String str2, MandateDataParams mandateDataParams, String str3, int i, Object obj) {
            if ((i & 4) != 0) {
                mandateDataParams = null;
            }
            if ((i & 8) != 0) {
                str3 = null;
            }
            return companion.create(str, str2, mandateDataParams, str3);
        }

        public final ConfirmSetupIntentParams create(PaymentMethodCreateParams paymentMethodCreateParams, String str) {
            return create$default(this, paymentMethodCreateParams, str, (MandateDataParams) null, (String) null, 12, (Object) null);
        }

        public final ConfirmSetupIntentParams create(PaymentMethodCreateParams paymentMethodCreateParams, String str, MandateDataParams mandateDataParams) {
            return create$default(this, paymentMethodCreateParams, str, mandateDataParams, (String) null, 8, (Object) null);
        }

        public final ConfirmSetupIntentParams create(PaymentMethodCreateParams paymentMethodCreateParams, String str, String str2) {
            return create$default(this, paymentMethodCreateParams, str, str2, (String) null, (MandateDataParams) null, 24, (Object) null);
        }

        public final ConfirmSetupIntentParams create(PaymentMethodCreateParams paymentMethodCreateParams, String str, String str2, String str3) {
            return create$default(this, paymentMethodCreateParams, str, str2, str3, (MandateDataParams) null, 16, (Object) null);
        }

        public final ConfirmSetupIntentParams create(String str, String str2) {
            return create$default(this, str, str2, (MandateDataParams) null, (String) null, 12, (Object) null);
        }

        public final ConfirmSetupIntentParams create(String str, String str2, MandateDataParams mandateDataParams) {
            return create$default(this, str, str2, mandateDataParams, (String) null, 8, (Object) null);
        }

        public final ConfirmSetupIntentParams create(String str, String str2, MandateDataParams mandateDataParams, String str3) {
            i.e(str, "paymentMethodId");
            i.e(str2, "clientSecret");
            return new ConfirmSetupIntentParams(str2, str, (PaymentMethodCreateParams) null, (String) null, false, str3, mandateDataParams, 28, (f) null);
        }

        public final ConfirmSetupIntentParams create(String str, String str2, String str3) {
            return create$default(this, str, str2, str3, (String) null, (MandateDataParams) null, 24, (Object) null);
        }

        public final ConfirmSetupIntentParams create(String str, String str2, String str3, String str4) {
            return create$default(this, str, str2, str3, str4, (MandateDataParams) null, 16, (Object) null);
        }

        public final ConfirmSetupIntentParams createWithoutPaymentMethod(String str) {
            i.e(str, "clientSecret");
            return new ConfirmSetupIntentParams(str, (String) null, (PaymentMethodCreateParams) null, (String) null, false, (String) null, (MandateDataParams) null, 126, (f) null);
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public static /* synthetic */ ConfirmSetupIntentParams create$default(Companion companion, String str, String str2, String str3, String str4, MandateDataParams mandateDataParams, int i, Object obj) {
            return companion.create(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : mandateDataParams);
        }

        public final ConfirmSetupIntentParams create(String str, String str2, String str3, String str4, MandateDataParams mandateDataParams) {
            i.e(str, "paymentMethodId");
            String str5 = str2;
            i.e(str2, "clientSecret");
            return new ConfirmSetupIntentParams(str5, str, (PaymentMethodCreateParams) null, str3, false, str4, mandateDataParams, 20, (f) null);
        }

        public final ConfirmSetupIntentParams createWithoutPaymentMethod(String str, String str2) {
            i.e(str, "clientSecret");
            return new ConfirmSetupIntentParams(str, (String) null, (PaymentMethodCreateParams) null, str2, false, (String) null, (MandateDataParams) null, 118, (f) null);
        }

        public static /* synthetic */ ConfirmSetupIntentParams create$default(Companion companion, PaymentMethodCreateParams paymentMethodCreateParams, String str, MandateDataParams mandateDataParams, String str2, int i, Object obj) {
            if ((i & 4) != 0) {
                mandateDataParams = null;
            }
            if ((i & 8) != 0) {
                str2 = null;
            }
            return companion.create(paymentMethodCreateParams, str, mandateDataParams, str2);
        }

        public final ConfirmSetupIntentParams create(PaymentMethodCreateParams paymentMethodCreateParams, String str, MandateDataParams mandateDataParams, String str2) {
            i.e(paymentMethodCreateParams, "paymentMethodCreateParams");
            i.e(str, "clientSecret");
            return new ConfirmSetupIntentParams(str, (String) null, paymentMethodCreateParams, (String) null, false, str2, mandateDataParams, 26, (f) null);
        }

        public static /* synthetic */ ConfirmSetupIntentParams create$default(Companion companion, PaymentMethodCreateParams paymentMethodCreateParams, String str, String str2, String str3, MandateDataParams mandateDataParams, int i, Object obj) {
            return companion.create(paymentMethodCreateParams, str, str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : mandateDataParams);
        }

        public final ConfirmSetupIntentParams create(PaymentMethodCreateParams paymentMethodCreateParams, String str, String str2, String str3, MandateDataParams mandateDataParams) {
            i.e(paymentMethodCreateParams, "paymentMethodCreateParams");
            String str4 = str;
            i.e(str, "clientSecret");
            return new ConfirmSetupIntentParams(str4, (String) null, paymentMethodCreateParams, str2, false, str3, mandateDataParams, 18, (f) null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public static class Creator implements Parcelable.Creator<ConfirmSetupIntentParams> {
        public final ConfirmSetupIntentParams createFromParcel(Parcel parcel) {
            i.e(parcel, "in");
            return new ConfirmSetupIntentParams(parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? PaymentMethodCreateParams.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0 ? MandateDataParams.CREATOR.createFromParcel(parcel) : null);
        }

        public final ConfirmSetupIntentParams[] newArray(int i) {
            return new ConfirmSetupIntentParams[i];
        }
    }

    public ConfirmSetupIntentParams(String str, String str2, PaymentMethodCreateParams paymentMethodCreateParams2, String str3, boolean z, String str4, MandateDataParams mandateDataParams) {
        i.e(str, "clientSecret");
        this.clientSecret = str;
        this.paymentMethodId = str2;
        this.paymentMethodCreateParams = paymentMethodCreateParams2;
        this.returnUrl = str3;
        this.useStripeSdk = z;
        this.mandateId = str4;
        this.mandateData = mandateDataParams;
    }

    private final boolean component5() {
        return this.useStripeSdk;
    }

    public static /* synthetic */ ConfirmSetupIntentParams copy$default(ConfirmSetupIntentParams confirmSetupIntentParams, String str, String str2, PaymentMethodCreateParams paymentMethodCreateParams2, String str3, boolean z, String str4, MandateDataParams mandateDataParams, int i, Object obj) {
        if ((i & 1) != 0) {
            str = confirmSetupIntentParams.getClientSecret();
        }
        if ((i & 2) != 0) {
            str2 = confirmSetupIntentParams.paymentMethodId;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            paymentMethodCreateParams2 = confirmSetupIntentParams.paymentMethodCreateParams;
        }
        PaymentMethodCreateParams paymentMethodCreateParams3 = paymentMethodCreateParams2;
        if ((i & 8) != 0) {
            str3 = confirmSetupIntentParams.getReturnUrl();
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            z = confirmSetupIntentParams.useStripeSdk;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            str4 = confirmSetupIntentParams.mandateId;
        }
        String str7 = str4;
        if ((i & 64) != 0) {
            mandateDataParams = confirmSetupIntentParams.mandateData;
        }
        return confirmSetupIntentParams.copy(str, str5, paymentMethodCreateParams3, str6, z2, str7, mandateDataParams);
    }

    public static final ConfirmSetupIntentParams create(PaymentMethodCreateParams paymentMethodCreateParams2, String str) {
        return Companion.create$default(Companion, paymentMethodCreateParams2, str, (MandateDataParams) null, (String) null, 12, (Object) null);
    }

    public static final ConfirmSetupIntentParams create(PaymentMethodCreateParams paymentMethodCreateParams2, String str, MandateDataParams mandateDataParams) {
        return Companion.create$default(Companion, paymentMethodCreateParams2, str, mandateDataParams, (String) null, 8, (Object) null);
    }

    public static final ConfirmSetupIntentParams create(PaymentMethodCreateParams paymentMethodCreateParams2, String str, MandateDataParams mandateDataParams, String str2) {
        return Companion.create(paymentMethodCreateParams2, str, mandateDataParams, str2);
    }

    public static final ConfirmSetupIntentParams create(PaymentMethodCreateParams paymentMethodCreateParams2, String str, String str2) {
        return Companion.create$default(Companion, paymentMethodCreateParams2, str, str2, (String) null, (MandateDataParams) null, 24, (Object) null);
    }

    public static final ConfirmSetupIntentParams create(PaymentMethodCreateParams paymentMethodCreateParams2, String str, String str2, String str3) {
        return Companion.create$default(Companion, paymentMethodCreateParams2, str, str2, str3, (MandateDataParams) null, 16, (Object) null);
    }

    public static final ConfirmSetupIntentParams create(PaymentMethodCreateParams paymentMethodCreateParams2, String str, String str2, String str3, MandateDataParams mandateDataParams) {
        return Companion.create(paymentMethodCreateParams2, str, str2, str3, mandateDataParams);
    }

    public static final ConfirmSetupIntentParams create(String str, String str2) {
        return Companion.create$default(Companion, str, str2, (MandateDataParams) null, (String) null, 12, (Object) null);
    }

    public static final ConfirmSetupIntentParams create(String str, String str2, MandateDataParams mandateDataParams) {
        return Companion.create$default(Companion, str, str2, mandateDataParams, (String) null, 8, (Object) null);
    }

    public static final ConfirmSetupIntentParams create(String str, String str2, MandateDataParams mandateDataParams, String str3) {
        return Companion.create(str, str2, mandateDataParams, str3);
    }

    public static final ConfirmSetupIntentParams create(String str, String str2, String str3) {
        return Companion.create$default(Companion, str, str2, str3, (String) null, (MandateDataParams) null, 24, (Object) null);
    }

    public static final ConfirmSetupIntentParams create(String str, String str2, String str3, String str4) {
        return Companion.create$default(Companion, str, str2, str3, str4, (MandateDataParams) null, 16, (Object) null);
    }

    public static final ConfirmSetupIntentParams create(String str, String str2, String str3, String str4, MandateDataParams mandateDataParams) {
        return Companion.create(str, str2, str3, str4, mandateDataParams);
    }

    public static final ConfirmSetupIntentParams createWithoutPaymentMethod(String str) {
        return Companion.createWithoutPaymentMethod(str);
    }

    public static final ConfirmSetupIntentParams createWithoutPaymentMethod(String str, String str2) {
        return Companion.createWithoutPaymentMethod(str, str2);
    }

    private final Map<String, Object> getMandateDataParams() {
        PaymentMethodCreateParams.Type type$payments_core_release;
        Map<String, Object> paramMap;
        MandateDataParams mandateDataParams = this.mandateData;
        if (mandateDataParams != null && (paramMap = mandateDataParams.toParamMap()) != null) {
            return paramMap;
        }
        PaymentMethodCreateParams paymentMethodCreateParams2 = this.paymentMethodCreateParams;
        if (paymentMethodCreateParams2 == null || (type$payments_core_release = paymentMethodCreateParams2.getType$payments_core_release()) == null || !type$payments_core_release.getHasMandate() || this.mandateId != null) {
            return null;
        }
        return new MandateDataParams(MandateDataParams.Type.Online.Companion.getDEFAULT$payments_core_release()).toParamMap();
    }

    private final Map<String, Object> getPaymentMethodParamMap() {
        PaymentMethodCreateParams paymentMethodCreateParams2 = this.paymentMethodCreateParams;
        if (paymentMethodCreateParams2 != null) {
            return h.S2(new Pair("payment_method_data", paymentMethodCreateParams2.toParamMap()));
        }
        String str = this.paymentMethodId;
        if (str != null) {
            return h.S2(new Pair("payment_method", str));
        }
        return g.o();
    }

    public final String component1() {
        return getClientSecret();
    }

    public final String component2$payments_core_release() {
        return this.paymentMethodId;
    }

    public final PaymentMethodCreateParams component3$payments_core_release() {
        return this.paymentMethodCreateParams;
    }

    public final String component4() {
        return getReturnUrl();
    }

    public final String component6() {
        return this.mandateId;
    }

    public final MandateDataParams component7() {
        return this.mandateData;
    }

    public final ConfirmSetupIntentParams copy(String str, String str2, PaymentMethodCreateParams paymentMethodCreateParams2, String str3, boolean z, String str4, MandateDataParams mandateDataParams) {
        i.e(str, "clientSecret");
        return new ConfirmSetupIntentParams(str, str2, paymentMethodCreateParams2, str3, z, str4, mandateDataParams);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfirmSetupIntentParams)) {
            return false;
        }
        ConfirmSetupIntentParams confirmSetupIntentParams = (ConfirmSetupIntentParams) obj;
        return i.a(getClientSecret(), confirmSetupIntentParams.getClientSecret()) && i.a(this.paymentMethodId, confirmSetupIntentParams.paymentMethodId) && i.a(this.paymentMethodCreateParams, confirmSetupIntentParams.paymentMethodCreateParams) && i.a(getReturnUrl(), confirmSetupIntentParams.getReturnUrl()) && this.useStripeSdk == confirmSetupIntentParams.useStripeSdk && i.a(this.mandateId, confirmSetupIntentParams.mandateId) && i.a(this.mandateData, confirmSetupIntentParams.mandateData);
    }

    public /* synthetic */ String getClientSecret() {
        return this.clientSecret;
    }

    public final MandateDataParams getMandateData() {
        return this.mandateData;
    }

    public final String getMandateId() {
        return this.mandateId;
    }

    public final /* synthetic */ PaymentMethodCreateParams getPaymentMethodCreateParams$payments_core_release() {
        return this.paymentMethodCreateParams;
    }

    public final /* synthetic */ String getPaymentMethodId$payments_core_release() {
        return this.paymentMethodId;
    }

    public String getReturnUrl() {
        return this.returnUrl;
    }

    public int hashCode() {
        String clientSecret2 = getClientSecret();
        int i = 0;
        int hashCode = (clientSecret2 != null ? clientSecret2.hashCode() : 0) * 31;
        String str = this.paymentMethodId;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        PaymentMethodCreateParams paymentMethodCreateParams2 = this.paymentMethodCreateParams;
        int hashCode3 = (hashCode2 + (paymentMethodCreateParams2 != null ? paymentMethodCreateParams2.hashCode() : 0)) * 31;
        String returnUrl2 = getReturnUrl();
        int hashCode4 = (hashCode3 + (returnUrl2 != null ? returnUrl2.hashCode() : 0)) * 31;
        boolean z = this.useStripeSdk;
        if (z) {
            z = true;
        }
        int i2 = (hashCode4 + (z ? 1 : 0)) * 31;
        String str2 = this.mandateId;
        int hashCode5 = (i2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        MandateDataParams mandateDataParams = this.mandateData;
        if (mandateDataParams != null) {
            i = mandateDataParams.hashCode();
        }
        return hashCode5 + i;
    }

    public final void setMandateData(MandateDataParams mandateDataParams) {
        this.mandateData = mandateDataParams;
    }

    public final void setMandateId(String str) {
        this.mandateId = str;
    }

    public void setReturnUrl(String str) {
        this.returnUrl = str;
    }

    public boolean shouldUseStripeSdk() {
        return this.useStripeSdk;
    }

    public Map<String, Object> toParamMap() {
        Map N = g.N(new Pair("client_secret", getClientSecret()), new Pair("use_stripe_sdk", Boolean.valueOf(this.useStripeSdk)));
        String returnUrl2 = getReturnUrl();
        Map map = null;
        Map S2 = returnUrl2 != null ? h.S2(new Pair("return_url", returnUrl2)) : null;
        if (S2 == null) {
            S2 = g.o();
        }
        Map b0 = g.b0(N, S2);
        String str = this.mandateId;
        Map S22 = str != null ? h.S2(new Pair("mandate", str)) : null;
        if (S22 == null) {
            S22 = g.o();
        }
        Map b02 = g.b0(b0, S22);
        Map<String, Object> mandateDataParams = getMandateDataParams();
        if (mandateDataParams != null) {
            map = h.S2(new Pair("mandate_data", mandateDataParams));
        }
        if (map == null) {
            map = g.o();
        }
        return g.b0(g.b0(b02, map), getPaymentMethodParamMap());
    }

    public String toString() {
        StringBuilder P0 = a.P0("ConfirmSetupIntentParams(clientSecret=");
        P0.append(getClientSecret());
        P0.append(", paymentMethodId=");
        P0.append(this.paymentMethodId);
        P0.append(", paymentMethodCreateParams=");
        P0.append(this.paymentMethodCreateParams);
        P0.append(", returnUrl=");
        P0.append(getReturnUrl());
        P0.append(", useStripeSdk=");
        P0.append(this.useStripeSdk);
        P0.append(", mandateId=");
        P0.append(this.mandateId);
        P0.append(", mandateData=");
        P0.append(this.mandateData);
        P0.append(")");
        return P0.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "parcel");
        parcel.writeString(this.clientSecret);
        parcel.writeString(this.paymentMethodId);
        PaymentMethodCreateParams paymentMethodCreateParams2 = this.paymentMethodCreateParams;
        if (paymentMethodCreateParams2 != null) {
            parcel.writeInt(1);
            paymentMethodCreateParams2.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.returnUrl);
        parcel.writeInt(this.useStripeSdk ? 1 : 0);
        parcel.writeString(this.mandateId);
        MandateDataParams mandateDataParams = this.mandateData;
        if (mandateDataParams != null) {
            parcel.writeInt(1);
            mandateDataParams.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ConfirmSetupIntentParams(java.lang.String r8, java.lang.String r9, com.stripe.android.model.PaymentMethodCreateParams r10, java.lang.String r11, boolean r12, java.lang.String r13, com.stripe.android.model.MandateDataParams r14, int r15, m0.n.b.f r16) {
        /*
            r7 = this;
            r0 = r15 & 2
            r1 = 0
            if (r0 == 0) goto L_0x0007
            r0 = r1
            goto L_0x0008
        L_0x0007:
            r0 = r9
        L_0x0008:
            r2 = r15 & 4
            if (r2 == 0) goto L_0x000e
            r2 = r1
            goto L_0x000f
        L_0x000e:
            r2 = r10
        L_0x000f:
            r3 = r15 & 8
            if (r3 == 0) goto L_0x0015
            r3 = r1
            goto L_0x0016
        L_0x0015:
            r3 = r11
        L_0x0016:
            r4 = r15 & 16
            if (r4 == 0) goto L_0x001c
            r4 = 0
            goto L_0x001d
        L_0x001c:
            r4 = r12
        L_0x001d:
            r5 = r15 & 32
            if (r5 == 0) goto L_0x0023
            r5 = r1
            goto L_0x0024
        L_0x0023:
            r5 = r13
        L_0x0024:
            r6 = r15 & 64
            if (r6 == 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            r1 = r14
        L_0x002a:
            r9 = r7
            r10 = r8
            r11 = r0
            r12 = r2
            r13 = r3
            r14 = r4
            r15 = r5
            r16 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.ConfirmSetupIntentParams.<init>(java.lang.String, java.lang.String, com.stripe.android.model.PaymentMethodCreateParams, java.lang.String, boolean, java.lang.String, com.stripe.android.model.MandateDataParams, int, m0.n.b.f):void");
    }

    public ConfirmSetupIntentParams withShouldUseStripeSdk(boolean z) {
        return copy$default(this, (String) null, (String) null, (PaymentMethodCreateParams) null, (String) null, z, (String) null, (MandateDataParams) null, 111, (Object) null);
    }
}
