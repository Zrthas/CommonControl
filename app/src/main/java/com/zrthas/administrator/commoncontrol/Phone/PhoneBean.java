package com.zrthas.administrator.commoncontrol.Phone;

/**
 * Created by Administrator on 2016/4/20.
 */
public class PhoneBean {
    private String phoneNumber;
    private String phoneName;

    public PhoneBean(String phoneName,String phoneNumber){
        setPhoneName(phoneName);
        setPhoneNumber(phoneNumber);
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }
}
