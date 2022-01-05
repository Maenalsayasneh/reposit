package h0.t;

import android.os.Bundle;

/* compiled from: ActionOnlyNavDirections */
public final class a implements l {
    public final int a;

    public a(int i) {
        this.a = i;
    }

    public Bundle a() {
        return new Bundle();
    }

    public int b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && a.class == obj.getClass() && this.a == ((a) obj).a;
    }

    public int hashCode() {
        return 31 + this.a;
    }

    public String toString() {
        return i0.d.a.a.a.u0(i0.d.a.a.a.P0("ActionOnlyNavDirections(actionId="), this.a, ")");
    }
}
