package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TulingController {

	@RequestMapping("/qs")
	public String FirstSBHelloWorld(){
		return "aw ";
	}
}

