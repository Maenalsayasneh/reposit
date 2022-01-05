package i0.n.c.b.d.c;

import android.telephony.PhoneStateListener;
import m0.n.b.i;

/* compiled from: FlashCallStateListener.kt */
public final class a extends PhoneStateListener {
    public final b a;

    public a(b bVar) {
        i.e(bVar, "listener");
        this.a = bVar;
    }

    public void onCallStateChanged(int i, String str) {
        super.onCallStateChanged(i, str);
        boolean z = true;
        if (i == 1) {
            if (!(str == null || str.length() == 0)) {
                z = false;
            }
            if (!z) {
                this.a.b(str);
            }
        }
    }
}
