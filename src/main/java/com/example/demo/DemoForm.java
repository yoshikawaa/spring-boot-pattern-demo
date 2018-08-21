package com.example.demo;

import javax.validation.constraints.Pattern;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DemoForm {
    
    @Pattern(regexp = "\\d{3}")
    private String valid;
    
    @Pattern(regexp = "\\d{1,3}")
    private String invalid;

}
