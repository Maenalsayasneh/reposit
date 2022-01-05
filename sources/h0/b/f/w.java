package h0.b.f;

import android.graphics.Typeface;
import android.widget.TextView;

/* compiled from: AppCompatTextHelper */
public class w implements Runnable {
    public final /* synthetic */ TextView c;
    public final /* synthetic */ Typeface d;
    public final /* synthetic */ int q;

    public w(v vVar, TextView textView, Typeface typeface, int i) {
        this.c = textView;
        this.d = typeface;
        this.q = i;
    }

    public void run() {
        this.c.setTypeface(this.d, this.q);
    }
}
