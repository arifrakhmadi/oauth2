package com.example.oauth2.controller;

import com.example.oauth2.entity.Invoice;
import com.example.oauth2.services.InvoiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/invoice")
@RequiredArgsConstructor
public class InvoiceController {

    @Autowired
    private final InvoiceService invoiceService;

    @GetMapping()
    public List<Invoice> viewInvoice(){

        return invoiceService.viewDataInvoice();

    }

    /*@PreAuthorize("hasAuthority('VIEW_TRANSAKSI')")*/
    @PostMapping(path = "/simpan")
    public void saveInvoice(@RequestBody Invoice invoice){
        invoiceService.saveInvoice(invoice);
    }

}
