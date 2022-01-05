package com.stripe.android.payments;

import android.content.Context;
import i0.d.a.a.a;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0003\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\u0004J\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0011\u001a\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/payments/DefaultReturnUrl;", "", "", "component1", "()Ljava/lang/String;", "packageName", "copy", "(Ljava/lang/String;)Lcom/stripe/android/payments/DefaultReturnUrl;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "getValue", "value", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: DefaultReturnUrl.kt */
public final class DefaultReturnUrl {
    public static final Companion Companion = new Companion((f) null);
    private final String packageName;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/stripe/android/payments/DefaultReturnUrl$Companion;", "", "Landroid/content/Context;", "context", "Lcom/stripe/android/payments/DefaultReturnUrl;", "create", "(Landroid/content/Context;)Lcom/stripe/android/payments/DefaultReturnUrl;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: DefaultReturnUrl.kt */
    public static final class Companion {
        private Companion() {
        }

        public final DefaultReturnUrl create(Context context) {
            i.e(context, "context");
            String packageName = context.getPackageName();
            i.d(packageName, "context.packageName");
            return new DefaultReturnUrl(packageName);
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public DefaultReturnUrl(String str) {
        i.e(str, "packageName");
        this.packageName = str;
    }

    private final String component1() {
        return this.packageName;
    }

    public static /* synthetic */ DefaultReturnUrl copy$default(DefaultReturnUrl defaultReturnUrl, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = defaultReturnUrl.packageName;
        }
        return defaultReturnUrl.copy(str);
    }

    public final DefaultReturnUrl copy(String str) {
        i.e(str, "packageName");
        return new DefaultReturnUrl(str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof DefaultReturnUrl) && i.a(this.packageName, ((DefaultReturnUrl) obj).packageName);
        }
        return true;
    }

    public final String getValue() {
        StringBuilder P0 = a.P0("stripesdk://payment_return_url/");
        P0.append(this.packageName);
        return P0.toString();
    }

    public int hashCode() {
        String str = this.packageName;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return a.y0(a.P0("DefaultReturnUrl(packageName="), this.packageName, ")");
    }
}
