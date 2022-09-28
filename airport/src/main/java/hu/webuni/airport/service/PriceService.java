package hu.webuni.airport.service;

import org.springframework.stereotype.Service;

@Service
public class PriceService {

	public PriceService(DiscountService discountService) {
		this.discountService = discountService;
	}

	private DiscountService discountService;

	public int getFinalPrice(int price) {
		return (int) (price / 100.0 * (100 - discountService.getDiscountPercent(price)));
	}

}
