package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import i0.h.a.c.l.p;
import java.util.Iterator;

public final class MaterialTextInputPicker<S> extends PickerFragment<S> {
    public int d;
    public DateSelector<S> q;
    public CalendarConstraints x;

    public class a extends p<S> {
        public a() {
        }

        public void a(S s) {
            Iterator it = MaterialTextInputPicker.this.c.iterator();
            while (it.hasNext()) {
                ((p) it.next()).a(s);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.d = bundle.getInt("THEME_RES_ID_KEY");
        this.q = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.x = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.q.N(layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.d)), viewGroup, bundle, this.x, new a());
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.d);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.q);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.x);
    }
}
