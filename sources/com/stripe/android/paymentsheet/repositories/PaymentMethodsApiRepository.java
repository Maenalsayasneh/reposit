package com.stripe.android.paymentsheet.repositories;

import com.stripe.android.Logger;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.paymentsheet.PaymentSheet;
import i0.j.f.p.h;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import m0.l.c;
import m0.l.e;
import m0.n.b.f;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB3\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\n8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/paymentsheet/repositories/PaymentMethodsApiRepository;", "Lcom/stripe/android/paymentsheet/repositories/PaymentMethodsRepository;", "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;", "customerConfig", "Lcom/stripe/android/model/PaymentMethod$Type;", "type", "", "Lcom/stripe/android/model/PaymentMethod;", "get", "(Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;Lcom/stripe/android/model/PaymentMethod$Type;Lm0/l/c;)Ljava/lang/Object;", "", "stripeAccountId", "Ljava/lang/String;", "Lcom/stripe/android/networking/StripeRepository;", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "publishableKey", "Lm0/l/e;", "workContext", "Lm0/l/e;", "Lcom/stripe/android/Logger;", "logger", "Lcom/stripe/android/Logger;", "", "enableLogging", "<init>", "(Lcom/stripe/android/networking/StripeRepository;Ljava/lang/String;Ljava/lang/String;ZLm0/l/e;)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentMethodsApiRepository.kt */
public final class PaymentMethodsApiRepository implements PaymentMethodsRepository {
    /* access modifiers changed from: private */
    public static final Companion Companion = new Companion((f) null);
    /* access modifiers changed from: private */
    @Deprecated
    public static final Set<String> PRODUCT_USAGE = h.N3("PaymentSheet");
    /* access modifiers changed from: private */
    public final Logger logger;
    /* access modifiers changed from: private */
    public final String publishableKey;
    /* access modifiers changed from: private */
    public final String stripeAccountId;
    /* access modifiers changed from: private */
    public final StripeRepository stripeRepository;
    private final e workContext;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/stripe/android/paymentsheet/repositories/PaymentMethodsApiRepository$Companion;", "", "", "", "PRODUCT_USAGE", "Ljava/util/Set;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentMethodsApiRepository.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public PaymentMethodsApiRepository(StripeRepository stripeRepository2, String str, String str2, boolean z, e eVar) {
        i.e(stripeRepository2, "stripeRepository");
        i.e(str, "publishableKey");
        i.e(eVar, "workContext");
        this.stripeRepository = stripeRepository2;
        this.publishableKey = str;
        this.stripeAccountId = str2;
        this.workContext = eVar;
        this.logger = Logger.Companion.getInstance$payments_core_release(z);
    }

    public Object get(PaymentSheet.CustomerConfiguration customerConfiguration, PaymentMethod.Type type, c<? super List<PaymentMethod>> cVar) {
        return a.k4(this.workContext, new PaymentMethodsApiRepository$get$2(this, customerConfiguration, type, (c) null), cVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PaymentMethodsApiRepository(StripeRepository stripeRepository2, String str, String str2, boolean z, e eVar, int i, f fVar) {
        this(stripeRepository2, str, str2, (i & 8) != 0 ? false : z, eVar);
    }
}
