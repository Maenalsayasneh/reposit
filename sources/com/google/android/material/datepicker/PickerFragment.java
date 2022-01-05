package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import i0.h.a.c.l.p;
import java.util.LinkedHashSet;

public abstract class PickerFragment<S> extends Fragment {
    public final LinkedHashSet<p<S>> c = new LinkedHashSet<>();

    public boolean I0(p<S> pVar) {
        return this.c.add(pVar);
    }
}
