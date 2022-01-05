package com.stripe.android.paymentsheet.flowcontroller;

import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PrefsRepository;
import com.stripe.android.paymentsheet.flowcontroller.FlowControllerInitializer;
import com.stripe.android.paymentsheet.model.ClientSecret;
import com.stripe.android.paymentsheet.model.StripeIntentValidator;
import com.stripe.android.paymentsheet.repositories.PaymentMethodsRepository;
import com.stripe.android.paymentsheet.repositories.StripeIntentRepository;
import kotlin.Metadata;
import m0.l.c;
import m0.l.e;
import m0.n.a.p;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001BR\u0012\u0018\u0010/\u001a\u0014\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00160-\u0012$\u00104\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u000101\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001002\u0012\u0006\u0012\u0004\u0018\u0001030-\u0012\u0006\u0010+\u001a\u00020*ø\u0001\u0000¢\u0006\u0004\b5\u00106J5\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ5\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0011\u001a\u00020\u0010H@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0011\u001a\u00020\u0010H@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J1\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00182\u0006\u0010\u000e\u001a\u00020\rH@ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u001b\u0010#\u001a\u00020\"2\u0006\u0010\u0003\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b#\u0010$R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0007\u0010&R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R(\u0010/\u001a\u0014\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00160-8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u00100R7\u00104\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u000101\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001002\u0012\u0006\u0012\u0004\u0018\u0001030-8\u0002@\u0002X\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b4\u00100\u0002\u0004\n\u0002\b\u0019¨\u00067"}, d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowControllerInitializer;", "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerInitializer;", "Lcom/stripe/android/paymentsheet/model/ClientSecret;", "clientSecret", "Lcom/stripe/android/paymentsheet/repositories/StripeIntentRepository;", "stripeIntentRepository", "Lcom/stripe/android/paymentsheet/repositories/PaymentMethodsRepository;", "paymentMethodsRepository", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "paymentSheetConfiguration", "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerInitializer$InitResult;", "init", "(Lcom/stripe/android/paymentsheet/model/ClientSecret;Lcom/stripe/android/paymentsheet/repositories/StripeIntentRepository;Lcom/stripe/android/paymentsheet/repositories/PaymentMethodsRepository;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;", "customerConfig", "config", "", "isGooglePayReady", "createWithCustomer", "(Lcom/stripe/android/paymentsheet/model/ClientSecret;Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;ZLm0/l/c;)Ljava/lang/Object;", "createWithoutCustomer", "(Lcom/stripe/android/paymentsheet/model/ClientSecret;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;ZLm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/paymentsheet/PrefsRepository;", "prefsRepository", "", "Lcom/stripe/android/model/PaymentMethod;", "paymentMethods", "Lm0/i;", "setLastSavedPaymentMethod", "(Lcom/stripe/android/paymentsheet/PrefsRepository;ZLjava/util/List;Lm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/model/PaymentMethod$Type;", "types", "retrieveAllPaymentMethods", "(Ljava/util/List;Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;Lm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/model/StripeIntent;", "retrieveStripeIntent", "(Lcom/stripe/android/paymentsheet/model/ClientSecret;Lm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/paymentsheet/repositories/StripeIntentRepository;", "Lcom/stripe/android/paymentsheet/repositories/PaymentMethodsRepository;", "Lcom/stripe/android/paymentsheet/model/StripeIntentValidator;", "stripeIntentValidator", "Lcom/stripe/android/paymentsheet/model/StripeIntentValidator;", "Lm0/l/e;", "workContext", "Lm0/l/e;", "Lkotlin/Function2;", "", "prefsRepositoryFactory", "Lm0/n/a/p;", "Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$Environment;", "Lm0/l/c;", "", "isGooglePayReadySupplier", "<init>", "(Lm0/n/a/p;Lm0/n/a/p;Lm0/l/e;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: DefaultFlowControllerInitializer.kt */
public final class DefaultFlowControllerInitializer implements FlowControllerInitializer {
    /* access modifiers changed from: private */
    public final p<PaymentSheet.GooglePayConfiguration.Environment, c<? super Boolean>, Object> isGooglePayReadySupplier;
    /* access modifiers changed from: private */
    public PaymentMethodsRepository paymentMethodsRepository;
    private final p<String, Boolean, PrefsRepository> prefsRepositoryFactory;
    /* access modifiers changed from: private */
    public StripeIntentRepository stripeIntentRepository;
    private final StripeIntentValidator stripeIntentValidator = new StripeIntentValidator();
    private final e workContext;

