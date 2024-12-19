package es.lili.simple.samples.exceptions;

public final class ErrorKeyMsg {

    public static final String UNDEFINED_NOT_FOUND =  "UNF999";
    public static final String UNDEFINED_INTERNAL_SERVER =  "UIS999";
    public static final String UNDEFINED_BAD_REQUEST =  "UBR999";

    public final class StatusKeys {

        public static final String BY_ID = "SNF001";
        public static final String BY_NAME = "SNF002";


        private StatusKeys() {
            //Add private constructor to hide implicit one
        }

    }

    public static final String NAME = ".name";
    public static final String DESC = ".description";
    public static final String SHORT_MSG = ".short-msg";

    private ErrorKeyMsg() {
        //Add private constructor to hide implicit one
    }

    public static String buildKeyName(String code) {
        return code + NAME;
    }

    public static String buildKeyDesc(String code) {
        return code + DESC;
    }

    public static String buildKeyMsg(String code) {
        return code + SHORT_MSG;
    }
}
