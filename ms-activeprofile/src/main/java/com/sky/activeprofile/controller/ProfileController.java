/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sky.activeprofile.controller;

import com.sky.activeprofile.config.ProfileConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Yaseen
 */
@RestController
public class ProfileController {

    @Autowired
    private ProfileConfig myBean;
    @Value("${profiles.active}")
    private String value;

    @GetMapping("/")
    public String get() {
        return " Actives : " + value;
    }

}
