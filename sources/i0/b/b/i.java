package i0.b.b;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import m0.o.c;
import m0.r.k;

/* compiled from: MavericksExtensions.kt */
public final class i implements c<Fragment, V> {
    public V a;

    public Object getValue(Object obj, k kVar) {
        Fragment fragment = (Fragment) obj;
        m0.n.b.i.e(fragment, "thisRef");
        m0.n.b.i.e(kVar, "property");
        if (this.a == null) {
            Bundle arguments = fragment.getArguments();
            if (arguments != null) {
                m0.n.b.i.d(arguments, "thisRef.arguments\n      … no fragment arguments!\")");
                V v = arguments.get("mavericks:arg");
                if (v != null) {
                    this.a = v;
                } else {
                    throw new IllegalArgumentException("MvRx arguments not found at key _root_ide_package_.com.airbnb.mvrx.Mavericks.KEY_ARG!");
                }
            } else {
                throw new IllegalArgumentException("There are no fragment arguments!");
            }
        }
        V v2 = this.a;
        if (v2 != null) {
            return v2;
        }
        throw new IllegalArgumentException("");
    }
}
