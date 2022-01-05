package com.google.android.material.timepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.google.android.material.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.timepicker.TimePickerView;
import i0.h.a.c.b0.f;
import i0.h.a.c.b0.g;
import i0.h.a.c.b0.i;
import java.util.LinkedHashSet;
import java.util.Set;

public final class MaterialTimePicker extends DialogFragment {
    public final Set<View.OnClickListener> j2 = new LinkedHashSet();
    public final Set<View.OnClickListener> k2 = new LinkedHashSet();
    public final Set<DialogInterface.OnCancelListener> l2 = new LinkedHashSet();
    public final Set<DialogInterface.OnDismissListener> m2 = new LinkedHashSet();
    public TimePickerView n2;
    public LinearLayout o2;
    public ViewStub p2;
    public f q2;
    public i r2;
    public g s2;
    public int t2;
    public int u2;
    public int v2 = 0;
    public String w2;
    public MaterialButton x2;
    public int y2 = 0;
    public TimeModel z2;

    public class a implements TimePickerView.b {
        public a() {
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        public void onClick(View view) {
            for (View.OnClickListener onClick : MaterialTimePicker.this.j2) {
                onClick.onClick(view);
            }
            MaterialTimePicker.this.J0(false, false);
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        public void onClick(View view) {
            for (View.OnClickListener onClick : MaterialTimePicker.this.k2) {
                onClick.onClick(view);
            }
            MaterialTimePicker.this.J0(false, false);
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        public void onClick(View view) {
            MaterialTimePicker materialTimePicker = MaterialTimePicker.this;
            materialTimePicker.y2 = materialTimePicker.y2 == 0 ? 1 : 0;
            materialTimePicker.Q0(materialTimePicker.x2);
        }
    }

    public final Dialog L0(Bundle bundle) {
        TypedValue i02 = i0.h.a.b.c.m.b.i0(requireContext(), R.attr.materialTimePickerTheme);
        Dialog dialog = new Dialog(requireContext(), i02 == null ? 0 : i02.data);
        Context context = dialog.getContext();
        int k02 = i0.h.a.b.c.m.b.k0(context, R.attr.colorSurface, MaterialTimePicker.class.getCanonicalName());
        int i = R.attr.materialTimePickerStyle;
        int i2 = R.style.Widget_MaterialComponents_TimePicker;
        i0.h.a.c.w.g gVar = new i0.h.a.c.w.g(context, (AttributeSet) null, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, R.styleable.MaterialTimePicker, i, i2);
        this.u2 = obtainStyledAttributes.getResourceId(R.styleable.MaterialTimePicker_clockIcon, 0);
        this.t2 = obtainStyledAttributes.getResourceId(R.styleable.MaterialTimePicker_keyboardIcon, 0);
        obtainStyledAttributes.recycle();
        gVar.q.b = new i0.h.a.c.n.a(context);
        gVar.B();
        gVar.t(ColorStateList.valueOf(k02));
        Window window = dialog.getWindow();
        window.setBackgroundDrawable(gVar);
        window.requestFeature(1);
        window.setLayout(-2, -2);
        return dialog;
    }

    public final void Q0(MaterialButton materialButton) {
        f fVar;
        Pair pair;
        g gVar = this.s2;
        if (gVar != null) {
            gVar.d();
        }
        if (this.y2 == 0) {
            f fVar2 = this.q2;
            f fVar3 = fVar2;
            if (fVar2 == null) {
                fVar3 = new f(this.n2, this.z2);
            }
            this.q2 = fVar3;
            fVar = fVar3;
        } else {
            if (this.r2 == null) {
                LinearLayout linearLayout = (LinearLayout) this.p2.inflate();
                this.o2 = linearLayout;
                this.r2 = new i(linearLayout, this.z2);
            }
            i iVar = this.r2;
            iVar.y.setChecked(false);
            iVar.Y1.setChecked(false);
            fVar = this.r2;
        }
        this.s2 = fVar;
        fVar.a();
        this.s2.J();
        int i = this.y2;
        if (i == 0) {
            pair = new Pair(Integer.valueOf(this.t2), Integer.valueOf(R.string.material_timepicker_text_input_mode_description));
        } else if (i == 1) {
            pair = new Pair(Integer.valueOf(this.u2), Integer.valueOf(R.string.material_timepicker_clock_mode_description));
        } else {
            throw new IllegalArgumentException(i0.d.a.a.a.e0("no icon for mode: ", i));
        }
        materialButton.setIconResource(((Integer) pair.first).intValue());
        materialButton.setContentDescription(getResources().getString(((Integer) pair.second).intValue()));
    }

    public final void onCancel(DialogInterface dialogInterface) {
        for (DialogInterface.OnCancelListener onCancel : this.l2) {
            onCancel.onCancel(dialogInterface);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        if (bundle != null) {
            TimeModel timeModel = (TimeModel) bundle.getParcelable("TIME_PICKER_TIME_MODEL");
            this.z2 = timeModel;
            if (timeModel == null) {
                this.z2 = new TimeModel();
            }
            this.y2 = bundle.getInt("TIME_PICKER_INPUT_MODE", 0);
            this.v2 = bundle.getInt("TIME_PICKER_TITLE_RES", 0);
            this.w2 = bundle.getString("TIME_PICKER_TITLE_TEXT");
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.material_timepicker_dialog, viewGroup);
        TimePickerView timePickerView = (TimePickerView) viewGroup2.findViewById(R.id.material_timepicker_view);
        this.n2 = timePickerView;
        timePickerView.v2 = new a();
        this.p2 = (ViewStub) viewGroup2.findViewById(R.id.material_textinput_timepicker);
        this.x2 = (MaterialButton) viewGroup2.findViewById(R.id.material_timepicker_mode_button);
        TextView textView = (TextView) viewGroup2.findViewById(R.id.header_title);
        if (!TextUtils.isEmpty(this.w2)) {
            textView.setText(this.w2);
        }
        int i = this.v2;
        if (i != 0) {
            textView.setText(i);
        }
        Q0(this.x2);
        ((Button) viewGroup2.findViewById(R.id.material_timepicker_ok_button)).setOnClickListener(new b());
        ((Button) viewGroup2.findViewById(R.id.material_timepicker_cancel_button)).setOnClickListener(new c());
        this.x2.setOnClickListener(new d());
        return viewGroup2;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        for (DialogInterface.OnDismissListener onDismiss : this.m2) {
            onDismiss.onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("TIME_PICKER_TIME_MODEL", this.z2);
        bundle.putInt("TIME_PICKER_INPUT_MODE", this.y2);
        bundle.putInt("TIME_PICKER_TITLE_RES", this.v2);
        bundle.putString("TIME_PICKER_TITLE_TEXT", this.w2);
    }
}
