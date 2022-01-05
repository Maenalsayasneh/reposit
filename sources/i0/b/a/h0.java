package i0.b.a;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: NotifyBlocker */
public class h0 extends RecyclerView.h {
    public boolean a;

    public void a() {
        if (!this.a) {
            throw new IllegalStateException("You cannot notify item changes directly. Call `requestModelBuild` instead.");
        }
    }

    public void b(int i, int i2) {
        a();
    }

    public void c(int i, int i2, Object obj) {
        a();
    }

    public void d(int i, int i2) {
        a();
    }

    public void e(int i, int i2, int i3) {
        a();
    }

    public void f(int i, int i2) {
        a();
    }
}
