package i0.e.b.g3.i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.clubhouse.android.core.ui.BaseEpoxyModelWithHolder;
import com.clubhouse.core.ui.R;
import com.clubhouse.core.ui.databinding.ActionSheetItemBinding;
import i0.e.b.d3.k;
import m0.n.b.i;

/* compiled from: ActionItem.kt */
public abstract class d extends BaseEpoxyModelWithHolder<a> {
    public c j;
    public boolean k;
    public View.OnClickListener l;

    /* compiled from: ActionItem.kt */
    public static final class a extends i0.e.b.a3.f.d {
        public ActionSheetItemBinding b;

        public void a(View view) {
            i.e(view, "itemView");
            ActionSheetItemBinding bind = ActionSheetItemBinding.bind(view);
            i.d(bind, "bind(itemView)");
            i.e(bind, "<set-?>");
            this.b = bind;
        }

        public final ActionSheetItemBinding b() {
            ActionSheetItemBinding actionSheetItemBinding = this.b;
            if (actionSheetItemBinding != null) {
                return actionSheetItemBinding;
            }
            i.m("binding");
            throw null;
        }
    }

    /* renamed from: K */
    public void k(a aVar) {
        String str;
        String str2;
        String str3;
        int i;
        Integer num;
        Integer num2;
        Integer num3;
        i.e(aVar, "holder");
        TextView textView = aVar.b().d;
        c cVar = this.j;
        m0.i iVar = null;
        if (cVar == null) {
            str = null;
        } else {
            str = cVar.d;
        }
        textView.setText(str);
        TextView textView2 = aVar.b().b;
        c cVar2 = this.j;
        if (cVar2 == null) {
            str2 = null;
        } else {
            str2 = cVar2.e;
        }
        textView2.setText(str2);
        TextView textView3 = aVar.b().b;
        i.d(textView3, "holder.binding.actionExplanation");
        c cVar3 = this.j;
        if (cVar3 == null) {
            str3 = null;
        } else {
            str3 = cVar3.e;
        }
        k.L(textView3, Boolean.valueOf(str3 != null));
        ImageView imageView = aVar.b().e;
        i.d(imageView, "holder.binding.selectedIcon");
        k.L(imageView, Boolean.valueOf(this.k));
        aVar.b().a.setOnClickListener(this.l);
        c cVar4 = this.j;
        if (!(cVar4 == null || (num3 = cVar4.a) == null)) {
            int intValue = num3.intValue();
            ImageView imageView2 = aVar.b().c;
            i.d(imageView2, "holder.binding.actionIcon");
            k.K(imageView2);
            aVar.b().c.setImageResource(intValue);
            iVar = m0.i.a;
        }
        if (iVar == null) {
            ImageView imageView3 = aVar.b().c;
            i.d(imageView3, "holder.binding.actionIcon");
            k.p(imageView3);
        }
        Context context = aVar.b().a.getContext();
        i.d(context, "context");
        i.e(context, "<this>");
        i.e(context, "<this>");
        i.e(context, "<this>");
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16842806, typedValue, true);
        int i2 = typedValue.resourceId;
        if (i2 == 0) {
            i2 = typedValue.data;
        }
        int color = h0.i.b.a.getColor(context, i2);
        c cVar5 = this.j;
        if (cVar5 == null || (num2 = cVar5.b) == null) {
            i = color;
        } else {
            i = h0.i.b.a.getColor(context, num2.intValue());
        }
        c cVar6 = this.j;
        if (!(cVar6 == null || (num = cVar6.c) == null)) {
            color = h0.i.b.a.getColor(context, num.intValue());
        }
        aVar.b().d.setTextColor(i);
        aVar.b().b.setTextColor(i);
        aVar.b().c.setImageTintList(ColorStateList.valueOf(color));
    }

    public int o() {
        return R.layout.action_sheet_item;
    }
}
