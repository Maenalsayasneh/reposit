package com.clubhouse.android.core.ui;

import android.content.Context;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import com.clubhouse.android.core.R;
import h0.b.f.y;
import h0.i.b.a;
import h0.l.a.b;
import h0.l.a.d;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002XD¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00078\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\tR\u0016\u0010\u0014\u001a\u00020\r8\u0002@\u0002XD¢\u0006\u0006\n\u0004\b\u0013\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/clubhouse/android/core/ui/RSVPButton;", "Lh0/b/f/y;", "", "checked", "Lm0/i;", "setChecked", "(Z)V", "Lh0/l/a/d;", "Y1", "Lh0/l/a/d;", "onAnimation", "Z1", "animation", "", "q", "F", "rotationAngle", "y", "offAnimation", "x", "startVelocity", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "core_release"}, k = 1, mv = {1, 5, 1})
/* compiled from: RSVPButton.kt */
public final class RSVPButton extends y {
    public final d Y1;
    public d Z1;
    public final float q = 12.0f;
    public final float x = 5.0f;
    public final d y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RSVPButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        i.e(context, "context");
        b.k kVar = b.c;
        d dVar = new d(this, kVar, 0.0f);
        dVar.r.a(0.5f);
        this.y = dVar;
        d dVar2 = new d(this, kVar, 12.0f);
        dVar2.r.a(0.2f);
        this.Y1 = dVar2;
        setBackground(a.getDrawable(getContext(), R.drawable.selector_rsvp));
        setChecked(false);
        setText("");
        setTextOff("");
        setTextOn("");
    }

    public void setChecked(boolean z) {
        super.setChecked(z);
        d dVar = this.Z1;
        if (dVar != null) {
            if (!(dVar.r.b > 0.0d)) {
                throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
            } else if (Looper.myLooper() != Looper.getMainLooper()) {
                throw new AndroidRuntimeException("Animations may only be started on the main thread");
            } else if (dVar.l) {
                dVar.t = true;
            }
        }
        if (z) {
            d dVar2 = this.Y1;
            this.Z1 = dVar2;
            if (dVar2 != null) {
                dVar2.g = this.x;
            }
            if (dVar2 != null) {
                dVar2.f();
                return;
            }
            return;
        }
        d dVar3 = this.y;
        this.Z1 = dVar3;
        if (dVar3 != null) {
            dVar3.f();
        }
    }
}
