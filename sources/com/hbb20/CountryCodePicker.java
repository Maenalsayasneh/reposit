package com.hbb20;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.telephony.PhoneNumberUtils;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.futuremind.recyclerviewfastscroll.FastScroller;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import h0.i.i.f0;
import i0.i.h;
import i0.i.i;
import i0.i.j;
import i0.i.k;
import i0.i.l;
import i0.i.m;
import i0.i.n;
import i0.i.o;
import io.michaelrocks.libphonenumber.android.NumberParseException;
import io.michaelrocks.libphonenumber.android.PhoneNumberUtil;
import io.michaelrocks.libphonenumber.android.Phonemetadata$PhoneNumberDesc;
import io.michaelrocks.libphonenumber.android.Phonenumber$PhoneNumber;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.logging.Level;

public class CountryCodePicker extends RelativeLayout {
    public static final /* synthetic */ int c = 0;
    public boolean A2 = true;
    public i0.i.b A3;
    public boolean B2 = false;
    public View.OnClickListener B3;
    public boolean C2 = false;
    public boolean D2 = true;
    public boolean E2 = true;
    public boolean F2 = false;
    public boolean G2 = false;
    public boolean H2 = false;
    public boolean I2 = true;
    public PhoneNumberType J2 = PhoneNumberType.MOBILE;
    public String K2 = "ccp_last_selection";
    public int L2 = -99;
    public int M2 = -99;
    public int N2;
    public Typeface O2;
    public int P2;
    public List<i0.i.a> Q2;
    public int R2 = 0;
    public String S2;
    public int T2 = 0;
    public List<i0.i.a> U2;
    public String V2;
    public String W2;
    public Language X2;
    public Context Y1;
    public Language Y2;
    public View Z1;
    public boolean Z2;
    public LayoutInflater a2;
    public boolean a3;
    public TextView b2;
    public boolean b3;
    public EditText c2;
    public boolean c3;
    public i0.i.c d = new n();
    public RelativeLayout d2;
    public boolean d3;
    public ImageView e2;
    public boolean e3;
    public ImageView f2;
    public String f3;
    public LinearLayout g2;
    public TextWatcher g3;
    public LinearLayout h2;
    public o h3;
    public i0.i.a i2;
    public boolean i3;
    public i0.i.a j2;
    public TextWatcher j3;
    public RelativeLayout k2;
    public boolean k3;
    public CountryCodePicker l2;
    public String l3;
    public TextGravity m2;
    public int m3;
    public String n2 = "";
    public boolean n3;
    public int o2;
    public f o3;
    public AutoDetectionPref p2 = AutoDetectionPref.SIM_NETWORK_LOCALE;
    public g p3;
    public String q = "CCP_PREF_FILE";
    public PhoneNumberUtil q2;
    public e q3;
    public boolean r2 = true;
    public d r3;
    public boolean s2 = true;
    public c s3;
    public boolean t2 = true;
    public int t3;
    public boolean u2 = true;
    public int u3;
    public boolean v2 = false;
    public int v3;
    public boolean w2 = true;
    public int w3;
    public int x;
    public boolean x2 = true;
    public int x3;
    public String y;
    public boolean y2 = true;
    public int y3;
    public boolean z2 = true;
    public float z3;

    public enum AutoDetectionPref {
        SIM_ONLY("1"),
        NETWORK_ONLY("2"),
        LOCALE_ONLY("3"),
        SIM_NETWORK("12"),
        NETWORK_SIM("21"),
        SIM_LOCALE("13"),
        LOCALE_SIM("31"),
        NETWORK_LOCALE("23"),
        LOCALE_NETWORK("32"),
        SIM_NETWORK_LOCALE("123"),
        SIM_LOCALE_NETWORK("132"),
        NETWORK_SIM_LOCALE("213"),
        NETWORK_LOCALE_SIM("231"),
        LOCALE_SIM_NETWORK("312"),
        LOCALE_NETWORK_SIM("321");
        
        public String representation;

        private AutoDetectionPref(String str) {
            this.representation = str;
        }

        public static AutoDetectionPref getPrefForValue(String str) {
            AutoDetectionPref[] values = values();
            for (int i = 0; i < 15; i++) {
                AutoDetectionPref autoDetectionPref = values[i];
                if (autoDetectionPref.representation.equals(str)) {
                    return autoDetectionPref;
                }
            }
            return SIM_NETWORK_LOCALE;
        }
    }

    public enum PhoneNumberType {
        MOBILE,
        FIXED_LINE,
        FIXED_LINE_OR_MOBILE,
        TOLL_FREE,
        PREMIUM_RATE,
        SHARED_COST,
        VOIP,
        PERSONAL_NUMBER,
        PAGER,
        UAN,
        VOICEMAIL,
        UNKNOWN
    }

    public enum TextGravity {
        LEFT(-1),
        CENTER(0),
        RIGHT(1);
        
        public int enumIndex;

        private TextGravity(int i) {
            this.enumIndex = i;
        }
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        public void onClick(View view) {
            CountryCodePicker countryCodePicker = CountryCodePicker.this;
            int i = CountryCodePicker.c;
            Objects.requireNonNull(countryCodePicker);
            CountryCodePicker countryCodePicker2 = CountryCodePicker.this;
            if (!countryCodePicker2.a3) {
                return;
            }
            if (countryCodePicker2.F2) {
                countryCodePicker2.g(countryCodePicker2.getSelectedCountryNameCode());
            } else {
                countryCodePicker2.g((String) null);
            }
        }
    }

    public class b implements TextWatcher {
        public String c = null;

