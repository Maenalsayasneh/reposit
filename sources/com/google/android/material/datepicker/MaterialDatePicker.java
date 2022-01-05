package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.google.android.material.R;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.internal.CheckableImageButton;
import h0.i.i.q;
import i0.h.a.c.l.k;
import i0.h.a.c.l.l;
import i0.h.a.c.l.m;
import i0.h.a.c.l.p;
import i0.h.a.c.l.s;
import i0.h.a.c.w.g;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicInteger;

public final class MaterialDatePicker<S> extends DialogFragment {
    public static final /* synthetic */ int j2 = 0;
    public Button A2;
    public final LinkedHashSet<l<? super S>> k2 = new LinkedHashSet<>();
    public final LinkedHashSet<View.OnClickListener> l2 = new LinkedHashSet<>();
    public final LinkedHashSet<DialogInterface.OnCancelListener> m2 = new LinkedHashSet<>();
    public final LinkedHashSet<DialogInterface.OnDismissListener> n2 = new LinkedHashSet<>();
    public int o2;
    public DateSelector<S> p2;
    public PickerFragment<S> q2;
    public CalendarConstraints r2;
    public MaterialCalendar<S> s2;
    public int t2;
    public CharSequence u2;
    public boolean v2;
    public int w2;
    public TextView x2;
    public CheckableImageButton y2;
    public g z2;

    public class a implements View.OnClickListener {
        public a() {
        }

        public void onClick(View view) {
            Iterator it = MaterialDatePicker.this.k2.iterator();
            while (it.hasNext()) {
                ((l) it.next()).a(MaterialDatePicker.this.p2.m0());
            }
            MaterialDatePicker.this.J0(false, false);
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        public void onClick(View view) {
            Iterator it = MaterialDatePicker.this.l2.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            MaterialDatePicker.this.J0(false, false);
        }
    }

    public class c extends p<S> {
        public c() {
        }

        public void a(S s) {
            MaterialDatePicker materialDatePicker = MaterialDatePicker.this;
            int i = MaterialDatePicker.j2;
            materialDatePicker.U0();
            MaterialDatePicker materialDatePicker2 = MaterialDatePicker.this;
            materialDatePicker2.A2.setEnabled(materialDatePicker2.p2.d0());
        }
    }

