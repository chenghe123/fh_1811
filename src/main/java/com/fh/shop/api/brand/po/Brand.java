package com.fh.shop.api.brand.po;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Brand implements Serializable {
    private static final long serialVersionUID = 7476219107604521153L;

    private Integer id;

    private String brandName;

    private Date createDate;
}
