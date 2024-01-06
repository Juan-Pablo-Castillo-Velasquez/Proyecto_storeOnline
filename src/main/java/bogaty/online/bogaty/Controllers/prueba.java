package bogaty.online.bogaty.Controllers;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;
import java.util.Map;


@Controller
public class prueba {
    private final ObjectMapper objectMapper = new ObjectMapper();
	@Value("classpath:data.json")
	private Resource jsonDataResource;

	@GetMapping("/games")
    public String cargarJsonDesdeOtroController(Model model) {
        try {
            
            byte[] jsonData = jsonDataResource.getInputStream().readAllBytes();
            Map<String, Object> jsonDataMap = objectMapper.readValue(jsonData, new TypeReference<Map<String, Object>>() {});
            System.out.println(jsonDataMap);
            model.addAttribute("datos", jsonDataMap);
            System.out.println("Ruta absoluta del archivo JSON: " + jsonDataResource.getFile().getAbsolutePath());

           
            model.addAttribute("datos", jsonDataMap);
                return "games";
           
        } catch (IOException e) {
            e.printStackTrace();
            return "error";
        }
    }
}
