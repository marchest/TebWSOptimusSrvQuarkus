package tr.com.teb.tebws.optimus.utils;


import java.util.logging.Logger;
import javax.inject.Singleton;


@Singleton
public class CommonWebServiceUtils {


    public StringBuffer getErrorXMLText(String message, String resultCode) {
        StringBuffer str = new StringBuffer();
        str.append("<MESSAGE>\n");
        str.append("<RESULT>\n");
        str.append("<RESULT_CODE>" + resultCode + "</RESULT_CODE>\n");
        str.append("<RESULT_STR>" + message + "</RESULT_STR>\n");
        str.append("</RESULT>\n");
        str.append("</MESSAGE>\n");
        return str;
    }

    public StringBuffer getErrorXMLText(String message) {
        StringBuffer str = new StringBuffer();
        str.append("<MESSAGE>\n");
        str.append("<RESULT>\n");
        str.append("<RESULT_CODE>-10000</RESULT_CODE>\n");
        str.append("<RESULT_STR>" + message + "</RESULT_STR>\n");
        str.append("</RESULT>\n");
        str.append("</MESSAGE>\n");
        return str;
    }



    public String hex2String(String phex) {
        if (phex == null) return "";
        byte[] bytes = new byte[phex.length() / 2];

        if ((phex == null ? "" : phex).equals("")) {
            return "";
        }
        for (int i = 0; i < phex.length() / 2; i++) {
            char c1 = phex.charAt(i * 2);
            char c2 = phex.charAt(i * 2 + 1);

            String hex = String.valueOf(c1) + String.valueOf(c2);
            int intValue = Integer.parseInt(hex, 16);
            bytes[i] = ((byte) intValue);
        }
        String result;
        try {
            result = new String(bytes, "ISO-8859-9");
        } catch (Exception ex) {
            result = "";
        }

        return result;
    }



    public boolean isEmpty(String s) {
        if (s == null) {
            return true;
        }
        if (s.length() == 0) {
            return true;
        }
        return false;
    }

    public String nullToEmpty(String s) {
        String tmpStr;
        if (s == null) {
            tmpStr = "";
        } else {
            tmpStr = s;
        }
        return tmpStr;
    }










}
