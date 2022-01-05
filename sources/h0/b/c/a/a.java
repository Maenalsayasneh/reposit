package h0.b.c.a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* compiled from: DrawableWrapper */
public class a extends Drawable implements Drawable.Callback {
    public Drawable c;

    public a(Drawable drawable) {
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.c = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.c.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.c.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.c.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.c.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.c.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.c.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.c.getMinimumWidth();
    }

    public int getOpacity() {
        return this.c.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.c.getPadding(rect);
    }

    public int[] getState() {
        return this.c.getState();
    }

    public Region getTransparentRegion() {
        return this.c.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return this.c.isAutoMirrored();
    }

    public boolean isStateful() {
        return this.c.isStateful();
    }

    public void jumpToCurrentState() {
        this.c.jumpToCurrentState();
    }

    public void onBoundsChange(Rect rect) {
        this.c.setBounds(rect);
    }

    public boolean onLevelChange(int i) {
        return this.c.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.c.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        this.c.setAutoMirrored(z);
    }

    public void setChangingConfigurations(int i) {
        this.c.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.c.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.c.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.c.setFilterBitmap(z);
    }

    public void setHotspot(float f, float f2) {
        this.c.setHotspot(f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.c.setHotspotBounds(i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        return this.c.setState(iArr);
    }

    public void setTint(int i) {
        this.c.setTint(i);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.c.setTintList(colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.c.setTintMode(mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.c.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
