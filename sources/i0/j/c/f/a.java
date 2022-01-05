package i0.j.c.f;

import android.content.Context;
import com.instabug.chat.e.b;
import com.instabug.library.model.State;

/* compiled from: Chat */
public class a implements Runnable {
    public final /* synthetic */ b c;
    public final /* synthetic */ Context d;

    public a(b bVar, Context context) {
        this.c = bVar;
        this.d = context;
    }

    public void run() {
        this.c.d = new State.Builder(this.d).build(true);
    }
}
