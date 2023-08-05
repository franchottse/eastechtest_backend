package com.example.eastechtest;

import com.example.eastechtest.model.User;
import com.example.eastechtest.repository.FormRepository;
import org.junit.jupiter.api.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.NoSuchElementException;

@SpringBootTest
@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
class EastechtestApplicationTests {
	@Autowired
	private FormRepository formRepository;

	@Test
	public void whenIdIsValid_thenReturnUser() {
		Long id = 1L;
		formRepository.insert("Test", "User");

		User user = formRepository.findById(id).get();
		Assert.assertEquals("Test", user.getFirstname());
		Assert.assertEquals("User", user.getLastname());
	}

	@Test
	public void whenIdIsInvalid_thenThrowError() {
		Long id = 100L;

		Assert.assertThrows(NoSuchElementException.class, () -> formRepository.findById(id).get());
	}
}
