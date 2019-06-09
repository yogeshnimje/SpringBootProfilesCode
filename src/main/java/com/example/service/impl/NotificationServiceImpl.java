package com.example.service.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.example.service.INotificationService;
@Component
@Profile("Default")
public class NotificationServiceImpl implements INotificationService {

	@Override
	public void notificate() {
		System.out.println("Common for all");
	}

}
