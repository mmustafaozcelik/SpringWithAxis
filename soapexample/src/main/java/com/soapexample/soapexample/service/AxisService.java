package com.soapexample.soapexample.service;

import org.springframework.stereotype.Service;

@Service
public class AxisService {

    public String getMessage() {
        return "Axis Service ";
    }

    public String getMessageWithName(String name) {
        return "Axis Service " + name;
    }
}
