package com.afollestad.assent;

import androidx.fragment.app.Fragment;
import com.afollestad.assent.internal.Assent;
import com.afollestad.assent.internal.PermissionFragment;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: Fragments.kt */
public final class FragmentsKt$askForPermissions$1 extends Lambda implements l<Fragment, PermissionFragment> {
    public static final FragmentsKt$askForPermissions$1 c = new FragmentsKt$askForPermissions$1();

    public FragmentsKt$askForPermissions$1() {
        super(1);
    }

    public Object invoke(Object obj) {
        Fragment fragment = (Fragment) obj;
        i.f(fragment, "fragment");
        Assent assent = Assent.c;
        return Assent.a(fragment);
    }
}
