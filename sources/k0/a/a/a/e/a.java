package k0.a.a.a.e;

import io.michaelrocks.libphonenumber.android.Phonemetadata$PhoneNumberDesc;
import io.michaelrocks.libphonenumber.android.internal.RegexCache;
import java.util.regex.Matcher;

/* compiled from: RegexBasedMatcher */
public final class a {
    public final RegexCache a = new RegexCache(100);

    public boolean a(CharSequence charSequence, Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc, boolean z) {
        String str = phonemetadata$PhoneNumberDesc.d;
        if (str.length() == 0) {
            return false;
        }
        Matcher matcher = this.a.a(str).matcher(charSequence);
        if (!matcher.lookingAt()) {
            return false;
        }
        if (matcher.matches()) {
            z = true;
        }
        return z;
    }
}
