package u0.a.a;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator;

/* compiled from: RecyclerViewAttacher */
public class c implements ScrollingPagerIndicator.b<RecyclerView> {
    public ScrollingPagerIndicator a;
    public RecyclerView b;
    public LinearLayoutManager c;
    public RecyclerView.Adapter<?> d;
    public RecyclerView.s e;
    public RecyclerView.h f;
    public int g;
    public int h;

    public final int a() {
        RecyclerView.b0 findContainingViewHolder;
        for (int i = 0; i < this.b.getChildCount(); i++) {
            View childAt = this.b.getChildAt(i);
            float x = childAt.getX();
            int measuredWidth = childAt.getMeasuredWidth();
            float e2 = e();
            float c2 = c() + ((((float) this.b.getMeasuredWidth()) - c()) / 2.0f);
            if (this.c.getOrientation() == 1) {
                x = childAt.getY();
                measuredWidth = childAt.getMeasuredHeight();
                e2 = (((float) this.b.getMeasuredHeight()) - b()) / 2.0f;
                c2 = d();
            }
            if (x >= e2 && x + ((float) measuredWidth) <= c2 && (findContainingViewHolder = this.b.findContainingViewHolder(childAt)) != null && findContainingViewHolder.getAdapterPosition() != -1) {
                return findContainingViewHolder.getAdapterPosition();
            }
        }
        return -1;
    }

    public final float b() {
        int i;
        if (this.h == 0) {
            int i2 = 0;
            while (true) {
                if (i2 >= this.b.getChildCount()) {
                    break;
                }
                View childAt = this.b.getChildAt(i2);
                if (childAt.getMeasuredHeight() != 0) {
                    i = childAt.getMeasuredHeight();
                    this.h = i;
                    break;
                }
                i2++;
            }
        }
        i = this.h;
        return (float) i;
    }

    public final float c() {
        int i;
        if (this.g == 0) {
            int i2 = 0;
            while (true) {
                if (i2 >= this.b.getChildCount()) {
                    break;
                }
                View childAt = this.b.getChildAt(i2);
                if (childAt.getMeasuredWidth() != 0) {
                    i = childAt.getMeasuredWidth();
                    this.g = i;
                    break;
                }
                i2++;
            }
        }
        i = this.g;
        return (float) i;
    }

    public final float d() {
        return b() + ((((float) this.b.getMeasuredHeight()) - b()) / 2.0f);
    }

    public final float e() {
        return (((float) this.b.getMeasuredWidth()) - c()) / 2.0f;
    }

    public final void f() {
        int childAdapterPosition;
        float f2;
        int i;
        int i2;
        int childCount = this.c.getChildCount();
        View view = null;
        if (childCount != 0) {
            int i3 = Integer.MAX_VALUE;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = this.c.getChildAt(i4);
                if (this.c.getOrientation() == 0) {
                    i2 = (int) childAt.getX();
                    if (childAt.getMeasuredWidth() + i2 < i3) {
                        if (((float) (childAt.getMeasuredWidth() + i2)) < e()) {
                        }
                    }
                } else {
                    i2 = (int) childAt.getY();
                    if (childAt.getMeasuredHeight() + i2 < i3) {
                        if (((float) (childAt.getMeasuredHeight() + i2)) < d()) {
                        }
                    }
                }
                view = childAt;
                i3 = i2;
            }
        }
        if (view != null && (childAdapterPosition = this.b.getChildAdapterPosition(view)) != -1) {
            int itemCount = this.d.getItemCount();
            if (childAdapterPosition >= itemCount && itemCount != 0) {
                childAdapterPosition %= itemCount;
            }
            if (this.c.getOrientation() == 0) {
                f2 = e() - view.getX();
                i = view.getMeasuredWidth();
            } else {
                f2 = d() - view.getY();
                i = view.getMeasuredHeight();
            }
            float f3 = f2 / ((float) i);
            if (f3 >= 0.0f && f3 <= 1.0f && childAdapterPosition < itemCount) {
                this.a.d(childAdapterPosition, f3);
            }
        }
    }
}
