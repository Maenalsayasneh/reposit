package i0.e.b.g3.y;

import android.os.Bundle;
import com.clubhouse.app.R;
import h0.t.l;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: SplashFragmentDirections.kt */
public final class b {
    public static final C0213b a = new C0213b((f) null);

    /* renamed from: i0.e.b.g3.y.b$b  reason: collision with other inner class name */
    /* compiled from: SplashFragmentDirections.kt */
    public static final class C0213b {
        public C0213b(f fVar) {
        }

        public static l a(C0213b bVar, String str, String str2, String str3, String str4, int i, int i2) {
            if ((i2 & 1) != 0) {
                str = null;
            }
            String str5 = str;
            int i3 = i2 & 2;
            int i4 = i2 & 4;
            int i5 = i2 & 8;
            if ((i2 & 16) != 0) {
                i = 15;
            }
            return new a(str5, (String) null, (String) null, (String) null, i);
        }
    }

    /* compiled from: SplashFragmentDirections.kt */
    public static final class a implements l {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final int e;

        public a() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = 15;
        }

        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putString("channelId", this.a);
            bundle.putString("chatId", this.b);
            bundle.putString("waveUserId", this.c);
            bundle.putString("waveId", this.d);
            bundle.putInt("sourceLocation", this.e);
            return bundle;
        }

        public int b() {
            return R.id.action_splashFragment_to_hallway_fragment;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return i.a(this.a, aVar.a) && i.a(this.b, aVar.b) && i.a(this.c, aVar.c) && i.a(this.d, aVar.d) && this.e == aVar.e;
        }

        public int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.d;
            if (str4 != null) {
                i = str4.hashCode();
            }
            return Integer.hashCode(this.e) + ((hashCode3 + i) * 31);
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("ActionSplashFragmentToHallwayFragment(channelId=");
            P0.append(this.a);
            P0.append(", chatId=");
            P0.append(this.b);
            P0.append(", waveUserId=");
            P0.append(this.c);
            P0.append(", waveId=");
            P0.append(this.d);
            P0.append(", sourceLocation=");
            return i0.d.a.a.a.s0(P0, this.e, ')');
        }

        public a(String str, String str2, String str3, String str4, int i) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = i;
        }
    }
}
