package i0.j.c.n.e;

import android.view.View;
import com.instabug.chat.R;
import com.instabug.chat.e.c;
import i0.j.c.n.e.o;

/* compiled from: MessagesListAdapter */
public class k implements View.OnClickListener {
    public final /* synthetic */ c c;
    public final /* synthetic */ String d;
    public final /* synthetic */ o.d q;
    public final /* synthetic */ o x;

    public k(o oVar, c cVar, String str, o.d dVar) {
        this.x = oVar;
        this.c = cVar;
        this.d = str;
        this.q = dVar;
    }

    public void onClick(View view) {
        c.a aVar = this.c.f;
        c.a aVar2 = c.a.NONE;
        if (aVar == aVar2) {
            this.x.c.start(this.d);
            this.c.f = c.a.PLAYING;
            this.q.f.setImageResource(R.drawable.ibg_core_ic_pause);
            return;
        }
        this.x.c.pause();
        this.c.f = aVar2;
        this.q.f.setImageResource(R.drawable.ibg_core_ic_play);
    }
}
