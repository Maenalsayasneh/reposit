package com.clubhouse.android.ui.onboarding;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.clubhouse.app.R;
import h0.i.b.a;
import i0.b.b.e;
import i0.e.b.d3.k;
import i0.e.b.g3.r.w0;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.j.g;
import m0.n.a.l;

/* compiled from: CollectUsernameWithSuggestionsFragment.kt */
public final class CollectUsernameWithSuggestionsFragment$invalidate$1 extends Lambda implements l<w0, i> {
    public final /* synthetic */ CollectUsernameWithSuggestionsFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollectUsernameWithSuggestionsFragment$invalidate$1(CollectUsernameWithSuggestionsFragment collectUsernameWithSuggestionsFragment) {
        super(1);
        this.c = collectUsernameWithSuggestionsFragment;
    }

    public Object invoke(Object obj) {
        w0 w0Var = (w0) obj;
        m0.n.b.i.e(w0Var, "state");
        Button button = this.c.N0().e;
        m0.n.b.i.d(button, "binding.nextButton");
        k.k(button, Boolean.valueOf(this.c.N0().h.length() > 1));
        ProgressBar progressBar = this.c.N0().d;
        m0.n.b.i.d(progressBar, "binding.loading");
        k.L(progressBar, Boolean.valueOf(w0Var.f));
        FrameLayout frameLayout = this.c.N0().c;
        m0.n.b.i.d(frameLayout, "binding.fullscreenLoading");
        k.L(frameLayout, Boolean.valueOf(w0Var.g instanceof e));
        TextView textView = this.c.N0().b;
        m0.n.b.i.d(textView, "binding.defaultSuggestion");
        k.L(textView, Boolean.valueOf(!w0Var.e));
        Button button2 = this.c.N0().a;
        m0.n.b.i.d(button2, "binding.changeUsernameButton");
        k.L(button2, Boolean.valueOf(!w0Var.e));
        TextView textView2 = this.c.N0().g;
        m0.n.b.i.d(textView2, "binding.titleHint");
        k.L(textView2, Boolean.valueOf(w0Var.e));
        EditText editText = this.c.N0().h;
        m0.n.b.i.d(editText, "binding.username");
        k.L(editText, Boolean.valueOf(w0Var.e));
        TextView textView3 = this.c.N0().f;
        m0.n.b.i.d(textView3, "binding.suggestions");
        k.L(textView3, Boolean.valueOf(w0Var.e && w0Var.h));
        CollectUsernameWithSuggestionsFragment collectUsernameWithSuggestionsFragment = this.c;
        Objects.requireNonNull(collectUsernameWithSuggestionsFragment);
        List<String> list = w0Var.d;
        ArrayList arrayList = new ArrayList(h.K(list, 10));
        for (String str : list) {
            Context requireContext = collectUsernameWithSuggestionsFragment.requireContext();
            m0.n.b.i.d(requireContext, "requireContext()");
            int length = str.length();
            m0.n.b.i.e(str, "<this>");
            m0.n.b.i.e(requireContext, "context");
            new SpannableString(str).setSpan(new ForegroundColorSpan(a.getColor(requireContext, R.color.clubhouse_blue)), 0, length, 33);
            CollectUsernameWithSuggestionsFragment$updateUsernameSuggestions$formattedSuggestions$1$1 collectUsernameWithSuggestionsFragment$updateUsernameSuggestions$formattedSuggestions$1$1 = new CollectUsernameWithSuggestionsFragment$updateUsernameSuggestions$formattedSuggestions$1$1(collectUsernameWithSuggestionsFragment, str);
            int length2 = str.length();
            m0.n.b.i.e(str, "<this>");
            m0.n.b.i.e(collectUsernameWithSuggestionsFragment$updateUsernameSuggestions$formattedSuggestions$1$1, "clickAction");
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new i0.e.b.d3.l(collectUsernameWithSuggestionsFragment$updateUsernameSuggestions$formattedSuggestions$1$1), 0, length2, 33);
            arrayList.add(spannableString);
        }
        String string = collectUsernameWithSuggestionsFragment.getResources().getString(R.string.username_suggestions);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        g.C(arrayList, spannableStringBuilder, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 126);
        CharSequence expandTemplate = TextUtils.expandTemplate(string, new CharSequence[]{spannableStringBuilder});
        TextView textView4 = collectUsernameWithSuggestionsFragment.N0().f;
        textView4.setText(expandTemplate);
        textView4.setMovementMethod(LinkMovementMethod.getInstance());
        String str2 = w0Var.c;
        if (str2 == null) {
            return null;
        }
        CollectUsernameWithSuggestionsFragment collectUsernameWithSuggestionsFragment2 = this.c;
        collectUsernameWithSuggestionsFragment2.N0().b.setText(collectUsernameWithSuggestionsFragment2.getString(R.string.username, str2));
        collectUsernameWithSuggestionsFragment2.N0().h.setText(collectUsernameWithSuggestionsFragment2.getString(R.string.username, str2));
        collectUsernameWithSuggestionsFragment2.N0().h.setSelection(collectUsernameWithSuggestionsFragment2.N0().h.length());
        return i.a;
    }
}
