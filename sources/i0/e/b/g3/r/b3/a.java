package i0.e.b.g3.r.b3;

import android.view.View;
import android.widget.TextView;
import i0.e.b.g3.r.b3.c;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ c.a c;
    public final /* synthetic */ c d;

    public /* synthetic */ a(c.a aVar, c cVar) {
        this.c = aVar;
        this.d = cVar;
    }

    public final void onClick(View view) {
        c.a aVar = this.c;
        c cVar = this.d;
        i.e(aVar, "$holder");
        i.e(cVar, "this$0");
        boolean z = true;
        if (!aVar.b().a.isSelected()) {
            TextView textView = aVar.b().a;
            m0.n.a.a<Boolean> aVar2 = cVar.l;
            if (aVar2 == null || !aVar2.invoke().booleanValue()) {
                z = false;
            }
            textView.setSelected(z);
            return;
        }
        m0.n.a.a<m0.i> aVar3 = cVar.m;
        if (aVar3 != null) {
            aVar3.invoke();
        }
        aVar.b().a.setSelected(false);
    }
}
