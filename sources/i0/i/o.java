package i0.i;

import android.content.Context;
import android.telephony.PhoneNumberUtils;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.text.TextWatcher;
import io.michaelrocks.libphonenumber.android.PhoneNumberUtil;
import java.util.Objects;
import k0.a.a.a.a;

/* compiled from: InternationalPhoneTextWatcher */
public class o implements TextWatcher {
    public int Y1;
    public boolean Z1 = false;
    public boolean a2;
    public PhoneNumberUtil c;
    public boolean d = false;
    public boolean q;
    public a x;
    public Editable y = null;

    public o(Context context, String str, int i, boolean z) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException();
        }
        PhoneNumberUtil b = PhoneNumberUtil.b(context);
        this.c = b;
        this.Y1 = i;
        Objects.requireNonNull(b);
        a aVar = new a(b, str);
        this.x = aVar;
        aVar.g();
        Editable editable = this.y;
        if (editable != null) {
            this.Z1 = true;
            String w = PhoneNumberUtil.w(editable);
            Editable editable2 = this.y;
            editable2.replace(0, editable2.length(), w, 0, w.length());
            this.Z1 = false;
        }
        this.a2 = z;
    }

    public final boolean a(CharSequence charSequence, int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            if (!PhoneNumberUtils.isNonSeparator(charSequence.charAt(i3))) {
                return true;
            }
        }
        return false;
    }

    public synchronized void afterTextChanged(Editable editable) {
        boolean z = true;
        if (this.q) {
            if (editable.length() == 0) {
                z = false;
            }
            this.q = z;
            return;
        } else if (!this.d) {
            int selectionEnd = Selection.getSelectionEnd(editable);
            boolean z2 = selectionEnd == editable.length();
            String b = b(editable);
            if (!b.equals(editable.toString())) {
                if (!z2) {
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        if (i >= editable.length()) {
                            break;
                        } else if (i >= selectionEnd) {
                            break;
                        } else {
                            if (PhoneNumberUtils.isNonSeparator(editable.charAt(i))) {
                                i2++;
                            }
                            i++;
                        }
                    }
                    selectionEnd = 0;
                    int i3 = 0;
                    while (true) {
                        if (selectionEnd >= b.length()) {
                            selectionEnd = 0;
                            break;
                        } else if (i3 == i2) {
                            break;
                        } else {
                            if (PhoneNumberUtils.isNonSeparator(b.charAt(selectionEnd))) {
                                i3++;
                            }
                            selectionEnd++;
                        }
                    }
                } else {
                    selectionEnd = b.length();
                }
            }
            if (!z2) {
                while (true) {
                    int i4 = selectionEnd - 1;
                    if (i4 > 0 && !PhoneNumberUtils.isNonSeparator(b.charAt(i4))) {
                        selectionEnd--;
                    }
                }
            }
            try {
                this.d = true;
                editable.replace(0, editable.length(), b, 0, b.length());
                this.d = false;
                this.y = editable;
                Selection.setSelection(editable, selectionEnd);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            return;
        }
        return;
    }

    public final String b(CharSequence charSequence) {
        this.x.g();
        String str = "+" + this.Y1;
        if (this.a2 || (charSequence.length() > 0 && charSequence.charAt(0) != '0')) {
            charSequence = str + charSequence;
        }
        int length = charSequence.length();
        char c2 = 0;
        String str2 = "";
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            if (PhoneNumberUtils.isNonSeparator(charAt)) {
                if (c2 != 0) {
                    str2 = this.x.j(c2);
                }
                c2 = charAt;
            }
        }
        if (c2 != 0) {
            str2 = this.x.j(c2);
        }
        String trim = str2.trim();
        if (this.a2 || charSequence.length() == 0 || charSequence.charAt(0) != '0') {
            if (trim.length() <= str.length()) {
                trim = "";
            } else if (trim.charAt(str.length()) == ' ') {
                trim = trim.substring(str.length() + 1);
            } else {
                trim = trim.substring(str.length());
            }
        }
        if (TextUtils.isEmpty(trim)) {
            return "";
        }
        return trim;
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.d && !this.q && i2 > 0 && a(charSequence, i, i2) && !this.Z1) {
            this.q = true;
            this.x.g();
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.d && !this.q && i3 > 0 && a(charSequence, i, i3)) {
            this.q = true;
            this.x.g();
        }
    }
}
