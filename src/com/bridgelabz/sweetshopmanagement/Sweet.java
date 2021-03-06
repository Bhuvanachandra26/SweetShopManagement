package com.bridgelabz.sweetshopmanagement;

import java.util.List;
import java.util.Objects;

public class Sweet {
	
		String shape;
		String colour;	
		int price;
		List<String> ingredient;
		String name;
				
		
		@Override
		public int hashCode() {
			return Objects.hash(colour, ingredient, name, price, shape);
		}


		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Sweet other = (Sweet) obj;
			return Objects.equals(colour, other.colour) && Objects.equals(ingredient, other.ingredient)
					&& Objects.equals(name, other.name) && price == other.price && Objects.equals(shape, other.shape);
		}


		@Override
		public String toString() {
			return getClass().getSimpleName() + " [shape=" + shape + ", colour=" + colour + ", "
					+ "price=" + price + ", ingredient=" + ingredient + "]";
		}
		
	}
