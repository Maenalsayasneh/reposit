package h0.g.c;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import h0.g.a.h.f;
import h0.g.a.h.g;
import h0.g.c.c;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: ConstraintHelper */
public abstract class a extends View {
    public String Y1;
    public View[] Z1 = null;
    public HashMap<Integer, String> a2 = new HashMap<>();
    public int[] c = new int[32];
    public int d;
    public Context q;
    public f x;
    public String y;

    public a(Context context) {
        super(context);
        this.q = context;
        l((AttributeSet) null);
    }

    public final void e(String str) {
        if (str != null && str.length() != 0 && this.q != null) {
            String trim = str.trim();
            if (getParent() instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
            }
            int k = k(trim);
            if (k != 0) {
                this.a2.put(Integer.valueOf(k), trim);
                f(k);
                return;
            }
            Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
        }
    }

    public final void f(int i) {
        if (i != getId()) {
            int i2 = this.d + 1;
            int[] iArr = this.c;
            if (i2 > iArr.length) {
                this.c = Arrays.copyOf(iArr, iArr.length * 2);
            }
            int[] iArr2 = this.c;
            int i3 = this.d;
            iArr2[i3] = i;
            this.d = i3 + 1;
        }
    }

    public final void g(String str) {
        if (str != null && str.length() != 0 && this.q != null) {
            String trim = str.trim();
            ConstraintLayout constraintLayout = null;
            if (getParent() instanceof ConstraintLayout) {
                constraintLayout = (ConstraintLayout) getParent();
            }
            if (constraintLayout == null) {
                Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
                return;
            }
            int childCount = constraintLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = constraintLayout.getChildAt(i);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if ((layoutParams instanceof ConstraintLayout.a) && trim.equals(((ConstraintLayout.a) layoutParams).X)) {
                    if (childAt.getId() == -1) {
                        StringBuilder P0 = i0.d.a.a.a.P0("to use ConstraintTag view ");
                        P0.append(childAt.getClass().getSimpleName());
                        P0.append(" must have an ID");
                        Log.w("ConstraintHelper", P0.toString());
                    } else {
                        f(childAt.getId());
                    }
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.c, this.d);
    }

    public void h(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.d; i++) {
            View f = constraintLayout.f(this.c[i]);
            if (f != null) {
                f.setVisibility(visibility);
                if (elevation > 0.0f) {
                    f.setTranslationZ(f.getTranslationZ() + elevation);
                }
            }
        }
    }

    public void i(ConstraintLayout constraintLayout) {
    }

    public final int j(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (str == null || (resources = this.q.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                String str2 = null;
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public final int k(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object d2 = constraintLayout.d(0, str);
            if (d2 instanceof Integer) {
                i = ((Integer) d2).intValue();
            }
        }
        if (i == 0 && constraintLayout != null) {
            i = j(constraintLayout, str);
        }
        if (i == 0) {
            try {
                i = R.id.class.getField(str).getInt((Object) null);
            } catch (Exception unused) {
            }
        }
        return i == 0 ? this.q.getResources().getIdentifier(str, "id", this.q.getPackageName()) : i;
    }

    public void l(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.ConstraintLayout_Layout_constraint_referenced_ids) {
                    String string = obtainStyledAttributes.getString(index);
                    this.y = string;
                    setIds(string);
                } else if (index == R.styleable.ConstraintLayout_Layout_constraint_referenced_tags) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.Y1 = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void m(c.a aVar, g gVar, ConstraintLayout.a aVar2, SparseArray<ConstraintWidget> sparseArray) {
        c.b bVar = aVar.e;
        int[] iArr = bVar.f29j0;
        int i = 0;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = bVar.f30k0;
            if (str != null && str.length() > 0) {
                c.b bVar2 = aVar.e;
                String[] split = bVar2.f30k0.split(InstabugDbContract.COMMA_SEP);
                getContext();
                int[] iArr2 = new int[split.length];
                int i2 = 0;
                for (String trim : split) {
                    int k = k(trim.trim());
                    if (k != 0) {
                        iArr2[i2] = k;
                        i2++;
                    }
                }
                if (i2 != split.length) {
                    iArr2 = Arrays.copyOf(iArr2, i2);
                }
                bVar2.f29j0 = iArr2;
            }
        }
        gVar.a();
        if (aVar.e.f29j0 != null) {
            while (true) {
                int[] iArr3 = aVar.e.f29j0;
                if (i < iArr3.length) {
                    ConstraintWidget constraintWidget = sparseArray.get(iArr3[i]);
                    if (constraintWidget != null) {
                        gVar.b(constraintWidget);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public void n(ConstraintWidget constraintWidget, boolean z) {
    }

    public void o() {
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.y;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.Y1;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    public void onDraw(Canvas canvas) {
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void p() {
    }

    public void q() {
    }

    public void r(f fVar, SparseArray sparseArray) {
        fVar.a();
        for (int i = 0; i < this.d; i++) {
            fVar.b((ConstraintWidget) sparseArray.get(this.c[i]));
        }
    }

    public void s() {
        if (this.x != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.a) {
                ((ConstraintLayout.a) layoutParams).f25p0 = (ConstraintWidget) this.x;
            }
        }
    }

    public void setIds(String str) {
        this.y = str;
        if (str != null) {
            int i = 0;
            this.d = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    e(str.substring(i));
                    return;
                } else {
                    e(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    public void setReferenceTags(String str) {
        this.Y1 = str;
        if (str != null) {
            int i = 0;
            this.d = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    g(str.substring(i));
                    return;
                } else {
                    g(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.y = null;
        this.d = 0;
        for (int f : iArr) {
            f(f);
        }
    }

    public void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.y == null) {
            f(i);
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.q = context;
        l(attributeSet);
    }
}
