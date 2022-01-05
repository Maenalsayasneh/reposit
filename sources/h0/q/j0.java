package h0.q;

/* compiled from: Transformations */
public class j0 implements z<X> {
    public boolean a = true;
    public final /* synthetic */ w b;

    public j0(w wVar) {
        this.b = wVar;
    }

    public void onChanged(X x) {
        Object value = this.b.getValue();
        if (this.a || ((value == null && x != null) || (value != null && !value.equals(x)))) {
            this.a = false;
            this.b.setValue(x);
        }
    }
}
