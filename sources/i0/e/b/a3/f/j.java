package i0.e.b.a3.f;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.android.core.R;
import com.clubhouse.android.core.databinding.BannerBinding;
import com.clubhouse.android.core.ui.Banner;
import kotlin.NoWhenBranchMatchedException;
import m0.n.b.i;

/* compiled from: MessageBanner.kt */
public final class j implements Banner {
    public b a;
    public Context b;
    public final BannerBinding c;
    public boolean d = true;
    public final ConstraintLayout e;

    public j(b bVar, Context context) {
        i.e(bVar, "bannerHandler");
        i.e(context, "context");
        this.a = bVar;
        this.b = context;
        BannerBinding inflate = BannerBinding.inflate(LayoutInflater.from(context));
        i.d(inflate, "inflate(LayoutInflater.from(context))");
        this.c = inflate;
        ConstraintLayout constraintLayout = inflate.a;
        i.d(constraintLayout, "binding.root");
        this.e = constraintLayout;
    }

    public void a() {
        this.a.c(this);
        if (this.d) {
            this.c.a.postDelayed(new a(this), 3500);
        }
    }

    public boolean b() {
        return this.d;
    }

    public View c() {
        return this.e;
    }

    public final Banner d(int i) {
        BannerBinding bannerBinding = this.c;
        bannerBinding.b.setText(bannerBinding.a.getContext().getString(i));
        return this;
    }

    public void dismiss() {
        this.a.d(this);
    }

    public final Banner e(CharSequence charSequence) {
        this.c.b.setText(charSequence);
        return this;
    }

    public final Banner f(String str, View.OnClickListener onClickListener) {
        this.d = false;
        this.c.c.setVisibility(0);
        this.c.c.setText(str);
        this.c.c.setOnClickListener(onClickListener);
        return this;
    }

    public final Banner g(String str, View.OnClickListener onClickListener) {
        this.d = false;
        this.c.d.setVisibility(0);
        this.c.d.setText(str);
        this.c.d.setOnClickListener(onClickListener);
        return this;
    }

    public final j h(Banner.Style style) {
        int i;
        i.e(style, "style");
        ConstraintLayout constraintLayout = this.c.a;
        int ordinal = style.ordinal();
        if (ordinal == 0) {
            i = R.color.clubhouse_green;
        } else if (ordinal == 1) {
            i = R.color.clubhouse_red;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        constraintLayout.setBackgroundResource(i);
        return this;
    }
}
