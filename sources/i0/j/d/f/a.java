package i0.j.d.f;

import android.content.Context;
import android.graphics.Color;
import android.widget.TextView;
import com.instabug.featuresrequest.R;
import com.instabug.featuresrequest.d.b;

/* compiled from: StatusBinder */
public class a {

    /* renamed from: i0.j.d.f.a$a  reason: collision with other inner class name */
    /* compiled from: StatusBinder */
    public static /* synthetic */ class C0172a {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0011 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0027 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0032 */
        static {
            /*
                com.instabug.featuresrequest.d.b.a.values()
                r0 = 5
                int[] r1 = new int[r0]
                a = r1
                com.instabug.featuresrequest.d.b$a r2 = com.instabug.featuresrequest.d.b.a.Completed     // Catch:{ NoSuchFieldError -> 0x0011 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0011 }
                r3 = 1
                r1[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0011 }
            L_0x0011:
                int[] r1 = a     // Catch:{ NoSuchFieldError -> 0x001c }
                com.instabug.featuresrequest.d.b$a r2 = com.instabug.featuresrequest.d.b.a.InProgress     // Catch:{ NoSuchFieldError -> 0x001c }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x001c }
                r3 = 2
                r1[r2] = r3     // Catch:{ NoSuchFieldError -> 0x001c }
            L_0x001c:
                int[] r1 = a     // Catch:{ NoSuchFieldError -> 0x0027 }
                com.instabug.featuresrequest.d.b$a r2 = com.instabug.featuresrequest.d.b.a.Planned     // Catch:{ NoSuchFieldError -> 0x0027 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0027 }
                r3 = 3
                r1[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0027 }
            L_0x0027:
                int[] r1 = a     // Catch:{ NoSuchFieldError -> 0x0032 }
                com.instabug.featuresrequest.d.b$a r2 = com.instabug.featuresrequest.d.b.a.Open     // Catch:{ NoSuchFieldError -> 0x0032 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0032 }
                r3 = 4
                r1[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                int[] r1 = a     // Catch:{ NoSuchFieldError -> 0x003c }
                com.instabug.featuresrequest.d.b$a r2 = com.instabug.featuresrequest.d.b.a.MaybeLater     // Catch:{ NoSuchFieldError -> 0x003c }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x003c }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x003c }
            L_0x003c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: i0.j.d.f.a.C0172a.<clinit>():void");
        }
    }

    public static void a(b.a aVar, String str, TextView textView, Context context) {
        int i = C0172a.a[aVar.ordinal()];
        if (i == 1) {
            textView.setText(R.string.ib_feature_rq_status_completed);
            b(str, textView, context, R.color.ib_fr_color_completed);
        } else if (i == 2) {
            textView.setText(R.string.ib_feature_rq_status_inprogress);
            b(str, textView, context, R.color.ib_fr_color_in_progress);
        } else if (i == 3) {
            textView.setText(R.string.ib_feature_rq_status_planned);
            b(str, textView, context, R.color.ib_fr_color_planned);
        } else if (i == 4) {
            textView.setText(R.string.ib_feature_rq_status_open);
            b(str, textView, context, R.color.ib_fr_color_planned);
        } else if (i == 5) {
            textView.setText(R.string.ib_feature_rq_status_maybe_later);
            b(str, textView, context, R.color.ib_fr_color_maybe_later);
        }
    }

    public static void b(String str, TextView textView, Context context, int i) {
        if (str != null) {
            i0.j.c.l.a.z(textView, Color.parseColor(str));
        } else {
            i0.j.c.l.a.z(textView, h0.i.b.a.getColor(context, i));
        }
    }
}
