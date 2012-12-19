package com.rkukharuk.decrypt.ps;

public class Decryptions {

	public boolean checkString(String string) {
        try {
            Integer.parseInt(string);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
