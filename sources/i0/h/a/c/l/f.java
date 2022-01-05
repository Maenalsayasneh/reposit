package i0.h.a.c.l;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.MaterialCalendar;

/* compiled from: MaterialCalendar */
public class f extends RecyclerView.s {
    public final /* synthetic */ o a;
    public final /* synthetic */ MaterialButton b;
    public final /* synthetic */ MaterialCalendar c;

    public f(MaterialCalendar materialCalendar, o oVar, MaterialButton materialButton) {
        this.c = materialCalendar;
        this.a = oVar;
        this.b = materialButton;
    }

    public void a(RecyclerView recyclerView, int i) {
        if (i == 0) {
            recyclerView.announceForAccessibility(this.b.getText());
        }
    }

    public void c(RecyclerView recyclerView, int i, int i2) {
        int i3;
        if (i < 0) {
            i3 = this.c.J0().findFirstVisibleItemPosition();
        } else {
            i3 = this.c.J0().findLastVisibleItemPosition();
        }
        this.c.Y1 = this.a.b(i3);
        MaterialButton materialButton = this.b;
        o oVar = this.a;
        materialButton.setText(oVar.b.c.s(i3).r(oVar.a));
    }
}
