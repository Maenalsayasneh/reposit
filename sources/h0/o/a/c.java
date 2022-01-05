package h0.o.a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.SpecialEffectsController;
import h0.o.a.b;

/* compiled from: DefaultSpecialEffectsController */
public class c extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ View b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ SpecialEffectsController.Operation d;
    public final /* synthetic */ b.C0060b e;

    public c(b bVar, ViewGroup viewGroup, View view, boolean z, SpecialEffectsController.Operation operation, b.C0060b bVar2) {
        this.a = viewGroup;
        this.b = view;
        this.c = z;
        this.d = operation;
        this.e = bVar2;
    }

    public void onAnimationEnd(Animator animator) {
        this.a.endViewTransition(this.b);
        if (this.c) {
            this.d.a.applyState(this.b);
        }
        this.e.a();
    }
}
