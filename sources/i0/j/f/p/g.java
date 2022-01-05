package i0.j.f.p;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.util.filters.Filter;
import com.instabug.survey.f.c.c;
import com.stripe.android.model.parsers.AccountRangeJsonParser;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: SurveysFilterFunctions */
public final class g implements Filter<ArrayList<c>> {
    public Object apply(Object obj) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) obj).iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            String str = cVar.c;
            boolean z = true;
            if (str != null) {
                char c = 65535;
                switch (str.hashCode()) {
                    case -1464712027:
                        if (str.equals("days_since_signup")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -901870406:
                        if (str.equals("app_version")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -12379384:
                        if (str.equals("android_version")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 3076014:
                        if (str.equals("date")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 96619420:
                        if (str.equals("email")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 957831062:
                        if (str.equals(AccountRangeJsonParser.FIELD_COUNTRY)) {
                            c = 5;
                            break;
                        }
                        break;
                    case 1421955229:
                        if (str.equals("days_since_dismiss")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 1694233633:
                        if (str.equals("app_version_v2")) {
                            c = 7;
                            break;
                        }
                        break;
                    case 1905908461:
                        if (str.equals("sessions_count")) {
                            c = 8;
                            break;
                        }
                        break;
                    case 2013274756:
                        if (str.equals(InstabugDbContract.UserEntity.COLUMN_LAST_SEEN)) {
                            c = 9;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        break;
                }
            }
            z = false;
            if (z) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }
}
