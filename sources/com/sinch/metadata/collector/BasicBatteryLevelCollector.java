package com.sinch.metadata.collector;

import android.content.Context;
import android.os.BatteryManager;
import i0.j.f.p.h;
import m0.c;
import m0.n.b.i;

/* compiled from: BasicBatteryLevelCollector.kt */
public final class BasicBatteryLevelCollector {
    public final c a = h.H2(new BasicBatteryLevelCollector$batteryManager$2(this));
    public final Context b;

    public BasicBatteryLevelCollector(Context context) {
        i.e(context, "context");
        this.b = context;
    }

    public Object a() {
        int intProperty = ((BatteryManager) this.a.getValue()).getIntProperty(4);
        StringBuilder sb = new StringBuilder();
        sb.append(intProperty);
        sb.append('%');
        return sb.toString();
    }
}
