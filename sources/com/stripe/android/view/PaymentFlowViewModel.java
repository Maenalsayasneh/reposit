package com.stripe.android.view;

import androidx.lifecycle.LiveData;
import com.stripe.android.CustomerSession;
import com.stripe.android.PaymentSession;
import com.stripe.android.PaymentSessionConfig;
import com.stripe.android.PaymentSessionData;
import com.stripe.android.model.Customer;
import com.stripe.android.model.ShippingInformation;
import com.stripe.android.model.ShippingMethod;
import g0.a.b.b.a;
import h0.q.k0;
import h0.q.m0;
import h0.q.y;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.EmptyList;
import m0.j.g;
import m0.l.c;
import m0.l.e;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0000\u0018\u0000 B2\u00020\u0001:\u0002BCB\u001f\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b@\u0010AJ&\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ>\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u00050\u00042\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R(\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\"\u0010\u001d\u001a\u00020\u001c8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010$\u001a\u00020#8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R$\u0010-\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u00103\u001a\u0004\u0018\u00010\u000f8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010:\u001a\u0002098\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?\u0002\u0004\n\u0002\b\u0019¨\u0006D"}, d2 = {"Lcom/stripe/android/view/PaymentFlowViewModel;", "Lh0/q/k0;", "Lcom/stripe/android/model/ShippingInformation;", "shippingInformation", "Landroidx/lifecycle/LiveData;", "Lkotlin/Result;", "Lcom/stripe/android/model/Customer;", "saveCustomerShippingInformation$payments_core_release", "(Lcom/stripe/android/model/ShippingInformation;)Landroidx/lifecycle/LiveData;", "saveCustomerShippingInformation", "Lcom/stripe/android/PaymentSessionConfig$ShippingInformationValidator;", "shippingInfoValidator", "Lcom/stripe/android/PaymentSessionConfig$ShippingMethodsFactory;", "shippingMethodsFactory", "", "Lcom/stripe/android/model/ShippingMethod;", "validateShippingInformation$payments_core_release", "(Lcom/stripe/android/PaymentSessionConfig$ShippingInformationValidator;Lcom/stripe/android/PaymentSessionConfig$ShippingMethodsFactory;Lcom/stripe/android/model/ShippingInformation;)Landroidx/lifecycle/LiveData;", "validateShippingInformation", "shippingMethods", "Ljava/util/List;", "getShippingMethods$payments_core_release", "()Ljava/util/List;", "setShippingMethods$payments_core_release", "(Ljava/util/List;)V", "Lcom/stripe/android/CustomerSession;", "customerSession", "Lcom/stripe/android/CustomerSession;", "", "currentPage", "I", "getCurrentPage$payments_core_release", "()I", "setCurrentPage$payments_core_release", "(I)V", "Lcom/stripe/android/PaymentSessionData;", "paymentSessionData", "Lcom/stripe/android/PaymentSessionData;", "getPaymentSessionData$payments_core_release", "()Lcom/stripe/android/PaymentSessionData;", "setPaymentSessionData$payments_core_release", "(Lcom/stripe/android/PaymentSessionData;)V", "Lm0/l/e;", "workContext", "Lm0/l/e;", "submittedShippingInfo", "Lcom/stripe/android/model/ShippingInformation;", "getSubmittedShippingInfo$payments_core_release", "()Lcom/stripe/android/model/ShippingInformation;", "setSubmittedShippingInfo$payments_core_release", "(Lcom/stripe/android/model/ShippingInformation;)V", "selectedShippingMethod", "Lcom/stripe/android/model/ShippingMethod;", "getSelectedShippingMethod$payments_core_release", "()Lcom/stripe/android/model/ShippingMethod;", "setSelectedShippingMethod$payments_core_release", "(Lcom/stripe/android/model/ShippingMethod;)V", "", "isShippingInfoSubmitted", "Z", "isShippingInfoSubmitted$payments_core_release", "()Z", "setShippingInfoSubmitted$payments_core_release", "(Z)V", "<init>", "(Lcom/stripe/android/CustomerSession;Lcom/stripe/android/PaymentSessionData;Lm0/l/e;)V", "Companion", "Factory", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentFlowViewModel.kt */
public final class PaymentFlowViewModel extends k0 {
    public static final Companion Companion = new Companion((f) null);
    /* access modifiers changed from: private */
    public static final Set<String> PRODUCT_USAGE = g.h0(PaymentSession.PRODUCT_TOKEN, PaymentFlowActivity.PRODUCT_TOKEN, SHIPPING_INFO_PRODUCT_TOKEN);
    private static final String SHIPPING_INFO_PRODUCT_TOKEN = "ShippingInfoScreen";
    private int currentPage;
    private final CustomerSession customerSession;
    private boolean isShippingInfoSubmitted;
    private PaymentSessionData paymentSessionData;
    private ShippingMethod selectedShippingMethod;
    private List<ShippingMethod> shippingMethods = EmptyList.c;
    private ShippingInformation submittedShippingInfo;
    /* access modifiers changed from: private */
    public final e workContext;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u00020\u00038\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/stripe/android/view/PaymentFlowViewModel$Companion;", "", "", "", "PRODUCT_USAGE", "Ljava/util/Set;", "getPRODUCT_USAGE", "()Ljava/util/Set;", "SHIPPING_INFO_PRODUCT_TOKEN", "Ljava/lang/String;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentFlowViewModel.kt */
    public static final class Companion {
        private Companion() {
        }

        public final Set<String> getPRODUCT_USAGE() {
            return PaymentFlowViewModel.PRODUCT_USAGE;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0006\u001a\u00028\u0000\"\n\b\u0000\u0010\u0003*\u0004\u0018\u00010\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/view/PaymentFlowViewModel$Factory;", "Lh0/q/m0$b;", "Lh0/q/k0;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Lh0/q/k0;", "Lcom/stripe/android/CustomerSession;", "customerSession", "Lcom/stripe/android/CustomerSession;", "Lcom/stripe/android/PaymentSessionData;", "paymentSessionData", "Lcom/stripe/android/PaymentSessionData;", "<init>", "(Lcom/stripe/android/CustomerSession;Lcom/stripe/android/PaymentSessionData;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentFlowViewModel.kt */
    public static final class Factory implements m0.b {
        private final CustomerSession customerSession;
        private final PaymentSessionData paymentSessionData;

        public Factory(CustomerSession customerSession2, PaymentSessionData paymentSessionData2) {
            i.e(customerSession2, "customerSession");
            i.e(paymentSessionData2, "paymentSessionData");
            this.customerSession = customerSession2;
            this.paymentSessionData = paymentSessionData2;
        }

        public <T extends k0> T create(Class<T> cls) {
            i.e(cls, "modelClass");
            return new PaymentFlowViewModel(this.customerSession, this.paymentSessionData, n0.a.m0.c);
        }
    }

    public PaymentFlowViewModel(CustomerSession customerSession2, PaymentSessionData paymentSessionData2, e eVar) {
        i.e(customerSession2, "customerSession");
        i.e(paymentSessionData2, "paymentSessionData");
        i.e(eVar, "workContext");
        this.customerSession = customerSession2;
        this.paymentSessionData = paymentSessionData2;
        this.workContext = eVar;
    }

    public final int getCurrentPage$payments_core_release() {
        return this.currentPage;
    }

    public final PaymentSessionData getPaymentSessionData$payments_core_release() {
        return this.paymentSessionData;
    }

    public final ShippingMethod getSelectedShippingMethod$payments_core_release() {
        return this.selectedShippingMethod;
    }

    public final List<ShippingMethod> getShippingMethods$payments_core_release() {
        return this.shippingMethods;
    }

    public final ShippingInformation getSubmittedShippingInfo$payments_core_release() {
        return this.submittedShippingInfo;
    }

    public final boolean isShippingInfoSubmitted$payments_core_release() {
        return this.isShippingInfoSubmitted;
    }

    public final /* synthetic */ LiveData<Result<Customer>> saveCustomerShippingInformation$payments_core_release(ShippingInformation shippingInformation) {
        i.e(shippingInformation, "shippingInformation");
        this.submittedShippingInfo = shippingInformation;
        y yVar = new y();
        this.customerSession.setCustomerShippingInformation$payments_core_release(shippingInformation, PRODUCT_USAGE, new PaymentFlowViewModel$saveCustomerShippingInformation$1(this, yVar));
        return yVar;
    }

    public final void setCurrentPage$payments_core_release(int i) {
        this.currentPage = i;
    }

    public final void setPaymentSessionData$payments_core_release(PaymentSessionData paymentSessionData2) {
        i.e(paymentSessionData2, "<set-?>");
        this.paymentSessionData = paymentSessionData2;
    }

    public final void setSelectedShippingMethod$payments_core_release(ShippingMethod shippingMethod) {
        this.selectedShippingMethod = shippingMethod;
    }

    public final void setShippingInfoSubmitted$payments_core_release(boolean z) {
        this.isShippingInfoSubmitted = z;
    }

    public final void setShippingMethods$payments_core_release(List<ShippingMethod> list) {
        i.e(list, "<set-?>");
        this.shippingMethods = list;
    }

    public final void setSubmittedShippingInfo$payments_core_release(ShippingInformation shippingInformation) {
        this.submittedShippingInfo = shippingInformation;
    }

    public final /* synthetic */ LiveData<Result<List<ShippingMethod>>> validateShippingInformation$payments_core_release(PaymentSessionConfig.ShippingInformationValidator shippingInformationValidator, PaymentSessionConfig.ShippingMethodsFactory shippingMethodsFactory, ShippingInformation shippingInformation) {
        i.e(shippingInformationValidator, "shippingInfoValidator");
        i.e(shippingInformation, "shippingInformation");
        return a.a0((e) null, 0, new PaymentFlowViewModel$validateShippingInformation$1(this, shippingInformationValidator, shippingInformation, shippingMethodsFactory, (c) null), 3);
    }
}
