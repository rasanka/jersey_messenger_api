package com.ebees.rest.messenger.api.database;

import java.util.HashMap;
import java.util.Map;

import com.ebees.rest.messenger.api.models.Message;

public class DBManager {

	private static Map<Long, Message> messages = new HashMap<>();

	public static Map<Long, Message> getMessages() {
		return messages;
	}

}
