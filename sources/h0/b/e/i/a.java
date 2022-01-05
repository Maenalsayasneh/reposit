package h0.b.e.i;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import h0.i.d.a.b;

/* compiled from: ActionMenuItem */
public class a implements b {
    public CharSequence a;
    public CharSequence b;
    public Intent c;
    public char d;
    public int e = 4096;
    public char f;
    public int g = 4096;
    public Drawable h;
    public Context i;
    public CharSequence j;
    public CharSequence k;
    public ColorStateList l = null;
    public PorterDuff.Mode m = null;
    public boolean n = false;
    public boolean o = false;
    public int p = 16;

    public a(Context context, int i2, int i3, int i4, CharSequence charSequence) {
        this.i = context;
        this.a = charSequence;
    }

    public b a(h0.i.i.b bVar) {
        throw new UnsupportedOperationException();
    }

    public h0.i.i.b b() {
        return null;
    }

    public final void c() {
        Drawable drawable = this.h;
        if (drawable == null) {
            return;
        }
        if (this.n || this.o) {
            this.h = drawable;
            Drawable mutate = drawable.mutate();
            this.h = mutate;
            if (this.n) {
                mutate.setTintList(this.l);
            }
            if (this.o) {
                this.h.setTintMode(this.m);
            }
        }
    }

    public boolean collapseActionView() {
        return false;
    }

    public boolean expandActionView() {
        return false;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public View getActionView() {
        return null;
    }

    public int getAlphabeticModifiers() {
        return this.g;
    }

    public char getAlphabeticShortcut() {
        return this.f;
    }

    public CharSequence getContentDescription() {
        return this.j;
    }

    public int getGroupId() {
        return 0;
    }

    public Drawable getIcon() {
        return this.h;
    }

    public ColorStateList getIconTintList() {
        return this.l;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.m;
    }

    public Intent getIntent() {
        return this.c;
    }

    public int getItemId() {
        return 16908332;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public int getNumericModifiers() {
        return this.e;
    }

    public char getNumericShortcut() {
        return this.d;
    }

    public int getOrder() {
        return 0;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.a;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.b;
        return charSequence != null ? charSequence : this.a;
    }

    public CharSequence getTooltipText() {
        return this.k;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public boolean isCheckable() {
        return (this.p & 1) != 0;
    }

    public boolean isChecked() {
        return (this.p & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.p & 16) != 0;
    }

    public boolean isVisible() {
        return (this.p & 8) == 0;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setAlphabeticShortcut(char c2) {
        this.f = Character.toLowerCase(c2);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.p = z | (this.p & true) ? 1 : 0;
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.p = (z ? 2 : 0) | (this.p & -3);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.j = charSequence;
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.p = (z ? 16 : 0) | (this.p & -17);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.h = drawable;
        c();
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.l = colorStateList;
        this.n = true;
        c();
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.m = mode;
        this.o = true;
        c();
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.c = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c2) {
        this.d = c2;
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    public MenuItem setShortcut(char c2, char c3) {
        this.d = c2;
        this.f = Character.toLowerCase(c3);
        return this;
    }

    public void setShowAsAction(int i2) {
    }

    public MenuItem setShowAsActionFlags(int i2) {
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.a = charSequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.b = charSequence;
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        this.k = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean z) {
        int i2 = 8;
        int i3 = this.p & 8;
        if (z) {
            i2 = 0;
        }
        this.p = i3 | i2;
        return this;
    }

    public MenuItem setActionView(int i2) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setAlphabeticShortcut(char c2, int i2) {
        this.f = Character.toLowerCase(c2);
        this.g = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    /* renamed from: setContentDescription  reason: collision with other method in class */
    public b m0setContentDescription(CharSequence charSequence) {
        this.j = charSequence;
        return this;
    }

    public MenuItem setNumericShortcut(char c2, int i2) {
        this.d = c2;
        this.e = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public MenuItem setTitle(int i2) {
        this.a = this.i.getResources().getString(i2);
        return this;
    }

    /* renamed from: setTooltipText  reason: collision with other method in class */
    public b m1setTooltipText(CharSequence charSequence) {
        this.k = charSequence;
        return this;
    }

    public MenuItem setIcon(int i2) {
        this.h = h0.i.b.a.getDrawable(this.i, i2);
        c();
        return this;
    }

    public MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.d = c2;
        this.e = KeyEvent.normalizeMetaState(i2);
        this.f = Character.toLowerCase(c3);
        this.g = KeyEvent.normalizeMetaState(i3);
        return this;
    }
}
