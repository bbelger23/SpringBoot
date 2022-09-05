package edu.wctc.pmnh;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/one")
public class OneController {
    @RequestMapping("/firststep")
    public String showFirstStep() {
        return "pages/firststep";
    }

}
