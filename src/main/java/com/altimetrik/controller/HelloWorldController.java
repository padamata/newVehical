package com.altimetrik.controller;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.ws.rs.QueryParam;

import com.altimetrik.model.Customer;
import com.altimetrik.model.Greeting;
import com.altimetrik.service.Search;
import com.altimetrik.service.SearchImpl;

@Controller
public class HelloWorldController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	private SearchImpl search;

	@GetMapping("/hello-world")
	@ResponseBody
	public Greeting sayHello(@RequestParam(name = "name", required = false, defaultValue = "Stranger") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

	@GetMapping("/")
	@ResponseBody
	public String customer() {
		JSONObject obj = new JSONObject();

		JSONArray type = new JSONArray();
		type.add("truck");
		type.add("suv");
		type.add("family car");
		type.add("2 seater sports car");

		JSONArray manufacturer = new JSONArray();
		manufacturer.add("Ford");
		manufacturer.add("Mercedes");
		manufacturer.add("Buick");

		JSONArray model = new JSONArray();
		model.add("Ford F150");
		model.add("Mercedes C-class");
		model.add("Buick enclave");
		model.add("Mercedes SL500");
		model.add("Ford Explorer");
		obj.put("type", type);
		obj.put("manufacturer", manufacturer);
		obj.put("model", model);

		return obj.toJSONString();
	}

	@GetMapping("/search")
	@ResponseBody
	public List<?> getVechialDetails(@QueryParam("type") String type, @QueryParam("manufacture") String manufacture,
			@QueryParam("model") String model) {
		return search.getVechicalDetails(type, manufacture, model);

	}
	
	@GetMapping("/admin")
	@ResponseBody
	public Search getDetails() {
		
		

		return null;

	}
	
	
	
	

}
