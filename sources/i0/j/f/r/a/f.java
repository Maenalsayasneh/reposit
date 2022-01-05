package i0.j.f.r.a;

import com.instabug.library.network.NetworkManager;

/* compiled from: SurveysService */
public class f {
    public static f a;
    public NetworkManager b = new NetworkManager();

    public static f a() {
        if (a == null) {
            a = new f();
        }
        return a;
    }
}
