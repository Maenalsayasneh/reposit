package i0.e.b.g3.r.b3;

import android.view.View;
import androidx.emoji.widget.EmojiButton;
import i0.e.b.g3.r.b3.e;
import m0.n.a.a;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ e.a c;
    public final /* synthetic */ e d;

    public /* synthetic */ b(e.a aVar, e eVar) {
        this.c = aVar;
        this.d = eVar;
    }

    public final void onClick(View view) {
        e.a aVar = this.c;
        e eVar = this.d;
        i.e(aVar, "$holder");
        i.e(eVar, "this$0");
        boolean z = true;
        if (!aVar.b().a.isSelected()) {
            EmojiButton emojiButton = aVar.b().a;
            a<Boolean> aVar2 = eVar.l;
            if (aVar2 == null || !aVar2.invoke().booleanValue()) {
                z = false;
            }
            emojiButton.setSelected(z);
            return;
        }
        a<m0.i> aVar3 = eVar.m;
        if (aVar3 != null) {
            aVar3.invoke();
        }
        aVar.b().a.setSelected(false);
    }
}
