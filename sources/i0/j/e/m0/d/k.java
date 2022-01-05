package i0.j.e.m0.d;

import android.annotation.SuppressLint;
import android.content.Context;
import com.instabug.library.util.InstabugSDKLogger;
import i0.j.e.d1.f;
import i0.j.e.m0.a;

/* compiled from: ShakeInvoker */
public class k implements a<Void>, f.a {
    public f c;
    public a d;
    public volatile boolean q;

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public k(Context context, a aVar) {
        this.d = aVar;
        this.c = new f(context, this);
    }

    public void a() {
        f fVar = this.c;
        fVar.c.registerListener(fVar, fVar.d, 3);
        this.q = true;
        InstabugSDKLogger.d("ShakeInvoker", "listen");
    }

    public boolean b() {
        return this.q;
    }

    public void c() {
        f fVar = this.c;
        fVar.c.unregisterListener(fVar);
        this.q = false;
        InstabugSDKLogger.d("ShakeInvoker", "sleep");
    }
}
