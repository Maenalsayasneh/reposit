package i0.h.a.d.a.a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.install.InstallException;
import i0.h.a.d.a.j.m;
import i0.h.a.d.a.j.p;

public final class f implements b {
    public final n a;
    public final Context b;

    public f(n nVar, d dVar, Context context) {
        new Handler(Looper.getMainLooper());
        this.a = nVar;
        this.b = context;
    }

    public final p<a> a() {
        n nVar = this.a;
        String packageName = this.b.getPackageName();
        if (nVar.c == null) {
            n.a.b(6, "onError(%d)", new Object[]{-9});
            InstallException installException = new InstallException(-9);
            p<a> pVar = new p<>();
            pVar.e(installException);
            return pVar;
        }
        n.a.b(4, "requestUpdateInfo(%s)", new Object[]{packageName});
        m mVar = new m();
        nVar.c.a(new l(nVar, mVar, packageName, mVar));
        return mVar.a;
    }

    public final boolean b(a aVar, int i, Activity activity, int i2) throws IntentSender.SendIntentException {
        c c = c.c(i);
        if (!(aVar.j(c) != null)) {
            return false;
        }
        activity.startIntentSenderForResult(aVar.j(c).getIntentSender(), i2, (Intent) null, 0, 0, 0, (Bundle) null);
        return true;
    }
}
