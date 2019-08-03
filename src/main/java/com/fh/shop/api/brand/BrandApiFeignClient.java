package com.fh.shop.api.brand;

import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient("")
public interface BrandApiFeignClient extends BrandApi{
}
