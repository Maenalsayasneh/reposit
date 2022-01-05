package i0.a.a.f;

import android.app.Activity;
import androidx.core.app.ActivityCompat;
import com.afollestad.assent.Permission;
import i0.d.a.a.a;
import m0.n.b.i;

/* compiled from: ShouldShowRationale.kt */
public final class c implements d {
    public final Activity a;
    public final i0.a.a.c b;

    public c(Activity activity, i0.a.a.c cVar) {
        i.f(activity, "activity");
        i.f(cVar, "prefs");
        this.a = activity;
        this.b = cVar;
    }

    public boolean a(Permission permission) {
        i.f(permission, "permission");
        boolean shouldShowRequestPermissionRationale = ActivityCompat.shouldShowRequestPermissionRationale(this.a, permission.getValue());
        if (shouldShowRequestPermissionRationale) {
            i0.a.a.c cVar = this.b;
            StringBuilder P0 = a.P0("show_rationale__");
            P0.append(permission.getValue());
            cVar.a(P0.toString(), Boolean.valueOf(shouldShowRequestPermissionRationale));
        }
        return shouldShowRequestPermissionRationale;
    }

    public boolean b(Permission permission) {
        i.f(permission, "permission");
        i0.a.a.c cVar = this.b;
        StringBuilder P0 = a.P0("show_rationale__");
        P0.append(permission.getValue());
        Boolean bool = (Boolean) cVar.get(P0.toString());
        if (!(bool != null ? bool.booleanValue() : false)) {
            return false;
        }
        if ((h0.i.b.a.checkSelfPermission(this.a, permission.getValue()) == 0) || a(permission)) {
            return false;
        }
        return true;
    }
}
