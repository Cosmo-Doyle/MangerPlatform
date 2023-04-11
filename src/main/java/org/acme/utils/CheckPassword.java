package org.acme.utils;

public class CheckPassword {
    //数字
    public static final String REG_NUMBER =".*\\d+.*";
    //小写字母
    public static final String REG_UPPERCASE =".*[A-Z]+.*";
    //大写字母
    public static final String REG_LOWERCASE =".*[a-z]+.*";
    //特殊符号
    public static final String REG_SYMBOL =".*[~!@#$%^&*()_+|<>,.?/:;'\\[\\]{}\"]+.*";

    public static final boolean isPswComplex(String password){
        if(password == null||password.length()<8)return false;
        int i=0;
        if(password.matches(REG_NUMBER))i++;
        if(password.matches(REG_LOWERCASE))i++;
        if(password.matches(REG_UPPERCASE))i++;
        if(password.matches(REG_SYMBOL))i++;

        return i>3;
//        if(i<=3) return false;
//
//        return true;
    }
}
