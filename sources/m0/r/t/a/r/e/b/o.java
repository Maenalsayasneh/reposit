package m0.r.t.a.r.e.b;

import java.util.List;
import kotlin.collections.EmptyList;
import m0.n.b.i;

/* compiled from: PackagePartProvider.kt */
public interface o {

    /* compiled from: PackagePartProvider.kt */
    public static final class a implements o {
        public static final a a = new a();

        public List<String> a(String str) {
            i.e(str, "packageFqName");
            return EmptyList.c;
        }
    }

    List<String> a(String str);
}
