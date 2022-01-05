package i0.e.b.g3.r;

import android.view.View;
import com.clubhouse.android.ui.onboarding.AddPhotoFragment;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ AddPhotoFragment c;

    public /* synthetic */ a(AddPhotoFragment addPhotoFragment) {
        this.c = addPhotoFragment;
    }

    public final void onClick(View view) {
        AddPhotoFragment addPhotoFragment = this.c;
        k<Object>[] kVarArr = AddPhotoFragment.e2;
        i.e(addPhotoFragment, "this$0");
        addPhotoFragment.finish();
    }
}
