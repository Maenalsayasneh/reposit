package i0.j.b.o.b;

import com.instabug.bug.k.b.c$b;
import com.instabug.bug.model.a;
import com.instabug.bug.screenshot.viewhierarchy.utilities.ViewHierarchyInspectorEventBus;
import com.instabug.library.util.InstabugSDKLogger;
import i0.j.b.f;
import k0.b.b0.b;

/* compiled from: ActivityViewInspector */
public final class a extends b<i> {
    public final /* synthetic */ i d;

    public a(i iVar) {
        this.d = iVar;
    }

    public void b(Object obj) {
        StringBuilder P0 = i0.d.a.a.a.P0("view hierarchy image saved successfully, uri: ");
        P0.append(((i) obj).k);
        InstabugSDKLogger.d("ActivityViewInspector", P0.toString());
    }

    public void onComplete() {
        StringBuilder P0 = i0.d.a.a.a.P0("activity view inspection done successfully, time in MS: ");
        P0.append(System.currentTimeMillis());
        InstabugSDKLogger.d("ActivityViewInspector", P0.toString());
        if (f.g().b != null) {
            InstabugSDKLogger.d("ActivityViewInspector", "bug ! null,converting>json started");
            f.g().b.Z1 = h.b(this.d).toString();
            InstabugSDKLogger.d("ActivityViewInspector", "bug ! null,converting>json ended");
            if (f.g().b != null) {
                InstabugSDKLogger.d("ActivityViewInspector", "bug ! null,set inspection state");
                f.g().b.b2 = a.c.DONE;
                ViewHierarchyInspectorEventBus.getInstance().post(c$b.COMPLETED);
            }
        }
    }

    public void onError(Throwable th) {
        StringBuilder P0 = i0.d.a.a.a.P0("activity view inspection got error: ");
        P0.append(th.getMessage());
        P0.append(", time in MS: ");
        P0.append(System.currentTimeMillis());
        InstabugSDKLogger.e("ActivityViewInspector", P0.toString(), th);
        if (f.g().b != null) {
            f.g().b.b2 = a.c.FAILED;
        }
        ViewHierarchyInspectorEventBus.getInstance().post(c$b.FAILED);
    }
}
