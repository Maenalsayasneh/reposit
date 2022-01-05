package i0.j.d.f;

import android.view.View;
import android.widget.TextView;
import i0.j.c.l.a;

/* compiled from: TextViewUtils */
public final class b extends d {
    public final /* synthetic */ Runnable Y1;
    public final /* synthetic */ TextView c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String q;
    public final /* synthetic */ String x;
    public final /* synthetic */ boolean y;

    public b(TextView textView, String str, String str2, String str3, boolean z, Runnable runnable) {
        this.c = textView;
        this.d = str;
        this.q = str2;
        this.x = str3;
        this.y = z;
        this.Y1 = runnable;
    }

    public void onClick(View view) {
        a.B(this.c, this.d, this.q, this.x, !this.y, this.Y1);
        Runnable runnable = this.Y1;
        if (runnable != null) {
            runnable.run();
        }
    }
}
