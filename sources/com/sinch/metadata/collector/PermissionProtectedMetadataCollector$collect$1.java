package com.sinch.metadata.collector;

import kotlin.jvm.internal.FunctionReferenceImpl;
import m0.n.a.a;

/* compiled from: PermissionProtectedMetadataCollector.kt */
public final /* synthetic */ class PermissionProtectedMetadataCollector$collect$1 extends FunctionReferenceImpl implements a<Metadata> {
    public PermissionProtectedMetadataCollector$collect$1(PermissionProtectedMetadataCollector permissionProtectedMetadataCollector) {
        super(0, permissionProtectedMetadataCollector, PermissionProtectedMetadataCollector.class, "collectWithPermissionsGranted", "collectWithPermissionsGranted()Ljava/lang/Object;", 0);
    }

    public final Metadata invoke() {
        return ((PermissionProtectedMetadataCollector) this.receiver).b();
    }
}
