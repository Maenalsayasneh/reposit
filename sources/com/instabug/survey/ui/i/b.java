package com.instabug.survey.ui.i;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.instabug.library.Feature;
import com.instabug.library.Instabug;
import com.instabug.library.InstabugColorTheme;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.core.ui.InstabugBaseFragment;
import com.instabug.library.ui.custom.InstabugViewPager;
import com.instabug.library.ui.custom.MaterialMenuDrawable;
import com.instabug.library.util.DisplayUtils;
import com.instabug.library.util.DrawableUtils;
import com.instabug.library.util.LocaleHelper;
import com.instabug.survey.R;
import com.instabug.survey.models.Survey;
import com.instabug.survey.ui.SurveyActivity;
import i0.j.f.s.g.e;
import i0.j.f.s.g.f;
import i0.j.f.s.g.g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: SurveyFragment */
public class b extends InstabugBaseFragment<g> implements f, View.OnClickListener, e {
    public ProgressBar Y1;
    public int Z1 = -1;
    public String a2 = "CURRENT_QUESTION_POSITION";
    public i0.j.f.s.a b2;
    public Survey c;
    public boolean c2 = false;
    public Button d;
    public long d2;
    public List<a> e2 = new ArrayList();
    public InstabugViewPager q;
    public i0.j.f.s.g.h.a x;
    public ImageView y;

