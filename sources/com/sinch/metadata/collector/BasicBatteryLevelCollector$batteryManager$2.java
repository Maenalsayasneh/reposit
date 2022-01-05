package com.sinch.metadata.collector;

import android.os.BatteryManager;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;

/* compiled from: BasicBatteryLevelCollector.kt */
public final class BasicBatteryLevelCollector$batteryManager$2 extends Lambda implements a<BatteryManager> {
    public final /* synthetic */ BasicBatteryLevelCollector c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasicBatteryLevelCollector$batteryManager$2(BasicBatteryLevelCollector basicBatteryLevelCollector) {
        super(0);
        this.c = basicBatteryLevelCollector;
    }

    public Object invoke() {
        Object systemService = this.c.b.getSystemService("batterymanager");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.os.BatteryManager");
        return (BatteryManager) systemService;
    }
}
