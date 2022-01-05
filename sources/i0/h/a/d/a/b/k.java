package i0.h.a.d.a.b;

import android.os.Bundle;
import com.google.android.play.core.assetpacks.AssetPackState;
import i0.h.a.d.a.j.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class k extends i<List<String>> {
    public final /* synthetic */ n c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(n nVar, m<List<String>> mVar) {
        super(nVar, mVar);
        this.c = nVar;
    }

    public final void f0(List<Bundle> list) {
        this.b.e.b();
        n.a.b(4, "onGetSessionStates", new Object[0]);
        n nVar = this.c;
        ArrayList arrayList = new ArrayList();
        for (Bundle next : list) {
            r0 r0Var = nVar.d;
            ArrayList arrayList2 = new ArrayList();
            v vVar = x.a;
            ArrayList<String> stringArrayList = next.getStringArrayList("pack_names");
            HashMap hashMap = new HashMap();
            int size = stringArrayList.size();
            for (int i = 0; i < size; i++) {
                String str = stringArrayList.get(i);
                hashMap.put(str, AssetPackState.d(next, str, r0Var, vVar));
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                hashMap.put(str2, AssetPackState.b(str2, 4, 0, 0, 0, 0.0d, 1));
            }
            next.getLong("total_bytes_to_download");
            AssetPackState assetPackState = (AssetPackState) hashMap.values().iterator().next();
            if (assetPackState == null) {
                n.a.b(6, "onGetSessionStates: Bundle contained no pack.", new Object[0]);
            }
            int g = assetPackState.g();
            boolean z = true;
            if (!(g == 1 || g == 7 || g == 2 || g == 3)) {
                z = false;
            }
            if (z) {
                arrayList.add(assetPackState.f());
            }
        }
        this.a.b(arrayList);
    }
}
