package com.instabug.library.ui.onboarding;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.instabug.library.Feature;
import com.instabug.library.Instabug;
import com.instabug.library.InstabugColorTheme;
import com.instabug.library.InstabugCustomTextPlaceHolder;
import com.instabug.library.R;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.core.ui.BaseFragmentActivity;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.ui.custom.InstabugViewPager;
import com.instabug.library.ui.custom.pagerindicator.DotIndicator;
import com.instabug.library.ui.onboarding.WelcomeMessage;
import com.instabug.library.util.AttrResolver;
import com.instabug.library.util.DrawableUtils;
import com.instabug.library.util.LocaleUtils;
import com.instabug.library.util.PlaceHolderUtils;
import com.instabug.library.util.StatusBarUtils;
import h0.b.a.e;
import i0.j.e.b1.a.a;
import i0.j.e.b1.a.b;
import i0.j.e.b1.a.c;
import i0.j.e.b1.a.d;
import java.util.ArrayList;
import java.util.List;

public class OnboardingActivity extends BaseFragmentActivity<d> implements b, ViewPager.j, View.OnClickListener {
    public static final /* synthetic */ int c = 0;
    public WelcomeMessage.State Y1;
    public InstabugViewPager d;
    public a q;
    public DotIndicator x;
    public Button y;

    public void a() {
        findViewById(R.id.instabug_pbi_container).setVisibility(0);
        ImageView imageView = (ImageView) findViewById(R.id.image_instabug_logo);
        imageView.setImageResource(R.drawable.ibg_core_ic_instabug_logo);
        imageView.setColorFilter(Color.parseColor("#FFFFFF"), PorterDuff.Mode.SRC_ATOP);
        ((TextView) findViewById(R.id.text_view_pb)).setTextColor(h0.i.b.a.getColor(this, 17170443));
    }

    public void b() {
        findViewById(R.id.instabug_pbi_container).setVisibility(8);
    }

    public void c() {
        findViewById(R.id.ib_core_onboarding_container).setOnClickListener(this);
    }

