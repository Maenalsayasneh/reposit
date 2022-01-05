package i0.j.d.h.c;

import android.graphics.drawable.GradientDrawable;
import com.instabug.featuresrequest.R;
import com.instabug.featuresrequest.d.b;
import com.instabug.library.Instabug;
import com.instabug.library.InstabugColorTheme;
import com.instabug.library.view.ViewUtils;

/* compiled from: FeatureRequestsDetailsFragment */
public class a implements Runnable {
    public final /* synthetic */ b c;
    public final /* synthetic */ com.instabug.featuresrequest.ui.c.a d;

    public a(com.instabug.featuresrequest.ui.c.a aVar, b bVar) {
        this.d = aVar;
        this.c = bVar;
    }

    public void run() {
        if (this.d.isAdded() && !this.d.isRemoving() && this.d.getContext() != null) {
            this.d.d2.setImageResource(R.drawable.ibg_fr_ic_vote_arrow_white);
            GradientDrawable gradientDrawable = (GradientDrawable) this.d.d.getBackground();
            com.instabug.featuresrequest.ui.c.a aVar = this.d;
            aVar.x.setText(aVar.getString(R.string.feature_request_votes_count, Integer.valueOf(this.c.a2)));
            if (Instabug.getTheme() == InstabugColorTheme.InstabugColorThemeLight) {
                if (this.c.c2) {
                    gradientDrawable.setStroke(ViewUtils.convertDpToPx(this.d.getContext(), 2.0f), h0.i.b.a.getColor(this.d.getContext(), 17170443));
                    gradientDrawable.setColor(h0.i.b.a.getColor(this.d.getContext(), 17170443));
                    this.d.x.setTextColor(Instabug.getPrimaryColor());
                    this.d.d2.getDrawable().setTint(Instabug.getPrimaryColor());
                    this.d.d.setBackground(gradientDrawable);
                    return;
                }
                gradientDrawable.setStroke(ViewUtils.convertDpToPx(this.d.getContext(), 2.0f), h0.i.b.a.getColor(this.d.getContext(), R.color.ib_fr_toolbar_vote_btn_stroke_color));
                gradientDrawable.setColor(h0.i.b.a.getColor(this.d.getContext(), 17170445));
                com.instabug.featuresrequest.ui.c.a aVar2 = this.d;
                aVar2.x.setTextColor(h0.i.b.a.getColor(aVar2.getContext(), 17170443));
                this.d.d2.getDrawable().setTint(h0.i.b.a.getColor(this.d.getContext(), 17170443));
                this.d.d.setBackground(gradientDrawable);
            } else if (this.c.c2) {
                gradientDrawable.setStroke(ViewUtils.convertDpToPx(this.d.getContext(), 2.0f), Instabug.getPrimaryColor());
                gradientDrawable.setColor(Instabug.getPrimaryColor());
                com.instabug.featuresrequest.ui.c.a aVar3 = this.d;
                aVar3.x.setTextColor(h0.i.b.a.getColor(aVar3.getContext(), 17170443));
                this.d.d2.getDrawable().setTint(h0.i.b.a.getColor(this.d.getContext(), 17170443));
                this.d.d.setBackground(gradientDrawable);
            } else {
                gradientDrawable.setStroke(ViewUtils.convertDpToPx(this.d.getContext(), 2.0f), Instabug.getPrimaryColor());
                gradientDrawable.setColor(h0.i.b.a.getColor(this.d.getContext(), 17170445));
                this.d.x.setTextColor(Instabug.getPrimaryColor());
                this.d.d2.getDrawable().setTint(Instabug.getPrimaryColor());
                this.d.d.setBackground(gradientDrawable);
            }
        }
    }
}
