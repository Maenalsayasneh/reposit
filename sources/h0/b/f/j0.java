package h0.b.f;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import h0.b.e.i.f;
import h0.b.e.i.g;
import h0.b.e.i.i;
import java.lang.reflect.Method;

/* compiled from: MenuPopupWindow */
public class j0 extends h0 implements i0 {
    public static Method v2;
    public i0 w2;

    /* compiled from: MenuPopupWindow */
    public static class a extends c0 {
        public final int g2;
        public final int h2;
        public i0 i2;
        public MenuItem j2;

        public a(Context context, boolean z) {
            super(context, z);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.g2 = 21;
                this.h2 = 22;
                return;
            }
            this.g2 = 22;
            this.h2 = 21;
        }

        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i;
            f fVar;
            int pointToPosition;
            int i3;
            if (this.i2 != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    fVar = (f) headerViewListAdapter.getWrappedAdapter();
                } else {
                    i = 0;
                    fVar = (f) adapter;
                }
                i iVar = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i3 = pointToPosition - i) >= 0 && i3 < fVar.getCount()) {
                    iVar = fVar.getItem(i3);
                }
                MenuItem menuItem = this.j2;
                if (menuItem != iVar) {
                    g gVar = fVar.c;
                    if (menuItem != null) {
                        this.i2.d(gVar, menuItem);
                    }
                    this.j2 = iVar;
                    if (iVar != null) {
                        this.i2.c(gVar, iVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            f fVar;
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.g2) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i != this.h2) {
                return super.onKeyDown(i, keyEvent);
            } else {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    fVar = (f) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                } else {
                    fVar = (f) adapter;
                }
                fVar.c.c(false);
                return true;
            }
        }

        public void setHoverListener(i0 i0Var) {
            this.i2 = i0Var;
        }

        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                v2 = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public j0(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, (AttributeSet) null, i, i2);
    }

    public void c(g gVar, MenuItem menuItem) {
        i0 i0Var = this.w2;
        if (i0Var != null) {
            i0Var.c(gVar, menuItem);
        }
    }

    public void d(g gVar, MenuItem menuItem) {
        i0 i0Var = this.w2;
        if (i0Var != null) {
            i0Var.d(gVar, menuItem);
        }
    }

    public c0 q(Context context, boolean z) {
        a aVar = new a(context, z);
        aVar.setHoverListener(this);
        return aVar;
    }
}
