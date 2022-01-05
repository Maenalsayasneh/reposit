package i0.j.d.h.b.c;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instabug.featuresrequest.R;
import com.instabug.featuresrequest.d.b;
import com.instabug.featuresrequest.ui.custom.IbFrRippleView;
import com.instabug.library.Instabug;
import com.instabug.library.InstabugColorTheme;
import com.instabug.library.util.AttrResolver;

/* compiled from: FeatureHolder */
public class c {
    public final TextView a;
    public final ImageView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final TextView g;
    public final IbFrRippleView h;
    public i0.j.d.b.a i;
    public View j;

    /* compiled from: FeatureHolder */
    public static /* synthetic */ class a {
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
            throw new UnsupportedOperationException("Method not decompiled: i0.j.d.h.b.c.c.a.<clinit>():void");
        }
    }

    public c(View view, i0.j.d.b.a aVar) {
        this.j = view;
        this.i = aVar;
        this.a = (TextView) view.findViewById(R.id.instabug_txt_feature_request_vote_txt);
        this.b = (ImageView) view.findViewById(R.id.instabug_txt_feature_request_vote_icon);
        this.c = (TextView) view.findViewById(R.id.instabug_txt_feature_request_title);
        this.d = (TextView) view.findViewById(R.id.instabug_txt_feature_request_vote_count);
        this.e = (TextView) view.findViewById(R.id.instabug_txt_feature_request_comment_count);
        this.f = (TextView) view.findViewById(R.id.instabug_txt_feature_request_status);
        this.g = (TextView) view.findViewById(R.id.instabug_txt_feature_request_date);
        this.h = (IbFrRippleView) view.findViewById(R.id.ib_btn_fr_vote);
    }

    public final void a(b bVar, c cVar, Context context, int i2) {
        String str = bVar.y;
        if (str != null) {
            i0.j.c.l.a.z(cVar.f, Color.parseColor(str));
        } else {
            i0.j.c.l.a.z(cVar.f, h0.i.b.a.getColor(context, i2));
        }
    }

    public void b(Boolean bool) {
        this.b.setImageDrawable(h0.b.b.a.a.a(this.j.getContext(), R.drawable.ibg_fr_ic_vote_arrow));
        if (bool.booleanValue()) {
            this.b.setColorFilter(h0.i.b.a.getColor(this.j.getContext(), R.color.ib_fr_white));
            i0.j.c.l.a.z(this.h, Instabug.getPrimaryColor());
            this.d.setTextColor(h0.i.b.a.getColor(this.j.getContext(), 17170443));
            this.a.setTextColor(h0.i.b.a.getColor(this.j.getContext(), 17170443));
            return;
        }
        i0.j.c.l.a.z(this.h, 17170443);
        if (Instabug.getTheme() == InstabugColorTheme.InstabugColorThemeLight) {
            ImageView imageView = this.b;
            Context context = this.j.getContext();
            int i2 = R.color.ib_fr_color_ptr_loading_txt;
            imageView.setColorFilter(h0.i.b.a.getColor(context, i2));
            this.d.setTextColor(h0.i.b.a.getColor(this.j.getContext(), i2));
            this.a.setTextColor(h0.i.b.a.getColor(this.j.getContext(), i2));
            return;
        }
        this.b.setColorFilter(h0.i.b.a.getColor(this.j.getContext(), R.color.ib_fr_vote_text_dark));
        TextView textView = this.d;
        Context context2 = this.j.getContext();
        int i3 = R.attr.instabug_fr_text_color;
        textView.setTextColor(AttrResolver.getColor(context2, i3));
        this.a.setTextColor(AttrResolver.getColor(this.j.getContext(), i3));
    }
}
