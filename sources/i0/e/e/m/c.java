package i0.e.e.m;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.android.core.ui.Banner;
import com.clubhouse.wave.R;
import com.clubhouse.wave.databinding.WaveBannerBinding;
import i0.e.b.a3.f.b;
import i0.e.b.d3.k;
import m0.n.b.i;

/* compiled from: WaveBanner.kt */
public final class c implements Banner {
    public b a;
    public Context b;
    public final WaveBannerBinding c;
    public final ConstraintLayout d;

    public c(b bVar, Context context) {
        i.e(bVar, "bannerHandler");
        i.e(context, "context");
        this.a = bVar;
        this.b = context;
        WaveBannerBinding inflate = WaveBannerBinding.inflate(LayoutInflater.from(context));
        i.d(inflate, "inflate(LayoutInflater.from(context))");
        this.c = inflate;
        ConstraintLayout constraintLayout = inflate.a;
        i.d(constraintLayout, "binding.root");
        this.d = constraintLayout;
    }

    public void a() {
        this.a.c(this);
    }

    public boolean b() {
        return false;
    }

    public View c() {
        return this.d;
    }

    public final Banner d(String str) {
        i.e(str, "name");
        String string = this.d.getResources().getString(R.string.waved_at_you_banner, new Object[]{str});
        i.d(string, "rootView.resources.getString(R.string.waved_at_you_banner, name)");
        Context context = this.d.getContext();
        i.d(context, "rootView.context");
        SpannableString x = k.x(string, str, context);
        x.setSpan(new ImageSpan(this.b, R.drawable.ic_hand_wave_emoji), 0, 1, 33);
        this.c.c.setText(x);
        return this;
    }

    public void dismiss() {
        this.a.d(this);
    }
}
