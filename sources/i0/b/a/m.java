package i0.b.a;

import com.airbnb.epoxy.ModelList;
import java.util.List;

/* compiled from: EpoxyAdapter */
public abstract class m extends d {
    public final c0 f = new c0();
    public final List<t<?>> g = new ModelList();

    public List<t<?>> c() {
        return this.g;
    }

    public t<?> d(int i) {
        t<?> tVar = this.g.get(i);
        return tVar.c ? tVar : this.f;
    }
}
