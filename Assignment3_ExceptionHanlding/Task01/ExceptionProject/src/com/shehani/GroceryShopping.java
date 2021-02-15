package com.shehani;

import java.util.*;
import com.shehani.exceptions.*;

public class GroceryShopping {
	public static void main(String args[]) {
		try {
			ProductName pn = new ProductName();
			pn.selectProduct();
		} catch (ProductNotFoundException e) {
			e.printStackTrace();
			System.out.println("Product Error,  " + e);
		}
	}
}
