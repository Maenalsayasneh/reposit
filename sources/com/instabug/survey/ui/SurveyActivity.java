package com.instabug.survey.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.instabug.library.Instabug;
import com.instabug.library.InstabugColorTheme;
import com.instabug.library._InstabugActivity;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.core.ui.BaseFragmentActivity;
import com.instabug.library.ui.custom.InstabugViewPager;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.LocaleHelper;
import com.instabug.library.util.StatusBarUtils;
import com.instabug.library.util.TimeUtils;
import com.instabug.library.util.threading.PoolProvider;
import com.instabug.survey.R;
import com.instabug.survey.SurveyPlugin;
import com.instabug.survey.models.State;
import com.instabug.survey.models.Survey;
import com.instabug.survey.network.service.InstabugSurveysSubmitterService;
import h0.o.a.k;
import i0.j.f.p.h;
import i0.j.f.p.i;
import i0.j.f.s.e.a;
import java.util.Iterator;
import java.util.Objects;

public class SurveyActivity extends BaseFragmentActivity<i0.j.f.s.d> implements i0.j.f.s.b, _InstabugActivity, i0.j.f.s.a {
    public static final /* synthetic */ int c = 0;
    public Handler Y1;
    public Runnable Z1;
    public boolean d = false;
    public FrameLayout q;
    public Survey x;
    public GestureDetector y;

    public class a implements Runnable {
        public final /* synthetic */ Bundle c;

        public a(Bundle bundle) {
            this.c = bundle;
        }

