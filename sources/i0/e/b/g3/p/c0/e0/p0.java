package i0.e.b.g3.p.c0.e0;

import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import com.clubhouse.android.core.ui.BaseEpoxyModelWithHolder;
import com.clubhouse.android.databinding.FeedLanguagePickerBinding;
import com.clubhouse.app.R;
import i0.e.b.a3.f.d;
import i0.e.b.d3.k;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.text.StringsKt__IndentKt;
import m0.n.b.i;

/* compiled from: LanguagePicker.kt */
public abstract class p0 extends BaseEpoxyModelWithHolder<a> {
    public String j = "";
    public String k = "";
    public String l = "";
    public View.OnClickListener m;
    public View.OnClickListener n;

    /* compiled from: LanguagePicker.kt */
    public static final class a extends d {
        public FeedLanguagePickerBinding b;

        public void a(View view) {
            i.e(view, "itemView");
            FeedLanguagePickerBinding bind = FeedLanguagePickerBinding.bind(view);
            i.d(bind, "bind(itemView)");
            i.e(bind, "<set-?>");
            this.b = bind;
        }

        public final FeedLanguagePickerBinding b() {
            FeedLanguagePickerBinding feedLanguagePickerBinding = this.b;
            if (feedLanguagePickerBinding != null) {
                return feedLanguagePickerBinding;
            }
            i.m("binding");
            throw null;
        }
    }

    /* renamed from: K */
    public void k(a aVar) {
        i.e(aVar, "holder");
        aVar.b().c.setText(this.j);
        TextView textView = aVar.b().c;
        i.d(textView, "holder.binding.languagePickerTitle");
        i.e(textView, "<this>");
        i.e("**", "startTarget");
        i.e("**", "endTarget");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            CharSequence text = textView.getText();
            i.d(text, NotificationCompat.MessagingStyle.Message.KEY_TEXT);
            int m2 = StringsKt__IndentKt.m(text, "**", i - 2, false, 4);
            CharSequence text2 = textView.getText();
            i.d(text2, NotificationCompat.MessagingStyle.Message.KEY_TEXT);
            int i2 = m2 + 2;
            int m3 = StringsKt__IndentKt.m(text2, "**", i2, false, 4);
            if (m2 < 0 || m3 < 0) {
                Iterator it = arrayList.iterator();
            } else {
                int i3 = m3 + 2;
                if (i3 > m2) {
                    CharSequence text3 = textView.getText();
                    i.d(text3, NotificationCompat.MessagingStyle.Message.KEY_TEXT);
                    SpannableString valueOf = SpannableString.valueOf(text3);
                    i.d(valueOf, "SpannableString.valueOf(this)");
                    CharSequence text4 = textView.getText();
                    i.d(text4, NotificationCompat.MessagingStyle.Message.KEY_TEXT);
                    int i4 = i3 - 2;
                    String obj = text4.subSequence(i2, i4).toString();
                    i.e(valueOf, "$this$replaceRange");
                    i.e(obj, "replacement");
                    if (i3 >= m2) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(valueOf, 0, m2);
                        i.d(sb, "this.append(value, startIndex, endIndex)");
                        sb.append(obj);
                        sb.append(valueOf, i3, valueOf.length());
                        i.d(sb, "this.append(value, startIndex, endIndex)");
                        textView.setText(sb);
                        arrayList.add(new Pair(Integer.valueOf(m2), Integer.valueOf(i4 - 2)));
                    } else {
                        throw new IndexOutOfBoundsException(i0.d.a.a.a.j0("End index (", i3, ") is less than start index (", m2, ")."));
                    }
                }
                i = i3;
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Pair pair = (Pair) it2.next();
            CharSequence text5 = textView.getText();
            i.d(text5, NotificationCompat.MessagingStyle.Message.KEY_TEXT);
            Context context = textView.getContext();
            i.d(context, "context");
            textView.setText(k.w(text5, context, ((Number) pair.c).intValue(), ((Number) pair.d).intValue()));
        }
        aVar.b().b.setText(this.k);
        aVar.b().a.setText(this.l);
        aVar.b().b.setOnClickListener(this.m);
        aVar.b().a.setOnClickListener(this.n);
    }

    public int o() {
        return R.layout.feed_language_picker;
    }
}
