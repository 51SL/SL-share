package com.sl.SlShare.demo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "书本实体类",description = "书本列表描述类")
public class Book {
	@ApiModelProperty(value="书本编号")
	private Integer id;
	@ApiModelProperty(value="书本名称")
	private String name;
	@ApiModelProperty(value="书本作者")
	private String author;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
}
