package com.instabug.library.invocation.invocationdialog;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.FrameLayout;
import com.instabug.library.OnSdkDismissCallback;
import com.instabug.library.R;
import com.instabug.library.core.plugin.PluginPromptOption;
import com.instabug.library.core.ui.BaseFragmentActivity;
import com.instabug.library.invocation.InvocationManager;
import com.instabug.library.invocation.invocationdialog.g;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.util.ScreenUtility;
import com.instabug.library.util.StatusBarUtils;
import h0.i.i.q;
import i0.j.e.m0.d.k;
import i0.j.e.m0.e.a;
import i0.j.e.m0.e.b;
import i0.j.e.m0.e.c;
import i0.j.e.m0.e.d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class InstabugDialogActivity extends BaseFragmentActivity<d> implements g.b, b, View.OnClickListener, a {
    public static final String KEY_DIALOG_ITEMS = "dialog_items";
    public static final String KEY_DIALOG_TITLE = "dialog_title";
    public static final String KEY_SCREENSHOT_URI = "screenshot_uri";
    private static final String KEY_SHOULD_BE_KILLED = "should_be_killed";
    private ArrayList<InstabugDialogItem> dialogItems;
    private boolean isInflated = false;
    private Uri screenshotUri;
    private View[] sharedViews;
    private boolean shouldBeKilled = false;

    private d createPresenter() {
        return new d(this);
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public static Intent getIntent(Context context, String str, Uri uri, ArrayList<InstabugDialogItem> arrayList, boolean z) {
        Intent intent = new Intent(context, InstabugDialogActivity.class);
        intent.putExtra(KEY_DIALOG_TITLE, str);
        intent.putExtra(KEY_SCREENSHOT_URI, uri);
        intent.putExtra(KEY_DIALOG_ITEMS, arrayList);
        intent.putExtra(KEY_SHOULD_BE_KILLED, z);
        intent.addFlags(268435456);
        return intent;
    }

    @SuppressLint({"NULL_DEREFERENCE"})
    private void runOnSdkInvokedRunnable() {
        if (SettingsManager.getInstance().getOnSdkInvokedCallback() != null) {
            SettingsManager.getInstance().getOnSdkInvokedCallback().onSdkInvoked();
        }
    }

    public void finish() {
        OnSdkDismissCallback onSdkDismissCallback;
        P p = this.presenter;
        if (!(p == null || ((d) p).m() || (onSdkDismissCallback = SettingsManager.getInstance().getOnSdkDismissCallback()) == null)) {
            onSdkDismissCallback.call(OnSdkDismissCallback.DismissType.CANCEL, OnSdkDismissCallback.ReportType.OTHER);
        }
        super.finish();
        overridePendingTransition(R.anim.ib_core_anim_fade_in, R.anim.ib_core_anim_fade_out);
    }

    @SuppressLint({"ERADICATE_INCONSISTENT_SUBCLASS_RETURN_ANNOTATION"})
    public List<InstabugDialogItem> getDialogItems() {
        if (getIntent() != null) {
            return (ArrayList) getIntent().getSerializableExtra(KEY_DIALOG_ITEMS);
        }
        return null;
    }

    public int getEnterAnimation() {
        P p = this.presenter;
        if (p != null) {
            return ((d) p).x;
        }
        return 0;
    }

    public int getExitAnimation() {
        P p = this.presenter;
        if (p != null) {
            return ((d) p).y;
        }
        return 0;
    }

    public int getFadeInAnimation() {
        return R.anim.ib_core_anim_fade_in;
    }

    public int getLayout() {
        return R.layout.ib_lyt_activity_dialog;
    }

    public int getSlidInLeftAnimation() {
        return R.anim.ib_core_anim_slide_in_left;
    }

    public int getSlidInRightAnimation() {
        return R.anim.ib_core_anim_slide_in_right;
    }

    public int getSlidOutLeftAnimation() {
        return R.anim.ib_core_anim_slide_out_left;
    }

    public int getSlidOutRightAnimation() {
        return R.anim.ib_core_anim_slide_out_right;
    }

    public void initViews() {
        if (this.presenter == null) {
            this.presenter = createPresenter();
        }
        if (getIntent().getSerializableExtra(KEY_DIALOG_ITEMS) == null) {
            finish();
            return;
        }
        findViewById(R.id.ib_fragment_container).setOnClickListener(this);
        findViewById(R.id.ib_dialog_container).setOnClickListener(this);
        if (getIntent().getBooleanExtra(KEY_SHOULD_BE_KILLED, false)) {
            this.shouldBeKilled = true;
        }
        if (this.dialogItems == null) {
            this.dialogItems = (ArrayList) getIntent().getSerializableExtra(KEY_DIALOG_ITEMS);
        }
    }

    public void onBackPressed() {
        overridePendingTransition(R.anim.ib_core_anim_fade_in, R.anim.ib_core_anim_fade_out);
        P p = this.presenter;
        if (p != null) {
            d dVar = (d) p;
            InstabugDialogItem instabugDialogItem = dVar.d;
            if (instabugDialogItem != null) {
                dVar.d = instabugDialogItem.getParent();
            }
            dVar.x = dVar.c.getSlidInLeftAnimation();
            dVar.y = dVar.c.getSlidOutRightAnimation();
        }
        super.onBackPressed();
    }

    public void onClick(View view) {
        if (view.getId() == R.id.ib_fragment_container || view.getId() == R.id.ib_dialog_container) {
            P p = this.presenter;
            if (p != null && !((d) p).m()) {
                ((d) this.presenter).d = null;
            }
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        FrameLayout frameLayout;
        overridePendingTransition(R.anim.ib_core_anim_fade_in, R.anim.ib_core_anim_fade_out);
        super.onCreate(bundle);
        StatusBarUtils.setStatusBarColorForPrompt(this);
        if (ScreenUtility.hasNavBar(this) && !ScreenUtility.isLandscape(this) && (frameLayout = (FrameLayout) findViewById(R.id.ib_fragment_container)) != null) {
            frameLayout.setPadding(frameLayout.getPaddingLeft(), frameLayout.getPaddingTop(), frameLayout.getPaddingRight(), ScreenUtility.getNavigationBarHeight(getResources()) + frameLayout.getPaddingBottom());
        }
        this.screenshotUri = (Uri) getIntent().getParcelableExtra(KEY_SCREENSHOT_URI);
        runOnSdkInvokedRunnable();
    }

    public void onDestroy() {
        P p;
        if (isFinishing() && (p = this.presenter) != null && !((d) p).m()) {
            ((d) this.presenter).k(this.screenshotUri);
        }
        super.onDestroy();
    }

    public void onDialogItemClicked(InstabugDialogItem instabugDialogItem, View... viewArr) {
        this.sharedViews = viewArr;
        P p = this.presenter;
        if (p != null) {
            d dVar = (d) p;
            Uri uri = this.screenshotUri;
            dVar.d = instabugDialogItem;
            Handler handler = dVar.q;
            if (handler != null) {
                handler.removeCallbacksAndMessages((Object) null);
            }
            if (instabugDialogItem != null) {
                ArrayList<InstabugDialogItem> subItems = instabugDialogItem.getSubItems();
                if (subItems == null || subItems.isEmpty()) {
                    ArrayList<PluginPromptOption> availablePromptOptions = InvocationManager.getInstance().getAvailablePromptOptions();
                    InstabugDialogItem instabugDialogItem2 = instabugDialogItem;
                    while (instabugDialogItem2.getParent() != null) {
                        instabugDialogItem2 = instabugDialogItem2.getParent();
                    }
                    if (instabugDialogItem2.getOrder() == -1) {
                        Iterator<PluginPromptOption> it = availablePromptOptions.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            PluginPromptOption next = it.next();
                            if (next.getOrder() == -1) {
                                next.invoke();
                                break;
                            }
                        }
                    } else {
                        PluginPromptOption m = i0.j.c.l.a.m(instabugDialogItem.getIdentifier(), true);
                        if (m != null) {
                            ArrayList arrayList = new ArrayList();
                            while (instabugDialogItem.getParent() != null) {
                                arrayList.add(instabugDialogItem.getTitle());
                                instabugDialogItem = instabugDialogItem.getParent();
                            }
                            Collections.reverse(arrayList);
                            m.invoke(uri, (String[]) arrayList.toArray(new String[0]));
                        }
                    }
                } else {
                    dVar.x = dVar.c.getSlidInRightAnimation();
                    dVar.y = dVar.c.getSlidOutLeftAnimation();
                    while (instabugDialogItem.getParent() != null) {
                        instabugDialogItem = instabugDialogItem.getParent();
                    }
                    String title = instabugDialogItem.getTitle();
                    if (title == null) {
                        title = "";
                    }
                    dVar.c.setContent(title, subItems);
                }
            }
        }
        if (this.shouldBeKilled) {
            finish();
        }
    }

    public void onInitialScreenShotNotRequired() {
        P p = this.presenter;
        if (p != null) {
            ((d) p).k(this.screenshotUri);
        }
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        String stringExtra = getIntent().getStringExtra(KEY_DIALOG_TITLE);
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra(KEY_DIALOG_ITEMS);
        if (arrayList == null) {
            finish();
            return;
        }
        setContent(stringExtra, arrayList);
        if (intent.getBooleanExtra(KEY_SHOULD_BE_KILLED, false)) {
            this.shouldBeKilled = true;
        }
    }

    public void onPause() {
        super.onPause();
        SettingsManager.getInstance().setPromptOptionsScreenShown(false);
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.dialogItems = (ArrayList) bundle.getSerializable(KEY_DIALOG_ITEMS);
    }

    public void onResume() {
        super.onResume();
        if (!this.isInflated) {
            h0.o.a.a aVar = new h0.o.a.a(getSupportFragmentManager());
            int i = R.id.ib_fragment_container;
            String stringExtra = getIntent().getStringExtra(KEY_DIALOG_TITLE);
            ArrayList<InstabugDialogItem> arrayList = this.dialogItems;
            g gVar = new g();
            Bundle bundle = new Bundle();
            bundle.putString(KEY_DIALOG_TITLE, stringExtra);
            bundle.putSerializable(KEY_DIALOG_ITEMS, arrayList);
            gVar.setArguments(bundle);
            aVar.o(i, gVar, (String) null);
            aVar.h();
            this.isInflated = true;
        }
        SettingsManager.getInstance().setPromptOptionsScreenShown(true);
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putSerializable(KEY_DIALOG_ITEMS, this.dialogItems);
        super.onSaveInstanceState(bundle);
    }

    public void onStart() {
        super.onStart();
        P p = this.presenter;
        if (p != null) {
            d dVar = (d) p;
            if (InvocationManager.getInstance().getLastUsedInvoker() instanceof k) {
                Handler handler = new Handler();
                dVar.q = handler;
                if (dVar.c != null) {
                    handler.postDelayed(new c(dVar), 10000);
                }
            }
        }
    }

    public void onStop() {
        super.onStop();
        P p = this.presenter;
        if (p != null) {
            Handler handler = ((d) p).q;
            if (handler != null) {
                handler.removeCallbacksAndMessages((Object) null);
            }
            SettingsManager.getInstance().setShouldAutoShowOnboarding(false);
        }
    }

    public void removeScreenshotIfNeeded(InstabugDialogItem instabugDialogItem) {
        WeakReference<V> weakReference;
        b bVar;
        P p = this.presenter;
        if (p != null && (weakReference = ((d) p).view) != null && (bVar = (b) weakReference.get()) != null && instabugDialogItem != null && !instabugDialogItem.isInitialScreenshotRequired()) {
            bVar.onInitialScreenShotNotRequired();
        }
    }

    public void setContent(String str, ArrayList<InstabugDialogItem> arrayList) {
        h0.o.a.a aVar = new h0.o.a.a(getSupportFragmentManager());
        try {
            View[] viewArr = this.sharedViews;
            if (viewArr != null) {
                for (View view : viewArr) {
                    AtomicInteger atomicInteger = q.a;
                    String transitionName = view.getTransitionName();
                    if (transitionName != null) {
                        aVar.f(view, transitionName);
                    }
                }
            }
        } catch (IllegalArgumentException unused) {
        }
        this.dialogItems = arrayList;
        aVar.q(0, R.anim.ib_core_anim_invocation_dialog_exit);
        aVar.g((String) null);
        int i = R.id.ib_fragment_container;
        g gVar = new g();
        Bundle bundle = new Bundle();
        bundle.putString(KEY_DIALOG_TITLE, str);
        bundle.putSerializable(KEY_DIALOG_ITEMS, arrayList);
        gVar.setArguments(bundle);
        aVar.o(i, gVar, (String) null);
        aVar.h();
    }
}
