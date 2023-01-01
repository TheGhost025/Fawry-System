package com.Fawry.demo.Service.Donation;

import DonationService;
import com.Fawry.demo.Service.Donation.DonationService;
import org.springframework.stereotype.Service;

@Service
public class CancerHospital extends DonationService {
    @Override
    public int serve(int amount,String sr) {
        if(sr.equals("57357")){
            return amount;
        }
        else if(sr.equals("500500")){
            return amount;
        }
        else if(sr.equals("Elnas")){
            return amount;
        }
        else{
            return -1;
        }
    }
}