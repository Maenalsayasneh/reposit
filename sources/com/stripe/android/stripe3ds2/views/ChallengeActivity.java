package com.stripe.android.stripe3ds2.views;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.CheckBox;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import com.stripe.android.stripe3ds2.databinding.StripeChallengeActivityBinding;
import com.stripe.android.stripe3ds2.databinding.StripeChallengeFragmentBinding;
import com.stripe.android.stripe3ds2.init.ui.UiCustomization;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.transaction.ChallengeAction;
import com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler;
import com.stripe.android.stripe3ds2.transaction.ChallengeStatusReceiver;
import com.stripe.android.stripe3ds2.transaction.ErrorRequestExecutor;
import com.stripe.android.stripe3ds2.transaction.SdkTransactionId;
import com.stripe.android.stripe3ds2.transaction.TransactionTimer;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseData;
import com.ults.listeners.BaseSdkChallenge;
import com.ults.listeners.ChallengeType;
import com.ults.listeners.SdkChallengeInterface;
import com.ults.listeners.challenges.MultiSelectChallenge;
import com.ults.listeners.challenges.SingleSelectChallenge;
import com.ults.listeners.challenges.TextChallenge;
import com.ults.listeners.challenges.WebChallenge;
import h0.b.a.e;
import h0.o.a.a;
import h0.q.l0;
import i0.j.f.p.h;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import m0.c;
import m0.n.b.i;
import m0.n.b.m;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\b¢\u0006\u0005\b\u0001\u0010\rJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u0019\u0010\u0012\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\rJ\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0019\u0010\rJ\u000f\u0010\u001a\u001a\u00020\tH\u0014¢\u0006\u0004\b\u001a\u0010\rJ\u000f\u0010\u001b\u001a\u00020\tH\u0014¢\u0006\u0004\b\u001b\u0010\rJ\u000f\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001c\u0010\rJ\u0017\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\tH\u0016¢\u0006\u0004\b!\u0010\rJ\u000f\u0010\"\u001a\u00020\tH\u0016¢\u0006\u0004\b\"\u0010\rJ\u0011\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\tH\u0016¢\u0006\u0004\b&\u0010\rJ\u0017\u0010(\u001a\u00020\t2\u0006\u0010'\u001a\u00020\u0015H\u0016¢\u0006\u0004\b(\u0010\u0018J\u0019\u0010+\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010*\u0018\u00010)H\u0016¢\u0006\u0004\b+\u0010,J\u0011\u0010.\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102R\u001d\u00108\u001a\u0002038B@\u0002X\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001d\u0010=\u001a\u0002098B@\u0002X\u0002¢\u0006\f\n\u0004\b:\u00105\u001a\u0004\b;\u0010<R\u001d\u0010B\u001a\u00020>8B@\u0002X\u0002¢\u0006\f\n\u0004\b?\u00105\u001a\u0004\b@\u0010AR\u001d\u0010G\u001a\u00020C8@@\u0000X\u0002¢\u0006\f\n\u0004\bD\u00105\u001a\u0004\bE\u0010FR\u001d\u0010L\u001a\u00020H8B@\u0002X\u0002¢\u0006\f\n\u0004\bI\u00105\u001a\u0004\bJ\u0010KR\u0018\u0010N\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u001d\u0010T\u001a\u00020P8B@\u0002X\u0002¢\u0006\f\n\u0004\bQ\u00105\u001a\u0004\bR\u0010SR\u001d\u0010Y\u001a\u00020U8@@\u0000X\u0002¢\u0006\f\n\u0004\bV\u00105\u001a\u0004\bW\u0010XR\u001d\u0010^\u001a\u00020Z8B@\u0002X\u0002¢\u0006\f\n\u0004\b[\u00105\u001a\u0004\b\\\u0010]R\u001d\u0010c\u001a\u00020_8@@\u0000X\u0002¢\u0006\f\n\u0004\b`\u00105\u001a\u0004\ba\u0010bR\u0016\u0010f\u001a\u00020\u00158C@\u0002X\u0004¢\u0006\u0006\u001a\u0004\bd\u0010eR\u001d\u0010k\u001a\u00020g8B@\u0002X\u0002¢\u0006\f\n\u0004\bh\u00105\u001a\u0004\bi\u0010jR\u001d\u0010p\u001a\u00020l8B@\u0002X\u0002¢\u0006\f\n\u0004\bm\u00105\u001a\u0004\bn\u0010oR\u001d\u0010u\u001a\u00020q8B@\u0002X\u0002¢\u0006\f\n\u0004\br\u00105\u001a\u0004\bs\u0010tR,\u0010z\u001a\b\u0012\u0004\u0012\u00020P0v8B@\u0002X\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bw\u00105\u001a\u0004\bx\u0010yR\u001d\u0010\u001a\u00020{8B@\u0002X\u0002¢\u0006\f\n\u0004\b|\u00105\u001a\u0004\b}\u0010~R\"\u0010\u0001\u001a\u00030\u00018@@\u0000X\u0002¢\u0006\u000f\n\u0005\b\u0001\u00105\u001a\u0006\b\u0001\u0010\u0001\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0001"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;", "Lh0/b/a/e;", "Lcom/ults/listeners/challenges/TextChallenge;", "Lcom/ults/listeners/challenges/SingleSelectChallenge;", "Lcom/ults/listeners/challenges/MultiSelectChallenge;", "Lcom/ults/listeners/challenges/WebChallenge;", "Lcom/ults/listeners/SdkChallengeInterface;", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;", "cres", "Lm0/i;", "startFragment", "(Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;)V", "dismissKeyboard", "()V", "configureHeaderZone", "dismissDialog", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onLowMemory", "", "level", "onTrimMemory", "(I)V", "onPause", "onResume", "onDestroy", "onBackPressed", "", "s", "typeTextChallengeValue", "(Ljava/lang/String;)V", "clickSubmitButton", "clickCancelButton", "Lcom/ults/listeners/ChallengeType;", "getChallengeType", "()Lcom/ults/listeners/ChallengeType;", "expandTextsBeforeScreenshot", "i", "selectObject", "", "Landroid/widget/CheckBox;", "getCheckboxesOrdered", "()[Landroid/widget/CheckBox;", "Landroid/webkit/WebView;", "getWebView", "()Landroid/webkit/WebView;", "Lcom/ults/listeners/BaseSdkChallenge;", "getCurrentChallenge", "()Lcom/ults/listeners/BaseSdkChallenge;", "Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;", "viewArgs$delegate", "Lm0/c;", "getViewArgs", "()Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;", "viewArgs", "Lcom/stripe/android/stripe3ds2/views/InformationZoneView;", "informationZoneView$delegate", "getInformationZoneView", "()Lcom/stripe/android/stripe3ds2/views/InformationZoneView;", "informationZoneView", "Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;", "transactionTimer$delegate", "getTransactionTimer", "()Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;", "transactionTimer", "Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeActivityBinding;", "viewBinding$delegate", "getViewBinding$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeActivityBinding;", "viewBinding", "Lcom/stripe/android/stripe3ds2/views/ChallengeSubmitDialogFactory;", "progressDialogFactory$delegate", "getProgressDialogFactory", "()Lcom/stripe/android/stripe3ds2/views/ChallengeSubmitDialogFactory;", "progressDialogFactory", "Landroid/app/Dialog;", "progressDialog", "Landroid/app/Dialog;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeStatusReceiver;", "challengeStatusReceiver$delegate", "getChallengeStatusReceiver", "()Lcom/stripe/android/stripe3ds2/transaction/ChallengeStatusReceiver;", "challengeStatusReceiver", "Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;", "viewModel$delegate", "getViewModel$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;", "viewModel", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;", "challengeActionHandler$delegate", "getChallengeActionHandler", "()Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;", "challengeActionHandler", "Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;", "fragment$delegate", "getFragment$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;", "fragment", "getFragmentContainerId", "()I", "fragmentContainerId", "Lcom/stripe/android/stripe3ds2/views/KeyboardController;", "keyboardController$delegate", "getKeyboardController", "()Lcom/stripe/android/stripe3ds2/views/KeyboardController;", "keyboardController", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "sdkTransactionId$delegate", "getSdkTransactionId", "()Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "sdkTransactionId", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "errorReporter$delegate", "getErrorReporter", "()Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "errorReporter", "Lkotlin/Result;", "challengeStatusReceiverResult$delegate", "getChallengeStatusReceiverResult-d1pmJ48", "()Ljava/lang/Object;", "challengeStatusReceiverResult", "Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;", "errorRequestExecutor$delegate", "getErrorRequestExecutor", "()Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;", "errorRequestExecutor", "Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeFragmentBinding;", "fragmentViewBinding$delegate", "getFragmentViewBinding$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeFragmentBinding;", "fragmentViewBinding", "<init>", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ChallengeActivity.kt */
public final class ChallengeActivity extends e implements TextChallenge, SingleSelectChallenge, MultiSelectChallenge, WebChallenge, SdkChallengeInterface {
    private final c challengeActionHandler$delegate = h.H2(new ChallengeActivity$challengeActionHandler$2(this));
    private final c challengeStatusReceiver$delegate = h.H2(new ChallengeActivity$challengeStatusReceiver$2(this));
    private final c challengeStatusReceiverResult$delegate = h.H2(new ChallengeActivity$challengeStatusReceiverResult$2(this));
    private final c errorReporter$delegate = h.H2(new ChallengeActivity$errorReporter$2(this));
    private final c errorRequestExecutor$delegate = h.H2(new ChallengeActivity$errorRequestExecutor$2(this));
    private final c fragment$delegate = h.H2(new ChallengeActivity$fragment$2(this));
    private final c fragmentViewBinding$delegate = h.H2(new ChallengeActivity$fragmentViewBinding$2(this));
    private final c informationZoneView$delegate = h.H2(new ChallengeActivity$informationZoneView$2(this));
    private final c keyboardController$delegate = h.H2(new ChallengeActivity$keyboardController$2(this));
    /* access modifiers changed from: private */
    public Dialog progressDialog;
    private final c progressDialogFactory$delegate = h.H2(new ChallengeActivity$progressDialogFactory$2(this));
    private final c sdkTransactionId$delegate = h.H2(new ChallengeActivity$sdkTransactionId$2(this));
    private final c transactionTimer$delegate = h.H2(new ChallengeActivity$transactionTimer$2(this));
    private final c viewArgs$delegate = h.H2(new ChallengeActivity$viewArgs$2(this));
    private final c viewBinding$delegate = h.H2(new ChallengeActivity$viewBinding$2(this));
    private final c viewModel$delegate = new l0(m.a(ChallengeActivityViewModel.class), new ChallengeActivity$$special$$inlined$viewModels$2(this), new ChallengeActivity$viewModel$2(this));

    private final void configureHeaderZone() {
        ThreeDS2Button customize = new HeaderZoneCustomizer(this).customize(getViewArgs().getUiCustomization().getToolbarCustomization(), getViewArgs().getUiCustomization().getButtonCustomization(UiCustomization.ButtonType.CANCEL));
        if (customize != null) {
            customize.setOnClickListener(new ChallengeActivity$configureHeaderZone$1(this, customize));
        }
    }

    /* access modifiers changed from: private */
    public final void dismissDialog() {
        Dialog dialog = this.progressDialog;
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }
        this.progressDialog = null;
    }

    /* access modifiers changed from: private */
    public final void dismissKeyboard() {
        getKeyboardController().hide();
    }

    /* access modifiers changed from: private */
    public final ChallengeActionHandler getChallengeActionHandler() {
        return (ChallengeActionHandler) this.challengeActionHandler$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final ChallengeStatusReceiver getChallengeStatusReceiver() {
        return (ChallengeStatusReceiver) this.challengeStatusReceiver$delegate.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: getChallengeStatusReceiverResult-d1pmJ48  reason: not valid java name */
    public final Object m48getChallengeStatusReceiverResultd1pmJ48() {
        return ((Result) this.challengeStatusReceiverResult$delegate.getValue()).c;
    }

    /* access modifiers changed from: private */
    public final ErrorReporter getErrorReporter() {
        return (ErrorReporter) this.errorReporter$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final ErrorRequestExecutor getErrorRequestExecutor() {
        return (ErrorRequestExecutor) this.errorRequestExecutor$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final int getFragmentContainerId() {
        FragmentContainerView fragmentContainerView = getViewBinding$3ds2sdk_release().fragmentContainer;
        i.d(fragmentContainerView, "viewBinding.fragmentContainer");
        return fragmentContainerView.getId();
    }

    private final InformationZoneView getInformationZoneView() {
        return (InformationZoneView) this.informationZoneView$delegate.getValue();
    }

    private final KeyboardController getKeyboardController() {
        return (KeyboardController) this.keyboardController$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final ChallengeSubmitDialogFactory getProgressDialogFactory() {
        return (ChallengeSubmitDialogFactory) this.progressDialogFactory$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final SdkTransactionId getSdkTransactionId() {
        return (SdkTransactionId) this.sdkTransactionId$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final TransactionTimer getTransactionTimer() {
        return (TransactionTimer) this.transactionTimer$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final ChallengeViewArgs getViewArgs() {
        return (ChallengeViewArgs) this.viewArgs$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final void startFragment(ChallengeResponseData challengeResponseData) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        i.d(supportFragmentManager, "supportFragmentManager");
        a aVar = new a(supportFragmentManager);
        i.d(aVar, "beginTransaction()");
        AnimationConstants animationConstants = AnimationConstants.INSTANCE;
        aVar.r(animationConstants.getSLIDE_IN(), animationConstants.getSLIDE_OUT(), animationConstants.getSLIDE_IN(), animationConstants.getSLIDE_OUT());
        aVar.p(getFragmentContainerId(), ChallengeFragment.class, g0.a.b.b.a.g(new Pair(ChallengeFragment.ARG_CRES, challengeResponseData)));
        aVar.h();
    }

    public void clickCancelButton() {
        getViewModel$3ds2sdk_release().submit(ChallengeAction.Cancel.INSTANCE);
    }

    public void clickSubmitButton() {
        getFragment$3ds2sdk_release().clickSubmitButton();
    }

    public void expandTextsBeforeScreenshot() {
        getInformationZoneView().expandViews();
    }

    public ChallengeType getChallengeType() {
        ChallengeResponseData.UiType uiType = getViewArgs().getCresData().getUiType();
        if (uiType != null) {
            return uiType.getChallengeType();
        }
        return null;
    }

    public BaseSdkChallenge getCurrentChallenge() {
        return this;
    }

    public final ChallengeFragment getFragment$3ds2sdk_release() {
        return (ChallengeFragment) this.fragment$delegate.getValue();
    }

    public final StripeChallengeFragmentBinding getFragmentViewBinding$3ds2sdk_release() {
        return (StripeChallengeFragmentBinding) this.fragmentViewBinding$delegate.getValue();
    }

    public final StripeChallengeActivityBinding getViewBinding$3ds2sdk_release() {
        return (StripeChallengeActivityBinding) this.viewBinding$delegate.getValue();
    }

    public final ChallengeActivityViewModel getViewModel$3ds2sdk_release() {
        return (ChallengeActivityViewModel) this.viewModel$delegate.getValue();
    }

    public void onBackPressed() {
        getViewModel$3ds2sdk_release().submit(ChallengeAction.Cancel.INSTANCE);
    }

    public void onCreate(Bundle bundle) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        i.d(supportFragmentManager, "supportFragmentManager");
        supportFragmentManager.v = new ChallengeFragmentFactory(getSdkTransactionId(), getViewArgs().getUiCustomization(), getTransactionTimer(), getChallengeStatusReceiver(), getErrorRequestExecutor(), getErrorReporter(), getChallengeActionHandler());
        super.onCreate(bundle);
        getWindow().setFlags(8192, 8192);
        setContentView((View) getViewBinding$3ds2sdk_release().getRoot());
        getViewModel$3ds2sdk_release().getSubmitClicked().observe(this, new ChallengeActivity$onCreate$1(this));
        getViewModel$3ds2sdk_release().getShouldFinish().observe(this, new ChallengeActivity$onCreate$2(this));
        configureHeaderZone();
        getViewModel$3ds2sdk_release().getNextScreen().observe(this, new ChallengeActivity$onCreate$3(this));
        if (bundle == null) {
            getViewModel$3ds2sdk_release().onNextScreen(getViewArgs().getCresData());
        }
    }

    public void onDestroy() {
        super.onDestroy();
        dismissDialog();
    }

    public void onLowMemory() {
        super.onLowMemory();
        getViewModel$3ds2sdk_release().onMemoryEvent();
    }

    public void onPause() {
        super.onPause();
        getViewModel$3ds2sdk_release().setShouldRefreshUi(true);
        dismissKeyboard();
    }

    public void onResume() {
        super.onResume();
        if (getViewModel$3ds2sdk_release().getShouldRefreshUi()) {
            getViewModel$3ds2sdk_release().onRefreshUi();
        } else {
            h0.s.a.a.a(this).c(new Intent().setAction(SdkChallengeInterface.UL_HANDLE_CHALLENGE_ACTION));
        }
        getViewModel$3ds2sdk_release().getTimeout().observe(this, new ChallengeActivity$onResume$1(this));
    }

    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        getViewModel$3ds2sdk_release().onMemoryEvent();
    }

    public void selectObject(int i) {
        getFragment$3ds2sdk_release().selectChallengeOption(i);
    }

    public void typeTextChallengeValue(String str) {
        i.e(str, "s");
        getViewModel$3ds2sdk_release().updateChallengeText(str);
    }

    public CheckBox[] getCheckboxesOrdered() {
        return getFragment$3ds2sdk_release().getCheckboxesOrdered();
    }

    public WebView getWebView() {
        return getFragment$3ds2sdk_release().getWebView();
    }
}
