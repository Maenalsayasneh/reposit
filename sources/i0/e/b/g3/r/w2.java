package i0.e.b.g3.r;

import android.os.Bundle;
import com.clubhouse.app.R;
import h0.t.l;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: WelcomeRoomFragmentDirections.kt */
public final class w2 {
    public static final b a = new b((f) null);

    /* compiled from: WelcomeRoomFragmentDirections.kt */
    public static final class b {
        public b(f fVar) {
        }

        public static l a(b bVar, boolean z, String str, int i) {
            if ((i & 1) != 0) {
                z = true;
            }
            if ((i & 2) != 0) {
                str = null;
            }
            return new a(z, str);
        }
    }

    /* compiled from: WelcomeRoomFragmentDirections.kt */
    public static final class a implements l {
        public final boolean a;
        public final String b;

        public a() {
            this.a = true;
            this.b = null;
        }

        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putBoolean("fromOnboarding", this.a);
            bundle.putString("welcomeChannelId", this.b);
            return bundle;
        }

        public int b() {
            return R.id.action_welcomeRoomFragment_to_main_graph;
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
            StringBuilder P0 = i0.d.a.a.a.P0("ActionWelcomeRoomFragmentToMainGraph(fromOnboarding=");
            P0.append(this.a);
            P0.append(", welcomeChannelId=");
            return i0.d.a.a.a.w0(P0, this.b, ')');
        }

        public a(boolean z, String str) {
            this.a = z;
            this.b = str;
        }
    }
}
