package com.fa.training.service;

import com.fa.training.dto.AdvertisingContractDto;
import com.fa.training.exception.DatabaseException;

import java.util.List;

public interface AdvertisingContractService {

    /**
     * Add a advertising contract to database
     * @param advertisingContractDto
     */
    public int create(AdvertisingContractDto advertisingContractDto);

    /**
     * Get advertising contract by id
     * @param id
     * @return
     */
    public AdvertisingContractDto readOne(int id) throws DatabaseException;

    /**
     * Get all advertising contract
     * @return
     */
    public List<AdvertisingContractDto> readAll();

    /**
     * Update or create a advertising contract
     * @param advertisingContractDto
     */
    public void updateOrCreate(AdvertisingContractDto advertisingContractDto);

    /**
     * Delete a advertisingContract by id
     * @param id
     */
    public void delete(int id) throws DatabaseException;
}
