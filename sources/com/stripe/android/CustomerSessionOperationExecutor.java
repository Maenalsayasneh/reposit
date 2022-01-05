package com.stripe.android;

import com.stripe.android.CustomerSession;
import com.stripe.android.exception.StripeException;
import com.stripe.android.model.Customer;
import com.stripe.android.networking.ApiRequest;
import com.stripe.android.networking.StripeRepository;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import m0.i;
import m0.l.c;
import m0.n.a.l;
import m0.n.b.f;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 -2\u00020\u0001:\u0001-BK\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010\u001f\u001a\u00020\u0011\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0011\u0012\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\n0$\u0012\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070'¢\u0006\u0004\b+\u0010,J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0013\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0010*\u0004\u0018\u00010\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u001d\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001a\u001a\u00020\u00152\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00110\u001bH@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u00118\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R$\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\n0$8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\"\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070'8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010*\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010 \u0002\u0004\n\u0002\b\u0019¨\u0006."}, d2 = {"Lcom/stripe/android/CustomerSessionOperationExecutor;", "", "Lcom/stripe/android/EphemeralOperation;", "operation", "Lkotlin/Result;", "Lcom/stripe/android/model/Customer;", "result", "Lm0/i;", "onCustomerRetrieved", "(Lcom/stripe/android/EphemeralOperation;Ljava/lang/Object;)V", "Lcom/stripe/android/CustomerSession$RetrievalListener;", "listener", "", "error", "onError", "(Lcom/stripe/android/CustomerSession$RetrievalListener;Ljava/lang/Throwable;)V", "L", "", "operationId", "getListener", "(Ljava/lang/String;)Lcom/stripe/android/CustomerSession$RetrievalListener;", "Lcom/stripe/android/EphemeralKey;", "ephemeralKey", "execute$payments_core_release", "(Lcom/stripe/android/EphemeralKey;Lcom/stripe/android/EphemeralOperation;Lm0/l/c;)Ljava/lang/Object;", "execute", "key", "", "productUsage", "retrieveCustomerWithKey", "(Lcom/stripe/android/EphemeralKey;Ljava/util/Set;Lm0/l/c;)Ljava/lang/Object;", "publishableKey", "Ljava/lang/String;", "Lcom/stripe/android/networking/StripeRepository;", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "", "listeners", "Ljava/util/Map;", "Lkotlin/Function1;", "onCustomerUpdated", "Lm0/n/a/l;", "stripeAccountId", "<init>", "(Lcom/stripe/android/networking/StripeRepository;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lm0/n/a/l;)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: CustomerSessionOperationExecutor.kt */
public final class CustomerSessionOperationExecutor {
    private static final Companion Companion = new Companion((f) null);
    @Deprecated
    private static final String REQUIRED_ERROR = "API request returned an invalid response.";
    private final Map<String, CustomerSession.RetrievalListener> listeners;
    private final l<Customer, i> onCustomerUpdated;
    private final String publishableKey;
    private final String stripeAccountId;
    private final StripeRepository stripeRepository;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/CustomerSessionOperationExecutor$Companion;", "", "", "REQUIRED_ERROR", "Ljava/lang/String;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: CustomerSessionOperationExecutor.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public CustomerSessionOperationExecutor(StripeRepository stripeRepository2, String str, String str2, Map<String, CustomerSession.RetrievalListener> map, l<? super Customer, i> lVar) {
        m0.n.b.i.e(stripeRepository2, "stripeRepository");
        m0.n.b.i.e(str, "publishableKey");
        m0.n.b.i.e(map, "listeners");
        m0.n.b.i.e(lVar, "onCustomerUpdated");
        this.stripeRepository = stripeRepository2;
        this.publishableKey = str;
        this.stripeAccountId = str2;
        this.listeners = map;
        this.onCustomerUpdated = lVar;
    }

    /* access modifiers changed from: private */
    public final <L extends CustomerSession.RetrievalListener> L getListener(String str) {
        return (CustomerSession.RetrievalListener) this.listeners.remove(str);
    }

    /* access modifiers changed from: private */
    public final void onCustomerRetrieved(EphemeralOperation ephemeralOperation, Object obj) {
        CustomerSession.CustomerRetrievalListener customerRetrievalListener = (CustomerSession.CustomerRetrievalListener) getListener(ephemeralOperation.getId$payments_core_release());
        Throwable a = Result.a(obj);
        if (a == null) {
            Customer customer = (Customer) obj;
            this.onCustomerUpdated.invoke(customer);
            if (customerRetrievalListener != null) {
                customerRetrievalListener.onCustomerRetrieved(customer);
                return;
            }
            return;
        }
        onError(customerRetrievalListener, a);
    }

