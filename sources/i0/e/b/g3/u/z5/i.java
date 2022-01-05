package i0.e.b.g3.u.z5;

import android.view.View;
import com.clubhouse.android.data.models.local.Language;
import com.clubhouse.android.ui.profile.settings.LanguagesFragment;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class i implements View.OnClickListener {
    public final /* synthetic */ LanguagesFragment c;
    public final /* synthetic */ Language d;

    public /* synthetic */ i(LanguagesFragment languagesFragment, Language language) {
        this.c = languagesFragment;
        this.d = language;
    }

    public final void onClick(View view) {
        LanguagesFragment languagesFragment = this.c;
        Language language = this.d;
        m0.n.b.i.e(languagesFragment, "this$0");
        m0.n.b.i.e(language, "$language");
        k<Object>[] kVarArr = LanguagesFragment.Z1;
        languagesFragment.O0().p(new v1(language, !language.x));
    }
}
