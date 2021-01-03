package com.sl.SlShare.demo;

import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookController {
	@GetMapping("/books")
	public ModelAndView books() {
		List<Book> books = new ArrayList<Book>();
		Book bk1 = new Book();
		bk1.setId(1);
		bk1.setName("三国演义");
		bk1.setAuthor("罗贯中");
		Book bk2 = new Book();
		bk2.setId(21);
		bk2.setName("红楼梦");
		bk2.setAuthor("曹雪芹");
		books.add(bk1);
		books.add(bk2);
		ModelAndView mv = new ModelAndView();
		mv.addObject("books", books);
		mv.setViewName("books");
		return mv;
	}
}
