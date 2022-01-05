package i0.j.e.a1;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import com.instabug.library.util.InstabugSDKLogger;
import i0.j.c.l.a;

/* compiled from: InstabugWindowCallbacks */
public class f implements Window.Callback {
    public Window.Callback c;

    public f(Window.Callback callback) {
        this.c = callback;
    }

    public final void a(Exception exc) {
        InstabugSDKLogger.e("InstabugWindowCallbacks", exc.getClass().getSimpleName(), exc);
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        try {
            return this.c.dispatchGenericMotionEvent(motionEvent);
        } catch (Exception e) {
            a(e);
            return false;
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        try {
            return this.c.dispatchKeyEvent(keyEvent);
        } catch (Exception e) {
            a(e);
            return false;
        }
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        try {
            return this.c.dispatchKeyShortcutEvent(keyEvent);
        } catch (Exception e) {
            a(e);
            return false;
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        try {
            return this.c.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        } catch (Exception e) {
            a(e);
            return false;
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            Window.Callback callback = this.c;
            if (callback != null) {
                boolean dispatchTouchEvent = callback.dispatchTouchEvent(motionEvent);
                a.y(motionEvent);
                return dispatchTouchEvent;
            }
            a.y(motionEvent);
            return false;
        } catch (Exception e) {
            a(e);
            return false;
        }
    }

    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        try {
            return this.c.dispatchTrackballEvent(motionEvent);
        } catch (Exception e) {
            a(e);
            return false;
        }
    }

    public void onActionModeFinished(ActionMode actionMode) {
        try {
            this.c.onActionModeFinished(actionMode);
        } catch (Exception e) {
            a(e);
        }
    }

    public void onActionModeStarted(ActionMode actionMode) {
        try {
            this.c.onActionModeStarted(actionMode);
        } catch (Exception e) {
            a(e);
        }
    }

    public void onAttachedToWindow() {
        try {
            this.c.onAttachedToWindow();
        } catch (Exception e) {
            a(e);
        }
    }

    public void onContentChanged() {
        try {
            this.c.onContentChanged();
        } catch (Exception e) {
            a(e);
        }
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        try {
            return this.c.onCreatePanelMenu(i, menu);
        } catch (Exception e) {
            a(e);
            return false;
        }
    }

    public View onCreatePanelView(int i) {
        try {
            return this.c.onCreatePanelView(i);
        } catch (Exception e) {
            a(e);
            return null;
        }
    }

    public void onDetachedFromWindow() {
        try {
            this.c.onDetachedFromWindow();
        } catch (Exception e) {
            a(e);
        }
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        try {
            return this.c.onMenuItemSelected(i, menuItem);
        } catch (Exception e) {
            a(e);
            return false;
        }
    }

    public boolean onMenuOpened(int i, Menu menu) {
        try {
            return this.c.onMenuOpened(i, menu);
        } catch (Exception e) {
            a(e);
            return false;
        }
    }

    public void onPanelClosed(int i, Menu menu) {
        try {
            this.c.onPanelClosed(i, menu);
        } catch (Exception e) {
            a(e);
        }
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        try {
            return this.c.onPreparePanel(i, view, menu);
        } catch (Exception e) {
            a(e);
            return false;
        }
    }

    public boolean onSearchRequested() {
        try {
            return this.c.onSearchRequested();
        } catch (Exception e) {
            a(e);
            return false;
        }
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        try {
            this.c.onWindowAttributesChanged(layoutParams);
        } catch (Exception e) {
            a(e);
        }
    }

    public void onWindowFocusChanged(boolean z) {
        try {
            this.c.onWindowFocusChanged(z);
        } catch (Exception e) {
            a(e);
        }
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        try {
            return this.c.onWindowStartingActionMode(callback);
        } catch (Exception e) {
            a(e);
            return null;
        }
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        try {
            this.c.onSearchRequested(searchEvent);
            return false;
        } catch (Exception e) {
            a(e);
            return false;
        }
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        try {
            return this.c.onWindowStartingActionMode(callback, i);
        } catch (Exception e) {
            a(e);
            return null;
        }
    }
}
