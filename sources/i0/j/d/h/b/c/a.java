package i0.j.d.h.b.c;

import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.instabug.featuresrequest.R;
import com.instabug.featuresrequest.d.b;
import i0.j.d.h.b.c.c;

/* compiled from: FeatureAdapter */
public class a extends BaseAdapter {
    public e c;
    public i0.j.d.b.a d;

    /* renamed from: i0.j.d.h.b.c.a$a  reason: collision with other inner class name */
    /* compiled from: FeatureAdapter */
    public class C0174a implements View.OnClickListener {
        public final /* synthetic */ int c;

        public C0174a(int i) {
            this.c = i;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
            r3 = (i0.j.d.h.b.c.e) r3;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r3) {
            /*
                r2 = this;
                i0.j.d.h.b.c.a r3 = i0.j.d.h.b.c.a.this
                i0.j.d.b.a r3 = r3.d
                int r0 = r2.c
                com.instabug.featuresrequest.ui.b.c.e r3 = (com.instabug.featuresrequest.ui.b.c.e) r3
                P r3 = r3.presenter
                if (r3 == 0) goto L_0x001d
                i0.j.d.h.b.c.e r3 = (i0.j.d.h.b.c.e) r3
                i0.j.d.h.b.c.d r1 = r3.c
                if (r1 == 0) goto L_0x001d
                i0.j.d.h.b.b r3 = r3.d
                i0.j.d.h.b.a r3 = r3.a
                com.instabug.featuresrequest.d.b r3 = r3.a(r0)
                r1.z0(r3)
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: i0.j.d.h.b.c.a.C0174a.onClick(android.view.View):void");
        }
    }

    public a(e eVar, i0.j.d.b.a aVar) {
        this.c = eVar;
        this.d = aVar;
    }

    public int getCount() {
        return this.c.m();
    }

    public Object getItem(int i) {
        return Integer.valueOf(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        c cVar;
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ib_fr_feature_request_item, viewGroup, false);
            cVar = new c(view, this.d);
            view.setTag(cVar);
        } else {
            cVar = (c) view.getTag();
        }
        b a = this.c.d.a.a(i);
        cVar.c.setText(Html.fromHtml(a.d, 63));
        int i2 = c.a.a[a.x.ordinal()];
        if (i2 == 1) {
            cVar.f.setText(R.string.ib_feature_rq_status_completed);
            cVar.a(a, cVar, cVar.j.getContext(), R.color.ib_fr_color_completed);
            cVar.h.setEnabled(false);
        } else if (i2 == 2) {
            cVar.f.setText(R.string.ib_feature_rq_status_inprogress);
            cVar.a(a, cVar, cVar.j.getContext(), R.color.ib_fr_color_in_progress);
            cVar.h.setEnabled(true);
        } else if (i2 == 3) {
            cVar.f.setText(R.string.ib_feature_rq_status_planned);
            cVar.a(a, cVar, cVar.j.getContext(), R.color.ib_fr_color_planned);
            cVar.h.setEnabled(true);
        } else if (i2 == 4) {
            cVar.f.setText(R.string.ib_feature_rq_status_open);
            cVar.a(a, cVar, cVar.j.getContext(), R.color.ib_fr_color_opened);
            cVar.h.setEnabled(true);
        } else if (i2 == 5) {
            cVar.f.setText(R.string.ib_feature_rq_status_maybe_later);
            cVar.a(a, cVar, cVar.j.getContext(), R.color.ib_fr_color_maybe_later);
            cVar.h.setEnabled(true);
        }
        cVar.e.setText(i0.j.c.l.a.o(String.valueOf(a.b2)));
        cVar.d.setText(i0.j.c.l.a.o(String.valueOf(a.a2)));
        cVar.g.setText(i0.j.c.l.a.n(cVar.j.getContext(), a.Z1));
        cVar.b(Boolean.valueOf(a.c2));
        cVar.h.setOnClickListener(new b(cVar, a));
        view.setOnClickListener(new C0174a(i));
        return view;
    }
}
