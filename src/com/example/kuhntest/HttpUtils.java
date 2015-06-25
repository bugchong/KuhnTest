package com.example.kuhntest;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpUtils {
    public static String getJsonContent(String path){
        try {
            URL url=new URL(path);
            HttpURLConnection connection=(HttpURLConnection) url.openConnection();
            connection.setConnectTimeout(3000);
            connection.setRequestMethod("GET");
            connection.setDoInput(true);
            int code=connection.getResponseCode();
            if(code==200){
                return changeInputString(connection.getInputStream());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
 
    private static String changeInputString(InputStream inputStream) {
         
        String jsonString="";
        ByteArrayOutputStream outPutStream=new ByteArrayOutputStream();
        byte[] data=new byte[1024];
        int len=0;
        try {
            while((len=inputStream.read(data))!=-1){
                outPutStream.write(data, 0, len);
            }
            jsonString=new String(outPutStream.toByteArray());
         
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonString;
    }
 
}