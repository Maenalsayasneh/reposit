package h0.o.a;

import androidx.fragment.app.SpecialEffectsController;
import h0.f.a;

/* compiled from: DefaultSpecialEffectsController */
public class g implements Runnable {
    public final /* synthetic */ SpecialEffectsController.Operation c;
    public final /* synthetic */ SpecialEffectsController.Operation d;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ a x;

    public g(b bVar, SpecialEffectsController.Operation operation, SpecialEffectsController.Operation operation2, boolean z, a aVar) {
        this.c = operation;
        this.d = operation2;
        this.q = z;
        this.x = aVar;
    }

    public void run() {
        j0.c(this.c.c, this.d.c, this.q, this.x, false);
    }
}
