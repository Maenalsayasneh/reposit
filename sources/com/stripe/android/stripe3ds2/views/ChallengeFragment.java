package com.stripe.android.stripe3ds2.views;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.CheckBox;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.stripe.android.stripe3ds2.R;
import com.stripe.android.stripe3ds2.databinding.StripeChallengeFragmentBinding;
import com.stripe.android.stripe3ds2.init.ui.ButtonCustomization;
import com.stripe.android.stripe3ds2.init.ui.LabelCustomization;
import com.stripe.android.stripe3ds2.init.ui.StripeUiCustomization;
import com.stripe.android.stripe3ds2.init.ui.UiCustomization;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.transaction.ChallengeAction;
import com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler;
import com.stripe.android.stripe3ds2.transaction.ChallengeFlowOutcome;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestResult;
import com.stripe.android.stripe3ds2.transaction.ChallengeStatusReceiver;
import com.stripe.android.stripe3ds2.transaction.CompletionEvent;
import com.stripe.android.stripe3ds2.transaction.ErrorRequestExecutor;
import com.stripe.android.stripe3ds2.transaction.ProtocolErrorEventFactory;
import com.stripe.android.stripe3ds2.transaction.RuntimeErrorEvent;
import com.stripe.android.stripe3ds2.transaction.SdkTransactionId;
import com.stripe.android.stripe3ds2.transaction.TransactionTimer;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseData;
import com.stripe.android.stripe3ds2.transactions.ErrorData;
import g0.a.b.b.a;
import i0.j.f.p.h;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.text.StringsKt__IndentKt;
import m0.c;
import m0.j.g;
import m0.n.b.f;
import m0.n.b.i;
import m0.n.b.m;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 |2\u00020\u0001:\u0001|B?\u0012\u0006\u0010E\u001a\u00020D\u0012\u0006\u00106\u001a\u000205\u0012\u0006\u00109\u001a\u000208\u0012\u0006\u0010x\u001a\u00020w\u0012\u0006\u0010H\u001a\u00020G\u0012\u0006\u0010U\u001a\u00020T\u0012\u0006\u0010K\u001a\u00020J¢\u0006\u0004\bz\u0010{J-\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001b\u0010 J!\u0010%\u001a\u00020\b2\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\bH\u0016¢\u0006\u0004\b'\u0010\fJ\u0015\u0010*\u001a\u00020\b2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\b¢\u0006\u0004\b,\u0010\fJ\r\u0010-\u001a\u00020\b¢\u0006\u0004\b-\u0010\fJ\u0017\u00100\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010/\u0018\u00010.¢\u0006\u0004\b0\u00101J\u000f\u00103\u001a\u0004\u0018\u000102¢\u0006\u0004\b3\u00104R\u0016\u00106\u001a\u0002058\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00109\u001a\u0002088\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001d\u0010@\u001a\u00020;8B@\u0002X\u0002¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001f\u0010\u0003\u001a\u0004\u0018\u00010\u00028@@\u0000X\u0002¢\u0006\f\n\u0004\bA\u0010=\u001a\u0004\bB\u0010CR\u0016\u0010E\u001a\u00020D8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010H\u001a\u00020G8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010K\u001a\u00020J8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u001f\u0010\u0007\u001a\u0004\u0018\u00010\u00068@@\u0000X\u0002¢\u0006\f\n\u0004\bM\u0010=\u001a\u0004\bN\u0010OR\u0016\u0010S\u001a\u00020P8A@\u0000X\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0016\u0010U\u001a\u00020T8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u001d\u0010[\u001a\u00020W8B@\u0002X\u0002¢\u0006\f\n\u0004\bX\u0010=\u001a\u0004\bY\u0010ZR\u001d\u0010`\u001a\u00020\\8@@\u0000X\u0002¢\u0006\f\n\u0004\b]\u0010=\u001a\u0004\b^\u0010_R\u001d\u0010e\u001a\u00020a8B@\u0002X\u0002¢\u0006\f\n\u0004\bb\u0010=\u001a\u0004\bc\u0010dR\u001d\u0010h\u001a\u00020P8B@\u0002X\u0002¢\u0006\f\n\u0004\bf\u0010=\u001a\u0004\bg\u0010RR\u0016\u0010l\u001a\u00020i8B@\u0002X\u0004¢\u0006\u0006\u001a\u0004\bj\u0010kR\u0016\u0010p\u001a\u00020m8@@\u0000X\u0004¢\u0006\u0006\u001a\u0004\bn\u0010oR\u001f\u0010\u0005\u001a\u0004\u0018\u00010\u00048@@\u0000X\u0002¢\u0006\f\n\u0004\bq\u0010=\u001a\u0004\br\u0010sR\u0018\u0010t\u001a\u0004\u0018\u00010m8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0016\u0010vR\u0016\u0010x\u001a\u00020w8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bx\u0010y¨\u0006}"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/stripe/android/stripe3ds2/views/ChallengeZoneTextView;", "challengeZoneTextView", "Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;", "challengeZoneSelectView", "Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView;", "challengeZoneWebView", "Lm0/i;", "configure", "(Lcom/stripe/android/stripe3ds2/views/ChallengeZoneTextView;Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView;)V", "updateBrandZoneImages", "()V", "configureInformationZoneView", "configureChallengeZoneView", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult;", "result", "onChallengeRequestResult", "(Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult;)V", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;", "creqData", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;", "cresData", "onSuccess", "(Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;)V", "Lcom/stripe/android/stripe3ds2/transactions/ErrorData;", "data", "onError", "(Lcom/stripe/android/stripe3ds2/transactions/ErrorData;)V", "onTimeout", "", "throwable", "(Ljava/lang/Throwable;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "", "index", "selectChallengeOption", "(I)V", "refreshUi", "clickSubmitButton", "", "Landroid/widget/CheckBox;", "getCheckboxesOrdered", "()[Landroid/widget/CheckBox;", "Landroid/webkit/WebView;", "getWebView", "()Landroid/webkit/WebView;", "Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;", "uiCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;", "Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;", "transactionTimer", "Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;", "Lcom/stripe/android/stripe3ds2/views/ChallengeEntryViewFactory;", "challengeEntryViewFactory$delegate", "Lm0/c;", "getChallengeEntryViewFactory", "()Lcom/stripe/android/stripe3ds2/views/ChallengeEntryViewFactory;", "challengeEntryViewFactory", "challengeZoneTextView$delegate", "getChallengeZoneTextView$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneTextView;", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "sdkTransactionId", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;", "errorRequestExecutor", "Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;", "challengeActionHandler", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;", "challengeZoneWebView$delegate", "getChallengeZoneWebView$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView;", "", "getUserEntry$3ds2sdk_release", "()Ljava/lang/String;", "userEntry", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "Lcom/stripe/android/stripe3ds2/views/BrandZoneView;", "brandZoneView$delegate", "getBrandZoneView", "()Lcom/stripe/android/stripe3ds2/views/BrandZoneView;", "brandZoneView", "Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;", "viewModel$delegate", "getViewModel$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;", "viewModel", "Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;", "challengeZoneView$delegate", "getChallengeZoneView", "()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;", "challengeZoneView", "uiTypeCode$delegate", "getUiTypeCode", "uiTypeCode", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;", "getChallengeAction", "()Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;", "challengeAction", "Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeFragmentBinding;", "getViewBinding$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeFragmentBinding;", "viewBinding", "challengeZoneSelectView$delegate", "getChallengeZoneSelectView$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;", "_viewBinding", "Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeFragmentBinding;", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeStatusReceiver;", "challengeStatusReceiver", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeStatusReceiver;", "<init>", "(Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;Lcom/stripe/android/stripe3ds2/transaction/ChallengeStatusReceiver;Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;)V", "Companion", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ChallengeFragment.kt */
public final class ChallengeFragment extends Fragment {
    public static final String ARG_CRES = "arg_cres";
    public static final Companion Companion = new Companion((f) null);
    private StripeChallengeFragmentBinding _viewBinding;
    private final c brandZoneView$delegate = h.H2(new ChallengeFragment$brandZoneView$2(this));
    /* access modifiers changed from: private */
    public final ChallengeActionHandler challengeActionHandler;
    private final c challengeEntryViewFactory$delegate = h.H2(new ChallengeFragment$challengeEntryViewFactory$2(this));
    private final ChallengeStatusReceiver challengeStatusReceiver;
    private final c challengeZoneSelectView$delegate = h.H2(new ChallengeFragment$challengeZoneSelectView$2(this));
    private final c challengeZoneTextView$delegate = h.H2(new ChallengeFragment$challengeZoneTextView$2(this));
    private final c challengeZoneView$delegate = h.H2(new ChallengeFragment$challengeZoneView$2(this));
    private final c challengeZoneWebView$delegate = h.H2(new ChallengeFragment$challengeZoneWebView$2(this));
    /* access modifiers changed from: private */
    public ChallengeResponseData cresData;
    /* access modifiers changed from: private */
    public final ErrorReporter errorReporter;
    private final ErrorRequestExecutor errorRequestExecutor;
    private final SdkTransactionId sdkTransactionId;
    /* access modifiers changed from: private */
    public final TransactionTimer transactionTimer;
    /* access modifiers changed from: private */
    public final StripeUiCustomization uiCustomization;
    private final c uiTypeCode$delegate = h.H2(new ChallengeFragment$uiTypeCode$2(this));
    private final c viewModel$delegate = a.x(this, m.a(ChallengeActivityViewModel.class), new ChallengeFragment$$special$$inlined$activityViewModels$1(this), new ChallengeFragment$viewModel$2(this));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeFragment$Companion;", "", "", "ARG_CRES", "Ljava/lang/String;", "<init>", "()V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: ChallengeFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            ChallengeResponseData.UiType.values();
            int[] iArr = new int[5];
            $EnumSwitchMapping$0 = iArr;
            iArr[ChallengeResponseData.UiType.TEXT.ordinal()] = 1;
            iArr[ChallengeResponseData.UiType.SINGLE_SELECT.ordinal()] = 2;
            iArr[ChallengeResponseData.UiType.MULTI_SELECT.ordinal()] = 3;
            ChallengeResponseData.UiType uiType = ChallengeResponseData.UiType.HTML;
            iArr[uiType.ordinal()] = 4;
            ChallengeResponseData.UiType.values();
            int[] iArr2 = new int[5];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[ChallengeResponseData.UiType.OOB.ordinal()] = 1;
            iArr2[uiType.ordinal()] = 2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChallengeFragment(SdkTransactionId sdkTransactionId2, StripeUiCustomization stripeUiCustomization, TransactionTimer transactionTimer2, ChallengeStatusReceiver challengeStatusReceiver2, ErrorRequestExecutor errorRequestExecutor2, ErrorReporter errorReporter2, ChallengeActionHandler challengeActionHandler2) {
        super(R.layout.stripe_challenge_fragment);
        i.e(sdkTransactionId2, "sdkTransactionId");
        i.e(stripeUiCustomization, "uiCustomization");
        i.e(transactionTimer2, "transactionTimer");
        i.e(challengeStatusReceiver2, "challengeStatusReceiver");
        i.e(errorRequestExecutor2, "errorRequestExecutor");
        i.e(errorReporter2, "errorReporter");
        i.e(challengeActionHandler2, "challengeActionHandler");
        this.sdkTransactionId = sdkTransactionId2;
        this.uiCustomization = stripeUiCustomization;
        this.transactionTimer = transactionTimer2;
        this.challengeStatusReceiver = challengeStatusReceiver2;
        this.errorRequestExecutor = errorRequestExecutor2;
        this.errorReporter = errorReporter2;
        this.challengeActionHandler = challengeActionHandler2;
    }

    public static final /* synthetic */ ChallengeResponseData access$getCresData$p(ChallengeFragment challengeFragment) {
        ChallengeResponseData challengeResponseData = challengeFragment.cresData;
        if (challengeResponseData != null) {
            return challengeResponseData;
        }
        i.m("cresData");
        throw null;
    }

    private final void configure(ChallengeZoneTextView challengeZoneTextView, ChallengeZoneSelectView challengeZoneSelectView, ChallengeZoneWebView challengeZoneWebView) {
        if (challengeZoneTextView != null) {
            getChallengeZoneView().setChallengeEntryView(challengeZoneTextView);
            ChallengeZoneView challengeZoneView = getChallengeZoneView();
            ChallengeResponseData challengeResponseData = this.cresData;
            if (challengeResponseData != null) {
                challengeZoneView.setSubmitButton(challengeResponseData.getSubmitAuthenticationLabel(), this.uiCustomization.getButtonCustomization(UiCustomization.ButtonType.SUBMIT));
                ChallengeZoneView challengeZoneView2 = getChallengeZoneView();
                ChallengeResponseData challengeResponseData2 = this.cresData;
                if (challengeResponseData2 != null) {
                    challengeZoneView2.setResendButtonLabel(challengeResponseData2.getResendInformationLabel(), this.uiCustomization.getButtonCustomization(UiCustomization.ButtonType.RESEND));
                } else {
                    i.m("cresData");
                    throw null;
                }
            } else {
                i.m("cresData");
                throw null;
            }
        } else if (challengeZoneSelectView != null) {
            getChallengeZoneView().setChallengeEntryView(challengeZoneSelectView);
            ChallengeZoneView challengeZoneView3 = getChallengeZoneView();
            ChallengeResponseData challengeResponseData3 = this.cresData;
            if (challengeResponseData3 != null) {
                challengeZoneView3.setSubmitButton(challengeResponseData3.getSubmitAuthenticationLabel(), this.uiCustomization.getButtonCustomization(UiCustomization.ButtonType.NEXT));
                ChallengeZoneView challengeZoneView4 = getChallengeZoneView();
                ChallengeResponseData challengeResponseData4 = this.cresData;
                if (challengeResponseData4 != null) {
                    challengeZoneView4.setResendButtonLabel(challengeResponseData4.getResendInformationLabel(), this.uiCustomization.getButtonCustomization(UiCustomization.ButtonType.RESEND));
                } else {
                    i.m("cresData");
                    throw null;
                }
            } else {
                i.m("cresData");
                throw null;
            }
        } else if (challengeZoneWebView != null) {
            getChallengeZoneView().setChallengeEntryView(challengeZoneWebView);
            getChallengeZoneView().setInfoHeaderText((String) null, (LabelCustomization) null);
            getChallengeZoneView().setInfoText((String) null, (LabelCustomization) null);
            getChallengeZoneView().setSubmitButton((String) null, (ButtonCustomization) null);
            challengeZoneWebView.setOnClickListener(new ChallengeFragment$configure$1(this));
            getBrandZoneView().setVisibility(8);
        } else {
            ChallengeResponseData challengeResponseData5 = this.cresData;
            if (challengeResponseData5 == null) {
                i.m("cresData");
                throw null;
            } else if (challengeResponseData5.getUiType() == ChallengeResponseData.UiType.OOB) {
                ChallengeZoneView challengeZoneView5 = getChallengeZoneView();
                ChallengeResponseData challengeResponseData6 = this.cresData;
                if (challengeResponseData6 != null) {
                    challengeZoneView5.setSubmitButton(challengeResponseData6.getOobContinueLabel(), this.uiCustomization.getButtonCustomization(UiCustomization.ButtonType.CONTINUE));
                } else {
                    i.m("cresData");
                    throw null;
                }
            }
        }
        configureChallengeZoneView();
    }

    private final void configureChallengeZoneView() {
        ChallengeZoneView challengeZoneView = getChallengeZoneView();
        ChallengeResponseData challengeResponseData = this.cresData;
        if (challengeResponseData != null) {
            challengeZoneView.setInfoHeaderText(challengeResponseData.getChallengeInfoHeader(), this.uiCustomization.getLabelCustomization());
            ChallengeZoneView challengeZoneView2 = getChallengeZoneView();
            ChallengeResponseData challengeResponseData2 = this.cresData;
            if (challengeResponseData2 != null) {
                challengeZoneView2.setInfoText(challengeResponseData2.getChallengeInfoText(), this.uiCustomization.getLabelCustomization());
                ChallengeZoneView challengeZoneView3 = getChallengeZoneView();
                ChallengeResponseData challengeResponseData3 = this.cresData;
                if (challengeResponseData3 != null) {
                    challengeZoneView3.setInfoTextIndicator(challengeResponseData3.getShouldShowChallengeInfoTextIndicator() ? R.drawable.ic_indicator : 0);
                    ChallengeZoneView challengeZoneView4 = getChallengeZoneView();
                    ChallengeResponseData challengeResponseData4 = this.cresData;
                    if (challengeResponseData4 != null) {
                        challengeZoneView4.setWhitelistingLabel(challengeResponseData4.getWhitelistingInfoText(), this.uiCustomization.getLabelCustomization(), this.uiCustomization.getButtonCustomization(UiCustomization.ButtonType.SELECT));
                        getChallengeZoneView().setSubmitButtonClickListener(new ChallengeFragment$configureChallengeZoneView$1(this));
                        getChallengeZoneView().setResendButtonClickListener(new ChallengeFragment$configureChallengeZoneView$2(this));
                        return;
                    }
                    i.m("cresData");
                    throw null;
                }
                i.m("cresData");
                throw null;
            }
            i.m("cresData");
            throw null;
        }
        i.m("cresData");
        throw null;
    }

    private final void configureInformationZoneView() {
        InformationZoneView informationZoneView = getViewBinding$3ds2sdk_release().caInformationZone;
        i.d(informationZoneView, "viewBinding.caInformationZone");
        ChallengeResponseData challengeResponseData = this.cresData;
        if (challengeResponseData != null) {
            String whyInfoLabel = challengeResponseData.getWhyInfoLabel();
            ChallengeResponseData challengeResponseData2 = this.cresData;
            if (challengeResponseData2 != null) {
                informationZoneView.setWhyInfo(whyInfoLabel, challengeResponseData2.getWhyInfoText(), this.uiCustomization.getLabelCustomization());
                ChallengeResponseData challengeResponseData3 = this.cresData;
                if (challengeResponseData3 != null) {
                    String expandInfoLabel = challengeResponseData3.getExpandInfoLabel();
                    ChallengeResponseData challengeResponseData4 = this.cresData;
                    if (challengeResponseData4 != null) {
                        informationZoneView.setExpandInfo(expandInfoLabel, challengeResponseData4.getExpandInfoText(), this.uiCustomization.getLabelCustomization());
                        String accentColor = this.uiCustomization.getAccentColor();
                        if (accentColor != null) {
                            informationZoneView.setToggleColor$3ds2sdk_release(Color.parseColor(accentColor));
                            return;
                        }
                        return;
                    }
                    i.m("cresData");
                    throw null;
                }
                i.m("cresData");
                throw null;
            }
            i.m("cresData");
            throw null;
        }
        i.m("cresData");
        throw null;
    }

    private final BrandZoneView getBrandZoneView() {
        return (BrandZoneView) this.brandZoneView$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final ChallengeAction getChallengeAction() {
        ChallengeResponseData challengeResponseData = this.cresData;
        if (challengeResponseData != null) {
            ChallengeResponseData.UiType uiType = challengeResponseData.getUiType();
            if (uiType != null) {
                int ordinal = uiType.ordinal();
                if (ordinal == 3) {
                    return ChallengeAction.Oob.INSTANCE;
                }
                if (ordinal == 4) {
                    return new ChallengeAction.HtmlForm(getUserEntry$3ds2sdk_release());
                }
            }
            return new ChallengeAction.NativeForm(getUserEntry$3ds2sdk_release());
        }
        i.m("cresData");
        throw null;
    }

    /* access modifiers changed from: private */
    public final ChallengeEntryViewFactory getChallengeEntryViewFactory() {
        return (ChallengeEntryViewFactory) this.challengeEntryViewFactory$delegate.getValue();
    }

    private final ChallengeZoneView getChallengeZoneView() {
        return (ChallengeZoneView) this.challengeZoneView$delegate.getValue();
    }

    private final String getUiTypeCode() {
        return (String) this.uiTypeCode$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final void onChallengeRequestResult(ChallengeRequestResult challengeRequestResult) {
        if (challengeRequestResult instanceof ChallengeRequestResult.Success) {
            ChallengeRequestResult.Success success = (ChallengeRequestResult.Success) challengeRequestResult;
            onSuccess(success.getCreqData(), success.getCresData());
        } else if (challengeRequestResult instanceof ChallengeRequestResult.ProtocolError) {
            onError(((ChallengeRequestResult.ProtocolError) challengeRequestResult).getData());
        } else if (challengeRequestResult instanceof ChallengeRequestResult.RuntimeError) {
            onError(((ChallengeRequestResult.RuntimeError) challengeRequestResult).getThrowable());
        } else if (challengeRequestResult instanceof ChallengeRequestResult.Timeout) {
            onTimeout(((ChallengeRequestResult.Timeout) challengeRequestResult).getData());
        }
    }

    private final void onError(ErrorData errorData) {
        getViewModel$3ds2sdk_release().onFinish();
        this.challengeStatusReceiver.protocolError(new ProtocolErrorEventFactory().create(errorData));
        getViewModel$3ds2sdk_release().stopTimer();
        this.errorRequestExecutor.executeAsync(errorData);
    }

    private final void onSuccess(ChallengeRequestData challengeRequestData, ChallengeResponseData challengeResponseData) {
        ChallengeFlowOutcome challengeFlowOutcome;
        if (challengeResponseData.isChallengeCompleted()) {
            getViewModel$3ds2sdk_release().stopTimer();
            getViewModel$3ds2sdk_release().onFinish();
            if (challengeRequestData.getCancelReason() != null) {
                this.challengeStatusReceiver.cancelled(getUiTypeCode());
                return;
            }
            String transStatus = challengeResponseData.getTransStatus();
            if (transStatus == null) {
                transStatus = "";
            }
            if (i.a("Y", transStatus)) {
                challengeFlowOutcome = ChallengeFlowOutcome.CompleteSuccessful;
            } else {
                challengeFlowOutcome = ChallengeFlowOutcome.CompleteUnsuccessful;
            }
            this.challengeStatusReceiver.completed(new CompletionEvent(this.sdkTransactionId, transStatus), getUiTypeCode(), challengeFlowOutcome);
            return;
        }
        getViewModel$3ds2sdk_release().onNextScreen(challengeResponseData);
    }

    private final void onTimeout(ErrorData errorData) {
        getViewModel$3ds2sdk_release().stopTimer();
        this.errorRequestExecutor.executeAsync(errorData);
        getViewModel$3ds2sdk_release().onFinish();
        this.challengeStatusReceiver.runtimeError(new RuntimeErrorEvent(errorData));
    }

    private final void updateBrandZoneImages() {
        BrandZoneView brandZoneView = getViewBinding$3ds2sdk_release().caBrandZone;
        i.d(brandZoneView, "viewBinding.caBrandZone");
        Pair[] pairArr = new Pair[2];
        ImageView issuerImageView$3ds2sdk_release = brandZoneView.getIssuerImageView$3ds2sdk_release();
        ChallengeResponseData challengeResponseData = this.cresData;
        if (challengeResponseData != null) {
            pairArr[0] = new Pair(issuerImageView$3ds2sdk_release, challengeResponseData.getIssuerImage());
            ImageView paymentSystemImageView$3ds2sdk_release = brandZoneView.getPaymentSystemImageView$3ds2sdk_release();
            ChallengeResponseData challengeResponseData2 = this.cresData;
            if (challengeResponseData2 != null) {
                pairArr[1] = new Pair(paymentSystemImageView$3ds2sdk_release, challengeResponseData2.getPaymentSystemImage());
                for (Map.Entry entry : g.N(pairArr).entrySet()) {
                    getViewModel$3ds2sdk_release().getImage((ChallengeResponseData.Image) entry.getValue()).observe(getViewLifecycleOwner(), new ChallengeFragment$updateBrandZoneImages$1$1((ImageView) entry.getKey()));
                }
                return;
            }
            i.m("cresData");
            throw null;
        }
        i.m("cresData");
        throw null;
    }

    public final void clickSubmitButton() {
        getViewModel$3ds2sdk_release().submit(getChallengeAction());
    }

    public final ChallengeZoneSelectView getChallengeZoneSelectView$3ds2sdk_release() {
        return (ChallengeZoneSelectView) this.challengeZoneSelectView$delegate.getValue();
    }

    public final ChallengeZoneTextView getChallengeZoneTextView$3ds2sdk_release() {
        return (ChallengeZoneTextView) this.challengeZoneTextView$delegate.getValue();
    }

    public final ChallengeZoneWebView getChallengeZoneWebView$3ds2sdk_release() {
        return (ChallengeZoneWebView) this.challengeZoneWebView$delegate.getValue();
    }

    public final CheckBox[] getCheckboxesOrdered() {
        List<CheckBox> checkBoxes;
        ChallengeZoneSelectView challengeZoneSelectView$3ds2sdk_release = getChallengeZoneSelectView$3ds2sdk_release();
        if (challengeZoneSelectView$3ds2sdk_release == null || (checkBoxes = challengeZoneSelectView$3ds2sdk_release.getCheckBoxes()) == null) {
            return null;
        }
        Object[] array = checkBoxes.toArray(new CheckBox[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return (CheckBox[]) array;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getUserEntry$3ds2sdk_release() {
        /*
            r4 = this;
            com.stripe.android.stripe3ds2.transactions.ChallengeResponseData r0 = r4.cresData
            r1 = 0
            if (r0 == 0) goto L_0x0043
            com.stripe.android.stripe3ds2.transactions.ChallengeResponseData$UiType r0 = r0.getUiType()
            java.lang.String r2 = ""
            if (r0 != 0) goto L_0x000e
            goto L_0x001d
        L_0x000e:
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x0035
            r3 = 1
            if (r0 == r3) goto L_0x002a
            r3 = 2
            if (r0 == r3) goto L_0x002a
            r3 = 4
            if (r0 == r3) goto L_0x001f
        L_0x001d:
            r1 = r2
            goto L_0x003f
        L_0x001f:
            com.stripe.android.stripe3ds2.views.ChallengeZoneWebView r0 = r4.getChallengeZoneWebView$3ds2sdk_release()
            if (r0 == 0) goto L_0x003f
            java.lang.String r1 = r0.getUserEntry()
            goto L_0x003f
        L_0x002a:
            com.stripe.android.stripe3ds2.views.ChallengeZoneSelectView r0 = r4.getChallengeZoneSelectView$3ds2sdk_release()
            if (r0 == 0) goto L_0x003f
            java.lang.String r1 = r0.getUserEntry()
            goto L_0x003f
        L_0x0035:
            com.stripe.android.stripe3ds2.views.ChallengeZoneTextView r0 = r4.getChallengeZoneTextView$3ds2sdk_release()
            if (r0 == 0) goto L_0x003f
            java.lang.String r1 = r0.getUserEntry()
        L_0x003f:
            if (r1 == 0) goto L_0x0042
            r2 = r1
        L_0x0042:
            return r2
        L_0x0043:
            java.lang.String r0 = "cresData"
            m0.n.b.i.m(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.views.ChallengeFragment.getUserEntry$3ds2sdk_release():java.lang.String");
    }

    public final StripeChallengeFragmentBinding getViewBinding$3ds2sdk_release() {
        StripeChallengeFragmentBinding stripeChallengeFragmentBinding = this._viewBinding;
        if (stripeChallengeFragmentBinding != null) {
            return stripeChallengeFragmentBinding;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final ChallengeActivityViewModel getViewModel$3ds2sdk_release() {
        return (ChallengeActivityViewModel) this.viewModel$delegate.getValue();
    }

    public final WebView getWebView() {
        ChallengeZoneWebView challengeZoneWebView$3ds2sdk_release = getChallengeZoneWebView$3ds2sdk_release();
        if (challengeZoneWebView$3ds2sdk_release != null) {
            return challengeZoneWebView$3ds2sdk_release.getWebView();
        }
        return null;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this._viewBinding = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        i.e(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        ChallengeResponseData challengeResponseData = arguments != null ? (ChallengeResponseData) arguments.getParcelable(ARG_CRES) : null;
        if (challengeResponseData == null) {
            onError((Throwable) new IllegalArgumentException("Could not start challenge screen. Challenge response data was null."));
            getViewModel$3ds2sdk_release().onFinish();
            return;
        }
        this.cresData = challengeResponseData;
        this._viewBinding = StripeChallengeFragmentBinding.bind(view);
        getViewModel$3ds2sdk_release().getChallengeText().observe(getViewLifecycleOwner(), new ChallengeFragment$onViewCreated$1(this));
        getViewModel$3ds2sdk_release().getRefreshUi().observe(getViewLifecycleOwner(), new ChallengeFragment$onViewCreated$2(this));
        getViewModel$3ds2sdk_release().getChallengeRequestResult().observe(getViewLifecycleOwner(), new ChallengeFragment$onViewCreated$3(this));
        updateBrandZoneImages();
        configure(getChallengeZoneTextView$3ds2sdk_release(), getChallengeZoneSelectView$3ds2sdk_release(), getChallengeZoneWebView$3ds2sdk_release());
        configureInformationZoneView();
    }

    public final void refreshUi() {
        ChallengeResponseData challengeResponseData = this.cresData;
        if (challengeResponseData != null) {
            boolean z = true;
            if (challengeResponseData.getUiType() == ChallengeResponseData.UiType.HTML) {
                ChallengeResponseData challengeResponseData2 = this.cresData;
                if (challengeResponseData2 != null) {
                    String acsHtmlRefresh = challengeResponseData2.getAcsHtmlRefresh();
                    if (!(acsHtmlRefresh == null || StringsKt__IndentKt.o(acsHtmlRefresh))) {
                        ChallengeZoneWebView challengeZoneWebView$3ds2sdk_release = getChallengeZoneWebView$3ds2sdk_release();
                        if (challengeZoneWebView$3ds2sdk_release != null) {
                            ChallengeResponseData challengeResponseData3 = this.cresData;
                            if (challengeResponseData3 != null) {
                                challengeZoneWebView$3ds2sdk_release.loadHtml(challengeResponseData3.getAcsHtmlRefresh());
                                return;
                            } else {
                                i.m("cresData");
                                throw null;
                            }
                        } else {
                            return;
                        }
                    }
                } else {
                    i.m("cresData");
                    throw null;
                }
            }
            ChallengeResponseData challengeResponseData4 = this.cresData;
            if (challengeResponseData4 == null) {
                i.m("cresData");
                throw null;
            } else if (challengeResponseData4.getUiType() == ChallengeResponseData.UiType.OOB) {
                ChallengeResponseData challengeResponseData5 = this.cresData;
                if (challengeResponseData5 != null) {
                    String challengeAdditionalInfoText = challengeResponseData5.getChallengeAdditionalInfoText();
                    if (challengeAdditionalInfoText != null && !StringsKt__IndentKt.o(challengeAdditionalInfoText)) {
                        z = false;
                    }
                    if (!z) {
                        ChallengeZoneView challengeZoneView = getChallengeZoneView();
                        ChallengeResponseData challengeResponseData6 = this.cresData;
                        if (challengeResponseData6 != null) {
                            challengeZoneView.setInfoText(challengeResponseData6.getChallengeAdditionalInfoText(), this.uiCustomization.getLabelCustomization());
                            getChallengeZoneView().setInfoTextIndicator(0);
                            return;
                        }
                        i.m("cresData");
                        throw null;
                    }
                    return;
                }
                i.m("cresData");
                throw null;
            }
        } else {
            i.m("cresData");
            throw null;
        }
    }

    public final void selectChallengeOption(int i) {
        ChallengeZoneSelectView challengeZoneSelectView$3ds2sdk_release = getChallengeZoneSelectView$3ds2sdk_release();
        if (challengeZoneSelectView$3ds2sdk_release != null) {
            challengeZoneSelectView$3ds2sdk_release.selectOption(i);
        }
    }

    private final void onError(Throwable th) {
        getViewModel$3ds2sdk_release().onFinish();
        this.challengeStatusReceiver.runtimeError(new RuntimeErrorEvent(th));
    }
}
