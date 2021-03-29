package com.goffity.demo.aws.lbtest.info;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Slf4j
@RestController
public class InfoController {

    @Value("${server.port}")
    String port;

    @GetMapping(value = "/")
    public ResponseEntity<InfoModel> getInfo() throws UnknownHostException {
        return new ResponseEntity<>(new InfoModel(InetAddress.getLocalHost().getHostAddress(), InetAddress.getLocalHost().getHostName(), port, InetAddress.getLoopbackAddress().getHostAddress(), InetAddress.getLoopbackAddress().getHostName()), HttpStatus.OK);
    }
}
