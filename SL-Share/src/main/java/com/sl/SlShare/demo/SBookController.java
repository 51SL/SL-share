package com.sl.SlShare.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
@RestController
@Api(tags = "书籍接口")
public class SBookController {
	@ApiOperation(value = "查询书本",notes = "根据ID查询")
	@ApiImplicitParam(paramType = "path",name = "id",value = "书本id",required = true)
	@GetMapping("/books/{id}")
	public String getBookById(@PathVariable Integer id) {
		return "/books/" + id;
	}
}
