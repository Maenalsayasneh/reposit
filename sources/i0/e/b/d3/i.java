package i0.e.b.d3;

import android.widget.ScrollView;

/* compiled from: lambda */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ ScrollView c;

    public /* synthetic */ i(ScrollView scrollView) {
        this.c = scrollView;
    }

    public final void run() {
        ScrollView scrollView = this.c;
        m0.n.b.i.e(scrollView, "$this_scrollToTop");
        scrollView.fullScroll(33);
    }
}
