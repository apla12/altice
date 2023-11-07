package com.altice.service;

import org.springframework.stereotype.Service;

@Service
public class LabseqServiceImpl implements LabseqService{

    @Override
    public Integer sequenceValue(Integer num) {
        if (num == 0 || num == 2) {
            return 0;
        }
        if (num == 1 || num == 3) {
            return 1;
        }
        return sequenceValue(num - 3) + sequenceValue(num - 4);
    }
}
