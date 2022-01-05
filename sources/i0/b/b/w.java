package i0.b.b;

import android.os.Bundle;
import com.airbnb.mvrx.MavericksViewModelProvider$getSavedStateBundle$1;
import h0.b0.v;
import h0.x.a;

/* compiled from: MavericksViewModelProvider.kt */
public final class w implements a.b {
    public final /* synthetic */ y a;
    public final /* synthetic */ j0 b;

    public w(y yVar, j0 j0Var) {
        this.a = yVar;
        this.b = j0Var;
    }

    public final Bundle a() {
        return (Bundle) v.v2(this.a.a, new MavericksViewModelProvider$getSavedStateBundle$1(this.b.b()));
    }
}
