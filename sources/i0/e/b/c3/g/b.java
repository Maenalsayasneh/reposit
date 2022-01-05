package i0.e.b.c3.g;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.clubhouse.app.R;
import i0.e.b.z2.f.c;
import i0.e.b.z2.f.e;
import m0.n.b.i;

/* compiled from: ApplicationModule.kt */
public final class b implements c {
    public void a(Fragment fragment, e eVar) {
        i.e(fragment, "fragment");
        i.e(eVar, "navigateToChannel");
        h0.t.i iVar = new h0.t.i(fragment.requireContext());
        iVar.e(R.navigation.main_graph);
        iVar.d(R.id.hallwayFragment);
        Bundle a = new i0.e.b.g3.p.i(eVar.a, (String) null, (String) null, (String) null, eVar.c.getCode(), 14).a();
        iVar.e = a;
        iVar.b.putExtra("android-support-nav:controller:deepLinkExtras", a);
        iVar.a().send();
    }
}
