package i0.j.e.m0.d;

import android.widget.FrameLayout;
import i0.j.e.l0.i.a;

/* compiled from: ScreenRecordingFab */
public class g implements Runnable {
    public final /* synthetic */ FrameLayout.LayoutParams c;
    public final /* synthetic */ d d;

    public g(d dVar, FrameLayout.LayoutParams layoutParams) {
        this.d = dVar;
        this.c = layoutParams;
    }

    public void run() {
        FrameLayout.LayoutParams layoutParams;
        d dVar = this.d;
        a aVar = dVar.j2;
        if (aVar != null && (layoutParams = dVar.c) != null) {
            this.c.leftMargin = layoutParams.leftMargin - aVar.getWidth();
            FrameLayout.LayoutParams layoutParams2 = this.c;
            d dVar2 = this.d;
            int i = dVar2.y;
            FrameLayout.LayoutParams layoutParams3 = dVar2.c;
            layoutParams2.rightMargin = i - layoutParams3.leftMargin;
            layoutParams2.topMargin = ((((layoutParams3.height + dVar2.r2) / 2) - dVar2.j2.getHeight()) / 2) + layoutParams3.topMargin;
            this.d.j2.setLayoutParams(this.c);
        }
    }
}
