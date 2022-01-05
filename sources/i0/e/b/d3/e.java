package i0.e.b.d3;

import android.widget.ScrollView;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ ScrollView c;

    public /* synthetic */ e(ScrollView scrollView) {
        this.c = scrollView;
    }

    public final void run() {
        ScrollView scrollView = this.c;
        i.e(scrollView, "$this_scrollToBottom");
        scrollView.fullScroll(130);
    }
}
