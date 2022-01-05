package com.stripe.android.stripe3ds2.init;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.DisplayMetrics;
import com.stripe.android.stripe3ds2.utils.Supplier;
import h0.i.e.c;
import i0.j.f.p.h;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Pair;
import m0.j.g;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/stripe3ds2/init/DeviceDataFactoryImpl;", "Lcom/stripe/android/stripe3ds2/init/DeviceDataFactory;", "", "", "", "create", "()Ljava/util/Map;", "Landroid/util/DisplayMetrics;", "displayMetrics", "Landroid/util/DisplayMetrics;", "Lcom/stripe/android/stripe3ds2/utils/Supplier;", "Lcom/stripe/android/stripe3ds2/init/HardwareId;", "hardwareIdSupplier", "Lcom/stripe/android/stripe3ds2/utils/Supplier;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Lcom/stripe/android/stripe3ds2/utils/Supplier;)V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: DeviceDataFactoryImpl.kt */
public final class DeviceDataFactoryImpl implements DeviceDataFactory {
    private final DisplayMetrics displayMetrics;
    private final Supplier<HardwareId> hardwareIdSupplier;

    public DeviceDataFactoryImpl(Context context, Supplier<HardwareId> supplier) {
        i.e(context, "context");
        i.e(supplier, "hardwareIdSupplier");
        this.hardwareIdSupplier = supplier;
        Resources resources = context.getResources();
        i.d(resources, "context.resources");
        DisplayMetrics displayMetrics2 = resources.getDisplayMetrics();
        i.d(displayMetrics2, "context.resources.displayMetrics");
        this.displayMetrics = displayMetrics2;
    }

    public Map<String, Object> create() {
        Map map;
        String value = this.hardwareIdSupplier.get().getValue();
        Pair pair = new Pair(DeviceParam.PARAM_PLATFORM.toString(), "Android");
        boolean z = false;
        String deviceParam = DeviceParam.PARAM_LOCALE.toString();
        Locale[] localeArr = {Locale.getDefault()};
        String deviceParam2 = DeviceParam.PARAM_TIME_ZONE.toString();
        TimeZone timeZone = TimeZone.getDefault();
        i.d(timeZone, "TimeZone.getDefault()");
        String deviceParam3 = DeviceParam.PARAM_SCREEN_RESOLUTION.toString();
        String format = String.format(Locale.ROOT, "%sx%s", Arrays.copyOf(new Object[]{Integer.valueOf(this.displayMetrics.heightPixels), Integer.valueOf(this.displayMetrics.widthPixels)}, 2));
        i.d(format, "java.lang.String.format(locale, format, *args)");
        Map N = g.N(pair, new Pair(DeviceParam.PARAM_DEVICE_MODEL.toString(), Build.MODEL), new Pair(DeviceParam.PARAM_OS_NAME.toString(), Build.VERSION.CODENAME), new Pair(DeviceParam.PARAM_OS_VERSION.toString(), Build.VERSION.RELEASE), new Pair(deviceParam, c.a(localeArr).a.a()), new Pair(deviceParam2, timeZone.getDisplayName()), new Pair(deviceParam3, format));
        if (value.length() > 0) {
            z = true;
        }
        if (z) {
            map = h.S2(new Pair(DeviceParam.PARAM_HARDWARE_ID.toString(), value));
        } else {
            map = g.o();
        }
        return g.b0(N, map);
    }
}
