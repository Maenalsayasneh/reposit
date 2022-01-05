package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.R;
import h0.b.e.i.i;
import h0.b.e.i.n;
import h0.b.f.w0;
import h0.i.i.q;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class ListMenuItemView extends LinearLayout implements n.a, AbsListView.SelectionBoundsAdjuster {
    public TextView Y1;
    public ImageView Z1;
    public ImageView a2;
    public LinearLayout b2;
    public i c;
    public Drawable c2;
    public ImageView d;
    public int d2;
    public Context e2;
    public boolean f2;
    public Drawable g2;
    public boolean h2;
    public LayoutInflater i2;
    public boolean j2;
    public RadioButton q;
    public TextView x;
    public CheckBox y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i = R.attr.listMenuViewStyle;
        w0 q2 = w0.q(getContext(), attributeSet, R.styleable.MenuView, i, 0);
        this.c2 = q2.g(R.styleable.MenuView_android_itemBackground);
        this.d2 = q2.l(R.styleable.MenuView_android_itemTextAppearance, -1);
        this.f2 = q2.a(R.styleable.MenuView_preserveIconSpacing, false);
        this.e2 = context;
        this.g2 = q2.g(R.styleable.MenuView_subMenuArrow);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, R.attr.dropDownListViewStyle, 0);
        this.h2 = obtainStyledAttributes.hasValue(0);
        q2.b.recycle();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.i2 == null) {
            this.i2 = LayoutInflater.from(getContext());
        }
        return this.i2;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.Z1;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    public final void a() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, this, false);
        this.y = checkBox;
        LinearLayout linearLayout = this.b2;
        if (linearLayout != null) {
            linearLayout.addView(checkBox, -1);
        } else {
            addView(checkBox, -1);
        }
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.a2;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.a2.getLayoutParams();
            rect.top = this.a2.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
        }
    }

    public final void b() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, this, false);
        this.q = radioButton;
        LinearLayout linearLayout = this.b2;
        if (linearLayout != null) {
            linearLayout.addView(radioButton, -1);
        } else {
            addView(radioButton, -1);
        }
    }

    public void c(boolean z) {
        String str;
        int i = (!z || !this.c.m()) ? 8 : 0;
        if (i == 0) {
            TextView textView = this.Y1;
            i iVar = this.c;
            char e = iVar.e();
            if (e == 0) {
                str = "";
            } else {
                Resources resources = iVar.n.b.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(iVar.n.b).hasPermanentMenuKey()) {
                    sb.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i3 = iVar.n.n() ? iVar.k : iVar.i;
                i.c(sb, i3, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
                i.c(sb, i3, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                i.c(sb, i3, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                i.c(sb, i3, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                i.c(sb, i3, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                i.c(sb, i3, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
                if (e == 8) {
                    sb.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                } else if (e == 10) {
                    sb.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                } else if (e != ' ') {
                    sb.append(e);
                } else {
                    sb.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                }
                str = sb.toString();
            }
            textView.setText(str);
        }
        if (this.Y1.getVisibility() != i) {
            this.Y1.setVisibility(i);
        }
    }

    public void d(i iVar, int i) {
        this.c = iVar;
        setVisibility(iVar.isVisible() ? 0 : 8);
        setTitle(iVar.e);
        setCheckable(iVar.isCheckable());
        boolean m = iVar.m();
        iVar.e();
        c(m);
        setIcon(iVar.getIcon());
        setEnabled(iVar.isEnabled());
        setSubMenuArrowVisible(iVar.hasSubMenu());
        setContentDescription(iVar.q);
    }

    public i getItemData() {
        return this.c;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        Drawable drawable = this.c2;
        AtomicInteger atomicInteger = q.a;
        setBackground(drawable);
        TextView textView = (TextView) findViewById(R.id.title);
        this.x = textView;
        int i = this.d2;
        if (i != -1) {
            textView.setTextAppearance(this.e2, i);
        }
        this.Y1 = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.Z1 = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.g2);
        }
        this.a2 = (ImageView) findViewById(R.id.group_divider);
        this.b2 = (LinearLayout) findViewById(R.id.content);
    }

    public void onMeasure(int i, int i3) {
        if (this.d != null && this.f2) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.d.getLayoutParams();
            int i4 = layoutParams.height;
            if (i4 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i4;
            }
        }
        super.onMeasure(i, i3);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (z || this.q != null || this.y != null) {
            if (this.c.h()) {
                if (this.q == null) {
                    b();
                }
                compoundButton2 = this.q;
                compoundButton = this.y;
            } else {
                if (this.y == null) {
                    a();
                }
                compoundButton2 = this.y;
                compoundButton = this.q;
            }
            if (z) {
                compoundButton2.setChecked(this.c.isChecked());
                if (compoundButton2.getVisibility() != 0) {
                    compoundButton2.setVisibility(0);
                }
                if (compoundButton != null && compoundButton.getVisibility() != 8) {
                    compoundButton.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox = this.y;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.q;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.c.h()) {
            if (this.q == null) {
                b();
            }
            compoundButton = this.q;
        } else {
            if (this.y == null) {
                a();
            }
            compoundButton = this.y;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.j2 = z;
        this.f2 = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.a2;
        if (imageView != null) {
            imageView.setVisibility((this.h2 || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        Objects.requireNonNull(this.c.n);
        boolean z = this.j2;
        if (z || this.f2) {
            ImageView imageView = this.d;
            if (imageView != null || drawable != null || this.f2) {
                if (imageView == null) {
                    ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, this, false);
                    this.d = imageView2;
                    LinearLayout linearLayout = this.b2;
                    if (linearLayout != null) {
                        linearLayout.addView(imageView2, 0);
                    } else {
                        addView(imageView2, 0);
                    }
                }
                if (drawable != null || this.f2) {
                    ImageView imageView3 = this.d;
                    if (!z) {
                        drawable = null;
                    }
                    imageView3.setImageDrawable(drawable);
                    if (this.d.getVisibility() != 0) {
                        this.d.setVisibility(0);
                        return;
                    }
                    return;
                }
                this.d.setVisibility(8);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.x.setText(charSequence);
            if (this.x.getVisibility() != 0) {
                this.x.setVisibility(0);
            }
        } else if (this.x.getVisibility() != 8) {
            this.x.setVisibility(8);
        }
    }
}
