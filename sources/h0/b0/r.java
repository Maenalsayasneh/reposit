package h0.b0;

import android.view.View;
import i0.d.a.a.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: TransitionValues */
public class r {
    public final Map<String, Object> a = new HashMap();
    public View b;
    public final ArrayList<j> c = new ArrayList<>();

    @Deprecated
    public r() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.b == rVar.b && this.a.equals(rVar.a);
    }

    public int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public String toString() {
        StringBuilder P0 = a.P0("TransitionValues@");
        P0.append(Integer.toHexString(hashCode()));
        P0.append(":\n");
        StringBuilder S0 = a.S0(P0.toString(), "    view = ");
        S0.append(this.b);
        S0.append("\n");
        String n02 = a.n0(S0.toString(), "    values:");
        for (String next : this.a.keySet()) {
            n02 = n02 + "    " + next + ": " + this.a.get(next) + "\n";
        }
        return n02;
    }

    public r(View view) {
        this.b = view;
    }
}
