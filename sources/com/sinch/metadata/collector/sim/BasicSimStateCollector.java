package com.sinch.metadata.collector.sim;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.sinch.metadata.model.sim.SimState;
import i0.j.f.p.h;
import java.util.Objects;
import m0.c;
import m0.n.b.i;

/* compiled from: BasicSimStateCollector.kt */
public final class BasicSimStateCollector {
    public final c a = h.H2(new BasicSimStateCollector$telephonyManager$2(this));
    public final Context b;

    public BasicSimStateCollector(Context context) {
        i.e(context, "context");
        this.b = context;
    }

    public Object a() {
        SimState.Companion companion = SimState.Companion;
        int simState = ((TelephonyManager) this.a.getValue()).getSimState();
        Objects.requireNonNull(companion);
        if (simState == 0) {
            return SimState.UNKNOWN;
        }
        if (simState == 1) {
            return SimState.ABSENT;
        }
        if (simState == 2) {
            return SimState.PIN_REQUIRED;
        }
        if (simState == 3) {
            return SimState.PUK_REQUIRED;
        }
        if (simState == 4) {
            return SimState.NETWORK_LOCKED;
        }
        if (simState != 5) {
            return SimState.INVALID;
        }
        return SimState.READY;
    }
}
