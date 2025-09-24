package org.example.demosoftwareengineering;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model) {
        List<Items> products = new ArrayList<>();

        products.add(new Items(1L, "Sony A6700", "26MP APS-C, 4K 120fps, IBIS", 1499.99));
        products.add(new Items(2L, "Canon EOS R5", "45MP Full Frame, 8K Video", 3899.99));
        products.add(new Items(3L, "Fujifilm X-T5", "40MP APS-C, Film Simulations", 1699.99));
        products.add(new Items(4L, "Nikon Z6 II", "24MP Full Frame, Dual Processors", 1999.99));
        products.add(new Items(5L, "Panasonic GH6", "25MP Micro Four Thirds, 5.7K Video", 2199.99));
        products.add(new Items(6L, "Leica Q2", "47MP Full Frame, Fixed 28mm Lens", 4999.99));

        model.addAttribute("products", products);
        return "index";
    }
}
