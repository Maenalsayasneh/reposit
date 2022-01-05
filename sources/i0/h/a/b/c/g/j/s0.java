package i0.h.a.b.c.g.j;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import i0.h.a.b.c.g.d;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
public final class s0 implements d.a {
    public final /* synthetic */ BasePendingResult a;
    public final /* synthetic */ q0 b;

    public s0(q0 q0Var, BasePendingResult basePendingResult) {
        this.b = q0Var;
        this.a = basePendingResult;
    }

    public final void a(Status status) {
        this.b.a.remove(this.a);
    }
}
