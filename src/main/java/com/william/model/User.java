package com.william.model;

import java.io.Serializable;

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
public class User implements Serializable {
    private static final long serialVersionUID = 4575862439519392562L;

    private String  name;
    private int     age;
    private String  tel;
}
