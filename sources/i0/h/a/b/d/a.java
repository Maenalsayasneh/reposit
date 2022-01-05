package i0.h.a.b.d;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.RecentlyNonNull;
import i0.h.a.b.c.b;
import i0.h.a.b.c.i.r;
import i0.h.a.b.d.c;
import java.util.LinkedList;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
public abstract class a<T extends c> {
    public T a;
    public Bundle b;
    public LinkedList<C0135a> c;
    public final e<T> d = new f(this);

    /* renamed from: i0.h.a.b.d.a$a  reason: collision with other inner class name */
    /* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
    public interface C0135a {
        void a(c cVar);

        int b();
    }

    public abstract void a(@RecentlyNonNull e<T> eVar);

    @RecentlyNonNull
    public View b(@RecentlyNonNull LayoutInflater layoutInflater, @RecentlyNonNull ViewGroup viewGroup, @RecentlyNonNull Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        d(bundle, new j(this, frameLayout, layoutInflater, viewGroup, bundle));
        if (this.a == null) {
            Object obj = b.b;
            b bVar = b.c;
            Context context = frameLayout.getContext();
            int c2 = bVar.c(context);
            String e = r.e(context, c2);
            String f = r.f(context, c2);
            LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
            linearLayout.setOrientation(1);
            linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            frameLayout.addView(linearLayout);
            TextView textView = new TextView(frameLayout.getContext());
            textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            textView.setText(e);
            linearLayout.addView(textView);
            Intent a2 = bVar.a(context, c2, (String) null);
            if (a2 != null) {
                Button button = new Button(context);
                button.setId(16908313);
                button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                button.setText(f);
                linearLayout.addView(button);
                button.setOnClickListener(new i(context, a2));
            }
        }
        return frameLayout;
    }

    public final void c(int i) {
        while (!this.c.isEmpty() && this.c.getLast().b() >= i) {
            this.c.removeLast();
        }
    }

    public final void d(Bundle bundle, C0135a aVar) {
        T t = this.a;
        if (t != null) {
            aVar.a(t);
            return;
        }
        if (this.c == null) {
            this.c = new LinkedList<>();
        }
        this.c.add(aVar);
        if (bundle != null) {
            Bundle bundle2 = this.b;
            if (bundle2 == null) {
                this.b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        a(this.d);
    }
}
