package com.stripe.android.paymentsheet.viewmodels;

import android.app.Application;
import androidx.lifecycle.LiveData;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.stripe.android.googlepay.StripeGooglePayContract;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PrefsRepository;
import com.stripe.android.paymentsheet.model.FragmentConfig;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.model.SavedSelection;
import h0.q.b;
import h0.q.i0;
import h0.q.w;
import h0.q.y;
import i0.d.a.a.a;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineStart;
import m0.j.g;
import m0.l.c;
import m0.l.e;
import m0.n.b.f;
import m0.n.b.i;
import n0.a.m0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002fgB+\u0012\u0006\u0010c\u001a\u00020b\u0012\b\u0010M\u001a\u0004\u0018\u00010L\u0012\u0006\u0010\\\u001a\u00020[\u0012\b\b\u0002\u0010A\u001a\u00020@¢\u0006\u0004\bd\u0010eJ\u0011\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0006H&¢\u0006\u0004\b\u0017\u0010\bR$\u0010\u001a\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00190\u00188\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\"\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00188\u0004@\u0004X\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u001fR\u001f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001c0\r8\u0006@\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u000fR\"\u0010#\u001a\b\u0012\u0004\u0012\u00020\t0\u00188\u0004@\u0004X\u0004¢\u0006\f\n\u0004\b#\u0010\u001b\u001a\u0004\b$\u0010\u001fR\u001e\u0010&\u001a\u0004\u0018\u00010%8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\r8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010!R*\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0\u00188\u0000@\u0001X\u0004¢\u0006\u0012\n\u0004\b-\u0010\u001b\u0012\u0004\b/\u0010\b\u001a\u0004\b.\u0010\u001fR\u001c\u00100\u001a\b\u0012\u0004\u0012\u00020*0\u00188\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u0010\u001bR*\u00101\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00190\r8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b1\u0010!\u001a\u0004\b2\u0010\u000fR$\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0\r8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b3\u0010!\u001a\u0004\b4\u0010\u000fR\u001f\u00105\u001a\b\u0012\u0004\u0012\u00020\u001c0\r8\u0006@\u0006¢\u0006\f\n\u0004\b5\u0010!\u001a\u0004\b6\u0010\u000fR\"\u00107\u001a\b\u0012\u0004\u0012\u00020\u001c0\r8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b7\u0010!\u001a\u0004\b8\u0010\u000fR(\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002090\u00190\r8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b:\u0010!\u001a\u0004\b;\u0010\u000fR0\u0010=\u001a\u0010\u0012\f\u0012\n <*\u0004\u0018\u00010\u001c0\u001c0\u00188\u0000@\u0001X\u0004¢\u0006\u0012\n\u0004\b=\u0010\u001b\u0012\u0004\b?\u0010\b\u001a\u0004\b>\u0010\u001fR\u001c\u0010A\u001a\u00020@8\u0004@\u0004X\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u001e\u0010E\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00188\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bE\u0010\u001bR\u001e\u0010K\u001a\u0004\u0018\u00010F8&@&X¦\u000e¢\u0006\f\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001e\u0010M\u001a\u0004\u0018\u00010L8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR$\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\r8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0014\u0010!\u001a\u0004\bQ\u0010\u000fR(\u0010T\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020S0R0\r8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\bT\u0010!\u001a\u0004\bU\u0010\u000fR\u0013\u0010X\u001a\u00020\u001c8F@\u0006¢\u0006\u0006\u001a\u0004\bV\u0010WR(\u0010Y\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002090\u00190\u00188\u0004@\u0004X\u0004¢\u0006\f\n\u0004\bY\u0010\u001b\u001a\u0004\bZ\u0010\u001fR\u001c\u0010\\\u001a\u00020[8\u0004@\u0004X\u0004¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R(\u0010`\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020S0R0\u00188\u0004@\u0004X\u0004¢\u0006\f\n\u0004\b`\u0010\u001b\u001a\u0004\ba\u0010\u001f¨\u0006h"}, d2 = {"Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;", "TransitionTargetType", "Lh0/q/b;", "Lcom/stripe/android/paymentsheet/model/FragmentConfig;", "createFragmentConfig", "()Lcom/stripe/android/paymentsheet/model/FragmentConfig;", "Lm0/i;", "fetchSavedSelection", "()V", "", "throwable", "onFatal", "(Ljava/lang/Throwable;)V", "Landroidx/lifecycle/LiveData;", "fetchFragmentConfig", "()Landroidx/lifecycle/LiveData;", "target", "transitionTo", "(Ljava/lang/Object;)V", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "selection", "updateSelection", "(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V", "onUserCancel", "Lh0/q/y;", "Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$Event;", "_transition", "Lh0/q/y;", "", "_isGooglePayReady", "get_isGooglePayReady", "()Lh0/q/y;", "processing", "Landroidx/lifecycle/LiveData;", "getProcessing", "_fatal", "get_fatal", "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;", "customerConfig", "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;", "getCustomerConfig$payments_core_release", "()Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;", "Lcom/stripe/android/paymentsheet/model/SavedSelection;", "savedSelection", "Lcom/stripe/android/model/StripeIntent;", "_stripeIntent", "get_stripeIntent$payments_core_release", "get_stripeIntent$payments_core_release$annotations", "_savedSelection", "transition", "getTransition$payments_core_release", "stripeIntent", "getStripeIntent$payments_core_release", "ctaEnabled", "getCtaEnabled", "isGooglePayReady", "isGooglePayReady$payments_core_release", "Lcom/stripe/android/googlepay/StripeGooglePayContract$Args;", "launchGooglePay", "getLaunchGooglePay$payments_core_release", "kotlin.jvm.PlatformType", "_processing", "get_processing$payments_core_release", "get_processing$payments_core_release$annotations", "Lm0/l/e;", "workContext", "Lm0/l/e;", "getWorkContext", "()Lm0/l/e;", "_selection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$Card;", "getNewCard", "()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$Card;", "setNewCard", "(Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$Card;)V", "newCard", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "config", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "getConfig$payments_core_release", "()Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "getSelection$payments_core_release", "", "Lcom/stripe/android/model/PaymentMethod;", "paymentMethods", "getPaymentMethods$payments_core_release", "getUserCanChooseToSaveCard", "()Z", "userCanChooseToSaveCard", "_launchGooglePay", "get_launchGooglePay", "Lcom/stripe/android/paymentsheet/PrefsRepository;", "prefsRepository", "Lcom/stripe/android/paymentsheet/PrefsRepository;", "getPrefsRepository", "()Lcom/stripe/android/paymentsheet/PrefsRepository;", "_paymentMethods", "get_paymentMethods", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lcom/stripe/android/paymentsheet/PrefsRepository;Lm0/l/e;)V", "Event", "UserErrorMessage", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: BaseSheetViewModel.kt */
public abstract class BaseSheetViewModel<TransitionTargetType> extends b {
    private final y<Throwable> _fatal;
    private final y<Boolean> _isGooglePayReady;
    private final y<Event<StripeGooglePayContract.Args>> _launchGooglePay;
    private final y<List<PaymentMethod>> _paymentMethods;
    private final y<Boolean> _processing;
    /* access modifiers changed from: private */
    public final y<SavedSelection> _savedSelection;
    private final y<PaymentSelection> _selection;
    private final y<StripeIntent> _stripeIntent;
    private final y<Event<TransitionTargetType>> _transition;
    private final PaymentSheet.Configuration config;
    private final LiveData<Boolean> ctaEnabled;
    private final PaymentSheet.CustomerConfiguration customerConfig;
    private final LiveData<Boolean> isGooglePayReady;
    private final LiveData<Event<StripeGooglePayContract.Args>> launchGooglePay;
    private final LiveData<List<PaymentMethod>> paymentMethods;
    private final PrefsRepository prefsRepository;
    private final LiveData<Boolean> processing;
    private final LiveData<SavedSelection> savedSelection;
    private final LiveData<PaymentSelection> selection;
    private final LiveData<StripeIntent> stripeIntent;
    private final LiveData<Event<TransitionTargetType>> transition;
    private final e workContext;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u00020\u0002B\u000f\u0012\u0006\u0010\f\u001a\u00028\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0003\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0005\u001a\u00028\u0001¢\u0006\u0004\b\u0005\u0010\u0004R$\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068\u0006@BX\u000e¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00028\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$Event;", "T", "", "getContentIfNotHandled", "()Ljava/lang/Object;", "peekContent", "", "<set-?>", "hasBeenHandled", "Z", "getHasBeenHandled", "()Z", "content", "Ljava/lang/Object;", "<init>", "(Ljava/lang/Object;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: BaseSheetViewModel.kt */
    public static final class Event<T> {
        private final T content;
        private boolean hasBeenHandled;

        public Event(T t) {
            this.content = t;
        }

        public final T getContentIfNotHandled() {
            if (this.hasBeenHandled) {
                return null;
            }
            this.hasBeenHandled = true;
            return this.content;
        }

        public final boolean getHasBeenHandled() {
            return this.hasBeenHandled;
        }

        public final T peekContent() {
            return this.content;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\u0004J\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0004¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$UserErrorMessage;", "", "", "component1", "()Ljava/lang/String;", "message", "copy", "(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$UserErrorMessage;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "<init>", "(Ljava/lang/String;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: BaseSheetViewModel.kt */
    public static final class UserErrorMessage {
        private final String message;

        public UserErrorMessage(String str) {
            i.e(str, InstabugDbContract.BugEntry.COLUMN_MESSAGE);
            this.message = str;
        }

        public static /* synthetic */ UserErrorMessage copy$default(UserErrorMessage userErrorMessage, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = userErrorMessage.message;
            }
            return userErrorMessage.copy(str);
        }

        public final String component1() {
            return this.message;
        }

        public final UserErrorMessage copy(String str) {
            i.e(str, InstabugDbContract.BugEntry.COLUMN_MESSAGE);
            return new UserErrorMessage(str);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof UserErrorMessage) && i.a(this.message, ((UserErrorMessage) obj).message);
            }
            return true;
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            String str = this.message;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return a.y0(a.P0("UserErrorMessage(message="), this.message, ")");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseSheetViewModel(Application application, PaymentSheet.Configuration configuration, PrefsRepository prefsRepository2, e eVar) {
        super(application);
        i.e(application, "application");
        i.e(prefsRepository2, "prefsRepository");
        i.e(eVar, "workContext");
        this.config = configuration;
        this.prefsRepository = prefsRepository2;
        this.workContext = eVar;
        this.customerConfig = configuration != null ? configuration.getCustomer() : null;
        this._fatal = new y<>();
        y<Boolean> yVar = new y<>();
        this._isGooglePayReady = yVar;
        LiveData<Boolean> A = g0.a.b.b.a.A(yVar);
        i.d(A, "Transformations.distinctUntilChanged(this)");
        this.isGooglePayReady = A;
        y<Event<StripeGooglePayContract.Args>> yVar2 = new y<>();
        this._launchGooglePay = yVar2;
        this.launchGooglePay = yVar2;
        y<StripeIntent> yVar3 = new y<>();
        this._stripeIntent = yVar3;
        this.stripeIntent = yVar3;
        y<List<PaymentMethod>> yVar4 = new y<>();
        this._paymentMethods = yVar4;
        this.paymentMethods = yVar4;
        y<SavedSelection> yVar5 = new y<>();
        this._savedSelection = yVar5;
        this.savedSelection = yVar5;
        y<Event<TransitionTargetType>> yVar6 = new y<>(new Event(null));
        this._transition = yVar6;
        this.transition = yVar6;
        y<PaymentSelection> yVar7 = new y<>();
        this._selection = yVar7;
        this.selection = yVar7;
        y<Boolean> yVar8 = new y<>(Boolean.TRUE);
        this._processing = yVar8;
        this.processing = yVar8;
        BaseSheetViewModel$$special$$inlined$switchMap$2 baseSheetViewModel$$special$$inlined$switchMap$2 = new BaseSheetViewModel$$special$$inlined$switchMap$2(this);
        w wVar = new w();
        wVar.a(yVar8, new i0(baseSheetViewModel$$special$$inlined$switchMap$2, wVar));
        i.d(wVar, "Transformations.switchMap(this) { transform(it) }");
        this.ctaEnabled = wVar;
        fetchSavedSelection();
    }

    /* access modifiers changed from: private */
    public final FragmentConfig createFragmentConfig() {
        StripeIntent value = this.stripeIntent.getValue();
        List value2 = this.paymentMethods.getValue();
        Boolean value3 = this.isGooglePayReady.getValue();
        SavedSelection value4 = this.savedSelection.getValue();
        if (value == null || value2 == null || value3 == null || value4 == null) {
            return null;
        }
        return new FragmentConfig(value, value2, value3.booleanValue(), value4);
    }

    private final void fetchSavedSelection() {
        m0.r.t.a.r.m.a1.a.E2(g0.a.b.b.a.T(this), (e) null, (CoroutineStart) null, new BaseSheetViewModel$fetchSavedSelection$1(this, (c) null), 3, (Object) null);
    }

    public static /* synthetic */ void get_processing$payments_core_release$annotations() {
    }

    public static /* synthetic */ void get_stripeIntent$payments_core_release$annotations() {
    }

    public final LiveData<FragmentConfig> fetchFragmentConfig() {
        w wVar = new w();
        for (LiveData a : g.K(this.savedSelection, this.stripeIntent, this.paymentMethods, this.isGooglePayReady)) {
            wVar.a(a, new BaseSheetViewModel$fetchFragmentConfig$$inlined$also$lambda$1(wVar, this));
        }
        LiveData<FragmentConfig> A = g0.a.b.b.a.A(wVar);
        i.d(A, "Transformations.distinctUntilChanged(this)");
        return A;
    }

    public final PaymentSheet.Configuration getConfig$payments_core_release() {
        return this.config;
    }

    public final LiveData<Boolean> getCtaEnabled() {
        return this.ctaEnabled;
    }

    public final PaymentSheet.CustomerConfiguration getCustomerConfig$payments_core_release() {
        return this.customerConfig;
    }

    public final LiveData<Event<StripeGooglePayContract.Args>> getLaunchGooglePay$payments_core_release() {
        return this.launchGooglePay;
    }

    public abstract PaymentSelection.New.Card getNewCard();

    public final LiveData<List<PaymentMethod>> getPaymentMethods$payments_core_release() {
        return this.paymentMethods;
    }

    public final PrefsRepository getPrefsRepository() {
        return this.prefsRepository;
    }

    public final LiveData<Boolean> getProcessing() {
        return this.processing;
    }

    public final LiveData<PaymentSelection> getSelection$payments_core_release() {
        return this.selection;
    }

    public final LiveData<StripeIntent> getStripeIntent$payments_core_release() {
        return this.stripeIntent;
    }

    public final LiveData<Event<TransitionTargetType>> getTransition$payments_core_release() {
        return this.transition;
    }

    public final boolean getUserCanChooseToSaveCard() {
        return this.customerConfig != null && (this.stripeIntent.getValue() instanceof PaymentIntent);
    }

    public final e getWorkContext() {
        return this.workContext;
    }

    public final y<Throwable> get_fatal() {
        return this._fatal;
    }

    public final y<Boolean> get_isGooglePayReady() {
        return this._isGooglePayReady;
    }

    public final y<Event<StripeGooglePayContract.Args>> get_launchGooglePay() {
        return this._launchGooglePay;
    }

    public final y<List<PaymentMethod>> get_paymentMethods() {
        return this._paymentMethods;
    }

    public final y<Boolean> get_processing$payments_core_release() {
        return this._processing;
    }

    public final y<StripeIntent> get_stripeIntent$payments_core_release() {
        return this._stripeIntent;
    }

    public final LiveData<Boolean> isGooglePayReady$payments_core_release() {
        return this.isGooglePayReady;
    }

    public abstract void onFatal(Throwable th);

    public abstract void onUserCancel();

    public abstract void setNewCard(PaymentSelection.New.Card card);

    public void transitionTo(TransitionTargetType transitiontargettype) {
        this._transition.postValue(new Event(transitiontargettype));
    }

    public final void updateSelection(PaymentSelection paymentSelection) {
        this._selection.setValue(paymentSelection);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BaseSheetViewModel(Application application, PaymentSheet.Configuration configuration, PrefsRepository prefsRepository2, e eVar, int i, f fVar) {
        this(application, configuration, prefsRepository2, (i & 8) != 0 ? m0.c : eVar);
    }
}
