package i0.j.e.l0.j;

import com.instabug.library.internal.orchestrator.Action;
import com.instabug.library.internal.storage.cache.db.userAttribute.UserAttributesDbHelper;
import i0.j.e.t0.g;

/* compiled from: InsertUserAttributeAction */
public class c implements Action {
    public final g a;

    public c(g gVar) {
        this.a = gVar;
    }

    public void run() {
        UserAttributesDbHelper.insert(this.a);
    }
}
