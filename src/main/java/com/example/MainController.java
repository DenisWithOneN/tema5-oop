package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
 
	@GetMapping("/laptops")
	 public ModelAndView brandLaptop(@RequestParam String brand)  {
		 
		ModelAndView mav = new ModelAndView();
		
		int brandLength = brand.length();
		
		String oddEven = (brandLength % 2 == 0) ? "par" : "impar";
	
		mav.addObject("laptopBrand", brand); // param1 => ce apare in file ul jsp, param2 => ce apare in parametru brandLaptop
		mav.addObject("brandlength", brandLength);
		mav.addObject("parity", oddEven);
		
		mav.setViewName("laptopbrand");
		return mav;
		
	 }
	
	@GetMapping("/convert")
	public ModelAndView converterValutar(@RequestParam String ron, String EURO) {
		ModelAndView mav = new ModelAndView();
		
		int sumaConvertita = Integer.parseInt(ron) / Integer.parseInt(EURO);
		
		mav.addObject("ron", ron);
		mav.addObject("EURO", EURO);
		mav.addObject("sumaConvertita", sumaConvertita);
		
		mav.setViewName("convertor");
		
		return mav;
	}
	
	@PostMapping("/laptopsinput")
	public ModelAndView brandLaptopInput(@RequestParam("brandName") String brandName) {
		
		ModelAndView mav = new ModelAndView();
		
		int brandLength = brandName.length();
		
		String oddEven = (brandLength % 2 == 0) ? "par" : "impar";
	
		mav.addObject("laptopBrand", brandName);
		mav.addObject("brandlength", brandLength);
		mav.addObject("parity", oddEven);
		
		mav.setViewName("laptopinput");
		
		return mav;
	}
	
	@GetMapping("/laptopsinput")
	public ModelAndView displayBrandLaptopInput() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("laptopinput");
		return mav;
	}
	
	@PostMapping("/convertinput")
	public ModelAndView converterValutarInput(@RequestParam("ron") int ron, @RequestParam("EURO") int EURO) {
		ModelAndView mav = new ModelAndView();
		
		int sumaConvertita = ron / EURO;
		
		mav.addObject("ron", ron);
		mav.addObject("EURO", EURO);
		mav.addObject("sumaConvertita", sumaConvertita);
		
		mav.setViewName("convertorinputDisplay");
		return mav;
	}
	
	@GetMapping("/convertinput")
	public ModelAndView displayConvertInput() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("convertorinput");
		return mav;
	}
	
	@GetMapping("/")
	public String showHomePage() {
		return "index";
	}
}