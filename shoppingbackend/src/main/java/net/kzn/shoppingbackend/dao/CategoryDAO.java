package net.kzn.shoppingbackend.dao;

import java.util.List;

import net.kzn.shoppingbackend.dto.Category;

public interface CategoryDAO {
	Category get(int id);

	List<Category> list();
}
