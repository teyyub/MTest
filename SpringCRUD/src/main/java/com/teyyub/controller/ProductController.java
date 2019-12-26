package com.teyyub.controller;

import com.teyyub.model.Product;
import com.teyyub.service.ProductService;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author teyyub , 3:34:22 PM
 */
@Controller
@RequestMapping("/")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/products")
    public String list(Model model) {
        System.out.println(productService.getAllProducts().size());
        model.addAttribute("products", productService.getAllProducts());
        return "products";
    }

    @RequestMapping("/{byCategory}")
    public String getProductsByCategory(Model model, @PathVariable("byCategory") String productCategory) {
        model.addAttribute("products", productService.getProductsByCategory(productCategory));
        return "products";
    }

    @RequestMapping("/filter/{ByCriteria}")
    public String getProductsByFilter(@MatrixVariable(pathVar = "ByCriteria") Map<String, List<String>> filterParams, Model model) {
        System.out.println("getProductsByFilter called");
        System.out.println(productService.getProductsByFilter(filterParams).size());
        model.addAttribute("products", productService.getProductsByFilter(filterParams));
        return "products";
    }

    @RequestMapping("/product")
    public String getProductById(@RequestParam("id") String productId, Model model) {
        model.addAttribute("product", productService.getProductById(productId));
        return "product";
    }

    @RequestMapping(value = "/product/add", method = RequestMethod.GET)
    public String getAddNewProductForm(Model model) {
        Product newProduct = new Product();
        model.addAttribute("newProduct", newProduct);
        return "addProduct";
    }

    @RequestMapping(value = "/product/add", method = RequestMethod.POST)
    public String processAddNewProductForm(@ModelAttribute("newProduct") Product newProduct) {
        productService.addProduct(newProduct);
        return "redirect:/products";
    }

    @RequestMapping(value= "/product/json", produces = {"application/json", "application/xml"},method = RequestMethod.GET)
    @ResponseBody 
    public String jsonProducts(@PathVariable("id") String productId , Model model ) {
//        response.setHeader("Content-Disposition", "attachment; filename=rates.json");
        model.addAttribute("product", productService.getProductById(productId));
        return "product";
    }

}
