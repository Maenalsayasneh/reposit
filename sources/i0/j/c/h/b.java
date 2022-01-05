package i0.j.c.h;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import com.instabug.library.util.ScreenUtility;

/* compiled from: NotificationBarInvoker */
public class b implements Runnable {
    public final /* synthetic */ Activity c;
    public final /* synthetic */ a d;

    public b(a aVar, Activity activity) {
        this.d = aVar;
        this.c = activity;
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public void run() {
        this.d.a.setVisibility(0);
        this.d.a.animate().y((float) (ScreenUtility.getScreenHeight(this.c) - this.d.a.getHeight())).setListener((Animator.AnimatorListener) null).start();
        this.d.b = true;
    }
}
