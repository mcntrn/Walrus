package com.navlog.models;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AirplaneProfileModel implements java.io.Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6939222492100483403L;
	private String airplaneName;
	private String airplaneBrand;
	private String airplaneModel;
	private String airplaneTailNumber;
	private Map<String ,CruisePerformanceModel> performanceParams = new HashMap<String,CruisePerformanceModel>();
	
	public AirplaneProfileModel()
	{
		
	}
	
	
	public void addCruisePerformanceParam(String label,CruisePerformanceModel param)
	{
		performanceParams.put(label, param);
		
	}
	
	public void removeCruisePerformanceParam(String label)
	{
		performanceParams.remove(label);
	}
	public CruisePerformanceModel getCruisePerformanceParam(String label)
	{
		CruisePerformanceModel mod = new CruisePerformanceModel();
		if(performanceParams.containsKey(label))
		{
			mod = performanceParams.get(label);
		}
			return mod;
	}
	
	public String[] getAllLabels()
	{
		int size = performanceParams.size();
		int index = 0;
		String[] labels = new String[size];
		Iterator<Map.Entry<String ,CruisePerformanceModel>> entries = performanceParams.entrySet().iterator();
		while (entries.hasNext()) 
		{
		    Map.Entry<String ,CruisePerformanceModel> entry = entries.next();
		    labels[index] = entry.getKey();
		    index++;
		}
		return labels;
	}
	
	public AirplaneProfileModel(String name, String brand, String model, String tailNum)
	{
		this.setAirplaneName(name);
		this.setAirplaneBrand(brand);
		this.setAirplaneModel(model);
		this.setAirplaneTailNumber(tailNum);
	}
	
	public String getAirplaneName() {
		return airplaneName;
	}
	public void setAirplaneName(String airplaneName) {
		this.airplaneName = airplaneName;
	}
	public String getAirplaneBrand() {
		return airplaneBrand;
	}
	public void setAirplaneBrand(String airplaneBrand) {
		this.airplaneBrand = airplaneBrand;
	}
	public String getAirplaneModel() {
		return airplaneModel;
	}
	public void setAirplaneModel(String airplaneModel) {
		this.airplaneModel = airplaneModel;
	}
	public String getAirplaneTailNumber() {
		return airplaneTailNumber;
	}
	public void setAirplaneTailNumber(String airplaneTailNumber) {
		this.airplaneTailNumber = airplaneTailNumber;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public String getLabel()
	{
		String displayName;
		displayName = this.getAirplaneName() +" - " 
					+ this.getAirplaneBrand() +" - "
					+ this.getAirplaneModel();
		
		return displayName;
	}
	
	
		

}