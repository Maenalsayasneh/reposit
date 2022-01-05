package com.instabug.featuresrequest.ui.custom;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.instabug.featuresrequest.R;
import com.instabug.library.Instabug;
import com.instabug.library.InstabugColorTheme;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.core.ui.BaseContract;
import com.instabug.library.core.ui.BaseContract.Presenter;
import com.instabug.library.core.ui.InstabugBaseFragment;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.LocaleHelper;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class DynamicToolbarFragment<P extends BaseContract.Presenter> extends InstabugBaseFragment<P> implements View.OnClickListener {
    private static final String TAG = "DynamicToolbarFragment";
    private LinearLayout actionButtonsLayout;
    private ImageButton closeButton;
    public RelativeLayout toolbar;
    public ArrayList<f> toolbarActionButtons = new ArrayList<>();

    public class a implements View.OnClickListener {
        public final /* synthetic */ f c;

        public a(f fVar) {
            this.c = fVar;
        }

        public void onClick(View view) {
            this.c.c.a();
        }
    }

    public class b implements View.OnClickListener {
        public final /* synthetic */ f c;

        public b(f fVar) {
            this.c = fVar;
        }

        public void onClick(View view) {
            this.c.c.a();
        }
    }

    public class c implements View.OnClickListener {
        public final /* synthetic */ f c;

        public c(f fVar) {
            this.c = fVar;
        }

        public void onClick(View view) {
            this.c.c.a();
        }
    }

    public class d implements View.OnClickListener {
        public final /* synthetic */ f c;

        public d(f fVar) {
            this.c = fVar;
        }

        public void onClick(View view) {
            this.c.c.a();
        }
    }

    public static /* synthetic */ class e {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0011 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001c */
        static {
            /*
                com.instabug.featuresrequest.ui.custom.f.b.values()
                r0 = 3
                int[] r1 = new int[r0]
                a = r1
                com.instabug.featuresrequest.ui.custom.f$b r2 = com.instabug.featuresrequest.ui.custom.f.b.ICON     // Catch:{ NoSuchFieldError -> 0x0011 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0011 }
                r3 = 1
                r1[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0011 }
            L_0x0011:
                int[] r1 = a     // Catch:{ NoSuchFieldError -> 0x001c }
                com.instabug.featuresrequest.ui.custom.f$b r2 = com.instabug.featuresrequest.ui.custom.f.b.TEXT     // Catch:{ NoSuchFieldError -> 0x001c }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x001c }
                r3 = 2
                r1[r2] = r3     // Catch:{ NoSuchFieldError -> 0x001c }
            L_0x001c:
                int[] r1 = a     // Catch:{ NoSuchFieldError -> 0x0026 }
                com.instabug.featuresrequest.ui.custom.f$b r2 = com.instabug.featuresrequest.ui.custom.f.b.VOTE     // Catch:{ NoSuchFieldError -> 0x0026 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0026 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0026 }
            L_0x0026:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instabug.featuresrequest.ui.custom.DynamicToolbarFragment.e.<clinit>():void");
        }
    }

    public abstract void addToolbarActionButtons();

    public View findTextViewByTitle(int i) {
        String string = getContext() != null ? getContext().getResources().getString(i) : "";
        LinearLayout linearLayout = this.actionButtonsLayout;
        if (linearLayout != null) {
            return findViewWithContentDescription(linearLayout, string);
        }
        return null;
    }

    public View findViewWithContentDescription(View view, String str) {
        ArrayList arrayList = new ArrayList();
        view.findViewsWithText(arrayList, str, 2);
        if (arrayList.size() > 0) {
            return (View) arrayList.get(0);
        }
        return null;
    }

    public abstract int getContentLayout();

    public int getLayout() {
        return R.layout.ib_fr_toolbar_fragment;
    }

    public abstract String getTitle();

    public abstract f getToolbarCloseActionButton();

    public abstract void initContentViews(View view, Bundle bundle);

    public void initToolbarViews(Bundle bundle) {
        if (getContext() != null) {
            RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.ib_fr_toolbar_main);
            this.toolbar = relativeLayout;
            if (relativeLayout != null) {
                if (Instabug.getTheme() == InstabugColorTheme.InstabugColorThemeLight) {
                    this.toolbar.setBackgroundColor(InstabugCore.getPrimaryColor());
                } else {
                    this.toolbar.setBackgroundColor(h0.i.b.a.getColor(getContext(), R.color.ib_fr_toolbar_dark_color));
                }
                this.actionButtonsLayout = (LinearLayout) this.toolbar.findViewById(R.id.ib_toolbar_action_btns_layout);
            }
            ImageButton imageButton = (ImageButton) findViewById(R.id.instabug_btn_toolbar_left);
            this.closeButton = imageButton;
            if (imageButton != null) {
                if (LocaleHelper.isRTL(getContext())) {
                    this.closeButton.setRotation(180.0f);
                }
                f toolbarCloseActionButton = getToolbarCloseActionButton();
                this.closeButton.setImageResource(toolbarCloseActionButton.a);
                this.closeButton.setOnClickListener(new a(toolbarCloseActionButton));
            }
            this.toolbarActionButtons.clear();
            addToolbarActionButtons();
            Iterator<f> it = this.toolbarActionButtons.iterator();
            while (it.hasNext()) {
                f next = it.next();
                int i = e.a[next.d.ordinal()];
                if (i == 1) {
                    ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.ib_fr_toolbar_action_icon_view, (ViewGroup) null);
                    imageView.setImageResource(next.a);
                    imageView.setOnClickListener(new b(next));
                    LinearLayout linearLayout = this.actionButtonsLayout;
                    if (linearLayout != null) {
                        linearLayout.addView(imageView);
                    }
                } else if (i == 2) {
                    TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.ib_fr_toolbar_action_text_view, (ViewGroup) null);
                    textView.setText(next.b);
                    textView.setContentDescription(getContext().getResources().getText(next.b));
                    textView.setOnClickListener(new c(next));
                    LinearLayout linearLayout2 = this.actionButtonsLayout;
                    if (linearLayout2 != null) {
                        linearLayout2.addView(textView);
                    }
                } else if (i == 3) {
                    LinearLayout linearLayout3 = (LinearLayout) LayoutInflater.from(getContext()).inflate(R.layout.ib_fr_toolbar_action_vote_button, (ViewGroup) null);
                    ((TextView) linearLayout3.findViewById(R.id.ib_toolbar_vote_count)).setText(next.b);
                    ((IbFrRippleView) linearLayout3.findViewById(R.id.ib_feature_request_toolbar_vote_action_layout)).setOnClickListener(new d(next));
                    LinearLayout linearLayout4 = this.actionButtonsLayout;
                    if (linearLayout4 != null) {
                        linearLayout4.addView(linearLayout3);
                    }
                }
            }
        }
    }

    public void initViews(View view, Bundle bundle) {
        initToolbarViews(bundle);
        ViewStub viewStub = (ViewStub) findViewById(R.id.instabug_content);
        if (viewStub != null) {
            viewStub.setLayoutResource(getContentLayout());
            viewStub.inflate();
        }
        initContentViews(view, bundle);
        setTitle(getTitle());
    }

    public void setTitle(String str) {
        if (this.rootView == null) {
            InstabugSDKLogger.w(TAG, "Calling setTitle before inflating the view! Ignoring call");
            return;
        }
        TextView textView = (TextView) findViewById(R.id.instabug_fragment_title);
        InstabugSDKLogger.w(TAG, "Setting fragment title to \"" + str + "\"");
        if (textView != null && str != null) {
            textView.setText(str);
        }
    }
}
