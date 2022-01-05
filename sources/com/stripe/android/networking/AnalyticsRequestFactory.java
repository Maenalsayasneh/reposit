package com.stripe.android.networking;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import com.stripe.android.Stripe;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.Token;
import com.stripe.android.networking.ApiRequest;
import com.stripe.android.paymentsheet.analytics.DeviceId;
import com.stripe.android.paymentsheet.analytics.PaymentSheetEvent;
import com.stripe.android.paymentsheet.analytics.SessionId;
import i0.j.f.p.h;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import m0.j.g;
import m0.n.a.a;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 S2\u00020\u0001:\u0002STB3\b\u0001\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010I\u001a\u00020\u0002\u0012\f\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00020F¢\u0006\u0004\bL\u0010MB\u0019\b\u0010\u0012\u0006\u0010O\u001a\u00020N\u0012\u0006\u0010P\u001a\u00020\u0002¢\u0006\u0004\bL\u0010QB\u001f\b\u0010\u0012\u0006\u0010O\u001a\u00020N\u0012\f\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00020F¢\u0006\u0004\bL\u0010RJY\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ3\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000b2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0017\u001a\u00020\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010!\u001a\u00020\u001b2\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u001f\u0010 J)\u0010&\u001a\u00020\u001b2\b\u0010#\u001a\u0004\u0018\u00010\"2\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004H\u0000¢\u0006\u0004\b$\u0010%J)\u0010)\u001a\u00020\u001b2\u0006\u0010\u0006\u001a\u00020\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004H\u0000¢\u0006\u0004\b'\u0010(J)\u0010,\u001a\u00020\u001b2\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0000¢\u0006\u0004\b*\u0010+J\u001f\u0010/\u001a\u00020\u001b2\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004H\u0000¢\u0006\u0004\b-\u0010.J\u001f\u00101\u001a\u00020\u001b2\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004H\u0000¢\u0006\u0004\b0\u0010.J\u001f\u00103\u001a\u00020\u001b2\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004H\u0000¢\u0006\u0004\b2\u0010.J\u001b\u00106\u001a\u00020\u001b2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b4\u00105J\u0019\u00108\u001a\u00020\u001b2\b\u0010#\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b7\u00105J)\u0010@\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u0002092\b\u0010;\u001a\u0004\u0018\u00010:2\u0006\u0010=\u001a\u00020<H\u0000¢\u0006\u0004\b>\u0010?JM\u0010@\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00192\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b>\u0010AJ\u001b\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u000bH\u0000¢\u0006\u0004\bB\u0010CR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010ER\u001c\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00020F8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010I\u001a\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010K¨\u0006U"}, d2 = {"Lcom/stripe/android/networking/AnalyticsRequestFactory;", "", "", "event", "", "productUsageTokens", "sourceType", "Lcom/stripe/android/model/Token$Type;", "tokenType", "Lcom/stripe/android/networking/AnalyticsRequestFactory$ThreeDS2UiType;", "threeDS2UiType", "", "createParams", "(Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/model/Token$Type;Lcom/stripe/android/networking/AnalyticsRequestFactory$ThreeDS2UiType;)Ljava/util/Map;", "createTokenTypeParam", "(Ljava/lang/String;Lcom/stripe/android/model/Token$Type;)Ljava/util/Map;", "createStandardParams", "(Ljava/lang/String;)Ljava/util/Map;", "Landroid/content/pm/PackageInfo;", "packageInfo", "Landroid/content/pm/PackageManager;", "packageManager", "", "getAppName", "(Landroid/content/pm/PackageInfo;Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;", "Lcom/stripe/android/networking/AnalyticsEvent;", "uiTypeCode", "Lcom/stripe/android/networking/AnalyticsRequest;", "create3ds2Challenge$payments_core_release", "(Lcom/stripe/android/networking/AnalyticsEvent;Ljava/lang/String;)Lcom/stripe/android/networking/AnalyticsRequest;", "create3ds2Challenge", "createTokenCreation$payments_core_release", "(Ljava/util/Set;Lcom/stripe/android/model/Token$Type;)Lcom/stripe/android/networking/AnalyticsRequest;", "createTokenCreation", "Lcom/stripe/android/model/PaymentMethodCreateParams$Type;", "paymentMethodType", "createPaymentMethodCreation$payments_core_release", "(Lcom/stripe/android/model/PaymentMethodCreateParams$Type;Ljava/util/Set;)Lcom/stripe/android/networking/AnalyticsRequest;", "createPaymentMethodCreation", "createSourceCreation$payments_core_release", "(Ljava/lang/String;Ljava/util/Set;)Lcom/stripe/android/networking/AnalyticsRequest;", "createSourceCreation", "createAddSource$payments_core_release", "(Ljava/util/Set;Ljava/lang/String;)Lcom/stripe/android/networking/AnalyticsRequest;", "createAddSource", "createDeleteSource$payments_core_release", "(Ljava/util/Set;)Lcom/stripe/android/networking/AnalyticsRequest;", "createDeleteSource", "createAttachPaymentMethod$payments_core_release", "createAttachPaymentMethod", "createDetachPaymentMethod$payments_core_release", "createDetachPaymentMethod", "createPaymentIntentConfirmation$payments_core_release", "(Ljava/lang/String;)Lcom/stripe/android/networking/AnalyticsRequest;", "createPaymentIntentConfirmation", "createSetupIntentConfirmation$payments_core_release", "createSetupIntentConfirmation", "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;", "Lcom/stripe/android/paymentsheet/analytics/SessionId;", "sessionId", "Lcom/stripe/android/paymentsheet/analytics/DeviceId;", "deviceId", "createRequest$payments_core_release", "(Lcom/stripe/android/paymentsheet/analytics/PaymentSheetEvent;Lcom/stripe/android/paymentsheet/analytics/SessionId;Lcom/stripe/android/paymentsheet/analytics/DeviceId;)Lcom/stripe/android/networking/AnalyticsRequest;", "createRequest", "(Lcom/stripe/android/networking/AnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/model/Token$Type;Lcom/stripe/android/networking/AnalyticsRequestFactory$ThreeDS2UiType;)Lcom/stripe/android/networking/AnalyticsRequest;", "createAppDataParams$payments_core_release", "()Ljava/util/Map;", "createAppDataParams", "Landroid/content/pm/PackageManager;", "Lkotlin/Function0;", "publishableKeySupplier", "Lm0/n/a/a;", "packageName", "Ljava/lang/String;", "Landroid/content/pm/PackageInfo;", "<init>", "(Landroid/content/pm/PackageManager;Landroid/content/pm/PackageInfo;Ljava/lang/String;Lm0/n/a/a;)V", "Landroid/content/Context;", "context", "publishableKey", "(Landroid/content/Context;Ljava/lang/String;)V", "(Landroid/content/Context;Lm0/n/a/a;)V", "Companion", "ThreeDS2UiType", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: AnalyticsRequestFactory.kt */
public final class AnalyticsRequestFactory {
    private static final String ANALYTICS_NAME = "stripe_android";
    private static final String ANALYTICS_PREFIX = "analytics";
    public static final String ANALYTICS_UA = "analytics.stripe_android-1.0";
    private static final String ANALYTICS_VERSION = "1.0";
    public static final Companion Companion = new Companion((f) null);
    private static final String DEVICE_TYPE = (Build.MANUFACTURER + '_' + Build.BRAND + '_' + Build.MODEL);
    public static final String FIELD_3DS2_UI_TYPE = "3ds2_ui_type";
    public static final String FIELD_ANALYTICS_UA = "analytics_ua";
    public static final String FIELD_APP_NAME = "app_name";
    public static final String FIELD_APP_VERSION = "app_version";
    public static final String FIELD_BINDINGS_VERSION = "bindings_version";
    public static final String FIELD_DEVICE_ID = "device_id";
    public static final String FIELD_DEVICE_TYPE = "device_type";
    public static final String FIELD_EVENT = "event";
    public static final String FIELD_OS_NAME = "os_name";
    public static final String FIELD_OS_RELEASE = "os_release";
    public static final String FIELD_OS_VERSION = "os_version";
    public static final String FIELD_PRODUCT_USAGE = "product_usage";
    public static final String FIELD_PUBLISHABLE_KEY = "publishable_key";
    public static final String FIELD_SESSION_ID = "session_id";
    public static final String FIELD_SOURCE_TYPE = "source_type";
    public static final String FIELD_TOKEN_TYPE = "token_type";
    /* access modifiers changed from: private */
    public static final /* synthetic */ Set<String> VALID_PARAM_FIELDS = g.h0(FIELD_ANALYTICS_UA, FIELD_APP_NAME, "app_version", FIELD_BINDINGS_VERSION, FIELD_DEVICE_TYPE, "event", FIELD_OS_VERSION, FIELD_OS_NAME, FIELD_OS_RELEASE, FIELD_PRODUCT_USAGE, FIELD_PUBLISHABLE_KEY, FIELD_SOURCE_TYPE, FIELD_TOKEN_TYPE);
    private final PackageInfo packageInfo;
    private final PackageManager packageManager;
    private final String packageName;
    private final a<String> publishableKeySupplier;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u001d\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u00020\u00038\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u00020\u00038\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0016\u0010\u000b\u001a\u00020\u00038\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0016\u0010\f\u001a\u00020\u00038\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0016\u0010\r\u001a\u00020\u00038\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0016\u0010\u000e\u001a\u00020\u00038\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u000e\u0010\tR\u0016\u0010\u000f\u001a\u00020\u00038\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u000f\u0010\tR\u0016\u0010\u0010\u001a\u00020\u00038\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u0010\u0010\tR\u0016\u0010\u0011\u001a\u00020\u00038\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u0011\u0010\tR\u0016\u0010\u0012\u001a\u00020\u00038\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u0012\u0010\tR\u0016\u0010\u0013\u001a\u00020\u00038\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u0013\u0010\tR\u0016\u0010\u0014\u001a\u00020\u00038\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u0014\u0010\tR\u0016\u0010\u0015\u001a\u00020\u00038\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u0015\u0010\tR\u0016\u0010\u0016\u001a\u00020\u00038\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u0016\u0010\tR\u0016\u0010\u0017\u001a\u00020\u00038\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u0017\u0010\tR\u0016\u0010\u0018\u001a\u00020\u00038\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u0018\u0010\tR\u0016\u0010\u0019\u001a\u00020\u00038\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u0019\u0010\tR\u0016\u0010\u001a\u001a\u00020\u00038\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u001a\u0010\tR\u0016\u0010\u001b\u001a\u00020\u00038\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u001b\u0010\tR\u0016\u0010\u001c\u001a\u00020\u00038\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u001c\u0010\tR\u0016\u0010\u001d\u001a\u00020\u00038\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u001d\u0010\t¨\u0006 "}, d2 = {"Lcom/stripe/android/networking/AnalyticsRequestFactory$Companion;", "", "", "", "VALID_PARAM_FIELDS", "Ljava/util/Set;", "getVALID_PARAM_FIELDS$payments_core_release", "()Ljava/util/Set;", "ANALYTICS_NAME", "Ljava/lang/String;", "ANALYTICS_PREFIX", "ANALYTICS_UA", "ANALYTICS_VERSION", "DEVICE_TYPE", "FIELD_3DS2_UI_TYPE", "FIELD_ANALYTICS_UA", "FIELD_APP_NAME", "FIELD_APP_VERSION", "FIELD_BINDINGS_VERSION", "FIELD_DEVICE_ID", "FIELD_DEVICE_TYPE", "FIELD_EVENT", "FIELD_OS_NAME", "FIELD_OS_RELEASE", "FIELD_OS_VERSION", "FIELD_PRODUCT_USAGE", "FIELD_PUBLISHABLE_KEY", "FIELD_SESSION_ID", "FIELD_SOURCE_TYPE", "FIELD_TOKEN_TYPE", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: AnalyticsRequestFactory.kt */
    public static final class Companion {
        private Companion() {
        }

