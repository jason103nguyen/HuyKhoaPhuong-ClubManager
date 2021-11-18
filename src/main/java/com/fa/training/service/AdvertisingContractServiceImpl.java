package com.fa.training.service;

import com.fa.training.dao.AdvertisingContractDaoImpl;
import com.fa.training.dto.AdvertisingContractDto;
import com.fa.training.entities.AdvertisingContract;
import com.fa.training.exception.DatabaseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdvertisingContractServiceImpl implements AdvertisingContractService {

    private AdvertisingContractDaoImpl advertisingContractDaoImpl;

    @Autowired
    public AdvertisingContractServiceImpl(AdvertisingContractDaoImpl advertisingContractDaoImpl) {
        this.advertisingContractDaoImpl = advertisingContractDaoImpl;
    }

    /**
     * Add a advertising contract to database
     * @param advertisingContractDto
     */
    public int create(AdvertisingContractDto advertisingContractDto) {

        AdvertisingContract advertisingContract = new AdvertisingContract(advertisingContractDto);
        int id = (int) advertisingContractDaoImpl.create(advertisingContract);
        return id;
    }

    /**
     * Get advertising contract by id
     * @param id
     * @return
     */
    public AdvertisingContractDto readOne(int id) throws DatabaseException {
        AdvertisingContract advertisingContract = advertisingContractDaoImpl.readOne(id);
        if (advertisingContract == null) {
            throw new DatabaseException("The ID doesn't exists!");
        }

        AdvertisingContractDto advertisingContractDto = new AdvertisingContractDto(advertisingContract);
        return advertisingContractDto;
    }

    /**
     * Update or create a advertising contract
     * @param advertisingContractDto
     */
    public void updateOrCreate(AdvertisingContractDto advertisingContractDto) {
        AdvertisingContract advertisingContract = new AdvertisingContract(advertisingContractDto);
        advertisingContractDaoImpl.update(advertisingContract);
    }

    /**
     * Delete a advertisingContract by id
     * @param id
     */
    public void delete(int id) throws DatabaseException {

        AdvertisingContract advertisingContract = advertisingContractDaoImpl.readOne(id);
        if (advertisingContract != null) {
            advertisingContractDaoImpl.delete(id);
        } else {
            throw new DatabaseException("The ID doesn't exists!");
        }

    }
}