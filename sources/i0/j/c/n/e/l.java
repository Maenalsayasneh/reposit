package i0.j.c.n.e;

import com.instabug.chat.R;
import com.instabug.chat.e.c;
import com.instabug.library.internal.media.AudioPlayer;
import i0.j.c.n.e.o;

/* compiled from: MessagesListAdapter */
public class l extends AudioPlayer.OnStopListener {
    public final /* synthetic */ c a;
    public final /* synthetic */ o.d b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(String str, c cVar, o.d dVar) {
        super(str);
        this.a = cVar;
        this.b = dVar;
    }

    public void onStop() {
        this.a.f = c.a.NONE;
        this.b.f.setImageResource(R.drawable.ibg_core_ic_play);
    }
}
