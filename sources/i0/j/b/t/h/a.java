package i0.j.b.t.h;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.ArrayList;

/* compiled from: DisclaimerListAdapter */
public class a extends BaseAdapter {
    public Context c;
    public ArrayList<com.instabug.bug.view.g.a> d;

    @SuppressLint({"ERADICATE_FIELD_NOT_INITIALIZED"})
    /* compiled from: DisclaimerListAdapter */
    public static class b {
        public TextView a;
        public TextView b;

        public b() {
        }

        public b(C0163a aVar) {
        }
    }

    public a(Context context, ArrayList<com.instabug.bug.view.g.a> arrayList) {
        this.c = context;
        this.d = arrayList;
    }

    public int getCount() {
        return this.d.size();
    }

    public Object getItem(int i) {
        return this.d.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r5, android.view.View r6, android.view.ViewGroup r7) {
        /*
            r4 = this;
            java.util.ArrayList<com.instabug.bug.view.g.a> r0 = r4.d
            java.lang.Object r5 = r0.get(r5)
            com.instabug.bug.view.g.a r5 = (com.instabug.bug.view.g.a) r5
            r0 = 0
            if (r6 != 0) goto L_0x0035
            i0.j.b.t.h.a$b r6 = new i0.j.b.t.h.a$b
            r1 = 0
            r6.<init>(r1)
            android.content.Context r1 = r4.c
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            int r2 = com.instabug.library.R.layout.instabug_lyt_item_disclaimer
            android.view.View r7 = r1.inflate(r2, r7, r0)
            int r1 = com.instabug.library.R.id.tvKey
            android.view.View r1 = r7.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r6.a = r1
            int r1 = com.instabug.library.R.id.tvValue
            android.view.View r1 = r7.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r6.b = r1
            r7.setTag(r6)
            goto L_0x003e
        L_0x0035:
            java.lang.Object r7 = r6.getTag()
            i0.j.b.t.h.a$b r7 = (i0.j.b.t.h.a.b) r7
            r3 = r7
            r7 = r6
            r6 = r3
        L_0x003e:
            java.lang.String r1 = r5.c
            boolean r2 = r5.q
            if (r2 == 0) goto L_0x0059
            android.text.SpannableString r5 = new android.text.SpannableString
            r5.<init>(r1)
            android.text.style.UnderlineSpan r1 = new android.text.style.UnderlineSpan
            r1.<init>()
            int r2 = r5.length()
            r5.setSpan(r1, r0, r2, r0)
            java.lang.String r0 = ""
            r1 = r5
            goto L_0x005f
        L_0x0059:
            java.lang.String r5 = r5.d
            java.lang.String r0 = java.lang.String.valueOf(r5)
        L_0x005f:
            android.widget.TextView r5 = r6.a
            r5.setText(r1)
            android.widget.TextView r5 = r6.b
            r5.setText(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.j.b.t.h.a.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