    /* access modifiers changed from: private */
    public final void onError(CustomerSession.RetrievalListener retrievalListener, Throwable th) {
        String str = "";
        if (th instanceof StripeException) {
            if (retrievalListener != null) {
                int statusCode = ((StripeException) th).getStatusCode();
                String message = th.getMessage();
                if (message != null) {
                    str = message;
                }
                retrievalListener.onError(statusCode, str, ((StripeException) th).getStripeError());
            }
        } else if (retrievalListener != null) {
            String message2 = th.getMessage();
            if (message2 != null) {
                str = message2;
            }
            retrievalListener.onError(0, str, (StripeError) null);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01fc, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0243, code lost:
        if (r0 == null) goto L_0x024a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:?, code lost:
        r0 = (com.stripe.android.model.Source) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0248, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0253, code lost:
        throw new java.lang.IllegalArgumentException(REQUIRED_ERROR.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0277, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02be, code lost:
        if (r0 == null) goto L_0x02c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:?, code lost:
        r0 = (com.stripe.android.model.PaymentMethod) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02c3, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02ce, code lost:
        throw new java.lang.IllegalArgumentException(REQUIRED_ERROR.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02f3, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0337, code lost:
        if (r0 == null) goto L_0x033e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:?, code lost:
        r0 = (com.stripe.android.model.PaymentMethod) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x033c, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0347, code lost:
        throw new java.lang.IllegalArgumentException(REQUIRED_ERROR.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:?, code lost:
        r0 = (java.util.List) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x03d2, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0448, code lost:
        if (r0 == null) goto L_0x044f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:?, code lost:
        r0 = (com.stripe.android.model.Customer) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x044d, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0458, code lost:
        throw new java.lang.IllegalArgumentException(REQUIRED_ERROR.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x04c5, code lost:
        if (r0 == null) goto L_0x04cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:?, code lost:
        r0 = (com.stripe.android.model.Customer) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x04ca, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x04d5, code lost:
        throw new java.lang.IllegalArgumentException(REQUIRED_ERROR.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0143, code lost:
        if (r0 == null) goto L_0x014a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        r0 = (com.stripe.android.model.Customer) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0148, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0153, code lost:
        throw new java.lang.IllegalArgumentException(REQUIRED_ERROR.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0177, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01c8, code lost:
        if (r0 == null) goto L_0x01cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:?, code lost:
        r0 = (com.stripe.android.model.Source) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01cd, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01d8, code lost:
        throw new java.lang.IllegalArgumentException(REQUIRED_ERROR.toString());
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01fc A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0277 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x02f3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x036c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x03f8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x047d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x04fa A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0177 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object execute$payments_core_release(com.stripe.android.EphemeralKey r24, com.stripe.android.EphemeralOperation r25, m0.l.c<? super m0.i> r26) {
        /*
            r23 = this;
            r1 = r23
            r2 = r25
            r0 = r26
            boolean r3 = r0 instanceof com.stripe.android.CustomerSessionOperationExecutor$execute$1
            if (r3 == 0) goto L_0x0019
            r3 = r0
            com.stripe.android.CustomerSessionOperationExecutor$execute$1 r3 = (com.stripe.android.CustomerSessionOperationExecutor$execute$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.label = r4
            goto L_0x001e
        L_0x0019:
            com.stripe.android.CustomerSessionOperationExecutor$execute$1 r3 = new com.stripe.android.CustomerSessionOperationExecutor$execute$1
            r3.<init>(r1, r0)
        L_0x001e:
            java.lang.Object r0 = r3.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r12 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r4 = r3.label
            java.lang.String r13 = "API request returned an invalid response."
            r14 = 0
            switch(r4) {
                case 0: goto L_0x011d;
                case 1: goto L_0x00fb;
                case 2: goto L_0x00f6;
                case 3: goto L_0x00da;
                case 4: goto L_0x00f6;
                case 5: goto L_0x00be;
                case 6: goto L_0x00f6;
                case 7: goto L_0x00a2;
                case 8: goto L_0x00f6;
                case 9: goto L_0x0086;
                case 10: goto L_0x00f6;
                case 11: goto L_0x006a;
                case 12: goto L_0x00f6;
                case 13: goto L_0x004e;
                case 14: goto L_0x00f6;
                case 15: goto L_0x0032;
                case 16: goto L_0x00f6;
                default: goto L_0x002a;
            }
        L_0x002a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0032:
            java.lang.Object r2 = r3.L$3
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref$ObjectRef) r2
            java.lang.Object r4 = r3.L$2
            kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref$ObjectRef) r4
            java.lang.Object r5 = r3.L$1
            com.stripe.android.EphemeralOperation r5 = (com.stripe.android.EphemeralOperation) r5
            java.lang.Object r6 = r3.L$0
            com.stripe.android.CustomerSessionOperationExecutor r6 = (com.stripe.android.CustomerSessionOperationExecutor) r6
            i0.j.f.p.h.d4(r0)     // Catch:{ all -> 0x0049 }
            r11 = r2
            r2 = r5
            goto L_0x04c5
        L_0x0049:
            r0 = move-exception
            r11 = r2
            r2 = r5
            goto L_0x04d9
        L_0x004e:
            java.lang.Object r2 = r3.L$3
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref$ObjectRef) r2
            java.lang.Object r4 = r3.L$2
            kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref$ObjectRef) r4
            java.lang.Object r5 = r3.L$1
            com.stripe.android.EphemeralOperation r5 = (com.stripe.android.EphemeralOperation) r5
            java.lang.Object r6 = r3.L$0
            com.stripe.android.CustomerSessionOperationExecutor r6 = (com.stripe.android.CustomerSessionOperationExecutor) r6
            i0.j.f.p.h.d4(r0)     // Catch:{ all -> 0x0065 }
            r15 = r2
            r2 = r5
            goto L_0x0448
        L_0x0065:
            r0 = move-exception
            r15 = r2
            r2 = r5
            goto L_0x045c
        L_0x006a:
            java.lang.Object r2 = r3.L$3
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref$ObjectRef) r2
            java.lang.Object r4 = r3.L$2
            kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref$ObjectRef) r4
            java.lang.Object r5 = r3.L$1
            com.stripe.android.EphemeralOperation r5 = (com.stripe.android.EphemeralOperation) r5
            java.lang.Object r6 = r3.L$0
            com.stripe.android.CustomerSessionOperationExecutor r6 = (com.stripe.android.CustomerSessionOperationExecutor) r6
            i0.j.f.p.h.d4(r0)     // Catch:{ all -> 0x0081 }
            r10 = r2
            r2 = r5
            goto L_0x03cf
        L_0x0081:
            r0 = move-exception
            r10 = r2
            r2 = r5
            goto L_0x03d7
        L_0x0086:
            java.lang.Object r2 = r3.L$3
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref$ObjectRef) r2
            java.lang.Object r4 = r3.L$2
            kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref$ObjectRef) r4
            java.lang.Object r5 = r3.L$1
            com.stripe.android.EphemeralOperation r5 = (com.stripe.android.EphemeralOperation) r5
            java.lang.Object r6 = r3.L$0
            com.stripe.android.CustomerSessionOperationExecutor r6 = (com.stripe.android.CustomerSessionOperationExecutor) r6
            i0.j.f.p.h.d4(r0)     // Catch:{ all -> 0x009d }
            r10 = r2
            r2 = r5
            goto L_0x0337
        L_0x009d:
            r0 = move-exception
            r10 = r2
            r2 = r5
            goto L_0x034b
        L_0x00a2:
            java.lang.Object r2 = r3.L$3
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref$ObjectRef) r2
            java.lang.Object r4 = r3.L$2
            kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref$ObjectRef) r4
            java.lang.Object r5 = r3.L$1
            com.stripe.android.EphemeralOperation r5 = (com.stripe.android.EphemeralOperation) r5
            java.lang.Object r6 = r3.L$0
            com.stripe.android.CustomerSessionOperationExecutor r6 = (com.stripe.android.CustomerSessionOperationExecutor) r6
            i0.j.f.p.h.d4(r0)     // Catch:{ all -> 0x00b9 }
            r11 = r2
            r2 = r5
            goto L_0x02be
        L_0x00b9:
            r0 = move-exception
            r11 = r2
            r2 = r5
            goto L_0x02d2
        L_0x00be:
            java.lang.Object r2 = r3.L$3
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref$ObjectRef) r2
            java.lang.Object r4 = r3.L$2
            kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref$ObjectRef) r4
            java.lang.Object r5 = r3.L$1
            com.stripe.android.EphemeralOperation r5 = (com.stripe.android.EphemeralOperation) r5
            java.lang.Object r6 = r3.L$0
            com.stripe.android.CustomerSessionOperationExecutor r6 = (com.stripe.android.CustomerSessionOperationExecutor) r6
            i0.j.f.p.h.d4(r0)     // Catch:{ all -> 0x00d5 }
            r11 = r2
            r2 = r5
            goto L_0x0243
        L_0x00d5:
            r0 = move-exception
            r11 = r2
            r2 = r5
            goto L_0x0257
        L_0x00da:
            java.lang.Object r2 = r3.L$3
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref$ObjectRef) r2
            java.lang.Object r4 = r3.L$2
            kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref$ObjectRef) r4
            java.lang.Object r5 = r3.L$1
            com.stripe.android.EphemeralOperation r5 = (com.stripe.android.EphemeralOperation) r5
            java.lang.Object r6 = r3.L$0
            com.stripe.android.CustomerSessionOperationExecutor r6 = (com.stripe.android.CustomerSessionOperationExecutor) r6
            i0.j.f.p.h.d4(r0)     // Catch:{ all -> 0x00f1 }
            r15 = r2
            r2 = r5
            goto L_0x01c8
        L_0x00f1:
            r0 = move-exception
            r15 = r2
            r2 = r5
            goto L_0x01dc
        L_0x00f6:
            i0.j.f.p.h.d4(r0)
            goto L_0x04fb
        L_0x00fb:
            java.lang.Object r2 = r3.L$3
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref$ObjectRef) r2
            java.lang.Object r4 = r3.L$2
            kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref$ObjectRef) r4
            java.lang.Object r5 = r3.L$1
            com.stripe.android.EphemeralOperation r5 = (com.stripe.android.EphemeralOperation) r5
            java.lang.Object r6 = r3.L$0
            com.stripe.android.CustomerSessionOperationExecutor r6 = (com.stripe.android.CustomerSessionOperationExecutor) r6
            i0.j.f.p.h.d4(r0)     // Catch:{ all -> 0x0115 }
            r22 = r4
            r4 = r2
            r2 = r5
            r5 = r22
            goto L_0x0143
        L_0x0115:
            r0 = move-exception
            r22 = r4
            r4 = r2
            r2 = r5
            r5 = r22
            goto L_0x0157
        L_0x011d:
            i0.j.f.p.h.d4(r0)
            boolean r0 = r2 instanceof com.stripe.android.EphemeralOperation.RetrieveKey
            if (r0 == 0) goto L_0x0178
            kotlin.jvm.internal.Ref$ObjectRef r4 = new kotlin.jvm.internal.Ref$ObjectRef
            r4.<init>()
            java.util.Set r0 = r25.getProductUsage$payments_core_release()     // Catch:{ all -> 0x0154 }
            r3.L$0 = r1     // Catch:{ all -> 0x0154 }
            r3.L$1 = r2     // Catch:{ all -> 0x0154 }
            r3.L$2 = r4     // Catch:{ all -> 0x0154 }
            r3.L$3 = r4     // Catch:{ all -> 0x0154 }
            r5 = 1
            r3.label = r5     // Catch:{ all -> 0x0154 }
            r5 = r24
            java.lang.Object r0 = r1.retrieveCustomerWithKey(r5, r0, r3)     // Catch:{ all -> 0x0154 }
            if (r0 != r12) goto L_0x0141
            return r12
        L_0x0141:
            r6 = r1
            r5 = r4
        L_0x0143:
            if (r0 == 0) goto L_0x014a
            com.stripe.android.model.Customer r0 = (com.stripe.android.model.Customer) r0     // Catch:{ all -> 0x0148 }
            goto L_0x015b
        L_0x0148:
            r0 = move-exception
            goto L_0x0157
        L_0x014a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0148 }
            java.lang.String r7 = r13.toString()     // Catch:{ all -> 0x0148 }
            r0.<init>(r7)     // Catch:{ all -> 0x0148 }
            throw r0     // Catch:{ all -> 0x0148 }
        L_0x0154:
            r0 = move-exception
            r6 = r1
            r5 = r4
        L_0x0157:
            java.lang.Object r0 = i0.j.f.p.h.l0(r0)
        L_0x015b:
            r4.c = r0
            n0.a.d0 r0 = n0.a.m0.a
            n0.a.l1 r0 = n0.a.h2.o.c
            com.stripe.android.CustomerSessionOperationExecutor$execute$2 r4 = new com.stripe.android.CustomerSessionOperationExecutor$execute$2
            r4.<init>(r6, r2, r5, r14)
            r3.L$0 = r14
            r3.L$1 = r14
            r3.L$2 = r14
            r3.L$3 = r14
            r2 = 2
            r3.label = r2
            java.lang.Object r0 = m0.r.t.a.r.m.a1.a.k4(r0, r4, r3)
            if (r0 != r12) goto L_0x04fb
            return r12
        L_0x0178:
            r5 = r24
            boolean r0 = r2 instanceof com.stripe.android.EphemeralOperation.Customer.AddSource
            if (r0 == 0) goto L_0x01fd
            kotlin.jvm.internal.Ref$ObjectRef r15 = new kotlin.jvm.internal.Ref$ObjectRef
            r15.<init>()
            com.stripe.android.networking.StripeRepository r4 = r1.stripeRepository     // Catch:{ all -> 0x01d9 }
            java.lang.String r0 = r24.getObjectId$payments_core_release()     // Catch:{ all -> 0x01d9 }
            java.lang.String r6 = r1.publishableKey     // Catch:{ all -> 0x01d9 }
            java.util.Set r7 = r25.getProductUsage$payments_core_release()     // Catch:{ all -> 0x01d9 }
            r8 = r2
            com.stripe.android.EphemeralOperation$Customer$AddSource r8 = (com.stripe.android.EphemeralOperation.Customer.AddSource) r8     // Catch:{ all -> 0x01d9 }
            java.lang.String r8 = r8.getSourceId()     // Catch:{ all -> 0x01d9 }
            r9 = r2
            com.stripe.android.EphemeralOperation$Customer$AddSource r9 = (com.stripe.android.EphemeralOperation.Customer.AddSource) r9     // Catch:{ all -> 0x01d9 }
            java.lang.String r9 = r9.getSourceType()     // Catch:{ all -> 0x01d9 }
            com.stripe.android.networking.ApiRequest$Options r10 = new com.stripe.android.networking.ApiRequest$Options     // Catch:{ all -> 0x01d9 }
            java.lang.String r17 = r24.getSecret()     // Catch:{ all -> 0x01d9 }
            java.lang.String r5 = r1.stripeAccountId     // Catch:{ all -> 0x01d9 }
            r19 = 0
            r20 = 4
            r21 = 0
            r16 = r10
            r18 = r5
            r16.<init>(r17, r18, r19, r20, r21)     // Catch:{ all -> 0x01d9 }
            r3.L$0 = r1     // Catch:{ all -> 0x01d9 }
            r3.L$1 = r2     // Catch:{ all -> 0x01d9 }
            r3.L$2 = r15     // Catch:{ all -> 0x01d9 }
            r3.L$3 = r15     // Catch:{ all -> 0x01d9 }
            r5 = 3
            r3.label = r5     // Catch:{ all -> 0x01d9 }
            r5 = r0
            r11 = r3
            java.lang.Object r0 = r4.addCustomerSource(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x01d9 }
            if (r0 != r12) goto L_0x01c6
            return r12
        L_0x01c6:
            r6 = r1
            r4 = r15
        L_0x01c8:
            if (r0 == 0) goto L_0x01cf
            com.stripe.android.model.Source r0 = (com.stripe.android.model.Source) r0     // Catch:{ all -> 0x01cd }
            goto L_0x01e0
        L_0x01cd:
            r0 = move-exception
            goto L_0x01dc
        L_0x01cf:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x01cd }
            java.lang.String r5 = r13.toString()     // Catch:{ all -> 0x01cd }
            r0.<init>(r5)     // Catch:{ all -> 0x01cd }
            throw r0     // Catch:{ all -> 0x01cd }
        L_0x01d9:
            r0 = move-exception
            r6 = r1
            r4 = r15
        L_0x01dc:
            java.lang.Object r0 = i0.j.f.p.h.l0(r0)
        L_0x01e0:
            r15.c = r0
            n0.a.d0 r0 = n0.a.m0.a
            n0.a.l1 r0 = n0.a.h2.o.c
            com.stripe.android.CustomerSessionOperationExecutor$execute$3 r5 = new com.stripe.android.CustomerSessionOperationExecutor$execute$3
            r5.<init>(r6, r2, r4, r14)
            r3.L$0 = r14
            r3.L$1 = r14
            r3.L$2 = r14
            r3.L$3 = r14
            r2 = 4
            r3.label = r2
            java.lang.Object r0 = m0.r.t.a.r.m.a1.a.k4(r0, r5, r3)
            if (r0 != r12) goto L_0x04fb
            return r12
        L_0x01fd:
            boolean r0 = r2 instanceof com.stripe.android.EphemeralOperation.Customer.DeleteSource
            if (r0 == 0) goto L_0x0278
            kotlin.jvm.internal.Ref$ObjectRef r11 = new kotlin.jvm.internal.Ref$ObjectRef
            r11.<init>()
            com.stripe.android.networking.StripeRepository r4 = r1.stripeRepository     // Catch:{ all -> 0x0254 }
            java.lang.String r0 = r24.getObjectId$payments_core_release()     // Catch:{ all -> 0x0254 }
            java.lang.String r6 = r1.publishableKey     // Catch:{ all -> 0x0254 }
            java.util.Set r7 = r25.getProductUsage$payments_core_release()     // Catch:{ all -> 0x0254 }
            r8 = r2
            com.stripe.android.EphemeralOperation$Customer$DeleteSource r8 = (com.stripe.android.EphemeralOperation.Customer.DeleteSource) r8     // Catch:{ all -> 0x0254 }
            java.lang.String r8 = r8.getSourceId()     // Catch:{ all -> 0x0254 }
            com.stripe.android.networking.ApiRequest$Options r9 = new com.stripe.android.networking.ApiRequest$Options     // Catch:{ all -> 0x0254 }
            java.lang.String r16 = r24.getSecret()     // Catch:{ all -> 0x0254 }
            java.lang.String r5 = r1.stripeAccountId     // Catch:{ all -> 0x0254 }
            r18 = 0
            r19 = 4
            r20 = 0
            r15 = r9
            r17 = r5
            r15.<init>(r16, r17, r18, r19, r20)     // Catch:{ all -> 0x0254 }
            r3.L$0 = r1     // Catch:{ all -> 0x0254 }
            r3.L$1 = r2     // Catch:{ all -> 0x0254 }
            r3.L$2 = r11     // Catch:{ all -> 0x0254 }
            r3.L$3 = r11     // Catch:{ all -> 0x0254 }
            r5 = 5
            r3.label = r5     // Catch:{ all -> 0x0254 }
            r5 = r0
            r10 = r3
            java.lang.Object r0 = r4.deleteCustomerSource(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0254 }
            if (r0 != r12) goto L_0x0241
            return r12
        L_0x0241:
            r6 = r1
            r4 = r11
        L_0x0243:
            if (r0 == 0) goto L_0x024a
            com.stripe.android.model.Source r0 = (com.stripe.android.model.Source) r0     // Catch:{ all -> 0x0248 }
            goto L_0x025b
        L_0x0248:
            r0 = move-exception
            goto L_0x0257
        L_0x024a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0248 }
            java.lang.String r5 = r13.toString()     // Catch:{ all -> 0x0248 }
            r0.<init>(r5)     // Catch:{ all -> 0x0248 }
            throw r0     // Catch:{ all -> 0x0248 }
        L_0x0254:
            r0 = move-exception
            r6 = r1
            r4 = r11
        L_0x0257:
            java.lang.Object r0 = i0.j.f.p.h.l0(r0)
        L_0x025b:
            r11.c = r0
            n0.a.d0 r0 = n0.a.m0.a
            n0.a.l1 r0 = n0.a.h2.o.c
            com.stripe.android.CustomerSessionOperationExecutor$execute$4 r5 = new com.stripe.android.CustomerSessionOperationExecutor$execute$4
            r5.<init>(r6, r2, r4, r14)
            r3.L$0 = r14
            r3.L$1 = r14
            r3.L$2 = r14
            r3.L$3 = r14
            r2 = 6
            r3.label = r2
            java.lang.Object r0 = m0.r.t.a.r.m.a1.a.k4(r0, r5, r3)
            if (r0 != r12) goto L_0x04fb
            return r12
        L_0x0278:
            boolean r0 = r2 instanceof com.stripe.android.EphemeralOperation.Customer.AttachPaymentMethod
            if (r0 == 0) goto L_0x02f4
            kotlin.jvm.internal.Ref$ObjectRef r11 = new kotlin.jvm.internal.Ref$ObjectRef
            r11.<init>()
            com.stripe.android.networking.StripeRepository r4 = r1.stripeRepository     // Catch:{ all -> 0x02cf }
            java.lang.String r0 = r24.getObjectId$payments_core_release()     // Catch:{ all -> 0x02cf }
            java.lang.String r6 = r1.publishableKey     // Catch:{ all -> 0x02cf }
            java.util.Set r7 = r25.getProductUsage$payments_core_release()     // Catch:{ all -> 0x02cf }
            r8 = r2
            com.stripe.android.EphemeralOperation$Customer$AttachPaymentMethod r8 = (com.stripe.android.EphemeralOperation.Customer.AttachPaymentMethod) r8     // Catch:{ all -> 0x02cf }
            java.lang.String r8 = r8.getPaymentMethodId()     // Catch:{ all -> 0x02cf }
            com.stripe.android.networking.ApiRequest$Options r9 = new com.stripe.android.networking.ApiRequest$Options     // Catch:{ all -> 0x02cf }
            java.lang.String r16 = r24.getSecret()     // Catch:{ all -> 0x02cf }
            java.lang.String r5 = r1.stripeAccountId     // Catch:{ all -> 0x02cf }
            r18 = 0
            r19 = 4
            r20 = 0
            r15 = r9
            r17 = r5
            r15.<init>(r16, r17, r18, r19, r20)     // Catch:{ all -> 0x02cf }
            r3.L$0 = r1     // Catch:{ all -> 0x02cf }
            r3.L$1 = r2     // Catch:{ all -> 0x02cf }
            r3.L$2 = r11     // Catch:{ all -> 0x02cf }
            r3.L$3 = r11     // Catch:{ all -> 0x02cf }
            r5 = 7
            r3.label = r5     // Catch:{ all -> 0x02cf }
            r5 = r0
            r10 = r3
            java.lang.Object r0 = r4.attachPaymentMethod(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x02cf }
            if (r0 != r12) goto L_0x02bc
            return r12
        L_0x02bc:
            r6 = r1
            r4 = r11
        L_0x02be:
            if (r0 == 0) goto L_0x02c5
            com.stripe.android.model.PaymentMethod r0 = (com.stripe.android.model.PaymentMethod) r0     // Catch:{ all -> 0x02c3 }
            goto L_0x02d6
        L_0x02c3:
            r0 = move-exception
            goto L_0x02d2
        L_0x02c5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x02c3 }
            java.lang.String r5 = r13.toString()     // Catch:{ all -> 0x02c3 }
            r0.<init>(r5)     // Catch:{ all -> 0x02c3 }
            throw r0     // Catch:{ all -> 0x02c3 }
        L_0x02cf:
            r0 = move-exception
            r6 = r1
            r4 = r11
        L_0x02d2:
            java.lang.Object r0 = i0.j.f.p.h.l0(r0)
        L_0x02d6:
            r11.c = r0
            n0.a.d0 r0 = n0.a.m0.a
            n0.a.l1 r0 = n0.a.h2.o.c
            com.stripe.android.CustomerSessionOperationExecutor$execute$5 r5 = new com.stripe.android.CustomerSessionOperationExecutor$execute$5
            r5.<init>(r6, r2, r4, r14)
            r3.L$0 = r14
            r3.L$1 = r14
            r3.L$2 = r14
            r3.L$3 = r14
            r2 = 8
            r3.label = r2
            java.lang.Object r0 = m0.r.t.a.r.m.a1.a.k4(r0, r5, r3)
            if (r0 != r12) goto L_0x04fb
            return r12
        L_0x02f4:
            boolean r0 = r2 instanceof com.stripe.android.EphemeralOperation.Customer.DetachPaymentMethod
            if (r0 == 0) goto L_0x036d
            kotlin.jvm.internal.Ref$ObjectRef r10 = new kotlin.jvm.internal.Ref$ObjectRef
            r10.<init>()
            com.stripe.android.networking.StripeRepository r4 = r1.stripeRepository     // Catch:{ all -> 0x0348 }
            java.lang.String r0 = r1.publishableKey     // Catch:{ all -> 0x0348 }
            java.util.Set r6 = r25.getProductUsage$payments_core_release()     // Catch:{ all -> 0x0348 }
            r7 = r2
            com.stripe.android.EphemeralOperation$Customer$DetachPaymentMethod r7 = (com.stripe.android.EphemeralOperation.Customer.DetachPaymentMethod) r7     // Catch:{ all -> 0x0348 }
            java.lang.String r7 = r7.getPaymentMethodId()     // Catch:{ all -> 0x0348 }
            com.stripe.android.networking.ApiRequest$Options r8 = new com.stripe.android.networking.ApiRequest$Options     // Catch:{ all -> 0x0348 }
            java.lang.String r16 = r24.getSecret()     // Catch:{ all -> 0x0348 }
            java.lang.String r5 = r1.stripeAccountId     // Catch:{ all -> 0x0348 }
            r18 = 0
            r19 = 4
            r20 = 0
            r15 = r8
            r17 = r5
            r15.<init>(r16, r17, r18, r19, r20)     // Catch:{ all -> 0x0348 }
            r3.L$0 = r1     // Catch:{ all -> 0x0348 }
            r3.L$1 = r2     // Catch:{ all -> 0x0348 }
            r3.L$2 = r10     // Catch:{ all -> 0x0348 }
            r3.L$3 = r10     // Catch:{ all -> 0x0348 }
            r5 = 9
            r3.label = r5     // Catch:{ all -> 0x0348 }
            r5 = r0
            r9 = r3
            java.lang.Object r0 = r4.detachPaymentMethod(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0348 }
            if (r0 != r12) goto L_0x0335
            return r12
        L_0x0335:
            r6 = r1
            r4 = r10
        L_0x0337:
            if (r0 == 0) goto L_0x033e
            com.stripe.android.model.PaymentMethod r0 = (com.stripe.android.model.PaymentMethod) r0     // Catch:{ all -> 0x033c }
            goto L_0x034f
        L_0x033c:
            r0 = move-exception
            goto L_0x034b
        L_0x033e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x033c }
            java.lang.String r5 = r13.toString()     // Catch:{ all -> 0x033c }
            r0.<init>(r5)     // Catch:{ all -> 0x033c }
            throw r0     // Catch:{ all -> 0x033c }
        L_0x0348:
            r0 = move-exception
            r6 = r1
            r4 = r10
        L_0x034b:
            java.lang.Object r0 = i0.j.f.p.h.l0(r0)
        L_0x034f:
            r10.c = r0
            n0.a.d0 r0 = n0.a.m0.a
            n0.a.l1 r0 = n0.a.h2.o.c
            com.stripe.android.CustomerSessionOperationExecutor$execute$6 r5 = new com.stripe.android.CustomerSessionOperationExecutor$execute$6
            r5.<init>(r6, r2, r4, r14)
            r3.L$0 = r14
            r3.L$1 = r14
            r3.L$2 = r14
            r3.L$3 = r14
            r2 = 10
            r3.label = r2
            java.lang.Object r0 = m0.r.t.a.r.m.a1.a.k4(r0, r5, r3)
            if (r0 != r12) goto L_0x04fb
            return r12
        L_0x036d:
            boolean r0 = r2 instanceof com.stripe.android.EphemeralOperation.Customer.GetPaymentMethods
            if (r0 == 0) goto L_0x03f9
            kotlin.jvm.internal.Ref$ObjectRef r10 = new kotlin.jvm.internal.Ref$ObjectRef
            r10.<init>()
            com.stripe.android.networking.StripeRepository r4 = r1.stripeRepository     // Catch:{ all -> 0x03d4 }
            com.stripe.android.model.ListPaymentMethodsParams r0 = new com.stripe.android.model.ListPaymentMethodsParams     // Catch:{ all -> 0x03d4 }
            java.lang.String r16 = r24.getObjectId$payments_core_release()     // Catch:{ all -> 0x03d4 }
            r6 = r2
            com.stripe.android.EphemeralOperation$Customer$GetPaymentMethods r6 = (com.stripe.android.EphemeralOperation.Customer.GetPaymentMethods) r6     // Catch:{ all -> 0x03d4 }
            com.stripe.android.model.PaymentMethod$Type r17 = r6.getType$payments_core_release()     // Catch:{ all -> 0x03d4 }
            r6 = r2
            com.stripe.android.EphemeralOperation$Customer$GetPaymentMethods r6 = (com.stripe.android.EphemeralOperation.Customer.GetPaymentMethods) r6     // Catch:{ all -> 0x03d4 }
            java.lang.Integer r18 = r6.getLimit$payments_core_release()     // Catch:{ all -> 0x03d4 }
            r6 = r2
            com.stripe.android.EphemeralOperation$Customer$GetPaymentMethods r6 = (com.stripe.android.EphemeralOperation.Customer.GetPaymentMethods) r6     // Catch:{ all -> 0x03d4 }
            java.lang.String r19 = r6.getEndingBefore$payments_core_release()     // Catch:{ all -> 0x03d4 }
            r6 = r2
            com.stripe.android.EphemeralOperation$Customer$GetPaymentMethods r6 = (com.stripe.android.EphemeralOperation.Customer.GetPaymentMethods) r6     // Catch:{ all -> 0x03d4 }
            java.lang.String r20 = r6.getStartingAfter$payments_core_release()     // Catch:{ all -> 0x03d4 }
            r15 = r0
            r15.<init>(r16, r17, r18, r19, r20)     // Catch:{ all -> 0x03d4 }
            java.lang.String r6 = r1.publishableKey     // Catch:{ all -> 0x03d4 }
            java.util.Set r7 = r25.getProductUsage$payments_core_release()     // Catch:{ all -> 0x03d4 }
            com.stripe.android.networking.ApiRequest$Options r8 = new com.stripe.android.networking.ApiRequest$Options     // Catch:{ all -> 0x03d4 }
            java.lang.String r16 = r24.getSecret()     // Catch:{ all -> 0x03d4 }
            java.lang.String r5 = r1.stripeAccountId     // Catch:{ all -> 0x03d4 }
            r18 = 0
            r19 = 4
            r20 = 0
            r15 = r8
            r17 = r5
            r15.<init>(r16, r17, r18, r19, r20)     // Catch:{ all -> 0x03d4 }
            r3.L$0 = r1     // Catch:{ all -> 0x03d4 }
            r3.L$1 = r2     // Catch:{ all -> 0x03d4 }
            r3.L$2 = r10     // Catch:{ all -> 0x03d4 }
            r3.L$3 = r10     // Catch:{ all -> 0x03d4 }
            r5 = 11
            r3.label = r5     // Catch:{ all -> 0x03d4 }
            r5 = r0
            r9 = r3
            java.lang.Object r0 = r4.getPaymentMethods(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x03d4 }
            if (r0 != r12) goto L_0x03cd
            return r12
        L_0x03cd:
            r6 = r1
            r4 = r10
        L_0x03cf:
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x03d2 }
            goto L_0x03db
        L_0x03d2:
            r0 = move-exception
            goto L_0x03d7
        L_0x03d4:
            r0 = move-exception
            r6 = r1
            r4 = r10
        L_0x03d7:
            java.lang.Object r0 = i0.j.f.p.h.l0(r0)
        L_0x03db:
            r10.c = r0
            n0.a.d0 r0 = n0.a.m0.a
            n0.a.l1 r0 = n0.a.h2.o.c
            com.stripe.android.CustomerSessionOperationExecutor$execute$7 r5 = new com.stripe.android.CustomerSessionOperationExecutor$execute$7
            r5.<init>(r6, r2, r4, r14)
            r3.L$0 = r14
            r3.L$1 = r14
            r3.L$2 = r14
            r3.L$3 = r14
            r2 = 12
            r3.label = r2
            java.lang.Object r0 = m0.r.t.a.r.m.a1.a.k4(r0, r5, r3)
            if (r0 != r12) goto L_0x04fb
            return r12
        L_0x03f9:
            boolean r0 = r2 instanceof com.stripe.android.EphemeralOperation.Customer.UpdateDefaultSource
            if (r0 == 0) goto L_0x047e
            kotlin.jvm.internal.Ref$ObjectRef r15 = new kotlin.jvm.internal.Ref$ObjectRef
            r15.<init>()
            com.stripe.android.networking.StripeRepository r4 = r1.stripeRepository     // Catch:{ all -> 0x0459 }
            java.lang.String r0 = r24.getObjectId$payments_core_release()     // Catch:{ all -> 0x0459 }
            java.lang.String r6 = r1.publishableKey     // Catch:{ all -> 0x0459 }
            java.util.Set r7 = r25.getProductUsage$payments_core_release()     // Catch:{ all -> 0x0459 }
            r8 = r2
            com.stripe.android.EphemeralOperation$Customer$UpdateDefaultSource r8 = (com.stripe.android.EphemeralOperation.Customer.UpdateDefaultSource) r8     // Catch:{ all -> 0x0459 }
            java.lang.String r8 = r8.getSourceId()     // Catch:{ all -> 0x0459 }
            r9 = r2
            com.stripe.android.EphemeralOperation$Customer$UpdateDefaultSource r9 = (com.stripe.android.EphemeralOperation.Customer.UpdateDefaultSource) r9     // Catch:{ all -> 0x0459 }
            java.lang.String r9 = r9.getSourceType()     // Catch:{ all -> 0x0459 }
            com.stripe.android.networking.ApiRequest$Options r10 = new com.stripe.android.networking.ApiRequest$Options     // Catch:{ all -> 0x0459 }
            java.lang.String r17 = r24.getSecret()     // Catch:{ all -> 0x0459 }
            java.lang.String r5 = r1.stripeAccountId     // Catch:{ all -> 0x0459 }
            r19 = 0
            r20 = 4
            r21 = 0
            r16 = r10
            r18 = r5
            r16.<init>(r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0459 }
            r3.L$0 = r1     // Catch:{ all -> 0x0459 }
            r3.L$1 = r2     // Catch:{ all -> 0x0459 }
            r3.L$2 = r15     // Catch:{ all -> 0x0459 }
            r3.L$3 = r15     // Catch:{ all -> 0x0459 }
            r5 = 13
            r3.label = r5     // Catch:{ all -> 0x0459 }
            r5 = r0
            r11 = r3
            java.lang.Object r0 = r4.setDefaultCustomerSource(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0459 }
            if (r0 != r12) goto L_0x0446
            return r12
        L_0x0446:
            r6 = r1
            r4 = r15
        L_0x0448:
            if (r0 == 0) goto L_0x044f
            com.stripe.android.model.Customer r0 = (com.stripe.android.model.Customer) r0     // Catch:{ all -> 0x044d }
            goto L_0x0460
        L_0x044d:
            r0 = move-exception
            goto L_0x045c
        L_0x044f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x044d }
            java.lang.String r5 = r13.toString()     // Catch:{ all -> 0x044d }
            r0.<init>(r5)     // Catch:{ all -> 0x044d }
            throw r0     // Catch:{ all -> 0x044d }
        L_0x0459:
            r0 = move-exception
            r6 = r1
            r4 = r15
        L_0x045c:
            java.lang.Object r0 = i0.j.f.p.h.l0(r0)
        L_0x0460:
            r15.c = r0
            n0.a.d0 r0 = n0.a.m0.a
            n0.a.l1 r0 = n0.a.h2.o.c
            com.stripe.android.CustomerSessionOperationExecutor$execute$8 r5 = new com.stripe.android.CustomerSessionOperationExecutor$execute$8
            r5.<init>(r6, r2, r4, r14)
            r3.L$0 = r14
            r3.L$1 = r14
            r3.L$2 = r14
            r3.L$3 = r14
            r2 = 14
            r3.label = r2
            java.lang.Object r0 = m0.r.t.a.r.m.a1.a.k4(r0, r5, r3)
            if (r0 != r12) goto L_0x04fb
            return r12
        L_0x047e:
            boolean r0 = r2 instanceof com.stripe.android.EphemeralOperation.Customer.UpdateShipping
            if (r0 == 0) goto L_0x04fb
            kotlin.jvm.internal.Ref$ObjectRef r11 = new kotlin.jvm.internal.Ref$ObjectRef
            r11.<init>()
            com.stripe.android.networking.StripeRepository r4 = r1.stripeRepository     // Catch:{ all -> 0x04d6 }
            java.lang.String r0 = r24.getObjectId$payments_core_release()     // Catch:{ all -> 0x04d6 }
            java.lang.String r6 = r1.publishableKey     // Catch:{ all -> 0x04d6 }
            java.util.Set r7 = r25.getProductUsage$payments_core_release()     // Catch:{ all -> 0x04d6 }
            r8 = r2
            com.stripe.android.EphemeralOperation$Customer$UpdateShipping r8 = (com.stripe.android.EphemeralOperation.Customer.UpdateShipping) r8     // Catch:{ all -> 0x04d6 }
            com.stripe.android.model.ShippingInformation r8 = r8.getShippingInformation()     // Catch:{ all -> 0x04d6 }
            com.stripe.android.networking.ApiRequest$Options r9 = new com.stripe.android.networking.ApiRequest$Options     // Catch:{ all -> 0x04d6 }
            java.lang.String r16 = r24.getSecret()     // Catch:{ all -> 0x04d6 }
            java.lang.String r5 = r1.stripeAccountId     // Catch:{ all -> 0x04d6 }
            r18 = 0
            r19 = 4
            r20 = 0
            r15 = r9
            r17 = r5
            r15.<init>(r16, r17, r18, r19, r20)     // Catch:{ all -> 0x04d6 }
            r3.L$0 = r1     // Catch:{ all -> 0x04d6 }
            r3.L$1 = r2     // Catch:{ all -> 0x04d6 }
            r3.L$2 = r11     // Catch:{ all -> 0x04d6 }
            r3.L$3 = r11     // Catch:{ all -> 0x04d6 }
            r5 = 15
            r3.label = r5     // Catch:{ all -> 0x04d6 }
            r5 = r0
            r10 = r3
            java.lang.Object r0 = r4.setCustomerShippingInfo(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x04d6 }
            if (r0 != r12) goto L_0x04c3
            return r12
        L_0x04c3:
            r6 = r1
            r4 = r11
        L_0x04c5:
            if (r0 == 0) goto L_0x04cc
            com.stripe.android.model.Customer r0 = (com.stripe.android.model.Customer) r0     // Catch:{ all -> 0x04ca }
            goto L_0x04dd
        L_0x04ca:
            r0 = move-exception
            goto L_0x04d9
        L_0x04cc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x04ca }
            java.lang.String r5 = r13.toString()     // Catch:{ all -> 0x04ca }
            r0.<init>(r5)     // Catch:{ all -> 0x04ca }
            throw r0     // Catch:{ all -> 0x04ca }
        L_0x04d6:
            r0 = move-exception
            r6 = r1
            r4 = r11
        L_0x04d9:
            java.lang.Object r0 = i0.j.f.p.h.l0(r0)
        L_0x04dd:
            r11.c = r0
            n0.a.d0 r0 = n0.a.m0.a
            n0.a.l1 r0 = n0.a.h2.o.c
            com.stripe.android.CustomerSessionOperationExecutor$execute$9 r5 = new com.stripe.android.CustomerSessionOperationExecutor$execute$9
            r5.<init>(r6, r2, r4, r14)
            r3.L$0 = r14
            r3.L$1 = r14
            r3.L$2 = r14
            r3.L$3 = r14
            r2 = 16
            r3.label = r2
            java.lang.Object r0 = m0.r.t.a.r.m.a1.a.k4(r0, r5, r3)
            if (r0 != r12) goto L_0x04fb
            return r12
        L_0x04fb:
            m0.i r0 = m0.i.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.CustomerSessionOperationExecutor.execute$payments_core_release(com.stripe.android.EphemeralKey, com.stripe.android.EphemeralOperation, m0.l.c):java.lang.Object");
    }

    public final /* synthetic */ Object retrieveCustomerWithKey(EphemeralKey ephemeralKey, Set<String> set, c<? super Customer> cVar) throws StripeException {
        return this.stripeRepository.retrieveCustomer(ephemeralKey.getObjectId$payments_core_release(), set, new ApiRequest.Options(ephemeralKey.getSecret(), this.stripeAccountId, (String) null, 4, (f) null), cVar);
    }
}
