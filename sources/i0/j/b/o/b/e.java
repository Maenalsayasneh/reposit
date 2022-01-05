package i0.j.b.o.b;

import com.instabug.bug.screenshot.viewhierarchy.utilities.ViewHierarchyDiskUtils;
import com.instabug.library.util.InstabugSDKLogger;
import i0.d.a.a.a;
import i0.j.b.o.b.h;
import k0.b.y.d;

/* compiled from: ActivityViewInspector */
public final class e implements d<i> {
    public final /* synthetic */ h.a c;

    public e(h.a aVar) {
        this.c = aVar;
    }

    public void b(Object obj) throws Exception {
        i iVar = (i) obj;
        StringBuilder P0 = a.P0("doOnNext called, time in MS: ");
        P0.append(System.currentTimeMillis());
        InstabugSDKLogger.d("ActivityViewInspector", P0.toString());
        if (this.c.a() && iVar.j != null) {
            StringBuilder P02 = a.P0("viewHierarchy image not equal null, starting save image on disk, viewHierarchyId: ");
            P02.append(iVar.a);
            P02.append(", time in MS: ");
            P02.append(System.currentTimeMillis());
            InstabugSDKLogger.d("ActivityViewInspector", P02.toString());
            ViewHierarchyDiskUtils.saveViewHierarchyImage(iVar);
            iVar.j = null;
        }
    }
}
