package com.deltaqin.bilibili.controller;

import com.deltaqin.bilibili.common.entities.ResultType;
import com.deltaqin.bilibili.dataobject.ColumnsInfo;
import com.deltaqin.bilibili.service.C08_GuanliService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

/**
 * @author deltaqin
 * @date 2021/6/18 下午11:12
 */
@RestController
@RequestMapping("/guanli")
@CrossOrigin(allowCredentials = "true", allowedHeaders = "*")
@Api(tags = "08 管理端 ")
@Slf4j
public class C08_GuanliController {
    @Autowired
    private C08_GuanliService guanliService;

    @ApiOperation(value = "通过id获取", notes = "")
    @RequestMapping(value = "/column/getByID", method = RequestMethod.GET)
    public ResultType getByID(@RequestParam int ID) {
        ColumnsInfo columnsInfo = guanliService.getByID(ID);
        return ResultType.create(columnsInfo);
    }

    @ApiOperation(value = "通过cid获取", notes = "")
    @RequestMapping(value = "/column/getByCID", method = RequestMethod.GET)
    public ResultType getByCID(@RequestParam long cid) {
        List<ColumnsInfo> columnsInfo = guanliService.getByCID(cid);
        return ResultType.create(columnsInfo);
    }

    @ApiOperation(value = "getAll", notes = "")
    @RequestMapping(value = "/column/getAll", method = RequestMethod.GET)
    public ResultType getAll() {
        List<ColumnsInfo> columnsInfo = guanliService.getAll();
        return ResultType.create(columnsInfo);
    }

    @ApiOperation(value = "add", notes = "")
    @RequestMapping(value = "/column/add", method = RequestMethod.POST)
    public ResultType add(@RequestBody ColumnsInfo columnsInfo) {
        if(guanliService.add(columnsInfo)){
            return ResultType.create("success");
        }else {
            return ResultType.create("fail");
        }
    }

    @ApiOperation(value = "del", notes = "")
    @RequestMapping(value = "/column/del", method = RequestMethod.POST)
    public ResultType del(@RequestParam int id) {
        if(guanliService.del(id)){
            return ResultType.create("success");
        }else {
            return ResultType.create("fail");
        }
    }

    @ApiOperation(value = "upt", notes = "")
    @RequestMapping(value = "/column/upt", method = RequestMethod.POST)
    public ResultType upt(@RequestBody ColumnsInfo columnsInfo) {
        if(guanliService.upt(columnsInfo)){
            return ResultType.create("success");
        }else {
            return ResultType.create("fail");
        }
    }
}
