package i0.o.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: Utils */
public final class a0 extends Handler {
    public a0(Looper looper) {
        super(looper);
    }

    public void handleMessage(Message message) {
        sendMessageDelayed(obtainMessage(), 1000);
    }
}
