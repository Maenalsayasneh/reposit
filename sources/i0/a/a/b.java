package i0.a.a;

import androidx.fragment.app.Fragment;
import com.afollestad.assent.FragmentsKt$askForPermissions$1;
import com.afollestad.assent.Permission;
import com.afollestad.assent.rationale.RationaleHandler;
import h0.b0.v;
import h0.o.a.k;
import i0.a.a.f.c;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: Fragments.kt */
public final class b {
    public static void a(Fragment fragment, Permission[] permissionArr, int i, RationaleHandler rationaleHandler, l lVar, int i2) {
        RationaleHandler rationaleHandler2;
        if ((i2 & 2) != 0) {
            i = 60;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            rationaleHandler = null;
        }
        i.f(fragment, "$this$askForPermissions");
        i.f(permissionArr, "permissions");
        i.f(lVar, "callback");
        k activity = fragment.getActivity();
        if (activity != null) {
            i.b(activity, "activity ?: error(\"Fragment not attached: $this\")");
            c cVar = new c(activity, new d(activity));
            FragmentsKt$askForPermissions$1 fragmentsKt$askForPermissions$1 = FragmentsKt$askForPermissions$1.c;
            if (rationaleHandler != null) {
                i.f(fragment, "owner");
                rationaleHandler.j = fragment;
                rationaleHandler2 = rationaleHandler;
            } else {
                rationaleHandler2 = null;
            }
            v.k2(fragment, fragmentsKt$askForPermissions$1, permissionArr, i3, cVar, rationaleHandler2, lVar);
            return;
        }
        throw new IllegalStateException(("Fragment not attached: " + fragment).toString());
    }
}
