package i0.j.e.v0.e.j;

import i0.j.e.t0.g;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import k0.b.y.e;

/* compiled from: AttributesRemoteDataSource */
public class d implements e<Map<String, String>, List<g>> {
    public Object apply(Object obj) throws Exception {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            arrayList.add(new g((String) entry.getKey(), (String) entry.getValue(), (String) null, false, 0, (g.a) null));
        }
        return arrayList;
    }
}
