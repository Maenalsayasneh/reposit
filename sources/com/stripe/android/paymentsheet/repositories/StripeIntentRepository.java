package com.stripe.android.paymentsheet.repositories;

import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.ApiRequest;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.paymentsheet.model.ClientSecret;
import kotlin.Metadata;
import m0.l.c;
import m0.l.e;
import m0.n.b.f;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\t\nB\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0001\u0002\u000b\f\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/stripe/android/paymentsheet/repositories/StripeIntentRepository;", "", "Lcom/stripe/android/paymentsheet/model/ClientSecret;", "clientSecret", "Lcom/stripe/android/model/StripeIntent;", "get", "(Lcom/stripe/android/paymentsheet/model/ClientSecret;Lm0/l/c;)Ljava/lang/Object;", "<init>", "()V", "Api", "Static", "Lcom/stripe/android/paymentsheet/repositories/StripeIntentRepository$Static;", "Lcom/stripe/android/paymentsheet/repositories/StripeIntentRepository$Api;", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: StripeIntentRepository.kt */
public abstract class StripeIntentRepository {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/paymentsheet/repositories/StripeIntentRepository$Api;", "Lcom/stripe/android/paymentsheet/repositories/StripeIntentRepository;", "Lcom/stripe/android/paymentsheet/model/ClientSecret;", "clientSecret", "Lcom/stripe/android/model/StripeIntent;", "get", "(Lcom/stripe/android/paymentsheet/model/ClientSecret;Lm0/l/c;)Ljava/lang/Object;", "Lm0/l/e;", "workContext", "Lm0/l/e;", "Lcom/stripe/android/networking/StripeRepository;", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "Lcom/stripe/android/networking/ApiRequest$Options;", "requestOptions", "Lcom/stripe/android/networking/ApiRequest$Options;", "<init>", "(Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/networking/ApiRequest$Options;Lm0/l/e;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: StripeIntentRepository.kt */
    public static final class Api extends StripeIntentRepository {
        /* access modifiers changed from: private */
        public final ApiRequest.Options requestOptions;
        /* access modifiers changed from: private */
        public final StripeRepository stripeRepository;
        private final e workContext;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Api(StripeRepository stripeRepository2, ApiRequest.Options options, e eVar) {
            super((f) null);
            i.e(stripeRepository2, "stripeRepository");
            i.e(options, "requestOptions");
            i.e(eVar, "workContext");
            this.stripeRepository = stripeRepository2;
            this.requestOptions = options;
            this.workContext = eVar;
        }

        public Object get(ClientSecret clientSecret, c<? super StripeIntent> cVar) {
            return a.k4(this.workContext, new StripeIntentRepository$Api$get$2(this, clientSecret, (c) null), cVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/paymentsheet/repositories/StripeIntentRepository$Static;", "Lcom/stripe/android/paymentsheet/repositories/StripeIntentRepository;", "Lcom/stripe/android/paymentsheet/model/ClientSecret;", "clientSecret", "Lcom/stripe/android/model/StripeIntent;", "get", "(Lcom/stripe/android/paymentsheet/model/ClientSecret;Lm0/l/c;)Ljava/lang/Object;", "stripeIntent", "Lcom/stripe/android/model/StripeIntent;", "<init>", "(Lcom/stripe/android/model/StripeIntent;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: StripeIntentRepository.kt */
    public static final class Static extends StripeIntentRepository {
        private final StripeIntent stripeIntent;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Static(StripeIntent stripeIntent2) {
            super((f) null);
            i.e(stripeIntent2, "stripeIntent");
            this.stripeIntent = stripeIntent2;
        }

        public Object get(ClientSecret clientSecret, c<? super StripeIntent> cVar) {
            return this.stripeIntent;
        }
    }

    private StripeIntentRepository() {
    }

    public abstract Object get(ClientSecret clientSecret, c<? super StripeIntent> cVar);

    public /* synthetic */ StripeIntentRepository(f fVar) {
        this();
    }
}
