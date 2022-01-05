package i0.i;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.hbb20.CountryCodePicker;
import com.hbb20.R;
import i0.g.a.c;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CountryCodeAdapter */
public class h extends RecyclerView.Adapter<a> implements c {
    public List<a> a = null;
    public List<a> b = null;
    public TextView c;
    public CountryCodePicker d;
    public LayoutInflater e;
    public EditText f;
    public Dialog g;
    public Context h;
    public RelativeLayout i;
    public ImageView j;
    public int k = 0;

    /* compiled from: CountryCodeAdapter */
    public class a extends RecyclerView.b0 {
        public RelativeLayout a;
        public TextView b;
        public TextView c = ((TextView) this.a.findViewById(R.id.textView_code));
        public ImageView d = ((ImageView) this.a.findViewById(R.id.image_flag));
        public LinearLayout e = ((LinearLayout) this.a.findViewById(R.id.linear_flag_holder));
        public View f = this.a.findViewById(R.id.preferenceDivider);

        public a(View view) {
            super(view);
            RelativeLayout relativeLayout = (RelativeLayout) view;
            this.a = relativeLayout;
            this.b = (TextView) relativeLayout.findViewById(R.id.textView_countryName);
            if (h.this.d.getDialogTextColor() != 0) {
                this.b.setTextColor(h.this.d.getDialogTextColor());
                this.c.setTextColor(h.this.d.getDialogTextColor());
                this.f.setBackgroundColor(h.this.d.getDialogTextColor());
            }
            try {
                if (h.this.d.getDialogTypeFace() == null) {
                    return;
                }
                if (h.this.d.getDialogTypeFaceStyle() != -99) {
                    this.c.setTypeface(h.this.d.getDialogTypeFace(), h.this.d.getDialogTypeFaceStyle());
                    this.b.setTypeface(h.this.d.getDialogTypeFace(), h.this.d.getDialogTypeFaceStyle());
                    return;
                }
                this.c.setTypeface(h.this.d.getDialogTypeFace());
                this.b.setTypeface(h.this.d.getDialogTypeFace());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public h(Context context, List<a> list, CountryCodePicker countryCodePicker, RelativeLayout relativeLayout, EditText editText, TextView textView, Dialog dialog, ImageView imageView) {
        this.h = context;
        this.b = list;
        this.d = countryCodePicker;
        this.g = dialog;
        this.c = textView;
        this.f = editText;
        this.i = relativeLayout;
        this.j = imageView;
        this.e = LayoutInflater.from(context);
        this.a = b("");
        if (this.d.z2) {
            this.j.setVisibility(8);
            EditText editText2 = this.f;
            if (editText2 != null) {
                editText2.addTextChangedListener(new e(this));
                this.f.setOnEditorActionListener(new f(this));
            }
            this.j.setOnClickListener(new d(this));
            return;
        }
        this.i.setVisibility(8);
    }

    public String a(int i2) {
        a aVar = this.a.get(i2);
        if (this.k > i2) {
            return "★";
        }
        return aVar != null ? aVar.a2.substring(0, 1) : "☺";
    }

    public final List<a> b(String str) {
        ArrayList arrayList = new ArrayList();
        this.k = 0;
        List<a> list = this.d.Q2;
        if (list != null && list.size() > 0) {
            for (a next : this.d.Q2) {
                if (next.r(str)) {
                    arrayList.add(next);
                    this.k++;
                }
            }
            if (arrayList.size() > 0) {
                arrayList.add((Object) null);
                this.k++;
            }
        }
        for (a next2 : this.b) {
            if (next2.r(str)) {
                arrayList.add(next2);
            }
        }
        return arrayList;
    }

    public int getItemCount() {
        return this.a.size();
    }

    public void onBindViewHolder(RecyclerView.b0 b0Var, int i2) {
        a aVar = (a) b0Var;
        a aVar2 = this.a.get(i2);
        if (aVar2 != null) {
            aVar.f.setVisibility(8);
            aVar.b.setVisibility(0);
            aVar.c.setVisibility(0);
            if (h.this.d.t2) {
                aVar.c.setVisibility(0);
            } else {
                aVar.c.setVisibility(8);
            }
            String str = "";
            if (h.this.d.getCcpDialogShowFlag() && h.this.d.G2) {
                StringBuilder P0 = i0.d.a.a.a.P0(str);
                P0.append(a.l(aVar2));
                P0.append("   ");
                str = P0.toString();
            }
            StringBuilder P02 = i0.d.a.a.a.P0(str);
            P02.append(aVar2.a2);
            String sb = P02.toString();
            if (h.this.d.getCcpDialogShowNameCode()) {
                StringBuilder S0 = i0.d.a.a.a.S0(sb, " (");
                S0.append(aVar2.Y1.toUpperCase());
                S0.append(")");
                sb = S0.toString();
            }
            aVar.b.setText(sb);
            TextView textView = aVar.c;
            StringBuilder P03 = i0.d.a.a.a.P0("+");
            P03.append(aVar2.Z1);
            textView.setText(P03.toString());
            if (!h.this.d.getCcpDialogShowFlag() || h.this.d.G2) {
                aVar.e.setVisibility(8);
            } else {
                aVar.e.setVisibility(0);
                aVar.d.setImageResource(aVar2.n());
            }
        } else {
            aVar.f.setVisibility(0);
            aVar.b.setVisibility(8);
            aVar.c.setVisibility(8);
            aVar.e.setVisibility(8);
        }
        if (this.a.size() <= i2 || this.a.get(i2) == null) {
            aVar.a.setOnClickListener((View.OnClickListener) null);
        } else {
            aVar.a.setOnClickListener(new g(this, i2));
        }
    }

    public RecyclerView.b0 onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return new a(this.e.inflate(R.layout.layout_recycler_country_tile, viewGroup, false));
    }
}
