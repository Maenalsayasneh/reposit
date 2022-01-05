package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import h0.f.h;
import h0.i.i.g;
import h0.q.e0;
import h0.q.p;
import h0.q.r;

public class ComponentActivity extends Activity implements p, g.a {
    private h<Class<? extends ExtraData>, ExtraData> mExtraDataMap = new h<>();
    private r mLifecycleRegistry = new r(this);

    @Deprecated
    public static class ExtraData {
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !g.a(decorView, keyEvent)) {
            return g.b(this, decorView, this, keyEvent);
        }
        return true;
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !g.a(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Deprecated
    public <T extends ExtraData> T getExtraData(Class<T> cls) {
        return (ExtraData) this.mExtraDataMap.getOrDefault(cls, null);
    }

    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e0.c(this);
    }

    public void onSaveInstanceState(Bundle bundle) {
        r rVar = this.mLifecycleRegistry;
        Lifecycle.State state = Lifecycle.State.CREATED;
        rVar.d("markState");
        rVar.d("setCurrentState");
        rVar.g(state);
        super.onSaveInstanceState(bundle);
    }

    @Deprecated
    public void putExtraData(ExtraData extraData) {
        this.mExtraDataMap.put(extraData.getClass(), extraData);
    }

    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
}
