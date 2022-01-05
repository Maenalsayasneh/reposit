package i0.j.e.n0;

import android.graphics.Color;
import com.instabug.library.Feature;
import com.instabug.library.Instabug;
import com.instabug.library.InstabugCustomTextPlaceHolder;
import com.instabug.library.internal.module.InstabugLocale;
import com.instabug.library.settings.SettingsManager;
import i0.j.e.z;
import java.util.Locale;

/* compiled from: Customizations */
public final class a implements Runnable {
    public void run() {
        InstabugLocale instabugLocale = InstabugLocale.FRENCH;
        Instabug.setLocale(new Locale(instabugLocale.getCode(), instabugLocale.getCountry()));
        InstabugCustomTextPlaceHolder instabugCustomTextPlaceHolder = new InstabugCustomTextPlaceHolder();
        instabugCustomTextPlaceHolder.set(InstabugCustomTextPlaceHolder.Key.INVALID_COMMENT_MESSAGE, "Hey, écrivez-nous un message pour nous aider.");
        instabugCustomTextPlaceHolder.set(InstabugCustomTextPlaceHolder.Key.INVALID_EMAIL_MESSAGE, "Oups ! L’email est invalide !, Retentez votre chance.");
        instabugCustomTextPlaceHolder.set(InstabugCustomTextPlaceHolder.Key.REPORT_SUCCESSFULLY_SENT, "C’est dans la boîte !\nGrâce à vous, notre application s’améliore !");
        instabugCustomTextPlaceHolder.set(InstabugCustomTextPlaceHolder.Key.INVOCATION_HEADER, "Bonjour ! Que souhaitez-vous faire?");
        instabugCustomTextPlaceHolder.set(InstabugCustomTextPlaceHolder.Key.FEEDBACK_REPORT_HEADER, "J’ai une super idée !");
        instabugCustomTextPlaceHolder.set(InstabugCustomTextPlaceHolder.Key.BUG_REPORT_HEADER, "J’ai trouvé un bug !");
        instabugCustomTextPlaceHolder.set(InstabugCustomTextPlaceHolder.Key.EMAIL_FIELD_HINT, "Saisissez votre adresse e-mail");
        instabugCustomTextPlaceHolder.set(InstabugCustomTextPlaceHolder.Key.COMMENT_FIELD_HINT_FOR_BUG_REPORT, "Décrivez le bug rencontré en quelques mots. On met les débuggers sur le coup !");
        instabugCustomTextPlaceHolder.set(InstabugCustomTextPlaceHolder.Key.COMMENT_FIELD_HINT_FOR_FEEDBACK, "Décrivez votre super idée en quelques mots. On met les développeurs sur le coup !");
        SettingsManager.getInstance().setCustomPlaceHolders(instabugCustomTextPlaceHolder);
        z.j().d(Feature.BUG_REPORTING, Feature.State.ENABLED);
        z.j().d(Feature.CHATS, Feature.State.DISABLED);
        Instabug.setPrimaryColor(Color.parseColor("#DB2B6E"));
    }
}
