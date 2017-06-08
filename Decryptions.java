package com.kukharuk.jdecrypter.awt;


public class Decryptions {
	//bidlocode just use verification input DATA is string or int
	public boolean checkString(String string) {
        try {
            Integer.parseInt(string);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
