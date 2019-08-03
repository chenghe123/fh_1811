package com.fh.shop.api.brand.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class BrandVo implements Serializable {
    private static final long serialVersionUID = 7476219107604521153L;

    private Integer id;

    private String brandName;

    private String createDate;
}