    /* compiled from: SurveyFragment */
    public class a implements View.OnKeyListener {
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            return i == 4;
        }
    }

    /* renamed from: com.instabug.survey.ui.i.b$b  reason: collision with other inner class name */
    /* compiled from: SurveyFragment */
    public class C0115b implements ViewPager.j {
        public final /* synthetic */ Survey c;

        public C0115b(Survey survey) {
            this.c = survey;
        }

        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }

        public void onPageSelected(int i) {
            ImageView imageView;
            b bVar = b.this;
            bVar.Z1 = i;
            Survey survey = this.c;
            if (!(bVar.d == null || bVar.y == null)) {
                bVar.J0(i, survey.getQuestions());
                if (!survey.isNPSSurvey()) {
                    if (bVar.M0()) {
                        bVar.L0(4);
                        bVar.d.setText(R.string.instabug_str_survey_next);
                    } else if (bVar.N0()) {
                        bVar.y.setVisibility(0);
                        bVar.d.setText(R.string.instabug_str_action_submit);
                    } else {
                        bVar.y.setVisibility(0);
                        bVar.d.setText(R.string.instabug_str_survey_next);
                    }
                    if (survey.getQuestions().get(i).y == null || survey.getQuestions().get(i).y.isEmpty()) {
                        bVar.K0(false);
                    } else {
                        bVar.K0(true);
                    }
                } else if (survey.isNPSSurvey()) {
                    if (bVar.N0()) {
                        if (!(bVar.c == null || (imageView = bVar.y) == null || bVar.d == null || bVar.b2 == null)) {
                            imageView.setVisibility(4);
                            if (!bVar.c.isAppStoreRatingEnabled() || !i0.j.f.o.c.e()) {
                                bVar.d.setVisibility(4);
                                bVar.b2.B(bVar.c);
                            } else if (bVar.c.getRatingCTATitle() != null) {
                                bVar.d.setText(bVar.c.getRatingCTATitle());
                            } else {
                                bVar.d.setText(R.string.surveys_nps_btn_rate_us);
                            }
                        }
                        bVar.L0(4);
                    } else if (bVar.M0()) {
                        bVar.y.setVisibility(4);
                        bVar.d.setText(R.string.instabug_str_next);
                    } else {
                        bVar.L0(0);
                        bVar.d.setVisibility(0);
                        bVar.d.setText(R.string.instabug_str_action_submit);
                        bVar.K0(true);
                    }
                }
            }
            b.this.g0(i);
        }
    }

    /* compiled from: SurveyFragment */
    public class c implements Runnable {
        public final /* synthetic */ int c;

        public c(int i) {
            this.c = i;
        }

        public void run() {
            int i;
            b bVar = b.this;
            i0.j.f.s.g.h.a aVar = bVar.x;
            if (aVar != null && bVar.c != null && aVar.getCount() > (i = this.c)) {
                a c2 = b.this.x.c(i);
                if (c2 instanceof com.instabug.survey.ui.i.l.a) {
                    ((com.instabug.survey.ui.i.l.a) c2).o();
                    return;
                }
                if (b.this.c.isStoreRatingSurvey() && b.this.c.getQuestions().size() > this.c && b.this.c.getQuestions().get(this.c).q == 0) {
                    b bVar2 = b.this;
                    if (bVar2.c2) {
                        ((com.instabug.survey.ui.i.l.a) bVar2.x.c(this.c)).o();
                        b.this.c2 = false;
                        return;
                    }
                }
                if (b.this.getActivity() != null) {
                    i0.j.e.c1.b.g(b.this.getActivity());
                }
            }
        }
    }

    public final void I() {
        Survey survey = this.c;
        if (survey != null && this.d != null && this.y != null && this.q != null) {
            if (this.Z1 == 0 && survey.getQuestions().get(0).y != null) {
                InstabugViewPager instabugViewPager = this.q;
                instabugViewPager.setCurrentItem(instabugViewPager.getCurrentItem() + 1, true);
                this.d.setText(R.string.instabug_str_action_submit);
            } else if (this.q.getCurrentItem() < 1 && this.c.getQuestions().get(0).y != null) {
                this.q.setCurrentItem(1, true);
                this.y.setVisibility(0);
            }
        }
    }

    public final int I0(long j) {
        Survey survey = this.c;
        if (!(survey == null || survey.getQuestions() == null || this.c.getQuestions().size() <= 0)) {
            for (int i = 0; i < this.c.getQuestions().size(); i++) {
                if (this.c.getQuestions().get(i).c == j) {
                    return i;
                }
            }
        }
        return 0;
    }

    public void J0(int i, List<com.instabug.survey.models.b> list) {
        ProgressBar progressBar = this.Y1;
        if (progressBar != null) {
            progressBar.setMax(list.size() * 100);
            ProgressBar progressBar2 = this.Y1;
            ObjectAnimator ofInt = ObjectAnimator.ofInt(progressBar2, NotificationCompat.CATEGORY_PROGRESS, new int[]{progressBar2.getProgress(), (i + 1) * 100});
            ofInt.setDuration(200);
            ofInt.setInterpolator(new DecelerateInterpolator());
            ofInt.start();
        }
    }

    public void K0(boolean z) {
        Survey survey;
        Survey survey2;
        Button button = this.d;
        if (button != null) {
            button.setEnabled(z);
            if (getActivity() != null) {
                if (z) {
                    if (!i0.j.f.o.c.f() || (survey2 = this.c) == null || survey2.getType() != 2) {
                        DrawableUtils.setColor(this.d, Instabug.getPrimaryColor());
                        this.d.setTextColor(h0.i.b.a.getColor(getActivity(), 17170443));
                    } else if (Instabug.getTheme() == InstabugColorTheme.InstabugColorThemeLight) {
                        DrawableUtils.setColor(this.d, -16777216);
                        this.d.setTextColor(h0.i.b.a.getColor(getActivity(), 17170443));
                    } else {
                        DrawableUtils.setColor(this.d, -1);
                        this.d.setTextColor(h0.i.b.a.getColor(getActivity(), 17170444));
                    }
                } else if (Instabug.getTheme() == InstabugColorTheme.InstabugColorThemeLight) {
                    DrawableUtils.setColor(this.d, h0.i.b.a.getColor(getActivity(), R.color.survey_btn_disabled_color_light));
                } else if (!i0.j.f.o.c.f() || (survey = this.c) == null || survey.getType() != 2) {
                    this.d.setTextColor(h0.i.b.a.getColor(getActivity(), R.color.survey_btn_txt_color_dark));
                    DrawableUtils.setColor(this.d, h0.i.b.a.getColor(getActivity(), R.color.survey_btn_disabled_color_dark));
                } else {
                    this.d.setTextColor(-1);
                    DrawableUtils.setColor(this.d, Color.parseColor("#d9d9d9"));
                }
            }
        }
    }

    public final void L0(int i) {
        ImageView imageView;
        if (this.d != null && (imageView = this.y) != null) {
            if (i != 0 || imageView.getVisibility() == 0) {
                ImageView imageView2 = this.y;
                AnimationSet animationSet = new AnimationSet(true);
                TranslateAnimation translateAnimation = new TranslateAnimation(imageView2.getTranslationX(), -30.0f, 0.0f, 0.0f);
                translateAnimation.setDuration(300);
                translateAnimation.setFillAfter(false);
                animationSet.addAnimation(translateAnimation);
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(200);
                alphaAnimation.setFillAfter(true);
                animationSet.addAnimation(alphaAnimation);
                imageView2.startAnimation(animationSet);
                imageView2.setVisibility(4);
                return;
            }
            ImageView imageView3 = this.y;
            AnimationSet animationSet2 = new AnimationSet(true);
            TranslateAnimation translateAnimation2 = new TranslateAnimation(-30.0f, imageView3.getTranslationX(), 0.0f, 0.0f);
            translateAnimation2.setDuration(300);
            translateAnimation2.setFillAfter(true);
            animationSet2.addAnimation(translateAnimation2);
            AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation2.setDuration(200);
            alphaAnimation2.setFillAfter(true);
            animationSet2.addAnimation(alphaAnimation2);
            imageView3.startAnimation(animationSet2);
            imageView3.setVisibility(0);
        }
    }

    public final boolean M0() {
        InstabugViewPager instabugViewPager = this.q;
        if (instabugViewPager != null && instabugViewPager.getCurrentItem() == 0) {
            return true;
        }
        return false;
    }

    public final boolean N0() {
        InstabugViewPager instabugViewPager = this.q;
        if (instabugViewPager == null || this.x == null || instabugViewPager.getCurrentItem() != this.x.getCount() - 1) {
            return false;
        }
        return true;
    }

    public void a0(Survey survey) {
        if (this.d != null && this.q != null && this.Y1 != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.instabug.survey.models.b> it = survey.getQuestions().iterator();
            while (it.hasNext()) {
                com.instabug.survey.models.b next = it.next();
                int i = next.q;
                if (i == 1) {
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("question", next);
                    com.instabug.survey.ui.i.h.a aVar = new com.instabug.survey.ui.i.h.a();
                    aVar.setArguments(bundle);
                    aVar.d = this;
                    arrayList.add(aVar);
                } else if (i == 0) {
                    if (i0.j.f.o.c.f()) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putSerializable("question", next);
                        com.instabug.survey.ui.i.l.b.a aVar2 = new com.instabug.survey.ui.i.l.b.a();
                        aVar2.setArguments(bundle2);
                        aVar2.d = this;
                        arrayList.add(aVar2);
                    } else {
                        Bundle bundle3 = new Bundle();
                        bundle3.putSerializable("question", next);
                        com.instabug.survey.ui.i.l.a aVar3 = new com.instabug.survey.ui.i.l.a();
                        aVar3.setArguments(bundle3);
                        aVar3.d = this;
                        arrayList.add(aVar3);
                    }
                } else if (i == 2) {
                    Bundle bundle4 = new Bundle();
                    bundle4.putSerializable("question", next);
                    com.instabug.survey.ui.i.k.a aVar4 = new com.instabug.survey.ui.i.k.a();
                    aVar4.setArguments(bundle4);
                    aVar4.d = this;
                    arrayList.add(aVar4);
                } else if (i == 3) {
                    ProgressBar progressBar = this.Y1;
                    if (progressBar != null) {
                        progressBar.setVisibility(8);
                    }
                    com.instabug.survey.ui.i.i.a aVar5 = new com.instabug.survey.ui.i.i.a();
                    Bundle bundle5 = new Bundle();
                    bundle5.putSerializable("question", next);
                    aVar5.setArguments(bundle5);
                    aVar5.d = this;
                    arrayList.add(aVar5);
                }
            }
            if (survey.isNPSSurvey()) {
                com.instabug.survey.ui.i.j.a aVar6 = new com.instabug.survey.ui.i.j.a();
                Bundle bundle6 = new Bundle();
                bundle6.putSerializable("question", survey.getQuestions().get(0));
                aVar6.setArguments(bundle6);
                aVar6.d = this;
                arrayList.add(aVar6);
            }
            this.e2 = arrayList;
            this.x = new i0.j.f.s.g.h.a(getChildFragmentManager(), this.e2);
            this.q.setOffscreenPageLimit(0);
            this.q.setAdapter(this.x);
            if (survey.getQuestions().size() <= 1 || survey.getType() == 2) {
                this.Y1.setVisibility(8);
            } else {
                this.d.setText(R.string.instabug_str_survey_next);
                J0(0, survey.getQuestions());
                this.q.addOnPageChangeListener(new C0115b(survey));
            }
            this.Z1 = 0;
            if (survey.getType() == 2 || (survey.getQuestions().get(0).y != null && !survey.getQuestions().get(0).y.isEmpty())) {
                K0(true);
            } else {
                K0(false);
            }
        }
    }

    public final void g0(int i) {
        InstabugViewPager instabugViewPager = this.q;
        if (instabugViewPager != null) {
            instabugViewPager.postDelayed(new c(i), 100);
        }
    }

    public int getLayout() {
        return R.layout.instabug_dialog_survey;
    }

    public void initViews(View view, Bundle bundle) {
        Survey survey;
        view.setOnKeyListener(new a());
        this.d = (Button) view.findViewById(R.id.instabug_btn_submit);
        this.q = (InstabugViewPager) findViewById(R.id.instabug_survey_pager);
        this.y = (ImageView) findViewById(R.id.instabug_ic_survey_close);
        this.d.setOnClickListener(this);
        this.Y1 = (ProgressBar) findViewById(R.id.survey_step_progressbar);
        if (this.q != null && (survey = this.c) != null && survey.getQuestions() != null) {
            this.q.setSwipeable(false);
            this.q.setOffscreenPageLimit(this.c.getQuestions().size());
            if (getActivity() != null && this.y != null) {
                MaterialMenuDrawable materialMenuDrawable = new MaterialMenuDrawable(getActivity(), h0.i.b.a.getColor(getActivity(), 17170443), MaterialMenuDrawable.Stroke.THIN);
                this.y.setImageDrawable(materialMenuDrawable.getCurrent());
                this.y.setOnClickListener(this);
                this.y.setVisibility(4);
                if (LocaleHelper.isRTL((Context) getActivity())) {
                    materialMenuDrawable.setRTLEnabled(true);
                    this.q.setRotation(180.0f);
                }
                materialMenuDrawable.setIconState(MaterialMenuDrawable.IconState.ARROW);
                ProgressBar progressBar = this.Y1;
                if (progressBar != null) {
                    LayerDrawable layerDrawable = (LayerDrawable) progressBar.getProgressDrawable();
                    if (Instabug.getTheme() == InstabugColorTheme.InstabugColorThemeLight) {
                        layerDrawable.setDrawableByLayerId(16908288, getResources().getDrawable(R.drawable.ibg_survey_progressbar_background_light));
                    } else {
                        layerDrawable.setDrawableByLayerId(16908288, getResources().getDrawable(R.drawable.ibg_survey_progressbar_background_dark));
                    }
                    layerDrawable.getDrawable(1).setColorFilter(Instabug.getPrimaryColor(), PorterDuff.Mode.SRC_IN);
                    this.Y1.setProgressDrawable(layerDrawable);
                }
            }
        }
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (getActivity() instanceof SurveyActivity) {
            try {
                this.b2 = (i0.j.f.s.a) getActivity();
            } catch (Exception unused) {
                throw new RuntimeException("Must implement SurveyActivityCallback ");
            }
        }
    }

    public void onClick(View view) {
        InstabugViewPager instabugViewPager;
        boolean z;
        int id = view.getId();
        if (id == R.id.instabug_btn_submit) {
            if (this.c != null && (instabugViewPager = this.q) != null && this.Y1 != null && this.x != null) {
                int currentItem = instabugViewPager.getCurrentItem();
                FragmentManager childFragmentManager = getChildFragmentManager();
                StringBuilder P0 = i0.d.a.a.a.P0("android:switcher:");
                P0.append(R.id.instabug_survey_pager);
                P0.append(":");
                P0.append(currentItem);
                Fragment J = childFragmentManager.J(P0.toString());
                String str = null;
                if (!this.c.isNPSSurvey()) {
                    if (J != null) {
                        str = ((a) J).J0();
                    }
                    if (str == null) {
                        Survey survey = this.c;
                        if (survey == null || this.b2 == null || !survey.isNPSSurvey()) {
                            z = true;
                        } else {
                            ProgressBar progressBar = this.Y1;
                            if (!(progressBar == null || this.y == null)) {
                                progressBar.setVisibility(4);
                                this.y.setVisibility(4);
                            }
                            this.b2.B(this.c);
                            z = false;
                        }
                        if (z && !this.c.isStoreRatingSurvey()) {
                            return;
                        }
                    } else {
                        g0(currentItem + 1);
                        this.q.postDelayed(new i0.j.f.s.g.a(this), 300);
                    }
                    Survey survey2 = this.c;
                    if (survey2 != null && survey2.getQuestions() != null) {
                        if (!this.c.isStoreRatingSurvey() && this.c.getQuestions().size() > currentItem) {
                            this.c.getQuestions().get(currentItem).b(str);
                        }
                    } else {
                        return;
                    }
                } else if (!(this.c == null || this.b2 == null)) {
                    if (!N0()) {
                        g0(currentItem);
                        InstabugViewPager instabugViewPager2 = this.q;
                        if (instabugViewPager2 != null) {
                            instabugViewPager2.postDelayed(new i0.j.f.s.g.b(this), 300);
                        }
                    } else if (this.c.isAppStoreRatingEnabled()) {
                        this.c.addRateEvent();
                        if (Instabug.getApplicationContext() != null) {
                            i0.j.f.p.f.a(Instabug.getApplicationContext());
                            this.b2.B(this.c);
                        }
                    } else {
                        this.b2.B(this.c);
                    }
                }
                if (str != null && currentItem >= this.x.getCount() - 1 && getActivity() != null && this.c != null && this.b2 != null) {
                    i0.j.e.c1.b.g(getActivity());
                    ProgressBar progressBar2 = this.Y1;
                    if (!(progressBar2 == null || this.y == null)) {
                        progressBar2.setVisibility(4);
                        this.y.setVisibility(4);
                    }
                    this.b2.B(this.c);
                }
            }
        } else if (id == R.id.instabug_ic_survey_close && SystemClock.elapsedRealtime() - this.d2 >= 1000) {
            this.d2 = SystemClock.elapsedRealtime();
            if (this.c != null && this.q != null && this.b2 != null) {
                if (M0()) {
                    this.b2.y(this.c);
                } else if (!this.c.isNPSSurvey() || !this.c.hasPositiveNpsAnswer()) {
                    this.q.scrollBackward(true);
                } else if (this.q.getAdapter() != null) {
                    InstabugViewPager instabugViewPager3 = this.q;
                    instabugViewPager3.setCurrentItem(instabugViewPager3.getAdapter().getCount() > 2 ? this.q.getCurrentItem() - 2 : this.q.getCurrentItem() - 1);
                }
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        if (getArguments() != null) {
            this.c = (Survey) getArguments().getSerializable("survey");
            this.c2 = getArguments().getBoolean("should_show_keyboard");
        }
        Survey survey = this.c;
        if (survey != null) {
            this.presenter = new g(this, survey);
        }
    }

    public void onDetach() {
        this.b2 = null;
        super.onDetach();
    }

    public void onResume() {
        super.onResume();
        InstabugViewPager instabugViewPager = this.q;
        if (instabugViewPager != null) {
            g0(instabugViewPager.getCurrentItem());
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt(this.a2, this.Z1);
        super.onSaveInstanceState(bundle);
    }

    public void onViewCreated(View view, Bundle bundle) {
        InstabugViewPager instabugViewPager;
        f fVar;
        f fVar2;
        super.onViewCreated(view, bundle);
        view.setFocusableInTouchMode(true);
        P p = this.presenter;
        if (p != null) {
            WeakReference<V> weakReference = ((g) p).view;
            if (!(weakReference == null || (fVar2 = (f) weakReference.get()) == null)) {
                if (InstabugCore.getFeatureState(Feature.WHITE_LABELING) == Feature.State.ENABLED) {
                    fVar2.r();
                } else {
                    fVar2.p();
                }
            }
            g gVar = (g) this.presenter;
            WeakReference<V> weakReference2 = gVar.view;
            if (!(weakReference2 == null || weakReference2.get() == null || (fVar = (f) gVar.view.get()) == null)) {
                fVar.a0(gVar.c);
            }
        }
        if (this.c != null && this.presenter != null && (instabugViewPager = this.q) != null) {
            if (bundle == null) {
                int currentItem = instabugViewPager.getCurrentItem();
                this.Z1 = currentItem;
                K0(((g) this.presenter).k(this.c, currentItem));
            } else if (bundle.getInt(this.a2) != -1) {
                int i = bundle.getInt(this.a2);
                this.Z1 = i;
                K0(((g) this.presenter).k(this.c, i));
            }
        }
    }

    public void p() {
        if (this.d != null) {
            if (!(getContext() == null || getView() == null)) {
                i0.j.e.c1.b.j(getContext(), getView());
                ((LinearLayout.LayoutParams) this.d.getLayoutParams()).bottomMargin = DisplayUtils.dpToPx(getResources(), 8);
            }
            this.d.requestLayout();
        }
    }

    public void r() {
        if (getView() != null) {
            i0.j.e.c1.b.k(getView());
        }
    }
}
