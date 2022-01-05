package com.stripe.android.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.stripe.android.ObjectBuilder;
import com.stripe.android.PaymentSessionConfig;
import com.stripe.android.PaymentSessionData;
import com.stripe.android.view.ActivityStarter;
import i0.d.a.a.a;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000e\rB\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/view/PaymentFlowActivityStarter;", "Lcom/stripe/android/view/ActivityStarter;", "Lcom/stripe/android/view/PaymentFlowActivity;", "Lcom/stripe/android/view/PaymentFlowActivityStarter$Args;", "Landroid/app/Activity;", "activity", "Lcom/stripe/android/PaymentSessionConfig;", "config", "<init>", "(Landroid/app/Activity;Lcom/stripe/android/PaymentSessionConfig;)V", "Landroidx/fragment/app/Fragment;", "fragment", "(Landroidx/fragment/app/Fragment;Lcom/stripe/android/PaymentSessionConfig;)V", "Companion", "Args", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentFlowActivityStarter.kt */
public final class PaymentFlowActivityStarter extends ActivityStarter<PaymentFlowActivity, Args> {
    public static final Companion Companion = new Companion((f) null);
    public static final int REQUEST_CODE = 6002;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\b\u0018\u0000 22\u00020\u0001:\u000232B/\b\u0000\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0014\u001a\u00020\n\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b0\u00101J\u0010\u0010\u0005\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0006HÀ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\nHÀ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u000eHÀ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J:\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\n2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b!\u0010\u001cJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b&\u0010'R\u001c\u0010\u0012\u001a\u00020\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0012\u0010(\u001a\u0004\b)\u0010\u0004R\u001c\u0010\u0013\u001a\u00020\u00068\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0013\u0010*\u001a\u0004\b+\u0010\bR\u001c\u0010\u0014\u001a\u00020\n8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0014\u0010,\u001a\u0004\b-\u0010\fR\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0015\u0010.\u001a\u0004\b/\u0010\u0010¨\u00064"}, d2 = {"Lcom/stripe/android/view/PaymentFlowActivityStarter$Args;", "Lcom/stripe/android/view/ActivityStarter$Args;", "Lcom/stripe/android/PaymentSessionConfig;", "component1$payments_core_release", "()Lcom/stripe/android/PaymentSessionConfig;", "component1", "Lcom/stripe/android/PaymentSessionData;", "component2$payments_core_release", "()Lcom/stripe/android/PaymentSessionData;", "component2", "", "component3$payments_core_release", "()Z", "component3", "", "component4$payments_core_release", "()Ljava/lang/Integer;", "component4", "paymentSessionConfig", "paymentSessionData", "isPaymentSessionActive", "windowFlags", "copy", "(Lcom/stripe/android/PaymentSessionConfig;Lcom/stripe/android/PaymentSessionData;ZLjava/lang/Integer;)Lcom/stripe/android/view/PaymentFlowActivityStarter$Args;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/PaymentSessionConfig;", "getPaymentSessionConfig$payments_core_release", "Lcom/stripe/android/PaymentSessionData;", "getPaymentSessionData$payments_core_release", "Z", "isPaymentSessionActive$payments_core_release", "Ljava/lang/Integer;", "getWindowFlags$payments_core_release", "<init>", "(Lcom/stripe/android/PaymentSessionConfig;Lcom/stripe/android/PaymentSessionData;ZLjava/lang/Integer;)V", "Companion", "Builder", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentFlowActivityStarter.kt */
    public static final class Args implements ActivityStarter.Args {
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        public static final Companion Companion = new Companion((f) null);
        private final boolean isPaymentSessionActive;
        private final PaymentSessionConfig paymentSessionConfig;
        private final PaymentSessionData paymentSessionData;
        private final Integer windowFlags;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u0005\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0016R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0017R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/stripe/android/view/PaymentFlowActivityStarter$Args$Builder;", "Lcom/stripe/android/ObjectBuilder;", "Lcom/stripe/android/view/PaymentFlowActivityStarter$Args;", "Lcom/stripe/android/PaymentSessionConfig;", "paymentSessionConfig", "setPaymentSessionConfig", "(Lcom/stripe/android/PaymentSessionConfig;)Lcom/stripe/android/view/PaymentFlowActivityStarter$Args$Builder;", "Lcom/stripe/android/PaymentSessionData;", "paymentSessionData", "setPaymentSessionData", "(Lcom/stripe/android/PaymentSessionData;)Lcom/stripe/android/view/PaymentFlowActivityStarter$Args$Builder;", "", "isPaymentSessionActive", "setIsPaymentSessionActive", "(Z)Lcom/stripe/android/view/PaymentFlowActivityStarter$Args$Builder;", "", "windowFlags", "setWindowFlags", "(Ljava/lang/Integer;)Lcom/stripe/android/view/PaymentFlowActivityStarter$Args$Builder;", "build", "()Lcom/stripe/android/view/PaymentFlowActivityStarter$Args;", "Ljava/lang/Integer;", "Z", "Lcom/stripe/android/PaymentSessionConfig;", "Lcom/stripe/android/PaymentSessionData;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentFlowActivityStarter.kt */
        public static final class Builder implements ObjectBuilder<Args> {
            private boolean isPaymentSessionActive;
            private PaymentSessionConfig paymentSessionConfig;
            private PaymentSessionData paymentSessionData;
            private Integer windowFlags;

