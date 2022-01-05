package com.stripe.android.stripe3ds2.utils;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.util.TypedValue;
import android.view.Window;
import android.widget.ProgressBar;
import androidx.core.app.NotificationCompat;
import com.stripe.android.stripe3ds2.exceptions.InvalidInputException;
import com.stripe.android.stripe3ds2.init.ui.Customization;
import com.stripe.android.stripe3ds2.init.ui.UiCustomization;
import h0.b.a.e;
import i0.d.a.a.a;
import i0.j.f.p.h;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.text.StringsKt__IndentKt;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b-\u0010.J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\tJ!\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0001\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\"\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b \u0010!J%\u0010)\u001a\u00020(2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u00042\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b)\u0010*J\u0019\u0010\"\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b \u0010\fR\u0016\u0010+\u001a\u00020\u001e8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lcom/stripe/android/stripe3ds2/utils/CustomizeUtils;", "", "", "color", "", "colorIntToHex", "(I)Ljava/lang/String;", "hexColor", "requireValidColor", "(Ljava/lang/String;)Ljava/lang/String;", "fontSize", "requireValidFontSize", "(I)I", "dimension", "requireValidDimension", "string", "requireValidString", "Landroid/widget/ProgressBar;", "progressBar", "Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization;", "uiCustomization", "Lm0/i;", "applyProgressBarColor$3ds2sdk_release", "(Landroid/widget/ProgressBar;Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization;)V", "applyProgressBarColor", "Lh0/b/a/e;", "activity", "statusBarColor", "setStatusBarColor", "(Lh0/b/a/e;I)V", "", "factor", "darken$3ds2sdk_release", "(IF)I", "darken", "Landroid/content/Context;", "context", "text", "Lcom/stripe/android/stripe3ds2/init/ui/Customization;", "customization", "Landroid/text/SpannableString;", "buildStyledText", "(Landroid/content/Context;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/init/ui/Customization;)Landroid/text/SpannableString;", "DEFAULT_DARKEN_FACTOR", "F", "<init>", "()V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: CustomizeUtils.kt */
public final class CustomizeUtils {
    private static final float DEFAULT_DARKEN_FACTOR = 0.8f;
    public static final CustomizeUtils INSTANCE = new CustomizeUtils();

    private CustomizeUtils() {
    }

    public static final String colorIntToHex(int i) {
        int alpha = Color.alpha(i);
        int blue = Color.blue(i);
        int green = Color.green(i);
        int red = Color.red(i);
        StringBuilder P0 = a.P0("#");
        Locale locale = Locale.ENGLISH;
        String format = String.format(locale, "%02X", Arrays.copyOf(new Object[]{Integer.valueOf(alpha)}, 1));
        i.d(format, "java.lang.String.format(locale, format, *args)");
        P0.append(format);
        String format2 = String.format(locale, "%02X", Arrays.copyOf(new Object[]{Integer.valueOf(red)}, 1));
        i.d(format2, "java.lang.String.format(locale, format, *args)");
        P0.append(format2);
        String format3 = String.format(locale, "%02X", Arrays.copyOf(new Object[]{Integer.valueOf(green)}, 1));
        i.d(format3, "java.lang.String.format(locale, format, *args)");
        P0.append(format3);
        String format4 = String.format(locale, "%02X", Arrays.copyOf(new Object[]{Integer.valueOf(blue)}, 1));
        i.d(format4, "java.lang.String.format(locale, format, *args)");
        P0.append(format4);
        return P0.toString();
    }

    public static final String requireValidColor(String str) throws InvalidInputException {
        Object obj;
        i.e(str, "hexColor");
        try {
            Color.parseColor(str);
            obj = str;
        } catch (Throwable th) {
            obj = h.l0(th);
        }
        if (Result.a(obj) == null) {
            return (String) obj;
        }
        throw new InvalidInputException(a.n0("Unable to parse color: ", str), (Throwable) null, 2, (f) null);
    }

    public static final int requireValidDimension(int i) throws InvalidInputException {
        if (i >= 0) {
            return i;
        }
        throw new InvalidInputException("Dimension must be greater or equal to 0", (Throwable) null, 2, (f) null);
    }

    public static final int requireValidFontSize(int i) throws InvalidInputException {
        if (i > 0) {
            return i;
        }
        throw new InvalidInputException("Font size must be greater than 0", (Throwable) null, 2, (f) null);
    }

    public static final String requireValidString(String str) throws InvalidInputException {
        i.e(str, "string");
        if (!StringsKt__IndentKt.o(str)) {
            return str;
        }
        throw new InvalidInputException("String must not be null or empty", (Throwable) null, 2, (f) null);
    }

    public final void applyProgressBarColor$3ds2sdk_release(ProgressBar progressBar, UiCustomization uiCustomization) {
        String accentColor;
        i.e(progressBar, "progressBar");
        if (uiCustomization != null && (accentColor = uiCustomization.getAccentColor()) != null) {
            progressBar.setIndeterminateTintList(ColorStateList.valueOf(Color.parseColor(accentColor)));
        }
    }

    public final SpannableString buildStyledText(Context context, String str, Customization customization) {
        i.e(context, "context");
        i.e(str, NotificationCompat.MessagingStyle.Message.KEY_TEXT);
        i.e(customization, "customization");
        SpannableString spannableString = new SpannableString(str);
        String textColor = customization.getTextColor();
        if (textColor != null) {
            spannableString.setSpan(new ForegroundColorSpan(Color.parseColor(textColor)), 0, spannableString.length(), 0);
        }
        Integer valueOf = Integer.valueOf(customization.getTextFontSize());
        if (!(valueOf.intValue() > 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            Resources resources = context.getResources();
            i.d(resources, "context.resources");
            spannableString.setSpan(new AbsoluteSizeSpan((int) TypedValue.applyDimension(2, (float) valueOf.intValue(), resources.getDisplayMetrics())), 0, spannableString.length(), 0);
        }
        String textFontName = customization.getTextFontName();
        if (textFontName != null) {
            spannableString.setSpan(new TypefaceSpan(textFontName), 0, spannableString.length(), 0);
        }
        return spannableString;
    }

    public final int darken$3ds2sdk_release(int i, float f) {
        return Color.argb(Color.alpha(i), Math.min(Math.max((int) (((float) Color.red(i)) * f), 0), 255), Math.min(Math.max((int) (((float) Color.green(i)) * f), 0), 255), Math.min(Math.max((int) (((float) Color.blue(i)) * f), 0), 255));
    }

    public final void setStatusBarColor(e eVar, int i) {
        i.e(eVar, "activity");
        Window window = eVar.getWindow();
        i.d(window, "activity.window");
        window.setStatusBarColor(i);
    }

    public final int darken$3ds2sdk_release(int i) {
        return darken$3ds2sdk_release(i, DEFAULT_DARKEN_FACTOR);
    }
}
