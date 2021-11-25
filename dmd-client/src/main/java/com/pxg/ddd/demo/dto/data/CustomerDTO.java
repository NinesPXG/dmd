package com.pxg.ddd.demo.dto.data;

import io.swagger.annotations.ApiModel;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
@ApiModel(value = "客户类", description = "用户")
public class CustomerDTO{
    @Schema(description = "客户ID",required = true)
    private String customerId;
    private String memberId;
    private String customerName;
    private String customerType;
    @NotEmpty
    private String companyName;
    @NotEmpty
    private String source;
}
