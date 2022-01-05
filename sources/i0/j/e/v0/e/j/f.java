package i0.j.e.v0.e.j;

import com.instabug.library.model.UserAttributes;
import java.util.concurrent.TimeUnit;
import k0.b.y.d;

/* compiled from: AttributesRemoteDataSource */
public class f implements d<UserAttributes> {
    public final /* synthetic */ m c;

    public f(m mVar) {
        this.c = mVar;
    }

    public void b(Object obj) throws Exception {
        this.c.a.saveOrUpdateLong("key_user_attrs_ttl", TimeUnit.SECONDS.toMillis(((UserAttributes) obj).getTtl()));
    }
}
