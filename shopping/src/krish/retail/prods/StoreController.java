package krish.retail.prods;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StoreController 
{
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String includeStore( @ModelAttribute Store St, Model mo)
	{
		St =  new Store(); 
		
		mo.addAttribute("StoreID", St.getStoreID());
		mo.addAttribute("StoreName", St.getStoreName());
		mo.addAttribute("StoreCity", St.getStoreCity());
		mo.addAttribute("StoreURL", St.getStoreURL());
		mo.addAttribute("StorePIN", St.getStorePIN());
		mo.addAttribute("StoreDepartments", St.getStoreDepartments());
		mo.addAttribute("StoreLevels", St.getStoreLevels());
		mo.addAttribute("St", St);
		
		return "includestore";
	}

	@RequestMapping(value="/showstore", method = RequestMethod.POST)
	public String showStore()
	{
		
		return "showstore";
	}







}
