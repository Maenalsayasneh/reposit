package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import h0.b.f.e;
import h0.b.f.l;
import h0.b.f.r0;
import h0.b.f.t0;
import h0.b.f.u0;

public class AppCompatImageView extends ImageView {
    private final e mBackgroundTintHelper;
    private final l mImageHelper;

    public AppCompatImageView(Context context) {
        this(context, (AttributeSet) null);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.a();
        }
        l lVar = this.mImageHelper;
        if (lVar != null) {
            lVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        u0 u0Var;
        l lVar = this.mImageHelper;
        if (lVar == null || (u0Var = lVar.b) == null) {
            return null;
        }
        return u0Var.a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        u0 u0Var;
        l lVar = this.mImageHelper;
        if (lVar == null || (u0Var = lVar.b) == null) {
            return null;
        }
        return u0Var.b;
    }

    public boolean hasOverlappingRendering() {
        if (!(!(this.mImageHelper.a.getBackground() instanceof RippleDrawable)) || !super.hasOverlappingRendering()) {
            return false;
        }
        return true;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.f(i);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        l lVar = this.mImageHelper;
        if (lVar != null) {
            lVar.a();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        l lVar = this.mImageHelper;
        if (lVar != null) {
            lVar.a();
        }
    }

    public void setImageResource(int i) {
        l lVar = this.mImageHelper;
        if (lVar != null) {
            lVar.c(i);
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        l lVar = this.mImageHelper;
        if (lVar != null) {
            lVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        l lVar = this.mImageHelper;
        if (lVar != null) {
            lVar.d(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        l lVar = this.mImageHelper;
        if (lVar != null) {
            lVar.e(mode);
        }
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppCompatImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        t0.a(context);
        r0.a(this, getContext());
        e eVar = new e(this);
        this.mBackgroundTintHelper = eVar;
        eVar.d(attributeSet, i);
        l lVar = new l(this);
        this.mImageHelper = lVar;
        lVar.b(attributeSet, i);
    }
}
