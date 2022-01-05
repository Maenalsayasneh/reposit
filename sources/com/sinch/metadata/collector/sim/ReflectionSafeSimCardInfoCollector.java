package com.sinch.metadata.collector.sim;

import android.content.Context;
import android.os.Build;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import com.sinch.metadata.collector.PermissionProtectedMetadataCollector;
import com.sinch.metadata.model.sim.OperatorInfo;
import com.sinch.metadata.model.sim.SimCardInfo;
import com.sinch.metadata.model.sim.SimMetadata;
import com.sinch.verification.utils.permission.Permission;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import m0.c;
import m0.n.b.i;

/* compiled from: ReflectionSafeSimCardInfoCollector.kt */
public final class ReflectionSafeSimCardInfoCollector extends PermissionProtectedMetadataCollector<List<? extends SimCardInfo>> {
    public final c d;
    public final String e = "Sim Card information";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReflectionSafeSimCardInfoCollector(Context context) {
        super(context, Permission.READ_PHONE_STATE);
        i.e(context, "context");
        this.d = h.H2(new ReflectionSafeSimCardInfoCollector$subscriptionManager$2(context));
    }

    public Object b() {
        List<SubscriptionInfo> activeSubscriptionInfoList = ((SubscriptionManager) this.d.getValue()).getActiveSubscriptionInfoList();
        if (activeSubscriptionInfoList == null) {
            return EmptyList.c;
        }
        ArrayList arrayList = new ArrayList(h.K(activeSubscriptionInfoList, 10));
        for (SubscriptionInfo subscriptionInfo : activeSubscriptionInfoList) {
            i.d(subscriptionInfo, "it");
            String countryIso = subscriptionInfo.getCountryIso();
            i.d(countryIso, "it.countryIso");
            String obj = subscriptionInfo.getCarrierName().toString();
            boolean isNetworkRoaming = ((SubscriptionManager) this.d.getValue()).isNetworkRoaming(subscriptionInfo.getSubscriptionId());
            int i = Build.VERSION.SDK_INT;
            boolean z = true;
            String mccString = i >= 29 ? subscriptionInfo.getMccString() : String.valueOf(subscriptionInfo.getMcc());
            if (i < 29) {
                z = false;
            }
            arrayList.add(new SimCardInfo((SimMetadata) null, new OperatorInfo(countryIso, obj, isNetworkRoaming, mccString, z ? subscriptionInfo.getMncString() : String.valueOf(subscriptionInfo.getMnc()))));
        }
        return arrayList;
    }

    public String c() {
        return this.e;
    }
}
