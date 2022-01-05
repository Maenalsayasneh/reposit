package com.stripe.android.stripe3ds2.views;

import com.stripe.android.stripe3ds2.R;
import kotlin.Metadata;
import m0.n.b.f;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0001\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B)\b\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fj\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/Brand;", "", "", "drawableResId", "I", "getDrawableResId$3ds2sdk_release", "()I", "", "directoryServerName", "Ljava/lang/String;", "getDirectoryServerName$3ds2sdk_release", "()Ljava/lang/String;", "nameResId", "Ljava/lang/Integer;", "getNameResId$3ds2sdk_release", "()Ljava/lang/Integer;", "<init>", "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/Integer;)V", "Companion", "Visa", "Mastercard", "Amex", "Discover", "Unknown", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: Brand.kt */
public enum Brand {
    Visa("visa", R.drawable.stripe_3ds2_ic_visa, Integer.valueOf(R.string.stripe_3ds2_brand_visa)),
    Mastercard("mastercard", R.drawable.stripe_3ds2_ic_mastercard, Integer.valueOf(R.string.stripe_3ds2_brand_mastercard)),
    Amex("american_express", R.drawable.stripe_3ds2_ic_amex, Integer.valueOf(R.string.stripe_3ds2_brand_amex)),
    Discover("discover", R.drawable.stripe_3ds2_ic_discover, Integer.valueOf(R.string.stripe_3ds2_brand_discover)),
    Unknown("unknown", R.drawable.stripe_3ds2_ic_unknown, (String) null);
    
    public static final Companion Companion = null;
    private final String directoryServerName;
    private final int drawableResId;
    private final Integer nameResId;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/Brand$Companion;", "", "", "directoryServerName", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "errorReporter", "Lcom/stripe/android/stripe3ds2/views/Brand;", "lookup$3ds2sdk_release", "(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;)Lcom/stripe/android/stripe3ds2/views/Brand;", "lookup", "<init>", "()V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: Brand.kt */
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARNING: Failed to insert additional move for type inference */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.stripe.android.stripe3ds2.views.Brand lookup$3ds2sdk_release(java.lang.String r10, com.stripe.android.stripe3ds2.observability.ErrorReporter r11) {
            /*
                r9 = this;
                java.lang.String r0 = "directoryServerName"
                m0.n.b.i.e(r10, r0)
                java.lang.String r0 = "errorReporter"
                m0.n.b.i.e(r11, r0)
                com.stripe.android.stripe3ds2.views.Brand[] r0 = com.stripe.android.stripe3ds2.views.Brand.values()
                r1 = 0
                r2 = r1
            L_0x0010:
                r3 = 0
                r4 = 5
                if (r2 >= r4) goto L_0x002d
                r5 = r0[r2]
                java.lang.String r6 = r5.getDirectoryServerName$3ds2sdk_release()
                java.lang.CharSequence r7 = kotlin.text.StringsKt__IndentKt.X(r10)
                java.lang.String r7 = r7.toString()
                r8 = 1
                boolean r6 = kotlin.text.StringsKt__IndentKt.f(r6, r7, r8)
                if (r6 == 0) goto L_0x002a
                goto L_0x002e
            L_0x002a:
                int r2 = r2 + 1
                goto L_0x0010
            L_0x002d:
                r5 = r3
            L_0x002e:
                if (r5 == 0) goto L_0x0031
                goto L_0x0070
            L_0x0031:
                com.stripe.android.stripe3ds2.views.Brand[] r0 = com.stripe.android.stripe3ds2.views.Brand.values()
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>(r4)
            L_0x003a:
                if (r1 >= r4) goto L_0x0048
                r5 = r0[r1]
                java.lang.String r5 = r5.getDirectoryServerName$3ds2sdk_release()
                r2.add(r5)
                int r1 = r1 + 1
                goto L_0x003a
            L_0x0048:
                com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException r0 = new com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r4 = "Directory server name '"
                r1.append(r4)
                r1.append(r10)
                java.lang.String r10 = "' is not supported. Must be one of "
                r1.append(r10)
                r1.append(r2)
                r10 = 46
                r1.append(r10)
                java.lang.String r10 = r1.toString()
                r1 = 2
                r0.<init>(r10, r3, r1, r3)
                java.lang.Object r5 = i0.j.f.p.h.l0(r0)
            L_0x0070:
                java.lang.Throwable r10 = kotlin.Result.a(r5)
                if (r10 == 0) goto L_0x0079
                r11.reportError(r10)
            L_0x0079:
                com.stripe.android.stripe3ds2.views.Brand r10 = com.stripe.android.stripe3ds2.views.Brand.Unknown
                boolean r11 = r5 instanceof kotlin.Result.Failure
                if (r11 == 0) goto L_0x0080
                r5 = r10
            L_0x0080:
                com.stripe.android.stripe3ds2.views.Brand r5 = (com.stripe.android.stripe3ds2.views.Brand) r5
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.views.Brand.Companion.lookup$3ds2sdk_release(java.lang.String, com.stripe.android.stripe3ds2.observability.ErrorReporter):com.stripe.android.stripe3ds2.views.Brand");
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new Companion((f) null);
    }

    private Brand(String str, int i, Integer num) {
        this.directoryServerName = str;
        this.drawableResId = i;
        this.nameResId = num;
    }

    public final String getDirectoryServerName$3ds2sdk_release() {
        return this.directoryServerName;
    }

    public final int getDrawableResId$3ds2sdk_release() {
        return this.drawableResId;
    }

    public final Integer getNameResId$3ds2sdk_release() {
        return this.nameResId;
    }
}
