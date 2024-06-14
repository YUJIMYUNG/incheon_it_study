package com.korea.json;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import vo.PersonVO;

@Controller
public class JsonControllor {
	
	@RequestMapping("/vo_to_json")
	@ResponseBody//자바 객체를 json기만의 Http Body로 변환
	public PersonVO voJson(Model model) {
		PersonVO vo = new PersonVO();
		vo.setName("홍길동");
		vo.setAge(30);
		vo.setAddr("인천시 부평구");
		model.addAttribute("vo", vo);
		return vo;
	}
	
	@RequestMapping("/map_to_json")
	@ResponseBody
	public HashMap<String, Object> mapJson(){
		HashMap<String, Object> map = new HashMap<String, Object>();
		
		map.put("name", "김길동");
		map.put("age", "20");
		
		HashMap<String, Object> tel_map = new HashMap<String, Object>();
		tel_map.put("home", "010-1111-1111");
		tel_map.put("cell", "010-2222-2222");
		
		map.put("tel", tel_map);
		
		return map;
	}
	
	@RequestMapping("/list_to_json")
	@ResponseBody
	public List<PersonVO> listJson(){
		List<PersonVO> list = new ArrayList<PersonVO>();
		
		PersonVO p1 = new PersonVO();
		p1.setName("홍길동");
		p1.setAddr("인천시 부평구");
		p1.setAge(30);
		
		PersonVO p2 = new PersonVO();
		p2.setName("김길동");
		p2.setAddr("인천시 계양구");
		p2.setAge(20);
		
		list.add(p1);
		list.add(p2);
		
		return list;
	}
	
	@RequestMapping("/json_to_object")
	public String jsonObject(Model model) throws JsonParseException, JsonMappingException, IOException {
		String jsonStr = "{\"name\":\"Anna\",\"age\":30,\"addr\":\"인천시 부평구\"}";
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		//Json  String -> Person Object
		PersonVO vo = objectMapper.readValue(jsonStr, PersonVO.class);
		
		model.addAttribute("vo", vo);
		
		return "/WEB-INF/views/jsonTest.jsp";
	
	}
	
	@RequestMapping("/json_to_map")
	public String jsonMap(Model model) throws JsonParseException, JsonMappingException, IOException{
		String jsonStr = "{\"name\":\"Anna\",\"age\":30,\"addr\":\"인천시 부평구\"}";
	
		ObjectMapper objectMapper = new ObjectMapper();
		
		Map<String, Object> jsonMap = objectMapper.readValue(jsonStr, new TypeReference<Map<String, Object>>(){});
		
		model.addAttribute("jsonMap", jsonMap);
		
		return "/WEB-INF/views/jsonTest.jsp";
	}
	
	@RequestMapping("/json_to_list")
	public String jsonList(Model model) throws JsonParseException, JsonMappingException, IOException {
		String jsonArrStr = "[{\"name\":\"Anna\",\"age\":30,\"addr\":\"인천시 부평구\"},{\"name\":\"James\",\"age\":40,\"addr\":\"인천시 계양구\"}]";
		ObjectMapper objectMapper = new ObjectMapper();
		
		List<PersonVO> list = objectMapper.readValue(jsonArrStr, new TypeReference<List<PersonVO>>(){});
		model.addAttribute("list", list);
		
		return "/WEB-INF/views/jsonTest2.jsp";
		
	}
	
	@RequestMapping("/outer_json")
	public String outerJson() {
		return "/WEB-INF/views/jsonTest3.jsp";
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
