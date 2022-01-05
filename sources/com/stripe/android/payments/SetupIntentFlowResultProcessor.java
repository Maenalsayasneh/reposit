package com.stripe.android.payments;

import android.content.Context;
import com.stripe.android.SetupIntentResult;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.networking.ApiRequest;
import com.stripe.android.networking.StripeRepository;
import java.util.List;
import kotlin.Metadata;
import m0.l.c;
import m0.l.e;
import m0.n.b.f;
import m0.n.b.i;
import n0.a.m0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B1\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0004\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ3\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0013\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0013\u0010\u0014\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Lcom/stripe/android/payments/SetupIntentFlowResultProcessor;", "Lcom/stripe/android/payments/PaymentFlowResultProcessor;", "Lcom/stripe/android/model/SetupIntent;", "Lcom/stripe/android/SetupIntentResult;", "", "clientSecret", "Lcom/stripe/android/networking/ApiRequest$Options;", "requestOptions", "", "expandFields", "retrieveStripeIntent", "(Ljava/lang/String;Lcom/stripe/android/networking/ApiRequest$Options;Ljava/util/List;Lm0/l/c;)Ljava/lang/Object;", "stripeIntent", "sourceId", "cancelStripeIntent", "(Lcom/stripe/android/model/SetupIntent;Lcom/stripe/android/networking/ApiRequest$Options;Ljava/lang/String;Lm0/l/c;)Ljava/lang/Object;", "", "outcomeFromFlow", "failureMessage", "createStripeIntentResult", "(Lcom/stripe/android/model/SetupIntent;ILjava/lang/String;)Lcom/stripe/android/SetupIntentResult;", "Landroid/content/Context;", "context", "publishableKey", "Lcom/stripe/android/networking/StripeRepository;", "stripeRepository", "", "enableLogging", "Lm0/l/e;", "workContext", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/stripe/android/networking/StripeRepository;ZLm0/l/e;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentFlowResultProcessor.kt */
public final class SetupIntentFlowResultProcessor extends PaymentFlowResultProcessor<SetupIntent, SetupIntentResult> {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SetupIntentFlowResultProcessor(Context context, String str, StripeRepository stripeRepository, boolean z, e eVar, int i, f fVar) {
        this(context, str, stripeRepository, z, (i & 16) != 0 ? m0.c : eVar);
    }

    public Object retrieveStripeIntent(String str, ApiRequest.Options options, List<String> list, c<? super SetupIntent> cVar) {
        return getStripeRepository().retrieveSetupIntent(str, options, list, cVar);
    }

    public Object cancelStripeIntent(SetupIntent setupIntent, ApiRequest.Options options, String str, c<? super SetupIntent> cVar) {
        StripeRepository stripeRepository = getStripeRepository();
        String id = setupIntent.getId();
        if (id == null) {
            id = "";
        }
        return stripeRepository.cancelSetupIntentSource(id, str, options, cVar);
    }

    public SetupIntentResult createStripeIntentResult(SetupIntent setupIntent, int i, String str) {
        i.e(setupIntent, "stripeIntent");
        return new SetupIntentResult(setupIntent, i, str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SetupIntentFlowResultProcessor(Context context, String str, StripeRepository stripeRepository, boolean z, e eVar) {
        super(context, str, stripeRepository, z, eVar, (f) null);
        i.e(context, "context");
        i.e(str, "publishableKey");
        i.e(stripeRepository, "stripeRepository");
        i.e(eVar, "workContext");
    }
}
