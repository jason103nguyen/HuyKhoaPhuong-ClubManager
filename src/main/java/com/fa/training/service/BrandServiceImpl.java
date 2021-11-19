package com.fa.training.service;

import com.fa.training.dao.BrandDaoImpl;
import com.fa.training.dto.BrandDto;
import com.fa.training.dto.BrandDto;
import com.fa.training.entities.Brand;
import com.fa.training.entities.Brand;
import com.fa.training.exception.DatabaseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {

    private BrandDaoImpl brandDaoImpl;

    @Autowired
    public BrandServiceImpl(BrandDaoImpl brandDaoImpl) {
        this.brandDaoImpl = brandDaoImpl;
    }

    /**
     * Add a brand to database
     * @param brandDto
     */
    public int create(BrandDto brandDto) {

        Brand brand = new Brand(brandDto);
        int id = (int) brandDaoImpl.create(brand);
        return id;
    }

    /**
     * Get brand by id
     * @param id
     * @return
     */
    public BrandDto readOne(int id) throws DatabaseException {
        Brand brand = brandDaoImpl.readOne(id);
        if (brand == null) {
            throw new DatabaseException("The ID doesn't exists!");
        }
        return new BrandDto(brand);
    }

    /**
     * Get all football player
     * @return
     */
    public List<BrandDto> readAll() {
        List<Brand> listBrand = brandDaoImpl.readAll();
        List<BrandDto> listBrandDto = new ArrayList<>();

        for (Brand brand : listBrand) {
            BrandDto brandDto = new BrandDto(brand);
            listBrandDto.add(brandDto);
        }

        return listBrandDto;
    }

    /**
     * Update or create a brand
     * @param brandDto
     */
    public void updateOrCreate(BrandDto brandDto) {
        Brand brand = new Brand(brandDto);
        brandDaoImpl.update(brand);
    }

    /**
     * Delete a brand by id
     * @param id
     */
    public void delete(int id) throws DatabaseException {

        Brand brand = brandDaoImpl.readOne(id);
        if (brand != null) {
            brandDaoImpl.delete(id);
        } else {
            throw new DatabaseException("The ID doesn't exists!");
        }

    }
}