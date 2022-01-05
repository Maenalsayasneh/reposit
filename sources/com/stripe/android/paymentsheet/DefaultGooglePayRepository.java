package com.stripe.android.paymentsheet;

import android.content.Context;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.stripe.android.GooglePayJsonFactory;
import com.stripe.android.Logger;
import com.stripe.android.paymentsheet.PaymentSheet;
import h0.b0.v;
import i0.h.a.b.m.b0;
import i0.h.a.b.m.g;
import i0.j.f.p.h;
import java.util.Objects;
import kotlin.Metadata;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import m0.c;
import m0.n.b.f;
import m0.n.b.i;
import n0.a.g2.a0;
import n0.a.g2.d;
import n0.a.g2.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001d\u0010\u000e\u001a\u00020\t8B@\u0002X\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/paymentsheet/DefaultGooglePayRepository;", "Lcom/stripe/android/paymentsheet/GooglePayRepository;", "Ln0/a/g2/d;", "", "isReady", "()Ln0/a/g2/d;", "Lcom/stripe/android/Logger;", "logger", "Lcom/stripe/android/Logger;", "Li0/h/a/b/n/c;", "paymentsClient$delegate", "Lm0/c;", "getPaymentsClient", "()Li0/h/a/b/n/c;", "paymentsClient", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Lcom/stripe/android/GooglePayJsonFactory;", "googlePayJsonFactory", "Lcom/stripe/android/GooglePayJsonFactory;", "Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$Environment;", "environment", "Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$Environment;", "<init>", "(Landroid/content/Context;Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$Environment;Lcom/stripe/android/Logger;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: DefaultGooglePayRepository.kt */
public final class DefaultGooglePayRepository implements GooglePayRepository {
    /* access modifiers changed from: private */
    public final Context context;
    /* access modifiers changed from: private */
    public final PaymentSheet.GooglePayConfiguration.Environment environment;
    private final GooglePayJsonFactory googlePayJsonFactory;
    /* access modifiers changed from: private */
    public final Logger logger;
    private final c paymentsClient$delegate;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            PaymentSheet.GooglePayConfiguration.Environment.values();
            int[] iArr = new int[2];
            $EnumSwitchMapping$0 = iArr;
            iArr[PaymentSheet.GooglePayConfiguration.Environment.Production.ordinal()] = 1;
            iArr[PaymentSheet.GooglePayConfiguration.Environment.Test.ordinal()] = 2;
        }
    }

    public DefaultGooglePayRepository(Context context2, PaymentSheet.GooglePayConfiguration.Environment environment2, Logger logger2) {
        i.e(context2, "context");
        i.e(environment2, "environment");
        i.e(logger2, "logger");
        this.context = context2;
        this.environment = environment2;
        this.logger = logger2;
        this.googlePayJsonFactory = new GooglePayJsonFactory(context2, false, 2, (f) null);
        this.paymentsClient$delegate = h.H2(new DefaultGooglePayRepository$paymentsClient$2(this));
    }

    private final i0.h.a.b.n.c getPaymentsClient() {
        return (i0.h.a.b.n.c) this.paymentsClient$delegate.getValue();
    }

    public d<Boolean> isReady() {
        q a = a0.a(null);
        String jSONObject = GooglePayJsonFactory.createIsReadyToPayRequest$default(this.googlePayJsonFactory, (GooglePayJsonFactory.BillingAddressParameters) null, Boolean.TRUE, 1, (Object) null).toString();
        IsReadyToPayRequest isReadyToPayRequest = new IsReadyToPayRequest();
        v.A(jSONObject, "isReadyToPayRequestJson cannot be null!");
        isReadyToPayRequest.Y1 = jSONObject;
        g<Boolean> d = getPaymentsClient().d(isReadyToPayRequest);
        DefaultGooglePayRepository$isReady$1 defaultGooglePayRepository$isReady$1 = new DefaultGooglePayRepository$isReady$1(this, a);
        b0 b0Var = (b0) d;
        Objects.requireNonNull(b0Var);
        b0Var.c(i0.h.a.b.m.i.a, defaultGooglePayRepository$isReady$1);
        return new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(a);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DefaultGooglePayRepository(Context context2, PaymentSheet.GooglePayConfiguration.Environment environment2, Logger logger2, int i, f fVar) {
        this(context2, environment2, (i & 4) != 0 ? Logger.Companion.noop$payments_core_release() : logger2);
    }
}
