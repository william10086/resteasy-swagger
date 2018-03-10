package com.william.model;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: william
 * Date: 2018-03-10
 * Time: 上午11:00
 * Description: com.william.model
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "user", description = "用户模型信息")
public class User implements Serializable {
    private static final long serialVersionUID = 4575862439519392562L;

    @ApiModelProperty(name = "name", value = "用户名", dataType = "string", required = true, example = "王五")
    private String  name;
    @ApiModelProperty(name = "age", value = "年龄", dataType = "int", required = true, example = "18")
    private int     age;
    @ApiModelProperty(name = "tel", value = "地址", dataType = "string", required = true, example = "上海虹口")
    private String  tel;
}
