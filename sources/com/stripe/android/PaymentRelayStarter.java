package com.stripe.android;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.ActivityOptionsCompat;
import com.stripe.android.exception.StripeException;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.Source;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.view.AuthActivityStarter;
import com.stripe.android.view.PaymentRelayActivity;
import h0.a.f.b;
import java.io.Serializable;
import java.util.Objects;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;
import n0.b.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/PaymentRelayStarter;", "Lcom/stripe/android/view/AuthActivityStarter;", "Lcom/stripe/android/PaymentRelayStarter$Args;", "Args", "Legacy", "Modern", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentRelayStarter.kt */
public interface PaymentRelayStarter extends AuthActivityStarter<Args> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u000b2\u00020\u0001:\u0005\u000b\f\r\u000e\u000fB\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00058&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0001\u0004\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/PaymentRelayStarter$Args;", "Landroid/os/Parcelable;", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "toResult", "()Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "", "getRequestCode", "()I", "requestCode", "<init>", "()V", "Companion", "ErrorArgs", "PaymentIntentArgs", "SetupIntentArgs", "SourceArgs", "Lcom/stripe/android/PaymentRelayStarter$Args$PaymentIntentArgs;", "Lcom/stripe/android/PaymentRelayStarter$Args$SetupIntentArgs;", "Lcom/stripe/android/PaymentRelayStarter$Args$SourceArgs;", "Lcom/stripe/android/PaymentRelayStarter$Args$ErrorArgs;", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentRelayStarter.kt */
    public static abstract class Args implements Parcelable {
        public static final Companion Companion = new Companion((f) null);

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/PaymentRelayStarter$Args$Companion;", "", "Lcom/stripe/android/model/StripeIntent;", "stripeIntent", "", "stripeAccountId", "Lcom/stripe/android/PaymentRelayStarter$Args;", "create", "(Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;)Lcom/stripe/android/PaymentRelayStarter$Args;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentRelayStarter.kt */
        public static final class Companion {
            private Companion() {
            }

            public static /* synthetic */ Args create$default(Companion companion, StripeIntent stripeIntent, String str, int i, Object obj) {
                if ((i & 2) != 0) {
                    str = null;
                }
                return companion.create(stripeIntent, str);
            }

            public final Args create(StripeIntent stripeIntent, String str) {
                i.e(stripeIntent, "stripeIntent");
                if (stripeIntent instanceof PaymentIntent) {
                    return new PaymentIntentArgs((PaymentIntent) stripeIntent, str);
                }
                if (stripeIntent instanceof SetupIntent) {
                    return new SetupIntentArgs((SetupIntent) stripeIntent, str);
                }
                throw new IllegalStateException("StripeIntent must either be a PaymentIntent or SetupIntent.".toString());
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\b\u0018\u0000 &2\u00020\u0001:\u0001&B\u0017\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b$\u0010%J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\b\u001a\u00020\u0005HÀ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\n\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000bJ\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bJ \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010\f\u001a\u00020\u00058\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b!\u0010\u0007R\u001c\u0010\r\u001a\u00020\t8\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\r\u0010\"\u001a\u0004\b#\u0010\u000b¨\u0006'"}, d2 = {"Lcom/stripe/android/PaymentRelayStarter$Args$ErrorArgs;", "Lcom/stripe/android/PaymentRelayStarter$Args;", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "toResult", "()Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "Lcom/stripe/android/exception/StripeException;", "component1$payments_core_release", "()Lcom/stripe/android/exception/StripeException;", "component1", "", "component2", "()I", "exception", "requestCode", "copy", "(Lcom/stripe/android/exception/StripeException;I)Lcom/stripe/android/PaymentRelayStarter$Args$ErrorArgs;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/exception/StripeException;", "getException$payments_core_release", "I", "getRequestCode", "<init>", "(Lcom/stripe/android/exception/StripeException;I)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentRelayStarter.kt */
        public static final class ErrorArgs extends Args {
            public static final Parcelable.Creator<ErrorArgs> CREATOR = new Creator();
            public static final Companion Companion = new Companion((f) null);
            private final StripeException exception;
            private final int requestCode;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\n\u001a\u00020\t*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/PaymentRelayStarter$Args$ErrorArgs$Companion;", "Ln0/b/a;", "Lcom/stripe/android/PaymentRelayStarter$Args$ErrorArgs;", "Landroid/os/Parcel;", "parcel", "create", "(Landroid/os/Parcel;)Lcom/stripe/android/PaymentRelayStarter$Args$ErrorArgs;", "", "flags", "Lm0/i;", "write", "(Lcom/stripe/android/PaymentRelayStarter$Args$ErrorArgs;Landroid/os/Parcel;I)V", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
            /* compiled from: PaymentRelayStarter.kt */
            public static final class Companion implements a<ErrorArgs> {
                private Companion() {
                }

                public ErrorArgs[] newArray(int i) {
                    m0.r.t.a.r.m.a1.a.P2(this);
                    throw null;
                }

                public /* synthetic */ Companion(f fVar) {
                    this();
                }

                public ErrorArgs create(Parcel parcel) {
                    i.e(parcel, "parcel");
                    Serializable readSerializable = parcel.readSerializable();
                    Objects.requireNonNull(readSerializable, "null cannot be cast to non-null type com.stripe.android.exception.StripeException");
                    return new ErrorArgs((StripeException) readSerializable, parcel.readInt());
                }

                public void write(ErrorArgs errorArgs, Parcel parcel, int i) {
                    i.e(errorArgs, "$this$write");
                    i.e(parcel, "parcel");
                    parcel.writeSerializable(errorArgs.getException$payments_core_release());
                    parcel.writeInt(errorArgs.getRequestCode());
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
            public static class Creator implements Parcelable.Creator<ErrorArgs> {
                public final ErrorArgs createFromParcel(Parcel parcel) {
                    i.e(parcel, "in");
                    return ErrorArgs.Companion.create(parcel);
                }

                public final ErrorArgs[] newArray(int i) {
                    return new ErrorArgs[i];
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public ErrorArgs(StripeException stripeException, int i) {
                super((f) null);
                i.e(stripeException, "exception");
                this.exception = stripeException;
                this.requestCode = i;
            }

            public static /* synthetic */ ErrorArgs copy$default(ErrorArgs errorArgs, StripeException stripeException, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    stripeException = errorArgs.exception;
                }
                if ((i2 & 2) != 0) {
                    i = errorArgs.getRequestCode();
                }
                return errorArgs.copy(stripeException, i);
            }

            public final StripeException component1$payments_core_release() {
                return this.exception;
            }

            public final int component2() {
                return getRequestCode();
            }

            public final ErrorArgs copy(StripeException stripeException, int i) {
                i.e(stripeException, "exception");
                return new ErrorArgs(stripeException, i);
            }

            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ErrorArgs)) {
                    return false;
                }
                ErrorArgs errorArgs = (ErrorArgs) obj;
                return i.a(this.exception, errorArgs.exception) && getRequestCode() == errorArgs.getRequestCode();
            }

            public final StripeException getException$payments_core_release() {
                return this.exception;
            }

            public int getRequestCode() {
                return this.requestCode;
            }

            public int hashCode() {
                StripeException stripeException = this.exception;
                return Integer.hashCode(getRequestCode()) + ((stripeException != null ? stripeException.hashCode() : 0) * 31);
            }

            public PaymentFlowResult.Unvalidated toResult() {
                return new PaymentFlowResult.Unvalidated((String) null, 0, this.exception, false, (String) null, (Source) null, (String) null, 123, (f) null);
            }

            public String toString() {
                StringBuilder P0 = i0.d.a.a.a.P0("ErrorArgs(exception=");
                P0.append(this.exception);
                P0.append(", requestCode=");
                P0.append(getRequestCode());
                P0.append(")");
                return P0.toString();
            }

            public void writeToParcel(Parcel parcel, int i) {
                i.e(parcel, "parcel");
                Companion.write(this, parcel, i);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b'\u0010(J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\b\u001a\u00020\u0005HÀ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\f\u001a\u0004\u0018\u00010\tHÀ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u000e\u0010!\u001a\u0004\b\"\u0010\u000bR\u0016\u0010$\u001a\u00020\u00128V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0014R\u001c\u0010\r\u001a\u00020\u00058\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b&\u0010\u0007¨\u0006)"}, d2 = {"Lcom/stripe/android/PaymentRelayStarter$Args$PaymentIntentArgs;", "Lcom/stripe/android/PaymentRelayStarter$Args;", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "toResult", "()Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "Lcom/stripe/android/model/PaymentIntent;", "component1$payments_core_release", "()Lcom/stripe/android/model/PaymentIntent;", "component1", "", "component2$payments_core_release", "()Ljava/lang/String;", "component2", "paymentIntent", "stripeAccountId", "copy", "(Lcom/stripe/android/model/PaymentIntent;Ljava/lang/String;)Lcom/stripe/android/PaymentRelayStarter$Args$PaymentIntentArgs;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getStripeAccountId$payments_core_release", "getRequestCode", "requestCode", "Lcom/stripe/android/model/PaymentIntent;", "getPaymentIntent$payments_core_release", "<init>", "(Lcom/stripe/android/model/PaymentIntent;Ljava/lang/String;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentRelayStarter.kt */
        public static final class PaymentIntentArgs extends Args {
            public static final Parcelable.Creator<PaymentIntentArgs> CREATOR = new Creator();
            private final PaymentIntent paymentIntent;
            private final String stripeAccountId;

            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
            public static class Creator implements Parcelable.Creator<PaymentIntentArgs> {
                public final PaymentIntentArgs createFromParcel(Parcel parcel) {
                    i.e(parcel, "in");
                    return new PaymentIntentArgs(PaymentIntent.CREATOR.createFromParcel(parcel), parcel.readString());
                }

                public final PaymentIntentArgs[] newArray(int i) {
                    return new PaymentIntentArgs[i];
                }
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ PaymentIntentArgs(PaymentIntent paymentIntent2, String str, int i, f fVar) {
                this(paymentIntent2, (i & 2) != 0 ? null : str);
            }

            public static /* synthetic */ PaymentIntentArgs copy$default(PaymentIntentArgs paymentIntentArgs, PaymentIntent paymentIntent2, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    paymentIntent2 = paymentIntentArgs.paymentIntent;
                }
                if ((i & 2) != 0) {
                    str = paymentIntentArgs.stripeAccountId;
                }
                return paymentIntentArgs.copy(paymentIntent2, str);
            }

            public final PaymentIntent component1$payments_core_release() {
                return this.paymentIntent;
            }

            public final String component2$payments_core_release() {
                return this.stripeAccountId;
            }

            public final PaymentIntentArgs copy(PaymentIntent paymentIntent2, String str) {
                i.e(paymentIntent2, "paymentIntent");
                return new PaymentIntentArgs(paymentIntent2, str);
            }

            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PaymentIntentArgs)) {
                    return false;
                }
                PaymentIntentArgs paymentIntentArgs = (PaymentIntentArgs) obj;
                return i.a(this.paymentIntent, paymentIntentArgs.paymentIntent) && i.a(this.stripeAccountId, paymentIntentArgs.stripeAccountId);
            }

            public final PaymentIntent getPaymentIntent$payments_core_release() {
                return this.paymentIntent;
            }

            public int getRequestCode() {
                return StripePaymentController.PAYMENT_REQUEST_CODE;
            }

            public final String getStripeAccountId$payments_core_release() {
                return this.stripeAccountId;
            }

            public int hashCode() {
                PaymentIntent paymentIntent2 = this.paymentIntent;
                int i = 0;
                int hashCode = (paymentIntent2 != null ? paymentIntent2.hashCode() : 0) * 31;
                String str = this.stripeAccountId;
                if (str != null) {
                    i = str.hashCode();
                }
                return hashCode + i;
            }

            public PaymentFlowResult.Unvalidated toResult() {
                return new PaymentFlowResult.Unvalidated(this.paymentIntent.getClientSecret(), 0, (StripeException) null, false, (String) null, (Source) null, this.stripeAccountId, 62, (f) null);
            }

            public String toString() {
                StringBuilder P0 = i0.d.a.a.a.P0("PaymentIntentArgs(paymentIntent=");
                P0.append(this.paymentIntent);
                P0.append(", stripeAccountId=");
                return i0.d.a.a.a.y0(P0, this.stripeAccountId, ")");
            }

            public void writeToParcel(Parcel parcel, int i) {
                i.e(parcel, "parcel");
                this.paymentIntent.writeToParcel(parcel, 0);
                parcel.writeString(this.stripeAccountId);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public PaymentIntentArgs(PaymentIntent paymentIntent2, String str) {
                super((f) null);
                i.e(paymentIntent2, "paymentIntent");
                this.paymentIntent = paymentIntent2;
                this.stripeAccountId = str;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b'\u0010(J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\b\u001a\u00020\u0005HÀ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\f\u001a\u0004\u0018\u00010\tHÀ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020\u00128V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0014R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u000e\u0010#\u001a\u0004\b$\u0010\u000bR\u001c\u0010\r\u001a\u00020\u00058\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b&\u0010\u0007¨\u0006)"}, d2 = {"Lcom/stripe/android/PaymentRelayStarter$Args$SetupIntentArgs;", "Lcom/stripe/android/PaymentRelayStarter$Args;", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "toResult", "()Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "Lcom/stripe/android/model/SetupIntent;", "component1$payments_core_release", "()Lcom/stripe/android/model/SetupIntent;", "component1", "", "component2$payments_core_release", "()Ljava/lang/String;", "component2", "setupIntent", "stripeAccountId", "copy", "(Lcom/stripe/android/model/SetupIntent;Ljava/lang/String;)Lcom/stripe/android/PaymentRelayStarter$Args$SetupIntentArgs;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "getRequestCode", "requestCode", "Ljava/lang/String;", "getStripeAccountId$payments_core_release", "Lcom/stripe/android/model/SetupIntent;", "getSetupIntent$payments_core_release", "<init>", "(Lcom/stripe/android/model/SetupIntent;Ljava/lang/String;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentRelayStarter.kt */
        public static final class SetupIntentArgs extends Args {
            public static final Parcelable.Creator<SetupIntentArgs> CREATOR = new Creator();
            private final SetupIntent setupIntent;
            private final String stripeAccountId;

            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
            public static class Creator implements Parcelable.Creator<SetupIntentArgs> {
                public final SetupIntentArgs createFromParcel(Parcel parcel) {
                    i.e(parcel, "in");
                    return new SetupIntentArgs(SetupIntent.CREATOR.createFromParcel(parcel), parcel.readString());
                }

                public final SetupIntentArgs[] newArray(int i) {
                    return new SetupIntentArgs[i];
                }
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ SetupIntentArgs(SetupIntent setupIntent2, String str, int i, f fVar) {
                this(setupIntent2, (i & 2) != 0 ? null : str);
            }

            public static /* synthetic */ SetupIntentArgs copy$default(SetupIntentArgs setupIntentArgs, SetupIntent setupIntent2, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    setupIntent2 = setupIntentArgs.setupIntent;
                }
                if ((i & 2) != 0) {
                    str = setupIntentArgs.stripeAccountId;
                }
                return setupIntentArgs.copy(setupIntent2, str);
            }

            public final SetupIntent component1$payments_core_release() {
                return this.setupIntent;
            }

            public final String component2$payments_core_release() {
                return this.stripeAccountId;
            }

            public final SetupIntentArgs copy(SetupIntent setupIntent2, String str) {
                i.e(setupIntent2, "setupIntent");
                return new SetupIntentArgs(setupIntent2, str);
            }

            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SetupIntentArgs)) {
                    return false;
                }
                SetupIntentArgs setupIntentArgs = (SetupIntentArgs) obj;
                return i.a(this.setupIntent, setupIntentArgs.setupIntent) && i.a(this.stripeAccountId, setupIntentArgs.stripeAccountId);
            }

            public int getRequestCode() {
                return StripePaymentController.SETUP_REQUEST_CODE;
            }

            public final SetupIntent getSetupIntent$payments_core_release() {
                return this.setupIntent;
            }

            public final String getStripeAccountId$payments_core_release() {
                return this.stripeAccountId;
            }

            public int hashCode() {
                SetupIntent setupIntent2 = this.setupIntent;
                int i = 0;
                int hashCode = (setupIntent2 != null ? setupIntent2.hashCode() : 0) * 31;
                String str = this.stripeAccountId;
                if (str != null) {
                    i = str.hashCode();
                }
                return hashCode + i;
            }

            public PaymentFlowResult.Unvalidated toResult() {
                return new PaymentFlowResult.Unvalidated(this.setupIntent.getClientSecret(), 0, (StripeException) null, false, (String) null, (Source) null, this.stripeAccountId, 62, (f) null);
            }

            public String toString() {
                StringBuilder P0 = i0.d.a.a.a.P0("SetupIntentArgs(setupIntent=");
                P0.append(this.setupIntent);
                P0.append(", stripeAccountId=");
                return i0.d.a.a.a.y0(P0, this.stripeAccountId, ")");
            }

            public void writeToParcel(Parcel parcel, int i) {
                i.e(parcel, "parcel");
                this.setupIntent.writeToParcel(parcel, 0);
                parcel.writeString(this.stripeAccountId);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public SetupIntentArgs(SetupIntent setupIntent2, String str) {
                super((f) null);
                i.e(setupIntent2, "setupIntent");
                this.setupIntent = setupIntent2;
                this.stripeAccountId = str;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b'\u0010(J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\b\u001a\u00020\u0005HÀ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\f\u001a\u0004\u0018\u00010\tHÀ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001c\u0010\r\u001a\u00020\u00058\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b\"\u0010\u0007R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u000e\u0010#\u001a\u0004\b$\u0010\u000bR\u0016\u0010&\u001a\u00020\u00128V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0014¨\u0006)"}, d2 = {"Lcom/stripe/android/PaymentRelayStarter$Args$SourceArgs;", "Lcom/stripe/android/PaymentRelayStarter$Args;", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "toResult", "()Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "Lcom/stripe/android/model/Source;", "component1$payments_core_release", "()Lcom/stripe/android/model/Source;", "component1", "", "component2$payments_core_release", "()Ljava/lang/String;", "component2", "source", "stripeAccountId", "copy", "(Lcom/stripe/android/model/Source;Ljava/lang/String;)Lcom/stripe/android/PaymentRelayStarter$Args$SourceArgs;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/model/Source;", "getSource$payments_core_release", "Ljava/lang/String;", "getStripeAccountId$payments_core_release", "getRequestCode", "requestCode", "<init>", "(Lcom/stripe/android/model/Source;Ljava/lang/String;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentRelayStarter.kt */
        public static final class SourceArgs extends Args {
            public static final Parcelable.Creator<SourceArgs> CREATOR = new Creator();
            private final Source source;
            private final String stripeAccountId;

            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
            public static class Creator implements Parcelable.Creator<SourceArgs> {
                public final SourceArgs createFromParcel(Parcel parcel) {
                    i.e(parcel, "in");
                    return new SourceArgs(Source.CREATOR.createFromParcel(parcel), parcel.readString());
                }

                public final SourceArgs[] newArray(int i) {
                    return new SourceArgs[i];
                }
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ SourceArgs(Source source2, String str, int i, f fVar) {
                this(source2, (i & 2) != 0 ? null : str);
            }

            public static /* synthetic */ SourceArgs copy$default(SourceArgs sourceArgs, Source source2, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    source2 = sourceArgs.source;
                }
                if ((i & 2) != 0) {
                    str = sourceArgs.stripeAccountId;
                }
                return sourceArgs.copy(source2, str);
            }

            public final Source component1$payments_core_release() {
                return this.source;
            }

            public final String component2$payments_core_release() {
                return this.stripeAccountId;
            }

            public final SourceArgs copy(Source source2, String str) {
                i.e(source2, Stripe3ds2AuthParams.FIELD_SOURCE);
                return new SourceArgs(source2, str);
            }

            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SourceArgs)) {
                    return false;
                }
                SourceArgs sourceArgs = (SourceArgs) obj;
                return i.a(this.source, sourceArgs.source) && i.a(this.stripeAccountId, sourceArgs.stripeAccountId);
            }

            public int getRequestCode() {
                return StripePaymentController.SOURCE_REQUEST_CODE;
            }

            public final Source getSource$payments_core_release() {
                return this.source;
            }

            public final String getStripeAccountId$payments_core_release() {
                return this.stripeAccountId;
            }

            public int hashCode() {
                Source source2 = this.source;
                int i = 0;
                int hashCode = (source2 != null ? source2.hashCode() : 0) * 31;
                String str = this.stripeAccountId;
                if (str != null) {
                    i = str.hashCode();
                }
                return hashCode + i;
            }

            public PaymentFlowResult.Unvalidated toResult() {
                return new PaymentFlowResult.Unvalidated((String) null, 0, (StripeException) null, false, (String) null, this.source, this.stripeAccountId, 31, (f) null);
            }

            public String toString() {
                StringBuilder P0 = i0.d.a.a.a.P0("SourceArgs(source=");
                P0.append(this.source);
                P0.append(", stripeAccountId=");
                return i0.d.a.a.a.y0(P0, this.stripeAccountId, ")");
            }

            public void writeToParcel(Parcel parcel, int i) {
                i.e(parcel, "parcel");
                this.source.writeToParcel(parcel, 0);
                parcel.writeString(this.stripeAccountId);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public SourceArgs(Source source2, String str) {
                super((f) null);
                i.e(source2, Stripe3ds2AuthParams.FIELD_SOURCE);
                this.source = source2;
                this.stripeAccountId = str;
            }
        }

        private Args() {
        }

        public abstract int getRequestCode();

        public abstract PaymentFlowResult.Unvalidated toResult();

        public /* synthetic */ Args(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/stripe/android/PaymentRelayStarter$Legacy;", "Lcom/stripe/android/PaymentRelayStarter;", "Lcom/stripe/android/PaymentRelayStarter$Args;", "args", "Lm0/i;", "start", "(Lcom/stripe/android/PaymentRelayStarter$Args;)V", "Lcom/stripe/android/view/AuthActivityStarter$Host;", "host", "Lcom/stripe/android/view/AuthActivityStarter$Host;", "<init>", "(Lcom/stripe/android/view/AuthActivityStarter$Host;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentRelayStarter.kt */
    public static final class Legacy implements PaymentRelayStarter {
        private final AuthActivityStarter.Host host;

        public Legacy(AuthActivityStarter.Host host2) {
            i.e(host2, "host");
            this.host = host2;
        }

        public void start(Args args) {
            i.e(args, "args");
            this.host.startActivityForResult$payments_core_release(PaymentRelayActivity.class, args.toResult().toBundle(), args.getRequestCode());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/stripe/android/PaymentRelayStarter$Modern;", "Lcom/stripe/android/PaymentRelayStarter;", "Lcom/stripe/android/PaymentRelayStarter$Args;", "args", "Lm0/i;", "start", "(Lcom/stripe/android/PaymentRelayStarter$Args;)V", "Lh0/a/f/b;", "launcher", "Lh0/a/f/b;", "<init>", "(Lh0/a/f/b;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentRelayStarter.kt */
    public static final class Modern implements PaymentRelayStarter {
        private final b<Args> launcher;

        public Modern(b<Args> bVar) {
            i.e(bVar, "launcher");
            this.launcher = bVar;
        }

        public void start(Args args) {
            i.e(args, "args");
            this.launcher.a(args, (ActivityOptionsCompat) null);
        }
    }
}
