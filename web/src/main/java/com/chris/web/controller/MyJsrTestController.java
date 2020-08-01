package com.chris.web.controller;

import bean.MyJSRAdvancedTest;
import bean.MyJSRTestBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import validGroups.Groups;

import javax.validation.Valid;
import javax.validation.Validation;

@RestController
@RequestMapping("/MyJsrTest/")
@Api(tags = "JSR303用法展示")
public class MyJsrTestController {
    @PostMapping(value = "Normal")
    @ApiOperation("JSR303一般用法展示")
    public String normalJSRTest(@Valid @RequestBody MyJSRTestBean myJSRTestBean){
        return "终于成功了";
    }
    @PostMapping(value = "Advance/Add")
    @ApiOperation("JSR303高级用法分组(新增)")
    public String advanceJSRTestAdd(@Validated(Groups.Add.class) @RequestBody MyJSRAdvancedTest myJSRTestBean){
        return "终于成功了";
    }

    @PostMapping(value = "Advance/Update")
    @ApiOperation("JSR303高级用法分组(更新)")
    public String advanceJSRTestUpdate(@Validated(Groups.Update.class)  @RequestBody MyJSRAdvancedTest myJSRTestBean){
        return "终于成功了";
    }
}
