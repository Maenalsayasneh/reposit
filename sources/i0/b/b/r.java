package i0.b.b;

import h0.q.f0;
import h0.q.k0;
import i0.d.a.a.a;
import java.util.UUID;
import m0.n.b.i;

/* compiled from: MavericksViewIdViewModel.kt */
public final class r extends k0 {
    public final String a;

    public r(f0 f0Var) {
        i.e(f0Var, "state");
        String str = (String) f0Var.b.get("mavericks:persisted_view_id");
        if (str == null) {
            StringBuilder P0 = a.P0("MavericksView_");
            P0.append(UUID.randomUUID().toString());
            str = P0.toString();
            f0Var.b("mavericks:persisted_view_id", str);
        }
        this.a = str;
    }
}
