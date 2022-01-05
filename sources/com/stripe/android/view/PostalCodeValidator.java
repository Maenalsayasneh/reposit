package com.stripe.android.view;

import com.stripe.android.view.ShippingInfoWidget;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.text.StringsKt__IndentKt;
import m0.j.g;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J;\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u0006\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/view/PostalCodeValidator;", "", "", "postalCode", "countryCode", "", "isValid", "(Ljava/lang/String;Ljava/lang/String;)Z", "", "Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;", "optionalShippingInfoFields", "hiddenShippingInfoFields", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Z", "<init>", "()V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PostalCodeValidator.kt */
public final class PostalCodeValidator {
    private static final Companion Companion = new Companion((f) null);
    @Deprecated
    private static final Map<String, Pattern> POSTAL_CODE_PATTERNS;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0007\u001a\u00020\u00062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bR2\u0010\r\u001a\u001e\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\f0\f0\t8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/view/PostalCodeValidator$Companion;", "", "", "Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;", "optionalShippingInfoFields", "hiddenShippingInfoFields", "", "isPostalCodeNotRequired", "(Ljava/util/List;Ljava/util/List;)Z", "", "", "kotlin.jvm.PlatformType", "Ljava/util/regex/Pattern;", "POSTAL_CODE_PATTERNS", "Ljava/util/Map;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PostalCodeValidator.kt */
    public static final class Companion {
        private Companion() {
        }

        /* access modifiers changed from: private */
        public final boolean isPostalCodeNotRequired(List<? extends ShippingInfoWidget.CustomizableShippingField> list, List<? extends ShippingInfoWidget.CustomizableShippingField> list2) {
            ShippingInfoWidget.CustomizableShippingField customizableShippingField = ShippingInfoWidget.CustomizableShippingField.PostalCode;
            return list.contains(customizableShippingField) || list2.contains(customizableShippingField);
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    static {
        Locale locale = Locale.US;
        i.d(locale, "Locale.US");
        Locale locale2 = Locale.CANADA;
        i.d(locale2, "Locale.CANADA");
        POSTAL_CODE_PATTERNS = g.N(new Pair(locale.getCountry(), Pattern.compile("^[0-9]{5}(?:-[0-9]{4})?$")), new Pair(locale2.getCountry(), Pattern.compile("^(?!.*[DFIOQU])[A-VXY][0-9][A-Z] ?[0-9][A-Z][0-9]$")));
    }

    public final boolean isValid(String str, String str2) {
        Matcher matcher;
        i.e(str, "postalCode");
        i.e(str2, "countryCode");
        Pattern pattern = POSTAL_CODE_PATTERNS.get(str2);
        if (pattern != null && (matcher = pattern.matcher(str)) != null) {
            return matcher.matches();
        }
        if (!CountryUtils.INSTANCE.doesCountryUsePostalCode$payments_core_release(str2) || (!StringsKt__IndentKt.o(str))) {
            return true;
        }
        return false;
    }

    public final boolean isValid(String str, String str2, List<? extends ShippingInfoWidget.CustomizableShippingField> list, List<? extends ShippingInfoWidget.CustomizableShippingField> list2) {
        Matcher matcher;
        i.e(str, "postalCode");
        i.e(list, "optionalShippingInfoFields");
        i.e(list2, "hiddenShippingInfoFields");
        if (str2 == null) {
            return false;
        }
        if (!(str.length() == 0) || !Companion.isPostalCodeNotRequired(list, list2)) {
            Pattern pattern = POSTAL_CODE_PATTERNS.get(str2);
            if (pattern != null && (matcher = pattern.matcher(str)) != null) {
                return matcher.matches();
            }
            if (CountryUtils.INSTANCE.doesCountryUsePostalCode$payments_core_release(str2) && !(!StringsKt__IndentKt.o(str))) {
                return false;
            }
        }
        return true;
    }
}
