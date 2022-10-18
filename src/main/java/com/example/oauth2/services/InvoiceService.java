package com.example.oauth2.services;

import com.example.oauth2.entity.Invoice;
import com.example.oauth2.repository.InvoiceRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class InvoiceService {

    @Autowired
    private final InvoiceRepo invoiceRepo;

    public List<Invoice> viewDataInvoice(){
        return invoiceRepo.findAll();
    }

    public Invoice saveInvoice(Invoice invoice){
        return invoiceRepo.save(invoice);
    }

}
