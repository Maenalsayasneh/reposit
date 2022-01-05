package com.clubhouse.wave.ui;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowInsets;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.wave.R;
import com.clubhouse.wave.data.models.local.SentWave;
import com.clubhouse.wave.databinding.WaveBarBinding;
import h0.b0.v;
import h0.i.b.a;
import i0.e.b.d3.k;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.text.StringsKt__IndentKt;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\nR\u0019\u0010\u001b\u001a\u00020\u00168\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/clubhouse/wave/ui/WaveBarView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/view/WindowInsets;", "insets", "onApplyWindowInsets", "(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;", "Landroid/view/View$OnClickListener;", "clickListener", "Lm0/i;", "setExpandClickListener", "(Landroid/view/View$OnClickListener;)V", "", "Lcom/clubhouse/wave/data/models/local/SentWave;", "waves", "setSentWaves", "(Ljava/util/List;)V", "", "visible", "setDividerVisible", "(Z)V", "setDeclineButtonVisible", "setDeclineClickListener", "Lcom/clubhouse/wave/databinding/WaveBarBinding;", "n2", "Lcom/clubhouse/wave/databinding/WaveBarBinding;", "getBinding", "()Lcom/clubhouse/wave/databinding/WaveBarBinding;", "binding", "wave_release"}, k = 1, mv = {1, 5, 1})
/* compiled from: WaveBarView.kt */
public final class WaveBarView extends ConstraintLayout {
    public final WaveBarBinding n2;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WaveBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        i.e(context, "context");
        i.e(context, "context");
        View inflate = LayoutInflater.from(context).inflate(R.layout.wave_bar, this, false);
        addView(inflate);
        WaveBarBinding bind = WaveBarBinding.bind(inflate);
        i.d(bind, "inflate(LayoutInflater.from(context), this, true)");
        this.n2 = bind;
        setClickable(true);
        setClipChildren(false);
        setClipToPadding(false);
    }

    public final WaveBarBinding getBinding() {
        return this.n2;
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        v.W1(this, windowInsets == null ? 0 : windowInsets.getSystemWindowInsetBottom());
        WindowInsets onApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        i.d(onApplyWindowInsets, "super.onApplyWindowInsets(insets)");
        return onApplyWindowInsets;
    }

    public final void setDeclineButtonVisible(boolean z) {
        Button button = this.n2.b;
        i.d(button, "binding.declineButton");
        k.L(button, Boolean.valueOf(z));
    }

    public final void setDeclineClickListener(View.OnClickListener onClickListener) {
        i.e(onClickListener, "clickListener");
        this.n2.b.setOnClickListener(onClickListener);
    }

    public final void setDividerVisible(boolean z) {
        View view = this.n2.c;
        i.d(view, "binding.divider");
        k.L(view, Boolean.valueOf(z));
    }

    public final void setExpandClickListener(View.OnClickListener onClickListener) {
        i.e(onClickListener, "clickListener");
        this.n2.a.setOnClickListener(onClickListener);
    }

    public final void setSentWaves(List<SentWave> list) {
        String str;
        i.e(list, "waves");
        ArrayList arrayList = new ArrayList(h.K(list, 10));
        for (SentWave sentWave : list) {
            arrayList.add(sentWave.c);
        }
        ArrayList arrayList2 = (ArrayList) v.s2(arrayList);
        if (arrayList2.size() == 1) {
            str = getResources().getString(R.string.waved_at_one, new Object[]{arrayList2.get(0)});
        } else if (arrayList2.size() == 2) {
            str = getResources().getString(R.string.waved_at_two, new Object[]{arrayList2.get(0), arrayList2.get(1)});
        } else if (arrayList2.size() == 3) {
            str = getResources().getString(R.string.waved_at_three, new Object[]{arrayList2.get(0), arrayList2.get(1), arrayList2.get(2)});
        } else if (arrayList2.size() > 3) {
            str = getResources().getString(R.string.waved_at_more, new Object[]{arrayList2.get(0), arrayList2.get(1), arrayList2.get(2), Integer.valueOf(arrayList2.size() - 3)});
        } else {
            str = "";
        }
        i.d(str, "when {\n            names.size == 1 -> {\n                resources.getString(R.string.waved_at_one, names[0])\n            }\n            names.size == 2 -> {\n                resources.getString(R.string.waved_at_two, names[0], names[1])\n            }\n            names.size == 3 -> {\n                resources.getString(R.string.waved_at_three, names[0], names[1], names[2])\n            }\n            names.size > 3 -> {\n                resources.getString(\n                    R.string.waved_at_more,\n                    names[0],\n                    names[1],\n                    names[2],\n                    names.size - 3\n                )\n            }\n            else -> {\n                \"\"\n            }\n        }");
        SpannableString spannableString = new SpannableString(str);
        int length = getResources().getString(R.string.waved_at_prefix).length();
        int m = StringsKt__IndentKt.m(spannableString, "*", 0, false, 6);
        TextView textView = this.n2.d;
        spannableString.setSpan(new ForegroundColorSpan(a.getColor(getContext(), R.color.clubhouse_yellow_dark)), 0, length, 33);
        spannableString.setSpan(new ImageSpan(getContext(), R.drawable.wave_thin), m, m + 1, 33);
        textView.setText(spannableString);
    }
}
