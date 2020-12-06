package com.lzw.service.Impl;

import com.lzw.service.LocalService;
import com.lzw.service.Test2Service;
import com.lzw.service.TestService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

/**
 * @author zongw.lee@gmail.com
 * @since 2020-12-06
 */
@Service
public class LocalServiceImpl implements LocalService {

    @DubboReference
    private TestService testService;

    public void someMethod(String param) {
        testService.test("xx");
        // code here
    }
}
