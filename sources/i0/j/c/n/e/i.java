package i0.j.c.n.e;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.instabug.chat.e.e;
import com.instabug.chat.ui.f.d;
import com.instabug.library.util.InstabugSDKLogger;
import i0.d.a.a.a;
import i0.j.c.n.e.o;
import java.util.Objects;

/* compiled from: MessagesListAdapter */
public class i implements View.OnClickListener {
    public final /* synthetic */ e c;
    public final /* synthetic */ o d;

    public i(o oVar, e eVar) {
        this.d = oVar;
        this.c = eVar;
    }

    public void onClick(View view) {
        o.c cVar = this.d.Y1;
        String str = this.c.q;
        d dVar = (d) cVar;
        Objects.requireNonNull(dVar);
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            dVar.startActivity(intent);
        } catch (Exception e) {
            StringBuilder T0 = a.T0("Unable to view this url ", str, "\nError message: ");
            T0.append(e.getMessage());
            InstabugSDKLogger.e(dVar, T0.toString());
        }
    }
}
