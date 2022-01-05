package com.stripe.android.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import i0.j.f.p.h;
import kotlin.Metadata;
import kotlin.Result;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003*\u00020\u00028@@\u0000X\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/stripe/android/utils/ContextUtils;", "", "Landroid/content/Context;", "Landroid/content/pm/PackageInfo;", "getPackageInfo$payments_core_release", "(Landroid/content/Context;)Landroid/content/pm/PackageInfo;", "packageInfo", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ContextUtils.kt */
public final class ContextUtils {
    public static final ContextUtils INSTANCE = new ContextUtils();

    private ContextUtils() {
    }

    public final PackageInfo getPackageInfo$payments_core_release(Context context) {
        Object obj;
        i.e(context, "$this$packageInfo");
        try {
            obj = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (Throwable th) {
            obj = h.l0(th);
        }
        if (obj instanceof Result.Failure) {
            obj = null;
        }
        return (PackageInfo) obj;
    }
}
