package i0.j.e.b;

import android.view.View;
import com.instabug.library.annotation.AnnotationLayout;
import com.instabug.library.annotation.AnnotationView;
import com.instabug.library.annotation.ShapeSuggestionsLayout;
import com.instabug.library.annotation.b;
import com.instabug.library.annotation.f.g;

/* compiled from: ShapeSuggestionsLayout */
public class a implements View.OnClickListener {
    public final /* synthetic */ ShapeSuggestionsLayout c;

    public a(ShapeSuggestionsLayout shapeSuggestionsLayout) {
        this.c = shapeSuggestionsLayout;
    }

    public void onClick(View view) {
        g gVar;
        b bVar;
        int indexOfChild = this.c.indexOfChild(view);
        ShapeSuggestionsLayout shapeSuggestionsLayout = this.c;
        int i = ShapeSuggestionsLayout.c;
        shapeSuggestionsLayout.b(indexOfChild);
        ShapeSuggestionsLayout.c cVar = this.c.q;
        if (cVar != null) {
            AnnotationLayout.a aVar = (AnnotationLayout.a) cVar;
            if (indexOfChild == 1) {
                AnnotationView access$000 = AnnotationLayout.this.annotationView;
                synchronized (access$000) {
                    if (!(AnnotationView.c == null || (gVar = access$000.w2) == null || (bVar = access$000.x2) == null)) {
                        access$000.f(gVar, bVar);
                        access$000.invalidate();
                    }
                }
            }
        }
        this.c.a();
    }
}
