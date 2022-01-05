package com.instabug.survey.ui.i.j;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.instabug.library.Instabug;
import com.instabug.library.util.Colorizer;
import com.instabug.survey.R;
import com.instabug.survey.models.Survey;
import com.instabug.survey.models.b;
import i0.j.f.o.c;

/* compiled from: RateUsFragment */
public class a extends com.instabug.survey.ui.i.a {
    public static final /* synthetic */ int b2 = 0;
    public TextView c2;
    public ImageView d2;

    public String J0() {
        b bVar = this.c;
        if (bVar == null) {
            return null;
        }
        return bVar.y;
    }

    public int getLayout() {
        return R.layout.survey_rate_us_fragment;
    }

    public void initViews(View view, Bundle bundle) {
        Drawable drawable;
        super.initViews(view, bundle);
        this.q = (TextView) view.findViewById(R.id.txt_rate_us_question);
        this.c2 = (TextView) view.findViewById(R.id.txt_rate_us_title);
        ImageView imageView = (ImageView) view.findViewById(R.id.instabug_img_thanks);
        this.d2 = imageView;
        imageView.setColorFilter(Instabug.getPrimaryColor());
        if (!(getContext() == null || (drawable = h0.i.b.a.getDrawable(getContext(), R.drawable.ibg_survey_ic_thanks_background)) == null)) {
            this.d2.setBackgroundDrawable(Colorizer.getPrimaryColorTintedDrawable(drawable));
        }
        this.c2.setTextColor(Instabug.getPrimaryColor());
        ImageView imageView2 = this.y;
        if (imageView2 != null) {
            imageView2.setOnClickListener((View.OnClickListener) null);
            this.y.setVisibility(8);
            if (getContext() != null) {
                Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.ib_srv_anim_fade_in_scale);
                Context context = getContext();
                int i = R.anim.ib_srv_anim_fly_in;
                Animation loadAnimation2 = AnimationUtils.loadAnimation(context, i);
                Animation loadAnimation3 = AnimationUtils.loadAnimation(getContext(), i);
                loadAnimation2.setStartOffset(300);
                loadAnimation3.setStartOffset(400);
                this.c2.getViewTreeObserver().addOnGlobalLayoutListener(new i0.j.f.s.g.j.a(this, loadAnimation, loadAnimation2, loadAnimation3));
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        if (getArguments() != null) {
            this.c = (b) getArguments().getSerializable("question");
        }
    }

    public void onResume() {
        super.onResume();
        Survey survey = this.Z1;
        if (survey != null && this.q != null && this.c != null) {
            if (survey.getThankYouTitle() != null) {
                this.c2.setText(this.Z1.getThankYouTitle());
            } else {
                this.c2.setText(R.string.instabug_custom_survey_thanks_title);
            }
            if (this.Z1.getThankYouMessage() != null) {
                this.q.setText(this.Z1.getThankYouMessage());
            } else {
                this.q.setText(this.c.d);
            }
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.Z1 != null && c.e() && this.Z1.isAppStoreRatingEnabled()) {
            return super.onTouch(view, motionEvent);
        }
        return true;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
    }
}
