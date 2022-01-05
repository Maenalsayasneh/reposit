package com.stripe.android.stripe3ds2.views;

import android.app.Application;
import android.content.res.Resources;
import android.graphics.Bitmap;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.LiveData;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.transaction.ChallengeAction;
import com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestResult;
import com.stripe.android.stripe3ds2.transaction.TransactionTimer;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseData;
import com.stripe.android.stripe3ds2.utils.ImageCache;
import g0.a.b.b.a;
import h0.q.b;
import h0.q.k0;
import h0.q.m0;
import h0.q.y;
import i0.j.f.p.h;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;
import m0.i;
import m0.l.c;
import m0.l.e;
import m0.n.a.p;
import m0.n.b.f;
import n0.a.f0;
import n0.a.f1;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0002YZB9\u0012\u0006\u0010R\u001a\u00020Q\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010G\u001a\u00020F\u0012\u0006\u0010T\u001a\u00020S\u0012\b\b\u0002\u0010M\u001a\u00020L\u0012\u0006\u0010V\u001a\u00020U¢\u0006\u0004\bW\u0010XJ\u0015\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0011J\r\u0010\u0013\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u000fJ\r\u0010\u0016\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0011J\u0015\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eR\u001f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0005R\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000b0\"8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\r0\"8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010$R\u001f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00170\u00028\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\u0005R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001f\u0010+\u001a\b\u0012\u0004\u0012\u00020\r0\u00028\u0006@\u0006¢\u0006\f\n\u0004\b+\u0010 \u001a\u0004\b,\u0010\u0005R\u001f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u00028\u0006@\u0006¢\u0006\f\n\u0004\b.\u0010 \u001a\u0004\b/\u0010\u0005R\u001c\u00101\u001a\b\u0012\u0004\u0012\u00020-008\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001c\u00103\u001a\b\u0012\u0004\u0012\u00020\u001b008\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u00102R\u0016\u00105\u001a\u0002048\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b5\u00106R\"\u00107\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001c\u0010>\u001a\u00020=8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001c\u0010B\u001a\b\u0012\u0004\u0012\u00020\r0\"8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bB\u0010$R\u001c\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00170\"8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bC\u0010$R\u001f\u0010D\u001a\b\u0012\u0004\u0012\u00020\r0\u00028\u0006@\u0006¢\u0006\f\n\u0004\bD\u0010 \u001a\u0004\bE\u0010\u0005R\u0016\u0010G\u001a\u00020F8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010J\u001a\u00020I8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010M\u001a\u00020L8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u001f\u0010O\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00028\u0006@\u0006¢\u0006\f\n\u0004\bO\u0010 \u001a\u0004\bP\u0010\u0005¨\u0006["}, d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;", "Lh0/q/b;", "Landroidx/lifecycle/LiveData;", "", "getTimeout", "()Landroidx/lifecycle/LiveData;", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;", "imageData", "Landroid/graphics/Bitmap;", "getImage", "(Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;)Landroidx/lifecycle/LiveData;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;", "action", "Lm0/i;", "submit", "(Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;)V", "stopTimer", "()V", "onMemoryEvent", "onRefreshUi", "challengeAction", "onSubmitClicked", "onFinish", "", "text", "updateChallengeText", "(Ljava/lang/String;)V", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;", "cres", "onNextScreen", "(Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;)V", "nextScreen", "Landroidx/lifecycle/LiveData;", "getNextScreen", "Lh0/q/y;", "_submitClicked", "Lh0/q/y;", "_refreshUi", "challengeText", "getChallengeText", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;", "challengeActionHandler", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;", "shouldFinish", "getShouldFinish", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult;", "challengeRequestResult", "getChallengeRequestResult", "Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel$OnInactiveAwareMutableLiveData;", "_challengeRequestResult", "Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel$OnInactiveAwareMutableLiveData;", "_nextScreen", "", "densityDpi", "I", "shouldRefreshUi", "Z", "getShouldRefreshUi", "()Z", "setShouldRefreshUi", "(Z)V", "Ln0/a/f1;", "transactionTimerJob", "Ln0/a/f1;", "getTransactionTimerJob$3ds2sdk_release", "()Ln0/a/f1;", "_shouldFinish", "_challengeText", "refreshUi", "getRefreshUi", "Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;", "transactionTimer", "Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;", "Lcom/stripe/android/stripe3ds2/views/ImageRepository;", "imageRepository", "Lcom/stripe/android/stripe3ds2/views/ImageRepository;", "Lcom/stripe/android/stripe3ds2/utils/ImageCache;", "imageCache", "Lcom/stripe/android/stripe3ds2/utils/ImageCache;", "submitClicked", "getSubmitClicked", "Landroid/app/Application;", "application", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "errorReporter", "Lm0/l/e;", "workContext", "<init>", "(Landroid/app/Application;Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lcom/stripe/android/stripe3ds2/utils/ImageCache;Lm0/l/e;)V", "Factory", "OnInactiveAwareMutableLiveData", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ChallengeActivityViewModel.kt */
public final class ChallengeActivityViewModel extends b {
    /* access modifiers changed from: private */
    public final OnInactiveAwareMutableLiveData<ChallengeRequestResult> _challengeRequestResult;
    private final y<String> _challengeText;
    private final OnInactiveAwareMutableLiveData<ChallengeResponseData> _nextScreen;
    private final y<i> _refreshUi;
    private final y<i> _shouldFinish;
    private final y<ChallengeAction> _submitClicked;
    /* access modifiers changed from: private */
    public final ChallengeActionHandler challengeActionHandler;
    private final LiveData<ChallengeRequestResult> challengeRequestResult;
    private final LiveData<String> challengeText;
    /* access modifiers changed from: private */
    public final int densityDpi;
    private final ImageCache imageCache;
    /* access modifiers changed from: private */
    public final ImageRepository imageRepository;
    private final LiveData<ChallengeResponseData> nextScreen;
    private final LiveData<i> refreshUi;
    private final LiveData<i> shouldFinish;
    private boolean shouldRefreshUi;
    private final LiveData<ChallengeAction> submitClicked;
    /* access modifiers changed from: private */
    public final TransactionTimer transactionTimer;
    private final f1 transactionTimerJob;

