package com.assessment.boot.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(indexName="location_search")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LocationInfo {
	
	@Id
	private String id;
	private String locationInput;
	public String getLocationInput() {
		return locationInput;
	}
	public void setLocationInput(String locationInput) {
		this.locationInput = locationInput;
	}
}
