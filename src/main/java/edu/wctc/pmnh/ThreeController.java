package edu.wctc.pmnh;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/three")
public class ThreeController {
    @RequestMapping("/thirdstep")
    public String showNewDino() {
        return "pages/thirdstep";
    }
}
