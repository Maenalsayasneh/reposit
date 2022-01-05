package i0.j.e.m0.e;

import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.instabug.library.Instabug;
import com.instabug.library.R;
import com.instabug.library.invocation.invocationdialog.InstabugDialogItem;
import java.util.ArrayList;

/* compiled from: InstabugDialogAdapter */
public class e extends BaseAdapter {
    public ArrayList<InstabugDialogItem> c = new ArrayList<>();

    /* compiled from: InstabugDialogAdapter */
    public static class a {
        public ImageView a;
        public TextView b;
        public TextView c;

        public a(View view) {
            this.a = (ImageView) view.findViewById(R.id.instabug_prompt_option_icon);
            this.b = (TextView) view.findViewById(R.id.instabug_prompt_option_title);
            this.c = (TextView) view.findViewById(R.id.instabug_prompt_option_description);
        }
    }

    public int getCount() {
        return this.c.size();
    }

    public Object getItem(int i) {
        return this.c.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        a aVar;
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ib_dialog_list_item, viewGroup, false);
            aVar = new a(view);
            view.setTag(aVar);
        } else {
            aVar = (a) view.getTag();
        }
        InstabugDialogItem instabugDialogItem = this.c.get(i);
        aVar.b.setText(instabugDialogItem.getTitle());
        if (TextUtils.isEmpty(instabugDialogItem.getDescription())) {
            aVar.c.setVisibility(8);
        } else {
            aVar.c.setVisibility(0);
            aVar.c.setText(instabugDialogItem.getDescription());
        }
        if (instabugDialogItem.getResDrawable() != 0) {
            aVar.a.setImageResource(instabugDialogItem.getResDrawable());
            aVar.a.setVisibility(0);
            aVar.a.getDrawable().setColorFilter(Instabug.getPrimaryColor(), PorterDuff.Mode.SRC_IN);
        } else {
            aVar.a.setVisibility(8);
            TextView textView = aVar.b;
            if (textView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).setMargins(0, 0, 0, 0);
                textView.requestLayout();
            }
            TextView textView2 = aVar.c;
            if (textView2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).setMargins(0, 4, 0, 0);
                textView2.requestLayout();
            }
        }
        return view;
    }
}
