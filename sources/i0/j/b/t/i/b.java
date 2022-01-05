package i0.j.b.t.i;

import android.os.Bundle;
import com.instabug.bug.view.e;
import com.instabug.bug.view.h.c;
import i0.j.b.s.a;
import java.util.Objects;

/* compiled from: ExtraFieldsFragment */
public class b implements Runnable {
    public final /* synthetic */ c c;

    public b(c cVar) {
        this.c = cVar;
    }

    public void run() {
        Objects.requireNonNull(a.h());
        if (i0.j.b.s.b.a().k) {
            e eVar = new e();
            eVar.setArguments(new Bundle());
            if (this.c.getFragmentManager() != null) {
                eVar.P0(this.c.getFragmentManager(), "Instabug-Thanks-Fragment");
                return;
            }
            return;
        }
        this.c.finishActivity();
    }
}
