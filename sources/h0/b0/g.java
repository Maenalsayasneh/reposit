package h0.b0;

import android.view.View;
import android.view.ViewGroup;
import androidx.transition.R;

/* compiled from: Scene */
public class g {
    public ViewGroup a;
    public View b;

    public g(ViewGroup viewGroup, View view) {
        this.a = viewGroup;
        this.b = view;
    }

    public static g b(ViewGroup viewGroup) {
        return (g) viewGroup.getTag(R.id.transition_current_scene);
    }

    public void a() {
        if (this.b != null) {
            this.a.removeAllViews();
            this.a.addView(this.b);
        }
        this.a.setTag(R.id.transition_current_scene, this);
    }
}
