package com.goffity.demo.aws.lbtest.info;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class InfoModel {

    private String localHostAddress;
    private String localHostName;
    private String port;
    private String remoteHostAddress;
    private String remoteHostName;
}
