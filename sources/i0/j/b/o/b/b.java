package i0.j.b.o.b;

import android.app.Activity;
import com.instabug.bug.screenshot.viewhierarchy.utilities.ViewHierarchyDiskUtils;
import com.instabug.library.internal.storage.DiskUtils;
import com.instabug.library.util.InstabugSDKLogger;
import i0.j.b.o.b.h;
import k0.b.y.a;

/* compiled from: ActivityViewInspector */
public final class b implements a {
    public final /* synthetic */ h.a a;
    public final /* synthetic */ Activity b;

    public b(h.a aVar, Activity activity) {
        this.a = aVar;
        this.b = activity;
    }

    public void run() {
        StringBuilder P0 = i0.d.a.a.a.P0("un-subscribe called, time in MS: ");
        P0.append(System.currentTimeMillis());
        InstabugSDKLogger.d("ActivityViewInspector", P0.toString());
        h.a aVar = this.a;
        aVar.a--;
        if (!aVar.a()) {
            DiskUtils.cleanDirectory(ViewHierarchyDiskUtils.getViewHierarchyImagesDirectory(this.b));
        }
    }
}
