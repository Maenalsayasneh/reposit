package i0.e.b.g3;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import com.clubhouse.android.ui.ClubhouseActivity;
import java.util.Objects;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class d implements View.OnApplyWindowInsetsListener {
    public static final /* synthetic */ d a = new d();

    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int i = ClubhouseActivity.x;
        Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        boolean z = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            i.d(childAt, "getChildAt(index)");
            if (childAt.dispatchApplyWindowInsets(windowInsets).isConsumed()) {
                z = true;
            }
        }
        return z ? windowInsets.consumeSystemWindowInsets() : windowInsets;
    }
}
