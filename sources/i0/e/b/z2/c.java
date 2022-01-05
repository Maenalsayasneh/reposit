package i0.e.b.z2;

import com.clubhouse.android.channels.ChannelService;
import h0.q.t;
import j0.a.a.c.c.g;
import j0.a.b.b;

/* compiled from: Hilt_ChannelService */
public abstract class c extends t implements b {
    public volatile g d;
    public final Object q = new Object();
    public boolean x = false;

    public final Object U() {
        if (this.d == null) {
            synchronized (this.q) {
                if (this.d == null) {
                    this.d = new g(this);
                }
            }
        }
        return this.d.U();
    }

    public void onCreate() {
        if (!this.x) {
            this.x = true;
            ((b) U()).b((ChannelService) this);
        }
        super.onCreate();
    }
}
