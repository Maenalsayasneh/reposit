package i0.j.e.l0.m;

import android.content.Context;
import android.widget.MediaController;

/* compiled from: InstabugMediaController */
public class h extends MediaController {
    public final a c;

    /* compiled from: InstabugMediaController */
    public interface a {
        void isVisible(boolean z);
    }

    public h(Context context, a aVar) {
        super(context);
        this.c = aVar;
    }

    public void hide() {
        super.hide();
        a aVar = this.c;
        if (aVar != null) {
            aVar.isVisible(false);
        }
    }

    public void show() {
        super.show();
        a aVar = this.c;
        if (aVar != null) {
            aVar.isVisible(true);
        }
    }
}
