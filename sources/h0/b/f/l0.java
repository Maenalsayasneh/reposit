package h0.b.f;

import android.widget.PopupWindow;
import java.util.Objects;

/* compiled from: PopupMenu */
public class l0 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ m0 c;

    public l0(m0 m0Var) {
        this.c = m0Var;
    }

    public void onDismiss() {
        Objects.requireNonNull(this.c);
    }
}
