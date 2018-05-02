package com.claire.tools.yaml;

import java.util.Map;

public class IRequest {
	private String path;
	private String method;
	private Map<String,Object> params = null;
	private Map<String,Object> formParams = null;
	private Map<String,Object> queryParams = null;
	
	public Map<String, Object> getFormParams() {
		return formParams;
	}
	public void setFormParams(Map<String, Object> formParams) {
		this.formParams = formParams;
	}
	public Map<String, Object> getQueryParams() {
		return queryParams;
	}
	public void setQueryParams(Map<String, Object> queryParams) {
		this.queryParams = queryParams;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public Map<String, Object> getParams() {
		return params;
	}
	public void setParams(Map<String, Object> params) {
		this.params = params;
	}

	
	
}
