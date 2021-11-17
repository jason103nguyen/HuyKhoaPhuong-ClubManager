package com.fa.training.service;

import com.fa.training.dto.AdvertisingContractDto;
import com.fa.training.exception.DatabaseException;

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
