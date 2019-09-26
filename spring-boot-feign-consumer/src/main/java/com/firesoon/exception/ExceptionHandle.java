package com.firesoon.exception;

import com.firesoon.clinet.CommonFeignClient;
import feign.hystrix.FallbackFactory;

/**
 * @description:
 * @author: zhuzz
 * @date: 2019-09-26 15:58
 */
public class ExceptionHandle implements FallbackFactory<CommonFeignClient> {
    @Override
    public CommonFeignClient create(Throwable throwable) {
        System.out.println(throwable.fillInStackTrace());
        return null;
    }
}
