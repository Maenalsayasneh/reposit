package i0.e.b.f3.o;

import android.view.View;
import com.clubhouse.wave.WaveCoordinatorViewModel;
import i0.e.e.a;
import i0.e.e.m.c;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ c c;
    public final /* synthetic */ WaveCoordinatorViewModel d;
    public final /* synthetic */ int q;
    public final /* synthetic */ String x;

    public /* synthetic */ b(c cVar, WaveCoordinatorViewModel waveCoordinatorViewModel, int i, String str) {
        this.c = cVar;
        this.d = waveCoordinatorViewModel;
        this.q = i;
        this.x = str;
    }

    public final void onClick(View view) {
        c cVar = this.c;
        WaveCoordinatorViewModel waveCoordinatorViewModel = this.d;
        int i = this.q;
        String str = this.x;
        i.e(cVar, "$this_apply");
        i.e(waveCoordinatorViewModel, "$viewModel");
        i.e(str, "$waveId");
        cVar.a.d(cVar);
        waveCoordinatorViewModel.p(new a(i, str));
    }
}