        public final Set<String> getVALID_PARAM_FIELDS$payments_core_release() {
            return AnalyticsRequestFactory.VALID_PARAM_FIELDS;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u001b\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/networking/AnalyticsRequestFactory$ThreeDS2UiType;", "", "", "toString", "()Ljava/lang/String;", "code", "Ljava/lang/String;", "typeName", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "Companion", "None", "Text", "SingleSelect", "MultiSelect", "Oob", "Html", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: AnalyticsRequestFactory.kt */
    public enum ThreeDS2UiType {
        None((String) null, "none"),
        Text("01", NotificationCompat.MessagingStyle.Message.KEY_TEXT),
        SingleSelect("02", "single_select"),
        MultiSelect("03", "multi_select"),
        Oob("04", "oob"),
        Html("05", "html");
        
        public static final Companion Companion = null;
        /* access modifiers changed from: private */
        public final String code;
        private final String typeName;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/stripe/android/networking/AnalyticsRequestFactory$ThreeDS2UiType$Companion;", "", "", "uiTypeCode", "Lcom/stripe/android/networking/AnalyticsRequestFactory$ThreeDS2UiType;", "fromUiTypeCode", "(Ljava/lang/String;)Lcom/stripe/android/networking/AnalyticsRequestFactory$ThreeDS2UiType;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: AnalyticsRequestFactory.kt */
        public static final class Companion {
            private Companion() {
            }

            public final ThreeDS2UiType fromUiTypeCode(String str) {
                ThreeDS2UiType threeDS2UiType;
                ThreeDS2UiType[] values = ThreeDS2UiType.values();
                int i = 0;
                while (true) {
                    if (i >= 6) {
                        threeDS2UiType = null;
                        break;
                    }
                    threeDS2UiType = values[i];
                    if (i.a(threeDS2UiType.code, str)) {
                        break;
                    }
                    i++;
                }
                return threeDS2UiType != null ? threeDS2UiType : ThreeDS2UiType.None;
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        /* access modifiers changed from: public */
        static {
            Companion = new Companion((f) null);
        }

        private ThreeDS2UiType(String str, String str2) {
            this.code = str;
            this.typeName = str2;
        }

        public String toString() {
            return this.typeName;
        }
    }

    public AnalyticsRequestFactory(PackageManager packageManager2, PackageInfo packageInfo2, String str, a<String> aVar) {
        i.e(str, "packageName");
        i.e(aVar, "publishableKeySupplier");
        this.packageManager = packageManager2;
        this.packageInfo = packageInfo2;
        this.packageName = str;
        this.publishableKeySupplier = aVar;
    }

    public static /* synthetic */ AnalyticsRequest createAddSource$payments_core_release$default(AnalyticsRequestFactory analyticsRequestFactory, Set set, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            set = null;
        }
        return analyticsRequestFactory.createAddSource$payments_core_release(set, str);
    }

    private final Map<String, Object> createParams(String str, Set<String> set, String str2, Token.Type type, ThreeDS2UiType threeDS2UiType) {
        Map<String, Object> b0 = g.b0(createStandardParams(str), createAppDataParams$payments_core_release());
        Map map = null;
        if (set == null || set.isEmpty()) {
            set = null;
        }
        Map S2 = set != null ? h.S2(new Pair(FIELD_PRODUCT_USAGE, g.v0(set))) : null;
        if (S2 == null) {
            S2 = g.o();
        }
        Map<String, Object> b02 = g.b0(b0, S2);
        Map S22 = str2 != null ? h.S2(new Pair(FIELD_SOURCE_TYPE, str2)) : null;
        if (S22 == null) {
            S22 = g.o();
        }
        Map<String, String> b03 = g.b0(g.b0(b02, S22), createTokenTypeParam(str2, type));
        if (threeDS2UiType != null) {
            map = h.S2(new Pair(FIELD_3DS2_UI_TYPE, threeDS2UiType.toString()));
        }
        if (map == null) {
            map = g.o();
        }
        return g.b0(b03, map);
    }

    public static /* synthetic */ Map createParams$default(AnalyticsRequestFactory analyticsRequestFactory, String str, Set set, String str2, Token.Type type, ThreeDS2UiType threeDS2UiType, int i, Object obj) {
        return analyticsRequestFactory.createParams(str, (i & 2) != 0 ? null : set, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : type, (i & 16) != 0 ? null : threeDS2UiType);
    }

    public static /* synthetic */ AnalyticsRequest createPaymentIntentConfirmation$payments_core_release$default(AnalyticsRequestFactory analyticsRequestFactory, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return analyticsRequestFactory.createPaymentIntentConfirmation$payments_core_release(str);
    }

    public static /* synthetic */ AnalyticsRequest createRequest$payments_core_release$default(AnalyticsRequestFactory analyticsRequestFactory, AnalyticsEvent analyticsEvent, Set set, String str, Token.Type type, ThreeDS2UiType threeDS2UiType, int i, Object obj) {
        return analyticsRequestFactory.createRequest$payments_core_release(analyticsEvent, (i & 2) != 0 ? null : set, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : type, (i & 16) != 0 ? null : threeDS2UiType);
    }

    public static /* synthetic */ AnalyticsRequest createSourceCreation$payments_core_release$default(AnalyticsRequestFactory analyticsRequestFactory, String str, Set set, int i, Object obj) {
        if ((i & 2) != 0) {
            set = null;
        }
        return analyticsRequestFactory.createSourceCreation$payments_core_release(str, set);
    }

    private final Map<String, Object> createStandardParams(String str) {
        Object obj;
        Pair[] pairArr = new Pair[8];
        pairArr[0] = new Pair(FIELD_ANALYTICS_UA, ANALYTICS_UA);
        pairArr[1] = new Pair("event", str);
        try {
            obj = this.publishableKeySupplier.invoke();
        } catch (Throwable th) {
            obj = h.l0(th);
        }
        if (obj instanceof Result.Failure) {
            obj = ApiRequest.Options.UNDEFINED_PUBLISHABLE_KEY;
        }
        pairArr[2] = new Pair(FIELD_PUBLISHABLE_KEY, obj);
        pairArr[3] = new Pair(FIELD_OS_NAME, Build.VERSION.CODENAME);
        pairArr[4] = new Pair(FIELD_OS_RELEASE, Build.VERSION.RELEASE);
        pairArr[5] = new Pair(FIELD_OS_VERSION, Integer.valueOf(Build.VERSION.SDK_INT));
        pairArr[6] = new Pair(FIELD_DEVICE_TYPE, DEVICE_TYPE);
        pairArr[7] = new Pair(FIELD_BINDINGS_VERSION, Stripe.VERSION_NAME);
        return g.N(pairArr);
    }

    private final Map<String, String> createTokenTypeParam(String str, Token.Type type) {
        Map<String, String> map = null;
        String code$payments_core_release = type != null ? type.getCode$payments_core_release() : str == null ? "unknown" : null;
        if (code$payments_core_release != null) {
            map = h.S2(new Pair(FIELD_TOKEN_TYPE, code$payments_core_release));
        }
        return map != null ? map : g.o();
    }

    public static /* synthetic */ Map createTokenTypeParam$default(AnalyticsRequestFactory analyticsRequestFactory, String str, Token.Type type, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            type = null;
        }
        return analyticsRequestFactory.createTokenTypeParam(str, type);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r2 = r2.applicationInfo;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.CharSequence getAppName(android.content.pm.PackageInfo r2, android.content.pm.PackageManager r3) {
        /*
            r1 = this;
            r0 = 0
            if (r2 == 0) goto L_0x000c
            android.content.pm.ApplicationInfo r2 = r2.applicationInfo
            if (r2 == 0) goto L_0x000c
            java.lang.CharSequence r2 = r2.loadLabel(r3)
            goto L_0x000d
        L_0x000c:
            r2 = r0
        L_0x000d:
            if (r2 == 0) goto L_0x0018
            boolean r3 = kotlin.text.StringsKt__IndentKt.o(r2)
            if (r3 == 0) goto L_0x0016
            goto L_0x0018
        L_0x0016:
            r3 = 0
            goto L_0x0019
        L_0x0018:
            r3 = 1
        L_0x0019:
            if (r3 != 0) goto L_0x001c
            r0 = r2
        L_0x001c:
            if (r0 == 0) goto L_0x001f
            goto L_0x0021
        L_0x001f:
            java.lang.String r0 = r1.packageName
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.AnalyticsRequestFactory.getAppName(android.content.pm.PackageInfo, android.content.pm.PackageManager):java.lang.CharSequence");
    }

    public final /* synthetic */ AnalyticsRequest create3ds2Challenge$payments_core_release(AnalyticsEvent analyticsEvent, String str) {
        i.e(analyticsEvent, "event");
        i.e(str, "uiTypeCode");
        return createRequest$payments_core_release$default(this, analyticsEvent, (Set) null, (String) null, (Token.Type) null, ThreeDS2UiType.Companion.fromUiTypeCode(str), 14, (Object) null);
    }

    public final /* synthetic */ AnalyticsRequest createAddSource$payments_core_release(Set<String> set, String str) {
        i.e(str, "sourceType");
        return createRequest$payments_core_release$default(this, AnalyticsEvent.CustomerAddSource, set, str, (Token.Type) null, (ThreeDS2UiType) null, 24, (Object) null);
    }

    public final Map<String, Object> createAppDataParams$payments_core_release() {
        PackageInfo packageInfo2;
        PackageManager packageManager2 = this.packageManager;
        if (packageManager2 == null || (packageInfo2 = this.packageInfo) == null) {
            return g.o();
        }
        return g.N(new Pair(FIELD_APP_NAME, getAppName(packageInfo2, packageManager2)), new Pair("app_version", Integer.valueOf(this.packageInfo.versionCode)));
    }

    public final /* synthetic */ AnalyticsRequest createAttachPaymentMethod$payments_core_release(Set<String> set) {
        return createRequest$payments_core_release$default(this, AnalyticsEvent.CustomerAttachPaymentMethod, set, (String) null, (Token.Type) null, (ThreeDS2UiType) null, 28, (Object) null);
    }

    public final /* synthetic */ AnalyticsRequest createDeleteSource$payments_core_release(Set<String> set) {
        return createRequest$payments_core_release$default(this, AnalyticsEvent.CustomerDeleteSource, set, (String) null, (Token.Type) null, (ThreeDS2UiType) null, 28, (Object) null);
    }

    public final /* synthetic */ AnalyticsRequest createDetachPaymentMethod$payments_core_release(Set<String> set) {
        return createRequest$payments_core_release$default(this, AnalyticsEvent.CustomerDetachPaymentMethod, set, (String) null, (Token.Type) null, (ThreeDS2UiType) null, 28, (Object) null);
    }

    public final /* synthetic */ AnalyticsRequest createPaymentIntentConfirmation$payments_core_release(String str) {
        return createRequest$payments_core_release$default(this, AnalyticsEvent.PaymentIntentConfirm, (Set) null, str, (Token.Type) null, (ThreeDS2UiType) null, 26, (Object) null);
    }

    public final /* synthetic */ AnalyticsRequest createPaymentMethodCreation$payments_core_release(PaymentMethodCreateParams.Type type, Set<String> set) {
        return createRequest$payments_core_release$default(this, AnalyticsEvent.PaymentMethodCreate, set, type != null ? type.getCode$payments_core_release() : null, (Token.Type) null, (ThreeDS2UiType) null, 24, (Object) null);
    }

    public final AnalyticsRequest createRequest$payments_core_release(PaymentSheetEvent paymentSheetEvent, SessionId sessionId, DeviceId deviceId) {
        i.e(paymentSheetEvent, "event");
        i.e(deviceId, "deviceId");
        Map c0 = g.c0(createParams$default(this, paymentSheetEvent.toString(), (Set) null, (String) null, (Token.Type) null, (ThreeDS2UiType) null, 30, (Object) null), new Pair(FIELD_DEVICE_ID, deviceId.getValue()));
        Map S2 = sessionId != null ? h.S2(new Pair("session_id", sessionId.getValue())) : null;
        if (S2 == null) {
            S2 = g.o();
        }
        return new AnalyticsRequest(g.b0(c0, S2));
    }

    public final /* synthetic */ AnalyticsRequest createSetupIntentConfirmation$payments_core_release(String str) {
        return createRequest$payments_core_release$default(this, AnalyticsEvent.SetupIntentConfirm, (Set) null, str, (Token.Type) null, (ThreeDS2UiType) null, 26, (Object) null);
    }

    public final /* synthetic */ AnalyticsRequest createSourceCreation$payments_core_release(String str, Set<String> set) {
        i.e(str, "sourceType");
        return createRequest$payments_core_release$default(this, AnalyticsEvent.SourceCreate, set, str, (Token.Type) null, (ThreeDS2UiType) null, 24, (Object) null);
    }

    public final /* synthetic */ AnalyticsRequest createTokenCreation$payments_core_release(Set<String> set, Token.Type type) {
        i.e(type, "tokenType");
        return createRequest$payments_core_release$default(this, AnalyticsEvent.TokenCreate, set, (String) null, type, (ThreeDS2UiType) null, 20, (Object) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnalyticsRequestFactory(Context context, final String str) {
        this(context, (a<String>) new a<String>() {
            public final String invoke() {
                return str;
            }
        });
        i.e(context, "context");
        i.e(str, "publishableKey");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnalyticsRequestFactory(android.content.Context r5, m0.n.a.a<java.lang.String> r6) {
        /*
            r4 = this;
            java.lang.String r0 = "context"
            m0.n.b.i.e(r5, r0)
            java.lang.String r0 = "publishableKeySupplier"
            m0.n.b.i.e(r6, r0)
            android.content.Context r0 = r5.getApplicationContext()
            java.lang.String r1 = "context.applicationContext"
            m0.n.b.i.d(r0, r1)
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            com.stripe.android.utils.ContextUtils r2 = com.stripe.android.utils.ContextUtils.INSTANCE
            android.content.Context r3 = r5.getApplicationContext()
            m0.n.b.i.d(r3, r1)
            android.content.pm.PackageInfo r2 = r2.getPackageInfo$payments_core_release(r3)
            android.content.Context r5 = r5.getApplicationContext()
            m0.n.b.i.d(r5, r1)
            java.lang.String r5 = r5.getPackageName()
            if (r5 == 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            java.lang.String r5 = ""
        L_0x0034:
            r4.<init>(r0, r2, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.AnalyticsRequestFactory.<init>(android.content.Context, m0.n.a.a):void");
    }

    public final /* synthetic */ AnalyticsRequest createRequest$payments_core_release(AnalyticsEvent analyticsEvent, Set<String> set, String str, Token.Type type, ThreeDS2UiType threeDS2UiType) {
        i.e(analyticsEvent, "event");
        return new AnalyticsRequest(createParams(analyticsEvent.toString(), set, str, type, threeDS2UiType));
    }
}
