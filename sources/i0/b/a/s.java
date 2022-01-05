package i0.b.a;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: EpoxyItemSpacingDecorator */
public class s extends RecyclerView.m {
    public int a = 0;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;

    public void f(Rect rect, View view, RecyclerView recyclerView, RecyclerView.y yVar) {
        boolean z;
        boolean z2;
        boolean z3;
        rect.setEmpty();
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition != -1) {
            RecyclerView.n layoutManager = recyclerView.getLayoutManager();
            int itemCount = recyclerView.getAdapter().getItemCount();
            int i2 = 0;
            boolean z4 = true;
            this.d = childAdapterPosition == 0;
            int i3 = itemCount - 1;
            this.e = childAdapterPosition == i3;
            this.c = layoutManager.canScrollHorizontally();
            this.b = layoutManager.canScrollVertically();
            boolean z5 = layoutManager instanceof GridLayoutManager;
            this.f = z5;
            if (z5) {
                GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
                GridLayoutManager.c cVar = gridLayoutManager.g;
                int e2 = cVar.e(childAdapterPosition);
                int i4 = gridLayoutManager.b;
                int d2 = cVar.d(childAdapterPosition, i4);
                this.g = d2 == 0;
                this.h = d2 + e2 == i4;
                int i5 = 0;
                int i6 = 0;
                while (true) {
                    if (i5 > childAdapterPosition) {
                        z = true;
                        break;
                    }
                    i6 += cVar.e(i5);
                    if (i6 > i4) {
                        z = false;
                        break;
                    }
                    i5++;
                }
                this.i = z;
                if (!z) {
                    int i7 = 0;
                    while (true) {
                        if (i3 < childAdapterPosition) {
                            z3 = true;
                            break;
                        }
                        i7 += cVar.e(i3);
                        if (i7 > i4) {
                            z3 = false;
                            break;
                        }
                        i3--;
                    }
                    if (z3) {
                        z2 = true;
                        this.j = z2;
                    }
                }
                z2 = false;
                this.j = z2;
            }
            boolean z6 = this.f;
            boolean z7 = !z6 ? !(!this.c || this.d) : !((!this.c || this.i) && (!this.b || this.g));
            boolean z8 = !z6 ? !(!this.c || this.e) : !((!this.c || this.j) && (!this.b || this.h));
            boolean z9 = !z6 ? !(!this.b || this.d) : !((!this.c || this.g) && (!this.b || this.i));
            boolean z10 = !z6 ? !(!this.b || this.e) : !((!this.c || this.h) && (!this.b || this.j));
            boolean z11 = this.c;
            boolean z12 = (layoutManager instanceof LinearLayoutManager) && ((LinearLayoutManager) layoutManager).getReverseLayout();
            if (layoutManager.getLayoutDirection() != 1) {
                z4 = false;
            }
            if (z11 && z4) {
                z12 = !z12;
            }
            if (!z12) {
                boolean z13 = z8;
                z8 = z7;
                z7 = z13;
            } else if (!this.c) {
                boolean z14 = z9;
                z9 = z10;
                z10 = z14;
                boolean z15 = z8;
                z8 = z7;
                z7 = z15;
            }
            int i8 = this.a / 2;
            rect.right = z7 ? i8 : 0;
            rect.left = z8 ? i8 : 0;
            rect.top = z9 ? i8 : 0;
            if (z10) {
                i2 = i8;
            }
            rect.bottom = i2;
        }
    }
}
