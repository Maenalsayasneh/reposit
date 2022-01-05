package i0.j.b.l;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.instabug.bug.Constants$MainReportCategory;
import com.instabug.bug.model.ReportCategory;
import com.instabug.bug.view.reporting.ReportingContainerActivity;
import com.instabug.chat.R;
import com.instabug.library.Instabug;
import com.instabug.library.InstabugCustomTextPlaceHolder;
import com.instabug.library.core.plugin.PluginPromptOption;
import com.instabug.library.invocation.invocationdialog.InstabugDialogActivity;
import com.instabug.library.invocation.invocationdialog.InstabugDialogItem;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.LocaleUtils;
import com.instabug.library.util.PlaceHolderUtils;
import com.pubnub.api.builder.PubNubErrorBuilder;
import i0.j.b.f;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: AskQuestionPromptItem */
public class a extends b {

    /* renamed from: i0.j.b.l.a$a  reason: collision with other inner class name */
    /* compiled from: AskQuestionPromptItem */
    public class C0158a implements PluginPromptOption.OnInvocationListener {
        public final /* synthetic */ Context a;

        public C0158a(Context context) {
            this.a = context;
        }

        public void onInvoke(Uri uri, String... strArr) {
            a aVar = a.this;
            Context context = this.a;
            Objects.requireNonNull(aVar);
            b.d();
            InstabugSDKLogger.d("AskQuestionPromptItem", "Handle invocation ask a question ");
            b.e(uri);
            if (f.g().b != null) {
                f.g().b.d2 = new ArrayList<>();
                f.g().b.d2.add(Constants$MainReportCategory.ASK_QUESTION);
                for (String add : strArr) {
                    f.g().b.d2.add(add);
                }
            }
            b.f();
            context.startActivity(InstabugDialogActivity.getIntent(context, (String) null, (Uri) null, (ArrayList<InstabugDialogItem>) null, true));
            Intent intent = new Intent(context, ReportingContainerActivity.class);
            intent.putExtra("com.instabug.library.process", PubNubErrorBuilder.PNERR_HISTORY_MESSAGE_ACTIONS_MULTIPLE_CHANNELS);
            intent.setFlags(268435456);
            intent.addFlags(65536);
            context.startActivity(intent);
        }
    }

    public PluginPromptOption a(ReportCategory reportCategory, PluginPromptOption pluginPromptOption, String str, int i) {
        PluginPromptOption a = super.a(reportCategory, pluginPromptOption, str, i);
        a.setInvocationMode(3);
        a.setPromptOptionIdentifier(3);
        return a;
    }

    public PluginPromptOption g(Context context) {
        PluginPromptOption pluginPromptOption = new PluginPromptOption();
        pluginPromptOption.setOrder(2);
        pluginPromptOption.setInvocationMode(3);
        pluginPromptOption.setInitialScreenshotRequired(true);
        pluginPromptOption.setIcon(R.drawable.ibg_core_ic_question);
        pluginPromptOption.setPromptOptionIdentifier(3);
        String localeStringResource = LocaleUtils.getLocaleStringResource(Instabug.getLocale(context), com.instabug.library.R.string.askAQuestionHeader, context);
        String placeHolder = PlaceHolderUtils.getPlaceHolder(InstabugCustomTextPlaceHolder.Key.REPORT_QUESTION, localeStringResource);
        if (placeHolder == null || placeHolder.equals(localeStringResource)) {
            placeHolder = PlaceHolderUtils.getPlaceHolder(InstabugCustomTextPlaceHolder.Key.START_CHATS, localeStringResource);
        }
        pluginPromptOption.setTitle(placeHolder);
        pluginPromptOption.setDescription(PlaceHolderUtils.getPlaceHolder(InstabugCustomTextPlaceHolder.Key.REPORT_QUESTION_DESCRIPTION, LocaleUtils.getLocaleStringResource(Instabug.getLocale(context), com.instabug.library.R.string.ib_bug_report_question_description, context)));
        pluginPromptOption.setOnInvocationListener(new C0158a(context));
        pluginPromptOption.setSubOptions(b("ask a question"));
        return pluginPromptOption;
    }
}
