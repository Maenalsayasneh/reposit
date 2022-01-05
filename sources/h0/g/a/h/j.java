package h0.g.a.h;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import h0.g.a.c;
import java.util.ArrayList;

/* compiled from: WidgetContainer */
public class j extends ConstraintWidget {
    public ArrayList<ConstraintWidget> M0 = new ArrayList<>();

    public void I() {
        this.M0.clear();
        super.I();
    }

    public void L(c cVar) {
        super.L(cVar);
        int size = this.M0.size();
        for (int i = 0; i < size; i++) {
            this.M0.get(i).L(cVar);
        }
    }

    public void X() {
        ArrayList<ConstraintWidget> arrayList = this.M0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ConstraintWidget constraintWidget = this.M0.get(i);
                if (constraintWidget instanceof j) {
                    ((j) constraintWidget).X();
                }
            }
        }
    }
}
