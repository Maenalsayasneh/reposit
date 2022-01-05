package i0.j.c.n.e;

import android.view.View;
import com.instabug.chat.e.c;
import com.instabug.chat.ui.f.d;
import i0.j.c.n.e.o;

/* compiled from: MessagesListAdapter */
public class j implements View.OnClickListener {
    public final /* synthetic */ c c;
    public final /* synthetic */ o d;

    public j(o oVar, c cVar) {
        this.d = oVar;
        this.c = cVar;
    }

    public void onClick(View view) {
        o.c cVar = this.d.Y1;
        if (cVar != null) {
            c cVar2 = this.c;
            String str = cVar2.d;
            if (str != null) {
                ((d) cVar).f(str);
                return;
            }
            String str2 = cVar2.c;
            if (str2 != null) {
                ((d) cVar).f(str2);
            }
        }
    }
}
