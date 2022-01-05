package com.afollestad.assent.internal;

import androidx.fragment.app.Fragment;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import h0.b0.v;
import i0.a.a.e.b;
import m0.n.a.a;
import m0.n.b.i;

/* compiled from: Assent.kt */
public final class Assent {
    public static Assent a;
    public static a<PermissionFragment> b = Assent$Companion$fragmentCreator$1.c;
    public static final Assent c = null;
    public final b<i0.a.a.e.a> d = new b<>();
    public i0.a.a.e.a e;
    public PermissionFragment f;

    public static final PermissionFragment a(Fragment fragment) {
        PermissionFragment permissionFragment;
        i.f(fragment, "context");
        Assent b2 = b();
        if (b2.f == null) {
            permissionFragment = b.invoke();
            v.T0(permissionFragment, "Created new PermissionFragment for parent Fragment", new Object[0]);
            v.n2(fragment, new Assent$Companion$ensureFragment$2$1$1(permissionFragment));
        } else {
            i.f(b2, "$this$log");
            i.f("Re-using PermissionFragment for parent Fragment", InstabugDbContract.BugEntry.COLUMN_MESSAGE);
            i.f(new Object[0], "args");
            permissionFragment = b2.f;
        }
        b2.f = permissionFragment;
        if (permissionFragment != null) {
            return permissionFragment;
        }
        throw new IllegalStateException("impossible!".toString());
    }

    public static final Assent b() {
        Assent assent = a;
        if (assent != null) {
            return assent;
        }
        Assent assent2 = new Assent();
        a = assent2;
        return assent2;
    }
}
