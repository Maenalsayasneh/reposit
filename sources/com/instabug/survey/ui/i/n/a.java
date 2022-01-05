package com.instabug.survey.ui.i.n;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.instabug.library.Feature;
import com.instabug.library.Instabug;
import com.instabug.library.InstabugColorTheme;
import com.instabug.library.InstabugCustomTextPlaceHolder;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.core.ui.InstabugBaseFragment;
import com.instabug.library.internal.device.InstabugDeviceProperties;
import com.instabug.library.util.DrawableUtils;
import com.instabug.library.util.PlaceHolderUtils;
import com.instabug.survey.R;
import com.instabug.survey.models.Survey;
import com.instabug.survey.ui.SurveyActivity;
import i0.j.f.p.h;
import i0.j.f.p.k;
import i0.j.f.s.e.b;
import i0.j.f.s.g.m.b;
import java.lang.ref.WeakReference;

/* compiled from: WelcomeFragment */
public class a extends InstabugBaseFragment<b> implements i0.j.f.s.g.m.a, View.OnClickListener, View.OnTouchListener, b.C0192b {
    public static final /* synthetic */ int c = 0;
    public TextView Y1;
    public TextView Z1;
    public Button d;
    public ImageView q;
    public Survey x;
    public LinearLayout y;

    public void a() {
    }

    public void g() {
        if (getActivity() != null && this.x != null) {
            ((SurveyActivity) getActivity()).y(this.x);
        }
    }

    public int getLayout() {
        return R.layout.instabug_survey_fragment_welcome_dialog;
    }

    public void initViews(View view, Bundle bundle) {
        this.d = (Button) findViewById(R.id.ib_welcome_survey_take_survey);
        this.q = (ImageView) findViewById(R.id.survey_partial_close_btn);
        this.y = (LinearLayout) findViewById(R.id.instabug_dialog_survey_container);
        this.Y1 = (TextView) findViewById(R.id.ib_welcome_survey_title);
        this.Z1 = (TextView) findViewById(R.id.ib_welcome_survey_text);
        if (getContext() != null) {
            LinearLayout linearLayout = this.y;
            if (linearLayout != null) {
                linearLayout.setOnTouchListener(this);
            }
            ImageView imageView = this.q;
            if (imageView != null) {
                imageView.setOnClickListener(this);
            }
            Button button = this.d;
            if (button != null) {
                button.setOnClickListener(this);
                this.d.setTextColor(h0.i.b.a.getColor(getContext(), 17170443));
                DrawableUtils.setColor(this.d, Instabug.getPrimaryColor());
            }
            TextView textView = this.Y1;
            if (textView != null) {
                textView.setText(PlaceHolderUtils.getPlaceHolder(InstabugCustomTextPlaceHolder.Key.SURVEYS_WELCOME_SCREEN_TITLE, getString(R.string.instabug_survey_welcome_feedback)));
            }
            TextView textView2 = this.Z1;
            if (textView2 != null) {
                textView2.setText(PlaceHolderUtils.getPlaceHolder(InstabugCustomTextPlaceHolder.Key.SURVEYS_WELCOME_SCREEN_SUBTITLE, getString(R.string.instabug_survey_welcome_feedback_msg)));
            }
            Button button2 = this.d;
            if (button2 != null) {
                button2.setText(PlaceHolderUtils.getPlaceHolder(InstabugCustomTextPlaceHolder.Key.SURVEYS_WELCOME_SCREEN_BUTTON, getString(R.string.instabug_survey_welcome_button)));
            }
        }
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.ib_welcome_survey_take_survey) {
            if (getActivity() != null && this.x != null && getActivity().getSupportFragmentManager() != null) {
                Fragment I = getActivity().getSupportFragmentManager().I(R.id.instabug_fragment_container);
                if (I != null) {
                    h0.o.a.a aVar = new h0.o.a.a(getActivity().getSupportFragmentManager());
                    aVar.q(0, 0);
                    aVar.n(I);
                    aVar.h();
                }
                h.g(getActivity().getSupportFragmentManager(), this.x, 0, 0);
            }
        } else if (id == R.id.survey_partial_close_btn) {
            g();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.x = (Survey) getArguments().getSerializable("survey");
        }
        this.presenter = new i0.j.f.s.g.m.b(this);
    }

    public void onResume() {
        super.onResume();
        TextView textView = this.Y1;
        if (textView == null) {
            return;
        }
        if (InstabugDeviceProperties.isTablet(textView.getContext())) {
            textView.setTextSize(2, 18.0f);
            textView.setLineSpacing(1.0f, 1.2f);
            textView.setMaxLines(4);
        } else if (textView.getText().toString().length() > 150) {
            textView.setTextSize(2, 15.0f);
            textView.setLineSpacing(1.0f, 1.1f);
            textView.setMaxLines(5);
        } else if (textView.getText().toString().length() > 100) {
            textView.setTextSize(2, 16.0f);
            textView.setLineSpacing(1.0f, 1.2f);
            textView.setMaxLines(4);
        } else if (textView.getText().toString().length() < 150) {
            textView.post(new k(textView));
        } else {
            textView.setTextSize(2, 18.0f);
            textView.setLineSpacing(1.0f, 1.2f);
            textView.setMaxLines(4);
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        i0.j.f.s.e.b.c(view, motionEvent, true, true, this);
        return true;
    }

    public void onViewCreated(View view, Bundle bundle) {
        WeakReference<V> weakReference;
        i0.j.f.s.g.m.a aVar;
        super.onViewCreated(view, bundle);
        P p = this.presenter;
        if (p != null && (weakReference = ((i0.j.f.s.g.m.b) p).view) != null && (aVar = (i0.j.f.s.g.m.a) weakReference.get()) != null) {
            if (InstabugCore.getFeatureState(Feature.WHITE_LABELING) == Feature.State.ENABLED) {
                aVar.r();
            } else {
                aVar.p();
            }
        }
    }

    public void p() {
        int i = R.id.instabug_pbi_container;
        if (findViewById(i) != null) {
            findViewById(i).setVisibility(0);
        }
        TextView textView = (TextView) findViewById(R.id.text_view_pb);
        ImageView imageView = (ImageView) findViewById(R.id.image_instabug_logo);
        if (imageView != null && textView != null && getActivity() != null) {
            if (Instabug.getTheme() == InstabugColorTheme.InstabugColorThemeDark) {
                imageView.setImageResource(R.drawable.ibg_core_ic_instabug_logo);
                imageView.setColorFilter(Color.parseColor("#FFFFFF"), PorterDuff.Mode.SRC_ATOP);
                textView.setTextColor(h0.i.b.a.getColor(getActivity(), 17170443));
                return;
            }
            imageView.setImageResource(R.drawable.ibg_core_ic_instabug_logo);
            h0.o.a.k activity = getActivity();
            int i2 = R.color.instabug_survey_pbi_color;
            imageView.setColorFilter(h0.i.b.a.getColor(activity, i2), PorterDuff.Mode.SRC_ATOP);
            textView.setTextColor(h0.i.b.a.getColor(getActivity(), i2));
        }
    }

    public void r() {
        View view = this.rootView;
        if (view != null) {
            view.findViewById(R.id.instabug_pbi_container).setVisibility(8);
        }
    }
}
