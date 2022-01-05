package i0.e.b.z2;

import android.content.Context;
import com.afollestad.assent.Permission;
import h0.b0.v;
import m0.n.b.i;

/* compiled from: PermissionsDelegate.kt */
public final class d {
    public final Context a;

    public d(Context context) {
        i.e(context, "context");
        this.a = context;
    }

    public final boolean a() {
        return v.E0(this.a, Permission.RECORD_AUDIO);
    }
}
