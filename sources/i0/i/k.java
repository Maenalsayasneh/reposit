package i0.i;

import android.content.DialogInterface;
import com.hbb20.CountryCodePicker;

/* compiled from: CountryCodeDialog */
public class k implements DialogInterface.OnCancelListener {
    public final /* synthetic */ CountryCodePicker c;

    public k(CountryCodePicker countryCodePicker) {
        this.c = countryCodePicker;
    }

    public void onCancel(DialogInterface dialogInterface) {
        l.a(l.e);
        if (this.c.getDialogEventsListener() != null) {
            this.c.getDialogEventsListener().c(dialogInterface);
        }
    }
}
