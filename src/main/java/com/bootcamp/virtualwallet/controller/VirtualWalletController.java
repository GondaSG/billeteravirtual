package com.bootcamp.virtualwallet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.virtualwallet.domain.VirtualWallet;
import com.bootcamp.virtualwallet.service.IVirtualWalletService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("virtualwallet")
public class VirtualWalletController {
	@Autowired
    private IVirtualWalletService currencyTypeService;

    @GetMapping
    public Flux<VirtualWallet> findAll(){
        return currencyTypeService.findAll();
    }

    @GetMapping("/{id}")
    public Mono<VirtualWallet> getById(@PathVariable("id") String id){return  currencyTypeService.findById(id);
    }

    @PostMapping
    public Mono<VirtualWallet> create(@RequestBody VirtualWallet virtualWallet){
        return currencyTypeService.save(virtualWallet);
    }

    @PutMapping("/{id}")
    public Mono<VirtualWallet> update(@PathVariable String id, @RequestBody VirtualWallet virtualWallet){
        return currencyTypeService.update(id, virtualWallet);
    }

    @DeleteMapping
    public Mono<Void> deleteById(@PathVariable("id") String id){
        return currencyTypeService.deleteById(id);
    }
	
}
