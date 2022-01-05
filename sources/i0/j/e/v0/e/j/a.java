package i0.j.e.v0.e.j;

import com.instabug.library.internal.storage.cache.db.userAttribute.UserAttributesDbHelper;
import i0.j.e.t0.g;
import java.util.List;
import k0.b.y.e;

/* compiled from: AttributesLocalDataSource */
public class a implements e<List<g>, k0.b.e> {
    public Object apply(Object obj) throws Exception {
        UserAttributesDbHelper.insertBulk((List) obj);
        return k0.b.a.c();
    }
}
