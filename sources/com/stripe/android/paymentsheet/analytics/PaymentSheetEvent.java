package com.stripe.android.paymentsheet.analytics;

import com.instabug.library.model.session.config.SessionsConfigParameter;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import i0.d.a.a.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import m0.j.g;
import m0.n.a.l;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \f2\u00020\u0001:\u0007\f\r\u000e\u000f\u0010\u0011\u0012B\u0011\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u00020\u00028&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004\u0001\u0006\u0013\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;", "", "", "toString", "()Ljava/lang/String;", "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", "mode", "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", "getEvent", "event", "<init>", "(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;)V", "Companion", "Dismiss", "Init", "Payment", "SelectPaymentOption", "ShowExistingPaymentOptions", "ShowNewPaymentOptionForm", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Init;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Dismiss;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ShowNewPaymentOptionForm;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ShowExistingPaymentOptions;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$SelectPaymentOption;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment;", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentSheetEvent.kt */
public abstract class PaymentSheetEvent {
    /* access modifiers changed from: private */
    public static final Companion Companion = new Companion((f) null);
    private final EventReporter.Mode mode;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Companion;", "", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "paymentSelection", "", "analyticsValue", "(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)Ljava/lang/String;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentSheetEvent.kt */
    public static final class Companion {
        private Companion() {
        }

        /* access modifiers changed from: private */
        public final String analyticsValue(PaymentSelection paymentSelection) {
            if (i.a(paymentSelection, PaymentSelection.GooglePay.INSTANCE)) {
                return "googlepay";
            }
            if (paymentSelection instanceof PaymentSelection.Saved) {
                return "savedpm";
            }
            return paymentSelection instanceof PaymentSelection.New ? "newpm" : "unknown";
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u00020\u00028\u0016@\u0016XD¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Dismiss;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;", "", "event", "Ljava/lang/String;", "getEvent", "()Ljava/lang/String;", "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", "mode", "<init>", "(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentSheetEvent.kt */
    public static final class Dismiss extends PaymentSheetEvent {
        private final String event = "dismiss";

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Dismiss(EventReporter.Mode mode) {
            super(mode, (f) null);
            i.e(mode, SessionsConfigParameter.SYNC_MODE);
        }

        public String getEvent() {
            return this.event;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00058V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Init;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "configuration", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "", "getEvent", "()Ljava/lang/String;", "event", "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", "mode", "<init>", "(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentSheetEvent.kt */
    public static final class Init extends PaymentSheetEvent {
        private final PaymentSheet.Configuration configuration;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Init(EventReporter.Mode mode, PaymentSheet.Configuration configuration2) {
            super(mode, (f) null);
            i.e(mode, SessionsConfigParameter.SYNC_MODE);
            this.configuration = configuration2;
        }

        public String getEvent() {
            String[] strArr = new String[2];
            PaymentSheet.Configuration configuration2 = this.configuration;
            boolean z = false;
            strArr[0] = (configuration2 != null ? configuration2.getCustomer() : null) != null ? "customer" : null;
            PaymentSheet.Configuration configuration3 = this.configuration;
            if ((configuration3 != null ? configuration3.getGooglePay() : null) != null) {
                z = true;
            }
            strArr[1] = z ? "googlepay" : null;
            List M = g.M(strArr);
            List list = !((ArrayList) M).isEmpty() ? M : null;
            return a.n0("init_", list != null ? g.E(list, "_", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62) : "default");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u000fB!\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;", "", "event", "Ljava/lang/String;", "getEvent", "()Ljava/lang/String;", "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", "mode", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment$Result;", "result", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "paymentSelection", "<init>", "(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment$Result;Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V", "Result", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentSheetEvent.kt */
    public static final class Payment extends PaymentSheetEvent {
        private final String event;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$Payment$Result;", "", "", "toString", "()Ljava/lang/String;", "code", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Success", "Failure", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentSheetEvent.kt */
        public enum Result {
            Success("success"),
            Failure("failure");
            
            private final String code;

            private Result(String str) {
                this.code = str;
            }

            public String toString() {
                return this.code;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Payment(EventReporter.Mode mode, Result result, PaymentSelection paymentSelection) {
            super(mode, (f) null);
            i.e(mode, SessionsConfigParameter.SYNC_MODE);
            i.e(result, "result");
            StringBuilder P0 = a.P0("payment_");
            P0.append(PaymentSheetEvent.Companion.analyticsValue(paymentSelection));
            P0.append('_');
            P0.append(result);
            this.event = P0.toString();
        }

        public String getEvent() {
            return this.event;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$SelectPaymentOption;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;", "", "event", "Ljava/lang/String;", "getEvent", "()Ljava/lang/String;", "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", "mode", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "paymentSelection", "<init>", "(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentSheetEvent.kt */
    public static final class SelectPaymentOption extends PaymentSheetEvent {
        private final String event;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SelectPaymentOption(EventReporter.Mode mode, PaymentSelection paymentSelection) {
            super(mode, (f) null);
            i.e(mode, SessionsConfigParameter.SYNC_MODE);
            StringBuilder P0 = a.P0("paymentoption_");
            P0.append(PaymentSheetEvent.Companion.analyticsValue(paymentSelection));
            P0.append("_select");
            this.event = P0.toString();
        }

        public String getEvent() {
            return this.event;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u00020\u00028\u0016@\u0016XD¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ShowExistingPaymentOptions;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;", "", "event", "Ljava/lang/String;", "getEvent", "()Ljava/lang/String;", "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", "mode", "<init>", "(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentSheetEvent.kt */
    public static final class ShowExistingPaymentOptions extends PaymentSheetEvent {
        private final String event = "sheet_savedpm_show";

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ShowExistingPaymentOptions(EventReporter.Mode mode) {
            super(mode, (f) null);
            i.e(mode, SessionsConfigParameter.SYNC_MODE);
        }

        public String getEvent() {
            return this.event;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u00020\u00028\u0016@\u0016XD¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent$ShowNewPaymentOptionForm;", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;", "", "event", "Ljava/lang/String;", "getEvent", "()Ljava/lang/String;", "Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;", "mode", "<init>", "(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentSheetEvent.kt */
    public static final class ShowNewPaymentOptionForm extends PaymentSheetEvent {
        private final String event = "sheet_newpm_show";

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ShowNewPaymentOptionForm(EventReporter.Mode mode) {
            super(mode, (f) null);
            i.e(mode, SessionsConfigParameter.SYNC_MODE);
        }

        public String getEvent() {
            return this.event;
        }
    }

    private PaymentSheetEvent(EventReporter.Mode mode2) {
        this.mode = mode2;
    }

    public abstract String getEvent();

    public String toString() {
        StringBuilder P0 = a.P0("mc_");
        P0.append(this.mode);
        P0.append('_');
        P0.append(getEvent());
        return P0.toString();
    }

    public /* synthetic */ PaymentSheetEvent(EventReporter.Mode mode2, f fVar) {
        this(mode2);
    }
}
