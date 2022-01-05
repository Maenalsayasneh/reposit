package com.stripe.android;

import android.app.Activity;
import com.stripe.android.stripe3ds2.init.ui.ButtonCustomization;
import com.stripe.android.stripe3ds2.init.ui.LabelCustomization;
import com.stripe.android.stripe3ds2.init.ui.StripeButtonCustomization;
import com.stripe.android.stripe3ds2.init.ui.StripeLabelCustomization;
import com.stripe.android.stripe3ds2.init.ui.StripeTextBoxCustomization;
import com.stripe.android.stripe3ds2.init.ui.StripeToolbarCustomization;
import com.stripe.android.stripe3ds2.init.ui.StripeUiCustomization;
import com.stripe.android.stripe3ds2.init.ui.TextBoxCustomization;
import com.stripe.android.stripe3ds2.init.ui.ToolbarCustomization;
import com.stripe.android.stripe3ds2.init.ui.UiCustomization;
import i0.d.a.a.a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 \t2\u00020\u0001:\b\n\t\u000b\f\r\u000e\u000f\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/PaymentAuthConfig;", "", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;", "stripe3ds2Config", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;", "getStripe3ds2Config$payments_core_release", "()Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;", "<init>", "(Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;)V", "Companion", "Builder", "Stripe3ds2ButtonCustomization", "Stripe3ds2Config", "Stripe3ds2LabelCustomization", "Stripe3ds2TextBoxCustomization", "Stripe3ds2ToolbarCustomization", "Stripe3ds2UiCustomization", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentAuthConfig.kt */
public final class PaymentAuthConfig {
    public static final Companion Companion = new Companion((f) null);
    /* access modifiers changed from: private */
    public static final PaymentAuthConfig DEFAULT = new Builder().set3ds2Config(new Stripe3ds2Config.Builder().build()).build();
    /* access modifiers changed from: private */
    public static PaymentAuthConfig instance;
    private final Stripe3ds2Config stripe3ds2Config;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\t¨\u0006\f"}, d2 = {"Lcom/stripe/android/PaymentAuthConfig$Builder;", "Lcom/stripe/android/ObjectBuilder;", "Lcom/stripe/android/PaymentAuthConfig;", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;", "stripe3ds2Config", "set3ds2Config", "(Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;)Lcom/stripe/android/PaymentAuthConfig$Builder;", "build", "()Lcom/stripe/android/PaymentAuthConfig;", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentAuthConfig.kt */
    public static final class Builder implements ObjectBuilder<PaymentAuthConfig> {
        private Stripe3ds2Config stripe3ds2Config;

        public final Builder set3ds2Config(Stripe3ds2Config stripe3ds2Config2) {
            i.e(stripe3ds2Config2, "stripe3ds2Config");
            this.stripe3ds2Config = stripe3ds2Config2;
            return this;
        }

