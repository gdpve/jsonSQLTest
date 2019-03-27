package com.itheima.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.apache.commons.io.FileUtils;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.itheima.dao.RegionDao;



public class JsonAnalyze {
	static String jsonPath="E:\\test.json";
	
	
	@Test
	public  void test() {
   
		RegionDao dao= new RegionDao();
		try {
			 ArrayList<Region> regionList =parseJosn(jsonPath);
		     dao.testAdd(regionList);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	public static ArrayList<Region> parseJosn(String str) throws IOException {
		
		ArrayList<Region> regionList= new ArrayList<Region>();
		System.out.println("路径："+str);
		
        File file=new File(str);
        String content= FileUtils.readFileToString(file,"UTF-8");
        //String jsonString = FileUtils.readFileToString(file);
        JSONObject jsonObject = JSONObject.parseObject(content);  
        Set<String> keySet = jsonObject.keySet();   
        int pvircode=1;
        for (String pid: keySet) {//
        	pvircode++;
        	String porgCode=pid; //---  省Code
        	
			JSONObject test = jsonObject.getJSONObject(pid);
            String json= test.toJSONString();
            Province province= JSONArray.parseObject(json, Province.class); 
            String porgName =province.getName();  //--- 省name
           
            String porgid=UUID.randomUUID().toString().replace("-", "");//---省id
            String pparentOrgid="-1";//---省pid
            String pvircode_str=null;
            if(pvircode>9){
            	  pvircode_str=  "00"+pvircode; //---省虚拟编码
      		 }
      		 else{
      		     pvircode_str=  "000"+pvircode; //---省虚拟编码
      	     }
            Region pregion = new Region(porgid,porgCode,pvircode_str,porgName,pparentOrgid,null,null,null);  //省区域
            regionList.add(pregion);
            System.out.println("省区域："+pregion);
            Map<String,City> citys= province.getChild(); 
            int cvircode=0;
            for (Map.Entry<String, City> entry : citys.entrySet())
            {  
            	cvircode++;
            	String corgCode =entry.getKey() ;//----城市的Code
            	City city =entry.getValue();
            	String corgName=city.getName();     //----城市的name
              
                String corgid=UUID.randomUUID().toString().replace("-", "");//---市id
                String cparentOrgid=porgid;//---市pid
                String cvircode_str=null;
                if(cvircode>9){
       	    	   cvircode_str=pvircode_str+"00"+cvircode; //城市的虚拟编码
       		    }
       		     else{
       			   cvircode_str=pvircode_str+"000"+cvircode;  //城市的虚拟编码
       	        }
                Region cregion = new Region(corgid,corgCode,cvircode_str,corgName,cparentOrgid,null,null,null);  //市区域
                regionList.add(cregion);
                System.out.println("市区域："+cregion);
            	Map<String, String> districts= city.getChild();
            	int dvircode=0;
            	for (Map.Entry<String, String> district : districts.entrySet())
                {
            		dvircode++;
            		String dorgCode=district.getKey() ;  //区域code
                	String dorgName=district.getValue();   //区域name
                	
                     String dorgid=UUID.randomUUID().toString().replace("-", "");//---市id
                     String dparentOrgid=corgid;//---区域pid
                     String dvircode_str=null;
                     if(cvircode>9){
                    	 dvircode_str = cvircode_str+"00"+dvircode; //---区域虚拟编码
               		  }
               		 else{
               		      dvircode_str= cvircode_str+"000"+dvircode; //---区域虚拟编码
               	        }
                   Region dregion = new Region(dorgid,dorgCode,dvircode_str,dorgName,dparentOrgid,null,null,null);  //区域
                   regionList.add(dregion); 
                   System.out.println("区域："+dregion);
                }	
            }   
         
        }
        return regionList;
	}

}


