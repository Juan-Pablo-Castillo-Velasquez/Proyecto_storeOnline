package bogaty.online.bogaty.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;





@Controller//espesificar controllador
public class indexControllers {
	@GetMapping(value = "/") //ruta vista
public String index() {
	return "index";
}
	@RequestMapping(value="/nueva_url_post", method=RequestMethod.GET) //htpp controller
public String IndexRequestMapping() {
		return "index";
	}
	@PostMapping(value="/")
	public String indexPost(@RequestBody String index1, Model model) {
	    try {
	    	model.addAttribute("index1", index1);
	    	System.out.println("Valor de index1 recibido: " + index1);
	        return "index";
	    } catch (Exception e) {
	       
	        e.printStackTrace();
	        return "Error en el servidor";
	    }
	}

}



