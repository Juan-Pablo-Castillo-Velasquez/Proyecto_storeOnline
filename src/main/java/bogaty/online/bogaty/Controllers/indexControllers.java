package bogaty.online.bogaty.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // espesificar controllador
public class indexControllers {
	@GetMapping(value = "/")
	public String indexPost(Model model) {
		try {
			String title1 = "add row notes";
			model.addAttribute("model1", title1);
			return "index";
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
	}

	@GetMapping(value="/about")
	public String About() {
		try {
			return "about";
			
		}catch(Exception e){
			e.printStackTrace();
			return "error";
		}
	}
	/**
	 * @PostMapping(value = "/xd") public String handlePost(String data, Model
	 *                    model) { model.addAttribute("info", data);
	 *                    model.addAttribute("condicion", true);
	 *                    System.out.println("Data received in POST: " + data);
	 *                    return "redirect:/xd/result"; }
	 */

}
