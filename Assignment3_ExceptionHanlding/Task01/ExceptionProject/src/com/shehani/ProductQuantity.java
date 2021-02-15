package com.shehani;

import java.util.*;
import com.shehani.exceptions.*;
import java.util.Scanner;

public class ProductQuantity {
	public void getQuantity() throws QuantityNotValidException {
		try {
			ProductPrice pp = new ProductPrice();
			pp.calculatePrice();
		} catch (InvalidPriceException e) {
			throw new QuantityNotValidException("Product quantity cannot be found..", e);
		}
	}
}
