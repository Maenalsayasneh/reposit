package i0.h.a.c.y;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
import i0.h.a.c.a.a;

/* compiled from: TabIndicatorInterpolator */
public class b {
    public static RectF a(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (tabLayout.w2 || !(view instanceof TabLayout.i)) {
            return new RectF((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom());
        }
        TabLayout.i iVar = (TabLayout.i) view;
        int contentWidth = iVar.getContentWidth();
        int contentHeight = iVar.getContentHeight();
        int E = (int) i0.h.a.b.c.m.b.E(iVar.getContext(), 24);
        if (contentWidth < E) {
            contentWidth = E;
        }
        int right = (iVar.getRight() + iVar.getLeft()) / 2;
        int bottom = (iVar.getBottom() + iVar.getTop()) / 2;
        int i = contentWidth / 2;
        return new RectF((float) (right - i), (float) (bottom - (contentHeight / 2)), (float) (i + right), (float) ((right / 2) + bottom));
    }

    public void b(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        RectF a = a(tabLayout, view);
        RectF a2 = a(tabLayout, view2);
        drawable.setBounds(a.a((int) a.left, (int) a2.left, f), drawable.getBounds().top, a.a((int) a.right, (int) a2.right, f), drawable.getBounds().bottom);
    }
}
