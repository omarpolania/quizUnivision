package com.co.univision.quiz;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.co.univision.quiz.controller.MessageController;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class QuizApplicationTests {
	
	
	 @Autowired
	 private MockMvc mockMvc;
	
	@Test
    public void noParamGreetingShouldReturnDefaultMessage() throws Exception {
		
		String id = "omarquiz-1";
		StringBuilder expectedResult = new StringBuilder().append("{\"")
					.append(MessageController.ID_PARAMETER)
					.append("\":\"").append(id).append("\"").append(",\"message").append("\":\"").append("This is a quiz :)").append("\"}");
		this.mockMvc.perform(get(MessageController.MESSAGE_URL).param(MessageController.ID_PARAMETER, id))
        .andExpect(status().isOk())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
        .andExpect(content().json(expectedResult.toString(),true))
        .andDo(print());
       
    }

}