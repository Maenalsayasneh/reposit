package i0.e.b.g3.o.x0;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.clubhouse.android.core.ui.BaseEpoxyModelWithHolder;
import com.clubhouse.android.databinding.EventActionBinding;
import i0.e.b.a3.f.d;
import i0.e.b.d3.k;
import m0.n.b.i;

/* compiled from: EventAction.kt */
public abstract class c extends BaseEpoxyModelWithHolder<a> {
    public String j;
    public Integer k;
    public boolean l;
    public Integer m;
    public View.OnClickListener n;

    /* compiled from: EventAction.kt */
    public static final class a extends d {
        public EventActionBinding b;

        public void a(View view) {
            i.e(view, "itemView");
            EventActionBinding bind = EventActionBinding.bind(view);
            i.d(bind, "bind(itemView)");
            i.e(bind, "<set-?>");
            this.b = bind;
        }

        public final EventActionBinding b() {
            EventActionBinding eventActionBinding = this.b;
            if (eventActionBinding != null) {
                return eventActionBinding;
            }
            i.m("binding");
            throw null;
        }
    }

    /* renamed from: K */
    public void k(a aVar) {
        i.e(aVar, "holder");
        aVar.b().c.setText(this.j);
        ImageView imageView = aVar.b().b;
        Integer num = this.k;
        i.c(num);
        imageView.setImageResource(num.intValue());
        if (this.l) {
            ImageView imageView2 = aVar.b().b;
            i.d(imageView2, "holder.binding.icon");
            k.h(imageView2);
            TextView textView = aVar.b().c;
            i.d(textView, "holder.binding.title");
            k.h(textView);
            aVar.b().a.setClickable(false);
        } else {
            ImageView imageView3 = aVar.b().b;
            i.d(imageView3, "holder.binding.icon");
            k.j(imageView3);
            TextView textView2 = aVar.b().c;
            i.d(textView2, "holder.binding.title");
            k.j(textView2);
            aVar.b().a.setOnClickListener(this.n);
        }
        Integer num2 = this.m;
        if (num2 != null) {
            aVar.b().b.setColorFilter(num2.intValue());
        }
    }

    public int p(int i, int i2, int i3) {
        return 10;
    }
}