            public final Builder setIsPaymentSessionActive(boolean z) {
                this.isPaymentSessionActive = z;
                return this;
            }

            public final Builder setPaymentSessionConfig(PaymentSessionConfig paymentSessionConfig2) {
                this.paymentSessionConfig = paymentSessionConfig2;
                return this;
            }

            public final Builder setPaymentSessionData(PaymentSessionData paymentSessionData2) {
                this.paymentSessionData = paymentSessionData2;
                return this;
            }

            public final Builder setWindowFlags(Integer num) {
                this.windowFlags = num;
                return this;
            }

            public Args build() {
                PaymentSessionConfig paymentSessionConfig2 = this.paymentSessionConfig;
                if (paymentSessionConfig2 != null) {
                    PaymentSessionData paymentSessionData2 = this.paymentSessionData;
                    if (paymentSessionData2 != null) {
                        return new Args(paymentSessionConfig2, paymentSessionData2, this.isPaymentSessionActive, this.windowFlags);
                    }
                    throw new IllegalArgumentException("PaymentFlowActivity launched without PaymentSessionData".toString());
                }
                throw new IllegalArgumentException("PaymentFlowActivity launched without PaymentSessionConfig".toString());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/stripe/android/view/PaymentFlowActivityStarter$Args$Companion;", "", "Landroid/content/Intent;", "intent", "Lcom/stripe/android/view/PaymentFlowActivityStarter$Args;", "create", "(Landroid/content/Intent;)Lcom/stripe/android/view/PaymentFlowActivityStarter$Args;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentFlowActivityStarter.kt */
        public static final class Companion {
            private Companion() {
            }

            public final Args create(Intent intent) {
                i.e(intent, "intent");
                Parcelable parcelableExtra = intent.getParcelableExtra("extra_activity_args");
                if (parcelableExtra != null) {
                    return (Args) parcelableExtra;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<Args> {
            public final Args createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                return new Args(PaymentSessionConfig.CREATOR.createFromParcel(parcel), PaymentSessionData.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            }

            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public Args(PaymentSessionConfig paymentSessionConfig2, PaymentSessionData paymentSessionData2, boolean z, Integer num) {
            i.e(paymentSessionConfig2, "paymentSessionConfig");
            i.e(paymentSessionData2, "paymentSessionData");
            this.paymentSessionConfig = paymentSessionConfig2;
            this.paymentSessionData = paymentSessionData2;
            this.isPaymentSessionActive = z;
            this.windowFlags = num;
        }

        public static /* synthetic */ Args copy$default(Args args, PaymentSessionConfig paymentSessionConfig2, PaymentSessionData paymentSessionData2, boolean z, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                paymentSessionConfig2 = args.paymentSessionConfig;
            }
            if ((i & 2) != 0) {
                paymentSessionData2 = args.paymentSessionData;
            }
            if ((i & 4) != 0) {
                z = args.isPaymentSessionActive;
            }
            if ((i & 8) != 0) {
                num = args.windowFlags;
            }
            return args.copy(paymentSessionConfig2, paymentSessionData2, z, num);
        }

        public static final Args create(Intent intent) {
            return Companion.create(intent);
        }

        public final PaymentSessionConfig component1$payments_core_release() {
            return this.paymentSessionConfig;
        }

        public final PaymentSessionData component2$payments_core_release() {
            return this.paymentSessionData;
        }

        public final boolean component3$payments_core_release() {
            return this.isPaymentSessionActive;
        }

        public final Integer component4$payments_core_release() {
            return this.windowFlags;
        }

        public final Args copy(PaymentSessionConfig paymentSessionConfig2, PaymentSessionData paymentSessionData2, boolean z, Integer num) {
            i.e(paymentSessionConfig2, "paymentSessionConfig");
            i.e(paymentSessionData2, "paymentSessionData");
            return new Args(paymentSessionConfig2, paymentSessionData2, z, num);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Args)) {
                return false;
            }
            Args args = (Args) obj;
            return i.a(this.paymentSessionConfig, args.paymentSessionConfig) && i.a(this.paymentSessionData, args.paymentSessionData) && this.isPaymentSessionActive == args.isPaymentSessionActive && i.a(this.windowFlags, args.windowFlags);
        }

        public final PaymentSessionConfig getPaymentSessionConfig$payments_core_release() {
            return this.paymentSessionConfig;
        }

        public final PaymentSessionData getPaymentSessionData$payments_core_release() {
            return this.paymentSessionData;
        }

        public final Integer getWindowFlags$payments_core_release() {
            return this.windowFlags;
        }

        public int hashCode() {
            PaymentSessionConfig paymentSessionConfig2 = this.paymentSessionConfig;
            int i = 0;
            int hashCode = (paymentSessionConfig2 != null ? paymentSessionConfig2.hashCode() : 0) * 31;
            PaymentSessionData paymentSessionData2 = this.paymentSessionData;
            int hashCode2 = (hashCode + (paymentSessionData2 != null ? paymentSessionData2.hashCode() : 0)) * 31;
            boolean z = this.isPaymentSessionActive;
            if (z) {
                z = true;
            }
            int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
            Integer num = this.windowFlags;
            if (num != null) {
                i = num.hashCode();
            }
            return i2 + i;
        }

        public final boolean isPaymentSessionActive$payments_core_release() {
            return this.isPaymentSessionActive;
        }

        public String toString() {
            StringBuilder P0 = a.P0("Args(paymentSessionConfig=");
            P0.append(this.paymentSessionConfig);
            P0.append(", paymentSessionData=");
            P0.append(this.paymentSessionData);
            P0.append(", isPaymentSessionActive=");
            P0.append(this.isPaymentSessionActive);
            P0.append(", windowFlags=");
            P0.append(this.windowFlags);
            P0.append(")");
            return P0.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            this.paymentSessionConfig.writeToParcel(parcel, 0);
            this.paymentSessionData.writeToParcel(parcel, 0);
            parcel.writeInt(this.isPaymentSessionActive ? 1 : 0);
            Integer num = this.windowFlags;
            if (num != null) {
                a.i(parcel, 1, num);
            } else {
                parcel.writeInt(0);
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Args(PaymentSessionConfig paymentSessionConfig2, PaymentSessionData paymentSessionData2, boolean z, Integer num, int i, f fVar) {
            this(paymentSessionConfig2, paymentSessionData2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : num);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/view/PaymentFlowActivityStarter$Companion;", "", "", "REQUEST_CODE", "I", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentFlowActivityStarter.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentFlowActivityStarter(Activity activity, PaymentSessionConfig paymentSessionConfig) {
        super(activity, PaymentFlowActivity.class, (int) REQUEST_CODE, (Integer) null, 8, (f) null);
        i.e(activity, "activity");
        i.e(paymentSessionConfig, "config");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentFlowActivityStarter(Fragment fragment, PaymentSessionConfig paymentSessionConfig) {
        super(fragment, PaymentFlowActivity.class, (int) REQUEST_CODE, (Integer) null, 8, (f) null);
        i.e(fragment, "fragment");
        i.e(paymentSessionConfig, "config");
    }
}
