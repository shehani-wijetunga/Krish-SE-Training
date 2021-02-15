package com.shehani;

import java.util.*;
import com.shehani.exceptions.*;
import java.util.Scanner;

public class ProductName {
	public void selectProduct() throws ProductNotFoundException {
		try {
			ProductQuantity pq = new ProductQuantity();
			pq.getQuantity();
		} catch (QuantityNotValidException e) {
			throw new ProductNotFoundException("Product name is not found..", e);
		}
	}
}
