package androidx.work;

import h0.g0.d;
import h0.g0.f;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public final class OverwritingInputMerger extends f {
    public d a(List<d> list) {
        d.a aVar = new d.a();
        HashMap hashMap = new HashMap();
        for (d dVar : list) {
            hashMap.putAll(Collections.unmodifiableMap(dVar.c));
        }
        aVar.b(hashMap);
        return aVar.a();
    }
}
