package com.instabug.survey.ui.i.m;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instabug.library.core.ui.InstabugBaseFragment;
import com.instabug.survey.R;
import com.instabug.survey.models.Survey;
import i0.j.f.s.g.l.b;
import i0.j.f.s.g.l.c;

/* compiled from: ThanksFragment */
public class a extends InstabugBaseFragment<c> implements b {
    public static final /* synthetic */ int c = 0;
    public ImageView d;
    public TextView q;
    public TextView x;
    public LinearLayout y;

    public final Survey I0() {
        if (getArguments() != null) {
            return (Survey) getArguments().getSerializable("key_survey");
        }
        return null;
    }

    public int getLayout() {
        return R.layout.instabug_survey_fragment_thanks_dialog;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0081  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void initViews(android.view.View r5, android.os.Bundle r6) {
        /*
            r4 = this;
            int r5 = com.instabug.survey.R.id.instabug_img_thanks
            android.view.View r5 = r4.findViewById(r5)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r4.d = r5
            int r5 = com.instabug.survey.R.id.txt_thanks_title
            android.view.View r5 = r4.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r4.q = r5
            int r5 = com.instabug.survey.R.id.txtSubTitle
            android.view.View r5 = r4.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r4.x = r5
            android.widget.TextView r6 = r4.q
            if (r6 == 0) goto L_0x022b
            android.widget.ImageView r6 = r4.d
            if (r6 == 0) goto L_0x022b
            if (r5 != 0) goto L_0x002a
            goto L_0x022b
        L_0x002a:
            P r5 = r4.presenter
            r6 = 1
            java.lang.String r0 = ""
            r1 = 2
            if (r5 == 0) goto L_0x0086
            com.instabug.survey.models.Survey r5 = r4.I0()
            if (r5 == 0) goto L_0x0086
            android.widget.TextView r5 = r4.q
            if (r5 == 0) goto L_0x0086
            P r5 = r4.presenter
            i0.j.f.s.g.l.c r5 = (i0.j.f.s.g.l.c) r5
            com.instabug.survey.models.Survey r2 = r4.I0()
            java.lang.ref.WeakReference<V> r5 = r5.view
            java.lang.Object r5 = r5.get()
            i0.j.f.s.g.l.b r5 = (i0.j.f.s.g.l.b) r5
            if (r5 == 0) goto L_0x007e
            if (r2 == 0) goto L_0x007e
            java.lang.Object r5 = r5.getViewContext()
            androidx.fragment.app.Fragment r5 = (androidx.fragment.app.Fragment) r5
            int r3 = r2.getType()
            if (r3 == 0) goto L_0x0073
            if (r3 == r6) goto L_0x006e
            if (r3 == r1) goto L_0x0061
            goto L_0x007e
        L_0x0061:
            int r2 = com.instabug.survey.R.string.instabug_store_rating_survey_thanks_title
            java.lang.String r5 = r5.getString(r2)
            com.instabug.library.InstabugCustomTextPlaceHolder$Key r2 = com.instabug.library.InstabugCustomTextPlaceHolder.Key.SURVEYS_STORE_RATING_THANKS_TITLE
            java.lang.String r5 = com.instabug.library.util.PlaceHolderUtils.getPlaceHolder(r2, r5)
            goto L_0x007f
        L_0x006e:
            java.lang.String r5 = r2.getThankYouTitle()
            goto L_0x007f
        L_0x0073:
            java.lang.String r5 = r2.getThankYouTitle()
            com.instabug.library.InstabugCustomTextPlaceHolder$Key r2 = com.instabug.library.InstabugCustomTextPlaceHolder.Key.SURVEYS_CUSTOM_THANKS_TITLE
            java.lang.String r5 = com.instabug.library.util.PlaceHolderUtils.getPlaceHolder(r2, r5)
            goto L_0x007f
        L_0x007e:
            r5 = r0
        L_0x007f:
            if (r5 == 0) goto L_0x0086
            android.widget.TextView r2 = r4.q
            r2.setText(r5)
        L_0x0086:
            int r5 = com.instabug.survey.R.id.instabug_pbi_container
            android.view.View r5 = r4.findViewById(r5)
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            r4.y = r5
            boolean r5 = i0.j.f.o.c.f()
            if (r5 == 0) goto L_0x00ef
            com.instabug.survey.models.Survey r5 = r4.I0()
            if (r5 == 0) goto L_0x00ef
            com.instabug.survey.models.Survey r5 = r4.I0()
            int r5 = r5.getType()
            if (r5 != r1) goto L_0x00ef
            com.instabug.library.InstabugColorTheme r5 = com.instabug.library.Instabug.getTheme()
            com.instabug.library.InstabugColorTheme r6 = com.instabug.library.InstabugColorTheme.InstabugColorThemeLight
            if (r5 != r6) goto L_0x00c9
            android.widget.TextView r5 = r4.q
            r6 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r5.setTextColor(r6)
            android.widget.ImageView r5 = r4.d
            android.content.Context r0 = r4.getContext()
            int r1 = com.instabug.survey.R.drawable.ic_suvey_vz_custom_thanks_background
            android.graphics.drawable.Drawable r0 = h0.i.b.a.getDrawable(r0, r1)
            android.graphics.drawable.Drawable r6 = com.instabug.library.util.Colorizer.getTintedDrawable(r6, r0)
            r5.setBackgroundDrawable(r6)
            goto L_0x00e2
        L_0x00c9:
            android.widget.TextView r5 = r4.q
            r6 = -1
            r5.setTextColor(r6)
            android.widget.ImageView r5 = r4.d
            android.content.Context r0 = r4.getContext()
            int r1 = com.instabug.survey.R.drawable.ic_suvey_vz_custom_thanks_background
            android.graphics.drawable.Drawable r0 = h0.i.b.a.getDrawable(r0, r1)
            android.graphics.drawable.Drawable r6 = com.instabug.library.util.Colorizer.getTintedDrawable(r6, r0)
            r5.setBackgroundDrawable(r6)
        L_0x00e2:
            android.widget.ImageView r5 = r4.d
            java.lang.String r6 = "#f5bf56"
            int r6 = android.graphics.Color.parseColor(r6)
            r5.setColorFilter(r6)
            goto L_0x0185
        L_0x00ef:
            P r5 = r4.presenter
            if (r5 == 0) goto L_0x0145
            com.instabug.survey.models.Survey r5 = r4.I0()
            if (r5 == 0) goto L_0x0145
            android.widget.TextView r5 = r4.x
            if (r5 == 0) goto L_0x0145
            P r5 = r4.presenter
            i0.j.f.s.g.l.c r5 = (i0.j.f.s.g.l.c) r5
            com.instabug.survey.models.Survey r2 = r4.I0()
            java.lang.ref.WeakReference<V> r5 = r5.view
            java.lang.Object r5 = r5.get()
            i0.j.f.s.g.l.b r5 = (i0.j.f.s.g.l.b) r5
            if (r5 == 0) goto L_0x013e
            if (r2 == 0) goto L_0x013e
            java.lang.Object r5 = r5.getViewContext()
            androidx.fragment.app.Fragment r5 = (androidx.fragment.app.Fragment) r5
            int r3 = r2.getType()
            if (r3 == 0) goto L_0x0134
            if (r3 == r6) goto L_0x012f
            if (r3 == r1) goto L_0x0122
            goto L_0x013e
        L_0x0122:
            int r6 = com.instabug.survey.R.string.instabug_store_rating_survey_thanks_subtitle
            java.lang.String r5 = r5.getString(r6)
            com.instabug.library.InstabugCustomTextPlaceHolder$Key r6 = com.instabug.library.InstabugCustomTextPlaceHolder.Key.SURVEYS_STORE_RATING_THANKS_SUBTITLE
            java.lang.String r0 = com.instabug.library.util.PlaceHolderUtils.getPlaceHolder(r6, r5)
            goto L_0x013e
        L_0x012f:
            java.lang.String r0 = r2.getThankYouMessage()
            goto L_0x013e
        L_0x0134:
            java.lang.String r5 = r2.getThankYouMessage()
            com.instabug.library.InstabugCustomTextPlaceHolder$Key r6 = com.instabug.library.InstabugCustomTextPlaceHolder.Key.SURVEYS_CUSTOM_THANKS_SUBTITLE
            java.lang.String r0 = com.instabug.library.util.PlaceHolderUtils.getPlaceHolder(r6, r5)
        L_0x013e:
            if (r0 == 0) goto L_0x0145
            android.widget.TextView r5 = r4.x
            r5.setText(r0)
        L_0x0145:
            com.instabug.library.InstabugColorTheme r5 = com.instabug.library.Instabug.getTheme()
            com.instabug.library.InstabugColorTheme r6 = com.instabug.library.InstabugColorTheme.InstabugColorThemeLight
            if (r5 != r6) goto L_0x0157
            android.widget.TextView r5 = r4.q
            int r6 = com.instabug.library.Instabug.getPrimaryColor()
            r5.setTextColor(r6)
            goto L_0x0167
        L_0x0157:
            android.widget.TextView r5 = r4.q
            android.content.Context r6 = r4.getContext()
            r0 = 17170443(0x106000b, float:2.4611944E-38)
            int r6 = h0.i.b.a.getColor(r6, r0)
            r5.setTextColor(r6)
        L_0x0167:
            android.widget.ImageView r5 = r4.d
            int r6 = com.instabug.library.Instabug.getPrimaryColor()
            r5.setColorFilter(r6)
            android.content.Context r5 = r4.getContext()
            int r6 = com.instabug.survey.R.drawable.ibg_survey_ic_thanks_background
            android.graphics.drawable.Drawable r5 = h0.i.b.a.getDrawable(r5, r6)
            if (r5 == 0) goto L_0x0185
            android.widget.ImageView r6 = r4.d
            android.graphics.drawable.Drawable r5 = com.instabug.library.util.Colorizer.getPrimaryColorTintedDrawable(r5)
            r6.setBackgroundDrawable(r5)
        L_0x0185:
            P r5 = r4.presenter
            if (r5 == 0) goto L_0x01a8
            i0.j.f.s.g.l.c r5 = (i0.j.f.s.g.l.c) r5
            java.lang.ref.WeakReference<V> r5 = r5.view
            if (r5 == 0) goto L_0x01a8
            java.lang.Object r5 = r5.get()
            i0.j.f.s.g.l.b r5 = (i0.j.f.s.g.l.b) r5
            if (r5 == 0) goto L_0x01a8
            com.instabug.library.Feature r6 = com.instabug.library.Feature.WHITE_LABELING
            com.instabug.library.Feature$State r6 = com.instabug.library.core.InstabugCore.getFeatureState(r6)
            com.instabug.library.Feature$State r0 = com.instabug.library.Feature.State.ENABLED
            if (r6 != r0) goto L_0x01a5
            r5.r()
            goto L_0x01a8
        L_0x01a5:
            r5.p()
        L_0x01a8:
            android.content.Context r5 = r4.getContext()
            if (r5 != 0) goto L_0x01af
            goto L_0x01e6
        L_0x01af:
            android.content.Context r5 = r4.getContext()
            int r6 = com.instabug.survey.R.anim.ib_srv_anim_fade_in_scale
            android.view.animation.Animation r5 = android.view.animation.AnimationUtils.loadAnimation(r5, r6)
            android.content.Context r6 = r4.getContext()
            int r0 = com.instabug.survey.R.anim.ib_srv_anim_fly_in
            android.view.animation.Animation r6 = android.view.animation.AnimationUtils.loadAnimation(r6, r0)
            android.content.Context r1 = r4.getContext()
            android.view.animation.Animation r0 = android.view.animation.AnimationUtils.loadAnimation(r1, r0)
            r1 = 300(0x12c, double:1.48E-321)
            r6.setStartOffset(r1)
            r1 = 400(0x190, double:1.976E-321)
            r0.setStartOffset(r1)
            android.widget.TextView r1 = r4.q
            if (r1 != 0) goto L_0x01da
            goto L_0x01e6
        L_0x01da:
            android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
            i0.j.f.s.g.l.a r2 = new i0.j.f.s.g.l.a
            r2.<init>(r4, r5, r6, r0)
            r1.addOnGlobalLayoutListener(r2)
        L_0x01e6:
            h0.o.a.k r5 = r4.getActivity()
            if (r5 == 0) goto L_0x022b
            h0.o.a.k r5 = r4.getActivity()
            com.instabug.survey.ui.SurveyActivity r5 = (com.instabug.survey.ui.SurveyActivity) r5
            P r5 = r5.presenter
            if (r5 == 0) goto L_0x01fb
            i0.j.f.s.d r5 = (i0.j.f.s.d) r5
            com.instabug.survey.ui.f r5 = r5.c
            goto L_0x01fd
        L_0x01fb:
            com.instabug.survey.ui.f r5 = com.instabug.survey.ui.f.PRIMARY
        L_0x01fd:
            if (r5 == 0) goto L_0x022b
            android.widget.ImageView r5 = r4.d
            if (r5 == 0) goto L_0x022b
            h0.o.a.k r5 = r4.getActivity()
            com.instabug.survey.ui.SurveyActivity r5 = (com.instabug.survey.ui.SurveyActivity) r5
            P r5 = r5.presenter
            if (r5 == 0) goto L_0x0212
            i0.j.f.s.d r5 = (i0.j.f.s.d) r5
            com.instabug.survey.ui.f r5 = r5.c
            goto L_0x0214
        L_0x0212:
            com.instabug.survey.ui.f r5 = com.instabug.survey.ui.f.PRIMARY
        L_0x0214:
            com.instabug.survey.ui.f r6 = com.instabug.survey.ui.f.PRIMARY
            if (r5 != r6) goto L_0x022b
            android.widget.ImageView r5 = r4.d
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r5 = (android.widget.LinearLayout.LayoutParams) r5
            r6 = 16
            r0 = 0
            r5.setMargins(r0, r0, r0, r6)
            android.widget.ImageView r6 = r4.d
            r6.setLayoutParams(r5)
        L_0x022b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.survey.ui.i.m.a.initViews(android.view.View, android.os.Bundle):void");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.presenter = new c(this);
    }

    public void p() {
        if (getContext() != null && this.y != null) {
            i0.j.e.c1.b.j(getContext(), this.y);
        }
    }

    public void r() {
        if (getView() != null) {
            i0.j.e.c1.b.k(getView());
        }
    }
}