    public DefaultFlowControllerInitializer(p<? super String, ? super Boolean, ? extends PrefsRepository> pVar, p<? super PaymentSheet.GooglePayConfiguration.Environment, ? super c<? super Boolean>, ? extends Object> pVar2, e eVar) {
        i.e(pVar, "prefsRepositoryFactory");
        i.e(pVar2, "isGooglePayReadySupplier");
        i.e(eVar, "workContext");
        this.prefsRepositoryFactory = pVar;
        this.isGooglePayReadySupplier = pVar2;
        this.workContext = eVar;
    }

    public static final /* synthetic */ PaymentMethodsRepository access$getPaymentMethodsRepository$p(DefaultFlowControllerInitializer defaultFlowControllerInitializer) {
        PaymentMethodsRepository paymentMethodsRepository2 = defaultFlowControllerInitializer.paymentMethodsRepository;
        if (paymentMethodsRepository2 != null) {
            return paymentMethodsRepository2;
        }
        i.m("paymentMethodsRepository");
        throw null;
    }

    public static final /* synthetic */ StripeIntentRepository access$getStripeIntentRepository$p(DefaultFlowControllerInitializer defaultFlowControllerInitializer) {
        StripeIntentRepository stripeIntentRepository2 = defaultFlowControllerInitializer.stripeIntentRepository;
        if (stripeIntentRepository2 != null) {
            return stripeIntentRepository2;
        }
        i.m("stripeIntentRepository");
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x018b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01a8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object createWithCustomer(com.stripe.android.paymentsheet.model.ClientSecret r19, com.stripe.android.paymentsheet.PaymentSheet.CustomerConfiguration r20, com.stripe.android.paymentsheet.PaymentSheet.Configuration r21, boolean r22, m0.l.c<? super com.stripe.android.paymentsheet.flowcontroller.FlowControllerInitializer.InitResult> r23) {
        /*
            r18 = this;
            r1 = r18
            r2 = r19
            r0 = r23
            boolean r3 = r0 instanceof com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer$createWithCustomer$1
            if (r3 == 0) goto L_0x0019
            r3 = r0
            com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer$createWithCustomer$1 r3 = (com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer$createWithCustomer$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.label = r4
            goto L_0x001e
        L_0x0019:
            com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer$createWithCustomer$1 r3 = new com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer$createWithCustomer$1
            r3.<init>(r1, r0)
        L_0x001e:
            java.lang.Object r0 = r3.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r4 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r5 = r3.label
            r6 = 4
            r7 = 3
            r8 = 2
            r9 = 1
            if (r5 == 0) goto L_0x00c9
            if (r5 == r9) goto L_0x00a0
            if (r5 == r8) goto L_0x0081
            if (r5 == r7) goto L_0x005e
            if (r5 != r6) goto L_0x0056
            boolean r2 = r3.Z$0
            java.lang.Object r4 = r3.L$4
            com.stripe.android.paymentsheet.PaymentSheet$Configuration r4 = (com.stripe.android.paymentsheet.PaymentSheet.Configuration) r4
            java.lang.Object r5 = r3.L$3
            com.stripe.android.paymentsheet.model.ClientSecret r5 = (com.stripe.android.paymentsheet.model.ClientSecret) r5
            java.lang.Object r6 = r3.L$2
            com.stripe.android.model.StripeIntent r6 = (com.stripe.android.model.StripeIntent) r6
            java.lang.Object r7 = r3.L$1
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r3 = r3.L$0
            java.util.List r3 = (java.util.List) r3
            i0.j.f.p.h.d4(r0)
            r9 = r2
            r16 = r7
            r7 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r16
            goto L_0x01b0
        L_0x0056:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x005e:
            boolean r2 = r3.Z$0
            java.lang.Object r5 = r3.L$5
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r7 = r3.L$4
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r8 = r3.L$3
            com.stripe.android.model.StripeIntent r8 = (com.stripe.android.model.StripeIntent) r8
            java.lang.Object r9 = r3.L$2
            com.stripe.android.paymentsheet.PrefsRepository r9 = (com.stripe.android.paymentsheet.PrefsRepository) r9
            java.lang.Object r10 = r3.L$1
            com.stripe.android.paymentsheet.PaymentSheet$Configuration r10 = (com.stripe.android.paymentsheet.PaymentSheet.Configuration) r10
            java.lang.Object r11 = r3.L$0
            com.stripe.android.paymentsheet.model.ClientSecret r11 = (com.stripe.android.paymentsheet.model.ClientSecret) r11
            i0.j.f.p.h.d4(r0)
            r0 = r7
            r6 = r8
            r7 = r5
        L_0x007e:
            r5 = r11
            goto L_0x0190
        L_0x0081:
            boolean r2 = r3.Z$0
            java.lang.Object r5 = r3.L$5
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r8 = r3.L$4
            com.stripe.android.model.StripeIntent r8 = (com.stripe.android.model.StripeIntent) r8
            java.lang.Object r9 = r3.L$3
            com.stripe.android.paymentsheet.PrefsRepository r9 = (com.stripe.android.paymentsheet.PrefsRepository) r9
            java.lang.Object r10 = r3.L$2
            com.stripe.android.paymentsheet.PaymentSheet$Configuration r10 = (com.stripe.android.paymentsheet.PaymentSheet.Configuration) r10
            java.lang.Object r11 = r3.L$1
            com.stripe.android.paymentsheet.model.ClientSecret r11 = (com.stripe.android.paymentsheet.model.ClientSecret) r11
            java.lang.Object r12 = r3.L$0
            com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer r12 = (com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer) r12
            i0.j.f.p.h.d4(r0)
            goto L_0x0173
        L_0x00a0:
            boolean r2 = r3.Z$0
            java.lang.Object r5 = r3.L$4
            com.stripe.android.paymentsheet.PrefsRepository r5 = (com.stripe.android.paymentsheet.PrefsRepository) r5
            java.lang.Object r9 = r3.L$3
            com.stripe.android.paymentsheet.PaymentSheet$Configuration r9 = (com.stripe.android.paymentsheet.PaymentSheet.Configuration) r9
            java.lang.Object r10 = r3.L$2
            com.stripe.android.paymentsheet.PaymentSheet$CustomerConfiguration r10 = (com.stripe.android.paymentsheet.PaymentSheet.CustomerConfiguration) r10
            java.lang.Object r11 = r3.L$1
            com.stripe.android.paymentsheet.model.ClientSecret r11 = (com.stripe.android.paymentsheet.model.ClientSecret) r11
            java.lang.Object r12 = r3.L$0
            com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer r12 = (com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer) r12
            i0.j.f.p.h.d4(r0)     // Catch:{ all -> 0x00bf }
            r16 = r12
            r12 = r2
            r2 = r16
            goto L_0x00fb
        L_0x00bf:
            r0 = move-exception
            r16 = r9
            r9 = r0
            r0 = r12
            r12 = r2
        L_0x00c5:
            r2 = r11
            r11 = r16
            goto L_0x011d
        L_0x00c9:
            i0.j.f.p.h.d4(r0)
            m0.n.a.p<java.lang.String, java.lang.Boolean, com.stripe.android.paymentsheet.PrefsRepository> r0 = r1.prefsRepositoryFactory
            java.lang.String r5 = r20.getId()
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r22)
            java.lang.Object r0 = r0.invoke(r5, r10)
            r5 = r0
            com.stripe.android.paymentsheet.PrefsRepository r5 = (com.stripe.android.paymentsheet.PrefsRepository) r5
            r3.L$0 = r1     // Catch:{ all -> 0x0114 }
            r3.L$1 = r2     // Catch:{ all -> 0x0114 }
            r10 = r20
            r3.L$2 = r10     // Catch:{ all -> 0x0112 }
            r11 = r21
            r3.L$3 = r11     // Catch:{ all -> 0x0110 }
            r3.L$4 = r5     // Catch:{ all -> 0x0110 }
            r12 = r22
            r3.Z$0 = r12     // Catch:{ all -> 0x010e }
            r3.label = r9     // Catch:{ all -> 0x010e }
            java.lang.Object r0 = r1.retrieveStripeIntent(r2, r3)     // Catch:{ all -> 0x010e }
            if (r0 != r4) goto L_0x00f8
            return r4
        L_0x00f8:
            r9 = r11
            r11 = r2
            r2 = r1
        L_0x00fb:
            com.stripe.android.model.StripeIntent r0 = (com.stripe.android.model.StripeIntent) r0     // Catch:{ all -> 0x0108 }
            r16 = r12
            r12 = r2
            r2 = r16
            r17 = r11
            r11 = r9
            r9 = r17
            goto L_0x0128
        L_0x0108:
            r0 = move-exception
            r16 = r9
            r9 = r0
            r0 = r2
            goto L_0x00c5
        L_0x010e:
            r0 = move-exception
            goto L_0x011b
        L_0x0110:
            r0 = move-exception
            goto L_0x0119
        L_0x0112:
            r0 = move-exception
            goto L_0x0117
        L_0x0114:
            r0 = move-exception
            r10 = r20
        L_0x0117:
            r11 = r21
        L_0x0119:
            r12 = r22
        L_0x011b:
            r9 = r0
            r0 = r1
        L_0x011d:
            java.lang.Object r9 = i0.j.f.p.h.l0(r9)
            r16 = r12
            r12 = r0
            r0 = r9
            r9 = r2
            r2 = r16
        L_0x0128:
            java.lang.Throwable r13 = kotlin.Result.a(r0)
            if (r13 != 0) goto L_0x01bf
            com.stripe.android.model.StripeIntent r0 = (com.stripe.android.model.StripeIntent) r0
            java.util.List r13 = r0.getPaymentMethodTypes()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r13 = r13.iterator()
        L_0x013d:
            boolean r15 = r13.hasNext()
            if (r15 == 0) goto L_0x0156
            java.lang.Object r15 = r13.next()
            java.lang.String r15 = (java.lang.String) r15
            com.stripe.android.model.PaymentMethod$Type$Companion r6 = com.stripe.android.model.PaymentMethod.Type.Companion
            com.stripe.android.model.PaymentMethod$Type r6 = r6.fromCode$payments_core_release(r15)
            if (r6 == 0) goto L_0x0154
            r14.add(r6)
        L_0x0154:
            r6 = 4
            goto L_0x013d
        L_0x0156:
            r3.L$0 = r12
            r3.L$1 = r9
            r3.L$2 = r11
            r3.L$3 = r5
            r3.L$4 = r0
            r3.L$5 = r14
            r3.Z$0 = r2
            r3.label = r8
            java.lang.Object r6 = r12.retrieveAllPaymentMethods(r14, r10, r3)
            if (r6 != r4) goto L_0x016d
            return r4
        L_0x016d:
            r8 = r0
            r0 = r6
            r10 = r11
            r11 = r9
            r9 = r5
            r5 = r14
        L_0x0173:
            java.util.List r0 = (java.util.List) r0
            r3.L$0 = r11
            r3.L$1 = r10
            r3.L$2 = r9
            r3.L$3 = r8
            r3.L$4 = r0
            r3.L$5 = r5
            r3.Z$0 = r2
            r3.label = r7
            java.lang.Object r6 = r12.setLastSavedPaymentMethod(r9, r2, r0, r3)
            if (r6 != r4) goto L_0x018c
            return r4
        L_0x018c:
            r7 = r5
            r6 = r8
            goto L_0x007e
        L_0x0190:
            r3.L$0 = r0
            r3.L$1 = r7
            r3.L$2 = r6
            r3.L$3 = r5
            r3.L$4 = r10
            r8 = 0
            r3.L$5 = r8
            r3.Z$0 = r2
            r8 = 4
            r3.label = r8
            java.lang.Object r3 = r9.getSavedSelection(r3)
            if (r3 != r4) goto L_0x01a9
            return r4
        L_0x01a9:
            r9 = r2
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r0
            r0 = r3
            r3 = r10
        L_0x01b0:
            r8 = r0
            com.stripe.android.paymentsheet.model.SavedSelection r8 = (com.stripe.android.paymentsheet.model.SavedSelection) r8
            com.stripe.android.paymentsheet.flowcontroller.InitData r0 = new com.stripe.android.paymentsheet.flowcontroller.InitData
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            com.stripe.android.paymentsheet.flowcontroller.FlowControllerInitializer$InitResult$Success r2 = new com.stripe.android.paymentsheet.flowcontroller.FlowControllerInitializer$InitResult$Success
            r2.<init>(r0)
            goto L_0x01c4
        L_0x01bf:
            com.stripe.android.paymentsheet.flowcontroller.FlowControllerInitializer$InitResult$Failure r2 = new com.stripe.android.paymentsheet.flowcontroller.FlowControllerInitializer$InitResult$Failure
            r2.<init>(r13)
        L_0x01c4:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer.createWithCustomer(com.stripe.android.paymentsheet.model.ClientSecret, com.stripe.android.paymentsheet.PaymentSheet$CustomerConfiguration, com.stripe.android.paymentsheet.PaymentSheet$Configuration, boolean, m0.l.c):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: com.stripe.android.paymentsheet.PaymentSheet$Configuration} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object createWithoutCustomer(com.stripe.android.paymentsheet.model.ClientSecret r9, com.stripe.android.paymentsheet.PaymentSheet.Configuration r10, boolean r11, m0.l.c<? super com.stripe.android.paymentsheet.flowcontroller.FlowControllerInitializer.InitResult> r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer$createWithoutCustomer$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer$createWithoutCustomer$1 r0 = (com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer$createWithoutCustomer$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer$createWithoutCustomer$1 r0 = new com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer$createWithoutCustomer$1
            r0.<init>(r8, r12)
        L_0x0018:
            java.lang.Object r12 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            boolean r11 = r0.Z$0
            java.lang.Object r9 = r0.L$1
            r10 = r9
            com.stripe.android.paymentsheet.PaymentSheet$Configuration r10 = (com.stripe.android.paymentsheet.PaymentSheet.Configuration) r10
            java.lang.Object r9 = r0.L$0
            com.stripe.android.paymentsheet.model.ClientSecret r9 = (com.stripe.android.paymentsheet.model.ClientSecret) r9
            i0.j.f.p.h.d4(r12)     // Catch:{ all -> 0x0032 }
            goto L_0x004e
        L_0x0032:
            r12 = move-exception
            goto L_0x0051
        L_0x0034:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003c:
            i0.j.f.p.h.d4(r12)
            r0.L$0 = r9     // Catch:{ all -> 0x0032 }
            r0.L$1 = r10     // Catch:{ all -> 0x0032 }
            r0.Z$0 = r11     // Catch:{ all -> 0x0032 }
            r0.label = r3     // Catch:{ all -> 0x0032 }
            java.lang.Object r12 = r8.retrieveStripeIntent(r9, r0)     // Catch:{ all -> 0x0032 }
            if (r12 != r1) goto L_0x004e
            return r1
        L_0x004e:
            com.stripe.android.model.StripeIntent r12 = (com.stripe.android.model.StripeIntent) r12     // Catch:{ all -> 0x0032 }
            goto L_0x0055
        L_0x0051:
            java.lang.Object r12 = i0.j.f.p.h.l0(r12)
        L_0x0055:
            r2 = r9
            r1 = r10
            r7 = r11
            java.lang.Throwable r9 = kotlin.Result.a(r12)
            if (r9 != 0) goto L_0x009c
            r3 = r12
            com.stripe.android.model.StripeIntent r3 = (com.stripe.android.model.StripeIntent) r3
            java.util.List r9 = r3.getPaymentMethodTypes()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x006e:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0086
            java.lang.Object r10 = r9.next()
            java.lang.String r10 = (java.lang.String) r10
            com.stripe.android.model.PaymentMethod$Type$Companion r11 = com.stripe.android.model.PaymentMethod.Type.Companion
            com.stripe.android.model.PaymentMethod$Type r10 = r11.fromCode$payments_core_release(r10)
            if (r10 == 0) goto L_0x006e
            r4.add(r10)
            goto L_0x006e
        L_0x0086:
            if (r7 == 0) goto L_0x008b
            com.stripe.android.paymentsheet.model.SavedSelection$GooglePay r9 = com.stripe.android.paymentsheet.model.SavedSelection.GooglePay.INSTANCE
            goto L_0x008d
        L_0x008b:
            com.stripe.android.paymentsheet.model.SavedSelection$None r9 = com.stripe.android.paymentsheet.model.SavedSelection.None.INSTANCE
        L_0x008d:
            r6 = r9
            com.stripe.android.paymentsheet.flowcontroller.FlowControllerInitializer$InitResult$Success r9 = new com.stripe.android.paymentsheet.flowcontroller.FlowControllerInitializer$InitResult$Success
            com.stripe.android.paymentsheet.flowcontroller.InitData r10 = new com.stripe.android.paymentsheet.flowcontroller.InitData
            kotlin.collections.EmptyList r5 = kotlin.collections.EmptyList.c
            r0 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r9.<init>(r10)
            goto L_0x00a2
        L_0x009c:
            com.stripe.android.paymentsheet.flowcontroller.FlowControllerInitializer$InitResult$Failure r10 = new com.stripe.android.paymentsheet.flowcontroller.FlowControllerInitializer$InitResult$Failure
            r10.<init>(r9)
            r9 = r10
        L_0x00a2:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer.createWithoutCustomer(com.stripe.android.paymentsheet.model.ClientSecret, com.stripe.android.paymentsheet.PaymentSheet$Configuration, boolean, m0.l.c):java.lang.Object");
    }

    public Object init(ClientSecret clientSecret, StripeIntentRepository stripeIntentRepository2, PaymentMethodsRepository paymentMethodsRepository2, PaymentSheet.Configuration configuration, c<? super FlowControllerInitializer.InitResult> cVar) {
        return a.k4(this.workContext, new DefaultFlowControllerInitializer$init$2(this, stripeIntentRepository2, paymentMethodsRepository2, configuration, clientSecret, (c) null), cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object retrieveAllPaymentMethods(java.util.List<? extends com.stripe.android.model.PaymentMethod.Type> r8, com.stripe.android.paymentsheet.PaymentSheet.CustomerConfiguration r9, m0.l.c<? super java.util.List<com.stripe.android.model.PaymentMethod>> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer$retrieveAllPaymentMethods$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer$retrieveAllPaymentMethods$1 r0 = (com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer$retrieveAllPaymentMethods$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer$retrieveAllPaymentMethods$1 r0 = new com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer$retrieveAllPaymentMethods$1
            r0.<init>(r7, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            java.lang.Object r8 = r0.L$3
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r9 = r0.L$2
            java.util.Collection r9 = (java.util.Collection) r9
            java.lang.Object r2 = r0.L$1
            com.stripe.android.paymentsheet.PaymentSheet$CustomerConfiguration r2 = (com.stripe.android.paymentsheet.PaymentSheet.CustomerConfiguration) r2
            java.lang.Object r4 = r0.L$0
            com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer r4 = (com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer) r4
            i0.j.f.p.h.d4(r10)
            goto L_0x0073
        L_0x0037:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003f:
            i0.j.f.p.h.d4(r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r8 = r8.iterator()
            r4 = r7
            r6 = r10
            r10 = r9
            r9 = r6
        L_0x004f:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L_0x0081
            java.lang.Object r2 = r8.next()
            com.stripe.android.model.PaymentMethod$Type r2 = (com.stripe.android.model.PaymentMethod.Type) r2
            com.stripe.android.paymentsheet.repositories.PaymentMethodsRepository r5 = r4.paymentMethodsRepository
            if (r5 == 0) goto L_0x007a
            r0.L$0 = r4
            r0.L$1 = r10
            r0.L$2 = r9
            r0.L$3 = r8
            r0.label = r3
            java.lang.Object r2 = r5.get(r10, r2, r0)
            if (r2 != r1) goto L_0x0070
            return r1
        L_0x0070:
            r6 = r2
            r2 = r10
            r10 = r6
        L_0x0073:
            java.util.List r10 = (java.util.List) r10
            m0.j.g.b(r9, r10)
            r10 = r2
            goto L_0x004f
        L_0x007a:
            java.lang.String r8 = "paymentMethodsRepository"
            m0.n.b.i.m(r8)
            r8 = 0
            throw r8
        L_0x0081:
            java.util.List r9 = (java.util.List) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer.retrieveAllPaymentMethods(java.util.List, com.stripe.android.paymentsheet.PaymentSheet$CustomerConfiguration, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object retrieveStripeIntent(com.stripe.android.paymentsheet.model.ClientSecret r6, m0.l.c<? super com.stripe.android.model.StripeIntent> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer$retrieveStripeIntent$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer$retrieveStripeIntent$1 r0 = (com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer$retrieveStripeIntent$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer$retrieveStripeIntent$1 r0 = new com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer$retrieveStripeIntent$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r6 = r0.L$0
            com.stripe.android.paymentsheet.model.StripeIntentValidator r6 = (com.stripe.android.paymentsheet.model.StripeIntentValidator) r6
            i0.j.f.p.h.d4(r7)
            goto L_0x004a
        L_0x002b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0033:
            i0.j.f.p.h.d4(r7)
            com.stripe.android.paymentsheet.model.StripeIntentValidator r7 = r5.stripeIntentValidator
            com.stripe.android.paymentsheet.repositories.StripeIntentRepository r2 = r5.stripeIntentRepository
            if (r2 == 0) goto L_0x0051
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r6 = r2.get(r6, r0)
            if (r6 != r1) goto L_0x0047
            return r1
        L_0x0047:
            r4 = r7
            r7 = r6
            r6 = r4
        L_0x004a:
            com.stripe.android.model.StripeIntent r7 = (com.stripe.android.model.StripeIntent) r7
            com.stripe.android.model.StripeIntent r6 = r6.requireValid(r7)
            return r6
        L_0x0051:
            java.lang.String r6 = "stripeIntentRepository"
            m0.n.b.i.m(r6)
            r6 = 0
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer.retrieveStripeIntent(com.stripe.android.paymentsheet.model.ClientSecret, m0.l.c):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.util.List<com.stripe.android.model.PaymentMethod>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object setLastSavedPaymentMethod(com.stripe.android.paymentsheet.PrefsRepository r5, boolean r6, java.util.List<com.stripe.android.model.PaymentMethod> r7, m0.l.c<? super m0.i> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer$setLastSavedPaymentMethod$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer$setLastSavedPaymentMethod$1 r0 = (com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer$setLastSavedPaymentMethod$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer$setLastSavedPaymentMethod$1 r0 = new com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer$setLastSavedPaymentMethod$1
            r0.<init>(r4, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            boolean r6 = r0.Z$0
            java.lang.Object r5 = r0.L$1
            r7 = r5
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r5 = r0.L$0
            com.stripe.android.paymentsheet.PrefsRepository r5 = (com.stripe.android.paymentsheet.PrefsRepository) r5
            i0.j.f.p.h.d4(r8)
            goto L_0x004c
        L_0x0032:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003a:
            i0.j.f.p.h.d4(r8)
            r0.L$0 = r5
            r0.L$1 = r7
            r0.Z$0 = r6
            r0.label = r3
            java.lang.Object r8 = r5.getSavedSelection(r0)
            if (r8 != r1) goto L_0x004c
            return r1
        L_0x004c:
            com.stripe.android.paymentsheet.model.SavedSelection r8 = (com.stripe.android.paymentsheet.model.SavedSelection) r8
            com.stripe.android.paymentsheet.model.SavedSelection$None r0 = com.stripe.android.paymentsheet.model.SavedSelection.None.INSTANCE
            boolean r8 = m0.n.b.i.a(r8, r0)
            if (r8 == 0) goto L_0x0074
            boolean r8 = r7.isEmpty()
            r8 = r8 ^ r3
            if (r8 == 0) goto L_0x0069
            com.stripe.android.paymentsheet.model.PaymentSelection$Saved r6 = new com.stripe.android.paymentsheet.model.PaymentSelection$Saved
            java.lang.Object r7 = m0.j.g.u(r7)
            com.stripe.android.model.PaymentMethod r7 = (com.stripe.android.model.PaymentMethod) r7
            r6.<init>(r7)
            goto L_0x006f
        L_0x0069:
            if (r6 == 0) goto L_0x006e
            com.stripe.android.paymentsheet.model.PaymentSelection$GooglePay r6 = com.stripe.android.paymentsheet.model.PaymentSelection.GooglePay.INSTANCE
            goto L_0x006f
        L_0x006e:
            r6 = 0
        L_0x006f:
            if (r6 == 0) goto L_0x0074
            r5.savePaymentSelection(r6)
        L_0x0074:
            m0.i r5 = m0.i.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer.setLastSavedPaymentMethod(com.stripe.android.paymentsheet.PrefsRepository, boolean, java.util.List, m0.l.c):java.lang.Object");
    }
}
