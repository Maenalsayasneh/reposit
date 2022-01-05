package i0.j.e;

import android.content.Context;
import com.instabug.library.network.NetworkManager;
import i0.j.e.v0.f.a.a;

/* compiled from: InstabugDelegate */
public class w implements Runnable {
    public final /* synthetic */ Context c;

    public w(Context context) {
        this.c = context;
    }

    public void run() {
        if (NetworkManager.isOnline(this.c)) {
            new a(this.c);
        }
    }
}
