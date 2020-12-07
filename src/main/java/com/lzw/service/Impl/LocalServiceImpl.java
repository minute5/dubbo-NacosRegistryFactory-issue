package com.lzw.service.Impl;

import com.lzw.service.LocalService;
import com.lzw.service.Test3Service;
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

    @DubboReference
    private Test3Service test3Service;

    public void someMethod(String param) {
        testService.test("xx");
        test3Service.test("xx");
        // code here
    }
}
