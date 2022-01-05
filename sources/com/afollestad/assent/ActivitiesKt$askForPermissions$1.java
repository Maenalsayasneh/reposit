package com.afollestad.assent;

import android.app.Activity;
import com.afollestad.assent.internal.Assent;
import com.afollestad.assent.internal.Assent$Companion$ensureFragment$1$2$1;
import com.afollestad.assent.internal.PermissionFragment;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import h0.b0.v;
import h0.o.a.k;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: Activities.kt */
public final class ActivitiesKt$askForPermissions$1 extends Lambda implements l<Activity, PermissionFragment> {
    public static final ActivitiesKt$askForPermissions$1 c = new ActivitiesKt$askForPermissions$1();

    public ActivitiesKt$askForPermissions$1() {
        super(1);
    }

    public Object invoke(Object obj) {
        PermissionFragment permissionFragment;
        Activity activity = (Activity) obj;
        i.f(activity, "activity");
        Assent assent = Assent.c;
        i.f(activity, "context");
        Assent b = Assent.b();
        if (activity instanceof k) {
            if (b.f == null) {
                permissionFragment = Assent.b.invoke();
                v.T0(permissionFragment, "Created new PermissionFragment for Context", new Object[0]);
                v.o2((k) activity, new Assent$Companion$ensureFragment$1$2$1(permissionFragment));
            } else {
                i.f(b, "$this$log");
                i.f("Re-using PermissionFragment for Context", InstabugDbContract.BugEntry.COLUMN_MESSAGE);
                i.f(new Object[0], "args");
                permissionFragment = b.f;
            }
            b.f = permissionFragment;
            if (permissionFragment != null) {
                return permissionFragment;
            }
            throw new IllegalStateException("impossible!".toString());
        }
        throw new IllegalArgumentException(("Unable to ensure the permission Fragment on Context " + activity).toString());
    }
}
