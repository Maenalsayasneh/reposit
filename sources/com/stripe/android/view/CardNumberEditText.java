package com.stripe.android.view;

import android.content.Context;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.R;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.stripe.android.Logger;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.cards.CardAccountRangeRepository;
import com.stripe.android.cards.CardNumber;
import com.stripe.android.cards.DefaultCardAccountRangeRepositoryFactory;
import com.stripe.android.cards.DefaultStaticCardAccountRanges;
import com.stripe.android.cards.StaticCardAccountRanges;
import com.stripe.android.model.AccountRange;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.Token;
import com.stripe.android.networking.AnalyticsEvent;
import com.stripe.android.networking.AnalyticsRequestExecutor;
import com.stripe.android.networking.AnalyticsRequestFactory;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineStart;
import m0.i;
import m0.l.c;
import m0.l.e;
import m0.n.a.a;
import m0.n.a.l;
import m0.n.b.f;
import n0.a.f1;
import n0.a.m0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001BQ\b\u0000\u0012\u0006\u0010v\u001a\u00020u\u0012\n\b\u0002\u0010x\u001a\u0004\u0018\u00010w\u0012\b\b\u0002\u0010y\u001a\u00020\f\u0012\u0006\u0010X\u001a\u00020W\u0012\u0006\u0010L\u001a\u00020K\u0012\b\b\u0002\u0010O\u001a\u00020N\u0012\u0006\u0010A\u001a\u00020@\u0012\u0006\u0010R\u001a\u00020Q¢\u0006\u0004\bz\u0010{B'\b\u0017\u0012\u0006\u0010v\u001a\u00020u\u0012\n\b\u0002\u0010x\u001a\u0004\u0018\u00010w\u0012\b\b\u0002\u0010y\u001a\u00020\f¢\u0006\u0004\bz\u0010|B9\b\u0012\u0012\u0006\u0010v\u001a\u00020u\u0012\b\u0010x\u001a\u0004\u0018\u00010w\u0012\u0006\u0010y\u001a\u00020\f\u0012\u0006\u0010X\u001a\u00020W\u0012\f\u0010}\u001a\b\u0012\u0004\u0012\u00020^0C¢\u0006\u0004\bz\u0010~J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u0019\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ1\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001f\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010!\u001a\u00020\u0002H\u0000¢\u0006\u0004\b \u0010\u0004R(\u0010#\u001a\u0004\u0018\u00010\u001b2\b\u0010\"\u001a\u0004\u0018\u00010\u001b8\u0002@BX\u000e¢\u0006\f\n\u0004\b#\u0010$\"\u0004\b%\u0010\u001eR*\u0010'\u001a\u0004\u0018\u00010&8\u0000@\u0000X\u000e¢\u0006\u0018\n\u0004\b'\u0010(\u0012\u0004\b-\u0010\u0004\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R.\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020.8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0016\u0010\u0014\u001a\u00020\f8@@\u0000X\u0004¢\u0006\u0006\u001a\u0004\b5\u00106RB\u00109\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\u00020.2\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\u00020.8\u0000@@X\u000e¢\u0006\u0012\n\u0004\b9\u00100\u001a\u0004\b:\u00102\"\u0004\b;\u00104R$\u0010=\u001a\u00020\u00072\u0006\u0010<\u001a\u00020\u00078\u0006@BX\u000e¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b=\u0010?R\u0016\u0010A\u001a\u00020@8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bA\u0010BR(\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00020C8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u0018\u0010J\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bJ\u0010(R\u0016\u0010L\u001a\u00020K8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010O\u001a\u00020N8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010R\u001a\u00020Q8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u001c\u0010V\u001a\u00020\f8F@\u0007X\u0004¢\u0006\f\u0012\u0004\bU\u0010\u0004\u001a\u0004\bT\u00106R\"\u0010X\u001a\u00020W8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\u0018\u0010a\u001a\u0004\u0018\u00010^8T@\u0014X\u0004¢\u0006\u0006\u001a\u0004\b_\u0010`R\u0016\u0010c\u001a\u00020\f8B@\u0002X\u0004¢\u0006\u0006\u001a\u0004\bb\u00106R\u0018\u0010g\u001a\u0004\u0018\u00010d8@@\u0000X\u0004¢\u0006\u0006\u001a\u0004\be\u0010fR\u0016\u0010h\u001a\u00020\u00078B@\u0002X\u0004¢\u0006\u0006\u001a\u0004\bh\u0010?R\u0016\u0010k\u001a\u00020\u00058B@\u0002X\u0004¢\u0006\u0006\u001a\u0004\bi\u0010jR\u001e\u0010\u0006\u001a\u0004\u0018\u00010^8F@\u0007X\u0004¢\u0006\f\u0012\u0004\bm\u0010\u0004\u001a\u0004\bl\u0010`R0\u0010n\u001a\u0002072\u0006\u0010\"\u001a\u0002078\u0006@@X\u000e¢\u0006\u0018\n\u0004\bn\u0010o\u0012\u0004\bt\u0010\u0004\u001a\u0004\bp\u0010q\"\u0004\br\u0010s¨\u0006\u0001"}, d2 = {"Lcom/stripe/android/view/CardNumberEditText;", "Lcom/stripe/android/view/StripeEditText;", "Lm0/i;", "cancelAccountRangeRepositoryJob", "()V", "Lcom/stripe/android/cards/CardNumber$Unvalidated;", "cardNumber", "", "shouldQueryAccountRange", "(Lcom/stripe/android/cards/CardNumber$Unvalidated;)Z", "onAttachedToWindow", "onDetachedFromWindow", "", "maxLength", "updateLengthFilter$payments_core_release", "(I)V", "updateLengthFilter", "newFormattedLength", "start", "addedDigits", "panLength", "calculateCursorPosition$payments_core_release", "(IIII)I", "calculateCursorPosition", "queryAccountRangeRepository$payments_core_release", "(Lcom/stripe/android/cards/CardNumber$Unvalidated;)V", "queryAccountRangeRepository", "Lcom/stripe/android/model/AccountRange;", "newAccountRange", "onAccountRangeResult$payments_core_release", "(Lcom/stripe/android/model/AccountRange;)V", "onAccountRangeResult", "onCardMetadataLoadedTooSlow$payments_core_release", "onCardMetadataLoadedTooSlow", "value", "accountRange", "Lcom/stripe/android/model/AccountRange;", "setAccountRange", "Ln0/a/f1;", "accountRangeRepositoryJob", "Ln0/a/f1;", "getAccountRangeRepositoryJob$payments_core_release", "()Ln0/a/f1;", "setAccountRangeRepositoryJob$payments_core_release", "(Ln0/a/f1;)V", "getAccountRangeRepositoryJob$payments_core_release$annotations", "Lkotlin/Function1;", "isLoadingCallback", "Lm0/n/a/l;", "isLoadingCallback$payments_core_release", "()Lm0/n/a/l;", "setLoadingCallback$payments_core_release", "(Lm0/n/a/l;)V", "getPanLength$payments_core_release", "()I", "Lcom/stripe/android/model/CardBrand;", "callback", "brandChangeCallback", "getBrandChangeCallback$payments_core_release", "setBrandChangeCallback$payments_core_release", "<set-?>", "isCardNumberValid", "Z", "()Z", "Lcom/stripe/android/networking/AnalyticsRequestExecutor;", "analyticsRequestExecutor", "Lcom/stripe/android/networking/AnalyticsRequestExecutor;", "Lkotlin/Function0;", "completionCallback", "Lm0/n/a/a;", "getCompletionCallback$payments_core_release", "()Lm0/n/a/a;", "setCompletionCallback$payments_core_release", "(Lm0/n/a/a;)V", "loadingJob", "Lcom/stripe/android/cards/CardAccountRangeRepository;", "cardAccountRangeRepository", "Lcom/stripe/android/cards/CardAccountRangeRepository;", "Lcom/stripe/android/cards/StaticCardAccountRanges;", "staticCardAccountRanges", "Lcom/stripe/android/cards/StaticCardAccountRanges;", "Lcom/stripe/android/networking/AnalyticsRequestFactory;", "analyticsRequestFactory", "Lcom/stripe/android/networking/AnalyticsRequestFactory;", "getLengthMax", "getLengthMax$annotations", "lengthMax", "Lm0/l/e;", "workContext", "Lm0/l/e;", "getWorkContext$payments_core_release", "()Lm0/l/e;", "setWorkContext$payments_core_release", "(Lm0/l/e;)V", "", "getAccessibilityText", "()Ljava/lang/String;", "accessibilityText", "getFormattedPanLength", "formattedPanLength", "Lcom/stripe/android/cards/CardNumber$Validated;", "getValidatedCardNumber$payments_core_release", "()Lcom/stripe/android/cards/CardNumber$Validated;", "validatedCardNumber", "isValid", "getUnvalidatedCardNumber", "()Lcom/stripe/android/cards/CardNumber$Unvalidated;", "unvalidatedCardNumber", "getCardNumber", "getCardNumber$annotations", "cardBrand", "Lcom/stripe/android/model/CardBrand;", "getCardBrand", "()Lcom/stripe/android/model/CardBrand;", "setCardBrand$payments_core_release", "(Lcom/stripe/android/model/CardBrand;)V", "getCardBrand$annotations", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;ILm0/l/e;Lcom/stripe/android/cards/CardAccountRangeRepository;Lcom/stripe/android/cards/StaticCardAccountRanges;Lcom/stripe/android/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/AnalyticsRequestFactory;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "publishableKeySupplier", "(Landroid/content/Context;Landroid/util/AttributeSet;ILm0/l/e;Lm0/n/a/a;)V", "CardNumberTextWatcher", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: CardNumberEditText.kt */
public final class CardNumberEditText extends StripeEditText {
    /* access modifiers changed from: private */
    public AccountRange accountRange;
    private f1 accountRangeRepositoryJob;
    private final AnalyticsRequestExecutor analyticsRequestExecutor;
    private final AnalyticsRequestFactory analyticsRequestFactory;
    private /* synthetic */ l<? super CardBrand, i> brandChangeCallback;
    /* access modifiers changed from: private */
    public final CardAccountRangeRepository cardAccountRangeRepository;
    private CardBrand cardBrand;
    private /* synthetic */ a<i> completionCallback;
    /* access modifiers changed from: private */
    public boolean isCardNumberValid;
    private /* synthetic */ l<? super Boolean, i> isLoadingCallback;
    private f1 loadingJob;
    /* access modifiers changed from: private */
    public final StaticCardAccountRanges staticCardAccountRanges;
    private e workContext;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b/\u00100J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\f\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0018\u001a\u00020\u00172\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J1\u0010\u001b\u001a\u00020\u00172\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u0019J\u0019\u0010\u001d\u001a\u00020\u00172\b\u0010\u0013\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010#R\u0016\u0010&\u001a\u00020\u00028B@\u0002X\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0016\u0010'\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b'\u0010 R\u0018\u0010(\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010.\u001a\u00020\u00028B@\u0002X\u0004¢\u0006\u0006\u001a\u0004\b-\u0010%¨\u00061"}, d2 = {"Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;", "Lcom/stripe/android/view/StripeTextWatcher;", "", "wasCardNumberValid", "isComplete", "(Z)Z", "", "startPosition", "previousCount", "currentCount", "Lcom/stripe/android/cards/CardNumber$Unvalidated;", "cardNumber", "isPastedPan", "(IIILcom/stripe/android/cards/CardNumber$Unvalidated;)Z", "Lcom/stripe/android/model/AccountRange;", "accountRange", "shouldQueryRepository", "(Lcom/stripe/android/model/AccountRange;)Z", "", "s", "start", "count", "after", "Lm0/i;", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "latestInsertionSize", "I", "beforeCardNumber", "Lcom/stripe/android/cards/CardNumber$Unvalidated;", "Z", "getDigitsAdded", "()Z", "digitsAdded", "latestChangeStart", "newCursorPosition", "Ljava/lang/Integer;", "", "formattedNumber", "Ljava/lang/String;", "getShouldUpdateAfterChange", "shouldUpdateAfterChange", "<init>", "(Lcom/stripe/android/view/CardNumberEditText;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: CardNumberEditText.kt */
    public final class CardNumberTextWatcher extends StripeTextWatcher {
        private CardNumber.Unvalidated beforeCardNumber;
        private String formattedNumber;
        private boolean isPastedPan;
        private int latestChangeStart;
        private int latestInsertionSize;
        private Integer newCursorPosition;

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                CardBrand.values();
                int[] iArr = new int[8];
                $EnumSwitchMapping$0 = iArr;
                iArr[CardBrand.Unknown.ordinal()] = 1;
                iArr[CardBrand.UnionPay.ordinal()] = 2;
            }
        }

        public CardNumberTextWatcher() {
            this.beforeCardNumber = CardNumberEditText.this.getUnvalidatedCardNumber();
        }

        private final boolean getDigitsAdded() {
            return CardNumberEditText.this.getUnvalidatedCardNumber().getLength() > this.beforeCardNumber.getLength();
        }

        private final boolean getShouldUpdateAfterChange() {
            return (getDigitsAdded() || !CardNumberEditText.this.isLastKeyDelete()) && this.formattedNumber != null;
        }

        private final boolean isComplete(boolean z) {
            return !z && (CardNumberEditText.this.getUnvalidatedCardNumber().isMaxLength() || (CardNumberEditText.this.isValid() && CardNumberEditText.this.accountRange != null));
        }

        private final boolean isPastedPan(int i, int i2, int i3, CardNumber.Unvalidated unvalidated) {
            return i3 > i2 && i == 0 && unvalidated.getNormalized().length() >= 14;
        }

        private final boolean shouldQueryRepository(AccountRange accountRange) {
            int ordinal = accountRange.getBrand().ordinal();
            return ordinal == 6 || ordinal == 7;
        }

        public void afterTextChanged(Editable editable) {
            if (getShouldUpdateAfterChange()) {
                CardNumberEditText.this.setTextSilent$payments_core_release(this.formattedNumber);
                Integer num = this.newCursorPosition;
                if (num != null) {
                    int intValue = num.intValue();
                    CardNumberEditText cardNumberEditText = CardNumberEditText.this;
                    cardNumberEditText.setSelection(m0.q.i.b(intValue, 0, cardNumberEditText.getFieldText$payments_core_release().length()));
                }
            }
            this.formattedNumber = null;
            this.newCursorPosition = null;
            if (CardNumberEditText.this.getUnvalidatedCardNumber().getLength() == CardNumberEditText.this.getPanLength$payments_core_release()) {
                boolean isCardNumberValid = CardNumberEditText.this.isCardNumberValid();
                CardNumberEditText cardNumberEditText2 = CardNumberEditText.this;
                cardNumberEditText2.isCardNumberValid = cardNumberEditText2.isValid();
                CardNumberEditText cardNumberEditText3 = CardNumberEditText.this;
                cardNumberEditText3.setShouldShowError(!cardNumberEditText3.isValid());
                if (CardNumberEditText.this.accountRange == null && CardNumberEditText.this.getUnvalidatedCardNumber().isValidLuhn()) {
                    CardNumberEditText.this.onCardMetadataLoadedTooSlow$payments_core_release();
                }
                if (isComplete(isCardNumberValid)) {
                    CardNumberEditText.this.getCompletionCallback$payments_core_release().invoke();
                }
            } else if (!CardNumberEditText.this.getUnvalidatedCardNumber().isPartialEntry$payments_core_release(CardNumberEditText.this.getPanLength$payments_core_release()) || CardNumberEditText.this.getUnvalidatedCardNumber().isPossibleCardBrand$payments_core_release()) {
                CardNumberEditText cardNumberEditText4 = CardNumberEditText.this;
                cardNumberEditText4.isCardNumberValid = cardNumberEditText4.isValid();
                CardNumberEditText.this.setShouldShowError(false);
            } else {
                CardNumberEditText cardNumberEditText5 = CardNumberEditText.this;
                cardNumberEditText5.isCardNumberValid = cardNumberEditText5.isValid();
                CardNumberEditText.this.setShouldShowError(true);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.isPastedPan = false;
            this.beforeCardNumber = CardNumberEditText.this.getUnvalidatedCardNumber();
            this.latestChangeStart = i;
            this.latestInsertionSize = i3;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v18, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: com.stripe.android.model.AccountRange} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onTextChanged(java.lang.CharSequence r5, int r6, int r7, int r8) {
            /*
                r4 = this;
                com.stripe.android.cards.CardNumber$Unvalidated r0 = new com.stripe.android.cards.CardNumber$Unvalidated
                r1 = 0
                if (r5 == 0) goto L_0x000a
                java.lang.String r5 = r5.toString()
                goto L_0x000b
            L_0x000a:
                r5 = r1
            L_0x000b:
                if (r5 == 0) goto L_0x000e
                goto L_0x0010
            L_0x000e:
                java.lang.String r5 = ""
            L_0x0010:
                r0.<init>(r5)
                com.stripe.android.view.CardNumberEditText r5 = com.stripe.android.view.CardNumberEditText.this
                com.stripe.android.cards.StaticCardAccountRanges r5 = r5.staticCardAccountRanges
                java.util.List r5 = r5.filter(r0)
                int r2 = r5.size()
                r3 = 1
                if (r2 != r3) goto L_0x002b
                java.lang.Object r5 = m0.j.g.u(r5)
                r1 = r5
                com.stripe.android.model.AccountRange r1 = (com.stripe.android.model.AccountRange) r1
            L_0x002b:
                if (r1 == 0) goto L_0x003a
                boolean r5 = r4.shouldQueryRepository(r1)
                if (r5 == 0) goto L_0x0034
                goto L_0x003a
            L_0x0034:
                com.stripe.android.view.CardNumberEditText r5 = com.stripe.android.view.CardNumberEditText.this
                r5.onAccountRangeResult$payments_core_release(r1)
                goto L_0x003f
            L_0x003a:
                com.stripe.android.view.CardNumberEditText r5 = com.stripe.android.view.CardNumberEditText.this
                r5.queryAccountRangeRepository$payments_core_release(r0)
            L_0x003f:
                boolean r5 = r4.isPastedPan(r6, r7, r8, r0)
                r4.isPastedPan = r5
                if (r5 == 0) goto L_0x0058
                com.stripe.android.view.CardNumberEditText r5 = com.stripe.android.view.CardNumberEditText.this
                int r6 = r0.getLength()
                java.lang.String r6 = r0.getFormatted(r6)
                int r6 = r6.length()
                r5.updateLengthFilter$payments_core_release(r6)
            L_0x0058:
                boolean r5 = r4.isPastedPan
                if (r5 == 0) goto L_0x0061
                int r5 = r0.getLength()
                goto L_0x0067
            L_0x0061:
                com.stripe.android.view.CardNumberEditText r5 = com.stripe.android.view.CardNumberEditText.this
                int r5 = r5.getPanLength$payments_core_release()
            L_0x0067:
                java.lang.String r6 = r0.getFormatted(r5)
                com.stripe.android.view.CardNumberEditText r7 = com.stripe.android.view.CardNumberEditText.this
                int r8 = r6.length()
                int r0 = r4.latestChangeStart
                int r1 = r4.latestInsertionSize
                int r5 = r7.calculateCursorPosition$payments_core_release(r8, r0, r1, r5)
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r4.newCursorPosition = r5
                r4.formattedNumber = r6
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.CardNumberEditText.CardNumberTextWatcher.onTextChanged(java.lang.CharSequence, int, int, int):void");
        }
    }

    public CardNumberEditText(Context context) {
        this(context, (AttributeSet) null, 0, 6, (f) null);
    }

    public CardNumberEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (f) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardNumberEditText(Context context, AttributeSet attributeSet, int i, e eVar, CardAccountRangeRepository cardAccountRangeRepository2, StaticCardAccountRanges staticCardAccountRanges2, AnalyticsRequestExecutor analyticsRequestExecutor2, AnalyticsRequestFactory analyticsRequestFactory2, int i2, f fVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.editTextStyle : i, eVar, cardAccountRangeRepository2, (i2 & 32) != 0 ? new DefaultStaticCardAccountRanges() : staticCardAccountRanges2, analyticsRequestExecutor2, analyticsRequestFactory2);
    }

    public static /* synthetic */ int calculateCursorPosition$payments_core_release$default(CardNumberEditText cardNumberEditText, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            i4 = cardNumberEditText.getPanLength$payments_core_release();
        }
        return cardNumberEditText.calculateCursorPosition$payments_core_release(i, i2, i3, i4);
    }

    private final void cancelAccountRangeRepositoryJob() {
        f1 f1Var = this.accountRangeRepositoryJob;
        if (f1Var != null) {
            m0.r.t.a.r.m.a1.a.o0(f1Var, (CancellationException) null, 1, (Object) null);
        }
        this.accountRangeRepositoryJob = null;
    }

    public static /* synthetic */ void getAccountRangeRepositoryJob$payments_core_release$annotations() {
    }

    public static /* synthetic */ void getCardBrand$annotations() {
    }

    public static /* synthetic */ void getCardNumber$annotations() {
    }

    private final int getFormattedPanLength() {
        return CardNumber.Companion.getSpacePositions$payments_core_release(getPanLength$payments_core_release()).size() + getPanLength$payments_core_release();
    }

    public static /* synthetic */ void getLengthMax$annotations() {
    }

    /* access modifiers changed from: private */
    public final CardNumber.Unvalidated getUnvalidatedCardNumber() {
        return new CardNumber.Unvalidated(getFieldText$payments_core_release());
    }

    /* access modifiers changed from: private */
    public final boolean isValid() {
        return getValidatedCardNumber$payments_core_release() != null;
    }

    /* access modifiers changed from: private */
    public final void setAccountRange(AccountRange accountRange2) {
        this.accountRange = accountRange2;
        updateLengthFilter$payments_core_release$default(this, 0, 1, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        r0 = (r0 = r1.accountRange).getBinRange();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean shouldQueryAccountRange(com.stripe.android.cards.CardNumber.Unvalidated r2) {
        /*
            r1 = this;
            com.stripe.android.model.AccountRange r0 = r1.accountRange
            if (r0 == 0) goto L_0x001d
            com.stripe.android.cards.Bin r0 = r2.getBin()
            if (r0 == 0) goto L_0x001d
            com.stripe.android.model.AccountRange r0 = r1.accountRange
            if (r0 == 0) goto L_0x001b
            com.stripe.android.model.BinRange r0 = r0.getBinRange()
            if (r0 == 0) goto L_0x001b
            boolean r2 = r0.matches$payments_core_release(r2)
            if (r2 != 0) goto L_0x001b
            goto L_0x001d
        L_0x001b:
            r2 = 0
            goto L_0x001e
        L_0x001d:
            r2 = 1
        L_0x001e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.CardNumberEditText.shouldQueryAccountRange(com.stripe.android.cards.CardNumber$Unvalidated):boolean");
    }

    public static /* synthetic */ void updateLengthFilter$payments_core_release$default(CardNumberEditText cardNumberEditText, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = cardNumberEditText.getFormattedPanLength();
        }
        cardNumberEditText.updateLengthFilter$payments_core_release(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ int calculateCursorPosition$payments_core_release(int r8, int r9, int r10, int r11) {
        /*
            r7 = this;
            com.stripe.android.cards.CardNumber$Companion r0 = com.stripe.android.cards.CardNumber.Companion
            java.util.Set r11 = r0.getSpacePositions$payments_core_release(r11)
            boolean r0 = r11 instanceof java.util.Collection
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0014
            boolean r3 = r11.isEmpty()
            if (r3 == 0) goto L_0x0014
            r4 = r2
            goto L_0x003e
        L_0x0014:
            java.util.Iterator r3 = r11.iterator()
            r4 = r2
        L_0x0019:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x003e
            java.lang.Object r5 = r3.next()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            if (r9 > r5) goto L_0x0031
            int r6 = r9 + r10
            if (r6 < r5) goto L_0x0031
            r5 = r1
            goto L_0x0032
        L_0x0031:
            r5 = r2
        L_0x0032:
            if (r5 == 0) goto L_0x0019
            int r4 = r4 + 1
            if (r4 < 0) goto L_0x0039
            goto L_0x0019
        L_0x0039:
            m0.j.g.q0()
            r8 = 0
            throw r8
        L_0x003e:
            if (r0 == 0) goto L_0x0048
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L_0x0048
        L_0x0046:
            r1 = r2
            goto L_0x0066
        L_0x0048:
            java.util.Iterator r11 = r11.iterator()
        L_0x004c:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0046
            java.lang.Object r0 = r11.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r10 != 0) goto L_0x0063
            int r0 = r0 + r1
            if (r9 != r0) goto L_0x0063
            r0 = r1
            goto L_0x0064
        L_0x0063:
            r0 = r2
        L_0x0064:
            if (r0 == 0) goto L_0x004c
        L_0x0066:
            int r9 = r9 + r10
            int r9 = r9 + r4
            if (r1 == 0) goto L_0x006e
            if (r9 <= 0) goto L_0x006e
            int r9 = r9 + -1
        L_0x006e:
            if (r9 > r8) goto L_0x0071
            r8 = r9
        L_0x0071:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.CardNumberEditText.calculateCursorPosition$payments_core_release(int, int, int, int):int");
    }

    public String getAccessibilityText() {
        return getResources().getString(com.stripe.android.R.string.acc_label_card_number_node, new Object[]{getText()});
    }

    public final f1 getAccountRangeRepositoryJob$payments_core_release() {
        return this.accountRangeRepositoryJob;
    }

    public final l<CardBrand, i> getBrandChangeCallback$payments_core_release() {
        return this.brandChangeCallback;
    }

    public final CardBrand getCardBrand() {
        return this.cardBrand;
    }

    public final String getCardNumber() {
        if (this.isCardNumberValid) {
            return getUnvalidatedCardNumber().getNormalized();
        }
        return null;
    }

    public final a<i> getCompletionCallback$payments_core_release() {
        return this.completionCallback;
    }

    public final int getLengthMax() {
        return this.cardBrand.getMaxLengthWithSpacesForCardNumber(getFieldText$payments_core_release());
    }

    public final int getPanLength$payments_core_release() {
        Integer num;
        AccountRange accountRange2 = this.accountRange;
        if (accountRange2 != null) {
            num = Integer.valueOf(accountRange2.getPanLength());
        } else {
            AccountRange first = this.staticCardAccountRanges.first(getUnvalidatedCardNumber());
            num = first != null ? Integer.valueOf(first.getPanLength()) : null;
        }
        if (num != null) {
            return num.intValue();
        }
        return 16;
    }

    public final CardNumber.Validated getValidatedCardNumber$payments_core_release() {
        return getUnvalidatedCardNumber().validate(getPanLength$payments_core_release());
    }

    public final e getWorkContext$payments_core_release() {
        return this.workContext;
    }

    public final boolean isCardNumberValid() {
        return this.isCardNumberValid;
    }

    public final l<Boolean, i> isLoadingCallback$payments_core_release() {
        return this.isLoadingCallback;
    }

    public final /* synthetic */ void onAccountRangeResult$payments_core_release(AccountRange accountRange2) {
        CardBrand cardBrand2;
        setAccountRange(accountRange2);
        if (accountRange2 == null || (cardBrand2 = accountRange2.getBrand()) == null) {
            cardBrand2 = CardBrand.Unknown;
        }
        setCardBrand$payments_core_release(cardBrand2);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.loadingJob = m0.r.t.a.r.m.a1.a.E2(m0.r.t.a.r.m.a1.a.h(this.workContext), (e) null, (CoroutineStart) null, new CardNumberEditText$onAttachedToWindow$1(this, (c) null), 3, (Object) null);
    }

    public final /* synthetic */ void onCardMetadataLoadedTooSlow$payments_core_release() {
        this.analyticsRequestExecutor.executeAsync(AnalyticsRequestFactory.createRequest$payments_core_release$default(this.analyticsRequestFactory, AnalyticsEvent.CardMetadataLoadedTooSlow, (Set) null, (String) null, (Token.Type) null, (AnalyticsRequestFactory.ThreeDS2UiType) null, 30, (Object) null));
    }

    public void onDetachedFromWindow() {
        f1 f1Var = this.loadingJob;
        if (f1Var != null) {
            m0.r.t.a.r.m.a1.a.o0(f1Var, (CancellationException) null, 1, (Object) null);
        }
        this.loadingJob = null;
        cancelAccountRangeRepositoryJob();
        super.onDetachedFromWindow();
    }

    public final /* synthetic */ void queryAccountRangeRepository$payments_core_release(CardNumber.Unvalidated unvalidated) {
        m0.n.b.i.e(unvalidated, "cardNumber");
        if (shouldQueryAccountRange(unvalidated)) {
            cancelAccountRangeRepositoryJob();
            setAccountRange((AccountRange) null);
            this.accountRangeRepositoryJob = m0.r.t.a.r.m.a1.a.E2(m0.r.t.a.r.m.a1.a.h(this.workContext), (e) null, (CoroutineStart) null, new CardNumberEditText$queryAccountRangeRepository$1(this, unvalidated, (c) null), 3, (Object) null);
        }
    }

    public final void setAccountRangeRepositoryJob$payments_core_release(f1 f1Var) {
        this.accountRangeRepositoryJob = f1Var;
    }

    public final void setBrandChangeCallback$payments_core_release(l<? super CardBrand, i> lVar) {
        m0.n.b.i.e(lVar, "callback");
        this.brandChangeCallback = lVar;
        lVar.invoke(this.cardBrand);
    }

    public final void setCardBrand$payments_core_release(CardBrand cardBrand2) {
        m0.n.b.i.e(cardBrand2, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        CardBrand cardBrand3 = this.cardBrand;
        this.cardBrand = cardBrand2;
        if (cardBrand2 != cardBrand3) {
            this.brandChangeCallback.invoke(cardBrand2);
            updateLengthFilter$payments_core_release$default(this, 0, 1, (Object) null);
        }
    }

    public final void setCompletionCallback$payments_core_release(a<i> aVar) {
        m0.n.b.i.e(aVar, "<set-?>");
        this.completionCallback = aVar;
    }

    public final void setLoadingCallback$payments_core_release(l<? super Boolean, i> lVar) {
        m0.n.b.i.e(lVar, "<set-?>");
        this.isLoadingCallback = lVar;
    }

    public final void setWorkContext$payments_core_release(e eVar) {
        m0.n.b.i.e(eVar, "<set-?>");
        this.workContext = eVar;
    }

    public final /* synthetic */ void updateLengthFilter$payments_core_release(int i) {
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CardNumberEditText(Context context, AttributeSet attributeSet, int i, e eVar, CardAccountRangeRepository cardAccountRangeRepository2, StaticCardAccountRanges staticCardAccountRanges2, AnalyticsRequestExecutor analyticsRequestExecutor2, AnalyticsRequestFactory analyticsRequestFactory2) {
        super(context, attributeSet, i);
        m0.n.b.i.e(context, "context");
        m0.n.b.i.e(eVar, "workContext");
        m0.n.b.i.e(cardAccountRangeRepository2, "cardAccountRangeRepository");
        m0.n.b.i.e(staticCardAccountRanges2, "staticCardAccountRanges");
        m0.n.b.i.e(analyticsRequestExecutor2, "analyticsRequestExecutor");
        m0.n.b.i.e(analyticsRequestFactory2, "analyticsRequestFactory");
        this.workContext = eVar;
        this.cardAccountRangeRepository = cardAccountRangeRepository2;
        this.staticCardAccountRanges = staticCardAccountRanges2;
        this.analyticsRequestExecutor = analyticsRequestExecutor2;
        this.analyticsRequestFactory = analyticsRequestFactory2;
        this.cardBrand = CardBrand.Unknown;
        this.brandChangeCallback = CardNumberEditText$brandChangeCallback$1.INSTANCE;
        this.completionCallback = CardNumberEditText$completionCallback$1.INSTANCE;
        this.isLoadingCallback = CardNumberEditText$isLoadingCallback$1.INSTANCE;
        setInputType(2);
        setErrorMessage(getResources().getString(com.stripe.android.R.string.invalid_card_number));
        addTextChangedListener(new CardNumberTextWatcher());
        getInternalFocusChangeListeners$payments_core_release().add(new View.OnFocusChangeListener(this) {
            public final /* synthetic */ CardNumberEditText this$0;

            {
                this.this$0 = r1;
            }

            public final void onFocusChange(View view, boolean z) {
                if (!z && this.this$0.getUnvalidatedCardNumber().isPartialEntry$payments_core_release(this.this$0.getPanLength$payments_core_release())) {
                    this.this$0.setShouldShowError(true);
                }
            }
        });
        if (Build.VERSION.SDK_INT >= 26) {
            setAutofillHints(new String[]{"creditCardNumber"});
        }
        updateLengthFilter$payments_core_release$default(this, 0, 1, (Object) null);
        setLayoutDirection(0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardNumberEditText(Context context, AttributeSet attributeSet, int i, int i2, f fVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.editTextStyle : i);
    }

    private CardNumberEditText(Context context, AttributeSet attributeSet, int i, e eVar, a<String> aVar) {
        this(context, attributeSet, i, eVar, new DefaultCardAccountRangeRepositoryFactory(context).create(), new DefaultStaticCardAccountRanges(), new AnalyticsRequestExecutor.Default((Logger) null, (e) null, 3, (f) null), new AnalyticsRequestFactory(context, aVar));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CardNumberEditText(final Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, (e) m0.c, (a<String>) new a<String>() {
            public final String invoke() {
                return PaymentConfiguration.Companion.getInstance(context).getPublishableKey();
            }
        });
        m0.n.b.i.e(context, "context");
    }
}
