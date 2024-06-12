package com.korea.di;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import vo.PersonVO;

@Controller
public class ParamCotroller {

		@RequestMapping(value= {"/","/insert_form"})
		public String insert_form() {
			return "insert_form";
		}
		
		@RequestMapping("insert1")
		public String insert1(@RequestParam String name, @RequestParam int age, Model model) {
			PersonVO vo = new PersonVO();
			vo.setName(name);
			vo.setAge(age);
			
			model.addAttribute("vo",vo);
			return "intsert_result";
		}
		
		@RequestMapping("insert2")
								//@ModelAttribute("personVO") PersonVO vo
		public String intsert2(@ModelAttribute PersonVO vo) {
			//name과 age가 vo에 세팅이 되는데 만약 vo에 속성이 더 있다면 기본값으로 세팅이 된다. 
			//String이 있다면 null, int라면 0 기본값 
			
			//@ModelAttribute쓰지 않는다면
			//model.addAttribute("vo",vo);
			
			//@ModelAttribute쓴다면 
			return "insert_result";
		}
}
