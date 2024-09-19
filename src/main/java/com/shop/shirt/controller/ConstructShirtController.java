package com.shop.shirt.controller;

import com.shop.shirt.model.Shirt;
import com.shop.shirt.model.ShopOrder;
import com.shop.shirt.model.impl.ShirtDecoration;
import com.shop.shirt.model.impl.ShirtDecoration.DecorationType;
import com.shop.shirt.model.impl.ShirtImpl;
import com.shop.shirt.model.impl.ShirtType;
import com.shop.shirt.model.impl.ShirtType.StyleType;
import com.shop.shirt.model.impl.ShopOrderImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/construct")
@SessionAttributes("shopOrderImpl")
public class ConstructShirtController {

    @GetMapping
    public String showConstructForm() {
        return "construct";
    }

    @ModelAttribute
    public void addDecorationsToModel(Model model) {
        List<ShirtDecoration> shirtDecorations = List.of(
                new ShirtDecoration("NONE", "WITHOUT DECORATION", DecorationType.NONE),
                new ShirtDecoration("IMG", "IMAGE DECORATION", DecorationType.IMAGE),
                new ShirtDecoration("TXT", "TEXT DECORATION", DecorationType.TEXT),
                new ShirtDecoration("PATCH", "PATCH DECORATION", DecorationType.PATCH),
                new ShirtDecoration("TAG", "TAG DECORATION", DecorationType.TAG),
                new ShirtDecoration("BRAND", "BRAND DECORATION", DecorationType.BRAND)
        );
        model.addAttribute("decorationTypes", shirtDecorations);
    }

    @ModelAttribute
    public void selectShirtType(Model model) {
        List<ShirtType> shirtTypes = List.of(
                new ShirtType("1", "T-SHIRT", StyleType.TSHIRT),
                new ShirtType("2", "HOODIE", StyleType.HOODIE),
                new ShirtType("3", "SWEATSHIRT", StyleType.SWEATSHIRT),
                new ShirtType("4", "JACKET", StyleType.JACKET),
                new ShirtType("5", "Jumper", StyleType.JUMPER),
                new ShirtType("6", "PULLOVER", StyleType.PULLOVER),
                new ShirtType("7", "CARDIGAN", StyleType.CARDIGAN)
        );
        model.addAttribute("shirtTypes", shirtTypes);
    }

    @ModelAttribute(name = "shopOrderImpl")
    public ShopOrder shopOrderImpl() {
        return new ShopOrderImpl();
    }

    @ModelAttribute(name = "shirtImpl")
    public Shirt shirtImpl() {
        return new ShirtImpl();
    }
}