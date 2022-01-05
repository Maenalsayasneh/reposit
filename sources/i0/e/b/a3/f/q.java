package i0.e.b.a3.f;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.clubhouse.android.core.R;
import com.google.android.material.badge.BadgeDrawable;
import h0.i.b.a;
import i0.h.a.c.q.h;
import i0.h.a.c.t.b;
import i0.h.a.c.w.g;
import java.lang.reflect.Field;
import java.util.Objects;
import m0.n.b.i;

/* compiled from: ViewUtil.kt */
public final class q {
    public static final q a = new q();

    @SuppressLint({"UnsafeExperimentalUsageError"})
    public final void a(View view, int i, int i2) {
        BadgeDrawable badgeDrawable;
        i.e(view, "<this>");
        if (view.getTag() != null) {
            Object tag = view.getTag();
            Objects.requireNonNull(tag, "null cannot be cast to non-null type com.google.android.material.badge.BadgeDrawable");
            badgeDrawable = (BadgeDrawable) tag;
        } else {
            badgeDrawable = BadgeDrawable.d(view.getContext(), i2);
            i.d(badgeDrawable, "createFromResource(context, badgeStyle)");
            Context context = view.getContext();
            i.d(context, "context");
            Field declaredField = badgeDrawable.getClass().getDeclaredField("shapeDrawable");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(badgeDrawable);
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.google.android.material.shape.MaterialShapeDrawable");
            ((g) obj).w(context.getResources().getDimension(R.dimen.badge_stroke), a.getColor(context, R.color.white));
            Context context2 = view.getContext();
            i.d(context2, "context");
            Field declaredField2 = badgeDrawable.getClass().getDeclaredField("textDrawableHelper");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(badgeDrawable);
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type com.google.android.material.internal.TextDrawableHelper");
            ((h) obj2).b(new b(context2, R.style.TextStyle_Badge), context2);
            view.setTag(badgeDrawable);
        }
        if (i > 0) {
            badgeDrawable.k(i);
            i0.h.a.c.c.a.a(badgeDrawable, view, (FrameLayout) null);
            return;
        }
        i0.h.a.c.c.a.b(badgeDrawable, view);
    }
}
