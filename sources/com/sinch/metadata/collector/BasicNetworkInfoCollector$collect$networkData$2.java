package com.sinch.metadata.collector;

import com.sinch.verification.utils.permission.Permission;
import i0.j.f.p.h;
import i0.n.a.c;
import kotlin.jvm.internal.FunctionReferenceImpl;
import m0.i;
import m0.n.a.a;

/* compiled from: BasicNetworkInfoCollector.kt */
public final /* synthetic */ class BasicNetworkInfoCollector$collect$networkData$2 extends FunctionReferenceImpl implements a<i> {
    public BasicNetworkInfoCollector$collect$networkData$2(BasicNetworkInfoCollector basicNetworkInfoCollector) {
        super(0, basicNetworkInfoCollector, BasicNetworkInfoCollector.class, "emitPermissionWarning", "emitPermissionWarning()V", 0);
    }

    public Object invoke() {
        c cVar = ((BasicNetworkInfoCollector) this.receiver).a;
        Permission permission = Permission.ACCESS_NETWORK_STATE;
        m0.n.b.i.e(permission, "missingPermission");
        m0.n.b.i.e("NetworkData", "metadataName");
        h.D4(cVar, "Missing " + permission + " to collect metadata: " + "NetworkData", (Throwable) null, 2, (Object) null);
        return i.a;
    }
}
