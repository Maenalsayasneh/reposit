package com.stripe.android.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import h0.i.b.a;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\r\u001a\u00020\f2\n\u0010\t\u001a\u00060\u0007R\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u000f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0013\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0018\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0019\u0010\u0012R\u0019\u0010\u001a\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u001b\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/stripe/android/view/StripeColorUtils;", "", "", "idRes", "Landroid/util/TypedValue;", "getTypedValue", "(I)Landroid/util/TypedValue;", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "theme", "attributeResource", "iconResourceId", "Landroid/graphics/drawable/Drawable;", "getTintedIconWithAttribute", "(Landroid/content/res/Resources$Theme;II)Landroid/graphics/drawable/Drawable;", "colorControlNormal", "I", "getColorControlNormal", "()I", "textColorPrimary", "getTextColorPrimary", "Landroid/content/Context;", "context", "Landroid/content/Context;", "textColorSecondary", "getTextColorSecondary", "colorAccent", "getColorAccent", "<init>", "(Landroid/content/Context;)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: StripeColorUtils.kt */
public final class StripeColorUtils {
    public static final Companion Companion = new Companion((f) null);
    private final int colorAccent = getTypedValue(16843829).data;
    private final int colorControlNormal = getTypedValue(16843817).data;
    private final Context context;
    private final int textColorPrimary = getTypedValue(16842806).data;
    private final int textColorSecondary = getTypedValue(16842808).data;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/view/StripeColorUtils$Companion;", "", "", "color", "", "isColorTransparent", "(I)Z", "isColorDark", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: StripeColorUtils.kt */
    public static final class Companion {
        private Companion() {
        }

        public final boolean isColorDark(int i) {
            return ((((double) Color.blue(i)) * 0.114d) + ((((double) Color.green(i)) * 0.587d) + (((double) Color.red(i)) * 0.299d))) / ((double) 255) <= 0.5d;
        }

        public final boolean isColorTransparent(int i) {
            return Color.alpha(i) < 16;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public StripeColorUtils(Context context2) {
        i.e(context2, "context");
        this.context = context2;
    }

    private final TypedValue getTypedValue(int i) {
        TypedValue typedValue = new TypedValue();
        this.context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue;
    }

    public final int getColorAccent() {
        return this.colorAccent;
    }

    public final int getColorControlNormal() {
        return this.colorControlNormal;
    }

    public final int getTextColorPrimary() {
        return this.textColorPrimary;
    }

    public final int getTextColorSecondary() {
        return this.textColorSecondary;
    }

    public final Drawable getTintedIconWithAttribute(Resources.Theme theme, int i, int i2) {
        i.e(theme, "theme");
        TypedValue typedValue = new TypedValue();
        theme.resolveAttribute(i, typedValue, true);
        int i3 = typedValue.data;
        Drawable drawable = a.getDrawable(this.context, i2);
        i.c(drawable);
        drawable.mutate().setTint(i3);
        i.d(drawable, "compatIcon");
        return drawable;
    }
}
