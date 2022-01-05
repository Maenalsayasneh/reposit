package com.instabug.survey.announcements.ui.activity;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.os.Handler;
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
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.StatusBarUtils;
import com.instabug.survey.R;
import com.instabug.survey.SurveyPlugin;
import com.instabug.survey.ui.SurveyActivity;
import i0.j.f.h;
import i0.j.f.p.i;

public class AnnouncementActivity extends BaseFragmentActivity<i0.j.f.b.c.a.c> implements i0.j.f.b.c.a.b, _InstabugActivity, i0.j.f.b.c.a.a {
    public Runnable Y1;
    public boolean c = false;
    public FrameLayout d;
    public com.instabug.survey.e.c.a q;
    public Handler x;
    public Runnable y;

    public class a implements Runnable {
        public final /* synthetic */ Bundle c;

        public a(Bundle bundle) {
            this.c = bundle;
        }

        public void run() {
            if (InstabugCore.getStartedActivitiesCount() <= 1) {
                AnnouncementActivity.this.finish();
                return;
            }
            try {
                if (!AnnouncementActivity.this.isFinishing()) {
                    AnnouncementActivity announcementActivity = AnnouncementActivity.this;
                    if (announcementActivity.c) {
                        announcementActivity.q = (com.instabug.survey.e.c.a) announcementActivity.getIntent().getSerializableExtra(InstabugDbContract.AnnouncementEntry.COLUMN_ANNOUNCEMENT);
                        if (this.c == null) {
                            i0.j.e.c1.b.m(AnnouncementActivity.this.getSupportFragmentManager(), AnnouncementActivity.this.q);
                        }
                    }
                }
            } catch (Exception e) {
                StringBuilder P0 = i0.d.a.a.a.P0("Announcement has not been shown due to this error: ");
                P0.append(e.getMessage());
                InstabugSDKLogger.e(SurveyActivity.class, P0.toString());
            }
        }
    }

    public class b implements Runnable {

        public class a implements Runnable {
            public a() {
            }

            public void run() {
                i.a();
                AnnouncementActivity.this.finish();
            }
        }

        public b() {
        }

        public void run() {
            if (AnnouncementActivity.this.getSupportFragmentManager() != null) {
                FragmentManager supportFragmentManager = AnnouncementActivity.this.getSupportFragmentManager();
                int i = R.id.instabug_fragment_container;
                if (supportFragmentManager.I(i) != null) {
                    h0.o.a.a aVar = new h0.o.a.a(AnnouncementActivity.this.getSupportFragmentManager());
                    aVar.q(0, R.anim.instabug_anim_flyout_to_bottom);
                    aVar.n(AnnouncementActivity.this.getSupportFragmentManager().I(i));
                    aVar.h();
                }
                AnnouncementActivity.this.x = new Handler();
                AnnouncementActivity announcementActivity = AnnouncementActivity.this;
                a aVar2 = new a();
                announcementActivity.y = aVar2;
                announcementActivity.x.postDelayed(aVar2, 300);
            }
        }
    }

