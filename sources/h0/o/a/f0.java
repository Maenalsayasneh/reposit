package h0.o.a;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import h0.i.e.a;
import h0.o.a.j0;

/* compiled from: FragmentTransition */
public class f0 implements Runnable {
    public final /* synthetic */ j0.a c;
    public final /* synthetic */ Fragment d;
    public final /* synthetic */ a q;

    public f0(j0.a aVar, Fragment fragment, a aVar2) {
        this.c = aVar;
        this.d = fragment;
        this.q = aVar2;
    }

    public void run() {
        ((FragmentManager.d) this.c).a(this.d, this.q);
    }
}
