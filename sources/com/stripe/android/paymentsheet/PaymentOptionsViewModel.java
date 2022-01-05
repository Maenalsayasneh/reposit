package com.stripe.android.paymentsheet;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.LiveData;
import com.stripe.android.paymentsheet.PaymentOptionContract;
import com.stripe.android.paymentsheet.PaymentOptionResult;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PrefsRepository;
import com.stripe.android.paymentsheet.analytics.DefaultEventReporter;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.model.FragmentConfig;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import h0.q.k0;
import h0.q.m0;
import h0.q.y;
import kotlin.Metadata;
import m0.l.c;
import m0.l.e;
import m0.n.a.a;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002:;B/\u0012\u0006\u00101\u001a\u000200\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u00105\u001a\u000204\u0012\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u00109J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u001b8B@\u0002X\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R(\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0000@\u0001X\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b(\u0010\u000e\u001a\u0004\b&\u0010'R\u0016\u0010)\u001a\u00020\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\"\u0010,\u001a\b\u0012\u0004\u0012\u00020#0+8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u0006<"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;", "Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;", "Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel$TransitionTarget;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "paymentSelection", "Lm0/i;", "processExistingCard", "(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V", "processNewCard", "", "throwable", "onFatal", "(Ljava/lang/Throwable;)V", "onUserCancel", "()V", "onUserSelection", "Lcom/stripe/android/paymentsheet/model/FragmentConfig;", "config", "resolveTransitionTarget", "(Lcom/stripe/android/paymentsheet/model/FragmentConfig;)V", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$Card;", "newCard", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$Card;", "getNewCard", "()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$Card;", "setNewCard", "(Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$Card;)V", "", "getShouldTransitionToUnsavedCard", "()Z", "shouldTransitionToUnsavedCard", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "eventReporter", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "Lh0/q/y;", "Lcom/stripe/android/paymentsheet/PaymentOptionResult;", "_paymentOptionResult", "Lh0/q/y;", "get_paymentOptionResult$payments_core_release", "()Lh0/q/y;", "get_paymentOptionResult$payments_core_release$annotations", "hasTransitionToUnsavedCard", "Z", "Landroidx/lifecycle/LiveData;", "paymentOptionResult", "Landroidx/lifecycle/LiveData;", "getPaymentOptionResult$payments_core_release", "()Landroidx/lifecycle/LiveData;", "Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;", "args", "Lcom/stripe/android/paymentsheet/PrefsRepository;", "prefsRepository", "Lm0/l/e;", "workContext", "Landroid/app/Application;", "application", "<init>", "(Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;Lcom/stripe/android/paymentsheet/PrefsRepository;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lm0/l/e;Landroid/app/Application;)V", "Factory", "TransitionTarget", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentOptionsViewModel.kt */
public final class PaymentOptionsViewModel extends BaseSheetViewModel<TransitionTarget> {
    private final y<PaymentOptionResult> _paymentOptionResult;
    private final EventReporter eventReporter;
    private boolean hasTransitionToUnsavedCard;
    private PaymentSelection.New.Card newCard;
    private final LiveData<PaymentOptionResult> paymentOptionResult;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B#\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\b¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0006\u001a\u00028\u0000\"\n\b\u0000\u0010\u0003*\u0004\u0018\u00010\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel$Factory;", "Lh0/q/m0$b;", "Lh0/q/k0;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Lh0/q/k0;", "Lkotlin/Function0;", "Landroid/app/Application;", "applicationSupplier", "Lm0/n/a/a;", "Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;", "starterArgsSupplier", "<init>", "(Lm0/n/a/a;Lm0/n/a/a;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentOptionsViewModel.kt */
    public static final class Factory implements m0.b {
        private final a<Application> applicationSupplier;
        private final a<PaymentOptionContract.Args> starterArgsSupplier;

        public Factory(a<? extends Application> aVar, a<PaymentOptionContract.Args> aVar2) {
            i.e(aVar, "applicationSupplier");
            i.e(aVar2, "starterArgsSupplier");
            this.applicationSupplier = aVar;
            this.starterArgsSupplier = aVar2;
        }

        public <T extends k0> T create(Class<T> cls) {
            DefaultPrefsRepository defaultPrefsRepository;
            PaymentSheet.CustomerConfiguration customer;
            i.e(cls, "modelClass");
            PaymentOptionContract.Args invoke = this.starterArgsSupplier.invoke();
            Application invoke2 = this.applicationSupplier.invoke();
            PaymentSheet.Configuration config = invoke.getConfig();
            if (config == null || (customer = config.getCustomer()) == null) {
                defaultPrefsRepository = new PrefsRepository.Noop();
            } else {
                defaultPrefsRepository = new DefaultPrefsRepository(invoke2, customer.component1(), new PaymentOptionsViewModel$Factory$create$$inlined$let$lambda$1((c) null, invoke2, invoke), n0.a.m0.c);
            }
            return new PaymentOptionsViewModel(invoke, defaultPrefsRepository, new DefaultEventReporter(EventReporter.Mode.Custom, invoke.getSessionId(), (Context) invoke2, (e) null, 8, (f) null), n0.a.m0.c, invoke2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\b\t\nB\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0005\u001a\u00020\u00028&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel$TransitionTarget;", "", "Lcom/stripe/android/paymentsheet/model/FragmentConfig;", "getFragmentConfig", "()Lcom/stripe/android/paymentsheet/model/FragmentConfig;", "fragmentConfig", "<init>", "()V", "AddPaymentMethodFull", "AddPaymentMethodSheet", "SelectSavedPaymentMethod", "Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel$TransitionTarget$SelectSavedPaymentMethod;", "Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel$TransitionTarget$AddPaymentMethodFull;", "Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel$TransitionTarget$AddPaymentMethodSheet;", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentOptionsViewModel.kt */
    public static abstract class TransitionTarget {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0005\u001a\u00020\u00028\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0004¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel$TransitionTarget$AddPaymentMethodFull;", "Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel$TransitionTarget;", "Lcom/stripe/android/paymentsheet/model/FragmentConfig;", "component1", "()Lcom/stripe/android/paymentsheet/model/FragmentConfig;", "fragmentConfig", "copy", "(Lcom/stripe/android/paymentsheet/model/FragmentConfig;)Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel$TransitionTarget$AddPaymentMethodFull;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/stripe/android/paymentsheet/model/FragmentConfig;", "getFragmentConfig", "<init>", "(Lcom/stripe/android/paymentsheet/model/FragmentConfig;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentOptionsViewModel.kt */
        public static final class AddPaymentMethodFull extends TransitionTarget {
            private final FragmentConfig fragmentConfig;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public AddPaymentMethodFull(FragmentConfig fragmentConfig2) {
                super((f) null);
                i.e(fragmentConfig2, "fragmentConfig");
                this.fragmentConfig = fragmentConfig2;
            }

            public static /* synthetic */ AddPaymentMethodFull copy$default(AddPaymentMethodFull addPaymentMethodFull, FragmentConfig fragmentConfig2, int i, Object obj) {
                if ((i & 1) != 0) {
                    fragmentConfig2 = addPaymentMethodFull.getFragmentConfig();
                }
                return addPaymentMethodFull.copy(fragmentConfig2);
            }

            public final FragmentConfig component1() {
                return getFragmentConfig();
            }

            public final AddPaymentMethodFull copy(FragmentConfig fragmentConfig2) {
                i.e(fragmentConfig2, "fragmentConfig");
                return new AddPaymentMethodFull(fragmentConfig2);
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof AddPaymentMethodFull) && i.a(getFragmentConfig(), ((AddPaymentMethodFull) obj).getFragmentConfig());
                }
                return true;
            }

            public FragmentConfig getFragmentConfig() {
                return this.fragmentConfig;
            }

            public int hashCode() {
                FragmentConfig fragmentConfig2 = getFragmentConfig();
                if (fragmentConfig2 != null) {
                    return fragmentConfig2.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder P0 = i0.d.a.a.a.P0("AddPaymentMethodFull(fragmentConfig=");
                P0.append(getFragmentConfig());
                P0.append(")");
                return P0.toString();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0005\u001a\u00020\u00028\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0004¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel$TransitionTarget$AddPaymentMethodSheet;", "Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel$TransitionTarget;", "Lcom/stripe/android/paymentsheet/model/FragmentConfig;", "component1", "()Lcom/stripe/android/paymentsheet/model/FragmentConfig;", "fragmentConfig", "copy", "(Lcom/stripe/android/paymentsheet/model/FragmentConfig;)Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel$TransitionTarget$AddPaymentMethodSheet;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/stripe/android/paymentsheet/model/FragmentConfig;", "getFragmentConfig", "<init>", "(Lcom/stripe/android/paymentsheet/model/FragmentConfig;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentOptionsViewModel.kt */
        public static final class AddPaymentMethodSheet extends TransitionTarget {
            private final FragmentConfig fragmentConfig;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public AddPaymentMethodSheet(FragmentConfig fragmentConfig2) {
                super((f) null);
                i.e(fragmentConfig2, "fragmentConfig");
                this.fragmentConfig = fragmentConfig2;
            }

            public static /* synthetic */ AddPaymentMethodSheet copy$default(AddPaymentMethodSheet addPaymentMethodSheet, FragmentConfig fragmentConfig2, int i, Object obj) {
                if ((i & 1) != 0) {
                    fragmentConfig2 = addPaymentMethodSheet.getFragmentConfig();
                }
                return addPaymentMethodSheet.copy(fragmentConfig2);
            }

            public final FragmentConfig component1() {
                return getFragmentConfig();
            }

            public final AddPaymentMethodSheet copy(FragmentConfig fragmentConfig2) {
                i.e(fragmentConfig2, "fragmentConfig");
                return new AddPaymentMethodSheet(fragmentConfig2);
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof AddPaymentMethodSheet) && i.a(getFragmentConfig(), ((AddPaymentMethodSheet) obj).getFragmentConfig());
                }
                return true;
            }

            public FragmentConfig getFragmentConfig() {
                return this.fragmentConfig;
            }

            public int hashCode() {
                FragmentConfig fragmentConfig2 = getFragmentConfig();
                if (fragmentConfig2 != null) {
                    return fragmentConfig2.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder P0 = i0.d.a.a.a.P0("AddPaymentMethodSheet(fragmentConfig=");
                P0.append(getFragmentConfig());
                P0.append(")");
                return P0.toString();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0005\u001a\u00020\u00028\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0004¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel$TransitionTarget$SelectSavedPaymentMethod;", "Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel$TransitionTarget;", "Lcom/stripe/android/paymentsheet/model/FragmentConfig;", "component1", "()Lcom/stripe/android/paymentsheet/model/FragmentConfig;", "fragmentConfig", "copy", "(Lcom/stripe/android/paymentsheet/model/FragmentConfig;)Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel$TransitionTarget$SelectSavedPaymentMethod;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/stripe/android/paymentsheet/model/FragmentConfig;", "getFragmentConfig", "<init>", "(Lcom/stripe/android/paymentsheet/model/FragmentConfig;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentOptionsViewModel.kt */
        public static final class SelectSavedPaymentMethod extends TransitionTarget {
            private final FragmentConfig fragmentConfig;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public SelectSavedPaymentMethod(FragmentConfig fragmentConfig2) {
                super((f) null);
                i.e(fragmentConfig2, "fragmentConfig");
                this.fragmentConfig = fragmentConfig2;
            }

            public static /* synthetic */ SelectSavedPaymentMethod copy$default(SelectSavedPaymentMethod selectSavedPaymentMethod, FragmentConfig fragmentConfig2, int i, Object obj) {
                if ((i & 1) != 0) {
                    fragmentConfig2 = selectSavedPaymentMethod.getFragmentConfig();
                }
                return selectSavedPaymentMethod.copy(fragmentConfig2);
            }

            public final FragmentConfig component1() {
                return getFragmentConfig();
            }

            public final SelectSavedPaymentMethod copy(FragmentConfig fragmentConfig2) {
                i.e(fragmentConfig2, "fragmentConfig");
                return new SelectSavedPaymentMethod(fragmentConfig2);
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof SelectSavedPaymentMethod) && i.a(getFragmentConfig(), ((SelectSavedPaymentMethod) obj).getFragmentConfig());
                }
                return true;
            }

            public FragmentConfig getFragmentConfig() {
                return this.fragmentConfig;
            }

            public int hashCode() {
                FragmentConfig fragmentConfig2 = getFragmentConfig();
                if (fragmentConfig2 != null) {
                    return fragmentConfig2.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder P0 = i0.d.a.a.a.P0("SelectSavedPaymentMethod(fragmentConfig=");
                P0.append(getFragmentConfig());
                P0.append(")");
                return P0.toString();
            }
        }

        private TransitionTarget() {
        }

        public abstract FragmentConfig getFragmentConfig();

        public /* synthetic */ TransitionTarget(f fVar) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentOptionsViewModel(PaymentOptionContract.Args args, PrefsRepository prefsRepository, EventReporter eventReporter2, e eVar, Application application) {
        super(application, args.getConfig(), prefsRepository, eVar);
        i.e(args, "args");
        i.e(prefsRepository, "prefsRepository");
        i.e(eventReporter2, "eventReporter");
        i.e(eVar, "workContext");
        i.e(application, "application");
        this.eventReporter = eventReporter2;
        y<PaymentOptionResult> yVar = new y<>();
        this._paymentOptionResult = yVar;
        this.paymentOptionResult = yVar;
        this.newCard = args.getNewCard();
        get_isGooglePayReady().setValue(Boolean.valueOf(args.isGooglePayReady()));
        get_stripeIntent$payments_core_release().setValue(args.getStripeIntent());
        get_paymentMethods().setValue(args.getPaymentMethods());
        get_processing$payments_core_release().postValue(Boolean.FALSE);
    }

    private final boolean getShouldTransitionToUnsavedCard() {
        if (!this.hasTransitionToUnsavedCard) {
            PaymentSelection.New.Card newCard2 = getNewCard();
            if (!(newCard2 instanceof PaymentSelection.New)) {
                newCard2 = null;
            }
            if (newCard2 != null ? !newCard2.getShouldSavePaymentMethod() : false) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ void get_paymentOptionResult$payments_core_release$annotations() {
    }

    private final void processExistingCard(PaymentSelection paymentSelection) {
        getPrefsRepository().savePaymentSelection(paymentSelection);
        this._paymentOptionResult.setValue(new PaymentOptionResult.Succeeded(paymentSelection));
    }

    private final void processNewCard(PaymentSelection paymentSelection) {
        getPrefsRepository().savePaymentSelection(paymentSelection);
        this._paymentOptionResult.setValue(new PaymentOptionResult.Succeeded(paymentSelection));
    }

    public PaymentSelection.New.Card getNewCard() {
        return this.newCard;
    }

    public final LiveData<PaymentOptionResult> getPaymentOptionResult$payments_core_release() {
        return this.paymentOptionResult;
    }

    public final y<PaymentOptionResult> get_paymentOptionResult$payments_core_release() {
        return this._paymentOptionResult;
    }

    public void onFatal(Throwable th) {
        i.e(th, "throwable");
        get_fatal().setValue(th);
        this._paymentOptionResult.setValue(new PaymentOptionResult.Failed(th));
    }

    public void onUserCancel() {
        this._paymentOptionResult.setValue(new PaymentOptionResult.Canceled(get_fatal().getValue()));
    }

    public final void onUserSelection() {
        PaymentSelection value = getSelection$payments_core_release().getValue();
        if (value != null) {
            EventReporter eventReporter2 = this.eventReporter;
            i.d(value, "paymentSelection");
            eventReporter2.onSelectPaymentOption(value);
            if ((value instanceof PaymentSelection.Saved) || i.a(value, PaymentSelection.GooglePay.INSTANCE)) {
                processExistingCard(value);
            } else if (value instanceof PaymentSelection.New) {
                processNewCard(value);
            }
        }
    }

    public final void resolveTransitionTarget(FragmentConfig fragmentConfig) {
        i.e(fragmentConfig, "config");
        if (getShouldTransitionToUnsavedCard()) {
            this.hasTransitionToUnsavedCard = true;
            transitionTo(new TransitionTarget.AddPaymentMethodFull(fragmentConfig));
        }
    }

    public void setNewCard(PaymentSelection.New.Card card) {
        this.newCard = card;
    }
}
