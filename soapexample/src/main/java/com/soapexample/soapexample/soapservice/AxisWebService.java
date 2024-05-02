package com.soapexample.soapexample.soapservice;

import com.soapexample.soapexample.service.AxisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

@WebService
@Service
public class AxisWebService {

    @Autowired
    AxisService axisService;

    public String getMessageWithName(String name) {
        return axisService.getMessageWithName(name);
    }
    public String getAxisMessage() {
        return axisService.getMessage();
    }

}
