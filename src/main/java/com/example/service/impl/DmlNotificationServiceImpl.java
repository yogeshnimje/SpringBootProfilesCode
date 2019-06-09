package com.example.service.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.example.service.INotificationService;
@Component
@Profile("dml")
public class DmlNotificationServiceImpl implements INotificationService {

	@Override
	public void notificate() {
		System.out.println("Only for DML Profie");
	}

}