    public void dismiss() {
        finish();
    }

    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.ib_core_anim_fade_in, R.anim.ib_core_anim_fade_out);
        SettingsManager.getInstance().setOnboardingShowing(false);
    }

    public int getLayout() {
        return R.layout.ib_core_lyt_onboarding_activity;
    }

    public void initViews() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        InstabugViewPager instabugViewPager = (InstabugViewPager) findViewById(R.id.ib_core_onboarding_viewpager);
        this.d = instabugViewPager;
        if (instabugViewPager != null) {
            DrawableUtils.setColor(instabugViewPager, AttrResolver.getColor(this, R.attr.instabug_background_color));
            this.d.addOnPageChangeListener(this);
            this.d.setOffscreenPageLimit(2);
            this.d.setAutoHeight(true);
        }
        Button button = (Button) findViewById(R.id.ib_core_onboarding_done);
        this.y = button;
        if (button != null) {
            button.setOnClickListener(this);
            this.y.setTextColor(Instabug.getPrimaryColor());
        }
        DotIndicator dotIndicator = (DotIndicator) findViewById(R.id.ib_core_onboarding_viewpager_indicator);
        this.x = dotIndicator;
        if (dotIndicator != null) {
            dotIndicator.setSelectedDotColor(Instabug.getPrimaryColor());
            this.x.setUnselectedDotColor(h0.i.c.a.c(Instabug.getPrimaryColor(), 80));
        }
        if (!(this.d == null || this.y == null)) {
            if (LocaleUtils.isRTL(Instabug.getLocale(this))) {
                this.d.setRotation(180.0f);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.y.getLayoutParams();
                layoutParams.addRule(5, this.d.getId());
                this.y.setLayoutParams(layoutParams);
            } else {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.y.getLayoutParams();
                layoutParams2.addRule(7, this.d.getId());
                this.y.setLayoutParams(layoutParams2);
            }
        }
        P p = this.presenter;
        if (p != null) {
            d dVar = (d) p;
            WelcomeMessage.State state = this.Y1;
            if (dVar.c != null) {
                if (InstabugCore.getFeatureState(Feature.WHITE_LABELING) == Feature.State.ENABLED) {
                    dVar.c.b();
                } else {
                    dVar.c.a();
                }
            }
            if (state == null) {
                state = WelcomeMessage.State.BETA;
            }
            String str8 = null;
            if (d.a.a[state.ordinal()] != 2) {
                ArrayList arrayList = new ArrayList();
                b bVar = dVar.c;
                if (bVar != null) {
                    str4 = PlaceHolderUtils.getPlaceHolder(InstabugCustomTextPlaceHolder.Key.BETA_WELCOME_MESSAGE_WELCOME_STEP_TITLE, ((e) bVar.getViewContext()).getString(R.string.ib_str_beta_welcome_step_title));
                    str3 = PlaceHolderUtils.getPlaceHolder(InstabugCustomTextPlaceHolder.Key.BETA_WELCOME_MESSAGE_WELCOME_STEP_CONTENT, ((e) dVar.c.getViewContext()).getString(R.string.ib_str_beta_welcome_step_content));
                } else {
                    str4 = null;
                    str3 = null;
                }
                InstabugColorTheme theme = Instabug.getTheme();
                InstabugColorTheme instabugColorTheme = InstabugColorTheme.InstabugColorThemeLight;
                arrayList.add(d.I0(theme == instabugColorTheme ? R.drawable.ibg_core_ic_onboarding_welcome : R.drawable.ibg_core_ic_onboarding_welcome_dark, str4, str3));
                int k = dVar.k(dVar.l(dVar.m()));
                b bVar2 = dVar.c;
                if (bVar2 != null) {
                    str5 = PlaceHolderUtils.getPlaceHolder(InstabugCustomTextPlaceHolder.Key.BETA_WELCOME_MESSAGE_HOW_TO_REPORT_STEP_TITLE, ((e) bVar2.getViewContext()).getString(R.string.ib_str_beta_welcome_how_to_report_step_title));
                    int i = d.a.b[dVar.l(dVar.m()).ordinal()];
                    str6 = i != 1 ? i != 2 ? i != 3 ? i != 4 ? null : PlaceHolderUtils.getPlaceHolder(InstabugCustomTextPlaceHolder.Key.BETA_WELCOME_MESSAGE_HOW_TO_REPORT_STEP_CONTENT, ((e) dVar.c.getViewContext()).getString(R.string.ib_str_beta_welcome_how_to_report_step_content_shake)) : PlaceHolderUtils.getPlaceHolder(InstabugCustomTextPlaceHolder.Key.BETA_WELCOME_MESSAGE_HOW_TO_REPORT_STEP_CONTENT, ((e) dVar.c.getViewContext()).getString(R.string.ib_str_beta_welcome_how_to_report_step_content_swipe)) : PlaceHolderUtils.getPlaceHolder(InstabugCustomTextPlaceHolder.Key.BETA_WELCOME_MESSAGE_HOW_TO_REPORT_STEP_CONTENT, ((e) dVar.c.getViewContext()).getString(R.string.ib_str_beta_welcome_how_to_report_step_content_screenshot)) : PlaceHolderUtils.getPlaceHolder(InstabugCustomTextPlaceHolder.Key.BETA_WELCOME_MESSAGE_HOW_TO_REPORT_STEP_CONTENT, ((e) dVar.c.getViewContext()).getString(R.string.ib_str_beta_welcome_how_to_report_step_content_floating));
                } else {
                    str6 = null;
                    str5 = null;
                }
                arrayList.add(d.I0(k, str5, str6));
                b bVar3 = dVar.c;
                if (bVar3 != null) {
                    str8 = PlaceHolderUtils.getPlaceHolder(InstabugCustomTextPlaceHolder.Key.BETA_WELCOME_MESSAGE_FINISH_STEP_TITLE, ((e) bVar3.getViewContext()).getString(R.string.ib_str_beta_welcome_finishing_step_title));
                    str7 = PlaceHolderUtils.getPlaceHolder(InstabugCustomTextPlaceHolder.Key.BETA_WELCOME_MESSAGE_FINISH_STEP_CONTENT, ((e) dVar.c.getViewContext()).getString(R.string.ib_str_beta_welcome_finishing_step_content));
                } else {
                    str7 = null;
                }
                arrayList.add(d.I0(Instabug.getTheme() == instabugColorTheme ? R.drawable.ibg_core_ic_onboarding_stay_updated : R.drawable.ibg_core_ic_onboarding_stay_updated_dark, str8, str7));
                b bVar4 = dVar.c;
                if (bVar4 != null) {
                    bVar4.c(arrayList);
                    return;
                }
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            int k2 = dVar.k(dVar.l(dVar.m()));
            b bVar5 = dVar.c;
            if (bVar5 != null) {
                String placeHolder = PlaceHolderUtils.getPlaceHolder(InstabugCustomTextPlaceHolder.Key.LIVE_WELCOME_MESSAGE_TITLE, ((e) bVar5.getViewContext()).getString(R.string.ib_str_live_welcome_message_title));
                int i2 = d.a.b[dVar.l(dVar.m()).ordinal()];
                if (i2 == 1) {
                    str2 = PlaceHolderUtils.getPlaceHolder(InstabugCustomTextPlaceHolder.Key.LIVE_WELCOME_MESSAGE_CONTENT, ((e) dVar.c.getViewContext()).getString(R.string.ib_str_beta_welcome_how_to_report_step_content_floating));
                } else if (i2 == 2) {
                    str2 = PlaceHolderUtils.getPlaceHolder(InstabugCustomTextPlaceHolder.Key.LIVE_WELCOME_MESSAGE_CONTENT, ((e) dVar.c.getViewContext()).getString(R.string.ib_str_beta_welcome_how_to_report_step_content_screenshot));
                } else if (i2 != 3) {
                    if (i2 == 4) {
                        str2 = PlaceHolderUtils.getPlaceHolder(InstabugCustomTextPlaceHolder.Key.LIVE_WELCOME_MESSAGE_CONTENT, ((e) dVar.c.getViewContext()).getString(R.string.ib_str_beta_welcome_how_to_report_step_content_shake));
                    }
                    str = str8;
                    str8 = placeHolder;
                } else {
                    str2 = PlaceHolderUtils.getPlaceHolder(InstabugCustomTextPlaceHolder.Key.LIVE_WELCOME_MESSAGE_CONTENT, ((e) dVar.c.getViewContext()).getString(R.string.ib_str_beta_welcome_how_to_report_step_content_swipe));
                }
                str8 = str2;
                str = str8;
                str8 = placeHolder;
            } else {
                str = null;
            }
            d I0 = d.I0(k2, str8, str);
            if (I0.getArguments() != null) {
                I0.getArguments().putBoolean("setLivePadding", true);
            }
            arrayList2.add(I0);
            b bVar6 = dVar.c;
            if (bVar6 != null) {
                bVar6.c(arrayList2);
                new Handler().postDelayed(new c(dVar), 5000);
            }
            b bVar7 = dVar.c;
            if (bVar7 != null) {
                bVar7.c();
            }
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.ib_core_anim_fade_in, R.anim.ib_core_anim_fade_out);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.ib_core_onboarding_done) {
            finish();
        } else if (view.getId() == R.id.ib_core_onboarding_container) {
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        SettingsManager.getInstance().setOnboardingShowing(true);
        SettingsManager.getInstance().setShouldAutoShowOnboarding(false);
        this.presenter = new d(this);
        this.Y1 = (WelcomeMessage.State) getIntent().getSerializableExtra("welcome_state");
        overridePendingTransition(R.anim.ib_core_anim_fade_in, R.anim.ib_core_anim_fade_out);
        super.onCreate(bundle);
        StatusBarUtils.setStatusBarColorForPrompt(this);
    }

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    public void onPageSelected(int i) {
        DotIndicator dotIndicator = this.x;
        if (dotIndicator != null) {
            dotIndicator.setSelectedItem(i, true);
        }
        if (this.y != null) {
            a aVar = this.q;
            if (aVar == null || i != aVar.getCount() - 1 || this.q.getCount() <= 1) {
                this.y.setVisibility(4);
                this.y.requestFocus(0);
                return;
            }
            this.y.setVisibility(0);
            this.y.requestFocus();
        }
    }

    public void c(List<d> list) {
        a aVar = new a(getSupportFragmentManager(), list);
        this.q = aVar;
        InstabugViewPager instabugViewPager = this.d;
        if (instabugViewPager != null) {
            instabugViewPager.setAdapter(aVar);
        }
        DotIndicator dotIndicator = this.x;
        if (dotIndicator != null) {
            dotIndicator.setNumberOfItems(this.q.getCount());
        }
        Button button = this.y;
        if (button != null) {
            button.setVisibility(8);
        }
        if (this.x != null) {
            a aVar2 = this.q;
            if (aVar2 == null || aVar2.getCount() <= 1) {
                this.x.setVisibility(8);
            } else {
                this.x.setVisibility(0);
            }
        }
    }
}
