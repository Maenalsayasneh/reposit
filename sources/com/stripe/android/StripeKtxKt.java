package com.stripe.android;

import com.stripe.android.exception.APIConnectionException;
import com.stripe.android.exception.APIException;
import com.stripe.android.exception.AuthenticationException;
import com.stripe.android.exception.CardException;
import com.stripe.android.exception.InvalidRequestException;
import com.stripe.android.exception.StripeException;
import com.stripe.android.model.AccountParams;
import com.stripe.android.model.BankAccountTokenParams;
import com.stripe.android.model.CardParams;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmSetupIntentParams;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.PersonTokenParams;
import com.stripe.android.model.SourceParams;
import com.stripe.android.model.StripeFileParams;
import com.stripe.android.model.StripeModel;
import i0.j.f.p.h;
import kotlin.Metadata;
import kotlin.Result;
import m0.l.c;
import m0.n.a.a;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a3\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a7\u0010\u000e\u001a\u00020\r*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a7\u0010\u0013\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a7\u0010\u0018\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a7\u0010\u001c\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a7\u0010\u001f\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a7\u0010#\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\"\u001a\u00020!2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H@ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a9\u0010&\u001a\u00020\u0017*\u00020\u00002\b\b\u0001\u0010%\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H@ø\u0001\u0000¢\u0006\u0004\b&\u0010 \u001a7\u0010)\u001a\u00020\u0017*\u00020\u00002\u0006\u0010(\u001a\u00020'2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H@ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a7\u0010.\u001a\u00020-*\u00020\u00002\u0006\u0010,\u001a\u00020+2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H@ø\u0001\u0000¢\u0006\u0004\b.\u0010/\u001a\u0017\u00101\u001a\u000200*\u00020\u0000H@ø\u0001\u0000¢\u0006\u0004\b1\u00102\u001a+\u00105\u001a\u000204*\u00020\u00002\u0006\u00103\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H@ø\u0001\u0000¢\u0006\u0004\b5\u00106\u001a+\u00108\u001a\u000207*\u00020\u00002\u0006\u00103\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H@ø\u0001\u0000¢\u0006\u0004\b8\u00106\u001a7\u0010:\u001a\u00020\u0012*\u00020\u00002\b\b\u0001\u00109\u001a\u00020\u00052\b\b\u0001\u00103\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H@ø\u0001\u0000¢\u0006\u0004\b:\u0010 \u001a+\u0010=\u001a\u000207*\u00020\u00002\u0006\u0010<\u001a\u00020;2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005H@ø\u0001\u0000¢\u0006\u0004\b=\u0010>\u001a+\u0010@\u001a\u00020?*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H@ø\u0001\u0000¢\u0006\u0004\b@\u0010A\u001a+\u0010B\u001a\u000204*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005H@ø\u0001\u0000¢\u0006\u0004\bB\u0010A\u001a,\u0010G\u001a\u00028\u0000\"\n\b\u0000\u0010D\u0018\u0001*\u00020C2\u000e\u0010F\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000EH\b¢\u0006\u0004\bG\u0010H\u001a'\u0010M\u001a\u00020\u0007*\u00020\u00002\u0006\u0010J\u001a\u00020I2\u0006\u0010L\u001a\u00020KH@ø\u0001\u0000¢\u0006\u0004\bM\u0010N\u001a'\u0010P\u001a\u00020O*\u00020\u00002\u0006\u0010J\u001a\u00020I2\u0006\u0010L\u001a\u00020KH@ø\u0001\u0000¢\u0006\u0004\bP\u0010N\u001a'\u0010Q\u001a\u00020\u0012*\u00020\u00002\u0006\u0010J\u001a\u00020I2\u0006\u0010L\u001a\u00020KH@ø\u0001\u0000¢\u0006\u0004\bQ\u0010N\u001a5\u0010G\u001a\u00028\u0000\"\n\b\u0000\u0010D\u0018\u0001*\u00020C2\u0006\u0010S\u001a\u00020R2\f\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000EH\bø\u0001\u0001¢\u0006\u0004\bG\u0010T\u0002\u000b\n\u0002\b\u0019\n\u0005\b20\u0001¨\u0006U"}, d2 = {"Lcom/stripe/android/Stripe;", "Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "confirmPaymentIntentParams", "Lcom/stripe/android/AlipayAuthenticator;", "authenticator", "", "stripeAccountId", "Lcom/stripe/android/PaymentIntentResult;", "confirmAlipayPayment", "(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/AlipayAuthenticator;Ljava/lang/String;Lm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "paymentMethodCreateParams", "idempotencyKey", "Lcom/stripe/android/model/PaymentMethod;", "createPaymentMethod", "(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;Ljava/lang/String;Lm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/model/SourceParams;", "sourceParams", "Lcom/stripe/android/model/Source;", "createSource", "(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/SourceParams;Ljava/lang/String;Ljava/lang/String;Lm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/model/AccountParams;", "accountParams", "Lcom/stripe/android/model/Token;", "createAccountToken", "(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/AccountParams;Ljava/lang/String;Ljava/lang/String;Lm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/model/BankAccountTokenParams;", "bankAccountTokenParams", "createBankAccountToken", "(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/BankAccountTokenParams;Ljava/lang/String;Ljava/lang/String;Lm0/l/c;)Ljava/lang/Object;", "personalId", "createPiiToken", "(Lcom/stripe/android/Stripe;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/model/CardParams;", "cardParams", "createCardToken", "(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/CardParams;Ljava/lang/String;Ljava/lang/String;Lm0/l/c;)Ljava/lang/Object;", "cvc", "createCvcUpdateToken", "Lcom/stripe/android/model/PersonTokenParams;", "params", "createPersonToken", "(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/PersonTokenParams;Ljava/lang/String;Ljava/lang/String;Lm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/model/StripeFileParams;", "fileParams", "Lcom/stripe/android/model/StripeFile;", "createFile", "(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/StripeFileParams;Ljava/lang/String;Ljava/lang/String;Lm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/model/RadarSession;", "createRadarSession", "(Lcom/stripe/android/Stripe;Lm0/l/c;)Ljava/lang/Object;", "clientSecret", "Lcom/stripe/android/model/PaymentIntent;", "retrievePaymentIntent", "(Lcom/stripe/android/Stripe;Ljava/lang/String;Ljava/lang/String;Lm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/model/SetupIntent;", "retrieveSetupIntent", "sourceId", "retrieveSource", "Lcom/stripe/android/model/ConfirmSetupIntentParams;", "confirmSetupIntentParams", "confirmSetupIntent", "(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/ConfirmSetupIntentParams;Ljava/lang/String;Lm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/model/WeChatPayNextAction;", "confirmWeChatPayPayment", "(Lcom/stripe/android/Stripe;Lcom/stripe/android/model/ConfirmPaymentIntentParams;Ljava/lang/String;Lm0/l/c;)Ljava/lang/Object;", "confirmPaymentIntent", "Lcom/stripe/android/model/StripeModel;", "ApiObject", "Lkotlin/Function0;", "block", "runApiRequest", "(Lm0/n/a/a;)Lcom/stripe/android/model/StripeModel;", "", "requestCode", "Landroid/content/Intent;", "data", "getPaymentIntentResult", "(Lcom/stripe/android/Stripe;ILandroid/content/Intent;Lm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/SetupIntentResult;", "getSetupIntentResult", "getAuthenticateSourceResult", "", "isValidParam", "(ZLm0/n/a/a;)Lcom/stripe/android/model/StripeModel;", "payments-core_release"}, k = 2, mv = {1, 4, 2})
/* compiled from: StripeKtx.kt */
public final class StripeKtxKt {
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0053 A[Catch:{ all -> 0x0027 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0054 A[Catch:{ all -> 0x0027 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object confirmAlipayPayment(com.stripe.android.Stripe r10, com.stripe.android.model.ConfirmPaymentIntentParams r11, com.stripe.android.AlipayAuthenticator r12, java.lang.String r13, m0.l.c<? super com.stripe.android.PaymentIntentResult> r14) throws com.stripe.android.exception.AuthenticationException, com.stripe.android.exception.InvalidRequestException, com.stripe.android.exception.APIConnectionException, com.stripe.android.exception.APIException {
        /*
            boolean r0 = r14 instanceof com.stripe.android.StripeKtxKt$confirmAlipayPayment$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.stripe.android.StripeKtxKt$confirmAlipayPayment$1 r0 = (com.stripe.android.StripeKtxKt$confirmAlipayPayment$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.stripe.android.StripeKtxKt$confirmAlipayPayment$1 r0 = new com.stripe.android.StripeKtxKt$confirmAlipayPayment$1
            r0.<init>(r14)
        L_0x0018:
            java.lang.Object r14 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            i0.j.f.p.h.d4(r14)     // Catch:{ all -> 0x0027 }
            goto L_0x004f
        L_0x0027:
            r10 = move-exception
            goto L_0x007a
        L_0x0029:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0031:
            i0.j.f.p.h.d4(r14)
            com.stripe.android.PaymentController r14 = r10.getPaymentController$payments_core_release()     // Catch:{ all -> 0x0027 }
            com.stripe.android.networking.ApiRequest$Options r2 = new com.stripe.android.networking.ApiRequest$Options     // Catch:{ all -> 0x0027 }
            java.lang.String r5 = r10.getPublishableKey$payments_core_release()     // Catch:{ all -> 0x0027 }
            r7 = 0
            r8 = 4
            r9 = 0
            r4 = r2
            r6 = r13
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0027 }
            r0.label = r3     // Catch:{ all -> 0x0027 }
            java.lang.Object r14 = r14.confirmAndAuthenticateAlipay(r11, r12, r2, r0)     // Catch:{ all -> 0x0027 }
            if (r14 != r1) goto L_0x004f
            return r1
        L_0x004f:
            com.stripe.android.PaymentIntentResult r14 = (com.stripe.android.PaymentIntentResult) r14     // Catch:{ all -> 0x0027 }
            if (r14 == 0) goto L_0x0054
            goto L_0x007e
        L_0x0054:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0027 }
            r10.<init>()     // Catch:{ all -> 0x0027 }
            java.lang.String r11 = "Failed to parse "
            r10.append(r11)     // Catch:{ all -> 0x0027 }
            java.lang.Class<com.stripe.android.PaymentIntentResult> r11 = com.stripe.android.PaymentIntentResult.class
            java.lang.String r11 = r11.getSimpleName()     // Catch:{ all -> 0x0027 }
            r10.append(r11)     // Catch:{ all -> 0x0027 }
            r11 = 46
            r10.append(r11)     // Catch:{ all -> 0x0027 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0027 }
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0027 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0027 }
            r11.<init>(r10)     // Catch:{ all -> 0x0027 }
            throw r11     // Catch:{ all -> 0x0027 }
        L_0x007a:
            java.lang.Object r14 = i0.j.f.p.h.l0(r10)
        L_0x007e:
            java.lang.Throwable r10 = kotlin.Result.a(r14)
            if (r10 != 0) goto L_0x0087
            com.stripe.android.model.StripeModel r14 = (com.stripe.android.model.StripeModel) r14
            return r14
        L_0x0087:
            com.stripe.android.exception.StripeException$Companion r11 = com.stripe.android.exception.StripeException.Companion
            com.stripe.android.exception.StripeException r10 = r11.create(r10)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.StripeKtxKt.confirmAlipayPayment(com.stripe.android.Stripe, com.stripe.android.model.ConfirmPaymentIntentParams, com.stripe.android.AlipayAuthenticator, java.lang.String, m0.l.c):java.lang.Object");
    }

    public static /* synthetic */ Object confirmAlipayPayment$default(Stripe stripe, ConfirmPaymentIntentParams confirmPaymentIntentParams, AlipayAuthenticator alipayAuthenticator, String str, c cVar, int i, Object obj) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        if ((i & 4) != 0) {
            str = stripe.getStripeAccountId$payments_core_release();
        }
        return confirmAlipayPayment(stripe, confirmPaymentIntentParams, alipayAuthenticator, str, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0057 A[Catch:{ all -> 0x0028 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0058 A[Catch:{ all -> 0x0028 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object confirmPaymentIntent(com.stripe.android.Stripe r8, com.stripe.android.model.ConfirmPaymentIntentParams r9, java.lang.String r10, m0.l.c<? super com.stripe.android.model.PaymentIntent> r11) throws com.stripe.android.exception.AuthenticationException, com.stripe.android.exception.InvalidRequestException, com.stripe.android.exception.APIConnectionException, com.stripe.android.exception.APIException {
        /*
            boolean r0 = r11 instanceof com.stripe.android.StripeKtxKt$confirmPaymentIntent$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.stripe.android.StripeKtxKt$confirmPaymentIntent$1 r0 = (com.stripe.android.StripeKtxKt$confirmPaymentIntent$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.stripe.android.StripeKtxKt$confirmPaymentIntent$1 r0 = new com.stripe.android.StripeKtxKt$confirmPaymentIntent$1
            r0.<init>(r11)
        L_0x0018:
            r5 = r0
            java.lang.Object r11 = r5.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L_0x0032
            if (r1 != r2) goto L_0x002a
            i0.j.f.p.h.d4(r11)     // Catch:{ all -> 0x0028 }
            goto L_0x0053
        L_0x0028:
            r8 = move-exception
            goto L_0x007e
        L_0x002a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0032:
            i0.j.f.p.h.d4(r11)
            com.stripe.android.networking.StripeRepository r1 = r8.getStripeRepository$payments_core_release()     // Catch:{ all -> 0x0028 }
            com.stripe.android.networking.ApiRequest$Options r3 = new com.stripe.android.networking.ApiRequest$Options     // Catch:{ all -> 0x0028 }
            java.lang.String r11 = r8.getPublishableKey$payments_core_release()     // Catch:{ all -> 0x0028 }
            java.lang.String r8 = r8.getStripeAccountId$payments_core_release()     // Catch:{ all -> 0x0028 }
            r3.<init>(r11, r8, r10)     // Catch:{ all -> 0x0028 }
            r4 = 0
            r6 = 4
            r7 = 0
            r5.label = r2     // Catch:{ all -> 0x0028 }
            r2 = r9
            java.lang.Object r11 = com.stripe.android.networking.StripeRepository.DefaultImpls.confirmPaymentIntent$default(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0028 }
            if (r11 != r0) goto L_0x0053
            return r0
        L_0x0053:
            com.stripe.android.model.PaymentIntent r11 = (com.stripe.android.model.PaymentIntent) r11     // Catch:{ all -> 0x0028 }
            if (r11 == 0) goto L_0x0058
            goto L_0x0082
        L_0x0058:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0028 }
            r8.<init>()     // Catch:{ all -> 0x0028 }
            java.lang.String r9 = "Failed to parse "
            r8.append(r9)     // Catch:{ all -> 0x0028 }
            java.lang.Class<com.stripe.android.model.PaymentIntent> r9 = com.stripe.android.model.PaymentIntent.class
            java.lang.String r9 = r9.getSimpleName()     // Catch:{ all -> 0x0028 }
            r8.append(r9)     // Catch:{ all -> 0x0028 }
            r9 = 46
            r8.append(r9)     // Catch:{ all -> 0x0028 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0028 }
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0028 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0028 }
            r9.<init>(r8)     // Catch:{ all -> 0x0028 }
            throw r9     // Catch:{ all -> 0x0028 }
        L_0x007e:
            java.lang.Object r11 = i0.j.f.p.h.l0(r8)
        L_0x0082:
            java.lang.Throwable r8 = kotlin.Result.a(r11)
            if (r8 != 0) goto L_0x008b
            com.stripe.android.model.StripeModel r11 = (com.stripe.android.model.StripeModel) r11
            return r11
        L_0x008b:
            com.stripe.android.exception.StripeException$Companion r9 = com.stripe.android.exception.StripeException.Companion
            com.stripe.android.exception.StripeException r8 = r9.create(r8)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.StripeKtxKt.confirmPaymentIntent(com.stripe.android.Stripe, com.stripe.android.model.ConfirmPaymentIntentParams, java.lang.String, m0.l.c):java.lang.Object");
    }

    public static /* synthetic */ Object confirmPaymentIntent$default(Stripe stripe, ConfirmPaymentIntentParams confirmPaymentIntentParams, String str, c cVar, int i, Object obj) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        if ((i & 2) != 0) {
            str = null;
        }
        return confirmPaymentIntent(stripe, confirmPaymentIntentParams, str, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0057 A[Catch:{ all -> 0x0028 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0058 A[Catch:{ all -> 0x0028 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object confirmSetupIntent(com.stripe.android.Stripe r8, com.stripe.android.model.ConfirmSetupIntentParams r9, java.lang.String r10, m0.l.c<? super com.stripe.android.model.SetupIntent> r11) throws com.stripe.android.exception.AuthenticationException, com.stripe.android.exception.InvalidRequestException, com.stripe.android.exception.APIConnectionException, com.stripe.android.exception.APIException {
        /*
            boolean r0 = r11 instanceof com.stripe.android.StripeKtxKt$confirmSetupIntent$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.stripe.android.StripeKtxKt$confirmSetupIntent$1 r0 = (com.stripe.android.StripeKtxKt$confirmSetupIntent$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.stripe.android.StripeKtxKt$confirmSetupIntent$1 r0 = new com.stripe.android.StripeKtxKt$confirmSetupIntent$1
            r0.<init>(r11)
        L_0x0018:
            r5 = r0
            java.lang.Object r11 = r5.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L_0x0032
            if (r1 != r2) goto L_0x002a
            i0.j.f.p.h.d4(r11)     // Catch:{ all -> 0x0028 }
            goto L_0x0053
        L_0x0028:
            r8 = move-exception
            goto L_0x007e
        L_0x002a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0032:
            i0.j.f.p.h.d4(r11)
            com.stripe.android.networking.StripeRepository r1 = r8.getStripeRepository$payments_core_release()     // Catch:{ all -> 0x0028 }
            com.stripe.android.networking.ApiRequest$Options r3 = new com.stripe.android.networking.ApiRequest$Options     // Catch:{ all -> 0x0028 }
            java.lang.String r11 = r8.getPublishableKey$payments_core_release()     // Catch:{ all -> 0x0028 }
            java.lang.String r8 = r8.getStripeAccountId$payments_core_release()     // Catch:{ all -> 0x0028 }
            r3.<init>(r11, r8, r10)     // Catch:{ all -> 0x0028 }
            r4 = 0
            r6 = 4
            r7 = 0
            r5.label = r2     // Catch:{ all -> 0x0028 }
            r2 = r9
            java.lang.Object r11 = com.stripe.android.networking.StripeRepository.DefaultImpls.confirmSetupIntent$default(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0028 }
            if (r11 != r0) goto L_0x0053
            return r0
        L_0x0053:
            com.stripe.android.model.SetupIntent r11 = (com.stripe.android.model.SetupIntent) r11     // Catch:{ all -> 0x0028 }
            if (r11 == 0) goto L_0x0058
            goto L_0x0082
        L_0x0058:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0028 }
            r8.<init>()     // Catch:{ all -> 0x0028 }
            java.lang.String r9 = "Failed to parse "
            r8.append(r9)     // Catch:{ all -> 0x0028 }
            java.lang.Class<com.stripe.android.model.SetupIntent> r9 = com.stripe.android.model.SetupIntent.class
            java.lang.String r9 = r9.getSimpleName()     // Catch:{ all -> 0x0028 }
            r8.append(r9)     // Catch:{ all -> 0x0028 }
            r9 = 46
            r8.append(r9)     // Catch:{ all -> 0x0028 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0028 }
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0028 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0028 }
            r9.<init>(r8)     // Catch:{ all -> 0x0028 }
            throw r9     // Catch:{ all -> 0x0028 }
        L_0x007e:
            java.lang.Object r11 = i0.j.f.p.h.l0(r8)
        L_0x0082:
            java.lang.Throwable r8 = kotlin.Result.a(r11)
            if (r8 != 0) goto L_0x008b
            com.stripe.android.model.StripeModel r11 = (com.stripe.android.model.StripeModel) r11
            return r11
        L_0x008b:
            com.stripe.android.exception.StripeException$Companion r9 = com.stripe.android.exception.StripeException.Companion
            com.stripe.android.exception.StripeException r8 = r9.create(r8)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.StripeKtxKt.confirmSetupIntent(com.stripe.android.Stripe, com.stripe.android.model.ConfirmSetupIntentParams, java.lang.String, m0.l.c):java.lang.Object");
    }

    public static /* synthetic */ Object confirmSetupIntent$default(Stripe stripe, ConfirmSetupIntentParams confirmSetupIntentParams, String str, c cVar, int i, Object obj) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        if ((i & 2) != 0) {
            str = null;
        }
        return confirmSetupIntent(stripe, confirmSetupIntentParams, str, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object confirmWeChatPayPayment(com.stripe.android.Stripe r10, com.stripe.android.model.ConfirmPaymentIntentParams r11, java.lang.String r12, m0.l.c<? super com.stripe.android.model.WeChatPayNextAction> r13) {
        /*
            boolean r0 = r13 instanceof com.stripe.android.StripeKtxKt$confirmWeChatPayPayment$1
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.stripe.android.StripeKtxKt$confirmWeChatPayPayment$1 r0 = (com.stripe.android.StripeKtxKt$confirmWeChatPayPayment$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.stripe.android.StripeKtxKt$confirmWeChatPayPayment$1 r0 = new com.stripe.android.StripeKtxKt$confirmWeChatPayPayment$1
            r0.<init>(r13)
        L_0x0018:
            java.lang.Object r13 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            i0.j.f.p.h.d4(r13)     // Catch:{ all -> 0x0027 }
            goto L_0x004f
        L_0x0027:
            r10 = move-exception
            goto L_0x0052
        L_0x0029:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0031:
            i0.j.f.p.h.d4(r13)
            com.stripe.android.PaymentController r13 = r10.getPaymentController$payments_core_release()     // Catch:{ all -> 0x0027 }
            com.stripe.android.networking.ApiRequest$Options r2 = new com.stripe.android.networking.ApiRequest$Options     // Catch:{ all -> 0x0027 }
            java.lang.String r5 = r10.getPublishableKey$payments_core_release()     // Catch:{ all -> 0x0027 }
            r7 = 0
            r8 = 4
            r9 = 0
            r4 = r2
            r6 = r12
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0027 }
            r0.label = r3     // Catch:{ all -> 0x0027 }
            java.lang.Object r13 = r13.confirmWeChatPay(r11, r2, r0)     // Catch:{ all -> 0x0027 }
            if (r13 != r1) goto L_0x004f
            return r1
        L_0x004f:
            com.stripe.android.model.WeChatPayNextAction r13 = (com.stripe.android.model.WeChatPayNextAction) r13     // Catch:{ all -> 0x0027 }
            goto L_0x0056
        L_0x0052:
            java.lang.Object r13 = i0.j.f.p.h.l0(r10)
        L_0x0056:
            java.lang.Throwable r10 = kotlin.Result.a(r13)
            if (r10 != 0) goto L_0x005d
            return r13
        L_0x005d:
            com.stripe.android.exception.StripeException$Companion r11 = com.stripe.android.exception.StripeException.Companion
            com.stripe.android.exception.StripeException r10 = r11.create(r10)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.StripeKtxKt.confirmWeChatPayPayment(com.stripe.android.Stripe, com.stripe.android.model.ConfirmPaymentIntentParams, java.lang.String, m0.l.c):java.lang.Object");
    }

    public static /* synthetic */ Object confirmWeChatPayPayment$default(Stripe stripe, ConfirmPaymentIntentParams confirmPaymentIntentParams, String str, c cVar, int i, Object obj) {
        if ((i & 2) != 0) {
            str = stripe.getStripeAccountId$payments_core_release();
        }
        return confirmWeChatPayPayment(stripe, confirmPaymentIntentParams, str, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004e A[Catch:{ all -> 0x0027 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004f A[Catch:{ all -> 0x0027 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object createAccountToken(com.stripe.android.Stripe r4, com.stripe.android.model.AccountParams r5, java.lang.String r6, java.lang.String r7, m0.l.c<? super com.stripe.android.model.Token> r8) throws com.stripe.android.exception.AuthenticationException, com.stripe.android.exception.InvalidRequestException, com.stripe.android.exception.APIConnectionException, com.stripe.android.exception.APIException {
        /*
            boolean r0 = r8 instanceof com.stripe.android.StripeKtxKt$createAccountToken$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.stripe.android.StripeKtxKt$createAccountToken$1 r0 = (com.stripe.android.StripeKtxKt$createAccountToken$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.stripe.android.StripeKtxKt$createAccountToken$1 r0 = new com.stripe.android.StripeKtxKt$createAccountToken$1
            r0.<init>(r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            i0.j.f.p.h.d4(r8)     // Catch:{ all -> 0x0027 }
            goto L_0x004a
        L_0x0027:
            r4 = move-exception
            goto L_0x0075
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            i0.j.f.p.h.d4(r8)
            com.stripe.android.networking.StripeRepository r8 = r4.getStripeRepository$payments_core_release()     // Catch:{ all -> 0x0027 }
            com.stripe.android.networking.ApiRequest$Options r2 = new com.stripe.android.networking.ApiRequest$Options     // Catch:{ all -> 0x0027 }
            java.lang.String r4 = r4.getPublishableKey$payments_core_release()     // Catch:{ all -> 0x0027 }
            r2.<init>(r4, r7, r6)     // Catch:{ all -> 0x0027 }
            r0.label = r3     // Catch:{ all -> 0x0027 }
            java.lang.Object r8 = r8.createToken(r5, r2, r0)     // Catch:{ all -> 0x0027 }
            if (r8 != r1) goto L_0x004a
            return r1
        L_0x004a:
            com.stripe.android.model.Token r8 = (com.stripe.android.model.Token) r8     // Catch:{ all -> 0x0027 }
            if (r8 == 0) goto L_0x004f
            goto L_0x0079
        L_0x004f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0027 }
            r4.<init>()     // Catch:{ all -> 0x0027 }
            java.lang.String r5 = "Failed to parse "
            r4.append(r5)     // Catch:{ all -> 0x0027 }
            java.lang.Class<com.stripe.android.model.Token> r5 = com.stripe.android.model.Token.class
            java.lang.String r5 = r5.getSimpleName()     // Catch:{ all -> 0x0027 }
            r4.append(r5)     // Catch:{ all -> 0x0027 }
            r5 = 46
            r4.append(r5)     // Catch:{ all -> 0x0027 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0027 }
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0027 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0027 }
            r5.<init>(r4)     // Catch:{ all -> 0x0027 }
            throw r5     // Catch:{ all -> 0x0027 }
        L_0x0075:
            java.lang.Object r8 = i0.j.f.p.h.l0(r4)
        L_0x0079:
            java.lang.Throwable r4 = kotlin.Result.a(r8)
            if (r4 != 0) goto L_0x0082
            com.stripe.android.model.StripeModel r8 = (com.stripe.android.model.StripeModel) r8
            return r8
        L_0x0082:
            com.stripe.android.exception.StripeException$Companion r5 = com.stripe.android.exception.StripeException.Companion
            com.stripe.android.exception.StripeException r4 = r5.create(r4)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.StripeKtxKt.createAccountToken(com.stripe.android.Stripe, com.stripe.android.model.AccountParams, java.lang.String, java.lang.String, m0.l.c):java.lang.Object");
    }

    public static /* synthetic */ Object createAccountToken$default(Stripe stripe, AccountParams accountParams, String str, String str2, c cVar, int i, Object obj) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = stripe.getStripeAccountId$payments_core_release();
        }
        return createAccountToken(stripe, accountParams, str, str2, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004e A[Catch:{ all -> 0x0027 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004f A[Catch:{ all -> 0x0027 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object createBankAccountToken(com.stripe.android.Stripe r4, com.stripe.android.model.BankAccountTokenParams r5, java.lang.String r6, java.lang.String r7, m0.l.c<? super com.stripe.android.model.Token> r8) throws com.stripe.android.exception.AuthenticationException, com.stripe.android.exception.InvalidRequestException, com.stripe.android.exception.APIConnectionException, com.stripe.android.exception.APIException {
        /*
            boolean r0 = r8 instanceof com.stripe.android.StripeKtxKt$createBankAccountToken$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.stripe.android.StripeKtxKt$createBankAccountToken$1 r0 = (com.stripe.android.StripeKtxKt$createBankAccountToken$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.stripe.android.StripeKtxKt$createBankAccountToken$1 r0 = new com.stripe.android.StripeKtxKt$createBankAccountToken$1
            r0.<init>(r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            i0.j.f.p.h.d4(r8)     // Catch:{ all -> 0x0027 }
            goto L_0x004a
        L_0x0027:
            r4 = move-exception
            goto L_0x0075
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            i0.j.f.p.h.d4(r8)
            com.stripe.android.networking.StripeRepository r8 = r4.getStripeRepository$payments_core_release()     // Catch:{ all -> 0x0027 }
            com.stripe.android.networking.ApiRequest$Options r2 = new com.stripe.android.networking.ApiRequest$Options     // Catch:{ all -> 0x0027 }
            java.lang.String r4 = r4.getPublishableKey$payments_core_release()     // Catch:{ all -> 0x0027 }
            r2.<init>(r4, r7, r6)     // Catch:{ all -> 0x0027 }
            r0.label = r3     // Catch:{ all -> 0x0027 }
            java.lang.Object r8 = r8.createToken(r5, r2, r0)     // Catch:{ all -> 0x0027 }
            if (r8 != r1) goto L_0x004a
            return r1
        L_0x004a:
            com.stripe.android.model.Token r8 = (com.stripe.android.model.Token) r8     // Catch:{ all -> 0x0027 }
            if (r8 == 0) goto L_0x004f
            goto L_0x0079
        L_0x004f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0027 }
            r4.<init>()     // Catch:{ all -> 0x0027 }
            java.lang.String r5 = "Failed to parse "
            r4.append(r5)     // Catch:{ all -> 0x0027 }
            java.lang.Class<com.stripe.android.model.Token> r5 = com.stripe.android.model.Token.class
            java.lang.String r5 = r5.getSimpleName()     // Catch:{ all -> 0x0027 }
            r4.append(r5)     // Catch:{ all -> 0x0027 }
            r5 = 46
            r4.append(r5)     // Catch:{ all -> 0x0027 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0027 }
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0027 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0027 }
            r5.<init>(r4)     // Catch:{ all -> 0x0027 }
            throw r5     // Catch:{ all -> 0x0027 }
        L_0x0075:
            java.lang.Object r8 = i0.j.f.p.h.l0(r4)
        L_0x0079:
            java.lang.Throwable r4 = kotlin.Result.a(r8)
            if (r4 != 0) goto L_0x0082
            com.stripe.android.model.StripeModel r8 = (com.stripe.android.model.StripeModel) r8
            return r8
        L_0x0082:
            com.stripe.android.exception.StripeException$Companion r5 = com.stripe.android.exception.StripeException.Companion
            com.stripe.android.exception.StripeException r4 = r5.create(r4)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.StripeKtxKt.createBankAccountToken(com.stripe.android.Stripe, com.stripe.android.model.BankAccountTokenParams, java.lang.String, java.lang.String, m0.l.c):java.lang.Object");
    }

    public static /* synthetic */ Object createBankAccountToken$default(Stripe stripe, BankAccountTokenParams bankAccountTokenParams, String str, String str2, c cVar, int i, Object obj) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = stripe.getStripeAccountId$payments_core_release();
        }
        return createBankAccountToken(stripe, bankAccountTokenParams, str, str2, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004e A[Catch:{ all -> 0x0027 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004f A[Catch:{ all -> 0x0027 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object createCardToken(com.stripe.android.Stripe r4, com.stripe.android.model.CardParams r5, java.lang.String r6, java.lang.String r7, m0.l.c<? super com.stripe.android.model.Token> r8) throws com.stripe.android.exception.AuthenticationException, com.stripe.android.exception.InvalidRequestException, com.stripe.android.exception.APIConnectionException, com.stripe.android.exception.APIException, com.stripe.android.exception.CardException {
        /*
            boolean r0 = r8 instanceof com.stripe.android.StripeKtxKt$createCardToken$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.stripe.android.StripeKtxKt$createCardToken$1 r0 = (com.stripe.android.StripeKtxKt$createCardToken$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.stripe.android.StripeKtxKt$createCardToken$1 r0 = new com.stripe.android.StripeKtxKt$createCardToken$1
            r0.<init>(r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            i0.j.f.p.h.d4(r8)     // Catch:{ all -> 0x0027 }
            goto L_0x004a
        L_0x0027:
            r4 = move-exception
            goto L_0x0075
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            i0.j.f.p.h.d4(r8)
            com.stripe.android.networking.StripeRepository r8 = r4.getStripeRepository$payments_core_release()     // Catch:{ all -> 0x0027 }
            com.stripe.android.networking.ApiRequest$Options r2 = new com.stripe.android.networking.ApiRequest$Options     // Catch:{ all -> 0x0027 }
            java.lang.String r4 = r4.getPublishableKey$payments_core_release()     // Catch:{ all -> 0x0027 }
            r2.<init>(r4, r7, r6)     // Catch:{ all -> 0x0027 }
            r0.label = r3     // Catch:{ all -> 0x0027 }
            java.lang.Object r8 = r8.createToken(r5, r2, r0)     // Catch:{ all -> 0x0027 }
            if (r8 != r1) goto L_0x004a
            return r1
        L_0x004a:
            com.stripe.android.model.Token r8 = (com.stripe.android.model.Token) r8     // Catch:{ all -> 0x0027 }
            if (r8 == 0) goto L_0x004f
            goto L_0x0079
        L_0x004f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0027 }
            r4.<init>()     // Catch:{ all -> 0x0027 }
            java.lang.String r5 = "Failed to parse "
            r4.append(r5)     // Catch:{ all -> 0x0027 }
            java.lang.Class<com.stripe.android.model.Token> r5 = com.stripe.android.model.Token.class
            java.lang.String r5 = r5.getSimpleName()     // Catch:{ all -> 0x0027 }
            r4.append(r5)     // Catch:{ all -> 0x0027 }
            r5 = 46
            r4.append(r5)     // Catch:{ all -> 0x0027 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0027 }
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0027 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0027 }
            r5.<init>(r4)     // Catch:{ all -> 0x0027 }
            throw r5     // Catch:{ all -> 0x0027 }
        L_0x0075:
            java.lang.Object r8 = i0.j.f.p.h.l0(r4)
        L_0x0079:
            java.lang.Throwable r4 = kotlin.Result.a(r8)
            if (r4 != 0) goto L_0x0082
            com.stripe.android.model.StripeModel r8 = (com.stripe.android.model.StripeModel) r8
            return r8
        L_0x0082:
            com.stripe.android.exception.StripeException$Companion r5 = com.stripe.android.exception.StripeException.Companion
            com.stripe.android.exception.StripeException r4 = r5.create(r4)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.StripeKtxKt.createCardToken(com.stripe.android.Stripe, com.stripe.android.model.CardParams, java.lang.String, java.lang.String, m0.l.c):java.lang.Object");
    }

    public static /* synthetic */ Object createCardToken$default(Stripe stripe, CardParams cardParams, String str, String str2, c cVar, int i, Object obj) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException, CardException {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = stripe.getStripeAccountId$payments_core_release();
        }
        return createCardToken(stripe, cardParams, str, str2, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0053 A[Catch:{ all -> 0x0027 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0054 A[Catch:{ all -> 0x0027 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object createCvcUpdateToken(com.stripe.android.Stripe r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, m0.l.c<? super com.stripe.android.model.Token> r8) throws com.stripe.android.exception.AuthenticationException, com.stripe.android.exception.InvalidRequestException, com.stripe.android.exception.APIConnectionException, com.stripe.android.exception.APIException {
        /*
            boolean r0 = r8 instanceof com.stripe.android.StripeKtxKt$createCvcUpdateToken$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.stripe.android.StripeKtxKt$createCvcUpdateToken$1 r0 = (com.stripe.android.StripeKtxKt$createCvcUpdateToken$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.stripe.android.StripeKtxKt$createCvcUpdateToken$1 r0 = new com.stripe.android.StripeKtxKt$createCvcUpdateToken$1
            r0.<init>(r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            i0.j.f.p.h.d4(r8)     // Catch:{ all -> 0x0027 }
            goto L_0x004f
        L_0x0027:
            r4 = move-exception
            goto L_0x007a
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            i0.j.f.p.h.d4(r8)
            com.stripe.android.networking.StripeRepository r8 = r4.getStripeRepository$payments_core_release()     // Catch:{ all -> 0x0027 }
            com.stripe.android.model.CvcTokenParams r2 = new com.stripe.android.model.CvcTokenParams     // Catch:{ all -> 0x0027 }
            r2.<init>(r5)     // Catch:{ all -> 0x0027 }
            com.stripe.android.networking.ApiRequest$Options r5 = new com.stripe.android.networking.ApiRequest$Options     // Catch:{ all -> 0x0027 }
            java.lang.String r4 = r4.getPublishableKey$payments_core_release()     // Catch:{ all -> 0x0027 }
            r5.<init>(r4, r7, r6)     // Catch:{ all -> 0x0027 }
            r0.label = r3     // Catch:{ all -> 0x0027 }
            java.lang.Object r8 = r8.createToken(r2, r5, r0)     // Catch:{ all -> 0x0027 }
            if (r8 != r1) goto L_0x004f
            return r1
        L_0x004f:
            com.stripe.android.model.Token r8 = (com.stripe.android.model.Token) r8     // Catch:{ all -> 0x0027 }
            if (r8 == 0) goto L_0x0054
            goto L_0x007e
        L_0x0054:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0027 }
            r4.<init>()     // Catch:{ all -> 0x0027 }
            java.lang.String r5 = "Failed to parse "
            r4.append(r5)     // Catch:{ all -> 0x0027 }
            java.lang.Class<com.stripe.android.model.Token> r5 = com.stripe.android.model.Token.class
            java.lang.String r5 = r5.getSimpleName()     // Catch:{ all -> 0x0027 }
            r4.append(r5)     // Catch:{ all -> 0x0027 }
            r5 = 46
            r4.append(r5)     // Catch:{ all -> 0x0027 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0027 }
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0027 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0027 }
            r5.<init>(r4)     // Catch:{ all -> 0x0027 }
            throw r5     // Catch:{ all -> 0x0027 }
        L_0x007a:
            java.lang.Object r8 = i0.j.f.p.h.l0(r4)
        L_0x007e:
            java.lang.Throwable r4 = kotlin.Result.a(r8)
            if (r4 != 0) goto L_0x0087
            com.stripe.android.model.StripeModel r8 = (com.stripe.android.model.StripeModel) r8
            return r8
        L_0x0087:
            com.stripe.android.exception.StripeException$Companion r5 = com.stripe.android.exception.StripeException.Companion
            com.stripe.android.exception.StripeException r4 = r5.create(r4)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.StripeKtxKt.createCvcUpdateToken(com.stripe.android.Stripe, java.lang.String, java.lang.String, java.lang.String, m0.l.c):java.lang.Object");
    }

    public static /* synthetic */ Object createCvcUpdateToken$default(Stripe stripe, String str, String str2, String str3, c cVar, int i, Object obj) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = stripe.getStripeAccountId$payments_core_release();
        }
        return createCvcUpdateToken(stripe, str, str2, str3, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004e A[Catch:{ all -> 0x0027 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004f A[Catch:{ all -> 0x0027 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object createFile(com.stripe.android.Stripe r4, com.stripe.android.model.StripeFileParams r5, java.lang.String r6, java.lang.String r7, m0.l.c<? super com.stripe.android.model.StripeFile> r8) throws com.stripe.android.exception.AuthenticationException, com.stripe.android.exception.InvalidRequestException, com.stripe.android.exception.APIConnectionException, com.stripe.android.exception.APIException, com.stripe.android.exception.CardException {
        /*
            boolean r0 = r8 instanceof com.stripe.android.StripeKtxKt$createFile$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.stripe.android.StripeKtxKt$createFile$1 r0 = (com.stripe.android.StripeKtxKt$createFile$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.stripe.android.StripeKtxKt$createFile$1 r0 = new com.stripe.android.StripeKtxKt$createFile$1
            r0.<init>(r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            i0.j.f.p.h.d4(r8)     // Catch:{ all -> 0x0027 }
            goto L_0x004a
        L_0x0027:
            r4 = move-exception
            goto L_0x0075
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            i0.j.f.p.h.d4(r8)
            com.stripe.android.networking.StripeRepository r8 = r4.getStripeRepository$payments_core_release()     // Catch:{ all -> 0x0027 }
            com.stripe.android.networking.ApiRequest$Options r2 = new com.stripe.android.networking.ApiRequest$Options     // Catch:{ all -> 0x0027 }
            java.lang.String r4 = r4.getPublishableKey$payments_core_release()     // Catch:{ all -> 0x0027 }
            r2.<init>(r4, r7, r6)     // Catch:{ all -> 0x0027 }
            r0.label = r3     // Catch:{ all -> 0x0027 }
            java.lang.Object r8 = r8.createFile(r5, r2, r0)     // Catch:{ all -> 0x0027 }
            if (r8 != r1) goto L_0x004a
            return r1
        L_0x004a:
            com.stripe.android.model.StripeFile r8 = (com.stripe.android.model.StripeFile) r8     // Catch:{ all -> 0x0027 }
            if (r8 == 0) goto L_0x004f
            goto L_0x0079
        L_0x004f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0027 }
            r4.<init>()     // Catch:{ all -> 0x0027 }
            java.lang.String r5 = "Failed to parse "
            r4.append(r5)     // Catch:{ all -> 0x0027 }
            java.lang.Class<com.stripe.android.model.StripeFile> r5 = com.stripe.android.model.StripeFile.class
            java.lang.String r5 = r5.getSimpleName()     // Catch:{ all -> 0x0027 }
            r4.append(r5)     // Catch:{ all -> 0x0027 }
            r5 = 46
            r4.append(r5)     // Catch:{ all -> 0x0027 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0027 }
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0027 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0027 }
            r5.<init>(r4)     // Catch:{ all -> 0x0027 }
            throw r5     // Catch:{ all -> 0x0027 }
        L_0x0075:
            java.lang.Object r8 = i0.j.f.p.h.l0(r4)
        L_0x0079:
            java.lang.Throwable r4 = kotlin.Result.a(r8)
            if (r4 != 0) goto L_0x0082
            com.stripe.android.model.StripeModel r8 = (com.stripe.android.model.StripeModel) r8
            return r8
        L_0x0082:
            com.stripe.android.exception.StripeException$Companion r5 = com.stripe.android.exception.StripeException.Companion
            com.stripe.android.exception.StripeException r4 = r5.create(r4)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.StripeKtxKt.createFile(com.stripe.android.Stripe, com.stripe.android.model.StripeFileParams, java.lang.String, java.lang.String, m0.l.c):java.lang.Object");
    }

    public static /* synthetic */ Object createFile$default(Stripe stripe, StripeFileParams stripeFileParams, String str, String str2, c cVar, int i, Object obj) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException, CardException {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = stripe.getStripeAccountId$payments_core_release();
        }
        return createFile(stripe, stripeFileParams, str, str2, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004e A[Catch:{ all -> 0x0027 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004f A[Catch:{ all -> 0x0027 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object createPaymentMethod(com.stripe.android.Stripe r4, com.stripe.android.model.PaymentMethodCreateParams r5, java.lang.String r6, java.lang.String r7, m0.l.c<? super com.stripe.android.model.PaymentMethod> r8) throws com.stripe.android.exception.AuthenticationException, com.stripe.android.exception.InvalidRequestException, com.stripe.android.exception.APIConnectionException, com.stripe.android.exception.APIException {
        /*
            boolean r0 = r8 instanceof com.stripe.android.StripeKtxKt$createPaymentMethod$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.stripe.android.StripeKtxKt$createPaymentMethod$1 r0 = (com.stripe.android.StripeKtxKt$createPaymentMethod$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.stripe.android.StripeKtxKt$createPaymentMethod$1 r0 = new com.stripe.android.StripeKtxKt$createPaymentMethod$1
            r0.<init>(r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            i0.j.f.p.h.d4(r8)     // Catch:{ all -> 0x0027 }
            goto L_0x004a
        L_0x0027:
            r4 = move-exception
            goto L_0x0075
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            i0.j.f.p.h.d4(r8)
            com.stripe.android.networking.StripeRepository r8 = r4.getStripeRepository$payments_core_release()     // Catch:{ all -> 0x0027 }
            com.stripe.android.networking.ApiRequest$Options r2 = new com.stripe.android.networking.ApiRequest$Options     // Catch:{ all -> 0x0027 }
            java.lang.String r4 = r4.getPublishableKey$payments_core_release()     // Catch:{ all -> 0x0027 }
            r2.<init>(r4, r7, r6)     // Catch:{ all -> 0x0027 }
            r0.label = r3     // Catch:{ all -> 0x0027 }
            java.lang.Object r8 = r8.createPaymentMethod(r5, r2, r0)     // Catch:{ all -> 0x0027 }
            if (r8 != r1) goto L_0x004a
            return r1
        L_0x004a:
            com.stripe.android.model.PaymentMethod r8 = (com.stripe.android.model.PaymentMethod) r8     // Catch:{ all -> 0x0027 }
            if (r8 == 0) goto L_0x004f
            goto L_0x0079
        L_0x004f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0027 }
            r4.<init>()     // Catch:{ all -> 0x0027 }
            java.lang.String r5 = "Failed to parse "
            r4.append(r5)     // Catch:{ all -> 0x0027 }
            java.lang.Class<com.stripe.android.model.PaymentMethod> r5 = com.stripe.android.model.PaymentMethod.class
            java.lang.String r5 = r5.getSimpleName()     // Catch:{ all -> 0x0027 }
            r4.append(r5)     // Catch:{ all -> 0x0027 }
            r5 = 46
            r4.append(r5)     // Catch:{ all -> 0x0027 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0027 }
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0027 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0027 }
            r5.<init>(r4)     // Catch:{ all -> 0x0027 }
            throw r5     // Catch:{ all -> 0x0027 }
        L_0x0075:
            java.lang.Object r8 = i0.j.f.p.h.l0(r4)
        L_0x0079:
            java.lang.Throwable r4 = kotlin.Result.a(r8)
            if (r4 != 0) goto L_0x0082
            com.stripe.android.model.StripeModel r8 = (com.stripe.android.model.StripeModel) r8
            return r8
        L_0x0082:
            com.stripe.android.exception.StripeException$Companion r5 = com.stripe.android.exception.StripeException.Companion
            com.stripe.android.exception.StripeException r4 = r5.create(r4)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.StripeKtxKt.createPaymentMethod(com.stripe.android.Stripe, com.stripe.android.model.PaymentMethodCreateParams, java.lang.String, java.lang.String, m0.l.c):java.lang.Object");
    }

    public static /* synthetic */ Object createPaymentMethod$default(Stripe stripe, PaymentMethodCreateParams paymentMethodCreateParams, String str, String str2, c cVar, int i, Object obj) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = stripe.getStripeAccountId$payments_core_release();
        }
        return createPaymentMethod(stripe, paymentMethodCreateParams, str, str2, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004e A[Catch:{ all -> 0x0027 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004f A[Catch:{ all -> 0x0027 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object createPersonToken(com.stripe.android.Stripe r4, com.stripe.android.model.PersonTokenParams r5, java.lang.String r6, java.lang.String r7, m0.l.c<? super com.stripe.android.model.Token> r8) throws com.stripe.android.exception.AuthenticationException, com.stripe.android.exception.InvalidRequestException, com.stripe.android.exception.APIConnectionException, com.stripe.android.exception.APIException {
        /*
            boolean r0 = r8 instanceof com.stripe.android.StripeKtxKt$createPersonToken$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.stripe.android.StripeKtxKt$createPersonToken$1 r0 = (com.stripe.android.StripeKtxKt$createPersonToken$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.stripe.android.StripeKtxKt$createPersonToken$1 r0 = new com.stripe.android.StripeKtxKt$createPersonToken$1
            r0.<init>(r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            i0.j.f.p.h.d4(r8)     // Catch:{ all -> 0x0027 }
            goto L_0x004a
        L_0x0027:
            r4 = move-exception
            goto L_0x0075
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            i0.j.f.p.h.d4(r8)
            com.stripe.android.networking.StripeRepository r8 = r4.getStripeRepository$payments_core_release()     // Catch:{ all -> 0x0027 }
            com.stripe.android.networking.ApiRequest$Options r2 = new com.stripe.android.networking.ApiRequest$Options     // Catch:{ all -> 0x0027 }
            java.lang.String r4 = r4.getPublishableKey$payments_core_release()     // Catch:{ all -> 0x0027 }
            r2.<init>(r4, r7, r6)     // Catch:{ all -> 0x0027 }
            r0.label = r3     // Catch:{ all -> 0x0027 }
            java.lang.Object r8 = r8.createToken(r5, r2, r0)     // Catch:{ all -> 0x0027 }
            if (r8 != r1) goto L_0x004a
            return r1
        L_0x004a:
            com.stripe.android.model.Token r8 = (com.stripe.android.model.Token) r8     // Catch:{ all -> 0x0027 }
            if (r8 == 0) goto L_0x004f
            goto L_0x0079
        L_0x004f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0027 }
            r4.<init>()     // Catch:{ all -> 0x0027 }
            java.lang.String r5 = "Failed to parse "
            r4.append(r5)     // Catch:{ all -> 0x0027 }
            java.lang.Class<com.stripe.android.model.Token> r5 = com.stripe.android.model.Token.class
            java.lang.String r5 = r5.getSimpleName()     // Catch:{ all -> 0x0027 }
            r4.append(r5)     // Catch:{ all -> 0x0027 }
            r5 = 46
            r4.append(r5)     // Catch:{ all -> 0x0027 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0027 }
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0027 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0027 }
            r5.<init>(r4)     // Catch:{ all -> 0x0027 }
            throw r5     // Catch:{ all -> 0x0027 }
        L_0x0075:
            java.lang.Object r8 = i0.j.f.p.h.l0(r4)
        L_0x0079:
            java.lang.Throwable r4 = kotlin.Result.a(r8)
            if (r4 != 0) goto L_0x0082
            com.stripe.android.model.StripeModel r8 = (com.stripe.android.model.StripeModel) r8
            return r8
        L_0x0082:
            com.stripe.android.exception.StripeException$Companion r5 = com.stripe.android.exception.StripeException.Companion
            com.stripe.android.exception.StripeException r4 = r5.create(r4)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.StripeKtxKt.createPersonToken(com.stripe.android.Stripe, com.stripe.android.model.PersonTokenParams, java.lang.String, java.lang.String, m0.l.c):java.lang.Object");
    }

    public static /* synthetic */ Object createPersonToken$default(Stripe stripe, PersonTokenParams personTokenParams, String str, String str2, c cVar, int i, Object obj) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = stripe.getStripeAccountId$payments_core_release();
        }
        return createPersonToken(stripe, personTokenParams, str, str2, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0053 A[Catch:{ all -> 0x0027 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0054 A[Catch:{ all -> 0x0027 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object createPiiToken(com.stripe.android.Stripe r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, m0.l.c<? super com.stripe.android.model.Token> r8) throws com.stripe.android.exception.AuthenticationException, com.stripe.android.exception.InvalidRequestException, com.stripe.android.exception.APIConnectionException, com.stripe.android.exception.APIException {
        /*
            boolean r0 = r8 instanceof com.stripe.android.StripeKtxKt$createPiiToken$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.stripe.android.StripeKtxKt$createPiiToken$1 r0 = (com.stripe.android.StripeKtxKt$createPiiToken$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.stripe.android.StripeKtxKt$createPiiToken$1 r0 = new com.stripe.android.StripeKtxKt$createPiiToken$1
            r0.<init>(r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            i0.j.f.p.h.d4(r8)     // Catch:{ all -> 0x0027 }
            goto L_0x004f
        L_0x0027:
            r4 = move-exception
            goto L_0x007a
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            i0.j.f.p.h.d4(r8)
            com.stripe.android.networking.StripeRepository r8 = r4.getStripeRepository$payments_core_release()     // Catch:{ all -> 0x0027 }
            com.stripe.android.model.PiiTokenParams r2 = new com.stripe.android.model.PiiTokenParams     // Catch:{ all -> 0x0027 }
            r2.<init>(r5)     // Catch:{ all -> 0x0027 }
            com.stripe.android.networking.ApiRequest$Options r5 = new com.stripe.android.networking.ApiRequest$Options     // Catch:{ all -> 0x0027 }
            java.lang.String r4 = r4.getPublishableKey$payments_core_release()     // Catch:{ all -> 0x0027 }
            r5.<init>(r4, r7, r6)     // Catch:{ all -> 0x0027 }
            r0.label = r3     // Catch:{ all -> 0x0027 }
            java.lang.Object r8 = r8.createToken(r2, r5, r0)     // Catch:{ all -> 0x0027 }
            if (r8 != r1) goto L_0x004f
            return r1
        L_0x004f:
            com.stripe.android.model.Token r8 = (com.stripe.android.model.Token) r8     // Catch:{ all -> 0x0027 }
            if (r8 == 0) goto L_0x0054
            goto L_0x007e
        L_0x0054:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0027 }
            r4.<init>()     // Catch:{ all -> 0x0027 }
            java.lang.String r5 = "Failed to parse "
            r4.append(r5)     // Catch:{ all -> 0x0027 }
            java.lang.Class<com.stripe.android.model.Token> r5 = com.stripe.android.model.Token.class
            java.lang.String r5 = r5.getSimpleName()     // Catch:{ all -> 0x0027 }
            r4.append(r5)     // Catch:{ all -> 0x0027 }
            r5 = 46
            r4.append(r5)     // Catch:{ all -> 0x0027 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0027 }
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0027 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0027 }
            r5.<init>(r4)     // Catch:{ all -> 0x0027 }
            throw r5     // Catch:{ all -> 0x0027 }
        L_0x007a:
            java.lang.Object r8 = i0.j.f.p.h.l0(r4)
        L_0x007e:
            java.lang.Throwable r4 = kotlin.Result.a(r8)
            if (r4 != 0) goto L_0x0087
            com.stripe.android.model.StripeModel r8 = (com.stripe.android.model.StripeModel) r8
            return r8
        L_0x0087:
            com.stripe.android.exception.StripeException$Companion r5 = com.stripe.android.exception.StripeException.Companion
            com.stripe.android.exception.StripeException r4 = r5.create(r4)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.StripeKtxKt.createPiiToken(com.stripe.android.Stripe, java.lang.String, java.lang.String, java.lang.String, m0.l.c):java.lang.Object");
    }

    public static /* synthetic */ Object createPiiToken$default(Stripe stripe, String str, String str2, String str3, c cVar, int i, Object obj) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = stripe.getStripeAccountId$payments_core_release();
        }
        return createPiiToken(stripe, str, str2, str3, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0056 A[Catch:{ all -> 0x0027 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0057 A[Catch:{ all -> 0x0027 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object createRadarSession(com.stripe.android.Stripe r10, m0.l.c<? super com.stripe.android.model.RadarSession> r11) throws com.stripe.android.exception.AuthenticationException, com.stripe.android.exception.InvalidRequestException, com.stripe.android.exception.APIConnectionException, com.stripe.android.exception.APIException {
        /*
            boolean r0 = r11 instanceof com.stripe.android.StripeKtxKt$createRadarSession$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.stripe.android.StripeKtxKt$createRadarSession$1 r0 = (com.stripe.android.StripeKtxKt$createRadarSession$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.stripe.android.StripeKtxKt$createRadarSession$1 r0 = new com.stripe.android.StripeKtxKt$createRadarSession$1
            r0.<init>(r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            i0.j.f.p.h.d4(r11)     // Catch:{ all -> 0x0027 }
            goto L_0x0052
        L_0x0027:
            r10 = move-exception
            goto L_0x007d
        L_0x0029:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0031:
            i0.j.f.p.h.d4(r11)
            com.stripe.android.networking.StripeRepository r11 = r10.getStripeRepository$payments_core_release()     // Catch:{ all -> 0x0027 }
            com.stripe.android.networking.ApiRequest$Options r2 = new com.stripe.android.networking.ApiRequest$Options     // Catch:{ all -> 0x0027 }
            java.lang.String r5 = r10.getPublishableKey$payments_core_release()     // Catch:{ all -> 0x0027 }
            java.lang.String r6 = r10.getStripeAccountId$payments_core_release()     // Catch:{ all -> 0x0027 }
            r7 = 0
            r8 = 4
            r9 = 0
            r4 = r2
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0027 }
            r0.label = r3     // Catch:{ all -> 0x0027 }
            java.lang.Object r11 = r11.createRadarSession(r2, r0)     // Catch:{ all -> 0x0027 }
            if (r11 != r1) goto L_0x0052
            return r1
        L_0x0052:
            com.stripe.android.model.RadarSession r11 = (com.stripe.android.model.RadarSession) r11     // Catch:{ all -> 0x0027 }
            if (r11 == 0) goto L_0x0057
            goto L_0x0081
        L_0x0057:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0027 }
            r10.<init>()     // Catch:{ all -> 0x0027 }
            java.lang.String r11 = "Failed to parse "
            r10.append(r11)     // Catch:{ all -> 0x0027 }
            java.lang.Class<com.stripe.android.model.RadarSession> r11 = com.stripe.android.model.RadarSession.class
            java.lang.String r11 = r11.getSimpleName()     // Catch:{ all -> 0x0027 }
            r10.append(r11)     // Catch:{ all -> 0x0027 }
            r11 = 46
            r10.append(r11)     // Catch:{ all -> 0x0027 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0027 }
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0027 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0027 }
            r11.<init>(r10)     // Catch:{ all -> 0x0027 }
            throw r11     // Catch:{ all -> 0x0027 }
        L_0x007d:
            java.lang.Object r11 = i0.j.f.p.h.l0(r10)
        L_0x0081:
            java.lang.Throwable r10 = kotlin.Result.a(r11)
            if (r10 != 0) goto L_0x008a
            com.stripe.android.model.StripeModel r11 = (com.stripe.android.model.StripeModel) r11
            return r11
        L_0x008a:
            com.stripe.android.exception.StripeException$Companion r11 = com.stripe.android.exception.StripeException.Companion
            com.stripe.android.exception.StripeException r10 = r11.create(r10)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.StripeKtxKt.createRadarSession(com.stripe.android.Stripe, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004e A[Catch:{ all -> 0x0027 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004f A[Catch:{ all -> 0x0027 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object createSource(com.stripe.android.Stripe r4, com.stripe.android.model.SourceParams r5, java.lang.String r6, java.lang.String r7, m0.l.c<? super com.stripe.android.model.Source> r8) throws com.stripe.android.exception.AuthenticationException, com.stripe.android.exception.InvalidRequestException, com.stripe.android.exception.APIConnectionException, com.stripe.android.exception.APIException {
        /*
            boolean r0 = r8 instanceof com.stripe.android.StripeKtxKt$createSource$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.stripe.android.StripeKtxKt$createSource$1 r0 = (com.stripe.android.StripeKtxKt$createSource$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.stripe.android.StripeKtxKt$createSource$1 r0 = new com.stripe.android.StripeKtxKt$createSource$1
            r0.<init>(r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            i0.j.f.p.h.d4(r8)     // Catch:{ all -> 0x0027 }
            goto L_0x004a
        L_0x0027:
            r4 = move-exception
            goto L_0x0075
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            i0.j.f.p.h.d4(r8)
            com.stripe.android.networking.StripeRepository r8 = r4.getStripeRepository$payments_core_release()     // Catch:{ all -> 0x0027 }
            com.stripe.android.networking.ApiRequest$Options r2 = new com.stripe.android.networking.ApiRequest$Options     // Catch:{ all -> 0x0027 }
            java.lang.String r4 = r4.getPublishableKey$payments_core_release()     // Catch:{ all -> 0x0027 }
            r2.<init>(r4, r7, r6)     // Catch:{ all -> 0x0027 }
            r0.label = r3     // Catch:{ all -> 0x0027 }
            java.lang.Object r8 = r8.createSource(r5, r2, r0)     // Catch:{ all -> 0x0027 }
            if (r8 != r1) goto L_0x004a
            return r1
        L_0x004a:
            com.stripe.android.model.Source r8 = (com.stripe.android.model.Source) r8     // Catch:{ all -> 0x0027 }
            if (r8 == 0) goto L_0x004f
            goto L_0x0079
        L_0x004f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0027 }
            r4.<init>()     // Catch:{ all -> 0x0027 }
            java.lang.String r5 = "Failed to parse "
            r4.append(r5)     // Catch:{ all -> 0x0027 }
            java.lang.Class<com.stripe.android.model.Source> r5 = com.stripe.android.model.Source.class
            java.lang.String r5 = r5.getSimpleName()     // Catch:{ all -> 0x0027 }
            r4.append(r5)     // Catch:{ all -> 0x0027 }
            r5 = 46
            r4.append(r5)     // Catch:{ all -> 0x0027 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0027 }
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0027 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0027 }
            r5.<init>(r4)     // Catch:{ all -> 0x0027 }
            throw r5     // Catch:{ all -> 0x0027 }
        L_0x0075:
            java.lang.Object r8 = i0.j.f.p.h.l0(r4)
        L_0x0079:
            java.lang.Throwable r4 = kotlin.Result.a(r8)
            if (r4 != 0) goto L_0x0082
            com.stripe.android.model.StripeModel r8 = (com.stripe.android.model.StripeModel) r8
            return r8
        L_0x0082:
            com.stripe.android.exception.StripeException$Companion r5 = com.stripe.android.exception.StripeException.Companion
            com.stripe.android.exception.StripeException r4 = r5.create(r4)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.StripeKtxKt.createSource(com.stripe.android.Stripe, com.stripe.android.model.SourceParams, java.lang.String, java.lang.String, m0.l.c):java.lang.Object");
    }

    public static /* synthetic */ Object createSource$default(Stripe stripe, SourceParams sourceParams, String str, String str2, c cVar, int i, Object obj) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = stripe.getStripeAccountId$payments_core_release();
        }
        return createSource(stripe, sourceParams, str, str2, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object getAuthenticateSourceResult(com.stripe.android.Stripe r4, int r5, android.content.Intent r6, m0.l.c<? super com.stripe.android.model.Source> r7) throws com.stripe.android.exception.AuthenticationException, com.stripe.android.exception.InvalidRequestException, com.stripe.android.exception.APIConnectionException, com.stripe.android.exception.APIException {
        /*
            boolean r0 = r7 instanceof com.stripe.android.StripeKtxKt$getAuthenticateSourceResult$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.stripe.android.StripeKtxKt$getAuthenticateSourceResult$1 r0 = (com.stripe.android.StripeKtxKt$getAuthenticateSourceResult$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.stripe.android.StripeKtxKt$getAuthenticateSourceResult$1 r0 = new com.stripe.android.StripeKtxKt$getAuthenticateSourceResult$1
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            i0.j.f.p.h.d4(r7)     // Catch:{ all -> 0x0027 }
            goto L_0x0047
        L_0x0027:
            r4 = move-exception
            goto L_0x0070
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            i0.j.f.p.h.d4(r7)
            boolean r5 = r4.isAuthenticateSourceResult(r5, r6)
            if (r5 == 0) goto L_0x004a
            com.stripe.android.PaymentController r4 = r4.getPaymentController$payments_core_release()     // Catch:{ all -> 0x0027 }
            r0.label = r3     // Catch:{ all -> 0x0027 }
            java.lang.Object r7 = r4.getAuthenticateSourceResult(r6, r0)     // Catch:{ all -> 0x0027 }
            if (r7 != r1) goto L_0x0047
            return r1
        L_0x0047:
            com.stripe.android.model.Source r7 = (com.stripe.android.model.Source) r7     // Catch:{ all -> 0x0027 }
            goto L_0x0074
        L_0x004a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0027 }
            r4.<init>()     // Catch:{ all -> 0x0027 }
            java.lang.String r5 = "Incorrect requestCode and data for "
            r4.append(r5)     // Catch:{ all -> 0x0027 }
            java.lang.Class<com.stripe.android.model.Source> r5 = com.stripe.android.model.Source.class
            java.lang.String r5 = r5.getSimpleName()     // Catch:{ all -> 0x0027 }
            r4.append(r5)     // Catch:{ all -> 0x0027 }
            r5 = 46
            r4.append(r5)     // Catch:{ all -> 0x0027 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0027 }
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0027 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0027 }
            r5.<init>(r4)     // Catch:{ all -> 0x0027 }
            throw r5     // Catch:{ all -> 0x0027 }
        L_0x0070:
            java.lang.Object r7 = i0.j.f.p.h.l0(r4)
        L_0x0074:
            java.lang.Throwable r4 = kotlin.Result.a(r7)
            if (r4 != 0) goto L_0x007d
            com.stripe.android.model.StripeModel r7 = (com.stripe.android.model.StripeModel) r7
            return r7
        L_0x007d:
            com.stripe.android.exception.StripeException$Companion r5 = com.stripe.android.exception.StripeException.Companion
            com.stripe.android.exception.StripeException r4 = r5.create(r4)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.StripeKtxKt.getAuthenticateSourceResult(com.stripe.android.Stripe, int, android.content.Intent, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object getPaymentIntentResult(com.stripe.android.Stripe r4, int r5, android.content.Intent r6, m0.l.c<? super com.stripe.android.PaymentIntentResult> r7) throws com.stripe.android.exception.AuthenticationException, com.stripe.android.exception.InvalidRequestException, com.stripe.android.exception.APIConnectionException, com.stripe.android.exception.APIException {
        /*
            boolean r0 = r7 instanceof com.stripe.android.StripeKtxKt$getPaymentIntentResult$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.stripe.android.StripeKtxKt$getPaymentIntentResult$1 r0 = (com.stripe.android.StripeKtxKt$getPaymentIntentResult$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.stripe.android.StripeKtxKt$getPaymentIntentResult$1 r0 = new com.stripe.android.StripeKtxKt$getPaymentIntentResult$1
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            i0.j.f.p.h.d4(r7)     // Catch:{ all -> 0x0027 }
            goto L_0x0047
        L_0x0027:
            r4 = move-exception
            goto L_0x0070
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            i0.j.f.p.h.d4(r7)
            boolean r5 = r4.isPaymentResult(r5, r6)
            if (r5 == 0) goto L_0x004a
            com.stripe.android.PaymentController r4 = r4.getPaymentController$payments_core_release()     // Catch:{ all -> 0x0027 }
            r0.label = r3     // Catch:{ all -> 0x0027 }
            java.lang.Object r7 = r4.getPaymentIntentResult(r6, r0)     // Catch:{ all -> 0x0027 }
            if (r7 != r1) goto L_0x0047
            return r1
        L_0x0047:
            com.stripe.android.PaymentIntentResult r7 = (com.stripe.android.PaymentIntentResult) r7     // Catch:{ all -> 0x0027 }
            goto L_0x0074
        L_0x004a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0027 }
            r4.<init>()     // Catch:{ all -> 0x0027 }
            java.lang.String r5 = "Incorrect requestCode and data for "
            r4.append(r5)     // Catch:{ all -> 0x0027 }
            java.lang.Class<com.stripe.android.PaymentIntentResult> r5 = com.stripe.android.PaymentIntentResult.class
            java.lang.String r5 = r5.getSimpleName()     // Catch:{ all -> 0x0027 }
            r4.append(r5)     // Catch:{ all -> 0x0027 }
            r5 = 46
            r4.append(r5)     // Catch:{ all -> 0x0027 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0027 }
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0027 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0027 }
            r5.<init>(r4)     // Catch:{ all -> 0x0027 }
            throw r5     // Catch:{ all -> 0x0027 }
        L_0x0070:
            java.lang.Object r7 = i0.j.f.p.h.l0(r4)
        L_0x0074:
            java.lang.Throwable r4 = kotlin.Result.a(r7)
            if (r4 != 0) goto L_0x007d
            com.stripe.android.model.StripeModel r7 = (com.stripe.android.model.StripeModel) r7
            return r7
        L_0x007d:
            com.stripe.android.exception.StripeException$Companion r5 = com.stripe.android.exception.StripeException.Companion
            com.stripe.android.exception.StripeException r4 = r5.create(r4)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.StripeKtxKt.getPaymentIntentResult(com.stripe.android.Stripe, int, android.content.Intent, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object getSetupIntentResult(com.stripe.android.Stripe r4, int r5, android.content.Intent r6, m0.l.c<? super com.stripe.android.SetupIntentResult> r7) throws com.stripe.android.exception.AuthenticationException, com.stripe.android.exception.InvalidRequestException, com.stripe.android.exception.APIConnectionException, com.stripe.android.exception.APIException, java.lang.IllegalArgumentException {
        /*
            boolean r0 = r7 instanceof com.stripe.android.StripeKtxKt$getSetupIntentResult$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.stripe.android.StripeKtxKt$getSetupIntentResult$1 r0 = (com.stripe.android.StripeKtxKt$getSetupIntentResult$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.stripe.android.StripeKtxKt$getSetupIntentResult$1 r0 = new com.stripe.android.StripeKtxKt$getSetupIntentResult$1
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            i0.j.f.p.h.d4(r7)     // Catch:{ all -> 0x0027 }
            goto L_0x0047
        L_0x0027:
            r4 = move-exception
            goto L_0x0070
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            i0.j.f.p.h.d4(r7)
            boolean r5 = r4.isSetupResult(r5, r6)
            if (r5 == 0) goto L_0x004a
            com.stripe.android.PaymentController r4 = r4.getPaymentController$payments_core_release()     // Catch:{ all -> 0x0027 }
            r0.label = r3     // Catch:{ all -> 0x0027 }
            java.lang.Object r7 = r4.getSetupIntentResult(r6, r0)     // Catch:{ all -> 0x0027 }
            if (r7 != r1) goto L_0x0047
            return r1
        L_0x0047:
            com.stripe.android.SetupIntentResult r7 = (com.stripe.android.SetupIntentResult) r7     // Catch:{ all -> 0x0027 }
            goto L_0x0074
        L_0x004a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0027 }
            r4.<init>()     // Catch:{ all -> 0x0027 }
            java.lang.String r5 = "Incorrect requestCode and data for "
            r4.append(r5)     // Catch:{ all -> 0x0027 }
            java.lang.Class<com.stripe.android.SetupIntentResult> r5 = com.stripe.android.SetupIntentResult.class
            java.lang.String r5 = r5.getSimpleName()     // Catch:{ all -> 0x0027 }
            r4.append(r5)     // Catch:{ all -> 0x0027 }
            r5 = 46
            r4.append(r5)     // Catch:{ all -> 0x0027 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0027 }
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0027 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0027 }
            r5.<init>(r4)     // Catch:{ all -> 0x0027 }
            throw r5     // Catch:{ all -> 0x0027 }
        L_0x0070:
            java.lang.Object r7 = i0.j.f.p.h.l0(r4)
        L_0x0074:
            java.lang.Throwable r4 = kotlin.Result.a(r7)
            if (r4 != 0) goto L_0x007d
            com.stripe.android.model.StripeModel r7 = (com.stripe.android.model.StripeModel) r7
            return r7
        L_0x007d:
            com.stripe.android.exception.StripeException$Companion r5 = com.stripe.android.exception.StripeException.Companion
            com.stripe.android.exception.StripeException r4 = r5.create(r4)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.StripeKtxKt.getSetupIntentResult(com.stripe.android.Stripe, int, android.content.Intent, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0058 A[Catch:{ all -> 0x0028 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0059 A[Catch:{ all -> 0x0028 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object retrievePaymentIntent(com.stripe.android.Stripe r12, java.lang.String r13, java.lang.String r14, m0.l.c<? super com.stripe.android.model.PaymentIntent> r15) throws com.stripe.android.exception.AuthenticationException, com.stripe.android.exception.InvalidRequestException, com.stripe.android.exception.APIConnectionException, com.stripe.android.exception.APIException {
        /*
            boolean r0 = r15 instanceof com.stripe.android.StripeKtxKt$retrievePaymentIntent$1
            if (r0 == 0) goto L_0x0013
            r0 = r15
            com.stripe.android.StripeKtxKt$retrievePaymentIntent$1 r0 = (com.stripe.android.StripeKtxKt$retrievePaymentIntent$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.stripe.android.StripeKtxKt$retrievePaymentIntent$1 r0 = new com.stripe.android.StripeKtxKt$retrievePaymentIntent$1
            r0.<init>(r15)
        L_0x0018:
            r5 = r0
            java.lang.Object r15 = r5.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L_0x0032
            if (r1 != r2) goto L_0x002a
            i0.j.f.p.h.d4(r15)     // Catch:{ all -> 0x0028 }
            goto L_0x0054
        L_0x0028:
            r12 = move-exception
            goto L_0x007f
        L_0x002a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0032:
            i0.j.f.p.h.d4(r15)
            com.stripe.android.networking.StripeRepository r1 = r12.getStripeRepository$payments_core_release()     // Catch:{ all -> 0x0028 }
            com.stripe.android.networking.ApiRequest$Options r3 = new com.stripe.android.networking.ApiRequest$Options     // Catch:{ all -> 0x0028 }
            java.lang.String r7 = r12.getPublishableKey$payments_core_release()     // Catch:{ all -> 0x0028 }
            r9 = 0
            r10 = 4
            r11 = 0
            r6 = r3
            r8 = r14
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0028 }
            r4 = 0
            r6 = 4
            r7 = 0
            r5.label = r2     // Catch:{ all -> 0x0028 }
            r2 = r13
            java.lang.Object r15 = com.stripe.android.networking.StripeRepository.DefaultImpls.retrievePaymentIntent$default(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0028 }
            if (r15 != r0) goto L_0x0054
            return r0
        L_0x0054:
            com.stripe.android.model.PaymentIntent r15 = (com.stripe.android.model.PaymentIntent) r15     // Catch:{ all -> 0x0028 }
            if (r15 == 0) goto L_0x0059
            goto L_0x0083
        L_0x0059:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0028 }
            r12.<init>()     // Catch:{ all -> 0x0028 }
            java.lang.String r13 = "Failed to parse "
            r12.append(r13)     // Catch:{ all -> 0x0028 }
            java.lang.Class<com.stripe.android.model.PaymentIntent> r13 = com.stripe.android.model.PaymentIntent.class
            java.lang.String r13 = r13.getSimpleName()     // Catch:{ all -> 0x0028 }
            r12.append(r13)     // Catch:{ all -> 0x0028 }
            r13 = 46
            r12.append(r13)     // Catch:{ all -> 0x0028 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x0028 }
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0028 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x0028 }
            r13.<init>(r12)     // Catch:{ all -> 0x0028 }
            throw r13     // Catch:{ all -> 0x0028 }
        L_0x007f:
            java.lang.Object r15 = i0.j.f.p.h.l0(r12)
        L_0x0083:
            java.lang.Throwable r12 = kotlin.Result.a(r15)
            if (r12 != 0) goto L_0x008c
            com.stripe.android.model.StripeModel r15 = (com.stripe.android.model.StripeModel) r15
            return r15
        L_0x008c:
            com.stripe.android.exception.StripeException$Companion r13 = com.stripe.android.exception.StripeException.Companion
            com.stripe.android.exception.StripeException r12 = r13.create(r12)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.StripeKtxKt.retrievePaymentIntent(com.stripe.android.Stripe, java.lang.String, java.lang.String, m0.l.c):java.lang.Object");
    }

    public static /* synthetic */ Object retrievePaymentIntent$default(Stripe stripe, String str, String str2, c cVar, int i, Object obj) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        if ((i & 2) != 0) {
            str2 = stripe.getStripeAccountId$payments_core_release();
        }
        return retrievePaymentIntent(stripe, str, str2, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0058 A[Catch:{ all -> 0x0028 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0059 A[Catch:{ all -> 0x0028 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object retrieveSetupIntent(com.stripe.android.Stripe r12, java.lang.String r13, java.lang.String r14, m0.l.c<? super com.stripe.android.model.SetupIntent> r15) throws com.stripe.android.exception.AuthenticationException, com.stripe.android.exception.InvalidRequestException, com.stripe.android.exception.APIConnectionException, com.stripe.android.exception.APIException {
        /*
            boolean r0 = r15 instanceof com.stripe.android.StripeKtxKt$retrieveSetupIntent$1
            if (r0 == 0) goto L_0x0013
            r0 = r15
            com.stripe.android.StripeKtxKt$retrieveSetupIntent$1 r0 = (com.stripe.android.StripeKtxKt$retrieveSetupIntent$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.stripe.android.StripeKtxKt$retrieveSetupIntent$1 r0 = new com.stripe.android.StripeKtxKt$retrieveSetupIntent$1
            r0.<init>(r15)
        L_0x0018:
            r5 = r0
            java.lang.Object r15 = r5.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L_0x0032
            if (r1 != r2) goto L_0x002a
            i0.j.f.p.h.d4(r15)     // Catch:{ all -> 0x0028 }
            goto L_0x0054
        L_0x0028:
            r12 = move-exception
            goto L_0x007f
        L_0x002a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0032:
            i0.j.f.p.h.d4(r15)
            com.stripe.android.networking.StripeRepository r1 = r12.getStripeRepository$payments_core_release()     // Catch:{ all -> 0x0028 }
            com.stripe.android.networking.ApiRequest$Options r3 = new com.stripe.android.networking.ApiRequest$Options     // Catch:{ all -> 0x0028 }
            java.lang.String r7 = r12.getPublishableKey$payments_core_release()     // Catch:{ all -> 0x0028 }
            r9 = 0
            r10 = 4
            r11 = 0
            r6 = r3
            r8 = r14
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0028 }
            r4 = 0
            r6 = 4
            r7 = 0
            r5.label = r2     // Catch:{ all -> 0x0028 }
            r2 = r13
            java.lang.Object r15 = com.stripe.android.networking.StripeRepository.DefaultImpls.retrieveSetupIntent$default(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0028 }
            if (r15 != r0) goto L_0x0054
            return r0
        L_0x0054:
            com.stripe.android.model.SetupIntent r15 = (com.stripe.android.model.SetupIntent) r15     // Catch:{ all -> 0x0028 }
            if (r15 == 0) goto L_0x0059
            goto L_0x0083
        L_0x0059:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0028 }
            r12.<init>()     // Catch:{ all -> 0x0028 }
            java.lang.String r13 = "Failed to parse "
            r12.append(r13)     // Catch:{ all -> 0x0028 }
            java.lang.Class<com.stripe.android.model.SetupIntent> r13 = com.stripe.android.model.SetupIntent.class
            java.lang.String r13 = r13.getSimpleName()     // Catch:{ all -> 0x0028 }
            r12.append(r13)     // Catch:{ all -> 0x0028 }
            r13 = 46
            r12.append(r13)     // Catch:{ all -> 0x0028 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x0028 }
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0028 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x0028 }
            r13.<init>(r12)     // Catch:{ all -> 0x0028 }
            throw r13     // Catch:{ all -> 0x0028 }
        L_0x007f:
            java.lang.Object r15 = i0.j.f.p.h.l0(r12)
        L_0x0083:
            java.lang.Throwable r12 = kotlin.Result.a(r15)
            if (r12 != 0) goto L_0x008c
            com.stripe.android.model.StripeModel r15 = (com.stripe.android.model.StripeModel) r15
            return r15
        L_0x008c:
            com.stripe.android.exception.StripeException$Companion r13 = com.stripe.android.exception.StripeException.Companion
            com.stripe.android.exception.StripeException r12 = r13.create(r12)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.StripeKtxKt.retrieveSetupIntent(com.stripe.android.Stripe, java.lang.String, java.lang.String, m0.l.c):java.lang.Object");
    }

    public static /* synthetic */ Object retrieveSetupIntent$default(Stripe stripe, String str, String str2, c cVar, int i, Object obj) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        if ((i & 2) != 0) {
            str2 = stripe.getStripeAccountId$payments_core_release();
        }
        return retrieveSetupIntent(stripe, str, str2, cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0053 A[Catch:{ all -> 0x0027 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0054 A[Catch:{ all -> 0x0027 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object retrieveSource(com.stripe.android.Stripe r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, m0.l.c<? super com.stripe.android.model.Source> r14) throws com.stripe.android.exception.AuthenticationException, com.stripe.android.exception.InvalidRequestException, com.stripe.android.exception.APIConnectionException, com.stripe.android.exception.APIException {
        /*
            boolean r0 = r14 instanceof com.stripe.android.StripeKtxKt$retrieveSource$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.stripe.android.StripeKtxKt$retrieveSource$1 r0 = (com.stripe.android.StripeKtxKt$retrieveSource$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.stripe.android.StripeKtxKt$retrieveSource$1 r0 = new com.stripe.android.StripeKtxKt$retrieveSource$1
            r0.<init>(r14)
        L_0x0018:
            java.lang.Object r14 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            i0.j.f.p.h.d4(r14)     // Catch:{ all -> 0x0027 }
            goto L_0x004f
        L_0x0027:
            r10 = move-exception
            goto L_0x007a
        L_0x0029:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0031:
            i0.j.f.p.h.d4(r14)
            com.stripe.android.networking.StripeRepository r14 = r10.getStripeRepository$payments_core_release()     // Catch:{ all -> 0x0027 }
            com.stripe.android.networking.ApiRequest$Options r2 = new com.stripe.android.networking.ApiRequest$Options     // Catch:{ all -> 0x0027 }
            java.lang.String r5 = r10.getPublishableKey$payments_core_release()     // Catch:{ all -> 0x0027 }
            r7 = 0
            r8 = 4
            r9 = 0
            r4 = r2
            r6 = r13
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0027 }
            r0.label = r3     // Catch:{ all -> 0x0027 }
            java.lang.Object r14 = r14.retrieveSource(r11, r12, r2, r0)     // Catch:{ all -> 0x0027 }
            if (r14 != r1) goto L_0x004f
            return r1
        L_0x004f:
            com.stripe.android.model.Source r14 = (com.stripe.android.model.Source) r14     // Catch:{ all -> 0x0027 }
            if (r14 == 0) goto L_0x0054
            goto L_0x007e
        L_0x0054:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0027 }
            r10.<init>()     // Catch:{ all -> 0x0027 }
            java.lang.String r11 = "Failed to parse "
            r10.append(r11)     // Catch:{ all -> 0x0027 }
            java.lang.Class<com.stripe.android.model.Source> r11 = com.stripe.android.model.Source.class
            java.lang.String r11 = r11.getSimpleName()     // Catch:{ all -> 0x0027 }
            r10.append(r11)     // Catch:{ all -> 0x0027 }
            r11 = 46
            r10.append(r11)     // Catch:{ all -> 0x0027 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0027 }
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0027 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0027 }
            r11.<init>(r10)     // Catch:{ all -> 0x0027 }
            throw r11     // Catch:{ all -> 0x0027 }
        L_0x007a:
            java.lang.Object r14 = i0.j.f.p.h.l0(r10)
        L_0x007e:
            java.lang.Throwable r10 = kotlin.Result.a(r14)
            if (r10 != 0) goto L_0x0087
            com.stripe.android.model.StripeModel r14 = (com.stripe.android.model.StripeModel) r14
            return r14
        L_0x0087:
            com.stripe.android.exception.StripeException$Companion r11 = com.stripe.android.exception.StripeException.Companion
            com.stripe.android.exception.StripeException r10 = r11.create(r10)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.StripeKtxKt.retrieveSource(com.stripe.android.Stripe, java.lang.String, java.lang.String, java.lang.String, m0.l.c):java.lang.Object");
    }

    public static /* synthetic */ Object retrieveSource$default(Stripe stripe, String str, String str2, String str3, c cVar, int i, Object obj) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException {
        if ((i & 4) != 0) {
            str3 = stripe.getStripeAccountId$payments_core_release();
        }
        return retrieveSource(stripe, str, str2, str3, cVar);
    }

    private static final <ApiObject extends StripeModel> ApiObject runApiRequest(a<? extends ApiObject> aVar) {
        ApiObject apiobject;
        try {
            ApiObject invoke = aVar.invoke();
            if (invoke != null) {
                apiobject = (StripeModel) invoke;
                Throwable a = Result.a(apiobject);
                if (a == null) {
                    return (StripeModel) apiobject;
                }
                throw StripeException.Companion.create(a);
            }
            new StringBuilder().append("Failed to parse ");
            i.i();
            throw null;
        } catch (Throwable th) {
            apiobject = h.l0(th);
        }
    }

    public static final <ApiObject extends StripeModel> ApiObject runApiRequest(boolean z, a<? extends ApiObject> aVar) {
        ApiObject apiobject;
        i.e(aVar, "block");
        if (z) {
            try {
                apiobject = (StripeModel) aVar.invoke();
            } catch (Throwable th) {
                apiobject = h.l0(th);
            }
            Throwable a = Result.a(apiobject);
            if (a == null) {
                return (StripeModel) apiobject;
            }
            throw StripeException.Companion.create(a);
        }
        new StringBuilder().append("Incorrect requestCode and data for ");
        i.i();
        throw null;
    }
}
