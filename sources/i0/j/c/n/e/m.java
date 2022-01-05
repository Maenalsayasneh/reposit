package i0.j.c.n.e;

import android.view.View;
import com.instabug.chat.e.c;
import com.instabug.chat.ui.f.d;
import i0.j.c.n.e.o;

/* compiled from: MessagesListAdapter */
public class m implements View.OnClickListener {
    public final /* synthetic */ c c;
    public final /* synthetic */ o d;

    public m(o oVar, c cVar) {
        this.d = oVar;
        this.c = cVar;
    }

    public void onClick(View view) {
        String str;
        o.c cVar = this.d.Y1;
        if (cVar != null && (str = this.c.d) != null) {
            ((d) cVar).i(str);
        }
    }
}
