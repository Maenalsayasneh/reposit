package com.stripe.android.view;

import android.content.res.Resources;
import android.text.ParcelableSpan;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import com.stripe.android.R;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.parsers.AccountRangeJsonParser;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b \u0010!B\u0011\b\u0010\u0012\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b \u0010$J/\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0014\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006%"}, d2 = {"Lcom/stripe/android/view/CardDisplayTextFactory;", "", "Landroid/text/SpannableString;", "displayString", "Landroid/text/ParcelableSpan;", "span", "", "start", "end", "Lm0/i;", "setSpan", "(Landroid/text/SpannableString;Landroid/text/ParcelableSpan;II)V", "Lcom/stripe/android/model/CardBrand;", "brand", "", "last4", "", "isSelected", "createStyled$payments_core_release", "(Lcom/stripe/android/model/CardBrand;Ljava/lang/String;Z)Landroid/text/SpannableString;", "createStyled", "Lcom/stripe/android/model/PaymentMethod$Card;", "card", "createUnstyled$payments_core_release", "(Lcom/stripe/android/model/PaymentMethod$Card;)Ljava/lang/String;", "createUnstyled", "Landroid/content/res/Resources;", "resources", "Landroid/content/res/Resources;", "Lcom/stripe/android/view/ThemeConfig;", "themeConfig", "Lcom/stripe/android/view/ThemeConfig;", "<init>", "(Landroid/content/res/Resources;Lcom/stripe/android/view/ThemeConfig;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: CardDisplayTextFactory.kt */
public final class CardDisplayTextFactory {
    private final Resources resources;
    private final ThemeConfig themeConfig;

    public CardDisplayTextFactory(Resources resources2, ThemeConfig themeConfig2) {
        i.e(resources2, "resources");
        i.e(themeConfig2, "themeConfig");
        this.resources = resources2;
        this.themeConfig = themeConfig2;
    }

    private final void setSpan(SpannableString spannableString, ParcelableSpan parcelableSpan, int i, int i2) {
        spannableString.setSpan(parcelableSpan, i, i2, 33);
    }

    public final /* synthetic */ SpannableString createStyled$payments_core_release(CardBrand cardBrand, String str, boolean z) {
        i.e(cardBrand, AccountRangeJsonParser.FIELD_BRAND);
        String displayName = cardBrand.getDisplayName();
        int length = displayName.length();
        if (str == null) {
            SpannableString spannableString = new SpannableString(displayName);
            setSpan(spannableString, new TypefaceSpan("sans-serif-medium"), 0, length);
            return spannableString;
        }
        String string = this.resources.getString(R.string.card_ending_in, new Object[]{displayName, str});
        i.d(string, "resources.getString(R.st…ing_in, brandText, last4)");
        int length2 = string.length();
        int length3 = length2 - str.length();
        int textColor$payments_core_release = this.themeConfig.getTextColor$payments_core_release(z);
        int textAlphaColor$payments_core_release = this.themeConfig.getTextAlphaColor$payments_core_release(z);
        SpannableString spannableString2 = new SpannableString(string);
        setSpan(spannableString2, new TypefaceSpan("sans-serif-medium"), 0, length);
        setSpan(spannableString2, new ForegroundColorSpan(textColor$payments_core_release), 0, length);
        setSpan(spannableString2, new ForegroundColorSpan(textAlphaColor$payments_core_release), length, length3);
        setSpan(spannableString2, new TypefaceSpan("sans-serif-medium"), length3, length2);
        setSpan(spannableString2, new ForegroundColorSpan(textColor$payments_core_release), length3, length2);
        return spannableString2;
    }

    public final /* synthetic */ String createUnstyled$payments_core_release(PaymentMethod.Card card) {
        i.e(card, "card");
        String string = this.resources.getString(R.string.card_ending_in, new Object[]{card.brand.getDisplayName(), card.last4});
        i.d(string, "resources.getString(\n   …     card.last4\n        )");
        return string;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CardDisplayTextFactory(android.content.Context r3) {
        /*
            r2 = this;
            java.lang.String r0 = "context"
            m0.n.b.i.e(r3, r0)
            android.content.res.Resources r0 = r3.getResources()
            java.lang.String r1 = "context.resources"
            m0.n.b.i.d(r0, r1)
            com.stripe.android.view.ThemeConfig r1 = new com.stripe.android.view.ThemeConfig
            r1.<init>(r3)
            r2.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.CardDisplayTextFactory.<init>(android.content.Context):void");
    }
}
