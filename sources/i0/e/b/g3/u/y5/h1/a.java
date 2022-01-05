package i0.e.b.g3.u.y5.h1;

import android.view.View;
import com.clubhouse.android.databinding.ReportReasonBinding;
import i0.b.a.u;
import i0.e.b.a3.f.d;
import m0.n.b.i;

/* compiled from: ReportReason.kt */
public abstract class a extends u<C0210a> {
    public String i;
    public View.OnClickListener j;

    /* renamed from: i0.e.b.g3.u.y5.h1.a$a  reason: collision with other inner class name */
    /* compiled from: ReportReason.kt */
    public static final class C0210a extends d {
        public ReportReasonBinding b;

        public void a(View view) {
            i.e(view, "itemView");
            ReportReasonBinding bind = ReportReasonBinding.bind(view);
            i.d(bind, "bind(itemView)");
            i.e(bind, "<set-?>");
            this.b = bind;
        }
    }

    /* renamed from: I */
    public void k(C0210a aVar) {
        i.e(aVar, "holder");
        ReportReasonBinding reportReasonBinding = aVar.b;
        if (reportReasonBinding != null) {
            reportReasonBinding.b.setText(this.i);
            ReportReasonBinding reportReasonBinding2 = aVar.b;
            if (reportReasonBinding2 != null) {
                reportReasonBinding2.a.setOnClickListener(this.j);
            } else {
                i.m("binding");
                throw null;
            }
        } else {
            i.m("binding");
            throw null;
        }
    }
}
