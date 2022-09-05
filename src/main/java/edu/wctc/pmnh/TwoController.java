package edu.wctc.pmnh;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/two")
public class TwoController {
    @RequestMapping("/secondstep")
    public String showGlacierFacts() {
        return "pages/secondstep";
    }

}
