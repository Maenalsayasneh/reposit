package com.stripe.android.view;

import android.text.TextWatcher;
import com.stripe.android.model.Card;
import com.stripe.android.model.CardParams;
import com.stripe.android.model.PaymentMethodCreateParams;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 :2\u00020\u0001:\u0001:J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b\u0010\u0010\u000eJ\u0019\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b\u0012\u0010\u000eJ\u0019\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b\u0014\u0010\u000eJ\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0004H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u0015H&¢\u0006\u0004\b\u001c\u0010\u0018J#\u0010 \u001a\u00020\u00042\b\b\u0001\u0010\u001e\u001a\u00020\u001d2\b\b\u0001\u0010\u001f\u001a\u00020\u001dH&¢\u0006\u0004\b \u0010!J\u0019\u0010#\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010\u0015H&¢\u0006\u0004\b#\u0010\u0018R\u0018\u0010'\u001a\u0004\u0018\u00010$8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0018\u0010+\u001a\u0004\u0018\u00010(8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u001e\u00100\u001a\u0004\u0018\u00010,8&@'X§\u0004¢\u0006\f\u0012\u0004\b/\u0010\u001a\u001a\u0004\b-\u0010.R\u001e\u00105\u001a\u0004\u0018\u0001018&@'X§\u0004¢\u0006\f\u0012\u0004\b4\u0010\u001a\u001a\u0004\b2\u00103R\u0018\u00109\u001a\u0004\u0018\u0001068&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006;"}, d2 = {"Lcom/stripe/android/view/CardWidget;", "", "Lcom/stripe/android/view/CardValidCallback;", "callback", "Lm0/i;", "setCardValidCallback", "(Lcom/stripe/android/view/CardValidCallback;)V", "Lcom/stripe/android/view/CardInputListener;", "listener", "setCardInputListener", "(Lcom/stripe/android/view/CardInputListener;)V", "Landroid/text/TextWatcher;", "cardNumberTextWatcher", "setCardNumberTextWatcher", "(Landroid/text/TextWatcher;)V", "expiryDateTextWatcher", "setExpiryDateTextWatcher", "cvcNumberTextWatcher", "setCvcNumberTextWatcher", "postalCodeTextWatcher", "setPostalCodeTextWatcher", "", "cardHint", "setCardHint", "(Ljava/lang/String;)V", "clear", "()V", "cardNumber", "setCardNumber", "", "month", "year", "setExpiryDate", "(II)V", "cvcCode", "setCvcCode", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "getPaymentMethodCreateParams", "()Lcom/stripe/android/model/PaymentMethodCreateParams;", "paymentMethodCreateParams", "Lcom/stripe/android/model/CardParams;", "getCardParams", "()Lcom/stripe/android/model/CardParams;", "cardParams", "Lcom/stripe/android/model/Card$Builder;", "getCardBuilder", "()Lcom/stripe/android/model/Card$Builder;", "getCardBuilder$annotations", "cardBuilder", "Lcom/stripe/android/model/Card;", "getCard", "()Lcom/stripe/android/model/Card;", "getCard$annotations", "card", "Lcom/stripe/android/model/PaymentMethodCreateParams$Card;", "getPaymentMethodCard", "()Lcom/stripe/android/model/PaymentMethodCreateParams$Card;", "paymentMethodCard", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: CardWidget.kt */
public interface CardWidget {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final boolean DEFAULT_POSTAL_CODE_ENABLED = true;
    public static final boolean DEFAULT_POSTAL_CODE_REQUIRED = false;
    public static final boolean DEFAULT_US_ZIP_CODE_REQUIRED = false;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0003\u001a\u00020\u00028\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/stripe/android/view/CardWidget$Companion;", "", "", "DEFAULT_POSTAL_CODE_ENABLED", "Z", "DEFAULT_US_ZIP_CODE_REQUIRED", "DEFAULT_POSTAL_CODE_REQUIRED", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: CardWidget.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final boolean DEFAULT_POSTAL_CODE_ENABLED = true;
        public static final boolean DEFAULT_POSTAL_CODE_REQUIRED = false;
        public static final boolean DEFAULT_US_ZIP_CODE_REQUIRED = false;

        private Companion() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    /* compiled from: CardWidget.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ void getCard$annotations() {
        }

        public static /* synthetic */ void getCardBuilder$annotations() {
        }
    }

    void clear();

    Card getCard();

    Card.Builder getCardBuilder();

    CardParams getCardParams();

    PaymentMethodCreateParams.Card getPaymentMethodCard();

    PaymentMethodCreateParams getPaymentMethodCreateParams();

    void setCardHint(String str);

    void setCardInputListener(CardInputListener cardInputListener);

    void setCardNumber(String str);

    void setCardNumberTextWatcher(TextWatcher textWatcher);

    void setCardValidCallback(CardValidCallback cardValidCallback);

    void setCvcCode(String str);

    void setCvcNumberTextWatcher(TextWatcher textWatcher);

    void setExpiryDate(int i, int i2);

    void setExpiryDateTextWatcher(TextWatcher textWatcher);

    void setPostalCodeTextWatcher(TextWatcher textWatcher);
}
