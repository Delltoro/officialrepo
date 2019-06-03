package com.pwr.service;


import com.pwr.model.Advertisement;
import org.springframework.stereotype.Service;
import com.pwr.repository.AdvertisementRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdvertisementService {

    private AdvertisementRepository advertisementRepository;


    public List<Advertisement> findAllInTableTennis() {

        List<Advertisement> allAdv = new ArrayList<Advertisement>();
        try {
            allAdv = advertisementRepository.findAllInTableTennis();
        }catch(Exception e){

        }
        if (allAdv == null) {
            return null;
        }
        return allAdv;
    }

}
