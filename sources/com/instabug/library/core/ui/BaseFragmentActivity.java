package com.instabug.library.core.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import com.instabug.library.Instabug;
import com.instabug.library.R;
import com.instabug.library._InstabugActivity;
import com.instabug.library.core.ui.BaseContract;
import com.instabug.library.core.ui.BaseContract.Presenter;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.InstabugThemeResolver;
import com.instabug.library.util.LocaleUtils;
import com.instabug.library.util.StatusBarUtils;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import h0.b.a.e;
import h0.s.a.a;

@SuppressFBWarnings({"UUF_UNUSED_PUBLIC_OR_PROTECTED_FIELD"})
public abstract class BaseFragmentActivity<P extends BaseContract.Presenter> extends e implements _InstabugActivity, BaseContract.View<e> {
    private static final String IB_PID = "INSTABUG_PROCESS_ID";
    public P presenter;

    public void finishActivity() {
        finish();
    }

    public abstract int getLayout();

    public e getViewContext() {
        return this;
    }

    public abstract void initViews();

    public void onCreate(Bundle bundle) {
        InstabugSDKLogger.i(this, "onCreate called");
        StatusBarUtils.setStatusBar(this);
        LocaleUtils.setLocale(this, Instabug.getLocale(this));
        super.onCreate(bundle);
        setTheme(InstabugThemeResolver.resolveTheme(SettingsManager.getInstance().getTheme()));
        setContentView(getLayout());
        initViews();
        getWindow().getDecorView().setId(R.id.instabug_decor_view);
    }

    public void onDestroy() {
        InstabugSDKLogger.i(this, "onDestroy called");
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        InstabugSDKLogger.d(this, "onPause(),  SDK Invoking State Changed: false");
        Intent intent = new Intent();
        intent.setAction("SDK invoked");
        intent.putExtra("SDK invoking state", false);
        a.a(this).c(intent);
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (bundle != null && bundle.getInt(IB_PID, -1) != Process.myPid()) {
            finishActivity();
        }
    }

    public void onResume() {
        super.onResume();
        InstabugSDKLogger.d(this, "onResume(),  SDK Invoking State Changed: true");
        Intent intent = new Intent();
        intent.setAction("SDK invoked");
        intent.putExtra("SDK invoking state", true);
        a.a(this).c(intent);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(IB_PID, Process.myPid());
    }

    public void onStart() {
        InstabugSDKLogger.i(this, "onStart called");
        super.onStart();
    }

    public void onStop() {
        InstabugSDKLogger.i(this, "onStop called");
        super.onStop();
    }
}
