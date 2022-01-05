package i0.j.f.s.f;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.widget.AppCompatImageView;
import com.instabug.library.Feature;
import com.instabug.library.Instabug;
import com.instabug.library.InstabugColorTheme;
import com.instabug.library.core.InstabugCore;
import com.instabug.survey.R;
import h0.b.a.d;
import i0.j.e.c1.b;
import java.lang.ref.WeakReference;

/* compiled from: CustomQuestionDialog */
public class e {
    public final WeakReference<Activity> a;
    public String b;
    public int c;
    public String d;
    public String e;
    public f f;

    public e(Activity activity) {
        this.a = new WeakReference<>(activity);
    }

    public void a() {
        Activity activity = (Activity) this.a.get();
        if (activity != null) {
            int i = this.c;
            String str = this.b;
            String str2 = this.e;
            String str3 = this.d;
            f fVar = this.f;
            d a2 = new d.a(activity, 16973840).a();
            View inflate = activity.getLayoutInflater().inflate(i, (ViewGroup) null);
            AlertController alertController = a2.q;
            alertController.h = inflate;
            alertController.i = 0;
            alertController.n = false;
            a2.setCancelable(false);
            TextView textView = (TextView) inflate.findViewById(R.id.instabug_text_view_question);
            Button button = (Button) inflate.findViewById(R.id.ib_survey_btn_yes);
            Button button2 = (Button) inflate.findViewById(R.id.ib_survey_btn_no);
            AppCompatImageView appCompatImageView = (AppCompatImageView) inflate.findViewById(R.id.ib_survey_custom_dialog_illustration);
            int i2 = R.id.survey_partial_close_btn;
            InstabugColorTheme theme = Instabug.getTheme();
            InstabugColorTheme instabugColorTheme = InstabugColorTheme.InstabugColorThemeLight;
            ImageView imageView = (ImageView) inflate.findViewById(i2);
            if (theme == instabugColorTheme) {
                button.setTextColor(-1);
                button2.setTextColor(-16777216);
                button.setBackgroundColor(-16777216);
                button2.setBackgroundResource(R.drawable.ib_survey_bg_apprating_negative);
                if (appCompatImageView != null) {
                    appCompatImageView.setImageResource(R.drawable.ib_ic_survey_apprating_light);
                }
            } else {
                button.setTextColor(-16777216);
                button2.setTextColor(-1);
                button.setBackgroundColor(-1);
                button2.setBackgroundResource(R.drawable.ib_survey_bg_apprating_negative_dark);
                if (appCompatImageView != null) {
                    appCompatImageView.setImageResource(R.drawable.ib_ic_survey_apprating_dark);
                }
            }
            textView.setText(str);
            button.setText(str2);
            button2.setText(str3);
            ImageView imageView2 = (ImageView) inflate.findViewById(i2);
            if (imageView2 != null) {
                imageView2.setOnClickListener(new d(activity));
            }
            button.setOnClickListener(new a(a2, fVar));
            button2.setOnClickListener(new b(a2, fVar));
            if (imageView != null) {
                imageView.setOnClickListener(new c(fVar));
            }
            if (InstabugCore.getFeatureState(Feature.WHITE_LABELING) == Feature.State.ENABLED) {
                b.k(inflate);
            } else {
                b.j(activity, inflate);
            }
            a2.show();
        }
    }
}
