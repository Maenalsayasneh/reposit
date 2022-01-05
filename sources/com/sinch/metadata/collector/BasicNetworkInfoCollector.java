package com.sinch.metadata.collector;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.sinch.metadata.model.network.NetworkData;
import com.sinch.metadata.model.network.NetworkInfo;
import com.sinch.verification.utils.permission.Permission;
import i0.j.f.p.h;
import i0.n.a.c;
import m0.n.b.i;

/* compiled from: BasicNetworkInfoCollector.kt */
public final class BasicNetworkInfoCollector {
    public final c a = h.M2(this);
    public final m0.c b = h.H2(new BasicNetworkInfoCollector$telephonyManager$2(this));
    public final m0.c c = h.H2(new BasicNetworkInfoCollector$connectivityManager$2(this));
    public final Context d;

    public BasicNetworkInfoCollector(Context context) {
        i.e(context, "context");
        this.d = context;
    }

    public Object a() {
        return new NetworkInfo(Boolean.valueOf(((TelephonyManager) this.b.getValue()).isVoiceCapable()), (NetworkData) h.H3(this.d, Permission.ACCESS_NETWORK_STATE, new BasicNetworkInfoCollector$collect$networkData$1(this), new BasicNetworkInfoCollector$collect$networkData$2(this)));
    }
}
