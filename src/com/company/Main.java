package com.company;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class MobileCodes {
    public static void main(String args[]){
        HashMap<Integer, String> hmap = new HashMap<>();
        hmap.put(24, "Белтелеком (Максифон)");
        hmap.put(25, "life😃");
        hmap.put(291, "Velcom");
        hmap.put(292, "МТС");
        hmap.put(293, "Velcom");
        hmap.put(294, "Diallog");
        hmap.put(295, "МТС");
        hmap.put(296, "Velcom");
        hmap.put(297, "МТС");
        hmap.put(298, "МТС");
        hmap.put(299, "Velcom");
        hmap.put(33, "МТС");
        hmap.put(44, "Velcom");

        String phone="+375298342332";

        for (Integer key: hmap.keySet()){
            String value=hmap.get(key);
            if (phone.indexOf(key.toString())==4)
        System.out.println(value);
    }


    }
}