        public void run() {
            if (InstabugCore.getStartedActivitiesCount() <= 1) {
                SurveyActivity.this.finish();
                return;
            }
            try {
                if (!SurveyActivity.this.isFinishing()) {
                    SurveyActivity surveyActivity = SurveyActivity.this;
                    if (surveyActivity.d && this.c == null) {
                        P p = surveyActivity.presenter;
                        if (p != null) {
                            Objects.requireNonNull((i0.j.f.s.d) p);
                            int i = i0.j.f.o.c.b;
                            if (Boolean.valueOf(i0.j.f.o.a.a().c).booleanValue() && SurveyActivity.this.x.getType() != 2) {
                                SurveyActivity surveyActivity2 = SurveyActivity.this;
                                SurveyActivity.q0(surveyActivity2, surveyActivity2.x);
                                return;
                            }
                        }
                        h.g(SurveyActivity.this.getSupportFragmentManager(), SurveyActivity.this.x, R.anim.instabug_anim_flyin_from_bottom, R.anim.instabug_anim_flyout_to_bottom);
                    }
                }
            } catch (Exception e) {
                StringBuilder P0 = i0.d.a.a.a.P0("Survey has not been shown due to this error: ");
                P0.append(e.getMessage());
                InstabugSDKLogger.e(SurveyActivity.class, P0.toString());
                SurveyActivity.this.finish();
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            Fragment J = SurveyActivity.this.getSupportFragmentManager().J("THANKS_FRAGMENT");
            if (J != null) {
                SurveyActivity surveyActivity = SurveyActivity.this;
                int i = SurveyActivity.c;
                surveyActivity.u0(J);
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public void run() {
            SurveyActivity.this.finish();
        }
    }

    public class d implements Runnable {
        public d() {
        }

        public void run() {
            SurveyActivity.this.finish();
            i.a();
        }
    }

    public class e implements Runnable {
        public final /* synthetic */ Fragment c;

        public e(Fragment fragment) {
            this.c = fragment;
        }

        public void run() {
            try {
                SurveyActivity surveyActivity = SurveyActivity.this;
                Fragment fragment = this.c;
                int i = SurveyActivity.c;
                surveyActivity.A0(fragment);
            } catch (Exception unused) {
                FragmentManager supportFragmentManager = SurveyActivity.this.getSupportFragmentManager();
                supportFragmentManager.A(new FragmentManager.n((String) null, -1, 0), false);
                SurveyActivity.this.finish();
                InstabugSDKLogger.e(SurveyActivity.this, "Fragment couldn't save it's state");
            }
        }
    }

    public class f implements ValueAnimator.AnimatorUpdateListener {
        public f() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            ViewGroup.LayoutParams layoutParams = SurveyActivity.this.q.getLayoutParams();
            layoutParams.height = intValue;
            SurveyActivity.this.q.setLayoutParams(layoutParams);
        }
    }

    public class g implements a.C0191a {
        public g() {
        }

        public void a() {
            for (Fragment next : SurveyActivity.this.getSupportFragmentManager().O()) {
                if (next instanceof com.instabug.survey.ui.i.a) {
                    com.instabug.survey.ui.i.a aVar = (com.instabug.survey.ui.i.a) next;
                    if (aVar.M0()) {
                        aVar.a();
                        return;
                    }
                    return;
                }
            }
        }

        public void b() {
        }

        public void c() {
        }

        public void d() {
            Survey survey;
            for (Fragment next : SurveyActivity.this.getSupportFragmentManager().O()) {
                if (next instanceof com.instabug.survey.ui.i.b) {
                    com.instabug.survey.ui.i.b bVar = (com.instabug.survey.ui.i.b) next;
                    if (bVar.getContext() != null && (survey = bVar.c) != null && bVar.d != null && bVar.q != null && bVar.y != null) {
                        if (!survey.isNPSSurvey()) {
                            bVar.q.postDelayed(new i0.j.f.s.g.c(bVar), 300);
                            return;
                        } else if (LocaleHelper.isRTL(bVar.getContext())) {
                            bVar.I();
                            return;
                        } else if (bVar.q.getCurrentItem() != 2) {
                            InstabugViewPager instabugViewPager = bVar.q;
                            instabugViewPager.setCurrentItem(instabugViewPager.getCurrentItem() - 1, true);
                            bVar.y.setVisibility(4);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        public void f() {
            Survey survey;
            for (Fragment next : SurveyActivity.this.getSupportFragmentManager().O()) {
                if (next instanceof com.instabug.survey.ui.i.b) {
                    SurveyActivity surveyActivity = SurveyActivity.this;
                    int i = SurveyActivity.c;
                    P p = surveyActivity.presenter;
                    if (p != null) {
                        ((i0.j.f.s.d) p).m(f.PRIMARY, true);
                    }
                    com.instabug.survey.ui.i.b bVar = (com.instabug.survey.ui.i.b) next;
                    if (bVar.getContext() != null && (survey = bVar.c) != null && bVar.q != null) {
                        if (!survey.isNPSSurvey()) {
                            bVar.q.postDelayed(new i0.j.f.s.g.d(bVar), 200);
                            return;
                        } else if (!LocaleHelper.isRTL(bVar.getContext())) {
                            bVar.I();
                            return;
                        } else if (bVar.Z1 == 1) {
                            bVar.q.setCurrentItem(0, true);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public static void q0(SurveyActivity surveyActivity, Survey survey) {
        Objects.requireNonNull(surveyActivity);
        int i = com.instabug.survey.ui.i.n.a.c;
        Bundle bundle = new Bundle();
        bundle.putSerializable("survey", survey);
        com.instabug.survey.ui.i.n.a aVar = new com.instabug.survey.ui.i.n.a();
        aVar.setArguments(bundle);
        int i2 = R.anim.instabug_anim_flyin_from_bottom;
        int i3 = R.anim.instabug_anim_flyout_to_bottom;
        h0.o.a.a aVar2 = new h0.o.a.a(surveyActivity.getSupportFragmentManager());
        aVar2.d = i2;
        aVar2.e = i3;
        aVar2.f = 0;
        aVar2.g = 0;
        aVar2.o(R.id.instabug_fragment_container, aVar, (String) null);
        aVar2.i();
    }

    public final void A0(Fragment fragment) {
        if (fragment != null) {
            h0.o.a.a aVar = new h0.o.a.a(getSupportFragmentManager());
            aVar.q(0, R.anim.instabug_anim_flyout_to_bottom);
            aVar.n(fragment);
            aVar.i();
            new Handler().postDelayed(new d(), 400);
        }
    }

    public void B(Survey survey) {
        i0.j.f.s.b bVar;
        P p = this.presenter;
        if (p != null) {
            i0.j.f.s.d dVar = (i0.j.f.s.d) p;
            survey.setSubmitted();
            PoolProvider.postIOTask(new i0.j.f.s.c(survey));
            if (i0.j.f.o.b.b() != null) {
                i0.j.f.o.b.b().a(TimeUtils.currentTimeMillis());
            }
            dVar.l(survey, State.SUBMITTED);
            if (dVar.view.get() != null && (bVar = (i0.j.f.s.b) dVar.view.get()) != null && bVar.getViewContext() != null) {
                InstabugSurveysSubmitterService.a((Context) bVar.getViewContext(), bVar.b());
                boolean z = false;
                if (survey.isNPSSurvey()) {
                    if (survey.isAppStoreRatingEnabled() && i0.j.f.o.c.e()) {
                        z = true;
                    }
                    bVar.l(z);
                } else if (survey.isStoreRatingSurvey()) {
                    if (!survey.isGooglePlayAppRating() && !TextUtils.isEmpty(survey.getQuestions().get(2).y)) {
                        z = true;
                    }
                    bVar.L(z);
                } else {
                    bVar.L(true);
                }
            }
        }
    }

    public void I0(boolean z) {
        getWindow().getDecorView().setBackgroundColor(h0.i.b.a.getColor(this, z ? R.color.instabug_transparent_color : R.color.instabug_dialog_bg_color));
    }

    public void L(boolean z) {
        if (getSupportFragmentManager() != null) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            int i = R.id.instabug_fragment_container;
            Fragment I = supportFragmentManager.I(i);
            if (I != null) {
                h0.o.a.a aVar = new h0.o.a.a(getSupportFragmentManager());
                aVar.q(0, R.anim.instabug_anim_flyout_to_bottom);
                aVar.n(I);
                aVar.i();
            }
            Handler handler = new Handler();
            this.Y1 = handler;
            if (z) {
                h0.o.a.a aVar2 = new h0.o.a.a(getSupportFragmentManager());
                aVar2.q(0, 0);
                Survey survey = this.x;
                int i2 = com.instabug.survey.ui.i.m.a.c;
                Bundle bundle = new Bundle();
                bundle.putSerializable("key_survey", survey);
                com.instabug.survey.ui.i.m.a aVar3 = new com.instabug.survey.ui.i.m.a();
                aVar3.setArguments(bundle);
                aVar2.o(i, aVar3, "THANKS_FRAGMENT");
                aVar2.i();
                b bVar = new b();
                this.Z1 = bVar;
                this.Y1.postDelayed(bVar, 600);
            } else {
                c cVar = new c();
                this.Z1 = cVar;
                handler.postDelayed(cVar, 300);
            }
            i.a();
        }
    }

    public Intent b() {
        return new Intent(this, InstabugSurveysSubmitterService.class);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.y == null) {
            this.y = new GestureDetector(this, new i0.j.f.s.e.a(new g()));
        }
        this.y.onTouchEvent(motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public void e(int i) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{this.q.getMeasuredHeight(), i});
        ofInt.addUpdateListener(new f());
        ofInt.setDuration(300);
        ofInt.start();
    }

    public int getLayout() {
        return R.layout.instabug_survey_activity;
    }

    public void initViews() {
    }

    public void k(int i) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.q.getLayoutParams();
        layoutParams.height = i;
        this.q.setLayoutParams(layoutParams);
    }

    public void l(boolean z) {
        Fragment fragment = getSupportFragmentManager().O().get(getSupportFragmentManager().O().size() - 1);
        if (z) {
            A0(fragment);
        } else {
            u0(fragment);
        }
    }

    public void onBackPressed() {
        i0.j.f.s.b bVar;
        k kVar;
        P p = this.presenter;
        if (p != null) {
            i0.j.f.s.d dVar = (i0.j.f.s.d) p;
            if (dVar.view.get() != null && (bVar = (i0.j.f.s.b) dVar.view.get()) != null && bVar.getViewContext() != null && (kVar = (k) bVar.getViewContext()) != null && kVar.getSupportFragmentManager().O().size() > 0) {
                for (Fragment next : kVar.getSupportFragmentManager().O()) {
                    if (next instanceof com.instabug.survey.ui.i.b) {
                        com.instabug.survey.ui.i.b bVar2 = (com.instabug.survey.ui.i.b) next;
                        if (bVar2.q != null && !(bVar2.e2.get(bVar2.Z1) instanceof com.instabug.survey.ui.i.j.a)) {
                            bVar2.q.scrollBackward(true);
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        if (Instabug.getTheme() == InstabugColorTheme.InstabugColorThemeLight) {
            i = R.style.InstabugSurveyLight;
        } else {
            i = R.style.InstabugSurveyDark;
        }
        setTheme(i);
        StatusBarUtils.setStatusBarForDialog(this);
        this.q = (FrameLayout) findViewById(R.id.instabug_fragment_container);
        ((RelativeLayout) findViewById(R.id.survey_activity_container)).setFocusableInTouchMode(true);
        this.presenter = new i0.j.f.s.d(this);
        Survey survey = (Survey) getIntent().getSerializableExtra("survey");
        this.x = survey;
        if (survey != null) {
            if (bundle != null) {
                f fVar = f.PARTIAL;
                ((i0.j.f.s.d) this.presenter).m(f.a(bundle.getInt("viewType", fVar.a()), fVar), false);
            } else if (survey.isStoreRatingSurvey()) {
                ((i0.j.f.s.d) this.presenter).m(f.PRIMARY, true);
            } else {
                ((i0.j.f.s.d) this.presenter).m(f.PARTIAL, false);
            }
            this.q.postDelayed(new a(bundle), 500);
            return;
        }
        InstabugSDKLogger.w("SurveyActivity", "survey activity will be finished the survey is null");
        finish();
    }

    public void onDestroy() {
        Handler handler = this.Y1;
        if (handler != null) {
            Runnable runnable = this.Z1;
            if (runnable != null) {
                handler.removeCallbacks(runnable);
            }
            this.Y1 = null;
            this.Z1 = null;
        }
        super.onDestroy();
        InstabugCore.setPluginState(SurveyPlugin.class, 0);
        if (i0.j.f.h.i() != null) {
            i0.j.f.h.i().f();
        }
        Objects.requireNonNull(i0.j.f.m.c.a());
    }

    public void onPause() {
        this.d = false;
        super.onPause();
        overridePendingTransition(0, 0);
    }

    public void onResume() {
        super.onResume();
        InstabugCore.setPluginState(SurveyPlugin.class, 1);
        this.d = true;
        Fragment I = getSupportFragmentManager().I(R.id.instabug_fragment_container);
        if (I instanceof com.instabug.survey.ui.i.b) {
            Iterator<Fragment> it = I.getChildFragmentManager().O().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Fragment next = it.next();
                if ((next instanceof com.instabug.survey.ui.i.j.a) && next.isVisible()) {
                    if (this.x == null) {
                        A0(I);
                    } else if (!i0.j.f.o.c.e() || !this.x.isAppStoreRatingEnabled()) {
                        u0(I);
                    }
                }
            }
        }
        if (!(getSupportFragmentManager() == null || getSupportFragmentManager().J("THANKS_FRAGMENT") == null)) {
            A0(getSupportFragmentManager().J("THANKS_FRAGMENT"));
        }
        Objects.requireNonNull(i0.j.f.m.c.a());
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        try {
            P p = this.presenter;
            if (p != null && ((i0.j.f.s.d) p).c != null) {
                bundle.putInt("viewType", ((i0.j.f.s.d) p).c.a());
            }
        } catch (IllegalStateException e2) {
            InstabugSDKLogger.e(this, "Something went wrong while saving survey state", e2);
        }
    }

    public void t0(f fVar, boolean z) {
        P p = this.presenter;
        if (p != null) {
            ((i0.j.f.s.d) p).m(fVar, z);
        }
    }

    public final void u0(Fragment fragment) {
        new Handler().postDelayed(new e(fragment), 3000);
    }

    public void y(Survey survey) {
        P p = this.presenter;
        if (p != null) {
            ((i0.j.f.s.d) p).k(survey);
        }
    }
}
