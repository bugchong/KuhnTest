package com.example.kuhntest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;


public class JsonUtils
{
    /**
     * 从服务器端得到的JSON字符串数据
     * 解析JSON字符串数据，放入List当中
     */
    public static List<Map> parseCities(String jsonString)
    {

        List<Map> ss = new ArrayList<Map>();      
        try
        {   
        	Map<String, Object> en;
        	JSONArray jsonArray = new JSONArray(jsonString);
            for(int i = 0; i < jsonArray.length(); i++)
            {
            	en = new HashMap<String, Object>();
            	JSONObject item = jsonArray.getJSONObject(i);
            	
            	en.put("id", item.getInt("id"));
            	en.put("stockcode", item.getInt("stockcode"));
            	en.put("stockname",item.getString("stockname"));
            	en.put("title",item.getString("title"));
            	ss.add(en);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        
        return ss;
    }
}