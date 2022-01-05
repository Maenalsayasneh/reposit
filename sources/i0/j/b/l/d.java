package i0.j.b.l;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.instabug.bug.Constants$MainReportCategory;
import com.instabug.bug.R;
import com.instabug.bug.model.ReportCategory;
import com.instabug.bug.view.reporting.ReportingContainerActivity;
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

/* compiled from: FeedbackPromptItem */
public class d extends b {

    /* compiled from: FeedbackPromptItem */
    public class a implements PluginPromptOption.OnInvocationListener {
        public final /* synthetic */ Context a;

        public a(Context context) {
            this.a = context;
        }

        public void onInvoke(Uri uri, String... strArr) {
            d dVar = d.this;
            Context context = this.a;
            Objects.requireNonNull(dVar);
            b.d();
            InstabugSDKLogger.d("FeedbackPromptItem", "Handle invocation request new feedback");
            b.e(uri);
            if (f.g().b != null) {
                f.g().b.d2 = new ArrayList<>();
                f.g().b.d2.add(Constants$MainReportCategory.FEEDBACK);
                for (String add : strArr) {
                    f.g().b.d2.add(add);
                }
            }
            b.f();
            context.startActivity(InstabugDialogActivity.getIntent(context, (String) null, (Uri) null, (ArrayList<InstabugDialogItem>) null, true));
            Intent intent = new Intent(context, ReportingContainerActivity.class);
            intent.putExtra("com.instabug.library.process", PubNubErrorBuilder.PNERR_MESSAGE_TIMETOKEN_MISSING);
            intent.setFlags(268435456);
            intent.addFlags(65536);
            context.startActivity(intent);
        }
    }

    public PluginPromptOption a(ReportCategory reportCategory, PluginPromptOption pluginPromptOption, String str, int i) {
        PluginPromptOption a2 = super.a(reportCategory, pluginPromptOption, str, i);
        a2.setInvocationMode(2);
        a2.setPromptOptionIdentifier(1);
        return a2;
    }

    public PluginPromptOption g(Context context) {
        PluginPromptOption pluginPromptOption = new PluginPromptOption();
        pluginPromptOption.setOrder(1);
        pluginPromptOption.setInvocationMode(2);
        pluginPromptOption.setPromptOptionIdentifier(1);
        pluginPromptOption.setIcon(R.drawable.ibg_core_ic_suggest_improvment);
        pluginPromptOption.setTitle(PlaceHolderUtils.getPlaceHolder(InstabugCustomTextPlaceHolder.Key.REPORT_FEEDBACK, LocaleUtils.getLocaleStringResource(Instabug.getLocale(context), R.string.instabug_str_feedback_header, context)));
        pluginPromptOption.setDescription(PlaceHolderUtils.getPlaceHolder(InstabugCustomTextPlaceHolder.Key.REPORT_FEEDBACK_DESCRIPTION, LocaleUtils.getLocaleStringResource(Instabug.getLocale(context), R.string.ib_bug_report_feedback_description, context)));
        pluginPromptOption.setOnInvocationListener(new a(context));
        pluginPromptOption.setInitialScreenshotRequired(true);
        pluginPromptOption.setSubOptions(b("feedback"));
        return pluginPromptOption;
    }
}
