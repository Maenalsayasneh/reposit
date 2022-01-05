package i0.e.b.g3.t;

import android.view.View;
import android.widget.PopupWindow;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ PopupWindow c;

    public /* synthetic */ a(PopupWindow popupWindow) {
        this.c = popupWindow;
    }

    public final void onClick(View view) {
        PopupWindow popupWindow = this.c;
        i.e(popupWindow, "$popup");
        popupWindow.dismiss();
    }
}
