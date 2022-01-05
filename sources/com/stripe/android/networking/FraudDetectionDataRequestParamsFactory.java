package com.stripe.android.networking;

import android.os.Build;
import android.util.DisplayMetrics;
import com.stripe.android.Stripe;
import i0.d.a.a.a;
import i0.j.f.p.h;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import m0.j.g;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB+\b\u0001\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0018\u0010\u0019B\u0011\b\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u0018\u0010\u001cJ\u001b\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\r\u0010\tR\u0016\u0010\u000f\u001a\u00020\u00038\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u00038\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u00038\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0010R\u0016\u0010\u0016\u001a\u00020\u00038\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0010R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/networking/FraudDetectionDataRequestParamsFactory;", "", "", "", "createFirstMap", "()Ljava/util/Map;", "Lcom/stripe/android/networking/FraudDetectionData;", "fraudDetectionData", "createSecondMap", "(Lcom/stripe/android/networking/FraudDetectionData;)Ljava/util/Map;", "value", "createValueMap", "(Ljava/lang/String;)Ljava/util/Map;", "createParams$payments_core_release", "createParams", "timeZone", "Ljava/lang/String;", "screen", "Landroid/util/DisplayMetrics;", "displayMetrics", "Landroid/util/DisplayMetrics;", "packageName", "androidVersionString", "versionName", "<init>", "(Landroid/util/DisplayMetrics;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: FraudDetectionDataRequestParamsFactory.kt */
public final class FraudDetectionDataRequestParamsFactory {
    private static final Companion Companion = new Companion((f) null);
    private final String androidVersionString;
    private final DisplayMetrics displayMetrics;
    private final String packageName;
    private final String screen;
    private final String timeZone;
    private final String versionName;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/networking/FraudDetectionDataRequestParamsFactory$Companion;", "", "", "createTimezone", "()Ljava/lang/String;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: FraudDetectionDataRequestParamsFactory.kt */
    public static final class Companion {
        private Companion() {
        }

        /* access modifiers changed from: private */
        public final String createTimezone() {
            TimeUnit timeUnit = TimeUnit.MINUTES;
            TimeZone timeZone = TimeZone.getDefault();
            i.d(timeZone, "TimeZone.getDefault()");
            int convert = (int) timeUnit.convert((long) timeZone.getRawOffset(), TimeUnit.MILLISECONDS);
            if (convert % 60 == 0) {
                return String.valueOf(convert / 60);
            }
            String bigDecimal = new BigDecimal(convert).setScale(2, 6).divide(new BigDecimal(60), new MathContext(2)).setScale(2, 6).toString();
            i.d(bigDecimal, "decHours.toString()");
            return bigDecimal;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public FraudDetectionDataRequestParamsFactory(DisplayMetrics displayMetrics2, String str, String str2, String str3) {
        i.e(displayMetrics2, "displayMetrics");
        i.e(str, "packageName");
        i.e(str3, "timeZone");
        this.displayMetrics = displayMetrics2;
        this.packageName = str;
        this.versionName = str2;
        this.timeZone = str3;
        StringBuilder sb = new StringBuilder();
        sb.append(displayMetrics2.widthPixels);
        sb.append("w_");
        sb.append(displayMetrics2.heightPixels);
        sb.append("h_");
        this.screen = a.u0(sb, displayMetrics2.densityDpi, "dpi");
        StringBuilder P0 = a.P0("Android ");
        P0.append(Build.VERSION.RELEASE);
        P0.append(' ');
        P0.append(Build.VERSION.CODENAME);
        P0.append(' ');
        P0.append(Build.VERSION.SDK_INT);
        this.androidVersionString = P0.toString();
    }

    private final Map<String, Object> createFirstMap() {
        String locale = Locale.getDefault().toString();
        i.d(locale, "Locale.getDefault().toString()");
        return g.N(new Pair("c", createValueMap(locale)), new Pair("d", createValueMap(this.androidVersionString)), new Pair("f", createValueMap(this.screen)), new Pair("g", createValueMap(this.timeZone)));
    }

    private final Map<String, Object> createSecondMap(FraudDetectionData fraudDetectionData) {
        Pair[] pairArr = new Pair[9];
        Map map = null;
        String muid$payments_core_release = fraudDetectionData != null ? fraudDetectionData.getMuid$payments_core_release() : null;
        String str = "";
        if (muid$payments_core_release == null) {
            muid$payments_core_release = str;
        }
        pairArr[0] = new Pair("d", muid$payments_core_release);
        String sid$payments_core_release = fraudDetectionData != null ? fraudDetectionData.getSid$payments_core_release() : null;
        if (sid$payments_core_release != null) {
            str = sid$payments_core_release;
        }
        pairArr[1] = new Pair("e", str);
        pairArr[2] = new Pair("k", this.packageName);
        pairArr[3] = new Pair("o", Build.VERSION.RELEASE);
        pairArr[4] = new Pair("p", Integer.valueOf(Build.VERSION.SDK_INT));
        pairArr[5] = new Pair("q", Build.MANUFACTURER);
        pairArr[6] = new Pair("r", Build.BRAND);
        pairArr[7] = new Pair("s", Build.MODEL);
        pairArr[8] = new Pair("t", Build.TAGS);
        Map N = g.N(pairArr);
        String str2 = this.versionName;
        if (str2 != null) {
            map = h.S2(new Pair("l", str2));
        }
        if (map == null) {
            map = g.o();
        }
        return g.b0(N, map);
    }

    private final Map<String, Object> createValueMap(String str) {
        return h.S2(new Pair("v", str));
    }

    public final Map<String, Object> createParams$payments_core_release(FraudDetectionData fraudDetectionData) {
        return g.N(new Pair("v2", 1), new Pair("tag", Stripe.VERSION_NAME), new Pair("src", "android-sdk"), new Pair("a", createFirstMap()), new Pair("b", createSecondMap(fraudDetectionData)));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FraudDetectionDataRequestParamsFactory(android.content.Context r4) {
        /*
            r3 = this;
            java.lang.String r0 = "context"
            m0.n.b.i.e(r4, r0)
            android.content.res.Resources r0 = r4.getResources()
            java.lang.String r1 = "context.resources"
            m0.n.b.i.d(r0, r1)
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            java.lang.String r1 = "context.resources.displayMetrics"
            m0.n.b.i.d(r0, r1)
            java.lang.String r1 = r4.getPackageName()
            if (r1 == 0) goto L_0x001e
            goto L_0x0020
        L_0x001e:
            java.lang.String r1 = ""
        L_0x0020:
            com.stripe.android.utils.ContextUtils r2 = com.stripe.android.utils.ContextUtils.INSTANCE
            android.content.pm.PackageInfo r4 = r2.getPackageInfo$payments_core_release(r4)
            if (r4 == 0) goto L_0x002b
            java.lang.String r4 = r4.versionName
            goto L_0x002c
        L_0x002b:
            r4 = 0
        L_0x002c:
            com.stripe.android.networking.FraudDetectionDataRequestParamsFactory$Companion r2 = Companion
            java.lang.String r2 = r2.createTimezone()
            r3.<init>(r0, r1, r4, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.FraudDetectionDataRequestParamsFactory.<init>(android.content.Context):void");
    }
}
