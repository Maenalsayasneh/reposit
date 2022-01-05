package h0.q;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.lifecycle.Lifecycle;
import java.util.Objects;

/* compiled from: LifecycleService */
public class t extends Service implements p {
    public final h0 c = new h0(this);

    public Lifecycle getLifecycle() {
        return this.c.a;
    }

    public IBinder onBind(Intent intent) {
        h0 h0Var = this.c;
        Objects.requireNonNull(h0Var);
        h0Var.a(Lifecycle.Event.ON_START);
        return null;
    }

    public void onCreate() {
        h0 h0Var = this.c;
        Objects.requireNonNull(h0Var);
        h0Var.a(Lifecycle.Event.ON_CREATE);
        super.onCreate();
    }

    public void onDestroy() {
        h0 h0Var = this.c;
        Objects.requireNonNull(h0Var);
        h0Var.a(Lifecycle.Event.ON_STOP);
        h0Var.a(Lifecycle.Event.ON_DESTROY);
        super.onDestroy();
    }

    public void onStart(Intent intent, int i) {
        h0 h0Var = this.c;
        Objects.requireNonNull(h0Var);
        h0Var.a(Lifecycle.Event.ON_START);
        super.onStart(intent, i);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }
}
