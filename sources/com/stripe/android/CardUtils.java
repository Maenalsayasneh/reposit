package com.stripe.android;

import com.stripe.android.cards.CardNumber;
import com.stripe.android.model.CardBrand;
import kotlin.Metadata;
import kotlin.text.StringsKt__IndentKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\b\u0010\tJ!\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0005\u0010\u000bJ\u0019\u0010\r\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\f\u0010\tJ\u0019\u0010\u000f\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u000e\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/CardUtils;", "", "", "cardNumber", "Lcom/stripe/android/model/CardBrand;", "getPossibleCardBrand", "(Ljava/lang/String;)Lcom/stripe/android/model/CardBrand;", "", "isValidCardNumber", "(Ljava/lang/String;)Z", "shouldNormalize", "(Ljava/lang/String;Z)Lcom/stripe/android/model/CardBrand;", "isValidLuhnNumber$payments_core_release", "isValidLuhnNumber", "isValidCardLength$payments_core_release", "isValidCardLength", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: CardUtils.kt */
public final class CardUtils {
    public static final CardUtils INSTANCE = new CardUtils();

    private CardUtils() {
    }

    public static final CardBrand getPossibleCardBrand(String str) {
        return INSTANCE.getPossibleCardBrand(str, true);
    }

    public static final boolean isValidCardNumber(String str) {
        if (str == null) {
            str = "";
        }
        String normalized = new CardNumber.Unvalidated(str).getNormalized();
        CardUtils cardUtils = INSTANCE;
        return cardUtils.isValidLuhnNumber$payments_core_release(normalized) && cardUtils.isValidCardLength$payments_core_release(normalized);
    }

    public final boolean isValidCardLength$payments_core_release(String str) {
        return str != null && getPossibleCardBrand(str, false).isValidCardNumberLength(str);
    }

    public final boolean isValidLuhnNumber$payments_core_release(String str) {
        if (str == null) {
            return false;
        }
        int i = 0;
        boolean z = true;
        for (int length = str.length() - 1; length >= 0; length--) {
            char charAt = str.charAt(length);
            if (!Character.isDigit(charAt)) {
                return false;
            }
            int numericValue = Character.getNumericValue(charAt);
            z = !z;
            if (z) {
                numericValue *= 2;
            }
            if (numericValue > 9) {
                numericValue -= 9;
            }
            i += numericValue;
        }
        if (i % 10 == 0) {
            return true;
        }
        return false;
    }

    private final CardBrand getPossibleCardBrand(String str, boolean z) {
        if (str == null || StringsKt__IndentKt.o(str)) {
            return CardBrand.Unknown;
        }
        if (z) {
            str = new CardNumber.Unvalidated(str).getNormalized();
        }
        return CardBrand.Companion.fromCardNumber(str);
    }
}
