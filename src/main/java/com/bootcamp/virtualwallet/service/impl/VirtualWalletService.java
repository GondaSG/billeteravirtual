package com.bootcamp.virtualwallet.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.virtualwallet.domain.VirtualWallet;
import com.bootcamp.virtualwallet.service.IVirtualWalletService;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class VirtualWalletService implements IVirtualWalletService {
	@Autowired
	private final IVirtualWalletService iVirtualWalletService;
	@Override
	public Flux<VirtualWallet> findAll() {
		return null;
	}

	@Override
	public Mono<VirtualWallet> findById(String id) {
		return iVirtualWalletService.findById(id);
	}

	@Override
	public Mono<VirtualWallet> save(VirtualWallet virtualWallet) {
		return iVirtualWalletService.save(virtualWallet);
	}

	@Override
	public Mono<VirtualWallet> update(String id, VirtualWallet virtualWallet) {
		return iVirtualWalletService.save(virtualWallet);
	}

	@Override
	public Mono<Void> deleteById(String id) {
		return iVirtualWalletService.deleteById(id);
	}

	@Override
	public Mono<Double> pucharseBootcoin(Double amount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<Double> saleBootcoin(Double amount) {
		// TODO Auto-generated method stub
		return null;
	}

}
