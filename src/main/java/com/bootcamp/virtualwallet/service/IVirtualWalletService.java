package com.bootcamp.virtualwallet.service;

import com.bootcamp.virtualwallet.domain.VirtualWallet;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IVirtualWalletService {
    Flux<VirtualWallet> findAll();

    Mono<VirtualWallet> findById(String id);

    Mono<VirtualWallet> save(VirtualWallet virtualWallet);

    Mono<VirtualWallet> update(String id, VirtualWallet virtualWallet);

    public Mono<Void> deleteById(String id);
    
    Mono<Double> pucharseBootcoin(Double amount);
    
    Mono<Double> saleBootcoin(Double amount);
}
