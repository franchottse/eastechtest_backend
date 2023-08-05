package com.example.eastechtest.confiugration;

import com.example.eastechtest.repository.FormRepository;
import com.example.eastechtest.service.FormService;
import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Profile("test")
@Configuration
public class FormRepositoryConfiguration {
    @Bean
    @Primary
    public FormRepository formRepository() {
        return Mockito.mock(FormRepository.class);
    }
}
