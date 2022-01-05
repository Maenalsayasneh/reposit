package h0.q;

import java.util.HashMap;

/* compiled from: ViewModelStore */
public class n0 {
    public final HashMap<String, k0> a = new HashMap<>();

    public final void a() {
        for (k0 clear : this.a.values()) {
            clear.clear();
        }
        this.a.clear();
    }
}
