package com.example.service.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.example.service.INotificationService;
@Component
@Profile("htc")
public class HtcNotificationServiceImpl implements INotificationService {

	@Override
	public void notificate() {
		System.out.println("Only for HTC Profile");
	}

}
