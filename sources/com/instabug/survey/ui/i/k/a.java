package com.instabug.survey.ui.i.k;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.instabug.survey.R;
import com.instabug.survey.models.b;
import com.instabug.survey.ui.custom.RatingView;
import i0.j.f.s.g.e;

/* compiled from: StarRatingQuestionFragment */
public class a extends com.instabug.survey.ui.i.a implements RatingView.b {
    public RatingView b2;

    public String J0() {
        if (this.b2 != null) {
            return i0.d.a.a.a.u0(new StringBuilder(), (int) this.b2.getRating(), "");
        }
        return null;
    }

    public int getLayout() {
        return R.layout.instabug_star_rating_question;
    }

    public void initViews(View view, Bundle bundle) {
        super.initViews(view, bundle);
        this.q = (TextView) view.findViewById(R.id.instabug_text_view_question);
        RatingView ratingView = (RatingView) view.findViewById(R.id.ib_ratingbar);
        this.b2 = ratingView;
        if (ratingView != null) {
            ratingView.setOnRatingBarChangeListener(this);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        if (getArguments() != null) {
            this.c = (b) getArguments().getSerializable("question");
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        TextView textView;
        RatingView ratingView;
        super.onViewCreated(view, bundle);
        b bVar = this.c;
        if (bVar != null && (textView = this.q) != null) {
            textView.setText(bVar.d);
            String str = bVar.y;
            if (str != null && !str.isEmpty() && (ratingView = this.b2) != null) {
                ratingView.d(Float.valueOf(bVar.y).floatValue(), false);
            }
        }
    }

    public void u0(RatingView ratingView, float f, boolean z) {
        b bVar = this.c;
        if (bVar != null) {
            if (f >= 1.0f) {
                bVar.b(((int) f) + "");
            } else {
                bVar.b((String) null);
            }
            e eVar = this.d;
            if (eVar != null) {
                b bVar2 = this.c;
                com.instabug.survey.ui.i.b bVar3 = (com.instabug.survey.ui.i.b) eVar;
                if (bVar3.c != null) {
                    String str = bVar2.y;
                    if (str == null) {
                        bVar3.K0(false);
                    } else if (Integer.parseInt(str) >= 1) {
                        bVar3.K0(true);
                        if (bVar3.c.getQuestions() != null) {
                            bVar3.c.getQuestions().get(bVar3.I0(bVar2.c)).b(bVar2.y);
                        }
                    } else {
                        bVar3.K0(false);
                    }
                }
            }
        }
    }
}
