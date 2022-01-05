package h0.b.f;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import androidx.appcompat.R;
import androidx.appcompat.widget.ResourceManagerInternal;

/* compiled from: AppCompatDrawableManager */
public final class j {
    public static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    public static j b;
    public ResourceManagerInternal c;

    /* compiled from: AppCompatDrawableManager */
    public class a implements ResourceManagerInternal.c {
        public final int[] a = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
        public final int[] b = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
        public final int[] c = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
        public final int[] d = {R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
        public final int[] e = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        public final int[] f = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

        public final boolean a(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        public final ColorStateList b(Context context, int i) {
            int c2 = r0.c(context, R.attr.colorControlHighlight);
            int b2 = r0.b(context, R.attr.colorButtonNormal);
            return new ColorStateList(new int[][]{r0.b, r0.d, r0.c, r0.f}, new int[]{b2, h0.i.c.a.a(c2, i), h0.i.c.a.a(c2, i), i});
        }

        public final LayerDrawable c(ResourceManagerInternal resourceManagerInternal, Context context, int i) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
            Drawable drawable = resourceManagerInternal.getDrawable(context, R.drawable.abc_star_black_48dp);
            Drawable drawable2 = resourceManagerInternal.getDrawable(context, R.drawable.abc_star_half_black_48dp);
            if ((drawable instanceof BitmapDrawable) && drawable.getIntrinsicWidth() == dimensionPixelSize && drawable.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable2 = (BitmapDrawable) drawable;
                bitmapDrawable = new BitmapDrawable(bitmapDrawable2.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawable.draw(canvas);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
                bitmapDrawable = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable.setTileModeX(Shader.TileMode.REPEAT);
            if ((drawable2 instanceof BitmapDrawable) && drawable2.getIntrinsicWidth() == dimensionPixelSize && drawable2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) drawable2;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                drawable2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawable2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable2, bitmapDrawable3, bitmapDrawable});
            layerDrawable.setId(0, 16908288);
            layerDrawable.setId(1, 16908303);
            layerDrawable.setId(2, 16908301);
            return layerDrawable;
        }

        public ColorStateList d(Context context, int i) {
            if (i == R.drawable.abc_edit_text_material) {
                int i2 = R.color.abc_tint_edittext;
                ThreadLocal<TypedValue> threadLocal = h0.b.b.a.a.a;
                return context.getColorStateList(i2);
            } else if (i == R.drawable.abc_switch_track_mtrl_alpha) {
                int i3 = R.color.abc_tint_switch_track;
                ThreadLocal<TypedValue> threadLocal2 = h0.b.b.a.a.a;
                return context.getColorStateList(i3);
            } else if (i == R.drawable.abc_switch_thumb_material) {
                int[][] iArr = new int[3][];
                int[] iArr2 = new int[3];
                int i4 = R.attr.colorSwitchThumbNormal;
                ColorStateList d2 = r0.d(context, i4);
                if (d2 == null || !d2.isStateful()) {
                    iArr[0] = r0.b;
                    iArr2[0] = r0.b(context, i4);
                    iArr[1] = r0.e;
                    iArr2[1] = r0.c(context, R.attr.colorControlActivated);
                    iArr[2] = r0.f;
                    iArr2[2] = r0.c(context, i4);
                } else {
                    iArr[0] = r0.b;
                    iArr2[0] = d2.getColorForState(iArr[0], 0);
                    iArr[1] = r0.e;
                    iArr2[1] = r0.c(context, R.attr.colorControlActivated);
                    iArr[2] = r0.f;
                    iArr2[2] = d2.getDefaultColor();
                }
                return new ColorStateList(iArr, iArr2);
            } else if (i == R.drawable.abc_btn_default_mtrl_shape) {
                return b(context, r0.c(context, R.attr.colorButtonNormal));
            } else {
                if (i == R.drawable.abc_btn_borderless_material) {
                    return b(context, 0);
                }
                if (i == R.drawable.abc_btn_colored_material) {
                    return b(context, r0.c(context, R.attr.colorAccent));
                }
                if (i == R.drawable.abc_spinner_mtrl_am_alpha || i == R.drawable.abc_spinner_textfield_background_material) {
                    int i5 = R.color.abc_tint_spinner;
                    ThreadLocal<TypedValue> threadLocal3 = h0.b.b.a.a.a;
                    return context.getColorStateList(i5);
                } else if (a(this.b, i)) {
                    return r0.d(context, R.attr.colorControlNormal);
                } else {
                    if (a(this.e, i)) {
                        int i6 = R.color.abc_tint_default;
                        ThreadLocal<TypedValue> threadLocal4 = h0.b.b.a.a.a;
                        return context.getColorStateList(i6);
                    } else if (a(this.f, i)) {
                        int i7 = R.color.abc_tint_btn_checkable;
                        ThreadLocal<TypedValue> threadLocal5 = h0.b.b.a.a.a;
                        return context.getColorStateList(i7);
                    } else if (i != R.drawable.abc_seekbar_thumb_material) {
                        return null;
                    } else {
                        int i8 = R.color.abc_tint_seek_thumb;
                        ThreadLocal<TypedValue> threadLocal6 = h0.b.b.a.a.a;
                        return context.getColorStateList(i8);
                    }
                }
            }
        }

        public final void e(Drawable drawable, int i, PorterDuff.Mode mode) {
            if (b0.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = j.a;
            }
            drawable.setColorFilter(j.c(i, mode));
        }
    }

    public static synchronized j a() {
        j jVar;
        synchronized (j.class) {
            if (b == null) {
                e();
            }
            jVar = b;
        }
        return jVar;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (j.class) {
            porterDuffColorFilter = ResourceManagerInternal.getPorterDuffColorFilter(i, mode);
        }
        return porterDuffColorFilter;
    }

    public static synchronized void e() {
        synchronized (j.class) {
            if (b == null) {
                j jVar = new j();
                b = jVar;
                jVar.c = ResourceManagerInternal.get();
                b.c.setHooks(new a());
            }
        }
    }

    public synchronized Drawable b(Context context, int i) {
        return this.c.getDrawable(context, i);
    }

    public synchronized ColorStateList d(Context context, int i) {
        return this.c.getTintList(context, i);
    }
}
