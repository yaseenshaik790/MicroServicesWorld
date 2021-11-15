/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sky.activeprofile.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 *
 * @author Yaseen
 */
@Configuration
public class ProfileConfig {

    @Profile(value = "DEV")
    @Bean(name = "myBean")
    public String createDevBean() {
        return "Create Dev Bean";
    }

    @Profile(value = "PROD")
    @Bean(name = "myBean")
    public String createProdBean() {
        return "Create Dev Bean";
    }
}
