package i0.j.f.s.f;

import android.view.View;
import h0.b.a.d;

/* compiled from: CustomQuestionDialog */
public final class a implements View.OnClickListener {
    public final /* synthetic */ d c;
    public final /* synthetic */ f d;

    public a(d dVar, f fVar) {
        this.c = dVar;
        this.d = fVar;
    }

    public void onClick(View view) {
        this.c.dismiss();
        this.d.c();
    }
}
