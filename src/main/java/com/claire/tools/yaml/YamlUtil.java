package com.claire.tools.yaml;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;

import org.ho.yaml.Yaml;



public class YamlUtil {
	public static YamlCase load(String path){
		YamlCase yCase = new YamlCase();
		
		try {
			File f = new File(path);
			yCase = Yaml.loadType(f,YamlCase.class);
//			System.out.println(yCase);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		return yCase;
	}
	
//	path: "C:\\Users\\claire\\workspace\\APITest\\src\\test\\resources\\yaml\\test1.yaml"
	public static void dump(String path) {
		YamlCase yCase = new YamlCase();
//		yCase.setContent();
		
		File output = new File(path);
		try {
			Yaml.dump(yCase, output, true);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void replaceVariable(Map<String,Object> params,Map<String,Object> variablesValue){
		if (params != null){
			for (String keyN : params.keySet()){
				Object paramValue = params.get(keyN);
//				Check if paramValue contains $varialble
				String pv = (String)paramValue;
//				System.out.println("pv.indexOf('$'):" + pv.indexOf("$"));
				if(pv.indexOf("$") != -1){							
//				replace the variable with values extracted from previous response
					if(variablesValue != null){
						for (String keyV : variablesValue.keySet()){
							if (keyV.equals(pv)){
								params.replace(keyN, variablesValue.get(keyV));
								break;
							}
						}
//						if(!isReplaced){
//							System.out.println("No corresponding value name found in Map VariableValues");
//							
//						}
					}else{
						System.out.println("Map of VariableValues is null");
					}
				}					
			}
		}else{
			System.out.println("Map of params is null");
		}
		
	}	
	
/*	public static void main(String[] args){
		
		//dump
		File f = new File("C:\\Users\\claire\\workspace\\APITest\\src\\test\\resources\\yaml\\output3.yaml");
		YamlCase yCase = new YamlCase();
		yCase.setBar(1);
		yCase.setFoo("hello");
		Config c = new Config();
		c.setScheme("https");
		yCase.setConfig(c);
		
		Case[] cases = new Case[2];
		for (int i=0; i<2; i++){
			cases[i] = new Case();
			TestCase testCase = new TestCase();
			testCase.setHost("www.jd.com");
			testCase.setPath("/" + i);
			cases[i].setTestCase(testCase);
			
		}
		

		yCase.setCases(cases);
		
		
		try {
			Yaml.dump(yCase, f, true);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		//load
		try {
			File f2 = new File("C:\\Users\\claire\\workspace\\APITest\\src\\test\\resources\\yaml\\test1.yaml");
			YamlCase y = Yaml.loadType(f2, YamlCase.class);
			System.out.println(y);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
	}
 	*/
}
