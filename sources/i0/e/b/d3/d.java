package i0.e.b.d3;

import android.view.KeyEvent;
import android.widget.TextView;
import m0.n.a.a;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class d implements TextView.OnEditorActionListener {
    public final /* synthetic */ a c;

    public /* synthetic */ d(a aVar) {
        this.c = aVar;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        a aVar = this.c;
        i.e(aVar, "$f");
        if (i != 6) {
            if (!(keyEvent != null && keyEvent.getKeyCode() == 66) || keyEvent.getAction() != 0) {
                return false;
            }
        }
        aVar.invoke();
        return true;
    }
}