    public class c implements ValueAnimator.AnimatorUpdateListener {
        public c() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            ViewGroup.LayoutParams layoutParams = AnnouncementActivity.this.d.getLayoutParams();
            layoutParams.height = intValue;
            AnnouncementActivity.this.d.setLayoutParams(layoutParams);
        }
    }

    public void e(int i) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{this.d.getMeasuredHeight(), i});
        ofInt.addUpdateListener(new c());
        ofInt.setDuration(300);
        ofInt.start();
    }

    public int getLayout() {
        return R.layout.instabug_survey_activity;
    }

    public void initViews() {
    }

    public void j(boolean z) {
        runOnUiThread(new b());
    }

    public void k(int i) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.d.getLayoutParams();
        layoutParams.height = i;
        this.d.setLayoutParams(layoutParams);
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
        this.d = (FrameLayout) findViewById(R.id.instabug_fragment_container);
        ((RelativeLayout) findViewById(R.id.survey_activity_container)).setFocusableInTouchMode(true);
        P cVar = new i0.j.f.b.c.a.c(this);
        this.presenter = cVar;
        cVar.l(false);
        a aVar = new a(bundle);
        this.Y1 = aVar;
        this.d.postDelayed(aVar, 500);
    }

    public void onDestroy() {
        Runnable runnable;
        Handler handler;
        super.onDestroy();
        SurveyPlugin surveyPlugin = (SurveyPlugin) InstabugCore.getXPlugin(SurveyPlugin.class);
        if (surveyPlugin != null) {
            surveyPlugin.setState(0);
        }
        Runnable runnable2 = this.y;
        if (!(runnable2 == null || (handler = this.x) == null)) {
            handler.removeCallbacks(runnable2);
            this.x = null;
            this.y = null;
        }
        FrameLayout frameLayout = this.d;
        if (!(frameLayout == null || (runnable = this.Y1) == null)) {
            frameLayout.removeCallbacks(runnable);
            this.Y1 = null;
            this.d.clearAnimation();
        }
        Fragment I = getSupportFragmentManager().I(R.id.instabug_fragment_container);
        if (I instanceof com.instabug.survey.e.e.a.b.c) {
            ((com.instabug.survey.e.e.a.b.c) I).onDestroy();
        }
        h.i().f();
        P p = this.presenter;
        if (p != null) {
            ((i0.j.f.b.c.a.c) p).onDestroy();
        }
    }

    public void onPause() {
        this.c = false;
        super.onPause();
        overridePendingTransition(0, 0);
    }

    public void onResume() {
        super.onResume();
        this.c = true;
        SurveyPlugin surveyPlugin = (SurveyPlugin) InstabugCore.getXPlugin(SurveyPlugin.class);
        if (surveyPlugin != null) {
            surveyPlugin.setState(1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0038, code lost:
        if (r3.get(r3.size() - 1).c == com.instabug.survey.f.c.a.C0111a.DISMISS) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void q0(com.instabug.survey.e.c.a r8) {
        /*
            r7 = this;
            P r0 = r7.presenter
            if (r0 == 0) goto L_0x0055
            i0.j.f.b.c.a.c r0 = (i0.j.f.b.c.a.c) r0
            if (r8 == 0) goto L_0x0055
            com.instabug.survey.f.c.f r1 = com.instabug.survey.f.c.f.READY_TO_SEND
            com.instabug.survey.f.c.i r2 = r8.a2
            r2.g2 = r1
            long r3 = com.instabug.library.util.TimeUtils.currentTimeSeconds()
            r2.Y1 = r3
            com.instabug.survey.f.c.i r1 = r8.a2
            r2 = 1
            r1.y = r2
            r1.a2 = r2
            r1.d2 = r2
            com.instabug.survey.f.c.g r1 = r1.q
            java.util.ArrayList<com.instabug.survey.f.c.a> r3 = r1.x
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x003b
            java.util.ArrayList<com.instabug.survey.f.c.a> r3 = r1.x
            int r4 = r3.size()
            int r4 = r4 - r2
            java.lang.Object r2 = r3.get(r4)
            com.instabug.survey.f.c.a r2 = (com.instabug.survey.f.c.a) r2
            com.instabug.survey.f.c.a$a r2 = r2.c
            com.instabug.survey.f.c.a$a r3 = com.instabug.survey.f.c.a.C0111a.DISMISS
            if (r2 != r3) goto L_0x003b
            goto L_0x004d
        L_0x003b:
            com.instabug.survey.f.c.a r2 = new com.instabug.survey.f.c.a
            com.instabug.survey.f.c.a$a r3 = com.instabug.survey.f.c.a.C0111a.DISMISS
            com.instabug.survey.f.c.i r4 = r8.a2
            long r5 = r4.Y1
            int r4 = r4.c2
            r2.<init>(r3, r5, r4)
            java.util.ArrayList<com.instabug.survey.f.c.a> r1 = r1.x
            r1.add(r2)
        L_0x004d:
            java.lang.String r1 = "DISMISSED"
            r0.k(r8, r1)
            r0.m(r8)
        L_0x0055:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.survey.announcements.ui.activity.AnnouncementActivity.q0(com.instabug.survey.e.c.a):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0040, code lost:
        if (r1.c == r3) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void t0(com.instabug.survey.e.c.a r8) {
        /*
            r7 = this;
            P r0 = r7.presenter
            if (r0 == 0) goto L_0x0050
            i0.j.f.b.c.a.c r0 = (i0.j.f.b.c.a.c) r0
            if (r8 == 0) goto L_0x0050
            com.instabug.survey.f.c.i r1 = r8.a2
            r2 = 0
            r1.a2 = r2
            r2 = 1
            r1.y = r2
            r1.d2 = r2
            com.instabug.survey.f.c.a r1 = new com.instabug.survey.f.c.a
            com.instabug.survey.f.c.a$a r3 = com.instabug.survey.f.c.a.C0111a.SUBMIT
            long r4 = com.instabug.library.util.TimeUtils.currentTimeSeconds()
            r1.<init>(r3, r4, r2)
            com.instabug.survey.f.c.f r4 = com.instabug.survey.f.c.f.READY_TO_SEND
            com.instabug.survey.f.c.i r5 = r8.a2
            r5.g2 = r4
            com.instabug.survey.f.c.g r4 = r5.q
            java.util.ArrayList<com.instabug.survey.f.c.a> r5 = r4.x
            int r5 = r5.size()
            if (r5 <= 0) goto L_0x0043
            java.util.ArrayList<com.instabug.survey.f.c.a> r5 = r4.x
            int r6 = r5.size()
            int r6 = r6 - r2
            java.lang.Object r2 = r5.get(r6)
            com.instabug.survey.f.c.a r2 = (com.instabug.survey.f.c.a) r2
            com.instabug.survey.f.c.a$a r2 = r2.c
            if (r2 != r3) goto L_0x0043
            com.instabug.survey.f.c.a$a r2 = r1.c
            if (r2 != r3) goto L_0x0043
            goto L_0x0048
        L_0x0043:
            java.util.ArrayList<com.instabug.survey.f.c.a> r2 = r4.x
            r2.add(r1)
        L_0x0048:
            java.lang.String r1 = "SUBMITTED"
            r0.k(r8, r1)
            r0.m(r8)
        L_0x0050:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.survey.announcements.ui.activity.AnnouncementActivity.t0(com.instabug.survey.e.c.a):void");
    }
}
