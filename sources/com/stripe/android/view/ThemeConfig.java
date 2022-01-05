package com.stripe.android.view;

import android.content.Context;
import android.content.res.Resources;
import com.stripe.android.R;
import h0.i.c.a;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b \u0010!J+\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\u0010\u0010\fR\u0016\u0010\u0012\u001a\u00020\u00048\u0002@\u0003X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00048\u0002@\u0003X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00048\u0002@\u0003X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0013R\u0016\u0010\u0019\u001a\u00020\u00048\u0002@\u0003X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013R\u0016\u0010\u001a\u001a\u00020\u00048\u0002@\u0003X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0013R\u001c\u0010\u001c\u001a\u00020\u001b8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/stripe/android/view/ThemeConfig;", "", "Landroid/content/Context;", "context", "", "defaultColor", "colorIfTransparent", "determineColor", "(Landroid/content/Context;II)I", "", "isSelected", "getTintColor$payments_core_release", "(Z)I", "getTintColor", "getTextColor$payments_core_release", "getTextColor", "getTextAlphaColor$payments_core_release", "getTextAlphaColor", "unselectedTextColorInt", "I", "unselectedColorInt", "Lcom/stripe/android/view/StripeColorUtils;", "colorUtils", "Lcom/stripe/android/view/StripeColorUtils;", "selectedColorInt", "unselectedTextAlphaColorInt", "selectedTextAlphaColorInt", "", "textColorValues", "[I", "getTextColorValues$payments_core_release", "()[I", "<init>", "(Landroid/content/Context;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ThemeConfig.kt */
public final class ThemeConfig {
    private final StripeColorUtils colorUtils;
    private final int selectedColorInt;
    private final int selectedTextAlphaColorInt;
    private final int[] textColorValues;
    private final int unselectedColorInt;
    private final int unselectedTextAlphaColorInt;
    private final int unselectedTextColorInt;

    public ThemeConfig(Context context) {
        i.e(context, "context");
        StripeColorUtils stripeColorUtils = new StripeColorUtils(context);
        this.colorUtils = stripeColorUtils;
        int determineColor = determineColor(context, stripeColorUtils.getColorAccent(), R.color.stripe_accent_color_default);
        this.selectedColorInt = determineColor;
        this.unselectedColorInt = determineColor(context, stripeColorUtils.getColorControlNormal(), R.color.stripe_control_normal_color_default);
        int determineColor2 = determineColor(context, stripeColorUtils.getTextColorSecondary(), R.color.stripe_color_text_secondary_default);
        this.unselectedTextColorInt = determineColor2;
        Resources resources = context.getResources();
        int i = R.integer.stripe_light_text_alpha_hex;
        int c = a.c(determineColor, resources.getInteger(i));
        this.selectedTextAlphaColorInt = c;
        int c2 = a.c(determineColor2, context.getResources().getInteger(i));
        this.unselectedTextAlphaColorInt = c2;
        this.textColorValues = new int[]{determineColor, c, determineColor2, c2};
    }

    private final int determineColor(Context context, int i, int i2) {
        return StripeColorUtils.Companion.isColorTransparent(i) ? h0.i.b.a.getColor(context, i2) : i;
    }

    public final int getTextAlphaColor$payments_core_release(boolean z) {
        return z ? this.selectedTextAlphaColorInt : this.unselectedTextAlphaColorInt;
    }

    public final int getTextColor$payments_core_release(boolean z) {
        return z ? this.selectedColorInt : this.unselectedTextColorInt;
    }

    public final int[] getTextColorValues$payments_core_release() {
        return this.textColorValues;
    }

    public final int getTintColor$payments_core_release(boolean z) {
        return z ? this.selectedColorInt : this.unselectedColorInt;
    }
}
