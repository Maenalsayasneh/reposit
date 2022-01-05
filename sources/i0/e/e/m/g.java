package i0.e.e.m;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.android.user.model.User;
import com.clubhouse.wave.R;
import com.clubhouse.wave.databinding.WaveNuxUpsellBinding;
import h0.b.a.d;
import i0.e.b.d3.k;
import m0.i;
import m0.n.a.a;

/* compiled from: WaveNavigation.kt */
public final class g {
    public static final g a = new g();

    public final void a(Fragment fragment, User user, a<i> aVar) {
        m0.n.b.i.e(fragment, "<this>");
        i iVar = null;
        View inflate = fragment.getLayoutInflater().inflate(R.layout.wave_nux_upsell, (ViewGroup) null);
        WaveNuxUpsellBinding bind = WaveNuxUpsellBinding.bind(inflate);
        m0.n.b.i.d(bind, "bind(upsellView)");
        if (user != null) {
            AvatarView avatarView = bind.a;
            m0.n.b.i.d(avatarView, "upsellBinding.avatar");
            k.u(avatarView, user);
            AvatarView avatarView2 = bind.a;
            m0.n.b.i.d(avatarView2, "upsellBinding.avatar");
            k.K(avatarView2);
            TextView textView = bind.e;
            m0.n.b.i.d(textView, "upsellBinding.singleWave");
            k.K(textView);
            TextView textView2 = bind.f;
            m0.n.b.i.d(textView2, "upsellBinding.someWave");
            k.p(textView2);
            bind.g.setText(fragment.getString(R.string.wave_at_if, user.F()));
            bind.b.setText(fragment.getString(R.string.if_they_reply_we_start));
            bind.c.setText(fragment.getString(R.string.ok_wave_at, user.F()));
            iVar = i.a;
        }
        if (iVar == null) {
            AvatarView avatarView3 = bind.a;
            m0.n.b.i.d(avatarView3, "upsellBinding.avatar");
            k.p(avatarView3);
            TextView textView3 = bind.e;
            m0.n.b.i.d(textView3, "upsellBinding.singleWave");
            k.p(textView3);
            TextView textView4 = bind.f;
            m0.n.b.i.d(textView4, "upsellBinding.someWave");
            k.K(textView4);
            bind.g.setText(fragment.getString(R.string.wave_at_if, fragment.getString(R.string.friends)));
            bind.b.setText(fragment.getString(R.string.if_people_reply_we_start));
            bind.c.setText(fragment.getString(R.string.ok_lets_give_it));
        }
        d.a aVar2 = new d.a(fragment.requireContext(), R.style.Clubhouse_AlertDialog_Rounded);
        aVar2.f(inflate);
        aVar2.a.k = true;
        d a2 = aVar2.a();
        m0.n.b.i.d(a2, "Builder(requireContext(), R.style.Clubhouse_AlertDialog_Rounded).apply {\n                setView(upsellView)\n                setCancelable(true)\n            }.create()");
        bind.c.setOnClickListener(new b(aVar, a2));
        bind.d.setOnClickListener(new a(a2));
        a2.show();
    }
}
