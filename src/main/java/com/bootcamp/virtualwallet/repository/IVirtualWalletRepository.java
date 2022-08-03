package com.bootcamp.virtualwallet.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.bootcamp.virtualwallet.domain.VirtualWallet;

public interface IVirtualWalletRepository extends ReactiveCrudRepository<VirtualWallet, String> {

}