        public PaymentAuthConfig build() {
            Stripe3ds2Config stripe3ds2Config2 = this.stripe3ds2Config;
            if (stripe3ds2Config2 != null) {
                return new PaymentAuthConfig(stripe3ds2Config2, (f) null);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\nJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/PaymentAuthConfig$Companion;", "", "Lcom/stripe/android/PaymentAuthConfig;", "config", "Lm0/i;", "init", "(Lcom/stripe/android/PaymentAuthConfig;)V", "get", "()Lcom/stripe/android/PaymentAuthConfig;", "reset$payments_core_release", "()V", "reset", "DEFAULT", "Lcom/stripe/android/PaymentAuthConfig;", "instance", "<init>", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentAuthConfig.kt */
    public static final class Companion {
        private Companion() {
        }

        public final PaymentAuthConfig get() {
            PaymentAuthConfig access$getInstance$cp = PaymentAuthConfig.instance;
            return access$getInstance$cp != null ? access$getInstance$cp : PaymentAuthConfig.DEFAULT;
        }

        public final void init(PaymentAuthConfig paymentAuthConfig) {
            i.e(paymentAuthConfig, "config");
            PaymentAuthConfig.instance = paymentAuthConfig;
        }

        public final /* synthetic */ void reset$payments_core_release() {
            PaymentAuthConfig.instance = null;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u0011\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0006\u001a\u00020\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0004¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ButtonCustomization;", "", "Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;", "component1$payments_core_release", "()Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;", "component1", "buttonCustomization", "copy", "(Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;)Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ButtonCustomization;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;", "getButtonCustomization$payments_core_release", "<init>", "(Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;)V", "Builder", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentAuthConfig.kt */
    public static final class Stripe3ds2ButtonCustomization {
        private final ButtonCustomization buttonCustomization;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\u0006J\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u0006J\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\nJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ButtonCustomization$Builder;", "Lcom/stripe/android/ObjectBuilder;", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ButtonCustomization;", "", "hexColor", "setBackgroundColor", "(Ljava/lang/String;)Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ButtonCustomization$Builder;", "", "cornerRadius", "setCornerRadius", "(I)Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ButtonCustomization$Builder;", "fontName", "setTextFontName", "setTextColor", "fontSize", "setTextFontSize", "build", "()Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ButtonCustomization;", "Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;", "buttonCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentAuthConfig.kt */
        public static final class Builder implements ObjectBuilder<Stripe3ds2ButtonCustomization> {
            private final ButtonCustomization buttonCustomization = new StripeButtonCustomization();

            public final Builder setBackgroundColor(String str) throws RuntimeException {
                i.e(str, "hexColor");
                this.buttonCustomization.setBackgroundColor(str);
                return this;
            }

            public final Builder setCornerRadius(int i) throws RuntimeException {
                this.buttonCustomization.setCornerRadius(i);
                return this;
            }

            public final Builder setTextColor(String str) throws RuntimeException {
                i.e(str, "hexColor");
                this.buttonCustomization.setTextColor(str);
                return this;
            }

            public final Builder setTextFontName(String str) throws RuntimeException {
                i.e(str, "fontName");
                this.buttonCustomization.setTextFontName(str);
                return this;
            }

            public final Builder setTextFontSize(int i) throws RuntimeException {
                this.buttonCustomization.setTextFontSize(i);
                return this;
            }

            public Stripe3ds2ButtonCustomization build() {
                return new Stripe3ds2ButtonCustomization(this.buttonCustomization);
            }
        }

        public Stripe3ds2ButtonCustomization(ButtonCustomization buttonCustomization2) {
            i.e(buttonCustomization2, "buttonCustomization");
            this.buttonCustomization = buttonCustomization2;
        }

        public static /* synthetic */ Stripe3ds2ButtonCustomization copy$default(Stripe3ds2ButtonCustomization stripe3ds2ButtonCustomization, ButtonCustomization buttonCustomization2, int i, Object obj) {
            if ((i & 1) != 0) {
                buttonCustomization2 = stripe3ds2ButtonCustomization.buttonCustomization;
            }
            return stripe3ds2ButtonCustomization.copy(buttonCustomization2);
        }

        public final ButtonCustomization component1$payments_core_release() {
            return this.buttonCustomization;
        }

        public final Stripe3ds2ButtonCustomization copy(ButtonCustomization buttonCustomization2) {
            i.e(buttonCustomization2, "buttonCustomization");
            return new Stripe3ds2ButtonCustomization(buttonCustomization2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof Stripe3ds2ButtonCustomization) && i.a(this.buttonCustomization, ((Stripe3ds2ButtonCustomization) obj).buttonCustomization);
            }
            return true;
        }

        public final ButtonCustomization getButtonCustomization$payments_core_release() {
            return this.buttonCustomization;
        }

        public int hashCode() {
            ButtonCustomization buttonCustomization2 = this.buttonCustomization;
            if (buttonCustomization2 != null) {
                return buttonCustomization2.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder P0 = a.P0("Stripe3ds2ButtonCustomization(buttonCustomization=");
            P0.append(this.buttonCustomization);
            P0.append(")");
            return P0.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u0000 \u001f2\u00020\u0001:\u0002 \u001fB\u001b\b\u0000\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\nHÀ\u0003¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bJ\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\bR\u001c\u0010\u000e\u001a\u00020\n8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b\u001c\u0010\f¨\u0006!"}, d2 = {"Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;", "", "", "timeout", "Lm0/i;", "checkValidTimeout", "(I)V", "component1$payments_core_release", "()I", "component1", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;", "component2$payments_core_release", "()Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;", "component2", "uiCustomization", "copy", "(ILcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;)Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getTimeout$payments_core_release", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;", "getUiCustomization$payments_core_release", "<init>", "(ILcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;)V", "Companion", "Builder", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentAuthConfig.kt */
    public static final class Stripe3ds2Config {
        public static final Companion Companion = new Companion((f) null);
        public static final int DEFAULT_TIMEOUT = 5;
        private final int timeout;
        private final Stripe3ds2UiCustomization uiCustomization;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0005\u001a\u00020\u00002\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config$Builder;", "Lcom/stripe/android/ObjectBuilder;", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;", "", "timeout", "setTimeout", "(I)Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config$Builder;", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;", "uiCustomization", "setUiCustomization", "(Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;)Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config$Builder;", "build", "()Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config;", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;", "I", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentAuthConfig.kt */
        public static final class Builder implements ObjectBuilder<Stripe3ds2Config> {
            private int timeout = 5;
            private Stripe3ds2UiCustomization uiCustomization = new Stripe3ds2UiCustomization.Builder().build();

            public final Builder setTimeout(int i) {
                this.timeout = i;
                return this;
            }

            public final Builder setUiCustomization(Stripe3ds2UiCustomization stripe3ds2UiCustomization) {
                i.e(stripe3ds2UiCustomization, "uiCustomization");
                this.uiCustomization = stripe3ds2UiCustomization;
                return this;
            }

            public Stripe3ds2Config build() {
                return new Stripe3ds2Config(this.timeout, this.uiCustomization);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2Config$Companion;", "", "", "DEFAULT_TIMEOUT", "I", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentAuthConfig.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        public Stripe3ds2Config(int i, Stripe3ds2UiCustomization stripe3ds2UiCustomization) {
            i.e(stripe3ds2UiCustomization, "uiCustomization");
            this.timeout = i;
            this.uiCustomization = stripe3ds2UiCustomization;
            checkValidTimeout(i);
        }

        private final void checkValidTimeout(int i) {
            if (!(i >= 5 && i <= 99)) {
                throw new IllegalArgumentException("Timeout value must be between 5 and 99, inclusive".toString());
            }
        }

        public static /* synthetic */ Stripe3ds2Config copy$default(Stripe3ds2Config stripe3ds2Config, int i, Stripe3ds2UiCustomization stripe3ds2UiCustomization, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = stripe3ds2Config.timeout;
            }
            if ((i2 & 2) != 0) {
                stripe3ds2UiCustomization = stripe3ds2Config.uiCustomization;
            }
            return stripe3ds2Config.copy(i, stripe3ds2UiCustomization);
        }

        public final int component1$payments_core_release() {
            return this.timeout;
        }

        public final Stripe3ds2UiCustomization component2$payments_core_release() {
            return this.uiCustomization;
        }

        public final Stripe3ds2Config copy(int i, Stripe3ds2UiCustomization stripe3ds2UiCustomization) {
            i.e(stripe3ds2UiCustomization, "uiCustomization");
            return new Stripe3ds2Config(i, stripe3ds2UiCustomization);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Stripe3ds2Config)) {
                return false;
            }
            Stripe3ds2Config stripe3ds2Config = (Stripe3ds2Config) obj;
            return this.timeout == stripe3ds2Config.timeout && i.a(this.uiCustomization, stripe3ds2Config.uiCustomization);
        }

        public final int getTimeout$payments_core_release() {
            return this.timeout;
        }

        public final Stripe3ds2UiCustomization getUiCustomization$payments_core_release() {
            return this.uiCustomization;
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.timeout) * 31;
            Stripe3ds2UiCustomization stripe3ds2UiCustomization = this.uiCustomization;
            return hashCode + (stripe3ds2UiCustomization != null ? stripe3ds2UiCustomization.hashCode() : 0);
        }

        public String toString() {
            StringBuilder P0 = a.P0("Stripe3ds2Config(timeout=");
            P0.append(this.timeout);
            P0.append(", uiCustomization=");
            P0.append(this.uiCustomization);
            P0.append(")");
            return P0.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u0011\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0006\u001a\u00020\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0004¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2LabelCustomization;", "", "Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;", "component1$payments_core_release", "()Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;", "component1", "labelCustomization", "copy", "(Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;)Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2LabelCustomization;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;", "getLabelCustomization$payments_core_release", "<init>", "(Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;)V", "Builder", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentAuthConfig.kt */
    public static final class Stripe3ds2LabelCustomization {
        private final LabelCustomization labelCustomization;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\u0006J\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u0006J\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u0006J\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2LabelCustomization$Builder;", "Lcom/stripe/android/ObjectBuilder;", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2LabelCustomization;", "", "hexColor", "setHeadingTextColor", "(Ljava/lang/String;)Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2LabelCustomization$Builder;", "fontName", "setHeadingTextFontName", "", "fontSize", "setHeadingTextFontSize", "(I)Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2LabelCustomization$Builder;", "setTextFontName", "setTextColor", "setTextFontSize", "build", "()Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2LabelCustomization;", "Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;", "labelCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentAuthConfig.kt */
        public static final class Builder implements ObjectBuilder<Stripe3ds2LabelCustomization> {
            private final LabelCustomization labelCustomization = new StripeLabelCustomization();

            public final Builder setHeadingTextColor(String str) throws RuntimeException {
                i.e(str, "hexColor");
                this.labelCustomization.setHeadingTextColor(str);
                return this;
            }

            public final Builder setHeadingTextFontName(String str) throws RuntimeException {
                i.e(str, "fontName");
                this.labelCustomization.setHeadingTextFontName(str);
                return this;
            }

            public final Builder setHeadingTextFontSize(int i) throws RuntimeException {
                this.labelCustomization.setHeadingTextFontSize(i);
                return this;
            }

            public final Builder setTextColor(String str) throws RuntimeException {
                i.e(str, "hexColor");
                this.labelCustomization.setTextColor(str);
                return this;
            }

            public final Builder setTextFontName(String str) throws RuntimeException {
                i.e(str, "fontName");
                this.labelCustomization.setTextFontName(str);
                return this;
            }

            public final Builder setTextFontSize(int i) throws RuntimeException {
                this.labelCustomization.setTextFontSize(i);
                return this;
            }

            public Stripe3ds2LabelCustomization build() {
                return new Stripe3ds2LabelCustomization(this.labelCustomization);
            }
        }

        public Stripe3ds2LabelCustomization(LabelCustomization labelCustomization2) {
            i.e(labelCustomization2, "labelCustomization");
            this.labelCustomization = labelCustomization2;
        }

        public static /* synthetic */ Stripe3ds2LabelCustomization copy$default(Stripe3ds2LabelCustomization stripe3ds2LabelCustomization, LabelCustomization labelCustomization2, int i, Object obj) {
            if ((i & 1) != 0) {
                labelCustomization2 = stripe3ds2LabelCustomization.labelCustomization;
            }
            return stripe3ds2LabelCustomization.copy(labelCustomization2);
        }

        public final LabelCustomization component1$payments_core_release() {
            return this.labelCustomization;
        }

        public final Stripe3ds2LabelCustomization copy(LabelCustomization labelCustomization2) {
            i.e(labelCustomization2, "labelCustomization");
            return new Stripe3ds2LabelCustomization(labelCustomization2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof Stripe3ds2LabelCustomization) && i.a(this.labelCustomization, ((Stripe3ds2LabelCustomization) obj).labelCustomization);
            }
            return true;
        }

        public final LabelCustomization getLabelCustomization$payments_core_release() {
            return this.labelCustomization;
        }

        public int hashCode() {
            LabelCustomization labelCustomization2 = this.labelCustomization;
            if (labelCustomization2 != null) {
                return labelCustomization2.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder P0 = a.P0("Stripe3ds2LabelCustomization(labelCustomization=");
            P0.append(this.labelCustomization);
            P0.append(")");
            return P0.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u0011\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0006\u001a\u00020\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0004¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2TextBoxCustomization;", "", "Lcom/stripe/android/stripe3ds2/init/ui/TextBoxCustomization;", "component1$payments_core_release", "()Lcom/stripe/android/stripe3ds2/init/ui/TextBoxCustomization;", "component1", "textBoxCustomization", "copy", "(Lcom/stripe/android/stripe3ds2/init/ui/TextBoxCustomization;)Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2TextBoxCustomization;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/stripe/android/stripe3ds2/init/ui/TextBoxCustomization;", "getTextBoxCustomization$payments_core_release", "<init>", "(Lcom/stripe/android/stripe3ds2/init/ui/TextBoxCustomization;)V", "Builder", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentAuthConfig.kt */
    public static final class Stripe3ds2TextBoxCustomization {
        private final TextBoxCustomization textBoxCustomization;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\u0006J\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\nJ\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\nJ\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0006J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2TextBoxCustomization$Builder;", "Lcom/stripe/android/ObjectBuilder;", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2TextBoxCustomization;", "", "borderWidth", "setBorderWidth", "(I)Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2TextBoxCustomization$Builder;", "", "hexColor", "setBorderColor", "(Ljava/lang/String;)Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2TextBoxCustomization$Builder;", "cornerRadius", "setCornerRadius", "fontName", "setTextFontName", "setTextColor", "fontSize", "setTextFontSize", "build", "()Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2TextBoxCustomization;", "Lcom/stripe/android/stripe3ds2/init/ui/TextBoxCustomization;", "textBoxCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/TextBoxCustomization;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentAuthConfig.kt */
        public static final class Builder implements ObjectBuilder<Stripe3ds2TextBoxCustomization> {
            private final TextBoxCustomization textBoxCustomization = new StripeTextBoxCustomization();

            public final Builder setBorderColor(String str) throws RuntimeException {
                i.e(str, "hexColor");
                this.textBoxCustomization.setBorderColor(str);
                return this;
            }

            public final Builder setBorderWidth(int i) throws RuntimeException {
                this.textBoxCustomization.setBorderWidth(i);
                return this;
            }

            public final Builder setCornerRadius(int i) throws RuntimeException {
                this.textBoxCustomization.setCornerRadius(i);
                return this;
            }

            public final Builder setTextColor(String str) throws RuntimeException {
                i.e(str, "hexColor");
                this.textBoxCustomization.setTextColor(str);
                return this;
            }

            public final Builder setTextFontName(String str) throws RuntimeException {
                i.e(str, "fontName");
                this.textBoxCustomization.setTextFontName(str);
                return this;
            }

            public final Builder setTextFontSize(int i) throws RuntimeException {
                this.textBoxCustomization.setTextFontSize(i);
                return this;
            }

            public Stripe3ds2TextBoxCustomization build() {
                return new Stripe3ds2TextBoxCustomization(this.textBoxCustomization);
            }
        }

        public Stripe3ds2TextBoxCustomization(TextBoxCustomization textBoxCustomization2) {
            i.e(textBoxCustomization2, "textBoxCustomization");
            this.textBoxCustomization = textBoxCustomization2;
        }

        public static /* synthetic */ Stripe3ds2TextBoxCustomization copy$default(Stripe3ds2TextBoxCustomization stripe3ds2TextBoxCustomization, TextBoxCustomization textBoxCustomization2, int i, Object obj) {
            if ((i & 1) != 0) {
                textBoxCustomization2 = stripe3ds2TextBoxCustomization.textBoxCustomization;
            }
            return stripe3ds2TextBoxCustomization.copy(textBoxCustomization2);
        }

        public final TextBoxCustomization component1$payments_core_release() {
            return this.textBoxCustomization;
        }

        public final Stripe3ds2TextBoxCustomization copy(TextBoxCustomization textBoxCustomization2) {
            i.e(textBoxCustomization2, "textBoxCustomization");
            return new Stripe3ds2TextBoxCustomization(textBoxCustomization2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof Stripe3ds2TextBoxCustomization) && i.a(this.textBoxCustomization, ((Stripe3ds2TextBoxCustomization) obj).textBoxCustomization);
            }
            return true;
        }

        public final TextBoxCustomization getTextBoxCustomization$payments_core_release() {
            return this.textBoxCustomization;
        }

        public int hashCode() {
            TextBoxCustomization textBoxCustomization2 = this.textBoxCustomization;
            if (textBoxCustomization2 != null) {
                return textBoxCustomization2.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder P0 = a.P0("Stripe3ds2TextBoxCustomization(textBoxCustomization=");
            P0.append(this.textBoxCustomization);
            P0.append(")");
            return P0.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u0011\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0006\u001a\u00020\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0004¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization;", "", "Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;", "component1$payments_core_release", "()Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;", "component1", "toolbarCustomization", "copy", "(Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;)Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;", "getToolbarCustomization$payments_core_release", "<init>", "(Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;)V", "Builder", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentAuthConfig.kt */
    public static final class Stripe3ds2ToolbarCustomization {
        private final ToolbarCustomization toolbarCustomization;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\u0006J\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\u0006J\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u0006J\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u0006J\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization$Builder;", "Lcom/stripe/android/ObjectBuilder;", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization;", "", "hexColor", "setBackgroundColor", "(Ljava/lang/String;)Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization$Builder;", "setStatusBarColor", "headerText", "setHeaderText", "buttonText", "setButtonText", "fontName", "setTextFontName", "setTextColor", "", "fontSize", "setTextFontSize", "(I)Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization$Builder;", "build", "()Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization;", "Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;", "toolbarCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/ToolbarCustomization;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentAuthConfig.kt */
        public static final class Builder implements ObjectBuilder<Stripe3ds2ToolbarCustomization> {
            private final ToolbarCustomization toolbarCustomization = new StripeToolbarCustomization();

            public final Builder setBackgroundColor(String str) throws RuntimeException {
                i.e(str, "hexColor");
                this.toolbarCustomization.setBackgroundColor(str);
                return this;
            }

            public final Builder setButtonText(String str) throws RuntimeException {
                i.e(str, "buttonText");
                this.toolbarCustomization.setButtonText(str);
                return this;
            }

            public final Builder setHeaderText(String str) throws RuntimeException {
                i.e(str, "headerText");
                this.toolbarCustomization.setHeaderText(str);
                return this;
            }

            public final Builder setStatusBarColor(String str) throws RuntimeException {
                i.e(str, "hexColor");
                this.toolbarCustomization.setStatusBarColor(str);
                return this;
            }

            public final Builder setTextColor(String str) throws RuntimeException {
                i.e(str, "hexColor");
                this.toolbarCustomization.setTextColor(str);
                return this;
            }

            public final Builder setTextFontName(String str) throws RuntimeException {
                i.e(str, "fontName");
                this.toolbarCustomization.setTextFontName(str);
                return this;
            }

            public final Builder setTextFontSize(int i) throws RuntimeException {
                this.toolbarCustomization.setTextFontSize(i);
                return this;
            }

            public Stripe3ds2ToolbarCustomization build() {
                return new Stripe3ds2ToolbarCustomization(this.toolbarCustomization);
            }
        }

        public Stripe3ds2ToolbarCustomization(ToolbarCustomization toolbarCustomization2) {
            i.e(toolbarCustomization2, "toolbarCustomization");
            this.toolbarCustomization = toolbarCustomization2;
        }

        public static /* synthetic */ Stripe3ds2ToolbarCustomization copy$default(Stripe3ds2ToolbarCustomization stripe3ds2ToolbarCustomization, ToolbarCustomization toolbarCustomization2, int i, Object obj) {
            if ((i & 1) != 0) {
                toolbarCustomization2 = stripe3ds2ToolbarCustomization.toolbarCustomization;
            }
            return stripe3ds2ToolbarCustomization.copy(toolbarCustomization2);
        }

        public final ToolbarCustomization component1$payments_core_release() {
            return this.toolbarCustomization;
        }

        public final Stripe3ds2ToolbarCustomization copy(ToolbarCustomization toolbarCustomization2) {
            i.e(toolbarCustomization2, "toolbarCustomization");
            return new Stripe3ds2ToolbarCustomization(toolbarCustomization2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof Stripe3ds2ToolbarCustomization) && i.a(this.toolbarCustomization, ((Stripe3ds2ToolbarCustomization) obj).toolbarCustomization);
            }
            return true;
        }

        public final ToolbarCustomization getToolbarCustomization$payments_core_release() {
            return this.toolbarCustomization;
        }

        public int hashCode() {
            ToolbarCustomization toolbarCustomization2 = this.toolbarCustomization;
            if (toolbarCustomization2 != null) {
                return toolbarCustomization2.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder P0 = a.P0("Stripe3ds2ToolbarCustomization(toolbarCustomization=");
            P0.append(this.toolbarCustomization);
            P0.append(")");
            return P0.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0004¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;", "", "Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;", "component1", "()Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;", "uiCustomization", "copy", "(Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;)Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;", "getUiCustomization", "<init>", "(Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;)V", "Builder", "ButtonType", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentAuthConfig.kt */
    public static final class Stripe3ds2UiCustomization {
        private final StripeUiCustomization uiCustomization;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'B\u0011\b\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b!\u0010\"B\t\b\u0016¢\u0006\u0004\b!\u0010#B\u0011\b\u0012\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b!\u0010&J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006("}, d2 = {"Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization$Builder;", "Lcom/stripe/android/ObjectBuilder;", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization$ButtonType;", "buttonType", "Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;", "getUiButtonType", "(Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization$ButtonType;)Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization$ButtonType;", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ButtonCustomization;", "buttonCustomization", "setButtonCustomization", "(Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ButtonCustomization;Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization$ButtonType;)Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization$Builder;", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization;", "toolbarCustomization", "setToolbarCustomization", "(Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2ToolbarCustomization;)Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization$Builder;", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2LabelCustomization;", "labelCustomization", "setLabelCustomization", "(Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2LabelCustomization;)Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization$Builder;", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2TextBoxCustomization;", "textBoxCustomization", "setTextBoxCustomization", "(Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2TextBoxCustomization;)Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization$Builder;", "", "hexColor", "setAccentColor", "(Ljava/lang/String;)Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization$Builder;", "build", "()Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization;", "Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;", "uiCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;", "<init>", "(Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;)V", "()V", "Landroid/app/Activity;", "activity", "(Landroid/app/Activity;)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentAuthConfig.kt */
        public static final class Builder implements ObjectBuilder<Stripe3ds2UiCustomization> {
            public static final Companion Companion = new Companion((f) null);
            private final StripeUiCustomization uiCustomization;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization$Builder$Companion;", "", "Landroid/app/Activity;", "activity", "Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization$Builder;", "createWithAppTheme", "(Landroid/app/Activity;)Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization$Builder;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
            /* compiled from: PaymentAuthConfig.kt */
            public static final class Companion {
                private Companion() {
                }

                public final Builder createWithAppTheme(Activity activity) {
                    i.e(activity, "activity");
                    return new Builder(activity, (f) null);
                }

                public /* synthetic */ Companion(f fVar) {
                    this();
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
            public final /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    ButtonType.values();
                    int[] iArr = new int[6];
                    $EnumSwitchMapping$0 = iArr;
                    iArr[ButtonType.SUBMIT.ordinal()] = 1;
                    iArr[ButtonType.CONTINUE.ordinal()] = 2;
                    iArr[ButtonType.NEXT.ordinal()] = 3;
                    iArr[ButtonType.CANCEL.ordinal()] = 4;
                    iArr[ButtonType.RESEND.ordinal()] = 5;
                    iArr[ButtonType.SELECT.ordinal()] = 6;
                }
            }

            public /* synthetic */ Builder(Activity activity, f fVar) {
                this(activity);
            }

            public static final Builder createWithAppTheme(Activity activity) {
                return Companion.createWithAppTheme(activity);
            }

            private final UiCustomization.ButtonType getUiButtonType(ButtonType buttonType) throws RuntimeException {
                int ordinal = buttonType.ordinal();
                if (ordinal == 0) {
                    return UiCustomization.ButtonType.SUBMIT;
                }
                if (ordinal == 1) {
                    return UiCustomization.ButtonType.CONTINUE;
                }
                if (ordinal == 2) {
                    return UiCustomization.ButtonType.NEXT;
                }
                if (ordinal == 3) {
                    return UiCustomization.ButtonType.CANCEL;
                }
                if (ordinal == 4) {
                    return UiCustomization.ButtonType.RESEND;
                }
                if (ordinal == 5) {
                    return UiCustomization.ButtonType.SELECT;
                }
                throw new NoWhenBranchMatchedException();
            }

            public final Builder setAccentColor(String str) throws RuntimeException {
                i.e(str, "hexColor");
                this.uiCustomization.setAccentColor(str);
                return this;
            }

            public final Builder setButtonCustomization(Stripe3ds2ButtonCustomization stripe3ds2ButtonCustomization, ButtonType buttonType) throws RuntimeException {
                i.e(stripe3ds2ButtonCustomization, "buttonCustomization");
                i.e(buttonType, "buttonType");
                this.uiCustomization.setButtonCustomization(stripe3ds2ButtonCustomization.getButtonCustomization$payments_core_release(), getUiButtonType(buttonType));
                return this;
            }

            public final Builder setLabelCustomization(Stripe3ds2LabelCustomization stripe3ds2LabelCustomization) throws RuntimeException {
                i.e(stripe3ds2LabelCustomization, "labelCustomization");
                this.uiCustomization.setLabelCustomization(stripe3ds2LabelCustomization.getLabelCustomization$payments_core_release());
                return this;
            }

            public final Builder setTextBoxCustomization(Stripe3ds2TextBoxCustomization stripe3ds2TextBoxCustomization) throws RuntimeException {
                i.e(stripe3ds2TextBoxCustomization, "textBoxCustomization");
                this.uiCustomization.setTextBoxCustomization(stripe3ds2TextBoxCustomization.getTextBoxCustomization$payments_core_release());
                return this;
            }

            public final Builder setToolbarCustomization(Stripe3ds2ToolbarCustomization stripe3ds2ToolbarCustomization) throws RuntimeException {
                i.e(stripe3ds2ToolbarCustomization, "toolbarCustomization");
                this.uiCustomization.setToolbarCustomization(stripe3ds2ToolbarCustomization.getToolbarCustomization$payments_core_release());
                return this;
            }

            private Builder(StripeUiCustomization stripeUiCustomization) {
                this.uiCustomization = stripeUiCustomization;
            }

            public Stripe3ds2UiCustomization build() {
                return new Stripe3ds2UiCustomization(this.uiCustomization);
            }

            public Builder() {
                this(new StripeUiCustomization());
            }

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            private Builder(android.app.Activity r2) {
                /*
                    r1 = this;
                    com.stripe.android.stripe3ds2.init.ui.StripeUiCustomization r2 = com.stripe.android.stripe3ds2.init.ui.StripeUiCustomization.createWithAppTheme(r2)
                    java.lang.String r0 = "StripeUiCustomization.createWithAppTheme(activity)"
                    m0.n.b.i.d(r2, r0)
                    r1.<init>((com.stripe.android.stripe3ds2.init.ui.StripeUiCustomization) r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.PaymentAuthConfig.Stripe3ds2UiCustomization.Builder.<init>(android.app.Activity):void");
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/PaymentAuthConfig$Stripe3ds2UiCustomization$ButtonType;", "", "<init>", "(Ljava/lang/String;I)V", "SUBMIT", "CONTINUE", "NEXT", "CANCEL", "RESEND", "SELECT", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentAuthConfig.kt */
        public enum ButtonType {
            SUBMIT,
            CONTINUE,
            NEXT,
            CANCEL,
            RESEND,
            SELECT
        }

        public Stripe3ds2UiCustomization(StripeUiCustomization stripeUiCustomization) {
            i.e(stripeUiCustomization, "uiCustomization");
            this.uiCustomization = stripeUiCustomization;
        }

        public static /* synthetic */ Stripe3ds2UiCustomization copy$default(Stripe3ds2UiCustomization stripe3ds2UiCustomization, StripeUiCustomization stripeUiCustomization, int i, Object obj) {
            if ((i & 1) != 0) {
                stripeUiCustomization = stripe3ds2UiCustomization.uiCustomization;
            }
            return stripe3ds2UiCustomization.copy(stripeUiCustomization);
        }

        public final StripeUiCustomization component1() {
            return this.uiCustomization;
        }

        public final Stripe3ds2UiCustomization copy(StripeUiCustomization stripeUiCustomization) {
            i.e(stripeUiCustomization, "uiCustomization");
            return new Stripe3ds2UiCustomization(stripeUiCustomization);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof Stripe3ds2UiCustomization) && i.a(this.uiCustomization, ((Stripe3ds2UiCustomization) obj).uiCustomization);
            }
            return true;
        }

        public final StripeUiCustomization getUiCustomization() {
            return this.uiCustomization;
        }

        public int hashCode() {
            StripeUiCustomization stripeUiCustomization = this.uiCustomization;
            if (stripeUiCustomization != null) {
                return stripeUiCustomization.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder P0 = a.P0("Stripe3ds2UiCustomization(uiCustomization=");
            P0.append(this.uiCustomization);
            P0.append(")");
            return P0.toString();
        }
    }

    private PaymentAuthConfig(Stripe3ds2Config stripe3ds2Config2) {
        this.stripe3ds2Config = stripe3ds2Config2;
    }

    public static final PaymentAuthConfig get() {
        return Companion.get();
    }

    public static final void init(PaymentAuthConfig paymentAuthConfig) {
        Companion.init(paymentAuthConfig);
    }

    public final Stripe3ds2Config getStripe3ds2Config$payments_core_release() {
        return this.stripe3ds2Config;
    }

    public /* synthetic */ PaymentAuthConfig(Stripe3ds2Config stripe3ds2Config2, f fVar) {
        this(stripe3ds2Config2);
    }
}
