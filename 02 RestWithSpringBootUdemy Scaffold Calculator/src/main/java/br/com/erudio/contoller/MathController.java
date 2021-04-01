package br.com.erudio.contoller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.exception.UnsuportedMathOperationExeption;
import br.com.erudio.math.SimpleMath;
import br.com.erudio.request.converters.NumberConverters;

@RestController
public class MathController {

	
	SimpleMath math = new SimpleMath();
	
	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo)
			throws Exception {
		if (!NumberConverters.isNumeric(numberOne) || !!NumberConverters.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationExeption("Please set a numeric value!");
		}
		return math.sum(NumberConverters.convertToDouble(numberOne), NumberConverters.convertToDouble(numberTwo));

	}
	
	@RequestMapping(value = "/sub/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double sub(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo)
			throws Exception {
		if (!NumberConverters.isNumeric(numberOne) || !!NumberConverters.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationExeption("Please set a numeric value!");
		}
		
		return math.sub(NumberConverters.convertToDouble(numberOne), NumberConverters.convertToDouble(numberTwo));

	}
	
	@RequestMapping(value = "/mult/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double mult(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo)
			throws Exception {
		if (!NumberConverters.isNumeric(numberOne) || !!NumberConverters.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationExeption("Please set a numeric value!");
		}

		return math.mult(NumberConverters.convertToDouble(numberOne), NumberConverters.convertToDouble(numberTwo));

	}
	
	@RequestMapping(value = "/div/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double div(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo)
			throws Exception {
		if (!NumberConverters.isNumeric(numberOne) || !!NumberConverters.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationExeption("Please set a numeric value!");
		}
		
		return math.div(NumberConverters.convertToDouble(numberOne), NumberConverters.convertToDouble(numberTwo));

	}
	
	@RequestMapping(value = "/mean/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double mean(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo)
			throws Exception {
		if (!NumberConverters.isNumeric(numberOne) || !!NumberConverters.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationExeption("Please set a numeric value!");
		}
		
		return math.mean(NumberConverters.convertToDouble(numberOne), NumberConverters.convertToDouble(numberTwo));

	}
	
	@RequestMapping(value = "/squareRoot/{numberOne}", method = RequestMethod.GET)
	public Double squareRoot(@PathVariable("numberOne") String numberOne)
			throws Exception {
		if (!NumberConverters.isNumeric(numberOne)) {
			throw new UnsuportedMathOperationExeption("Please set a numeric value!");
		}
		
		return math.squareRoot(NumberConverters.convertToDouble(numberOne));

	}
	
	
 

}
