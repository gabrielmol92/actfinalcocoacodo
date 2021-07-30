package ar.edu.bue.codoacodo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.bue.codoacodo.entity.Alimento;
import ar.edu.bue.codoacodo.service.IAlimentoService;


@Controller
public class MainController {

	@Autowired
	IAlimentoService alimentoService;
	
	@Autowired
	Alimento alimento;
	
	@GetMapping("/lista")
    public String getAlimentosPage() {
    return "index";
    }
	
	
    @GetMapping("/lista/perro")
	public String getAlimentosPerros() {
		
		return "dog-list";}
	
    @GetMapping("/lista/gato")
 	public String getAlimentosGatos(Model model) {
    	model.addAttribute("alimentos", alimentoService.ObtenerAlimentos());	
 		return "cat-list";}
	
    
    @GetMapping("/lista/perro")
 	public String getAlimentosPerros(Model model) {
    	model.addAttribute("alimentos", alimentoService.ObtenerAlimentos());	
 		return "dog-list";}
	
    
    
    @GetMapping("/alimento/nuevo")
	public String getNuevoAlimentoPage(Model model) {
    	alimento = new Alimento();
		model.addAttribute("alimento", alimento);
		return "new";}
    
    @PostMapping("/alimento/guardar")
	public ModelAndView guardarAlimento(@ModelAttribute("alimento") Alimento alimento) {
     ModelAndView modelView = new ModelAndView ("cat-list");
     alimentoService.guardar(alimento);
     modelView.addObject("alimentos", alimentoService.ObtenerAlimentos());
	return modelView;	 
	}
    
    
    
}
	