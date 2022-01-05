package com.sinch.metadata.collector;

import android.content.Context;
import com.sinch.verification.utils.permission.Permission;
import com.sinch.verification.utils.permission.PermissionUtilsKt$runIfPermissionGranted$1;
import i0.j.f.p.h;
import i0.n.a.c;
import m0.n.b.i;

/* compiled from: PermissionProtectedMetadataCollector.kt */
public abstract class PermissionProtectedMetadataCollector<Metadata> {
    public final c a = h.M2(this);
    public final Context b;
    public final Permission c;

    public PermissionProtectedMetadataCollector(Context context, Permission permission) {
        i.e(context, "context");
        i.e(permission, "permission");
        this.b = context;
        this.c = permission;
    }

    public final Metadata a() {
        if (!h.t2(this.b, this.c)) {
            c cVar = this.a;
            Permission permission = this.c;
            String c2 = c();
            i.e(permission, "missingPermission");
            i.e(c2, "metadataName");
            h.D4(cVar, "Missing " + permission + " to collect metadata: " + c2, (Throwable) null, 2, (Object) null);
        }
        return h.H3(this.b, this.c, new PermissionProtectedMetadataCollector$collect$1(this), PermissionUtilsKt$runIfPermissionGranted$1.c);
    }

    public abstract Metadata b();

    public abstract String c();
}
