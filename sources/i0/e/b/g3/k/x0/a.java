package i0.e.b.g3.k.x0;

import android.view.View;
import android.widget.ImageView;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ ImageView c;

    public /* synthetic */ a(ImageView imageView) {
        this.c = imageView;
    }

    public final void onClick(View view) {
        ImageView imageView = this.c;
        i.e(imageView, "$this_apply");
        imageView.performLongClick();
    }
}
