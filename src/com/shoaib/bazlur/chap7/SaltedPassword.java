package com.shoaib.bazlur.chap7;

public class SaltedPassword extends Password{
    private String salt;

    public SaltedPassword(char[] hash, String salt) {
        super(hash);
        this.salt = salt;
    }
}
