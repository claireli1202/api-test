package com.claire.tools.yaml;

public class YamlCase {	
	private Config config;
	private Case[] cases;
		
	public Config getConfig() {
		return config;
	}
	public void setConfig(Config config) {
		this.config = config;
	}

	public Case[] getCases() {
		return cases;
	}
	public void setCases(Case[] cases) {
		this.cases = cases;
	}

//	public String toString()  
//    {
//        StringBuilder sb = new StringBuilder();
//        sb.append("config:\n");
//        sb.append("\tscheme:" + config.getScheme() + "\n");
//        sb.append("cases:\n");
//        for (int i = 0; i < cases.length; i++) {
//        	Map<String,String> params = cases[i].getTestCase().getRequest().getParams();
//        	for (String key : params.keySet()){
//        		sb.append("\t" + key + ":" + params.get(key) + "\n");
//        	}
//        	
//            
//        }        
//        sb.append("\n");
//        return sb.toString();
//    }
}
