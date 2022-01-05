package i0.e.b.g3.r.a3;

import com.clubhouse.android.data.models.local.OnboardingDestination;
import i0.d.a.a.a;
import i0.e.b.a3.b.b;
import m0.n.b.i;

/* compiled from: OnboardingTopicsViewModel.kt */
public final class d implements b {
    public final OnboardingDestination a;

    public d(OnboardingDestination onboardingDestination) {
        i.e(onboardingDestination, "onboardingDestination");
        this.a = onboardingDestination;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.a == ((d) obj).a;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("NavigateToDestination(onboardingDestination=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
