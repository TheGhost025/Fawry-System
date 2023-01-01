package com.Fawry.demo.Service.Donation;

import com.Fawry.demo.Service.Donation.DonationService;
import org.springframework.stereotype.Service;

@Service
public class Schools extends DonationService {
    @Override
    public int serve(int amount,String sr) {
        if(sr.equals("Zeweilcity")){
            return amount;
        }
        else{
            return -1;
        }
    }
}