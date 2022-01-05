package i0.e.b.g3.p.c0.e0;

import android.view.View;
import com.clubhouse.android.user.model.User;
import i0.e.b.b3.b.e.m;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class k implements View.OnClickListener {
    public final /* synthetic */ w0 c;
    public final /* synthetic */ m d;

    public /* synthetic */ k(w0 w0Var, m mVar) {
        this.c = w0Var;
        this.d = mVar;
    }

    public final void onClick(View view) {
        w0 w0Var = this.c;
        m mVar = this.d;
        i.e(w0Var, "this$0");
        i.e(mVar, "$it");
        l<? super User, m0.i> lVar = w0Var.k;
        if (lVar != null) {
            lVar.invoke(mVar.g);
        }
    }
}
