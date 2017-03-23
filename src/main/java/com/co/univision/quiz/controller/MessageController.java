package com.co.univision.quiz.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.co.univision.quiz.model.Message;

@RestController
public class MessageController {
	public static final String MESSAGE_URL = "/v1/message";
	public static final String ID_PARAMETER = "id";
    @RequestMapping(value = MessageController.MESSAGE_URL)
    public Message message(@RequestParam(value="id") String id) {
        Message message  = new Message (id);
        return message;
    }
}
