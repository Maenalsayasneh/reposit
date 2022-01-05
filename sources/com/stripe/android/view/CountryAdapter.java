package com.stripe.android.view;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.TextView;
import com.stripe.android.R;
import com.stripe.android.model.CountryCode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.text.StringsKt__IndentKt;
import m0.n.a.l;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00016B;\u0012\u0006\u00102\u001a\u000201\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u001f\u0012\b\b\u0002\u00103\u001a\u00020\u0003\u0012\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020+0*¢\u0006\u0004\b4\u00105J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001e\u001a\u00020\u001b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0000¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u001f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u0010!R(\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u001f8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\"\u0010!\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\"\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020+0*8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00100\u001a\u00020\u00028@@\u0000X\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00067"}, d2 = {"Lcom/stripe/android/view/CountryAdapter;", "Landroid/widget/ArrayAdapter;", "Lcom/stripe/android/view/Country;", "", "getCount", "()I", "i", "getItem", "(I)Lcom/stripe/android/view/Country;", "item", "getPosition", "(Lcom/stripe/android/view/Country;)I", "", "getItemId", "(I)J", "Landroid/view/View;", "view", "Landroid/view/ViewGroup;", "viewGroup", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/widget/Filter;", "getFilter", "()Landroid/widget/Filter;", "", "", "allowedCountryCodes", "", "updateUnfilteredCountries$payments_core_release", "(Ljava/util/Set;)Z", "updateUnfilteredCountries", "", "suggestions", "Ljava/util/List;", "unfilteredCountries", "getUnfilteredCountries$payments_core_release", "()Ljava/util/List;", "setUnfilteredCountries$payments_core_release", "(Ljava/util/List;)V", "Lcom/stripe/android/view/CountryAdapter$CountryFilter;", "countryFilter", "Lcom/stripe/android/view/CountryAdapter$CountryFilter;", "Lkotlin/Function1;", "Landroid/widget/TextView;", "textViewFactory", "Lm0/n/a/l;", "getFirstItem$payments_core_release", "()Lcom/stripe/android/view/Country;", "firstItem", "Landroid/content/Context;", "context", "itemLayoutId", "<init>", "(Landroid/content/Context;Ljava/util/List;ILm0/n/a/l;)V", "CountryFilter", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: CountryAdapter.kt */
public final class CountryAdapter extends ArrayAdapter<Country> {
    private final CountryFilter countryFilter;
    /* access modifiers changed from: private */
    public List<Country> suggestions;
    private final l<ViewGroup, TextView> textViewFactory;
    private List<Country> unfilteredCountries;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B'\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\"\u001a\u00020!\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b$\u0010%J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\b\u0010\u0007J'\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0016\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012H\u0014¢\u0006\u0004\b\u0016\u0010\u0017R(\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u001e8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lcom/stripe/android/view/CountryAdapter$CountryFilter;", "Landroid/widget/Filter;", "", "constraint", "", "Lcom/stripe/android/view/Country;", "filteredSuggestedCountries", "(Ljava/lang/CharSequence;)Ljava/util/List;", "getSuggestedCountries", "countries", "", "isMatch", "(Ljava/util/List;Ljava/lang/CharSequence;)Z", "Landroid/app/Activity;", "activity", "Lm0/i;", "hideKeyboard", "(Landroid/app/Activity;)V", "Landroid/widget/Filter$FilterResults;", "performFiltering", "(Ljava/lang/CharSequence;)Landroid/widget/Filter$FilterResults;", "filterResults", "publishResults", "(Ljava/lang/CharSequence;Landroid/widget/Filter$FilterResults;)V", "unfilteredCountries", "Ljava/util/List;", "getUnfilteredCountries", "()Ljava/util/List;", "setUnfilteredCountries", "(Ljava/util/List;)V", "Ljava/lang/ref/WeakReference;", "activityRef", "Ljava/lang/ref/WeakReference;", "Lcom/stripe/android/view/CountryAdapter;", "adapter", "Lcom/stripe/android/view/CountryAdapter;", "<init>", "(Ljava/util/List;Lcom/stripe/android/view/CountryAdapter;Landroid/app/Activity;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: CountryAdapter.kt */
    public static final class CountryFilter extends Filter {
        private final WeakReference<Activity> activityRef;
        private final CountryAdapter adapter;
        private List<Country> unfilteredCountries;

        public CountryFilter(List<Country> list, CountryAdapter countryAdapter, Activity activity) {
            i.e(list, "unfilteredCountries");
            i.e(countryAdapter, "adapter");
            this.unfilteredCountries = list;
            this.adapter = countryAdapter;
            this.activityRef = new WeakReference<>(activity);
        }

        private final List<Country> filteredSuggestedCountries(CharSequence charSequence) {
            List<Country> suggestedCountries = getSuggestedCountries(charSequence);
            return (suggestedCountries.isEmpty() || isMatch(suggestedCountries, charSequence)) ? this.unfilteredCountries : suggestedCountries;
        }

        private final List<Country> getSuggestedCountries(CharSequence charSequence) {
            List<Country> list = this.unfilteredCountries;
            ArrayList arrayList = new ArrayList();
            for (T next : list) {
                String name = ((Country) next).getName();
                Locale locale = Locale.ROOT;
                i.d(locale, "Locale.ROOT");
                Objects.requireNonNull(name, "null cannot be cast to non-null type java.lang.String");
                String lowerCase = name.toLowerCase(locale);
                i.d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                String valueOf = String.valueOf(charSequence);
                i.d(locale, "Locale.ROOT");
                String lowerCase2 = valueOf.toLowerCase(locale);
                i.d(lowerCase2, "(this as java.lang.String).toLowerCase(locale)");
                if (StringsKt__IndentKt.J(lowerCase, lowerCase2, false, 2)) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }

        private final void hideKeyboard(Activity activity) {
            Object systemService = activity.getSystemService("input_method");
            IBinder iBinder = null;
            if (!(systemService instanceof InputMethodManager)) {
                systemService = null;
            }
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            if (inputMethodManager != null && inputMethodManager.isAcceptingText()) {
                View currentFocus = activity.getCurrentFocus();
                if (currentFocus != null) {
                    iBinder = currentFocus.getWindowToken();
                }
                inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
            }
        }

        private final boolean isMatch(List<Country> list, CharSequence charSequence) {
            return list.size() == 1 && i.a(list.get(0).getName(), String.valueOf(charSequence));
        }

        public final List<Country> getUnfilteredCountries() {
            return this.unfilteredCountries;
        }

        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            List<Country> list;
            Filter.FilterResults filterResults = new Filter.FilterResults();
            if (charSequence == null || (list = filteredSuggestedCountries(charSequence)) == null) {
                list = this.unfilteredCountries;
            }
            filterResults.values = list;
            return filterResults;
        }

        public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            Object obj = filterResults != null ? filterResults.values : null;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.collections.List<com.stripe.android.view.Country>");
            List list = (List) obj;
            Activity activity = (Activity) this.activityRef.get();
            if (activity != null) {
                boolean z = false;
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (i.a(((Country) it.next()).getName(), charSequence)) {
                                z = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                if (z) {
                    i.d(activity, "activity");
                    hideKeyboard(activity);
                }
            }
            this.adapter.suggestions = list;
            this.adapter.notifyDataSetChanged();
        }

        public final void setUnfilteredCountries(List<Country> list) {
            i.e(list, "<set-?>");
            this.unfilteredCountries = list;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CountryAdapter(Context context, List list, int i, l lVar, int i2, f fVar) {
        this(context, list, (i2 & 4) != 0 ? R.layout.country_text_view : i, lVar);
    }

    public int getCount() {
        return this.suggestions.size();
    }

    public Filter getFilter() {
        return this.countryFilter;
    }

    public final /* synthetic */ Country getFirstItem$payments_core_release() {
        return getItem(0);
    }

    public long getItemId(int i) {
        return (long) getItem(i).hashCode();
    }

    public final List<Country> getUnfilteredCountries$payments_core_release() {
        return this.unfilteredCountries;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView;
        i.e(viewGroup, "viewGroup");
        if (view instanceof TextView) {
            textView = (TextView) view;
        } else {
            textView = this.textViewFactory.invoke(viewGroup);
        }
        textView.setText(getItem(i).getName());
        return textView;
    }

    public final void setUnfilteredCountries$payments_core_release(List<Country> list) {
        i.e(list, "<set-?>");
        this.unfilteredCountries = list;
    }

    public final boolean updateUnfilteredCountries$payments_core_release(Set<String> set) {
        i.e(set, "allowedCountryCodes");
        if (set.isEmpty()) {
            return false;
        }
        List<Country> list = this.unfilteredCountries;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            boolean z = true;
            if (it.hasNext()) {
                T next = it.next();
                CountryCode component1 = ((Country) next).component1();
                if (!set.isEmpty()) {
                    Iterator<T> it2 = set.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (StringsKt__IndentKt.f((String) it2.next(), component1.getValue(), true)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                z = false;
                if (z) {
                    arrayList.add(next);
                }
            } else {
                this.unfilteredCountries = arrayList;
                this.countryFilter.setUnfilteredCountries(arrayList);
                this.suggestions = this.unfilteredCountries;
                notifyDataSetChanged();
                return true;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CountryAdapter(Context context, List<Country> list, int i, l<? super ViewGroup, ? extends TextView> lVar) {
        super(context, i);
        i.e(context, "context");
        i.e(list, "unfilteredCountries");
        i.e(lVar, "textViewFactory");
        this.unfilteredCountries = list;
        this.textViewFactory = lVar;
        this.countryFilter = new CountryFilter(this.unfilteredCountries, this, (Activity) (!(context instanceof Activity) ? null : context));
        this.suggestions = this.unfilteredCountries;
    }

    public Country getItem(int i) {
        return this.suggestions.get(i);
    }

    public int getPosition(Country country) {
        List<Country> list = this.suggestions;
        i.e(list, "$this$indexOf");
        return list.indexOf(country);
    }
}
