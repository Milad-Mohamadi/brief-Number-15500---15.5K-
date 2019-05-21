package com.example.lococoder.md5;

public class Common {
  public static String briefNumber(String value) {
    int inputs=0;
    try {
      inputs=Integer.parseInt(value);
    }catch (Exception e){
    }
    String output=null;
    if (value.length()>=4 && value.length()<7){
      int abs=(int)Math.abs(inputs/1000);
      String ceil=(int)inputs%1000+"";
      int ceil0=0;
      if (ceil.length()>1){
//       ceil0=ceil.charAt(0);
        ceil0=Integer.parseInt(ceil.substring(0,1));
      }
      if (ceil0==0){
        output=abs+"K";
      }else{
        output=abs+"."+ceil0+"K";
      }
    } else if (value.length()>=7 && value.length()<10){
      int abs=(int)Math.abs(inputs/1000000);
      String ceil=(int)inputs%1000000+"";
      int ceil0=0;
      if (ceil.length()>1){
//       ceil0=ceil.charAt(0);
        ceil0=Integer.parseInt(ceil.substring(0,1));
      }
      if (ceil0==0){
        output=abs+"M";
      }else{
        output=abs+"."+ceil0+"M";
      }
    }else{
      output=value;
    }
    return output;
  }
}
