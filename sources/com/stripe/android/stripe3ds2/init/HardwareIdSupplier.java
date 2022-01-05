package com.stripe.android.stripe3ds2.init;

import android.annotation.SuppressLint;
import android.content.Context;
import android.provider.Settings;
import com.stripe.android.stripe3ds2.utils.Supplier;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/stripe/android/stripe3ds2/init/HardwareIdSupplier;", "Lcom/stripe/android/stripe3ds2/utils/Supplier;", "Lcom/stripe/android/stripe3ds2/init/HardwareId;", "get", "()Lcom/stripe/android/stripe3ds2/init/HardwareId;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: HardwareIdSupplier.kt */
public final class HardwareIdSupplier implements Supplier<HardwareId> {
    private final Context context;

    public HardwareIdSupplier(Context context2) {
        i.e(context2, "context");
        Context applicationContext = context2.getApplicationContext();
        i.d(applicationContext, "context.applicationContext");
        this.context = applicationContext;
    }

    @SuppressLint({"HardwareIds"})
    public HardwareId get() {
        String string = Settings.Secure.getString(this.context.getContentResolver(), "android_id");
        if (string == null) {
            string = "";
        }
        return new HardwareId(string);
    }
}
