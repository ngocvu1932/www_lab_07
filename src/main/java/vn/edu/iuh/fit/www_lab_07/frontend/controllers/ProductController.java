package vn.edu.iuh.fit.www_lab_07.frontend.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import vn.edu.iuh.fit.www_lab_07.backend.enums.ProductStatus;
import vn.edu.iuh.fit.www_lab_07.backend.models.Product;
import vn.edu.iuh.fit.www_lab_07.backend.services.ProductService;

import java.util.List;
import java.util.Optional;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;
    @GetMapping("/list_product")
    public String listPro(Model model) {
        List<Product> productList = productService.findAll();

        model.addAttribute("list_product", productList);
        return "product/list_product";
    }

    @GetMapping("/edit_product/{id}")
    public String editPro(@PathVariable("id") Long id, Model model) {
        Optional<Product> op =  productService.findPro(id);
        Product product= op.get();
        model.addAttribute("product", product );

        ProductStatus[] productStatus = ProductStatus.values();
        model.addAttribute("productStatus", productStatus);
        return "product/edit_product";
    }

    @GetMapping("/delete_product/{id}")
    public String deletePro(@PathVariable("id") Long id, Model model) {
        productService.deleteProductById(id);
        return "redirect:/list_product";
    }

    @PostMapping("/editPro")
    public String editProduct(@ModelAttribute("product") Product product) {
            Product productExist = productService.findPro(product.getProduct_id()).orElse(null);


            if (productExist!= null) {
                productExist.setName(product.getName());
                productExist.setDescription(product.getDescription());
                productExist.setManufacturer(product.getManufacturer());
                productExist.setUnit(product.getUnit());
                productExist.setStatus(product.getStatus());
                productService.saveProduct(productExist);
            }

        return "redirect:/list_product";
    }

}
