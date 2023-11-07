package com.altice.service.test;

import com.altice.service.LabseqService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
public class LabseqServiceTest {

    @Mock
    LabseqService service;

    @Test
    void shouldCountSequence() {
        given(service.sequenceValue(any())).willReturn(0);
        Integer retorno = service.sequenceValue(0);
        Assertions.assertEquals(0, retorno);
    }
}
