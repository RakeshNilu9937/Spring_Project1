package com.rkm.API_withSpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Phone")
public class MyControler {
	@RequestMapping(value = "/Samsung", method = RequestMethod.GET)
	public String Samsung() {
		return "Samsung gelaxy S serise";
	}

	@RequestMapping(value = "/Iphone", method = RequestMethod.POST)
	public String Apple() {
		return "Iphone number and Se Serise";
	}

	@RequestMapping(value = "/Moto", method = RequestMethod.PUT)
	public String Moto() {
		return "Moto edge Serise";
	}

	@RequestMapping(value = "/Oppo", method = RequestMethod.DELETE)
	public String Oppo() {
		return "Oppo find n serise";
	}

	@RequestMapping(value = "/Nokia", method = RequestMethod.HEAD)
	public String Noka() {
		return "Nokia lumia serise";
	}

	@RequestMapping(value = "/Vivo", method = RequestMethod.OPTIONS)
	public String Vivo() {
		return "Vivo X serise";
	}

	@RequestMapping(value = "/Xaomi", method = RequestMethod.TRACE)
	public String Xaomi() {
		return "Mi mix Serise";
	}

}
