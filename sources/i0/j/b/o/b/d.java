package i0.j.b.o.b;

import android.net.Uri;
import com.instabug.bug.screenshot.viewhierarchy.utilities.ViewHierarchyDiskUtils;
import com.instabug.library.model.Attachment;
import com.instabug.library.util.InstabugSDKLogger;
import i0.j.b.f;
import i0.j.b.o.b.h;
import k0.b.y.a;

/* compiled from: ActivityViewInspector */
public final class d implements a {
    public final /* synthetic */ h.a a;
    public final /* synthetic */ i b;

    public d(h.a aVar, i iVar) {
        this.a = aVar;
        this.b = iVar;
    }

    public void run() {
        StringBuilder P0 = i0.d.a.a.a.P0("doOnCompleted called, time in MS: ");
        P0.append(System.currentTimeMillis());
        InstabugSDKLogger.d("ActivityViewInspector", P0.toString());
        if (this.a.a()) {
            Uri zipViewHierarchyImages = ViewHierarchyDiskUtils.zipViewHierarchyImages(this.b);
            if (zipViewHierarchyImages != null) {
                StringBuilder P02 = i0.d.a.a.a.P0("viewHierarchy images zipped successfully, zip file uri: ");
                P02.append(zipViewHierarchyImages.toString());
                P02.append(", time in MS: ");
                P02.append(System.currentTimeMillis());
                InstabugSDKLogger.d("ActivityViewInspector", P02.toString());
            }
            if (!(f.g().b == null || zipViewHierarchyImages == null)) {
                f.g().b.a(zipViewHierarchyImages, Attachment.Type.VIEW_HIERARCHY, false);
            }
            h.a = null;
        }
    }
}
