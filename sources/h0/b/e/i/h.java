package h0.b.e.i;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import h0.b.a.d;
import h0.b.e.i.e;
import h0.b.e.i.m;

/* compiled from: MenuDialogHelper */
public class h implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, m.a {
    public g c;
    public d d;
    public e q;

    public h(g gVar) {
        this.c = gVar;
    }

    public void c(g gVar, boolean z) {
        d dVar;
        if ((z || gVar == this.c) && (dVar = this.d) != null) {
            dVar.dismiss();
        }
    }

    public boolean d(g gVar) {
        return false;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.c.r(((e.a) this.q.a()).getItem(i), 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        e eVar = this.q;
        g gVar = this.c;
        m.a aVar = eVar.Y1;
        if (aVar != null) {
            aVar.c(gVar, true);
        }
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.d.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.d.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.c.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.c.performShortcut(i, keyEvent, 0);
    }
}
