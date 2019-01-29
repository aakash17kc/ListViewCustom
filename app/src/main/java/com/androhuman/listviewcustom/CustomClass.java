package com.androhuman.listviewcustom;

import android.net.Uri;

public class CustomClass {

    private String Name;
    private String Reg;
    private String drawable;


    public CustomClass(String name, String reg, String drawable) {
        Name = name;
        Reg = reg;
        this.drawable = drawable;
    }


    public String getName() {
        return Name;
    }

    public String getReg() {
        return Reg;
    }

    public String getImageView() {
        return drawable;
    }
}
