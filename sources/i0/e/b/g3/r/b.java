package i0.e.b.g3.r;

import android.view.View;
import com.clubhouse.android.ui.onboarding.AddPhotoFragment;
import com.clubhouse.android.ui.onboarding.AddPhotoViewModel$savePhoto$1;
import java.util.Objects;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ AddPhotoFragment c;

    public /* synthetic */ b(AddPhotoFragment addPhotoFragment) {
        this.c = addPhotoFragment;
    }

    public final void onClick(View view) {
        AddPhotoFragment addPhotoFragment = this.c;
        k<Object>[] kVarArr = AddPhotoFragment.e2;
        i.e(addPhotoFragment, "this$0");
        j0 S0 = addPhotoFragment.S0();
        Objects.requireNonNull(S0);
        S0.n(new AddPhotoViewModel$savePhoto$1(S0));
        addPhotoFragment.finish();
    }
}
