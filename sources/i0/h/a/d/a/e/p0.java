package i0.h.a.d.a.e;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.h.a.d.a.b.i;
import i0.h.a.d.a.b.n;

public abstract class p0 extends f0 implements q0 {
    public p0() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetModuleServiceCallback");
    }

    public final boolean L(int i, Parcel parcel) throws RemoteException {
        switch (i) {
            case 2:
                int readInt = parcel.readInt();
                Bundle bundle = (Bundle) g0.a(parcel, Bundle.CREATOR);
                ((i) this).b.e.b();
                n.a.b(4, "onStartDownload(%d)", new Object[]{Integer.valueOf(readInt)});
                break;
            case 3:
                int readInt2 = parcel.readInt();
                Bundle bundle2 = (Bundle) g0.a(parcel, Bundle.CREATOR);
                ((i) this).b.e.b();
                n.a.b(4, "onCancelDownload(%d)", new Object[]{Integer.valueOf(readInt2)});
                break;
            case 4:
                int readInt3 = parcel.readInt();
                Bundle bundle3 = (Bundle) g0.a(parcel, Bundle.CREATOR);
                ((i) this).b.e.b();
                n.a.b(4, "onGetSession(%d)", new Object[]{Integer.valueOf(readInt3)});
                break;
            case 5:
                f0(parcel.createTypedArrayList(Bundle.CREATOR));
                break;
            case 6:
                Parcelable.Creator creator = Bundle.CREATOR;
                Bundle bundle4 = (Bundle) g0.a(parcel, creator);
                Bundle bundle5 = (Bundle) g0.a(parcel, creator);
                ((i) this).b.e.b();
                n.a.b(4, "onNotifyChunkTransferred(%s, %s, %d, session=%d)", new Object[]{bundle4.getString(InstabugDbContract.APMUiTraceEntry.COLUMN_MODULE_NAME), bundle4.getString("slice_id"), Integer.valueOf(bundle4.getInt("chunk_number")), Integer.valueOf(bundle4.getInt("session_id"))});
                break;
            case 7:
                W((Bundle) g0.a(parcel, Bundle.CREATOR));
                break;
            case 8:
                Parcelable.Creator creator2 = Bundle.CREATOR;
                Bundle bundle6 = (Bundle) g0.a(parcel, creator2);
                Bundle bundle7 = (Bundle) g0.a(parcel, creator2);
                ((i) this).b.e.b();
                n.a.b(4, "onNotifyModuleCompleted(%s, sessionId=%d)", new Object[]{bundle6.getString(InstabugDbContract.APMUiTraceEntry.COLUMN_MODULE_NAME), Integer.valueOf(bundle6.getInt("session_id"))});
                break;
            case 10:
                Parcelable.Creator creator3 = Bundle.CREATOR;
                Bundle bundle8 = (Bundle) g0.a(parcel, creator3);
                ((i) this).b.e.b();
                n.a.b(4, "onNotifySessionFailed(%d)", new Object[]{Integer.valueOf(((Bundle) g0.a(parcel, creator3)).getInt("session_id"))});
                break;
            case 11:
                Parcelable.Creator creator4 = Bundle.CREATOR;
                O((Bundle) g0.a(parcel, creator4), (Bundle) g0.a(parcel, creator4));
                break;
            case 12:
                Parcelable.Creator creator5 = Bundle.CREATOR;
                Y((Bundle) g0.a(parcel, creator5), (Bundle) g0.a(parcel, creator5));
                break;
            case 13:
                Parcelable.Creator creator6 = Bundle.CREATOR;
                Bundle bundle9 = (Bundle) g0.a(parcel, creator6);
                Bundle bundle10 = (Bundle) g0.a(parcel, creator6);
                ((i) this).b.e.b();
                n.a.b(4, "onRequestDownloadInfo()", new Object[0]);
                break;
            case 14:
                Parcelable.Creator creator7 = Bundle.CREATOR;
                Bundle bundle11 = (Bundle) g0.a(parcel, creator7);
                Bundle bundle12 = (Bundle) g0.a(parcel, creator7);
                ((i) this).b.e.b();
                n.a.b(4, "onRemoveModule()", new Object[0]);
                break;
            case 15:
                Bundle bundle13 = (Bundle) g0.a(parcel, Bundle.CREATOR);
                ((i) this).b.e.b();
                n.a.b(4, "onCancelDownloads()", new Object[0]);
                break;
            default:
                return false;
        }
        return true;
    }
}
