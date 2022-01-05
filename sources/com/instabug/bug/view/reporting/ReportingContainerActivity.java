package com.instabug.bug.view.reporting;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.instabug.bug.BugPlugin;
import com.instabug.bug.OnSdkDismissedCallback$DismissType;
import com.instabug.bug.R;
import com.instabug.bug.view.f.c;
import com.instabug.bug.view.g.c;
import com.instabug.bug.view.reporting.b;
import com.instabug.library.FragmentVisibilityChangedListener;
import com.instabug.library.Instabug;
import com.instabug.library.InstabugColorTheme;
import com.instabug.library.InstabugCustomTextPlaceHolder;
import com.instabug.library.InstabugState;
import com.instabug.library.InstabugStateProvider;
import com.instabug.library._InstabugActivity;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.core.ui.BaseToolbarActivity;
import com.instabug.library.internal.storage.cache.Cache;
import com.instabug.library.internal.storage.cache.CacheManager;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.invocation.invocationdialog.InstabugDialogActivity;
import com.instabug.library.model.Attachment;
import com.instabug.library.ui.custom.InstabugAlertDialog;
import com.instabug.library.util.AttrResolver;
import com.instabug.library.util.BitmapUtils;
import com.instabug.library.util.BitmapWorkerTask;
import com.instabug.library.util.DrawableUtils;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.KeyboardUtils;
import com.instabug.library.util.LocaleUtils;
import com.instabug.library.util.OrientationUtils;
import com.instabug.library.util.PlaceHolderUtils;
import com.instabug.library.util.StatusBarUtils;
import com.pubnub.api.builder.PubNubErrorBuilder;
import i0.j.b.i;
import i0.j.b.t.e;
import i0.j.b.t.f;
import java.util.ArrayList;

public class ReportingContainerActivity extends BaseToolbarActivity<i0.j.b.t.k.b> implements _InstabugActivity, f, View.OnClickListener, c.a, FragmentManager.l, c.b, b.n, e {
    public boolean c = true;

    public class a implements BitmapUtils.OnSaveBitmapCallback {
        public a() {
        }

        public void onError(Throwable th) {
        }

        public void onSuccess(Uri uri) {
            i0.j.b.f.g().d(ReportingContainerActivity.this);
        }
    }

    public class b implements BitmapWorkerTask.OnImageLoadedListener {
        public final /* synthetic */ float a;
        public final /* synthetic */ float b;
        public final /* synthetic */ ImageView c;

        public class a implements Animation.AnimationListener {
            public a() {
            }

            public void onAnimationEnd(Animation animation) {
                b.this.c.setVisibility(8);
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }
        }

        public b(float f, float f2, ImageView imageView) {
            this.a = f;
            this.b = f2;
            this.c = imageView;
        }

