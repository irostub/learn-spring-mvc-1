package com.irostub.servletserver.web.frontcontroller.v3;

import com.irostub.servletserver.web.frontcontroller.ModelView;

import java.util.Map;

public interface ControllerV3 {
    ModelView process(Map<String, String> paramMap);
}
