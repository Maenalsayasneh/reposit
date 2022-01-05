package h0.b0;

import android.view.View;
import android.view.ViewGroup;
import androidx.transition.R;

/* compiled from: Visibility */
public class d0 extends m {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ View b;
    public final /* synthetic */ View c;
    public final /* synthetic */ e0 d;

    public d0(e0 e0Var, ViewGroup viewGroup, View view, View view2) {
        this.d = e0Var;
        this.a = viewGroup;
        this.b = view;
        this.c = view2;
    }

    public void b(j jVar) {
        this.a.getOverlay().remove(this.b);
    }

    public void c(j jVar) {
        this.c.setTag(R.id.save_overlay_view, (Object) null);
        this.a.getOverlay().remove(this.b);
        jVar.y(this);
    }

    public void e(j jVar) {
        if (this.b.getParent() == null) {
            this.a.getOverlay().add(this.b);
        } else {
            this.d.cancel();
        }
    }
}
