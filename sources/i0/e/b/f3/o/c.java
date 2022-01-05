package i0.e.b.f3.o;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.di.FragmentKeyKt$addFragment$2$1;
import com.clubhouse.android.di.FragmentName;
import com.clubhouse.android.shared.wave.WaveCoordinator;
import com.clubhouse.android.ui.backchannel.CreateChatArgs;
import h0.b0.v;
import h0.o.a.k;
import i0.j.f.p.h;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class c implements View.OnClickListener {
    public final /* synthetic */ i0.e.e.m.c c;
    public final /* synthetic */ WaveCoordinator d;
    public final /* synthetic */ int q;

    public /* synthetic */ c(i0.e.e.m.c cVar, WaveCoordinator waveCoordinator, int i) {
        this.c = cVar;
        this.d = waveCoordinator;
        this.q = i;
    }

    public final void onClick(View view) {
        i0.e.e.m.c cVar = this.c;
        WaveCoordinator waveCoordinator = this.d;
        int i = this.q;
        i.e(cVar, "$this_apply");
        i.e(waveCoordinator, "this$0");
        cVar.a.d(cVar);
        k kVar = waveCoordinator.a;
        CreateChatArgs createChatArgs = new CreateChatArgs(SourceLocation.IN_APP_TOAST, Integer.valueOf(i));
        i.e(kVar, "<this>");
        FragmentName fragmentName = FragmentName.BACKCHANNEL_INBOX;
        i.e(kVar, "<this>");
        i.e(fragmentName, "fragmentName");
        Object K0 = h.K0(kVar.getApplicationContext(), i0.e.b.c3.c.class);
        i.d(K0, "fromApplication(\n        applicationContext,\n        FragmentKeysEntryPoint::class.java\n    )");
        Class<? extends Fragment> h02 = v.h0((i0.e.b.c3.c) K0, fragmentName);
        FragmentManager supportFragmentManager = kVar.getSupportFragmentManager();
        i.d(supportFragmentManager, "supportFragmentManager");
        v.E(kVar, supportFragmentManager, new FragmentKeyKt$addFragment$2$1(h02, createChatArgs));
    }
}