    public static int Q0(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar d = s.d();
        d.set(5, 1);
        Calendar b2 = s.b(d);
        b2.get(2);
        b2.get(1);
        int maximum = b2.getMaximum(7);
        b2.getActualMaximum(5);
        b2.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean R0(Context context) {
        return S0(context, 16843277);
    }

    public static boolean S0(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i0.h.a.b.c.m.b.k0(context, R.attr.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()), new int[]{i});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    public final Dialog L0(Bundle bundle) {
        Context requireContext = requireContext();
        Context requireContext2 = requireContext();
        int i = this.o2;
        if (i == 0) {
            i = this.p2.Y(requireContext2);
        }
        Dialog dialog = new Dialog(requireContext, i);
        Context context = dialog.getContext();
        this.v2 = R0(context);
        int k02 = i0.h.a.b.c.m.b.k0(context, R.attr.colorSurface, MaterialDatePicker.class.getCanonicalName());
        g gVar = new g(context, (AttributeSet) null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        this.z2 = gVar;
        gVar.q(context);
        this.z2.t(ColorStateList.valueOf(k02));
        g gVar2 = this.z2;
        View decorView = dialog.getWindow().getDecorView();
        AtomicInteger atomicInteger = q.a;
        gVar2.s(decorView.getElevation());
        return dialog;
    }

    public final void T0() {
        PickerFragment<S> pickerFragment;
        Context requireContext = requireContext();
        int i = this.o2;
        if (i == 0) {
            i = this.p2.Y(requireContext);
        }
        DateSelector<S> dateSelector = this.p2;
        CalendarConstraints calendarConstraints = this.r2;
        MaterialCalendar<S> materialCalendar = new MaterialCalendar<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("GRID_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable("CURRENT_MONTH_KEY", calendarConstraints.x);
        materialCalendar.setArguments(bundle);
        this.s2 = materialCalendar;
        if (this.y2.isChecked()) {
            DateSelector<S> dateSelector2 = this.p2;
            CalendarConstraints calendarConstraints2 = this.r2;
            pickerFragment = new MaterialTextInputPicker<>();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i);
            bundle2.putParcelable("DATE_SELECTOR_KEY", dateSelector2);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints2);
            pickerFragment.setArguments(bundle2);
        } else {
            pickerFragment = this.s2;
        }
        this.q2 = pickerFragment;
        U0();
        h0.o.a.a aVar = new h0.o.a.a(getChildFragmentManager());
        aVar.o(R.id.mtrl_calendar_frame, this.q2, (String) null);
        if (!aVar.i) {
            aVar.j = false;
            aVar.s.D(aVar, false);
            this.q2.I0(new c());
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public final void U0() {
        String l = this.p2.l(getContext());
        this.x2.setContentDescription(String.format(getString(R.string.mtrl_picker_announce_current_selection), new Object[]{l}));
        this.x2.setText(l);
    }

    public final void V0(CheckableImageButton checkableImageButton) {
        String str;
        if (this.y2.isChecked()) {
            str = checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode);
        } else {
            str = checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode);
        }
        this.y2.setContentDescription(str);
    }

    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.m2.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.o2 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.p2 = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.r2 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.t2 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.u2 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.w2 = bundle.getInt("INPUT_MODE_KEY");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.v2 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.v2) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(Q0(context), -2));
        } else {
            View findViewById = inflate.findViewById(R.id.mtrl_calendar_main_pane);
            View findViewById2 = inflate.findViewById(R.id.mtrl_calendar_frame);
            findViewById.setLayoutParams(new LinearLayout.LayoutParams(Q0(context), -1));
            Resources resources = requireContext().getResources();
            int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height);
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height);
            int i = m.c;
            findViewById2.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding) * (i - 1)) + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding));
        }
        TextView textView = (TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text);
        this.x2 = textView;
        AtomicInteger atomicInteger = q.a;
        textView.setAccessibilityLiveRegion(1);
        this.y2 = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        TextView textView2 = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        CharSequence charSequence = this.u2;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.t2);
        }
        this.y2.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.y2;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, h0.b.b.a.a.a(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], h0.b.b.a.a.a(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.y2.setChecked(this.w2 != 0);
        q.p(this.y2, (h0.i.i.a) null);
        V0(this.y2);
        this.y2.setOnClickListener(new k(this));
        this.A2 = (Button) inflate.findViewById(R.id.confirm_button);
        if (this.p2.d0()) {
            this.A2.setEnabled(true);
        } else {
            this.A2.setEnabled(false);
        }
        this.A2.setTag("CONFIRM_BUTTON_TAG");
        this.A2.setOnClickListener(new a());
        Button button = (Button) inflate.findViewById(R.id.cancel_button);
        button.setTag("CANCEL_BUTTON_TAG");
        button.setOnClickListener(new b());
        return inflate;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.n2.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        Month month;
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.o2);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.p2);
        CalendarConstraints.b bVar = new CalendarConstraints.b(this.r2);
        Month month2 = this.s2.Y1;
        if (month2 != null) {
            bVar.e = Long.valueOf(month2.Y1);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", bVar.f);
        Month j = Month.j(bVar.c);
        Month j3 = Month.j(bVar.d);
        CalendarConstraints.DateValidator dateValidator = (CalendarConstraints.DateValidator) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = bVar.e;
        if (l == null) {
            month = null;
        } else {
            month = Month.j(l.longValue());
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new CalendarConstraints(j, j3, dateValidator, month, (CalendarConstraints.a) null));
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.t2);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.u2);
    }

    public void onStart() {
        super.onStart();
        Window window = M0().getWindow();
        if (this.v2) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.z2);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable(this.z2, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new i0.h.a.c.m.a(M0(), rect));
        }
        T0();
    }

    public void onStop() {
        this.q2.c.clear();
        super.onStop();
    }
}
