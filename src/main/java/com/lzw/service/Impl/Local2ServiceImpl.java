package com.lzw.service.Impl;

import com.lzw.service.*;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

/**
 * @author zongw.lee@gmail.com
 * @since 2020-12-06
 */
@Service
public class Local2ServiceImpl implements LocalService {

    @DubboReference
    private Test2Service test2Service;

    @DubboReference
    private Test4Service test4Service;

    @DubboReference
    private Test5Service test5Service;

    public void someMethod(String param) {
        test2Service.test("xx");
        test4Service.test("xx");
        test5Service.test("xx");
        // code here
    }
}
