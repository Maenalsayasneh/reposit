package i0.j.c.h;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.instabug.chat.R;
import com.instabug.library.Instabug;
import com.instabug.library.InstabugColorTheme;
import com.instabug.library.InstabugCustomTextPlaceHolder;
import com.instabug.library.ui.custom.CircularImageView;
import com.instabug.library.util.LocaleUtils;
import com.instabug.library.util.PlaceHolderUtils;
import i0.j.c.f.b;

/* compiled from: NotificationBarInvoker */
public class j implements Runnable {
    public final /* synthetic */ Activity c;
    public final /* synthetic */ CircularImageView d;
    public final /* synthetic */ b q;
    public final /* synthetic */ a x;

    public j(a aVar, Activity activity, CircularImageView circularImageView, b bVar) {
        this.x = aVar;
        this.c = activity;
        this.d = circularImageView;
        this.q = bVar;
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public void run() {
        a aVar = this.x;
        InstabugColorTheme theme = Instabug.getTheme();
        View findViewById = aVar.a.findViewById(R.id.instabug_notification_layout);
        View view = aVar.a;
        int i = R.id.replyButton;
        Button button = (Button) view.findViewById(i);
        View view2 = aVar.a;
        int i2 = R.id.dismissButton;
        Button button2 = (Button) view2.findViewById(i2);
        View view3 = aVar.a;
        int i3 = R.id.senderNameTextView;
        TextView textView = (TextView) view3.findViewById(i3);
        View view4 = aVar.a;
        int i4 = R.id.senderMessageTextView;
        TextView textView2 = (TextView) view4.findViewById(i4);
        button.getBackground().setColorFilter(Instabug.getPrimaryColor(), PorterDuff.Mode.MULTIPLY);
        button2.getBackground().setColorFilter(-1, PorterDuff.Mode.MULTIPLY);
        button.setTextColor(-1);
        if (theme == InstabugColorTheme.InstabugColorThemeLight) {
            findViewById.setBackgroundColor(-1);
            textView.setTextColor(-11908534);
            textView2.setTextColor(-7697777);
        } else {
            findViewById.setBackgroundColor(-12434878);
            textView.setTextColor(-1);
            textView2.setTextColor(-2631721);
        }
        button2.setTextColor(-6579301);
        Button button3 = (Button) this.x.a.findViewById(i);
        Button button4 = (Button) this.x.a.findViewById(i2);
        String placeHolder = PlaceHolderUtils.getPlaceHolder(InstabugCustomTextPlaceHolder.Key.REPLIES_NOTIFICATION_REPLY_BUTTON, LocaleUtils.getLocaleStringResource(Instabug.getLocale(this.c), R.string.instabug_str_reply, this.c));
        if (button3 != null) {
            button3.setText(placeHolder);
        }
        String placeHolder2 = PlaceHolderUtils.getPlaceHolder(InstabugCustomTextPlaceHolder.Key.REPLIES_NOTIFICATION_DISMISS_BUTTON, LocaleUtils.getLocaleStringResource(Instabug.getLocale(this.c), R.string.instabug_str_dismiss, this.c));
        if (button4 != null) {
            button4.setText(placeHolder2);
        }
        this.d.setBackgroundResource(R.drawable.ibg_core_ic_avatar);
        TextView textView3 = (TextView) this.x.a.findViewById(i3);
        TextView textView4 = (TextView) this.x.a.findViewById(i4);
        String str = this.q.b;
        if (str != null) {
            textView3.setText(str);
        }
        String str2 = this.q.a;
        if (str2 != null) {
            textView4.setText(str2);
        }
    }
}
