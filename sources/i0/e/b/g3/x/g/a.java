package i0.e.b.g3.x.g;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.clubhouse.android.core.ui.BaseEpoxyModelWithHolder;
import com.clubhouse.core.ui.R;
import com.clubhouse.core.ui.databinding.SelectionBinding;
import i0.e.b.a3.f.d;
import i0.e.b.d3.k;
import m0.n.b.i;

/* compiled from: SelectionItem.kt */
public abstract class a extends BaseEpoxyModelWithHolder<C0211a> {
    public String j;
    public String k;
    public boolean l;
    public View.OnClickListener m;

    /* renamed from: i0.e.b.g3.x.g.a$a  reason: collision with other inner class name */
    /* compiled from: SelectionItem.kt */
    public static final class C0211a extends d {
        public SelectionBinding b;

        public void a(View view) {
            i.e(view, "itemView");
            SelectionBinding bind = SelectionBinding.bind(view);
            i.d(bind, "bind(itemView)");
            i.e(bind, "<set-?>");
            this.b = bind;
        }

        public final SelectionBinding b() {
            SelectionBinding selectionBinding = this.b;
            if (selectionBinding != null) {
                return selectionBinding;
            }
            i.m("binding");
            throw null;
        }
    }

    /* renamed from: K */
    public void k(C0211a aVar) {
        i.e(aVar, "holder");
        TextView textView = aVar.b().d;
        String str = this.j;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        textView.setText(str);
        TextView textView2 = aVar.b().c;
        String str3 = this.k;
        if (str3 != null) {
            str2 = str3;
        }
        textView2.setText(str2);
        TextView textView3 = aVar.b().c;
        i.d(textView3, "holder.binding.selectionSubTitle");
        String str4 = this.k;
        k.q(textView3, Boolean.valueOf(str4 == null || str4.length() == 0));
        ImageView imageView = aVar.b().b;
        i.d(imageView, "holder.binding.selectedIcon");
        k.L(imageView, Boolean.valueOf(this.l));
        aVar.b().a.setOnClickListener(this.m);
    }

    public int o() {
        return R.layout.selection;
    }
}
