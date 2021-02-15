package com.shehani;

import java.util.*;
import com.shehani.exceptions.*;
import java.util.Scanner;

public class ProductPrice {
	public void calculatePrice() throws InvalidPriceException {

		try {
			PriceDiscount pd = new PriceDiscount();
			pd.getDiscount();
		} catch (DiscountNotAvailableException e) {
			throw new InvalidPriceException("Price is not found..", e);
		}
	}
}
