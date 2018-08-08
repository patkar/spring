package com.deloitte;

import java.util.*;

public class collectionexample {
	List<?> cityList;
	Set<?> citySetl;
	Map<?, ?>	cityMap;
	Properties cityProp;
	public List<?> getCityList() {
		System.out.println("ListElements:"+cityList);
		return cityList;
	}
	public void setCityList(List<?> cityList) {
		this.cityList = cityList;
	}
	public Set<?> getCitySetl() {
		System.out.println("setElements:"+citySetl);
		return citySetl;
	}
	public void setCitySetl(Set<?> citySetl) {
		this.citySetl = citySetl;
	}
	public Map<?, ?> getCityMap() {
		System.out.println("map elements:"+cityMap);
		return cityMap;
	}
	public void setCityMap(Map<?, ?> cityMap) {
		this.cityMap = cityMap;
	}
	public Properties getCityProp() {
		System.out.println("properties elements:"+cityProp);
		return cityProp;
	}
	public void setCityProp(Properties cityProp) {
		this.cityProp = cityProp;
	}
}
