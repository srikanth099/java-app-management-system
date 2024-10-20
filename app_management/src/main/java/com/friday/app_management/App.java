package com.friday.app_management;

import java.util.Date;

import com.friday.app_management.daoRepository.AppRepository;
import com.friday.app_management.entity.AppDetails;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		AppDetails appDetails = new AppDetails();
		appDetails.setAltKey(100);
		appDetails.setServiceName("Powertrack");
		appDetails.setUrl("org.@powertrack.tractor");
		appDetails.setStatus("up");
		Date date = new Date();
		appDetails.setCreatedDate(date);
		appDetails.setCreatedBy("Srikanthkrishna");
		appDetails.setModifiedDate(date);
		appDetails.setModifiedBy("no one");
		AppRepository app = new AppRepository();
		app.save(appDetails);
		AppDetails fId = app.findById(100);
		System.out.println(fId);
	}
}
