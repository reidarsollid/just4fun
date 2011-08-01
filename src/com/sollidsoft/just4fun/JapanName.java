package com.sollidsoft.just4fun;

/**
 * User: Reidar Sollid
 * Date: 31.07.11
 * Time: 23.40
 */

public class JapanName {
    private String firstName;
    private String lastName;

    enum ToNippon {
        A("ka"), B("tu"), C("mi"), D("te"), E("ku"), F("lu"), G("ji"), H("ri"), I("ki"), J("zu"), K("me"),
        L("ta"), M("rin"), N("to"), O("mo"), P("no"), Q("ke"), R("shi"), S("ari"), T("chi"), U("do"), V("ru"), W("mei"),
        X("na"), Y("fu"), Z("z"), Æ("kau"), Ø("keo"), Å("kao");

        private String resultString;

        ToNippon(String result) {
            this.resultString = result;
        }

        public String getResultString() {
            return resultString;
        }

        static String valueOf(char c) {
            boolean isUpper = Character.isUpperCase(c);
            String stringValue = String.valueOf(c).toUpperCase();
            String retval = valueOf(stringValue).getResultString();
            if (isUpper) {
                retval = retval.replace(retval.charAt(0), Character.toUpperCase(retval.charAt(0)));
            }
            return retval;
        }
    }

    public JapanName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String convert() {
        char[] firstNames = this.firstName.toCharArray();
        String retval = "";
        for (char c : firstNames) {
            retval += ToNippon.valueOf(c);
        }
        retval += " ";
        char[] lastNameChars = lastName.toCharArray();
        for (char c : lastNameChars) {
            retval += ToNippon.valueOf(c);
        }
        return retval;
    }

    public static void main(String[] args) {
        JapanName japanName = new JapanName("Reidar", "Sollid");
        JapanName japanName2 = new JapanName("Åse", "Øster");
        System.out.println(japanName.convert());
        System.out.println(japanName2.convert());
    }

}
