package i0.j.e.d1;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import com.instabug.library.model.StepType;
import com.instabug.library.view.ViewUtils;
import i0.j.e.f1.n;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* compiled from: KeyboardEventListener */
public class a implements ViewTreeObserver.OnGlobalFocusChangeListener {
    public final ViewTreeObserver.OnGlobalLayoutListener c;
    public final WeakReference<Activity> d;
    public final b q;

    /* renamed from: i0.j.e.d1.a$a  reason: collision with other inner class name */
    /* compiled from: KeyboardEventListener */
    public class C0179a implements ViewTreeObserver.OnGlobalLayoutListener {
        public boolean c;
        public final /* synthetic */ Activity d;

        public C0179a(Activity activity) {
            this.d = activity;
            this.c = a.this.b(activity);
        }

        public void onGlobalLayout() {
            boolean b = a.this.b(this.d);
            if (b != this.c) {
                Objects.requireNonNull((i0.j.e.a1.b) a.this.q);
                n k = n.k();
                k.d(k.j(), b);
                this.c = b;
            }
        }
    }

    /* compiled from: KeyboardEventListener */
    public interface b {
    }

    public a(Activity activity, b bVar) {
        this.d = new WeakReference<>(activity);
        this.q = bVar;
        C0179a aVar = new C0179a(activity);
        this.c = aVar;
        View a = a(activity);
        if (a != null) {
            a.getViewTreeObserver().addOnGlobalLayoutListener(aVar);
        }
        View a2 = a(activity);
        if (a2 != null) {
            a2.getViewTreeObserver().addOnGlobalFocusChangeListener(this);
        }
    }

    public View a(Activity activity) {
        if (activity != null) {
            return activity.getWindow().getDecorView().getRootView();
        }
        return null;
    }

    public final boolean b(Activity activity) {
        View a = a(activity);
        if (a == null) {
            return false;
        }
        Rect rect = new Rect();
        a.getWindowVisibleDisplayFrame(rect);
        if (activity.getWindow().getDecorView().getRootView().getHeight() - rect.height() > ViewUtils.convertDpToPx(activity, 100.0f)) {
            return true;
        }
        return false;
    }

    public void onGlobalFocusChanged(View view, View view2) {
        if (view2 != null) {
            if (!(view2 instanceof EditText)) {
                n.k().b = null;
                n k = n.k();
                k.d(k.j(), false);
            } else if (view == null || view != view2) {
                n.k().b = new WeakReference<>(view2);
                n k2 = n.k();
                if (view != null) {
                    k2.i(StepType.END_EDITING, k2.f, k2.a(new WeakReference(view)), (String) null);
                }
                k2.i(StepType.START_EDITING, k2.f, k2.a(new WeakReference(view2)), (String) null);
            }
        }
    }
}
