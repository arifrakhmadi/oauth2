package com.example.oauth2.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class HomeController {

    @PreAuthorize("hasAnyAuthority('VIEW_TRANSAKSI','EDIT_TRANSAKSI')")
    @GetMapping("/home")
    public void home(Authentication authentication){

        log.info("jenis class : {}", authentication.getClass());
        log.info("user yang sedang login : {}", authentication.getPrincipal());

    }

}
