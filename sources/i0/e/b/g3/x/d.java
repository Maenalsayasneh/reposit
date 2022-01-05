package i0.e.b.g3.x;

import com.clubhouse.android.ui.selection.Selection;
import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: SelectionViewModel.kt */
public final class d implements c {
    public final Selection a;

    public d(Selection selection) {
        i.e(selection, "selectedItem");
        this.a = selection;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && i.a(this.a, ((d) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("SelectItem(selectedItem=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
