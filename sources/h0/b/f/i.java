package h0.b.f;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;

/* compiled from: AppCompatCompoundButtonHelper */
public class i {
    public final CompoundButton a;
    public ColorStateList b = null;
    public PorterDuff.Mode c = null;
    public boolean d = false;
    public boolean e = false;
    public boolean f;

    public i(CompoundButton compoundButton) {
        this.a = compoundButton;
    }

    public void a() {
        Drawable buttonDrawable = this.a.getButtonDrawable();
        if (buttonDrawable == null) {
            return;
        }
        if (this.d || this.e) {
            Drawable mutate = buttonDrawable.mutate();
            if (this.d) {
                mutate.setTintList(this.b);
            }
            if (this.e) {
                mutate.setTintMode(this.c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.a.getDrawableState());
            }
            this.a.setButtonDrawable(mutate);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b A[SYNTHETIC, Splitter:B:12:0x003b] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005e A[Catch:{ all -> 0x0068 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0072 A[Catch:{ all -> 0x0068 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            android.widget.CompoundButton r0 = r9.a
            android.content.Context r0 = r0.getContext()
            int[] r3 = androidx.appcompat.R.styleable.CompoundButton
            r8 = 0
            h0.b.f.w0 r0 = h0.b.f.w0.q(r0, r10, r3, r11, r8)
            android.widget.CompoundButton r1 = r9.a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.b
            r7 = 0
            r4 = r10
            r6 = r11
            h0.i.i.q.o(r1, r2, r3, r4, r5, r6, r7)
            int r10 = androidx.appcompat.R.styleable.CompoundButton_buttonCompat     // Catch:{ all -> 0x0068 }
            boolean r11 = r0.o(r10)     // Catch:{ all -> 0x0068 }
            if (r11 == 0) goto L_0x0038
            int r10 = r0.l(r10, r8)     // Catch:{ all -> 0x0068 }
            if (r10 == 0) goto L_0x0038
            android.widget.CompoundButton r11 = r9.a     // Catch:{ NotFoundException -> 0x0038 }
            android.content.Context r1 = r11.getContext()     // Catch:{ NotFoundException -> 0x0038 }
            android.graphics.drawable.Drawable r10 = h0.b.b.a.a.a(r1, r10)     // Catch:{ NotFoundException -> 0x0038 }
            r11.setButtonDrawable(r10)     // Catch:{ NotFoundException -> 0x0038 }
            r10 = 1
            goto L_0x0039
        L_0x0038:
            r10 = r8
        L_0x0039:
            if (r10 != 0) goto L_0x0056
            int r10 = androidx.appcompat.R.styleable.CompoundButton_android_button     // Catch:{ all -> 0x0068 }
            boolean r11 = r0.o(r10)     // Catch:{ all -> 0x0068 }
            if (r11 == 0) goto L_0x0056
            int r10 = r0.l(r10, r8)     // Catch:{ all -> 0x0068 }
            if (r10 == 0) goto L_0x0056
            android.widget.CompoundButton r11 = r9.a     // Catch:{ all -> 0x0068 }
            android.content.Context r1 = r11.getContext()     // Catch:{ all -> 0x0068 }
            android.graphics.drawable.Drawable r10 = h0.b.b.a.a.a(r1, r10)     // Catch:{ all -> 0x0068 }
            r11.setButtonDrawable(r10)     // Catch:{ all -> 0x0068 }
        L_0x0056:
            int r10 = androidx.appcompat.R.styleable.CompoundButton_buttonTint     // Catch:{ all -> 0x0068 }
            boolean r11 = r0.o(r10)     // Catch:{ all -> 0x0068 }
            if (r11 == 0) goto L_0x006a
            android.widget.CompoundButton r11 = r9.a     // Catch:{ all -> 0x0068 }
            android.content.res.ColorStateList r10 = r0.c(r10)     // Catch:{ all -> 0x0068 }
            r11.setButtonTintList(r10)     // Catch:{ all -> 0x0068 }
            goto L_0x006a
        L_0x0068:
            r10 = move-exception
            goto L_0x0087
        L_0x006a:
            int r10 = androidx.appcompat.R.styleable.CompoundButton_buttonTintMode     // Catch:{ all -> 0x0068 }
            boolean r11 = r0.o(r10)     // Catch:{ all -> 0x0068 }
            if (r11 == 0) goto L_0x0081
            android.widget.CompoundButton r11 = r9.a     // Catch:{ all -> 0x0068 }
            r1 = -1
            int r10 = r0.j(r10, r1)     // Catch:{ all -> 0x0068 }
            r1 = 0
            android.graphics.PorterDuff$Mode r10 = h0.b.f.b0.c(r10, r1)     // Catch:{ all -> 0x0068 }
            r11.setButtonTintMode(r10)     // Catch:{ all -> 0x0068 }
        L_0x0081:
            android.content.res.TypedArray r10 = r0.b
            r10.recycle()
            return
        L_0x0087:
            android.content.res.TypedArray r11 = r0.b
            r11.recycle()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.b.f.i.b(android.util.AttributeSet, int):void");
    }
}
