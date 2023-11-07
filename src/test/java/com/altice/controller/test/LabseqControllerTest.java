package com.altice.controller.test;

import com.altice.controller.LabseqController;
import com.altice.service.LabseqService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.mockito.ArgumentMatchers.any;

@SpringBootTest
@AutoConfigureMockMvc
public class LabseqControllerTest {

    @InjectMocks
    LabseqController controller;
    @Mock
    LabseqService service;
    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldCountSequence() throws Exception {
        Mockito.when(service.sequenceValue(any())).thenReturn(0);
        mockMvc.perform(get("/labseq/0")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

}
