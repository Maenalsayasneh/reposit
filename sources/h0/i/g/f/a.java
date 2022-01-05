package h0.i.g.f;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: FindAddress */
public class a {
    public static final C0045a[] a = {new C0045a(99, 99, -1, -1), new C0045a(35, 36, -1, -1), new C0045a(71, 72, -1, -1), new C0045a(96, 96, -1, -1), new C0045a(85, 86, -1, -1), new C0045a(90, 96, -1, -1), new C0045a(80, 81, -1, -1), new C0045a(6, 6, -1, -1), new C0045a(20, 20, -1, -1), new C0045a(19, 19, -1, -1), new C0045a(32, 34, -1, -1), new C0045a(96, 96, -1, -1), new C0045a(30, 31, -1, -1), new C0045a(96, 96, -1, -1), new C0045a(96, 96, -1, -1), new C0045a(50, 52, -1, -1), new C0045a(83, 83, -1, -1), new C0045a(60, 62, -1, -1), new C0045a(46, 47, -1, -1), new C0045a(66, 67, 73, -1), new C0045a(40, 42, -1, -1), new C0045a(70, 71, -1, -1), new C0045a(1, 2, -1, -1), new C0045a(20, 21, -1, -1), new C0045a(3, 4, -1, -1), new C0045a(96, 96, -1, -1), new C0045a(48, 49, -1, -1), new C0045a(55, 56, -1, -1), new C0045a(63, 65, -1, -1), new C0045a(96, 96, -1, -1), new C0045a(38, 39, -1, -1), new C0045a(55, 56, -1, -1), new C0045a(27, 28, -1, -1), new C0045a(58, 58, -1, -1), new C0045a(68, 69, -1, -1), new C0045a(3, 4, -1, -1), new C0045a(7, 8, -1, -1), new C0045a(87, 88, 86, -1), new C0045a(88, 89, 96, -1), new C0045a(10, 14, 0, 6), new C0045a(43, 45, -1, -1), new C0045a(73, 74, -1, -1), new C0045a(97, 97, -1, -1), new C0045a(15, 19, -1, -1), new C0045a(6, 6, 0, 9), new C0045a(96, 96, -1, -1), new C0045a(2, 2, -1, -1), new C0045a(29, 29, -1, -1), new C0045a(57, 57, -1, -1), new C0045a(37, 38, -1, -1), new C0045a(75, 79, 87, 88), new C0045a(84, 84, -1, -1), new C0045a(22, 24, 20, -1), new C0045a(6, 9, -1, -1), new C0045a(5, 5, -1, -1), new C0045a(98, 99, -1, -1), new C0045a(53, 54, -1, -1), new C0045a(24, 26, -1, -1), new C0045a(82, 83, -1, -1)};
    public static final Pattern b = Pattern.compile("[^,*•\t                　\n\u000b\f\r  ]+(?=[,*•\t                　\n\u000b\f\r  ]|$)", 2);
    public static final Pattern c = Pattern.compile("(?:one|[0-9]+([a-z](?=[^a-z]|$)|st|nd|rd|th)?)(?:-(?:one|[0-9]+([a-z](?=[^a-z]|$)|st|nd|rd|th)?))*(?=[,\"'\t                　\n\u000b\f\r  ]|$)", 2);
    public static final Pattern d = Pattern.compile("(?:(ak|alaska)|(al|alabama)|(ar|arkansas)|(as|american[\t                　]+samoa)|(az|arizona)|(ca|california)|(co|colorado)|(ct|connecticut)|(dc|district[\t                　]+of[\t                　]+columbia)|(de|delaware)|(fl|florida)|(fm|federated[\t                　]+states[\t                　]+of[\t                　]+micronesia)|(ga|georgia)|(gu|guam)|(hi|hawaii)|(ia|iowa)|(id|idaho)|(il|illinois)|(in|indiana)|(ks|kansas)|(ky|kentucky)|(la|louisiana)|(ma|massachusetts)|(md|maryland)|(me|maine)|(mh|marshall[\t                　]+islands)|(mi|michigan)|(mn|minnesota)|(mo|missouri)|(mp|northern[\t                　]+mariana[\t                　]+islands)|(ms|mississippi)|(mt|montana)|(nc|north[\t                　]+carolina)|(nd|north[\t                　]+dakota)|(ne|nebraska)|(nh|new[\t                　]+hampshire)|(nj|new[\t                　]+jersey)|(nm|new[\t                　]+mexico)|(nv|nevada)|(ny|new[\t                　]+york)|(oh|ohio)|(ok|oklahoma)|(or|oregon)|(pa|pennsylvania)|(pr|puerto[\t                　]+rico)|(pw|palau)|(ri|rhode[\t                　]+island)|(sc|south[\t                　]+carolina)|(sd|south[\t                　]+dakota)|(tn|tennessee)|(tx|texas)|(ut|utah)|(va|virginia)|(vi|virgin[\t                　]+islands)|(vt|vermont)|(wa|washington)|(wi|wisconsin)|(wv|west[\t                　]+virginia)|(wy|wyoming))(?=[,*•\t                　\n\u000b\f\r  ]|$)", 2);
    public static final Pattern e = Pattern.compile("(?:alley|annex|arcade|ave[.]?|avenue|alameda|bayou|beach|bend|bluffs?|bottom|boulevard|branch|bridge|brooks?|burgs?|bypass|broadway|camino|camp|canyon|cape|causeway|centers?|circles?|cliffs?|club|common|corners?|course|courts?|coves?|creek|crescent|crest|crossing|crossroad|curve|circulo|dale|dam|divide|drives?|estates?|expressway|extensions?|falls?|ferry|fields?|flats?|fords?|forest|forges?|forks?|fort|freeway|gardens?|gateway|glens?|greens?|groves?|harbors?|haven|heights|highway|hills?|hollow|inlet|islands?|isle|junctions?|keys?|knolls?|lakes?|land|landing|lane|lights?|loaf|locks?|lodge|loop|mall|manors?|meadows?|mews|mills?|mission|motorway|mount|mountains?|neck|orchard|oval|overpass|parks?|parkways?|pass|passage|path|pike|pines?|plains?|plaza|points?|ports?|prairie|privada|radial|ramp|ranch|rapids?|rd[.]?|rest|ridges?|river|roads?|route|row|rue|run|shoals?|shores?|skyway|springs?|spurs?|squares?|station|stravenue|stream|st[.]?|streets?|summit|speedway|terrace|throughway|trace|track|trafficway|trail|tunnel|turnpike|underpass|unions?|valleys?|viaduct|views?|villages?|ville|vista|walks?|wall|ways?|wells?|xing|xrd)(?=[,*•\t                　\n\u000b\f\r  ]|$)", 2);
    public static final Pattern f = Pattern.compile("([0-9]+)(st|nd|rd|th)", 2);
    public static final Pattern g = Pattern.compile("(?:[0-9]{5}(?:-[0-9]{4})?)(?=[,*•\t                　\n\u000b\f\r  ]|$)", 2);

    /* renamed from: h0.i.g.f.a$a  reason: collision with other inner class name */
    /* compiled from: FindAddress */
    public static class C0045a {
        public int a;
        public int b;
        public int c;
        public int d;

        public C0045a(int i, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }
    }

    public static boolean a(String str) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (Character.isDigit(str.charAt(i2))) {
                i++;
            }
        }
        if (i > 5) {
            return false;
        }
        Matcher matcher = f.matcher(str);
        if (!matcher.find()) {
            return true;
        }
        int parseInt = Integer.parseInt(matcher.group(1));
        if (parseInt == 0) {
            return false;
        }
        String lowerCase = matcher.group(2).toLowerCase(Locale.getDefault());
        int i3 = parseInt % 10;
        String str2 = "th";
        if (i3 == 1) {
            if (parseInt % 100 != 11) {
                str2 = "st";
            }
            return lowerCase.equals(str2);
        } else if (i3 == 2) {
            if (parseInt % 100 != 12) {
                str2 = "nd";
            }
            return lowerCase.equals(str2);
        } else if (i3 != 3) {
            return lowerCase.equals(str2);
        } else {
            if (parseInt % 100 != 13) {
                str2 = "rd";
            }
            return lowerCase.equals(str2);
        }
    }
}
