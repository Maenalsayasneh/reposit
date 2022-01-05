package i0.e.b.i3;

import android.view.View;
import android.view.ViewTreeObserver;
import com.clubhouse.android.util.KeyboardEventListener;
import h0.i.i.d0;
import h0.i.i.q;
import java.util.concurrent.atomic.AtomicInteger;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class a implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ KeyboardEventListener c;

    public /* synthetic */ a(KeyboardEventListener keyboardEventListener) {
        this.c = keyboardEventListener;
    }

    public final void onGlobalLayout() {
        int i;
        KeyboardEventListener keyboardEventListener = this.c;
        i.e(keyboardEventListener, "this$0");
        View view = keyboardEventListener.c;
        AtomicInteger atomicInteger = q.a;
        d0 a = q.d.a(view);
        boolean z = false;
        if (a == null) {
            i = 0;
        } else {
            i = a.b();
        }
        if (i > 200) {
            z = true;
        }
        if (z != keyboardEventListener.q) {
            keyboardEventListener.q = z;
            keyboardEventListener.d.invoke(Boolean.valueOf(z), Integer.valueOf(i));
        }
    }
}
