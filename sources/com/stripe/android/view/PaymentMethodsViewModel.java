package com.stripe.android.view;

import android.app.Application;
import android.content.res.Resources;
import androidx.lifecycle.LiveData;
import com.stripe.android.CustomerSession;
import com.stripe.android.PaymentSession;
import com.stripe.android.R;
import com.stripe.android.model.PaymentMethod;
import h0.q.b;
import h0.q.k0;
import h0.q.m0;
import h0.q.y;
import i0.j.f.p.h;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import m0.j.g;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u00018B4\u0012\u0006\u00105\u001a\u000204\u0012\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u0010\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010)\u001a\u00020\u001fø\u0001\u0000¢\u0006\u0004\b6\u00107J#\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\r\u0010\u000bJ$\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00110\u00100\u000fH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u00158\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R$\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u001a8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\"\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001a8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u001eR\u001e\u0010$\u001a\n #*\u0004\u0018\u00010\"0\"8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R%\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00108\u0002@\u0002X\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010)\u001a\u00020\u001f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010-R$\u0010.\u001a\u0004\u0018\u00010\u00068\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00069"}, d2 = {"Lcom/stripe/android/view/PaymentMethodsViewModel;", "Lh0/q/b;", "Lcom/stripe/android/model/PaymentMethod;", "paymentMethod", "", "stringRes", "", "createSnackbarText", "(Lcom/stripe/android/model/PaymentMethod;I)Ljava/lang/String;", "Lm0/i;", "onPaymentMethodAdded$payments_core_release", "(Lcom/stripe/android/model/PaymentMethod;)V", "onPaymentMethodAdded", "onPaymentMethodRemoved$payments_core_release", "onPaymentMethodRemoved", "Landroidx/lifecycle/LiveData;", "Lkotlin/Result;", "", "getPaymentMethods$payments_core_release", "()Landroidx/lifecycle/LiveData;", "getPaymentMethods", "", "productUsage", "Ljava/util/Set;", "getProductUsage$payments_core_release", "()Ljava/util/Set;", "Lh0/q/y;", "snackbarData", "Lh0/q/y;", "getSnackbarData$payments_core_release", "()Lh0/q/y;", "", "progressData", "getProgressData$payments_core_release", "Landroid/content/res/Resources;", "kotlin.jvm.PlatformType", "resources", "Landroid/content/res/Resources;", "Lcom/stripe/android/CustomerSession;", "customerSession", "Ljava/lang/Object;", "startedFromPaymentSession", "Z", "Lcom/stripe/android/view/CardDisplayTextFactory;", "cardDisplayTextFactory", "Lcom/stripe/android/view/CardDisplayTextFactory;", "selectedPaymentMethodId", "Ljava/lang/String;", "getSelectedPaymentMethodId$payments_core_release", "()Ljava/lang/String;", "setSelectedPaymentMethodId$payments_core_release", "(Ljava/lang/String;)V", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;Ljava/lang/Object;Ljava/lang/String;Z)V", "Factory", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentMethodsViewModel.kt */
public final class PaymentMethodsViewModel extends b {
    private final CardDisplayTextFactory cardDisplayTextFactory;
    private final Object customerSession;
    private final Set<String> productUsage;
    private final y<Boolean> progressData;
    private final Resources resources;
    private String selectedPaymentMethodId;
    private final y<String> snackbarData;
    private final boolean startedFromPaymentSession;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B2\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\t\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0006\u001a\u00028\u0000\"\n\b\u0000\u0010\u0003*\u0004\u0018\u00010\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002@\u0002X\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/view/PaymentMethodsViewModel$Factory;", "Lh0/q/m0$b;", "Lh0/q/k0;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Lh0/q/k0;", "", "startedFromPaymentSession", "Z", "", "initialPaymentMethodId", "Ljava/lang/String;", "Landroid/app/Application;", "application", "Landroid/app/Application;", "Lkotlin/Result;", "Lcom/stripe/android/CustomerSession;", "customerSession", "Ljava/lang/Object;", "<init>", "(Landroid/app/Application;Ljava/lang/Object;Ljava/lang/String;Z)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentMethodsViewModel.kt */
    public static final class Factory implements m0.b {
        private final Application application;
        private final Object customerSession;
        private final String initialPaymentMethodId;
        private final boolean startedFromPaymentSession;