        public b() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
            r5 = io.michaelrocks.libphonenumber.android.PhoneNumberUtil.w(r5);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onTextChanged(java.lang.CharSequence r3, int r4, int r5, int r6) {
            /*
                r2 = this;
                com.hbb20.CountryCodePicker r4 = com.hbb20.CountryCodePicker.this
                i0.i.a r4 = r4.getSelectedCountry()
                if (r4 == 0) goto L_0x0085
                java.lang.String r5 = r2.c
                if (r5 == 0) goto L_0x0016
                java.lang.String r6 = r3.toString()
                boolean r5 = r5.equals(r6)
                if (r5 != 0) goto L_0x0085
            L_0x0016:
                com.hbb20.CountryCodePicker r5 = com.hbb20.CountryCodePicker.this
                boolean r6 = r5.k3
                if (r6 == 0) goto L_0x0085
                i0.i.b r6 = r5.A3
                if (r6 == 0) goto L_0x007f
                android.widget.EditText r5 = r5.getEditText_registeredCarrierNumber()
                android.text.Editable r5 = r5.getText()
                java.lang.String r5 = r5.toString()
                int r6 = r5.length()
                com.hbb20.CountryCodePicker r0 = com.hbb20.CountryCodePicker.this
                i0.i.b r0 = r0.A3
                int r0 = r0.c
                if (r6 < r0) goto L_0x007f
                java.lang.String r5 = io.michaelrocks.libphonenumber.android.PhoneNumberUtil.w(r5)
                int r6 = r5.length()
                com.hbb20.CountryCodePicker r0 = com.hbb20.CountryCodePicker.this
                i0.i.b r0 = r0.A3
                int r0 = r0.c
                if (r6 < r0) goto L_0x007f
                r6 = 0
                java.lang.String r5 = r5.substring(r6, r0)
                com.hbb20.CountryCodePicker r6 = com.hbb20.CountryCodePicker.this
                java.lang.String r6 = r6.l3
                boolean r6 = r5.equals(r6)
                if (r6 != 0) goto L_0x007f
                com.hbb20.CountryCodePicker r6 = com.hbb20.CountryCodePicker.this
                i0.i.b r0 = r6.A3
                android.content.Context r1 = r6.Y1
                com.hbb20.CountryCodePicker$Language r6 = r6.getLanguageToApply()
                i0.i.a r6 = r0.a(r1, r6, r5)
                boolean r4 = r6.equals(r4)
                if (r4 != 0) goto L_0x007b
                com.hbb20.CountryCodePicker r4 = com.hbb20.CountryCodePicker.this
                r0 = 1
                r4.n3 = r0
                int r0 = android.text.Selection.getSelectionEnd(r3)
                r4.m3 = r0
                com.hbb20.CountryCodePicker r4 = com.hbb20.CountryCodePicker.this
                r4.setSelectedCountry(r6)
            L_0x007b:
                com.hbb20.CountryCodePicker r4 = com.hbb20.CountryCodePicker.this
                r4.l3 = r5
            L_0x007f:
                java.lang.String r3 = r3.toString()
                r2.c = r3
            L_0x0085:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.hbb20.CountryCodePicker.b.onTextChanged(java.lang.CharSequence, int, int, int):void");
        }
    }

    public interface c {
        String a(Language language, String str);

        String b(Language language, String str);

        String c(Language language, String str);
    }

    public interface d {
        void a(DialogInterface dialogInterface);

        void b(Dialog dialog);

        void c(DialogInterface dialogInterface);
    }

    public interface e {
        void a();
    }

    public interface f {
        void a();
    }

    public interface g {
    }

    public CountryCodePicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Language language = Language.ENGLISH;
        this.X2 = language;
        this.Y2 = language;
        this.Z2 = true;
        this.a3 = true;
        this.b3 = false;
        this.c3 = false;
        this.d3 = true;
        this.e3 = false;
        this.f3 = "notSet";
        this.l3 = null;
        this.m3 = 0;
        this.n3 = false;
        this.t3 = 0;
        this.y3 = 0;
        this.B3 = new a();
        this.Y1 = context;
        c(attributeSet);
    }

    private Language getCCPLanguageFromLocale() {
        Locale locale = this.Y1.getResources().getConfiguration().locale;
        Language[] values = Language.values();
        for (int i = 0; i < 37; i++) {
            Language language = values[i];
            if (language.getCode().equalsIgnoreCase(locale.getLanguage()) && (language.getCountry() == null || language.getCountry().equalsIgnoreCase(locale.getCountry()) || language.getScript() == null || language.getScript().equalsIgnoreCase(locale.getScript()))) {
                return language;
            }
        }
        return null;
    }

    private View.OnClickListener getCountryCodeHolderClickListener() {
        return this.B3;
    }

    private TextWatcher getCountryDetectorTextWatcher() {
        if (this.c2 != null && this.j3 == null) {
            this.j3 = new b();
        }
        return this.j3;
    }

    private i0.i.a getDefaultCountry() {
        return this.j2;
    }

    private Phonenumber$PhoneNumber getEnteredPhoneNumber() throws NumberParseException {
        EditText editText = this.c2;
        return getPhoneUtil().y(editText != null ? PhoneNumberUtil.w(editText.getText().toString()) : "", getSelectedCountryNameCode());
    }

    private View getHolderView() {
        return this.Z1;
    }

    private PhoneNumberUtil getPhoneUtil() {
        if (this.q2 == null) {
            this.q2 = PhoneNumberUtil.b(this.Y1);
        }
        return this.q2;
    }

    /* access modifiers changed from: private */
    public i0.i.a getSelectedCountry() {
        if (this.i2 == null) {
            setSelectedCountry(getDefaultCountry());
        }
        return this.i2;
    }

    private PhoneNumberUtil.PhoneNumberType getSelectedHintNumberType() {
        switch (this.J2.ordinal()) {
            case 0:
                return PhoneNumberUtil.PhoneNumberType.MOBILE;
            case 1:
                return PhoneNumberUtil.PhoneNumberType.FIXED_LINE;
            case 2:
                return PhoneNumberUtil.PhoneNumberType.FIXED_LINE_OR_MOBILE;
            case 3:
                return PhoneNumberUtil.PhoneNumberType.TOLL_FREE;
            case 4:
                return PhoneNumberUtil.PhoneNumberType.PREMIUM_RATE;
            case 5:
                return PhoneNumberUtil.PhoneNumberType.SHARED_COST;
            case 6:
                return PhoneNumberUtil.PhoneNumberType.VOIP;
            case 7:
                return PhoneNumberUtil.PhoneNumberType.PERSONAL_NUMBER;
            case 8:
                return PhoneNumberUtil.PhoneNumberType.PAGER;
            case 9:
                return PhoneNumberUtil.PhoneNumberType.UAN;
            case 10:
                return PhoneNumberUtil.PhoneNumberType.VOICEMAIL;
            case 11:
                return PhoneNumberUtil.PhoneNumberType.UNKNOWN;
            default:
                return PhoneNumberUtil.PhoneNumberType.MOBILE;
        }
    }

    private LayoutInflater getmInflater() {
        return this.a2;
    }

    private void setCustomDefaultLanguage(Language language) {
        i0.i.a i;
        this.X2 = language;
        n();
        if (this.i2 != null && (i = i0.i.a.i(this.Y1, getLanguageToApply(), this.i2.Y1)) != null) {
            setSelectedCountry(i);
        }
    }

    private void setDefaultCountry(i0.i.a aVar) {
        this.j2 = aVar;
    }

    private void setHolder(RelativeLayout relativeLayout) {
        this.d2 = relativeLayout;
    }

    private void setHolderView(View view) {
        this.Z1 = view;
    }

    public final void b(int i) {
        if (i == TextGravity.LEFT.enumIndex) {
            this.b2.setGravity(3);
        } else if (i == TextGravity.CENTER.enumIndex) {
            this.b2.setGravity(17);
        } else {
            this.b2.setGravity(5);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0385 A[Catch:{ Exception -> 0x03e9, all -> 0x03e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x03be A[Catch:{ Exception -> 0x03e9, all -> 0x03e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x03d2 A[Catch:{ Exception -> 0x03e9, all -> 0x03e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0292 A[Catch:{ Exception -> 0x03e9, all -> 0x03e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x02b2 A[ADDED_TO_REGION, Catch:{ Exception -> 0x03e9, all -> 0x03e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x02cf A[Catch:{ Exception -> 0x03e9, all -> 0x03e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x02f8 A[Catch:{ Exception -> 0x03e9, all -> 0x03e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0346 A[Catch:{ Exception -> 0x03e9, all -> 0x03e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x034d A[Catch:{ Exception -> 0x03e9, all -> 0x03e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0361 A[Catch:{ Exception -> 0x03e9, all -> 0x03e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x036a A[Catch:{ Exception -> 0x03e9, all -> 0x03e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0371 A[Catch:{ Exception -> 0x03e9, all -> 0x03e7 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(android.util.AttributeSet r8) {
        /*
            r7 = this;
            android.content.Context r0 = r7.Y1
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r7.a2 = r0
            if (r8 == 0) goto L_0x0014
            java.lang.String r0 = "http://schemas.android.com/apk/res/android"
            java.lang.String r1 = "layout_width"
            java.lang.String r0 = r8.getAttributeValue(r0, r1)
            r7.f3 = r0
        L_0x0014:
            r7.removeAllViewsInLayout()
            r0 = 1
            if (r8 == 0) goto L_0x004d
            java.lang.String r1 = r7.f3
            if (r1 == 0) goto L_0x004d
            java.lang.String r2 = "-1"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0042
            java.lang.String r1 = r7.f3
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0042
            java.lang.String r1 = r7.f3
            java.lang.String r2 = "fill_parent"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0042
            java.lang.String r1 = r7.f3
            java.lang.String r2 = "match_parent"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x004d
        L_0x0042:
            android.view.LayoutInflater r1 = r7.a2
            int r2 = com.hbb20.R.layout.layout_full_width_code_picker
            android.view.View r1 = r1.inflate(r2, r7, r0)
            r7.Z1 = r1
            goto L_0x0057
        L_0x004d:
            android.view.LayoutInflater r1 = r7.a2
            int r2 = com.hbb20.R.layout.layout_code_picker
            android.view.View r1 = r1.inflate(r2, r7, r0)
            r7.Z1 = r1
        L_0x0057:
            android.view.View r1 = r7.Z1
            int r2 = com.hbb20.R.id.textView_selectedCountry
            android.view.View r1 = r1.findViewById(r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r7.b2 = r1
            android.view.View r1 = r7.Z1
            int r2 = com.hbb20.R.id.countryCodeHolder
            android.view.View r1 = r1.findViewById(r2)
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            r7.d2 = r1
            android.view.View r1 = r7.Z1
            int r2 = com.hbb20.R.id.imageView_arrow
            android.view.View r1 = r1.findViewById(r2)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r7.e2 = r1
            android.view.View r1 = r7.Z1
            int r2 = com.hbb20.R.id.image_flag
            android.view.View r1 = r1.findViewById(r2)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r7.f2 = r1
            android.view.View r1 = r7.Z1
            int r2 = com.hbb20.R.id.linear_flag_holder
            android.view.View r1 = r1.findViewById(r2)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r7.h2 = r1
            android.view.View r1 = r7.Z1
            int r2 = com.hbb20.R.id.linear_flag_border
            android.view.View r1 = r1.findViewById(r2)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r7.g2 = r1
            android.view.View r1 = r7.Z1
            int r2 = com.hbb20.R.id.rlClickConsumer
            android.view.View r1 = r1.findViewById(r2)
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            r7.k2 = r1
            r7.l2 = r7
            if (r8 == 0) goto L_0x03f5
            android.content.Context r1 = r7.Y1
            android.content.res.Resources$Theme r1 = r1.getTheme()
            int[] r2 = com.hbb20.R.styleable.CountryCodePicker
            r3 = 0
            android.content.res.TypedArray r8 = r1.obtainStyledAttributes(r8, r2, r3, r3)
            int r1 = com.hbb20.R.styleable.CountryCodePicker_ccp_showNameCode     // Catch:{ Exception -> 0x03e9 }
            boolean r1 = r8.getBoolean(r1, r0)     // Catch:{ Exception -> 0x03e9 }
            r7.r2 = r1     // Catch:{ Exception -> 0x03e9 }
            int r1 = com.hbb20.R.styleable.CountryCodePicker_ccp_autoFormatNumber     // Catch:{ Exception -> 0x03e9 }
            boolean r1 = r8.getBoolean(r1, r0)     // Catch:{ Exception -> 0x03e9 }
            r7.d3 = r1     // Catch:{ Exception -> 0x03e9 }
            int r1 = com.hbb20.R.styleable.CountryCodePicker_ccp_showPhoneCode     // Catch:{ Exception -> 0x03e9 }
            boolean r1 = r8.getBoolean(r1, r0)     // Catch:{ Exception -> 0x03e9 }
            r7.s2 = r1     // Catch:{ Exception -> 0x03e9 }
            int r2 = com.hbb20.R.styleable.CountryCodePicker_ccpDialog_showPhoneCode     // Catch:{ Exception -> 0x03e9 }
            boolean r1 = r8.getBoolean(r2, r1)     // Catch:{ Exception -> 0x03e9 }
            r7.t2 = r1     // Catch:{ Exception -> 0x03e9 }
            int r1 = com.hbb20.R.styleable.CountryCodePicker_ccpDialog_showNameCode     // Catch:{ Exception -> 0x03e9 }
            boolean r1 = r8.getBoolean(r1, r0)     // Catch:{ Exception -> 0x03e9 }
            r7.E2 = r1     // Catch:{ Exception -> 0x03e9 }
            int r1 = com.hbb20.R.styleable.CountryCodePicker_ccpDialog_showTitle     // Catch:{ Exception -> 0x03e9 }
            boolean r1 = r8.getBoolean(r1, r0)     // Catch:{ Exception -> 0x03e9 }
            r7.x2 = r1     // Catch:{ Exception -> 0x03e9 }
            int r1 = com.hbb20.R.styleable.CountryCodePicker_ccp_useFlagEmoji     // Catch:{ Exception -> 0x03e9 }
            boolean r1 = r8.getBoolean(r1, r3)     // Catch:{ Exception -> 0x03e9 }
            r7.G2 = r1     // Catch:{ Exception -> 0x03e9 }
            int r1 = com.hbb20.R.styleable.CountryCodePicker_ccp_useDummyEmojiForPreview     // Catch:{ Exception -> 0x03e9 }
            boolean r1 = r8.getBoolean(r1, r3)     // Catch:{ Exception -> 0x03e9 }
            r7.H2 = r1     // Catch:{ Exception -> 0x03e9 }
            int r1 = com.hbb20.R.styleable.CountryCodePicker_ccpDialog_showFlag     // Catch:{ Exception -> 0x03e9 }
            boolean r1 = r8.getBoolean(r1, r0)     // Catch:{ Exception -> 0x03e9 }
            r7.y2 = r1     // Catch:{ Exception -> 0x03e9 }
            int r1 = com.hbb20.R.styleable.CountryCodePicker_ccpDialog_initialScrollToSelection     // Catch:{ Exception -> 0x03e9 }
            boolean r1 = r8.getBoolean(r1, r3)     // Catch:{ Exception -> 0x03e9 }
            r7.F2 = r1     // Catch:{ Exception -> 0x03e9 }
            int r1 = com.hbb20.R.styleable.CountryCodePicker_ccp_showFullName     // Catch:{ Exception -> 0x03e9 }
            boolean r1 = r8.getBoolean(r1, r3)     // Catch:{ Exception -> 0x03e9 }
            r7.v2 = r1     // Catch:{ Exception -> 0x03e9 }
            int r1 = com.hbb20.R.styleable.CountryCodePicker_ccpDialog_showFastScroller     // Catch:{ Exception -> 0x03e9 }
            boolean r1 = r8.getBoolean(r1, r0)     // Catch:{ Exception -> 0x03e9 }
            r7.w2 = r1     // Catch:{ Exception -> 0x03e9 }
            int r1 = com.hbb20.R.styleable.CountryCodePicker_ccpDialog_fastScroller_bubbleColor     // Catch:{ Exception -> 0x03e9 }
            int r1 = r8.getColor(r1, r3)     // Catch:{ Exception -> 0x03e9 }
            r7.T2 = r1     // Catch:{ Exception -> 0x03e9 }
            int r1 = com.hbb20.R.styleable.CountryCodePicker_ccpDialog_fastScroller_handleColor     // Catch:{ Exception -> 0x03e9 }
            int r1 = r8.getColor(r1, r3)     // Catch:{ Exception -> 0x03e9 }
            r7.t3 = r1     // Catch:{ Exception -> 0x03e9 }
            int r1 = com.hbb20.R.styleable.CountryCodePicker_ccpDialog_fastScroller_bubbleTextAppearance     // Catch:{ Exception -> 0x03e9 }
            int r1 = r8.getResourceId(r1, r3)     // Catch:{ Exception -> 0x03e9 }
            r7.y3 = r1     // Catch:{ Exception -> 0x03e9 }
            int r1 = com.hbb20.R.styleable.CountryCodePicker_ccp_autoDetectLanguage     // Catch:{ Exception -> 0x03e9 }
            boolean r1 = r8.getBoolean(r1, r3)     // Catch:{ Exception -> 0x03e9 }
            r7.b3 = r1     // Catch:{ Exception -> 0x03e9 }
            int r1 = com.hbb20.R.styleable.CountryCodePicker_ccp_areaCodeDetectedCountry     // Catch:{ Exception -> 0x03e9 }
            boolean r1 = r8.getBoolean(r1, r0)     // Catch:{ Exception -> 0x03e9 }
            r7.D2 = r1     // Catch:{ Exception -> 0x03e9 }
            int r1 = com.hbb20.R.styleable.CountryCodePicker_ccp_rememberLastSelection     // Catch:{ Exception -> 0x03e9 }
            boolean r1 = r8.getBoolean(r1, r3)     // Catch:{ Exception -> 0x03e9 }
            r7.C2 = r1     // Catch:{ Exception -> 0x03e9 }
            int r1 = com.hbb20.R.styleable.CountryCodePicker_ccp_hintExampleNumber     // Catch:{ Exception -> 0x03e9 }
            boolean r1 = r8.getBoolean(r1, r3)     // Catch:{ Exception -> 0x03e9 }
            r7.e3 = r1     // Catch:{ Exception -> 0x03e9 }
            int r1 = com.hbb20.R.styleable.CountryCodePicker_ccp_internationalFormattingOnly     // Catch:{ Exception -> 0x03e9 }
            boolean r1 = r8.getBoolean(r1, r0)     // Catch:{ Exception -> 0x03e9 }
            r7.I2 = r1     // Catch:{ Exception -> 0x03e9 }
            int r1 = com.hbb20.R.styleable.CountryCodePicker_ccp_padding     // Catch:{ Exception -> 0x03e9 }
            android.content.Context r2 = r7.Y1     // Catch:{ Exception -> 0x03e9 }
            android.content.res.Resources r2 = r2.getResources()     // Catch:{ Exception -> 0x03e9 }
            int r4 = com.hbb20.R.dimen.ccp_padding     // Catch:{ Exception -> 0x03e9 }
            float r2 = r2.getDimension(r4)     // Catch:{ Exception -> 0x03e9 }
            float r1 = r8.getDimension(r1, r2)     // Catch:{ Exception -> 0x03e9 }
            int r1 = (int) r1     // Catch:{ Exception -> 0x03e9 }
            r7.o2 = r1     // Catch:{ Exception -> 0x03e9 }
            android.widget.RelativeLayout r2 = r7.k2     // Catch:{ Exception -> 0x03e9 }
            r2.setPadding(r1, r1, r1, r1)     // Catch:{ Exception -> 0x03e9 }
            int r1 = com.hbb20.R.styleable.CountryCodePicker_ccp_hintExampleNumberType     // Catch:{ Exception -> 0x03e9 }
            int r1 = r8.getInt(r1, r3)     // Catch:{ Exception -> 0x03e9 }
            com.hbb20.CountryCodePicker$PhoneNumberType[] r2 = com.hbb20.CountryCodePicker.PhoneNumberType.values()     // Catch:{ Exception -> 0x03e9 }
            r1 = r2[r1]     // Catch:{ Exception -> 0x03e9 }
            r7.J2 = r1     // Catch:{ Exception -> 0x03e9 }
            int r1 = com.hbb20.R.styleable.CountryCodePicker_ccp_selectionMemoryTag     // Catch:{ Exception -> 0x03e9 }
            java.lang.String r1 = r8.getString(r1)     // Catch:{ Exception -> 0x03e9 }
            r7.K2 = r1     // Catch:{ Exception -> 0x03e9 }
            if (r1 != 0) goto L_0x0192
            java.lang.String r1 = "CCP_last_selection"
            r7.K2 = r1     // Catch:{ Exception -> 0x03e9 }
        L_0x0192:
            int r1 = com.hbb20.R.styleable.CountryCodePicker_ccp_countryAutoDetectionPref     // Catch:{ Exception -> 0x03e9 }
            r2 = 123(0x7b, float:1.72E-43)
            int r1 = r8.getInt(r1, r2)     // Catch:{ Exception -> 0x03e9 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x03e9 }
            com.hbb20.CountryCodePicker$AutoDetectionPref r1 = com.hbb20.CountryCodePicker.AutoDetectionPref.getPrefForValue(r1)     // Catch:{ Exception -> 0x03e9 }
            r7.p2 = r1     // Catch:{ Exception -> 0x03e9 }
            int r1 = com.hbb20.R.styleable.CountryCodePicker_ccp_autoDetectCountry     // Catch:{ Exception -> 0x03e9 }
            boolean r1 = r8.getBoolean(r1, r3)     // Catch:{ Exception -> 0x03e9 }
            r7.c3 = r1     // Catch:{ Exception -> 0x03e9 }
            int r1 = com.hbb20.R.styleable.CountryCodePicker_ccp_showArrow     // Catch:{ Exception -> 0x03e9 }
            boolean r1 = r8.getBoolean(r1, r0)     // Catch:{ Exception -> 0x03e9 }
            r7.A2 = r1     // Catch:{ Exception -> 0x03e9 }
            if (r1 == 0) goto L_0x01bc
            android.widget.ImageView r1 = r7.e2     // Catch:{ Exception -> 0x03e9 }
            r1.setVisibility(r3)     // Catch:{ Exception -> 0x03e9 }
            goto L_0x01c3
        L_0x01bc:
            android.widget.ImageView r1 = r7.e2     // Catch:{ Exception -> 0x03e9 }
            r2 = 8
            r1.setVisibility(r2)     // Catch:{ Exception -> 0x03e9 }
        L_0x01c3:
            int r1 = com.hbb20.R.styleable.CountryCodePicker_ccpDialog_showCloseIcon     // Catch:{ Exception -> 0x03e9 }
            boolean r1 = r8.getBoolean(r1, r3)     // Catch:{ Exception -> 0x03e9 }
            r7.B2 = r1     // Catch:{ Exception -> 0x03e9 }
            int r1 = com.hbb20.R.styleable.CountryCodePicker_ccp_showFlag     // Catch:{ Exception -> 0x03e9 }
            boolean r1 = r8.getBoolean(r1, r0)     // Catch:{ Exception -> 0x03e9 }
            r7.k(r1)     // Catch:{ Exception -> 0x03e9 }
            int r1 = com.hbb20.R.styleable.CountryCodePicker_ccpDialog_keyboardAutoPopup     // Catch:{ Exception -> 0x03e9 }
            boolean r1 = r8.getBoolean(r1, r0)     // Catch:{ Exception -> 0x03e9 }
            r7.setDialogKeyboardAutoPopup(r1)     // Catch:{ Exception -> 0x03e9 }
            int r1 = com.hbb20.R.styleable.CountryCodePicker_ccp_defaultLanguage     // Catch:{ Exception -> 0x03e9 }
            com.hbb20.CountryCodePicker$Language r2 = com.hbb20.CountryCodePicker.Language.ENGLISH     // Catch:{ Exception -> 0x03e9 }
            int r4 = r2.ordinal()     // Catch:{ Exception -> 0x03e9 }
            int r1 = r8.getInt(r1, r4)     // Catch:{ Exception -> 0x03e9 }
            com.hbb20.CountryCodePicker.Language.values()     // Catch:{ Exception -> 0x03e9 }
            r4 = 37
            if (r1 >= r4) goto L_0x01f6
            com.hbb20.CountryCodePicker$Language[] r2 = com.hbb20.CountryCodePicker.Language.values()     // Catch:{ Exception -> 0x03e9 }
            r2 = r2[r1]     // Catch:{ Exception -> 0x03e9 }
        L_0x01f6:
            r7.X2 = r2     // Catch:{ Exception -> 0x03e9 }
            r7.n()     // Catch:{ Exception -> 0x03e9 }
            int r1 = com.hbb20.R.styleable.CountryCodePicker_ccp_customMasterCountries     // Catch:{ Exception -> 0x03e9 }
            java.lang.String r1 = r8.getString(r1)     // Catch:{ Exception -> 0x03e9 }
            r7.V2 = r1     // Catch:{ Exception -> 0x03e9 }
            int r1 = com.hbb20.R.styleable.CountryCodePicker_ccp_excludedCountries     // Catch:{ Exception -> 0x03e9 }
            java.lang.String r1 = r8.getString(r1)     // Catch:{ Exception -> 0x03e9 }
            r7.W2 = r1     // Catch:{ Exception -> 0x03e9 }
            boolean r1 = r7.isInEditMode()     // Catch:{ Exception -> 0x03e9 }
            if (r1 != 0) goto L_0x0214
            r7.h()     // Catch:{ Exception -> 0x03e9 }
        L_0x0214:
            int r1 = com.hbb20.R.styleable.CountryCodePicker_ccp_countryPreference     // Catch:{ Exception -> 0x03e9 }
            java.lang.String r1 = r8.getString(r1)     // Catch:{ Exception -> 0x03e9 }
            r7.S2 = r1     // Catch:{ Exception -> 0x03e9 }
            boolean r1 = r7.isInEditMode()     // Catch:{ Exception -> 0x03e9 }
            if (r1 != 0) goto L_0x0225
            r7.i()     // Catch:{ Exception -> 0x03e9 }
        L_0x0225:
            int r1 = com.hbb20.R.styleable.CountryCodePicker_ccp_textGravity     // Catch:{ Exception -> 0x03e9 }
            boolean r2 = r8.hasValue(r1)     // Catch:{ Exception -> 0x03e9 }
            if (r2 == 0) goto L_0x0233
            int r1 = r8.getInt(r1, r3)     // Catch:{ Exception -> 0x03e9 }
            r7.R2 = r1     // Catch:{ Exception -> 0x03e9 }
        L_0x0233:
            int r1 = r7.R2     // Catch:{ Exception -> 0x03e9 }
            r7.b(r1)     // Catch:{ Exception -> 0x03e9 }
            int r1 = com.hbb20.R.styleable.CountryCodePicker_ccp_defaultNameCode     // Catch:{ Exception -> 0x03e9 }
            java.lang.String r1 = r8.getString(r1)     // Catch:{ Exception -> 0x03e9 }
            r7.y = r1     // Catch:{ Exception -> 0x03e9 }
            java.lang.String r2 = "IN"
            if (r1 == 0) goto L_0x02a0
            int r1 = r1.length()     // Catch:{ Exception -> 0x03e9 }
            if (r1 == 0) goto L_0x02a0
            boolean r1 = r7.isInEditMode()     // Catch:{ Exception -> 0x03e9 }
            if (r1 != 0) goto L_0x0277
            android.content.Context r1 = r7.getContext()     // Catch:{ Exception -> 0x03e9 }
            com.hbb20.CountryCodePicker$Language r4 = r7.getLanguageToApply()     // Catch:{ Exception -> 0x03e9 }
            java.lang.String r5 = r7.y     // Catch:{ Exception -> 0x03e9 }
            i0.i.a r1 = i0.i.a.i(r1, r4, r5)     // Catch:{ Exception -> 0x03e9 }
            if (r1 == 0) goto L_0x028f
            android.content.Context r1 = r7.getContext()     // Catch:{ Exception -> 0x03e9 }
            com.hbb20.CountryCodePicker$Language r4 = r7.getLanguageToApply()     // Catch:{ Exception -> 0x03e9 }
            java.lang.String r5 = r7.y     // Catch:{ Exception -> 0x03e9 }
            i0.i.a r1 = i0.i.a.i(r1, r4, r5)     // Catch:{ Exception -> 0x03e9 }
            r7.setDefaultCountry(r1)     // Catch:{ Exception -> 0x03e9 }
            i0.i.a r1 = r7.j2     // Catch:{ Exception -> 0x03e9 }
            r7.setSelectedCountry(r1)     // Catch:{ Exception -> 0x03e9 }
            goto L_0x028d
        L_0x0277:
            java.lang.String r1 = r7.y     // Catch:{ Exception -> 0x03e9 }
            i0.i.a r1 = i0.i.a.g(r1)     // Catch:{ Exception -> 0x03e9 }
            if (r1 == 0) goto L_0x028f
            java.lang.String r1 = r7.y     // Catch:{ Exception -> 0x03e9 }
            i0.i.a r1 = i0.i.a.g(r1)     // Catch:{ Exception -> 0x03e9 }
            r7.setDefaultCountry(r1)     // Catch:{ Exception -> 0x03e9 }
            i0.i.a r1 = r7.j2     // Catch:{ Exception -> 0x03e9 }
            r7.setSelectedCountry(r1)     // Catch:{ Exception -> 0x03e9 }
        L_0x028d:
            r1 = r0
            goto L_0x0290
        L_0x028f:
            r1 = r3
        L_0x0290:
            if (r1 != 0) goto L_0x02a1
            i0.i.a r1 = i0.i.a.g(r2)     // Catch:{ Exception -> 0x03e9 }
            r7.setDefaultCountry(r1)     // Catch:{ Exception -> 0x03e9 }
            i0.i.a r1 = r7.j2     // Catch:{ Exception -> 0x03e9 }
            r7.setSelectedCountry(r1)     // Catch:{ Exception -> 0x03e9 }
            r1 = r0
            goto L_0x02a1
        L_0x02a0:
            r1 = r3
        L_0x02a1:
            int r4 = com.hbb20.R.styleable.CountryCodePicker_ccp_defaultPhoneCode     // Catch:{ Exception -> 0x03e9 }
            r5 = -1
            int r4 = r8.getInteger(r4, r5)     // Catch:{ Exception -> 0x03e9 }
            if (r1 != 0) goto L_0x02f2
            if (r4 == r5) goto L_0x02f2
            boolean r1 = r7.isInEditMode()     // Catch:{ Exception -> 0x03e9 }
            if (r1 != 0) goto L_0x02cf
            if (r4 == r5) goto L_0x02c6
            android.content.Context r1 = r7.getContext()     // Catch:{ Exception -> 0x03e9 }
            com.hbb20.CountryCodePicker$Language r5 = r7.getLanguageToApply()     // Catch:{ Exception -> 0x03e9 }
            java.util.List<i0.i.a> r6 = r7.Q2     // Catch:{ Exception -> 0x03e9 }
            i0.i.a r1 = i0.i.a.b(r1, r5, r6, r4)     // Catch:{ Exception -> 0x03e9 }
            if (r1 != 0) goto L_0x02c6
            r4 = 91
        L_0x02c6:
            r7.setDefaultCountryUsingPhoneCode(r4)     // Catch:{ Exception -> 0x03e9 }
            i0.i.a r1 = r7.j2     // Catch:{ Exception -> 0x03e9 }
            r7.setSelectedCountry(r1)     // Catch:{ Exception -> 0x03e9 }
            goto L_0x02f2
        L_0x02cf:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03e9 }
            r1.<init>()     // Catch:{ Exception -> 0x03e9 }
            r1.append(r4)     // Catch:{ Exception -> 0x03e9 }
            java.lang.String r4 = ""
            r1.append(r4)     // Catch:{ Exception -> 0x03e9 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x03e9 }
            i0.i.a r1 = i0.i.a.f(r1)     // Catch:{ Exception -> 0x03e9 }
            if (r1 != 0) goto L_0x02ec
            java.lang.String r1 = "91"
            i0.i.a r1 = i0.i.a.f(r1)     // Catch:{ Exception -> 0x03e9 }
        L_0x02ec:
            r7.setDefaultCountry(r1)     // Catch:{ Exception -> 0x03e9 }
            r7.setSelectedCountry(r1)     // Catch:{ Exception -> 0x03e9 }
        L_0x02f2:
            i0.i.a r1 = r7.getDefaultCountry()     // Catch:{ Exception -> 0x03e9 }
            if (r1 != 0) goto L_0x030a
            i0.i.a r1 = i0.i.a.g(r2)     // Catch:{ Exception -> 0x03e9 }
            r7.setDefaultCountry(r1)     // Catch:{ Exception -> 0x03e9 }
            i0.i.a r1 = r7.getSelectedCountry()     // Catch:{ Exception -> 0x03e9 }
            if (r1 != 0) goto L_0x030a
            i0.i.a r1 = r7.j2     // Catch:{ Exception -> 0x03e9 }
            r7.setSelectedCountry(r1)     // Catch:{ Exception -> 0x03e9 }
        L_0x030a:
            boolean r1 = r7.c3     // Catch:{ Exception -> 0x03e9 }
            if (r1 == 0) goto L_0x0317
            boolean r1 = r7.isInEditMode()     // Catch:{ Exception -> 0x03e9 }
            if (r1 != 0) goto L_0x0317
            r7.setAutoDetectedCountry(r0)     // Catch:{ Exception -> 0x03e9 }
        L_0x0317:
            boolean r1 = r7.C2     // Catch:{ Exception -> 0x03e9 }
            if (r1 == 0) goto L_0x0335
            boolean r1 = r7.isInEditMode()     // Catch:{ Exception -> 0x03e9 }
            if (r1 != 0) goto L_0x0335
            android.content.Context r1 = r7.Y1     // Catch:{ Exception -> 0x03e9 }
            java.lang.String r2 = r7.q     // Catch:{ Exception -> 0x03e9 }
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r3)     // Catch:{ Exception -> 0x03e9 }
            java.lang.String r2 = r7.K2     // Catch:{ Exception -> 0x03e9 }
            r4 = 0
            java.lang.String r1 = r1.getString(r2, r4)     // Catch:{ Exception -> 0x03e9 }
            if (r1 == 0) goto L_0x0335
            r7.setCountryForNameCode(r1)     // Catch:{ Exception -> 0x03e9 }
        L_0x0335:
            int r1 = com.hbb20.R.styleable.CountryCodePicker_ccp_arrowColor     // Catch:{ Exception -> 0x03e9 }
            r2 = -99
            int r1 = r8.getColor(r1, r2)     // Catch:{ Exception -> 0x03e9 }
            r7.setArrowColor(r1)     // Catch:{ Exception -> 0x03e9 }
            boolean r1 = r7.isInEditMode()     // Catch:{ Exception -> 0x03e9 }
            if (r1 == 0) goto L_0x034d
            int r1 = com.hbb20.R.styleable.CountryCodePicker_ccp_contentColor     // Catch:{ Exception -> 0x03e9 }
            int r1 = r8.getColor(r1, r2)     // Catch:{ Exception -> 0x03e9 }
            goto L_0x035f
        L_0x034d:
            int r1 = com.hbb20.R.styleable.CountryCodePicker_ccp_contentColor     // Catch:{ Exception -> 0x03e9 }
            android.content.Context r4 = r7.Y1     // Catch:{ Exception -> 0x03e9 }
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ Exception -> 0x03e9 }
            int r5 = com.hbb20.R.color.defaultContentColor     // Catch:{ Exception -> 0x03e9 }
            int r4 = r4.getColor(r5)     // Catch:{ Exception -> 0x03e9 }
            int r1 = r8.getColor(r1, r4)     // Catch:{ Exception -> 0x03e9 }
        L_0x035f:
            if (r1 == r2) goto L_0x0364
            r7.setContentColor(r1)     // Catch:{ Exception -> 0x03e9 }
        L_0x0364:
            boolean r1 = r7.isInEditMode()     // Catch:{ Exception -> 0x03e9 }
            if (r1 == 0) goto L_0x0371
            int r1 = com.hbb20.R.styleable.CountryCodePicker_ccp_flagBorderColor     // Catch:{ Exception -> 0x03e9 }
            int r1 = r8.getColor(r1, r3)     // Catch:{ Exception -> 0x03e9 }
            goto L_0x0383
        L_0x0371:
            int r1 = com.hbb20.R.styleable.CountryCodePicker_ccp_flagBorderColor     // Catch:{ Exception -> 0x03e9 }
            android.content.Context r2 = r7.Y1     // Catch:{ Exception -> 0x03e9 }
            android.content.res.Resources r2 = r2.getResources()     // Catch:{ Exception -> 0x03e9 }
            int r4 = com.hbb20.R.color.defaultBorderFlagColor     // Catch:{ Exception -> 0x03e9 }
            int r2 = r2.getColor(r4)     // Catch:{ Exception -> 0x03e9 }
            int r1 = r8.getColor(r1, r2)     // Catch:{ Exception -> 0x03e9 }
        L_0x0383:
            if (r1 == 0) goto L_0x0388
            r7.setFlagBorderColor(r1)     // Catch:{ Exception -> 0x03e9 }
        L_0x0388:
            int r1 = com.hbb20.R.styleable.CountryCodePicker_ccpDialog_backgroundColor     // Catch:{ Exception -> 0x03e9 }
            int r1 = r8.getColor(r1, r3)     // Catch:{ Exception -> 0x03e9 }
            r7.setDialogBackgroundColor(r1)     // Catch:{ Exception -> 0x03e9 }
            int r1 = com.hbb20.R.styleable.CountryCodePicker_ccpDialog_background     // Catch:{ Exception -> 0x03e9 }
            int r1 = r8.getResourceId(r1, r3)     // Catch:{ Exception -> 0x03e9 }
            r7.setDialogBackground(r1)     // Catch:{ Exception -> 0x03e9 }
            int r1 = com.hbb20.R.styleable.CountryCodePicker_ccpDialog_textColor     // Catch:{ Exception -> 0x03e9 }
            int r1 = r8.getColor(r1, r3)     // Catch:{ Exception -> 0x03e9 }
            r7.setDialogTextColor(r1)     // Catch:{ Exception -> 0x03e9 }
            int r1 = com.hbb20.R.styleable.CountryCodePicker_ccpDialog_searchEditTextTint     // Catch:{ Exception -> 0x03e9 }
            int r1 = r8.getColor(r1, r3)     // Catch:{ Exception -> 0x03e9 }
            r7.setDialogSearchEditTextTintColor(r1)     // Catch:{ Exception -> 0x03e9 }
            int r1 = com.hbb20.R.styleable.CountryCodePicker_ccpDialog_cornerRadius     // Catch:{ Exception -> 0x03e9 }
            r2 = 0
            float r1 = r8.getDimension(r1, r2)     // Catch:{ Exception -> 0x03e9 }
            r7.setDialogCornerRaius(r1)     // Catch:{ Exception -> 0x03e9 }
            int r1 = com.hbb20.R.styleable.CountryCodePicker_ccp_textSize     // Catch:{ Exception -> 0x03e9 }
            int r1 = r8.getDimensionPixelSize(r1, r3)     // Catch:{ Exception -> 0x03e9 }
            if (r1 <= 0) goto L_0x03ca
            android.widget.TextView r2 = r7.b2     // Catch:{ Exception -> 0x03e9 }
            float r4 = (float) r1     // Catch:{ Exception -> 0x03e9 }
            r2.setTextSize(r3, r4)     // Catch:{ Exception -> 0x03e9 }
            r7.setFlagSize(r1)     // Catch:{ Exception -> 0x03e9 }
            r7.setArrowSize(r1)     // Catch:{ Exception -> 0x03e9 }
        L_0x03ca:
            int r1 = com.hbb20.R.styleable.CountryCodePicker_ccp_arrowSize     // Catch:{ Exception -> 0x03e9 }
            int r1 = r8.getDimensionPixelSize(r1, r3)     // Catch:{ Exception -> 0x03e9 }
            if (r1 <= 0) goto L_0x03d5
            r7.setArrowSize(r1)     // Catch:{ Exception -> 0x03e9 }
        L_0x03d5:
            int r1 = com.hbb20.R.styleable.CountryCodePicker_ccpDialog_allowSearch     // Catch:{ Exception -> 0x03e9 }
            boolean r1 = r8.getBoolean(r1, r0)     // Catch:{ Exception -> 0x03e9 }
            r7.z2 = r1     // Catch:{ Exception -> 0x03e9 }
            int r1 = com.hbb20.R.styleable.CountryCodePicker_ccp_clickable     // Catch:{ Exception -> 0x03e9 }
            boolean r0 = r8.getBoolean(r1, r0)     // Catch:{ Exception -> 0x03e9 }
            r7.setCcpClickable(r0)     // Catch:{ Exception -> 0x03e9 }
            goto L_0x03ed
        L_0x03e7:
            r0 = move-exception
            goto L_0x03f1
        L_0x03e9:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x03e7 }
        L_0x03ed:
            r8.recycle()
            goto L_0x03f5
        L_0x03f1:
            r8.recycle()
            throw r0
        L_0x03f5:
            android.widget.RelativeLayout r8 = r7.k2
            android.view.View$OnClickListener r0 = r7.B3
            r8.setOnClickListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hbb20.CountryCodePicker.c(android.util.AttributeSet):void");
    }

    public final boolean d(i0.i.a aVar, List<i0.i.a> list) {
        for (i0.i.a aVar2 : list) {
            if (aVar2.Y1.equalsIgnoreCase(aVar.Y1)) {
                return true;
            }
        }
        return false;
    }

    public final boolean e(String str) {
        for (i0.i.a aVar : i0.i.a.j(this.Y1, this)) {
            if (aVar.Y1.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public boolean f() {
        try {
            if (getEditText_registeredCarrierNumber() == null || getEditText_registeredCarrierNumber().getText().length() == 0) {
                if (getEditText_registeredCarrierNumber() == null) {
                    Toast.makeText(this.Y1, "No editText for Carrier number found.", 0).show();
                }
                return false;
            }
            PhoneNumberUtil phoneUtil = getPhoneUtil();
            return getPhoneUtil().q(phoneUtil.y("+" + this.i2.Z1 + getEditText_registeredCarrierNumber().getText().toString(), this.i2.Y1));
        } catch (NumberParseException unused) {
        }
    }

    public void g(String str) {
        boolean z;
        String str2 = str;
        CountryCodePicker countryCodePicker = this.l2;
        Field field = l.a;
        l.e = countryCodePicker.getContext();
        l.d = new Dialog(l.e);
        countryCodePicker.h();
        countryCodePicker.i();
        List<i0.i.a> j = i0.i.a.j(l.e, countryCodePicker);
        l.d.requestWindowFeature(1);
        l.d.getWindow().setContentView(R.layout.layout_picker_dialog);
        l.d.getWindow().setBackgroundDrawable(h0.i.b.a.getDrawable(l.e, 17170445));
        RecyclerView recyclerView = (RecyclerView) l.d.findViewById(R.id.recycler_countryDialog);
        TextView textView = (TextView) l.d.findViewById(R.id.textView_title);
        RelativeLayout relativeLayout = (RelativeLayout) l.d.findViewById(R.id.rl_query_holder);
        ImageView imageView = (ImageView) l.d.findViewById(R.id.img_clear_query);
        EditText editText = (EditText) l.d.findViewById(R.id.editText_search);
        TextView textView2 = (TextView) l.d.findViewById(R.id.textView_noresult);
        CardView cardView = (CardView) l.d.findViewById(R.id.cardViewRoot);
        ImageView imageView2 = (ImageView) l.d.findViewById(R.id.img_dismiss);
        if (!countryCodePicker.z2 || !countryCodePicker.Z2) {
            l.d.getWindow().setSoftInputMode(2);
        } else {
            new f0(l.d.getWindow(), editText).a.b(8);
            editText.requestFocus();
        }
        try {
            if (countryCodePicker.getDialogTypeFace() != null) {
                if (countryCodePicker.getDialogTypeFaceStyle() != -99) {
                    textView2.setTypeface(countryCodePicker.getDialogTypeFace(), countryCodePicker.getDialogTypeFaceStyle());
                    editText.setTypeface(countryCodePicker.getDialogTypeFace(), countryCodePicker.getDialogTypeFaceStyle());
                    textView.setTypeface(countryCodePicker.getDialogTypeFace(), countryCodePicker.getDialogTypeFaceStyle());
                } else {
                    textView2.setTypeface(countryCodePicker.getDialogTypeFace());
                    editText.setTypeface(countryCodePicker.getDialogTypeFace());
                    textView.setTypeface(countryCodePicker.getDialogTypeFace());
                }
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        if (countryCodePicker.getDialogBackgroundColor() != 0) {
            cardView.setCardBackgroundColor(countryCodePicker.getDialogBackgroundColor());
        }
        if (countryCodePicker.getDialogBackgroundResId() != 0) {
            cardView.setBackgroundResource(countryCodePicker.getDialogBackgroundResId());
        }
        cardView.setRadius(countryCodePicker.getDialogCornerRadius());
        if (countryCodePicker.B2) {
            imageView2.setVisibility(0);
            imageView2.setOnClickListener(new i());
        } else {
            imageView2.setVisibility(8);
        }
        if (!countryCodePicker.getCcpDialogShowTitle()) {
            textView.setVisibility(8);
        }
        if (countryCodePicker.getDialogTextColor() != 0) {
            int dialogTextColor = countryCodePicker.getDialogTextColor();
            imageView.setColorFilter(dialogTextColor);
            imageView2.setColorFilter(dialogTextColor);
            textView.setTextColor(dialogTextColor);
            textView2.setTextColor(dialogTextColor);
            editText.setTextColor(dialogTextColor);
            editText.setHintTextColor(Color.argb(100, Color.red(dialogTextColor), Color.green(dialogTextColor), Color.blue(dialogTextColor)));
        }
        if (countryCodePicker.getDialogSearchEditTextTintColor() != 0) {
            editText.setBackgroundTintList(ColorStateList.valueOf(countryCodePicker.getDialogSearchEditTextTintColor()));
            int dialogSearchEditTextTintColor = countryCodePicker.getDialogSearchEditTextTintColor();
            Field field2 = l.b;
            if (field2 != null) {
                try {
                    Drawable drawable = editText.getContext().getDrawable(l.c.getInt(editText));
                    drawable.setColorFilter(dialogSearchEditTextTintColor, PorterDuff.Mode.SRC_IN);
                    field2.set(l.a.get(editText), new Drawable[]{drawable, drawable});
                } catch (Exception unused) {
                }
            }
        }
        textView.setText(countryCodePicker.getDialogTitle());
        editText.setHint(countryCodePicker.getSearchHintText());
        textView2.setText(countryCodePicker.getNoResultACK());
        if (!countryCodePicker.z2) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) recyclerView.getLayoutParams();
            layoutParams.height = -2;
            recyclerView.setLayoutParams(layoutParams);
        }
        h hVar = new h(l.e, j, countryCodePicker, relativeLayout, editText, textView2, l.d, imageView);
        recyclerView.setLayoutManager(new LinearLayoutManager(l.e));
        recyclerView.setAdapter(hVar);
        FastScroller fastScroller = (FastScroller) l.d.findViewById(R.id.fastscroll);
        fastScroller.setRecyclerView(recyclerView);
        if (countryCodePicker.w2) {
            if (countryCodePicker.getFastScrollerBubbleColor() != 0) {
                fastScroller.setBubbleColor(countryCodePicker.getFastScrollerBubbleColor());
            }
            if (countryCodePicker.getFastScrollerHandleColor() != 0) {
                fastScroller.setHandleColor(countryCodePicker.getFastScrollerHandleColor());
            }
            if (countryCodePicker.getFastScrollerBubbleTextAppearance() != 0) {
                try {
                    fastScroller.setBubbleTextAppearance(countryCodePicker.getFastScrollerBubbleTextAppearance());
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        } else {
            fastScroller.setVisibility(8);
        }
        l.d.setOnDismissListener(new j(countryCodePicker));
        l.d.setOnCancelListener(new k(countryCodePicker));
        if (str2 != null) {
            List<i0.i.a> list = countryCodePicker.Q2;
            if (list != null) {
                Iterator<i0.i.a> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().Y1.equalsIgnoreCase(str2)) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z = false;
            if (!z) {
                List<i0.i.a> list2 = countryCodePicker.Q2;
                int size = (list2 == null || list2.size() <= 0) ? 0 : countryCodePicker.Q2.size() + 1;
                int i = 0;
                while (true) {
                    if (i >= j.size()) {
                        break;
                    } else if (j.get(i).Y1.equalsIgnoreCase(str2)) {
                        recyclerView.scrollToPosition(i + size);
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        l.d.show();
        if (countryCodePicker.getDialogEventsListener() != null) {
            countryCodePicker.getDialogEventsListener().b(l.d);
        }
    }

    public boolean getCcpDialogShowFlag() {
        return this.y2;
    }

    public boolean getCcpDialogShowNameCode() {
        return this.E2;
    }

    public boolean getCcpDialogShowTitle() {
        return this.x2;
    }

    public int getContentColor() {
        return this.L2;
    }

    public TextGravity getCurrentTextGravity() {
        return this.m2;
    }

    public Language getCustomDefaultLanguage() {
        return this.X2;
    }

    public List<i0.i.a> getCustomMasterCountriesList() {
        return this.U2;
    }

    public String getCustomMasterCountriesParam() {
        return this.V2;
    }

    public String getDefaultCountryCode() {
        return this.j2.Z1;
    }

    public int getDefaultCountryCodeAsInt() {
        try {
            return Integer.parseInt(getDefaultCountryCode());
        } catch (Exception e4) {
            e4.printStackTrace();
            return 0;
        }
    }

    public String getDefaultCountryCodeWithPlus() {
        StringBuilder P0 = i0.d.a.a.a.P0("+");
        P0.append(getDefaultCountryCode());
        return P0.toString();
    }

    public String getDefaultCountryName() {
        i0.i.a defaultCountry = getDefaultCountry();
        if (defaultCountry == null) {
            return "";
        }
        return defaultCountry.a2;
    }

    public String getDefaultCountryNameCode() {
        i0.i.a defaultCountry = getDefaultCountry();
        if (defaultCountry == null) {
            return "";
        }
        return defaultCountry.Y1.toUpperCase();
    }

    public int getDialogBackgroundColor() {
        return this.v3;
    }

    public int getDialogBackgroundResId() {
        return this.u3;
    }

    public float getDialogCornerRadius() {
        return this.z3;
    }

    public d getDialogEventsListener() {
        return this.r3;
    }

    public int getDialogSearchEditTextTintColor() {
        return this.x3;
    }

    public int getDialogTextColor() {
        return this.w3;
    }

    public String getDialogTitle() {
        String str;
        Context context = this.Y1;
        Language languageToApply = getLanguageToApply();
        Language language = i0.i.a.c;
        if (language == null || language != languageToApply || (str = i0.i.a.d) == null || str.length() == 0) {
            i0.i.a.s(context, languageToApply);
        }
        String str2 = i0.i.a.d;
        c cVar = this.s3;
        return cVar != null ? cVar.c(getLanguageToApply(), str2) : str2;
    }

    public Typeface getDialogTypeFace() {
        return this.O2;
    }

    public int getDialogTypeFaceStyle() {
        return this.P2;
    }

    public EditText getEditText_registeredCarrierNumber() {
        return this.c2;
    }

    public int getFastScrollerBubbleColor() {
        return this.T2;
    }

    public int getFastScrollerBubbleTextAppearance() {
        return this.y3;
    }

    public int getFastScrollerHandleColor() {
        return this.t3;
    }

    public String getFormattedFullNumber() {
        try {
            Phonenumber$PhoneNumber enteredPhoneNumber = getEnteredPhoneNumber();
            return "+" + getPhoneUtil().e(enteredPhoneNumber, PhoneNumberUtil.PhoneNumberFormat.INTERNATIONAL).substring(1);
        } catch (NumberParseException unused) {
            Log.e("CCP", "getFullNumber: Could not parse number");
            return getFullNumberWithPlus();
        }
    }

    public String getFullNumber() {
        try {
            return getPhoneUtil().e(getEnteredPhoneNumber(), PhoneNumberUtil.PhoneNumberFormat.E164).substring(1);
        } catch (NumberParseException unused) {
            Log.e("CCP", "getFullNumber: Could not parse number");
            return getSelectedCountryCode() + PhoneNumberUtil.w(this.c2.getText().toString());
        }
    }

    public String getFullNumberWithPlus() {
        StringBuilder P0 = i0.d.a.a.a.P0("+");
        P0.append(getFullNumber());
        return P0.toString();
    }

    public RelativeLayout getHolder() {
        return this.d2;
    }

    public ImageView getImageViewFlag() {
        return this.f2;
    }

    public Language getLanguageToApply() {
        if (this.Y2 == null) {
            n();
        }
        return this.Y2;
    }

    public String getNoResultACK() {
        String str;
        Context context = this.Y1;
        Language languageToApply = getLanguageToApply();
        Language language = i0.i.a.c;
        if (language == null || language != languageToApply || (str = i0.i.a.x) == null || str.length() == 0) {
            i0.i.a.s(context, languageToApply);
        }
        String str2 = i0.i.a.x;
        c cVar = this.s3;
        return cVar != null ? cVar.b(getLanguageToApply(), str2) : str2;
    }

    public String getSearchHintText() {
        String str;
        Context context = this.Y1;
        Language languageToApply = getLanguageToApply();
        Language language = i0.i.a.c;
        if (language == null || language != languageToApply || (str = i0.i.a.q) == null || str.length() == 0) {
            i0.i.a.s(context, languageToApply);
        }
        String str2 = i0.i.a.q;
        c cVar = this.s3;
        return cVar != null ? cVar.a(getLanguageToApply(), str2) : str2;
    }

    public String getSelectedCountryCode() {
        return getSelectedCountry().Z1;
    }

    public int getSelectedCountryCodeAsInt() {
        try {
            return Integer.parseInt(getSelectedCountryCode());
        } catch (Exception e4) {
            e4.printStackTrace();
            return 0;
        }
    }

    public String getSelectedCountryCodeWithPlus() {
        StringBuilder P0 = i0.d.a.a.a.P0("+");
        P0.append(getSelectedCountryCode());
        return P0.toString();
    }

    public String getSelectedCountryEnglishName() {
        return getSelectedCountry().b2;
    }

    public int getSelectedCountryFlagResourceId() {
        return getSelectedCountry().c2;
    }

    public String getSelectedCountryName() {
        return getSelectedCountry().a2;
    }

    public String getSelectedCountryNameCode() {
        return getSelectedCountry().Y1.toUpperCase();
    }

    public TextView getTextView_selectedCountry() {
        return this.b2;
    }

    public void h() {
        String str = this.V2;
        if (str == null || str.length() == 0) {
            String str2 = this.W2;
            if (str2 == null || str2.length() == 0) {
                this.U2 = null;
            } else {
                this.W2 = this.W2.toLowerCase();
                List<i0.i.a> q4 = i0.i.a.q(this.Y1, getLanguageToApply());
                ArrayList arrayList = new ArrayList();
                for (i0.i.a next : q4) {
                    if (!this.W2.contains(next.Y1.toLowerCase())) {
                        arrayList.add(next);
                    }
                }
                if (arrayList.size() > 0) {
                    this.U2 = arrayList;
                } else {
                    this.U2 = null;
                }
            }
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (String i : this.V2.split(InstabugDbContract.COMMA_SEP)) {
                i0.i.a i4 = i0.i.a.i(getContext(), getLanguageToApply(), i);
                if (i4 != null && !d(i4, arrayList2)) {
                    arrayList2.add(i4);
                }
            }
            if (arrayList2.size() == 0) {
                this.U2 = null;
            } else {
                this.U2 = arrayList2;
            }
        }
        List<i0.i.a> list = this.U2;
        if (list != null) {
            for (i0.i.a t : list) {
                t.t();
            }
        }
    }

    public void i() {
        i0.i.a aVar;
        String str = this.S2;
        if (str == null || str.length() == 0) {
            this.Q2 = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (String str2 : this.S2.split(InstabugDbContract.COMMA_SEP)) {
                Context context = getContext();
                List<i0.i.a> list = this.U2;
                Language languageToApply = getLanguageToApply();
                if (list != null && list.size() != 0) {
                    Iterator<i0.i.a> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            aVar = null;
                            break;
                        }
                        aVar = it.next();
                        if (aVar.Y1.equalsIgnoreCase(str2)) {
                            break;
                        }
                    }
                } else {
                    aVar = i0.i.a.i(context, languageToApply, str2);
                }
                if (aVar != null && !d(aVar, arrayList)) {
                    arrayList.add(aVar);
                }
            }
            if (arrayList.size() == 0) {
                this.Q2 = null;
            } else {
                this.Q2 = arrayList;
            }
        }
        List<i0.i.a> list2 = this.Q2;
        if (list2 != null) {
            for (i0.i.a t : list2) {
                t.t();
            }
        }
    }

    public void j() {
        i0.i.a i = i0.i.a.i(getContext(), getLanguageToApply(), getDefaultCountryNameCode());
        this.j2 = i;
        setSelectedCountry(i);
    }

    public void k(boolean z) {
        this.u2 = z;
        if (!z) {
            this.h2.setVisibility(8);
        } else if (this.G2) {
            this.h2.setVisibility(8);
        } else {
            this.h2.setVisibility(0);
        }
        if (!isInEditMode()) {
            setSelectedCountry(this.i2);
        }
    }

    public final void l() {
        EditText editText = this.c2;
        if (editText != null && this.i2 != null) {
            String w = PhoneNumberUtil.w(getEditText_registeredCarrierNumber().getText().toString());
            o oVar = this.h3;
            if (oVar != null) {
                this.c2.removeTextChangedListener(oVar);
            }
            TextWatcher textWatcher = this.j3;
            if (textWatcher != null) {
                this.c2.removeTextChangedListener(textWatcher);
            }
            if (this.d3) {
                o oVar2 = new o(this.Y1, getSelectedCountryNameCode(), getSelectedCountryCodeAsInt(), this.I2);
                this.h3 = oVar2;
                this.c2.addTextChangedListener(oVar2);
            }
            if (this.D2) {
                TextWatcher countryDetectorTextWatcher = getCountryDetectorTextWatcher();
                this.j3 = countryDetectorTextWatcher;
                this.c2.addTextChangedListener(countryDetectorTextWatcher);
            }
            this.c2.setText("");
            this.c2.setText(w);
            EditText editText2 = this.c2;
            editText2.setSelection(editText2.getText().length());
        } else if (editText == null) {
            StringBuilder P0 = i0.d.a.a.a.P0("updateFormattingTextWatcher: EditText not registered ");
            P0.append(this.K2);
            Log.v("CCP", P0.toString());
        } else {
            StringBuilder P02 = i0.d.a.a.a.P0("updateFormattingTextWatcher: selected country is null ");
            P02.append(this.K2);
            Log.v("CCP", P02.toString());
        }
    }

    public final void m() {
        if (this.c2 != null && this.e3) {
            PhoneNumberUtil phoneUtil = getPhoneUtil();
            String selectedCountryNameCode = getSelectedCountryNameCode();
            PhoneNumberUtil.PhoneNumberType selectedHintNumberType = getSelectedHintNumberType();
            Phonenumber$PhoneNumber phonenumber$PhoneNumber = null;
            if (!phoneUtil.r(selectedCountryNameCode)) {
                PhoneNumberUtil.a.log(Level.WARNING, "Invalid or unknown region code provided: " + selectedCountryNameCode);
            } else {
                Phonemetadata$PhoneNumberDesc l = phoneUtil.l(phoneUtil.i(selectedCountryNameCode), selectedHintNumberType);
                try {
                    if (l.y) {
                        phonenumber$PhoneNumber = phoneUtil.y(l.Y1, selectedCountryNameCode);
                    }
                } catch (NumberParseException e4) {
                    PhoneNumberUtil.a.log(Level.SEVERE, e4.toString());
                }
            }
            String str = "";
            if (phonenumber$PhoneNumber != null) {
                str = PhoneNumberUtils.formatNumber(getSelectedCountryCodeWithPlus() + (phonenumber$PhoneNumber.d + str), getSelectedCountryNameCode());
                if (str != null) {
                    str = str.substring(getSelectedCountryCodeWithPlus().length()).trim();
                }
            }
            if (str == null) {
                str = this.n2;
            }
            this.c2.setHint(str);
        }
    }

    public final void n() {
        if (isInEditMode()) {
            Language language = this.X2;
            if (language != null) {
                this.Y2 = language;
            } else {
                this.Y2 = Language.ENGLISH;
            }
        } else if (this.b3) {
            Language cCPLanguageFromLocale = getCCPLanguageFromLocale();
            if (cCPLanguageFromLocale != null) {
                this.Y2 = cCPLanguageFromLocale;
            } else if (getCustomDefaultLanguage() != null) {
                this.Y2 = getCustomDefaultLanguage();
            } else {
                this.Y2 = Language.ENGLISH;
            }
        } else if (getCustomDefaultLanguage() != null) {
            this.Y2 = this.X2;
        } else {
            this.Y2 = Language.ENGLISH;
        }
    }

    public void onDetachedFromWindow() {
        Dialog dialog = l.d;
        if (dialog != null) {
            dialog.dismiss();
        }
        l.d = null;
        l.e = null;
        super.onDetachedFromWindow();
    }

    public void setArrowColor(int i) {
        this.M2 = i;
        if (i == -99) {
            int i4 = this.L2;
            if (i4 != -99) {
                this.e2.setColorFilter(i4, PorterDuff.Mode.SRC_IN);
                return;
            }
            return;
        }
        this.e2.setColorFilter(i, PorterDuff.Mode.SRC_IN);
    }

    public void setArrowSize(int i) {
        if (i > 0) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.e2.getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = i;
            this.e2.setLayoutParams(layoutParams);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b6 A[Catch:{ Exception -> 0x00c9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00b5 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setAutoDetectedCountry(boolean r7) {
        /*
            r6 = this;
            r0 = 0
            r1 = r0
            r2 = r1
        L_0x0003:
            com.hbb20.CountryCodePicker$AutoDetectionPref r3 = r6.p2     // Catch:{ Exception -> 0x00c9 }
            java.lang.String r3 = r3.representation     // Catch:{ Exception -> 0x00c9 }
            int r3 = r3.length()     // Catch:{ Exception -> 0x00c9 }
            if (r1 >= r3) goto L_0x00c1
            com.hbb20.CountryCodePicker$AutoDetectionPref r3 = r6.p2     // Catch:{ Exception -> 0x00c9 }
            java.lang.String r3 = r3.representation     // Catch:{ Exception -> 0x00c9 }
            char r3 = r3.charAt(r1)     // Catch:{ Exception -> 0x00c9 }
            java.lang.String r4 = "phone"
            r5 = 1
            switch(r3) {
                case 49: goto L_0x0082;
                case 50: goto L_0x0052;
                case 51: goto L_0x001d;
                default: goto L_0x001b;
            }
        L_0x001b:
            goto L_0x00b3
        L_0x001d:
            android.content.Context r2 = r6.Y1     // Catch:{ Exception -> 0x004d }
            android.content.res.Resources r2 = r2.getResources()     // Catch:{ Exception -> 0x004d }
            android.content.res.Configuration r2 = r2.getConfiguration()     // Catch:{ Exception -> 0x004d }
            java.util.Locale r2 = r2.locale     // Catch:{ Exception -> 0x004d }
            java.lang.String r2 = r2.getCountry()     // Catch:{ Exception -> 0x004d }
            if (r2 == 0) goto L_0x00b1
            boolean r3 = r2.isEmpty()     // Catch:{ Exception -> 0x004d }
            if (r3 != 0) goto L_0x00b1
            boolean r3 = r6.e(r2)     // Catch:{ Exception -> 0x004d }
            if (r3 != 0) goto L_0x003d
            goto L_0x00b1
        L_0x003d:
            android.content.Context r3 = r6.getContext()     // Catch:{ Exception -> 0x004d }
            com.hbb20.CountryCodePicker$Language r4 = r6.getLanguageToApply()     // Catch:{ Exception -> 0x004d }
            i0.i.a r2 = i0.i.a.i(r3, r4, r2)     // Catch:{ Exception -> 0x004d }
            r6.setSelectedCountry(r2)     // Catch:{ Exception -> 0x004d }
            goto L_0x00b2
        L_0x004d:
            r2 = move-exception
            r2.printStackTrace()     // Catch:{ Exception -> 0x00c9 }
            goto L_0x00b1
        L_0x0052:
            android.content.Context r2 = r6.Y1     // Catch:{ Exception -> 0x007d }
            java.lang.Object r2 = r2.getSystemService(r4)     // Catch:{ Exception -> 0x007d }
            android.telephony.TelephonyManager r2 = (android.telephony.TelephonyManager) r2     // Catch:{ Exception -> 0x007d }
            java.lang.String r2 = r2.getNetworkCountryIso()     // Catch:{ Exception -> 0x007d }
            if (r2 == 0) goto L_0x00b1
            boolean r3 = r2.isEmpty()     // Catch:{ Exception -> 0x007d }
            if (r3 != 0) goto L_0x00b1
            boolean r3 = r6.e(r2)     // Catch:{ Exception -> 0x007d }
            if (r3 != 0) goto L_0x006d
            goto L_0x00b1
        L_0x006d:
            android.content.Context r3 = r6.getContext()     // Catch:{ Exception -> 0x007d }
            com.hbb20.CountryCodePicker$Language r4 = r6.getLanguageToApply()     // Catch:{ Exception -> 0x007d }
            i0.i.a r2 = i0.i.a.i(r3, r4, r2)     // Catch:{ Exception -> 0x007d }
            r6.setSelectedCountry(r2)     // Catch:{ Exception -> 0x007d }
            goto L_0x00b2
        L_0x007d:
            r2 = move-exception
            r2.printStackTrace()     // Catch:{ Exception -> 0x00c9 }
            goto L_0x00b1
        L_0x0082:
            android.content.Context r2 = r6.Y1     // Catch:{ Exception -> 0x00ad }
            java.lang.Object r2 = r2.getSystemService(r4)     // Catch:{ Exception -> 0x00ad }
            android.telephony.TelephonyManager r2 = (android.telephony.TelephonyManager) r2     // Catch:{ Exception -> 0x00ad }
            java.lang.String r2 = r2.getSimCountryIso()     // Catch:{ Exception -> 0x00ad }
            if (r2 == 0) goto L_0x00b1
            boolean r3 = r2.isEmpty()     // Catch:{ Exception -> 0x00ad }
            if (r3 != 0) goto L_0x00b1
            boolean r3 = r6.e(r2)     // Catch:{ Exception -> 0x00ad }
            if (r3 != 0) goto L_0x009d
            goto L_0x00b1
        L_0x009d:
            android.content.Context r3 = r6.getContext()     // Catch:{ Exception -> 0x00ad }
            com.hbb20.CountryCodePicker$Language r4 = r6.getLanguageToApply()     // Catch:{ Exception -> 0x00ad }
            i0.i.a r2 = i0.i.a.i(r3, r4, r2)     // Catch:{ Exception -> 0x00ad }
            r6.setSelectedCountry(r2)     // Catch:{ Exception -> 0x00ad }
            goto L_0x00b2
        L_0x00ad:
            r2 = move-exception
            r2.printStackTrace()     // Catch:{ Exception -> 0x00c9 }
        L_0x00b1:
            r5 = r0
        L_0x00b2:
            r2 = r5
        L_0x00b3:
            if (r2 == 0) goto L_0x00b6
            goto L_0x00c1
        L_0x00b6:
            com.hbb20.CountryCodePicker$e r3 = r6.q3     // Catch:{ Exception -> 0x00c9 }
            if (r3 == 0) goto L_0x00bd
            r3.a()     // Catch:{ Exception -> 0x00c9 }
        L_0x00bd:
            int r1 = r1 + 1
            goto L_0x0003
        L_0x00c1:
            if (r2 != 0) goto L_0x00ec
            if (r7 == 0) goto L_0x00ec
            r6.j()     // Catch:{ Exception -> 0x00c9 }
            goto L_0x00ec
        L_0x00c9:
            r0 = move-exception
            r0.printStackTrace()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "setAutoDetectCountry: Exception"
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "CCP"
            android.util.Log.w(r1, r0)
            if (r7 == 0) goto L_0x00ec
            r6.j()
        L_0x00ec:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hbb20.CountryCodePicker.setAutoDetectedCountry(boolean):void");
    }

    public void setAutoDetectionFailureListener(e eVar) {
        this.q3 = eVar;
    }

    public void setCcpClickable(boolean z) {
        this.a3 = z;
        if (!z) {
            this.k2.setOnClickListener((View.OnClickListener) null);
            this.k2.setClickable(false);
            this.k2.setEnabled(false);
            return;
        }
        this.k2.setOnClickListener(this.B3);
        this.k2.setClickable(true);
        this.k2.setEnabled(true);
    }

    public void setCcpDialogShowFlag(boolean z) {
        this.y2 = z;
    }

    public void setCcpDialogShowNameCode(boolean z) {
        this.E2 = z;
    }

    public void setCcpDialogShowPhoneCode(boolean z) {
        this.t2 = z;
    }

    public void setCcpDialogShowTitle(boolean z) {
        this.x2 = z;
    }

    public void setContentColor(int i) {
        this.L2 = i;
        this.b2.setTextColor(i);
        if (this.M2 == -99) {
            this.e2.setColorFilter(this.L2, PorterDuff.Mode.SRC_IN);
        }
    }

    public void setCountryAutoDetectionPref(AutoDetectionPref autoDetectionPref) {
        this.p2 = autoDetectionPref;
    }

    public void setCountryForNameCode(String str) {
        i0.i.a i = i0.i.a.i(getContext(), getLanguageToApply(), str);
        if (i == null) {
            if (this.j2 == null) {
                this.j2 = i0.i.a.b(getContext(), getLanguageToApply(), this.Q2, this.x);
            }
            setSelectedCountry(this.j2);
            return;
        }
        setSelectedCountry(i);
    }

    public void setCountryForPhoneCode(int i) {
        i0.i.a b4 = i0.i.a.b(getContext(), getLanguageToApply(), this.Q2, i);
        if (b4 == null) {
            if (this.j2 == null) {
                this.j2 = i0.i.a.b(getContext(), getLanguageToApply(), this.Q2, this.x);
            }
            setSelectedCountry(this.j2);
            return;
        }
        setSelectedCountry(b4);
    }

    public void setCountryPreference(String str) {
        this.S2 = str;
    }

    public void setCurrentTextGravity(TextGravity textGravity) {
        this.m2 = textGravity;
        b(textGravity.enumIndex);
    }

    public void setCustomDialogTextProvider(c cVar) {
        this.s3 = cVar;
    }

    public void setCustomMasterCountries(String str) {
        this.V2 = str;
    }

    public void setCustomMasterCountriesList(List<i0.i.a> list) {
        this.U2 = list;
    }

    public void setDefaultCountryUsingNameCode(String str) {
        i0.i.a i = i0.i.a.i(getContext(), getLanguageToApply(), str);
        if (i != null) {
            this.y = i.Y1;
            setDefaultCountry(i);
        }
    }

    @Deprecated
    public void setDefaultCountryUsingPhoneCode(int i) {
        i0.i.a b4 = i0.i.a.b(getContext(), getLanguageToApply(), this.Q2, i);
        if (b4 != null) {
            this.x = i;
            setDefaultCountry(b4);
        }
    }

    public void setDetectCountryWithAreaCode(boolean z) {
        this.D2 = z;
        l();
    }

    public void setDialogBackground(int i) {
        this.u3 = i;
    }

    public void setDialogBackgroundColor(int i) {
        this.v3 = i;
    }

    public void setDialogCornerRaius(float f4) {
        this.z3 = f4;
    }

    public void setDialogEventsListener(d dVar) {
        this.r3 = dVar;
    }

    public void setDialogKeyboardAutoPopup(boolean z) {
        this.Z2 = z;
    }

    public void setDialogSearchEditTextTintColor(int i) {
        this.x3 = i;
    }

    public void setDialogTextColor(int i) {
        this.w3 = i;
    }

    public void setDialogTypeFace(Typeface typeface) {
        try {
            this.O2 = typeface;
            this.P2 = -99;
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public void setEditText_registeredCarrierNumber(EditText editText) {
        this.c2 = editText;
        if (editText.getHint() != null) {
            this.n2 = this.c2.getHint().toString();
        }
        try {
            this.c2.removeTextChangedListener(this.g3);
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        boolean f4 = f();
        this.i3 = f4;
        g gVar = this.p3;
        if (gVar != null) {
            ((i0.e.b.g3.r.e) gVar).a(f4);
        }
        m mVar = new m(this);
        this.g3 = mVar;
        this.c2.addTextChangedListener(mVar);
        l();
        m();
    }

    public void setExcludedCountries(String str) {
        this.W2 = str;
        h();
    }

    public void setFastScrollerBubbleColor(int i) {
        this.T2 = i;
    }

    public void setFastScrollerBubbleTextAppearance(int i) {
        this.y3 = i;
    }

    public void setFastScrollerHandleColor(int i) {
        this.t3 = i;
    }

    public void setFlagBorderColor(int i) {
        this.N2 = i;
        this.g2.setBackgroundColor(i);
    }

    public void setFlagSize(int i) {
        this.f2.getLayoutParams().height = i;
        this.f2.requestLayout();
    }

    public void setFullNumber(String str) {
        int indexOf;
        i0.i.b bVar;
        Context context = getContext();
        Language languageToApply = getLanguageToApply();
        List<i0.i.a> list = this.Q2;
        i0.i.a aVar = null;
        if (str != null) {
            String trim = str.trim();
            if (trim.length() != 0) {
                int i = 0;
                if (trim.charAt(0) == '+') {
                    i = 1;
                }
                int i4 = i;
                while (true) {
                    if (i4 > trim.length()) {
                        break;
                    }
                    String substring = trim.substring(i, i4);
                    try {
                        bVar = i0.i.b.b(Integer.parseInt(substring));
                    } catch (Exception unused) {
                        bVar = null;
                    }
                    if (bVar != null) {
                        int length = substring.length() + i;
                        int length2 = trim.length();
                        int i5 = bVar.c + length;
                        aVar = length2 >= i5 ? bVar.a(context, languageToApply, trim.substring(length, i5)) : i0.i.a.i(context, languageToApply, bVar.b);
                    } else {
                        i0.i.a e4 = i0.i.a.e(context, languageToApply, list, substring);
                        if (e4 != null) {
                            aVar = e4;
                            break;
                        }
                        i4++;
                    }
                }
            }
        }
        if (aVar == null) {
            aVar = getDefaultCountry();
        }
        setSelectedCountry(aVar);
        if (!(aVar == null || str == null || str.isEmpty() || (indexOf = str.indexOf(aVar.Z1)) == -1)) {
            str = str.substring(aVar.Z1.length() + indexOf);
        }
        if (getEditText_registeredCarrierNumber() != null) {
            getEditText_registeredCarrierNumber().setText(str);
            l();
            return;
        }
        Log.w("CCP", "EditText for carrier number is not registered. Register it using registerCarrierNumberEditText() before getFullNumber() or setFullNumber().");
    }

    public void setHintExampleNumberEnabled(boolean z) {
        this.e3 = z;
        m();
    }

    public void setHintExampleNumberType(PhoneNumberType phoneNumberType) {
        this.J2 = phoneNumberType;
        m();
    }

    public void setImageViewFlag(ImageView imageView) {
        this.f2 = imageView;
    }

    public void setInternationalFormattingOnly(boolean z) {
        this.I2 = z;
        if (this.c2 != null) {
            l();
        }
    }

    public void setLanguageToApply(Language language) {
        this.Y2 = language;
    }

    public void setNumberAutoFormattingEnabled(boolean z) {
        this.d3 = z;
        if (this.c2 != null) {
            l();
        }
    }

    public void setOnCountryChangeListener(f fVar) {
        this.o3 = fVar;
    }

    public void setPhoneNumberValidityChangeListener(g gVar) {
        this.p3 = gVar;
        if (this.c2 != null && gVar != null) {
            boolean f4 = f();
            this.i3 = f4;
            ((i0.e.b.g3.r.e) gVar).a(f4);
        }
    }

    public void setSearchAllowed(boolean z) {
        this.z2 = z;
    }

    public void setSelectedCountry(i0.i.a aVar) {
        i0.i.c cVar = this.d;
        if (!(cVar == null || ((n) cVar).a(aVar) == null)) {
            this.b2.setContentDescription(((n) this.d).a(aVar));
        }
        this.k3 = false;
        String str = "";
        this.l3 = str;
        if (aVar != null || (aVar = i0.i.a.b(getContext(), getLanguageToApply(), this.Q2, this.x)) != null) {
            this.i2 = aVar;
            if (this.u2 && this.G2) {
                if (!isInEditMode()) {
                    StringBuilder P0 = i0.d.a.a.a.P0(str);
                    P0.append(i0.i.a.l(aVar));
                    P0.append("  ");
                    str = P0.toString();
                } else if (this.H2) {
                    str = "🏁​ ";
                } else {
                    StringBuilder P02 = i0.d.a.a.a.P0(str);
                    P02.append(i0.i.a.l(aVar));
                    P02.append("​ ");
                    str = P02.toString();
                }
            }
            if (this.v2) {
                StringBuilder P03 = i0.d.a.a.a.P0(str);
                P03.append(aVar.a2);
                str = P03.toString();
            }
            if (this.r2) {
                if (this.v2) {
                    StringBuilder S0 = i0.d.a.a.a.S0(str, " (");
                    S0.append(aVar.Y1.toUpperCase());
                    S0.append(")");
                    str = S0.toString();
                } else {
                    StringBuilder S02 = i0.d.a.a.a.S0(str, " ");
                    S02.append(aVar.Y1.toUpperCase());
                    str = S02.toString();
                }
            }
            if (this.s2) {
                if (str.length() > 0) {
                    str = i0.d.a.a.a.n0(str, "  ");
                }
                StringBuilder S03 = i0.d.a.a.a.S0(str, "+");
                S03.append(aVar.Z1);
                str = S03.toString();
            }
            this.b2.setText(str);
            if (!this.u2 && str.length() == 0) {
                StringBuilder S04 = i0.d.a.a.a.S0(str, "+");
                S04.append(aVar.Z1);
                this.b2.setText(S04.toString());
            }
            this.f2.setImageResource(aVar.n());
            f fVar = this.o3;
            if (fVar != null) {
                fVar.a();
            }
            l();
            m();
            if (!(this.c2 == null || this.p3 == null)) {
                boolean f4 = f();
                this.i3 = f4;
                ((i0.e.b.g3.r.e) this.p3).a(f4);
            }
            this.k3 = true;
            if (this.n3) {
                try {
                    this.c2.setSelection(this.m3);
                    this.n3 = false;
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            }
            this.A3 = i0.i.b.b(getSelectedCountryCodeAsInt());
        }
    }

    public void setShowFastScroller(boolean z) {
        this.w2 = z;
    }

    public void setShowPhoneCode(boolean z) {
        this.s2 = z;
        setSelectedCountry(this.i2);
    }

    public void setTalkBackTextProvider(i0.i.c cVar) {
        this.d = cVar;
        setSelectedCountry(this.i2);
    }

    public void setTextSize(int i) {
        if (i > 0) {
            this.b2.setTextSize(0, (float) i);
            setArrowSize(i);
            setFlagSize(i);
        }
    }

    public void setTextView_selectedCountry(TextView textView) {
        this.b2 = textView;
    }

    public void setTypeFace(Typeface typeface) {
        try {
            this.b2.setTypeface(typeface);
            setDialogTypeFace(typeface);
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public enum Language {
        AFRIKAANS("af"),
        ARABIC("ar"),
        BENGALI("bn"),
        CHINESE_SIMPLIFIED("zh", "CN", "Hans"),
        CHINESE_TRADITIONAL("zh", "TW", "Hant"),
        CZECH("cs"),
        DANISH("da"),
        DUTCH("nl"),
        ENGLISH("en"),
        FARSI("fa"),
        FRENCH("fr"),
        GERMAN("de"),
        GREEK("el"),
        GUJARATI("gu"),
        HEBREW("iw"),
        HINDI("hi"),
        INDONESIA("in"),
        ITALIAN("it"),
        JAPANESE("ja"),
        KAZAKH("kk"),
        KOREAN("ko"),
        MARATHI("mr"),
        POLISH("pl"),
        PORTUGUESE("pt"),
        PUNJABI("pa"),
        RUSSIAN("ru"),
        SLOVAK("sk"),
        SLOVENIAN("si"),
        SPANISH("es"),
        SWEDISH("sv"),
        TAGALOG("tl"),
        THAI("th"),
        TURKISH("tr"),
        UKRAINIAN("uk"),
        URDU("ur"),
        UZBEK("uz"),
        VIETNAMESE("vi");
        
        private String code;
        private String country;
        private String script;

        private Language(String str, String str2, String str3) {
            this.code = str;
            this.country = str2;
            this.script = str3;
        }

        public static Language forCountryNameCode(String str) {
            Language language = ENGLISH;
            Language[] values = values();
            for (int i = 0; i < 37; i++) {
                Language language2 = values[i];
                if (language2.code.equals(str)) {
                    language = language2;
                }
            }
            return language;
        }

        public String getCode() {
            return this.code;
        }

        public String getCountry() {
            return this.country;
        }

        public String getScript() {
            return this.script;
        }

        public void setCode(String str) {
            this.code = str;
        }

        public void setCountry(String str) {
            this.country = str;
        }

        public void setScript(String str) {
            this.script = str;
        }

        private Language(String str) {
            this.code = str;
        }
    }
}
