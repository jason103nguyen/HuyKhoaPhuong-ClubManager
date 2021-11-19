package com.fa.training.service;

import com.fa.training.dto.BrandDto;
import com.fa.training.exception.DatabaseException;

import java.util.List;

public interface BrandService {
    /**
     * Add a brand to database
     * @param brandDto
     */
    public int create(BrandDto brandDto);

    /**
     * Get brand by id
     * @param id
     * @return
     */
    public BrandDto readOne(int id) throws DatabaseException;

    /**
     * Get all football player
     * @return
     */
    public List<BrandDto> readAll();

    /**
     * Update or create a brand
     * @param brandDto
     */
    public void updateOrCreate(BrandDto brandDto);

    /**
     * Delete a brand by id
     * @param id
     */
    public void delete(int id) throws DatabaseException;
}