        public Factory(Application application2, Object obj, String str, boolean z) {
            i.e(application2, "application");
            this.application = application2;
            this.customerSession = obj;
            this.initialPaymentMethodId = str;
            this.startedFromPaymentSession = z;
        }

        public <T extends k0> T create(Class<T> cls) {
            i.e(cls, "modelClass");
            return new PaymentMethodsViewModel(this.application, this.customerSession, this.initialPaymentMethodId, this.startedFromPaymentSession);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PaymentMethodsViewModel(Application application, Object obj, String str, boolean z, int i, f fVar) {
        this(application, obj, (i & 4) != 0 ? null : str, z);
    }

    private final String createSnackbarText(PaymentMethod paymentMethod, int i) {
        PaymentMethod.Card card = paymentMethod.card;
        if (card == null) {
            return null;
        }
        return this.resources.getString(i, new Object[]{this.cardDisplayTextFactory.createUnstyled$payments_core_release(card)});
    }

    public final LiveData<Result<List<PaymentMethod>>> getPaymentMethods$payments_core_release() {
        y yVar = new y();
        this.progressData.setValue(Boolean.TRUE);
        Object obj = this.customerSession;
        Throwable a = Result.a(obj);
        if (a == null) {
            CustomerSession.getPaymentMethods$payments_core_release$default((CustomerSession) obj, PaymentMethod.Type.Card, (Integer) null, (String) null, (String) null, this.productUsage, new PaymentMethodsViewModel$getPaymentMethods$$inlined$fold$lambda$1(this, yVar), 14, (Object) null);
        } else {
            yVar.setValue(new Result(h.l0(a)));
            this.progressData.setValue(Boolean.FALSE);
        }
        return yVar;
    }

    public final Set<String> getProductUsage$payments_core_release() {
        return this.productUsage;
    }

    public final y<Boolean> getProgressData$payments_core_release() {
        return this.progressData;
    }

    public final String getSelectedPaymentMethodId$payments_core_release() {
        return this.selectedPaymentMethodId;
    }

    public final y<String> getSnackbarData$payments_core_release() {
        return this.snackbarData;
    }

    public final void onPaymentMethodAdded$payments_core_release(PaymentMethod paymentMethod) {
        i.e(paymentMethod, "paymentMethod");
        String createSnackbarText = createSnackbarText(paymentMethod, R.string.added);
        if (createSnackbarText != null) {
            this.snackbarData.setValue(createSnackbarText);
            this.snackbarData.setValue(null);
        }
    }

    public final void onPaymentMethodRemoved$payments_core_release(PaymentMethod paymentMethod) {
        i.e(paymentMethod, "paymentMethod");
        String createSnackbarText = createSnackbarText(paymentMethod, R.string.removed);
        if (createSnackbarText != null) {
            this.snackbarData.setValue(createSnackbarText);
            this.snackbarData.setValue(null);
        }
    }

    public final void setSelectedPaymentMethodId$payments_core_release(String str) {
        this.selectedPaymentMethodId = str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentMethodsViewModel(Application application, Object obj, String str, boolean z) {
        super(application);
        i.e(application, "application");
        this.customerSession = obj;
        this.selectedPaymentMethodId = str;
        this.startedFromPaymentSession = z;
        this.resources = application.getResources();
        this.cardDisplayTextFactory = new CardDisplayTextFactory(application);
        String[] strArr = new String[2];
        strArr[0] = z ? PaymentSession.PRODUCT_TOKEN : null;
        strArr[1] = PaymentMethodsActivity.PRODUCT_TOKEN;
        this.productUsage = g.D0(g.M(strArr));
        this.snackbarData = new y<>();
        this.progressData = new y<>();
    }
}
