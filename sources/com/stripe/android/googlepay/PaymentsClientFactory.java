package com.stripe.android.googlepay;

import android.content.Context;
import i0.h.a.b.c.g.a;
import i0.h.a.b.n.c;
import i0.h.a.b.n.d;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/stripe/android/googlepay/PaymentsClientFactory;", "", "Lcom/stripe/android/googlepay/StripeGooglePayEnvironment;", "environment", "Li0/h/a/b/n/c;", "create", "(Lcom/stripe/android/googlepay/StripeGooglePayEnvironment;)Li0/h/a/b/n/c;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentsClientFactory.kt */
public final class PaymentsClientFactory {
    private final Context context;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            StripeGooglePayEnvironment.values();
            int[] iArr = new int[2];
            $EnumSwitchMapping$0 = iArr;
            iArr[StripeGooglePayEnvironment.Production.ordinal()] = 1;
            iArr[StripeGooglePayEnvironment.Test.ordinal()] = 2;
        }
    }

    public PaymentsClientFactory(Context context2) {
        i.e(context2, "context");
        this.context = context2;
    }

    public final c create(StripeGooglePayEnvironment stripeGooglePayEnvironment) {
        i.e(stripeGooglePayEnvironment, "environment");
        d.a.C0137a aVar = new d.a.C0137a();
        int ordinal = stripeGooglePayEnvironment.ordinal();
        int i = 1;
        if (ordinal != 0) {
            if (ordinal == 1) {
                i = 3;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        aVar.a(i);
        d.a aVar2 = new d.a(aVar);
        Context context2 = this.context;
        a<d.a> aVar3 = d.a;
        c cVar = new c(context2, aVar2);
        i.d(cVar, "Wallet.getPaymentsClient(context, options)");
        return cVar;
    }
}
