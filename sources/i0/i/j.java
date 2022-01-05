package i0.i;

import android.content.DialogInterface;
import com.hbb20.CountryCodePicker;

/* compiled from: CountryCodeDialog */
public class j implements DialogInterface.OnDismissListener {
    public final /* synthetic */ CountryCodePicker c;

    public j(CountryCodePicker countryCodePicker) {
        this.c = countryCodePicker;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        l.a(l.e);
        if (this.c.getDialogEventsListener() != null) {
            this.c.getDialogEventsListener().a(dialogInterface);
        }
    }
}
