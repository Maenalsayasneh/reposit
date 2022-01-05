package com.stripe.android;

import android.content.Intent;
import com.stripe.android.exception.APIConnectionException;
import com.stripe.android.exception.APIException;
import com.stripe.android.exception.AuthenticationException;
import com.stripe.android.exception.InvalidRequestException;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmStripeIntentParams;
import com.stripe.android.model.Source;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.WeChatPayNextAction;
import com.stripe.android.networking.ApiRequest;
import com.stripe.android.view.AuthActivityStarter;
import kotlin.Metadata;
import m0.i;
import m0.l.c;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001:\u00012J+\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J3\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017H¦@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0007\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010$\u001a\u00020#2\u0006\u0010 \u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!H&¢\u0006\u0004\b$\u0010%J!\u0010&\u001a\u00020#2\u0006\u0010 \u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!H&¢\u0006\u0004\b&\u0010%J!\u0010'\u001a\u00020#2\u0006\u0010 \u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!H&¢\u0006\u0004\b'\u0010%J\u001b\u0010(\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020!H¦@ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u001b\u0010+\u001a\u00020*2\u0006\u0010\"\u001a\u00020!H¦@ø\u0001\u0000¢\u0006\u0004\b+\u0010)J\u001b\u0010,\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020!H¦@ø\u0001\u0000¢\u0006\u0004\b,\u0010)J5\u00100\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010.\u001a\u00020-2\b\u0010/\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0007\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0004\b0\u00101\u0002\u0004\n\u0002\b\u0019¨\u00063"}, d2 = {"Lcom/stripe/android/PaymentController;", "", "Lcom/stripe/android/view/AuthActivityStarter$Host;", "host", "Lcom/stripe/android/model/ConfirmStripeIntentParams;", "confirmStripeIntentParams", "Lcom/stripe/android/networking/ApiRequest$Options;", "requestOptions", "Lm0/i;", "startConfirmAndAuth", "(Lcom/stripe/android/view/AuthActivityStarter$Host;Lcom/stripe/android/model/ConfirmStripeIntentParams;Lcom/stripe/android/networking/ApiRequest$Options;Lm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "confirmPaymentIntentParams", "Lcom/stripe/android/AlipayAuthenticator;", "authenticator", "Lcom/stripe/android/PaymentIntentResult;", "confirmAndAuthenticateAlipay", "(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/AlipayAuthenticator;Lcom/stripe/android/networking/ApiRequest$Options;Lm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/model/WeChatPayNextAction;", "confirmWeChatPay", "(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/networking/ApiRequest$Options;Lm0/l/c;)Ljava/lang/Object;", "", "clientSecret", "Lcom/stripe/android/PaymentController$StripeIntentType;", "type", "startAuth", "(Lcom/stripe/android/view/AuthActivityStarter$Host;Ljava/lang/String;Lcom/stripe/android/networking/ApiRequest$Options;Lcom/stripe/android/PaymentController$StripeIntentType;Lm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/model/Source;", "source", "startAuthenticateSource", "(Lcom/stripe/android/view/AuthActivityStarter$Host;Lcom/stripe/android/model/Source;Lcom/stripe/android/networking/ApiRequest$Options;Lm0/l/c;)Ljava/lang/Object;", "", "requestCode", "Landroid/content/Intent;", "data", "", "shouldHandlePaymentResult", "(ILandroid/content/Intent;)Z", "shouldHandleSetupResult", "shouldHandleSourceResult", "getPaymentIntentResult", "(Landroid/content/Intent;Lm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/SetupIntentResult;", "getSetupIntentResult", "getAuthenticateSourceResult", "Lcom/stripe/android/model/StripeIntent;", "stripeIntent", "returnUrl", "handleNextAction", "(Lcom/stripe/android/view/AuthActivityStarter$Host;Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;Lcom/stripe/android/networking/ApiRequest$Options;Lm0/l/c;)Ljava/lang/Object;", "StripeIntentType", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentController.kt */
public interface PaymentController {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/PaymentController$StripeIntentType;", "", "<init>", "(Ljava/lang/String;I)V", "PaymentIntent", "SetupIntent", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentController.kt */
    public enum StripeIntentType {
        PaymentIntent,
        SetupIntent
    }

    Object confirmAndAuthenticateAlipay(ConfirmPaymentIntentParams confirmPaymentIntentParams, AlipayAuthenticator alipayAuthenticator, ApiRequest.Options options, c<? super PaymentIntentResult> cVar) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException, IllegalArgumentException;

    Object confirmWeChatPay(ConfirmPaymentIntentParams confirmPaymentIntentParams, ApiRequest.Options options, c<? super WeChatPayNextAction> cVar) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException, IllegalArgumentException;

    Object getAuthenticateSourceResult(Intent intent, c<? super Source> cVar) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException, IllegalArgumentException;

    Object getPaymentIntentResult(Intent intent, c<? super PaymentIntentResult> cVar) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException, IllegalArgumentException;

    Object getSetupIntentResult(Intent intent, c<? super SetupIntentResult> cVar) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException, IllegalArgumentException;

    Object handleNextAction(AuthActivityStarter.Host host, StripeIntent stripeIntent, String str, ApiRequest.Options options, c<? super i> cVar);

    boolean shouldHandlePaymentResult(int i, Intent intent);

    boolean shouldHandleSetupResult(int i, Intent intent);

    boolean shouldHandleSourceResult(int i, Intent intent);

    Object startAuth(AuthActivityStarter.Host host, String str, ApiRequest.Options options, StripeIntentType stripeIntentType, c<? super i> cVar);

    Object startAuthenticateSource(AuthActivityStarter.Host host, Source source, ApiRequest.Options options, c<? super i> cVar);

    Object startConfirmAndAuth(AuthActivityStarter.Host host, ConfirmStripeIntentParams confirmStripeIntentParams, ApiRequest.Options options, c<? super i> cVar);
}
