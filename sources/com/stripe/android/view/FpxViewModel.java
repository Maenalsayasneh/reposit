package com.stripe.android.view;

import android.app.Application;
import androidx.lifecycle.LiveData;
import com.stripe.android.AppInfo;
import com.stripe.android.FraudDetectionDataRepository;
import com.stripe.android.Logger;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.model.BankStatuses;
import com.stripe.android.networking.AnalyticsRequestExecutor;
import com.stripe.android.networking.AnalyticsRequestFactory;
import com.stripe.android.networking.ApiRequestExecutor;
import com.stripe.android.networking.FraudDetectionDataParamsUtils;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.networking.StripeRepository;
import g0.a.b.b.a;
import h0.q.b;
import h0.q.k0;
import h0.q.m0;
import java.util.Set;
import kotlin.Metadata;
import m0.l.c;
import m0.l.e;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0018B!\b\u0000\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/view/FpxViewModel;", "Lh0/q/b;", "Landroidx/lifecycle/LiveData;", "Lcom/stripe/android/model/BankStatuses;", "getFpxBankStatues$payments_core_release", "()Landroidx/lifecycle/LiveData;", "getFpxBankStatues", "", "publishableKey", "Ljava/lang/String;", "Lcom/stripe/android/networking/StripeRepository;", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "", "selectedPosition", "Ljava/lang/Integer;", "getSelectedPosition$payments_core_release", "()Ljava/lang/Integer;", "setSelectedPosition$payments_core_release", "(Ljava/lang/Integer;)V", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;Ljava/lang/String;Lcom/stripe/android/networking/StripeRepository;)V", "Factory", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: FpxViewModel.kt */
public final class FpxViewModel extends b {
    /* access modifiers changed from: private */
    public final String publishableKey;
    private Integer selectedPosition;
    /* access modifiers changed from: private */
    public final StripeRepository stripeRepository;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0006\u001a\u00028\u0000\"\n\b\u0000\u0010\u0003*\u0004\u0018\u00010\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/stripe/android/view/FpxViewModel$Factory;", "Lh0/q/m0$b;", "Lh0/q/k0;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Lh0/q/k0;", "Landroid/app/Application;", "application", "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: FpxViewModel.kt */
    public static final class Factory implements m0.b {
        private final Application application;

        public Factory(Application application2) {
            i.e(application2, "application");
            this.application = application2;
        }

        public <T extends k0> T create(Class<T> cls) {
            i.e(cls, "modelClass");
            String publishableKey = PaymentConfiguration.Companion.getInstance(this.application).getPublishableKey();
            StripeApiRepository stripeApiRepository = r2;
            StripeApiRepository stripeApiRepository2 = new StripeApiRepository(this.application, publishableKey, (AppInfo) null, (Logger) null, (e) null, (ApiRequestExecutor) null, (AnalyticsRequestExecutor) null, (FraudDetectionDataRepository) null, (AnalyticsRequestFactory) null, (FraudDetectionDataParamsUtils) null, (Set) null, (String) null, (String) null, 8188, (f) null);
            return new FpxViewModel(this.application, publishableKey, stripeApiRepository);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FpxViewModel(Application application, String str, StripeRepository stripeRepository2) {
        super(application);
        i.e(application, "application");
        i.e(str, "publishableKey");
        i.e(stripeRepository2, "stripeRepository");
        this.publishableKey = str;
        this.stripeRepository = stripeRepository2;
    }

    public final /* synthetic */ LiveData<BankStatuses> getFpxBankStatues$payments_core_release() {
        return a.a0((e) null, 0, new FpxViewModel$getFpxBankStatues$1(this, (c) null), 3);
    }

    public final Integer getSelectedPosition$payments_core_release() {
        return this.selectedPosition;
    }

    public final void setSelectedPosition$payments_core_release(Integer num) {
        this.selectedPosition = num;
    }
}
