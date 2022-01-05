package i0.e.b.g3.r;

import android.os.Bundle;
import com.clubhouse.app.R;
import h0.t.l;
import i0.d.a.a.a;

/* compiled from: ValidateNumberWithCallFragmentDirections.kt */
public final class l2 implements l {
    public final boolean a;

    public l2() {
        this.a = true;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("fromOnboarding", this.a);
        return bundle;
    }

    public int b() {
        return R.id.action_validateNumberWithCallFragment_to_main_graph;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l2) && this.a == ((l2) obj).a;
    }

    public int hashCode() {
        boolean z = this.a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return a.C0(a.P0("ActionValidateNumberWithCallFragmentToMainGraph(fromOnboarding="), this.a, ')');
    }

    public l2(boolean z) {
        this.a = z;
    }
}
