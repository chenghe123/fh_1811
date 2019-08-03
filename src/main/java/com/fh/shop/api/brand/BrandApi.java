package com.fh.shop.api.brand;

import com.fh.shop.api.brand.po.Brand;
import com.fh.shop.util.ServerResponse;
import org.springframework.web.bind.annotation.*;

public interface BrandApi {

    @RequestMapping(value = "add",method = RequestMethod.POST)
    public ServerResponse addBrand(Brand brand);

    @GetMapping
    public ServerResponse findBrandList();
    @DeleteMapping("/{id}")
    public ServerResponse deleteBrand(@PathVariable Integer id);
    @GetMapping("/{id}")
    public ServerResponse findBrandById(@PathVariable Integer id);
    @PutMapping("/{id}")
    public ServerResponse updateBrand(@PathVariable Integer id,@RequestBody Brand brand);
    @RequestMapping(value = "findList",method = RequestMethod.GET)
    public ServerResponse findList();

}
