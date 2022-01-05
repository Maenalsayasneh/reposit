package i0.j.f.s.g.k;

import android.widget.EditText;

/* compiled from: TextQuestionFragment */
public class a implements Runnable {
    public final /* synthetic */ com.instabug.survey.ui.i.l.a c;

    public a(com.instabug.survey.ui.i.l.a aVar) {
        this.c = aVar;
    }

    public void run() {
        com.instabug.survey.ui.i.l.a aVar = this.c;
        EditText editText = aVar.b2;
        if (editText != null) {
            editText.addTextChangedListener(aVar);
        }
    }
}