        public void onImageLoaded() {
            ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, this.a, 1, this.b);
            scaleAnimation.setDuration(500);
            scaleAnimation.setFillAfter(false);
            scaleAnimation.setAnimationListener(new a());
            this.c.startAnimation(scaleAnimation);
        }
    }

    public void E() {
        if (getSupportFragmentManager().L() < 1) {
            i0.j.b.f.g().d = OnSdkDismissedCallback$DismissType.CANCEL;
            InstabugSDKLogger.d(this, "Reporting bug canceled. Deleting attachments");
            Cache cache = CacheManager.getInstance().getCache(CacheManager.DEFAULT_IN_MEMORY_CACHE_KEY);
            if (cache != null) {
                cache.delete("video.path");
            }
            InstabugSDKLogger.d(i0.j.b.b.class, "SDK dismissed Handle sdk dismissing");
            if (!(i0.j.b.s.a.h().f() == null || i0.j.b.f.g().b == null || i0.j.b.f.g().d == null)) {
                i0.j.b.s.a.h().f().call(i.a(i0.j.b.f.g().d), i.b(i0.j.b.f.g().b.q));
            }
            i0.j.b.f.g().f();
            finish();
        }
        if ((InstabugStateProvider.getInstance().getState() == InstabugState.TAKING_SCREENSHOT_FOR_CHAT || InstabugStateProvider.getInstance().getState() == InstabugState.IMPORTING_IMAGE_FROM_GALLERY_FOR_CHAT) && (getSupportFragmentManager().I(R.id.instabug_fragment_container) instanceof com.instabug.bug.view.f.c)) {
            InstabugStateProvider.getInstance().setState(InstabugState.ENABLED);
        }
        q0(false, R.id.instabug_fragment_container);
    }

    public void M() {
        int i = R.id.instabug_fragment_container;
        q0(false, i);
        String str = i0.j.b.f.g().b != null ? i0.j.b.f.g().b.x : null;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        com.instabug.bug.view.reporting.g.a aVar = new com.instabug.bug.view.reporting.g.a();
        Bundle bundle = new Bundle();
        bundle.putString("bug_message", str);
        aVar.setArguments(bundle);
        String str2 = com.instabug.bug.view.reporting.g.a.s2;
        h0.o.a.a aVar2 = new h0.o.a.a(supportFragmentManager);
        aVar2.o(i, aVar, str2);
        aVar2.h();
    }

    public void N() {
        if (i0.j.b.f.g().b == null) {
            InstabugSDKLogger.v("ReportingContainerActivity", "startFeedbackSender failed the live bug has been released");
            return;
        }
        i0.j.b.f.g().b.q = "feedback";
        String str = i0.j.b.f.g().b.e2;
        if (!i0.j.b.f.g().b.f() && str != null) {
            i0.j.b.f.g().b.a(Uri.parse(str), Attachment.Type.MAIN_SCREENSHOT, false);
        }
        q0(false, R.id.instabug_fragment_container);
        i0.h.a.b.c.m.b.t(getSupportFragmentManager(), i0.j.b.f.g().b.x, false);
        P p = this.presenter;
        if (p != null) {
            ((i0.j.b.t.k.b) p).m();
        }
    }

    public void O(Bitmap bitmap, Uri uri) {
        InstabugSDKLogger.d("ReportingContainerActivity", "onImageEditingDone");
        if (bitmap != null) {
            BitmapUtils.saveBitmap(bitmap, uri, this, new a());
        }
        q0(false, R.id.instabug_fragment_container);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.A(new FragmentManager.n((String) null, -1, 0), false);
        if (getSupportFragmentManager().J(com.instabug.bug.view.reporting.i.a.s2) == null) {
            InstabugSDKLogger.d("ReportingContainerActivity", "Instabug Feedback fragment equal null");
            P p = this.presenter;
            if (p != null) {
                ((i0.j.b.t.k.b) p).p();
            }
        }
    }

    public void c0(com.instabug.bug.view.g.a aVar) {
        int i = com.instabug.library.R.id.instabug_fragment_container;
        q0(false, i);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        int i2 = com.instabug.bug.view.g.b.c;
        Bundle bundle = new Bundle();
        bundle.putSerializable("disclaimer", aVar);
        com.instabug.bug.view.g.b bVar = new com.instabug.bug.view.g.b();
        bVar.setArguments(bundle);
        h0.o.a.a aVar2 = new h0.o.a.a(supportFragmentManager);
        aVar2.o(i, bVar, "disclaimer_details");
        aVar2.g("disclaimer_details");
        aVar2.h();
    }

    public void f() {
        i0.h.a.b.c.m.b.t(getSupportFragmentManager(), i0.j.b.f.g().b != null ? i0.j.b.f.g().b.x : null, false);
    }

    public void finish() {
        super.finish();
        overridePendingTransition(17432576, 17432577);
    }

    public void g() {
        Toolbar toolbar = this.toolbar;
        if (toolbar != null) {
            toolbar.setNavigationIcon(R.drawable.ibg_core_ic_close);
        }
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public void g0(float f, float f2) {
        if (getIntent().getParcelableExtra(InstabugDialogActivity.KEY_SCREENSHOT_URI) != null && this.c) {
            this.c = false;
            ImageView imageView = new ImageView(this);
            imageView.setBackgroundColor(h0.i.b.a.getColor(this, 17170443));
            ((ViewGroup) getWindow().getDecorView().getRootView()).addView(imageView, new FrameLayout.LayoutParams(-1, -1));
            Uri uri = (Uri) getIntent().getParcelableExtra(InstabugDialogActivity.KEY_SCREENSHOT_URI);
            if (uri != null && uri.getPath() != null) {
                BitmapUtils.loadBitmap(uri.getPath(), imageView, new b(f, f2, imageView));
                getIntent().putExtra(InstabugDialogActivity.KEY_SCREENSHOT_URI, (Parcelable) null);
            }
        }
    }

    public int getContentLayout() {
        return R.layout.ibg_bug_activity_bug_reporting;
    }

    public void initContentViews() {
        if (this.toolbar != null) {
            if (i0.j.b.f.g().b == null) {
                this.toolbar.setNavigationIcon((Drawable) null);
            }
            if (Instabug.getTheme() == InstabugColorTheme.InstabugColorThemeLight) {
                this.toolbar.setBackgroundColor(Instabug.getPrimaryColor());
            } else {
                this.toolbar.setBackgroundColor(h0.i.b.a.getColor(this, R.color.instabug_attachment_bar_color_dark));
            }
        }
    }

    public void k() {
        InstabugSDKLogger.d("ReportingContainerActivity", "startWithHangingBug");
        if (i0.j.b.f.g().b != null) {
            StringBuilder P0 = i0.d.a.a.a.P0("bug attachment size): ");
            P0.append(i0.j.b.f.g().b.b().size());
            InstabugSDKLogger.d("ReportingContainerActivity", P0.toString());
        }
        i0.j.b.f.g().c = false;
        if (getSupportFragmentManager().J(com.instabug.bug.view.reporting.i.a.s2) == null) {
            q0(false, R.id.instabug_fragment_container);
            P p = this.presenter;
            if (p != null) {
                ((i0.j.b.t.k.b) p).p();
            }
        }
        i0.j.b.f.g().d(this);
        P p2 = this.presenter;
        if (p2 != null) {
            ((i0.j.b.t.k.b) p2).m();
        }
    }

    public void l(boolean z) {
        int i = R.id.instabug_pbi_footer;
        findViewById(i).setVisibility(z ? 0 : 8);
        findViewById(i).setBackgroundColor(AttrResolver.getColor(getViewContext(), R.attr.ibg_bug_color_bg_pbi));
        ImageView imageView = (ImageView) findViewById(com.instabug.library.R.id.image_instabug_logo);
        imageView.setColorFilter(AttrResolver.resolveAttributeColor(getViewContext(), R.attr.instabug_foreground_color), PorterDuff.Mode.SRC_ATOP);
        imageView.setImageResource(com.instabug.library.R.drawable.ibg_core_ic_instabug_logo);
    }

    public void o() {
        Cache cache = CacheManager.getInstance().getCache(CacheManager.DEFAULT_IN_MEMORY_CACHE_KEY);
        if (cache != null) {
            cache.delete("video.path");
        }
        finish();
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (Fragment onActivityResult : getSupportFragmentManager().O()) {
            onActivityResult.onActivityResult(i, i2, intent);
        }
    }

    public void onBackPressed() {
        if (getSupportFragmentManager().L() >= 1) {
            overridePendingTransition(17432576, 17432577);
            super.onBackPressed();
            return;
        }
        KeyboardUtils.hide(this);
        InstabugAlertDialog.showAlertDialog(this, PlaceHolderUtils.getPlaceHolder(this, InstabugCustomTextPlaceHolder.Key.REPORT_DISCARD_DIALOG_TITLE, R.string.instabug_str_bugreport_dismiss_warning_title), PlaceHolderUtils.getPlaceHolder(this, InstabugCustomTextPlaceHolder.Key.REPORT_DISCARD_DIALOG_BODY, R.string.instabug_str_bugreport_dismiss_warning_message), PlaceHolderUtils.getPlaceHolder(this, InstabugCustomTextPlaceHolder.Key.REPORT_DISCARD_DIALOG_POSITIVE_ACTION, R.string.instabug_str_bugreport_dismiss_discard), PlaceHolderUtils.getPlaceHolder(this, InstabugCustomTextPlaceHolder.Key.REPORT_DISCARD_DIALOG_NEGATIVE_ACTION, R.string.instabug_str_bugreport_dismiss_cancel), new i0.j.b.t.k.a(this), (DialogInterface.OnClickListener) null);
    }

    public void onBackStackChanged() {
        StringBuilder P0 = i0.d.a.a.a.P0("Back stack changed, back stack size: ");
        P0.append(getSupportFragmentManager().L());
        InstabugSDKLogger.d("ReportingContainerActivity", P0.toString());
        q0(true, R.id.instabug_fragment_container);
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList(getSupportFragmentManager().O());
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add((Object) null);
        arrayList.removeAll(arrayList2);
        InstabugSDKLogger.v("ReportingContainerActivity", "Dark space clicked, fragments size is " + arrayList.size() + " fragments are " + arrayList);
    }

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        overridePendingTransition(17432576, 17432577);
        if (i0.j.b.f.g().b == null) {
            InstabugSDKLogger.e("ReportingContainerActivity", "Bug is null, closing reporting activity and back to launch the app");
            finishActivity();
            return;
        }
        StatusBarUtils.darkenStatusBarColor(this, Instabug.getPrimaryColor());
        if (Instabug.getTheme() == InstabugColorTheme.InstabugColorThemeLight) {
            i = R.style.InstabugBugReportingLight;
        } else {
            i = R.style.InstabugBugReportingDark;
        }
        setTheme(i);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.l == null) {
            supportFragmentManager.l = new ArrayList<>();
        }
        supportFragmentManager.l.add(this);
        this.presenter = new i0.j.b.t.k.b(this);
        int intExtra = getIntent().getIntExtra("com.instabug.library.process", PubNubErrorBuilder.PNERR_MESSAGE_ACTION_TIMETOKEN_MISSING);
        if (bundle == null) {
            ((i0.j.b.t.k.b) this.presenter).e(intExtra);
        }
        getWindow().setSoftInputMode(3);
    }

    public void onDestroy() {
        P p = this.presenter;
        if (p != null) {
            ((i0.j.b.t.k.b) p).onDestroy();
        }
        if (!i0.j.b.f.g().c && i0.j.b.f.g().d == OnSdkDismissedCallback$DismissType.ADD_ATTACHMENT) {
            i0.j.b.f.g().d = OnSdkDismissedCallback$DismissType.CANCEL;
        }
        OrientationUtils.unlockOrientation(this);
        super.onDestroy();
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.presenter = new i0.j.b.t.k.b(this);
        Uri data = intent.getData();
        boolean z = true;
        if (data != null && "instabug-bug".equals(data.getScheme()) && "instabug-disclaimer.com".equals(data.getHost()) && "/disclaimer".equals(data.getPath())) {
            q0(false, com.instabug.library.R.id.instabug_fragment_container);
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            int i = R.id.instabug_fragment_container;
            com.instabug.bug.view.g.c cVar = new com.instabug.bug.view.g.c();
            h0.o.a.a aVar = new h0.o.a.a(supportFragmentManager);
            aVar.o(i, cVar, "disclaimer");
            aVar.g("disclaimer");
            aVar.h();
            return;
        }
        Uri data2 = intent.getData();
        if (data2 == null || !"repro-steps-disclaimer".equals(data2.getScheme()) || !"instabug-disclaimer.com".equals(data2.getHost())) {
            z = false;
        }
        if (z) {
            t();
        } else {
            ((i0.j.b.t.k.b) this.presenter).e(intent.getIntExtra("com.instabug.library.process", PubNubErrorBuilder.PNERR_MESSAGE_ACTION_TIMETOKEN_MISSING));
        }
    }

    public void onStart() {
        super.onStart();
        BugPlugin bugPlugin = (BugPlugin) InstabugCore.getXPlugin(BugPlugin.class);
        if (bugPlugin != null) {
            bugPlugin.setState(1);
        }
        InstabugSDKLogger.d("ReportingContainerActivity", "onStart(),  SDK Invoking State Changed: true");
    }

    public void onStop() {
        BugPlugin bugPlugin = (BugPlugin) InstabugCore.getXPlugin(BugPlugin.class);
        if (!(bugPlugin == null || bugPlugin.getState() == 2)) {
            bugPlugin.setState(0);
        }
        InstabugSDKLogger.d("ReportingContainerActivity", "onPause(),  SDK Invoking State Changed: false");
        super.onStop();
    }

    public final void q0(boolean z, int i) {
        if (getSupportFragmentManager().I(i) instanceof FragmentVisibilityChangedListener) {
            ((FragmentVisibilityChangedListener) getSupportFragmentManager().I(i)).onVisibilityChanged(z);
        }
    }

    public void t() {
        int i = com.instabug.library.R.id.instabug_fragment_container;
        q0(false, i);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        String placeHolder = PlaceHolderUtils.getPlaceHolder(this, InstabugCustomTextPlaceHolder.Key.REPRO_STEPS_LIST_HEADER, R.string.IBGReproStepsListTitle);
        int i2 = com.instabug.bug.view.i.c.f.c;
        Bundle bundle = new Bundle();
        bundle.putString(InstabugDbContract.FeatureRequestEntry.COLUMN_TITLE, placeHolder);
        com.instabug.bug.view.i.c.f fVar = new com.instabug.bug.view.i.c.f();
        fVar.setArguments(bundle);
        h0.o.a.a aVar = new h0.o.a.a(supportFragmentManager);
        aVar.o(i, fVar, "visual_user_steps");
        aVar.g("visual_user_steps");
        aVar.h();
    }

    public void u() {
        if (i0.j.b.f.g().b == null) {
            InstabugSDKLogger.w("ReportingContainerActivity", "startBugReporter failed the live bug has been released");
            return;
        }
        i0.j.b.f.g().b.q = "bug";
        String str = i0.j.b.f.g().b.e2;
        if (!i0.j.b.f.g().b.f() && str != null) {
            i0.j.b.f.g().b.a(Uri.parse(str), Attachment.Type.MAIN_SCREENSHOT, false);
        }
        q0(false, R.id.instabug_fragment_container);
        i0.h.a.b.c.m.b.q(getSupportFragmentManager(), i0.j.b.f.g().b.x, false);
        P p = this.presenter;
        if (p != null) {
            ((i0.j.b.t.k.b) p).m();
        }
    }

    public void v() {
        i0.h.a.b.c.m.b.q(getSupportFragmentManager(), i0.j.b.f.g().b != null ? i0.j.b.f.g().b.x : null, false);
    }

    public void z() {
        if (this.toolbar == null) {
            return;
        }
        if (LocaleUtils.isRTL(Instabug.getLocale(this))) {
            Drawable drawable = h0.i.b.a.getDrawable(this, R.drawable.ibg_core_ic_back);
            if (drawable != null) {
                this.toolbar.setNavigationIcon(DrawableUtils.getRotateDrawable(drawable, 180.0f));
                return;
            }
            return;
        }
        this.toolbar.setNavigationIcon(R.drawable.ibg_core_ic_back);
    }

    public String l() {
        return String.valueOf(getTitle());
    }

    public void f(String str) {
        setTitle(str);
    }

    public void v(String str, String str2) {
        int i = com.instabug.library.R.id.instabug_fragment_container;
        q0(false, i);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        int i2 = com.instabug.bug.view.i.b.c.c;
        Bundle bundle = new Bundle();
        bundle.putString(InstabugDbContract.FeatureRequestEntry.COLUMN_TITLE, str);
        bundle.putString(NotificationCompat.MessagingStyle.Message.KEY_DATA_URI, str2);
        com.instabug.bug.view.i.b.c cVar = new com.instabug.bug.view.i.b.c();
        cVar.setArguments(bundle);
        h0.o.a.a aVar = new h0.o.a.a(supportFragmentManager);
        aVar.o(i, cVar, "visual_user_step_preview");
        aVar.g("visual_user_step_preview");
        aVar.h();
    }
}
