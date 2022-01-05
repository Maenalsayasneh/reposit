package i0.h.a.c.e;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* compiled from: BottomAppBar */
public class b extends FloatingActionButton.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ BottomAppBar b;

    /* compiled from: BottomAppBar */
    public class a extends FloatingActionButton.a {
        public a() {
        }

        public void b(FloatingActionButton floatingActionButton) {
            BottomAppBar.w(b.this.b);
        }
    }

    public b(BottomAppBar bottomAppBar, int i) {
        this.b = bottomAppBar;
        this.a = i;
    }

    public void a(FloatingActionButton floatingActionButton) {
        floatingActionButton.setTranslationX(this.b.D(this.a));
        floatingActionButton.o(new a(), true);
    }
}
