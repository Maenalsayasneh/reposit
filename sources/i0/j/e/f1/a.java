package i0.j.e.f1;

import com.google.android.material.tabs.TabLayout;
import com.instabug.library.model.StepType;

/* compiled from: InstabugOnTabSelectedListener */
public class a implements TabLayout.c {
    public final String a;

    public a(String str) {
        this.a = str;
    }

    public void a(TabLayout.g gVar) {
    }

    public void b(TabLayout.g gVar) {
        n k = n.k();
        k.f(StepType.TAB_SELECT, this.a + " - " + gVar.getClass().getSimpleName() + " #" + (gVar.d + 1), TabLayout.g.class.getName(), (String) null);
    }

    public void c(TabLayout.g gVar) {
    }
}
