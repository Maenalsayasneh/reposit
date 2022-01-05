package i0.e.b.g3.y;

import android.os.Bundle;
import m0.n.b.i;

/* compiled from: SplashFragmentArgs.kt */
public final class a {
    public final boolean a;
    public final String b;

    /* renamed from: i0.e.b.g3.y.a$a  reason: collision with other inner class name */
    /* compiled from: SplashFragmentArgs.kt */
    public static final class C0212a {
        public static final a a(Bundle bundle) {
            i.e(bundle, "bundle");
            bundle.setClassLoader(a.class.getClassLoader());
            return new a(bundle.containsKey("fromOnboarding") ? bundle.getBoolean("fromOnboarding") : false, bundle.containsKey("welcomeChannelId") ? bundle.getString("welcomeChannelId") : null);
        }
    }

    public a() {
        this.a = false;
        this.b = null;
    }

    public static final a fromBundle(Bundle bundle) {
        return C0212a.a(bundle);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && i.a(this.b, aVar.b);
    }

    public int hashCode() {
        boolean z = this.a;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        String str = this.b;
        return i + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("SplashFragmentArgs(fromOnboarding=");
        P0.append(this.a);
        P0.append(", welcomeChannelId=");
        return i0.d.a.a.a.w0(P0, this.b, ')');
    }

    public a(boolean z, String str) {
        this.a = z;
        this.b = str;
    }
}
