/*-------------------------------------------------------------------------+
|                                                                          |
| Copyright 2012 Technische Universitaet Muenchen and                      |
| Fraunhofer-Institut fuer Experimentelles Software Engineering (IESE)     |
|                                                                          |
| Licensed under the Apache License, Version 2.0 (the "License");          |
| you may not use this file except in compliance with the License.         |
| You may obtain a copy of the License at                                  |
|                                                                          |
|    http://www.apache.org/licenses/LICENSE-2.0                            |
|                                                                          |
| Unless required by applicable law or agreed to in writing, software      |
| distributed under the License is distributed on an "AS IS" BASIS,        |
| WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. |
| See the License for the specific language governing permissions and      |
| limitations under the License.                                           |
|                                                                          |
+-------------------------------------------------------------------------*/

package edu.tum.cs.conqat.quamoco.lightweightxml;

import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;


public class Text implements XMLItem {
    protected String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = translateHtmlCharCodes(text);
    }

    public Text(String s) {
        setText(s);
    }

    public String toString() {
        return text.replace('\r', ' ').replace('\n', ' ');
    }

    private static HashMap<String, String> table = new HashMap<String, String>();
    static {
        table.put("auml", "�");
        table.put("Auml", "�");
        table.put("ouml", "�");
        table.put("Ouml", "�");
        table.put("uuml", "�");
        table.put("Uuml", "�");
        table.put("amp", "&");
        table.put("lt", "<");
        table.put("gt", ">");
        table.put("quot", "\"");
        table.put("szlig", "�");
        table.put("lt","<")    ; table.put("gt",">");
        table.put("amp","")   ; table.put("quot","\"");
        table.put("agrave","�"); table.put("Agrave","�");
        table.put("acirc","�") ; table.put("auml","�");
        table.put("Auml","�")  ; table.put("Acirc","�");
        table.put("aring","�") ; table.put("Aring","�");
        table.put("aelig","�") ; table.put("AElig","�" );
        table.put("ccedil","�"); table.put("Ccedil","�");
        table.put("eacute","�"); table.put("Eacute","�" );
        table.put("egrave","�"); table.put("Egrave","�");
        table.put("ecirc","�") ; table.put("Ecirc","�");
        table.put("euml","�")  ; table.put("Euml","�");
        table.put("iuml","�")  ; table.put("Iuml","�");
        table.put("igrave","�")  ; table.put("Igrave","�");
        table.put("ocirc","�") ; table.put("Ocirc","�");
        table.put("ouml","�")  ; table.put("Ouml","�");
        table.put("oslash","�") ; table.put("Oslash","�");
        table.put("szlig","�") ; table.put("ugrave","�");
        table.put("Ugrave","�"); table.put("ucirc","�");
        table.put("Ucirc","�") ; table.put("uuml","�");
        table.put("Uuml","�")  ; table.put("nbsp"," ");
        table.put("copy","\u00a9");
        table.put("reg","\u00ae");
        table.put("euro","\u20a0");
        table.put("iacute","�");
        table.put("yacute","�");
        table.put("aacute","�");
        table.put("uacute","�");
        table.put("eacute","�");
        table.put("oacute","�");
        table.put("Iacute","�");
        table.put("Yacute","�");
        table.put("Aacute","�");
        table.put("Uacute","�");
        table.put("Eacute","�");
        table.put("Oacute","�");
        table.put("raquo","�");	table.put("laquo","�");
        

    }

    private String translateHtmlCharCodes(String s) {
        if (s == null) {
            return null;
        }
        StringBuffer sb = new StringBuffer(s.length());
        StringBuffer help = new StringBuffer();
        int status = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (status == 0) {
                if (c == '&') {
                    help = new StringBuffer();
                    status = 1;
                } else {
                    sb.append(c);
                }
            } else if (status == 1) {
                if (c == ';') {
                    String code = help.toString();
                    if (code.startsWith("#")) {
                        try {
                            int nr = Integer.parseInt(code.substring(1));
                            sb.append((char) nr);
                        } catch (Exception e) {
                            sb.append('&');
                            sb.append(help.toString());
                            sb.append(';');
                        }
                    } else {
                    	String tableentry =(String) table.get(code);
                    	if(tableentry != null) {
                    		sb.append(tableentry);
                    	} else {
                    		sb.append("&" + code + ";");
                    	}
                    }
                    status = 0;
                } else {
                    help.append(c);
                    if (help.length() > 8) {
                        sb.append('&');
                        sb.append(help.toString());
                        status = 0;
                    }
                }
            }
        }
        return sb.toString();
    }

    public void writeToStream(OutputStream out) throws IOException {
        if (this.text != null) {
            out.write(this.text.getBytes("UTF-8"));
        }
    }

}