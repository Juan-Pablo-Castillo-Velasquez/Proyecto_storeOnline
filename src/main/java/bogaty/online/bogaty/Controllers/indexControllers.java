package bogaty.online.bogaty.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller // espesificar controllador
public class indexControllers {
	@GetMapping(value = "/")
	public String indexPost(Model model) {
		try {
			String title1 = "Games el amigos";
			model.addAttribute("model1", title1);
			return "index";
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
	}

	@GetMapping(value = "/about")
	public String About() {
		try {
			return "about";

		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
	}

	// @GetMapping(value = "/games")
	// public String Games() {
	// 	try {
	// 		return "games";

	// 	} catch (Exception e) {
	// 		e.printStackTrace();
	// 		return "error";
	// 	}
	// }

	
	@GetMapping(value = "/CardGames")
	public String CardGames() {
		try {
			return "CardGames";

		} catch (Exception e) {
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