    @m0.l.f.a.c(c = "com.stripe.android.stripe3ds2.views.ChallengeActivityViewModel$1", f = "ChallengeActivityViewModel.kt", l = {58}, m = "invokeSuspend")
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln0/a/f0;", "Lm0/i;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
    /* renamed from: com.stripe.android.stripe3ds2.views.ChallengeActivityViewModel$1  reason: invalid class name */
    /* compiled from: ChallengeActivityViewModel.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements p<f0, c<? super i>, Object> {
        public int label;
        public final /* synthetic */ ChallengeActivityViewModel this$0;

        {
            this.this$0 = r1;
        }

        public final c<i> create(Object obj, c<?> cVar) {
            m0.n.b.i.e(cVar, "completion");
            return new AnonymousClass1(this.this$0, cVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create(obj, (c) obj2)).invokeSuspend(i.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                h.d4(obj);
                TransactionTimer access$getTransactionTimer$p = this.this$0.transactionTimer;
                this.label = 1;
                if (access$getTransactionTimer$p.start(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i == 1) {
                h.d4(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return i.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u0006\u001a\u00028\u0000\"\n\b\u0000\u0010\u0003*\u0004\u0018\u00010\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel$Factory;", "Lh0/q/m0$b;", "Lh0/q/k0;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Lh0/q/k0;", "Landroid/app/Application;", "application", "Landroid/app/Application;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;", "challengeActionHandler", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;", "transactionTimer", "Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;", "Lm0/l/e;", "workContext", "Lm0/l/e;", "<init>", "(Landroid/app/Application;Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lm0/l/e;)V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: ChallengeActivityViewModel.kt */
    public static final class Factory implements m0.b {
        private final Application application;
        private final ChallengeActionHandler challengeActionHandler;
        private final ErrorReporter errorReporter;
        private final TransactionTimer transactionTimer;
        private final e workContext;

        public Factory(Application application2, ChallengeActionHandler challengeActionHandler2, TransactionTimer transactionTimer2, ErrorReporter errorReporter2, e eVar) {
            m0.n.b.i.e(application2, "application");
            m0.n.b.i.e(challengeActionHandler2, "challengeActionHandler");
            m0.n.b.i.e(transactionTimer2, "transactionTimer");
            m0.n.b.i.e(errorReporter2, "errorReporter");
            m0.n.b.i.e(eVar, "workContext");
            this.application = application2;
            this.challengeActionHandler = challengeActionHandler2;
            this.transactionTimer = transactionTimer2;
            this.errorReporter = errorReporter2;
            this.workContext = eVar;
        }

        public <T extends k0> T create(Class<T> cls) {
            m0.n.b.i.e(cls, "modelClass");
            return new ChallengeActivityViewModel(this.application, this.challengeActionHandler, this.transactionTimer, this.errorReporter, (ImageCache) null, this.workContext, 16, (f) null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0006\u0010\u0005J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel$OnInactiveAwareMutableLiveData;", "T", "Lh0/q/y;", "Lm0/i;", "onInactive", "()V", "<init>", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: ChallengeActivityViewModel.kt */
    public static final class OnInactiveAwareMutableLiveData<T> extends y<T> {
        public void onInactive() {
            super.onInactive();
            setValue(null);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ChallengeActivityViewModel(Application application, ChallengeActionHandler challengeActionHandler2, TransactionTimer transactionTimer2, ErrorReporter errorReporter, ImageCache imageCache2, e eVar, int i, f fVar) {
        this(application, challengeActionHandler2, transactionTimer2, errorReporter, (i & 16) != 0 ? ImageCache.Default.INSTANCE : imageCache2, eVar);
    }

    public final LiveData<ChallengeRequestResult> getChallengeRequestResult() {
        return this.challengeRequestResult;
    }

    public final LiveData<String> getChallengeText() {
        return this.challengeText;
    }

    public final LiveData<Bitmap> getImage(ChallengeResponseData.Image image) {
        return a.a0((e) null, 0, new ChallengeActivityViewModel$getImage$1(this, image, (c) null), 3);
    }

    public final LiveData<ChallengeResponseData> getNextScreen() {
        return this.nextScreen;
    }

    public final LiveData<i> getRefreshUi() {
        return this.refreshUi;
    }

    public final LiveData<i> getShouldFinish() {
        return this.shouldFinish;
    }

    public final boolean getShouldRefreshUi() {
        return this.shouldRefreshUi;
    }

    public final LiveData<ChallengeAction> getSubmitClicked() {
        return this.submitClicked;
    }

    public final LiveData<Boolean> getTimeout() {
        return a.a0((e) null, 0, new ChallengeActivityViewModel$getTimeout$1(this, (c) null), 3);
    }

    public final f1 getTransactionTimerJob$3ds2sdk_release() {
        return this.transactionTimerJob;
    }

    public final void onFinish() {
        this._shouldFinish.postValue(i.a);
    }

    public final void onMemoryEvent() {
        this.imageCache.clear();
    }

    public final void onNextScreen(ChallengeResponseData challengeResponseData) {
        m0.n.b.i.e(challengeResponseData, "cres");
        this._nextScreen.setValue(challengeResponseData);
    }

    public final void onRefreshUi() {
        this._refreshUi.setValue(i.a);
    }

    public final void onSubmitClicked(ChallengeAction challengeAction) {
        m0.n.b.i.e(challengeAction, "challengeAction");
        this._submitClicked.setValue(challengeAction);
    }

    public final void setShouldRefreshUi(boolean z) {
        this.shouldRefreshUi = z;
    }

    public final void stopTimer() {
        m0.r.t.a.r.m.a1.a.o0(this.transactionTimerJob, (CancellationException) null, 1, (Object) null);
    }

    public final void submit(ChallengeAction challengeAction) {
        m0.n.b.i.e(challengeAction, "action");
        m0.r.t.a.r.m.a1.a.E2(a.T(this), (e) null, (CoroutineStart) null, new ChallengeActivityViewModel$submit$1(this, challengeAction, (c) null), 3, (Object) null);
    }

    public final void updateChallengeText(String str) {
        m0.n.b.i.e(str, NotificationCompat.MessagingStyle.Message.KEY_TEXT);
        this._challengeText.setValue(str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChallengeActivityViewModel(Application application, ChallengeActionHandler challengeActionHandler2, TransactionTimer transactionTimer2, ErrorReporter errorReporter, ImageCache imageCache2, e eVar) {
        super(application);
        m0.n.b.i.e(application, "application");
        m0.n.b.i.e(challengeActionHandler2, "challengeActionHandler");
        m0.n.b.i.e(transactionTimer2, "transactionTimer");
        m0.n.b.i.e(errorReporter, "errorReporter");
        m0.n.b.i.e(imageCache2, "imageCache");
        m0.n.b.i.e(eVar, "workContext");
        this.challengeActionHandler = challengeActionHandler2;
        this.transactionTimer = transactionTimer2;
        this.imageCache = imageCache2;
        Resources resources = application.getResources();
        m0.n.b.i.d(resources, "application.resources");
        this.densityDpi = resources.getDisplayMetrics().densityDpi;
        this.imageRepository = new ImageRepository(errorReporter, eVar);
        y<i> yVar = new y<>();
        this._refreshUi = yVar;
        this.refreshUi = yVar;
        y<ChallengeAction> yVar2 = new y<>();
        this._submitClicked = yVar2;
        this.submitClicked = yVar2;
        y<i> yVar3 = new y<>();
        this._shouldFinish = yVar3;
        this.shouldFinish = yVar3;
        y<String> yVar4 = new y<>();
        this._challengeText = yVar4;
        this.challengeText = yVar4;
        OnInactiveAwareMutableLiveData<ChallengeRequestResult> onInactiveAwareMutableLiveData = new OnInactiveAwareMutableLiveData<>();
        this._challengeRequestResult = onInactiveAwareMutableLiveData;
        this.challengeRequestResult = onInactiveAwareMutableLiveData;
        OnInactiveAwareMutableLiveData<ChallengeResponseData> onInactiveAwareMutableLiveData2 = new OnInactiveAwareMutableLiveData<>();
        this._nextScreen = onInactiveAwareMutableLiveData2;
        this.nextScreen = onInactiveAwareMutableLiveData2;
        this.transactionTimerJob = m0.r.t.a.r.m.a1.a.E2(a.T(this), (e) null, (CoroutineStart) null, new AnonymousClass1(this, (c) null), 3, (Object) null);
    }
}
