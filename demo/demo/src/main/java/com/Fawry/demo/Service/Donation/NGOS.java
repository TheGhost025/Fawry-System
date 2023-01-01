package com.Fawry.demo.Service.Donation;

import com.Fawry.demo.Service.Donation.DonationService;
import org.springframework.stereotype.Service;

@Service
public class NGOS extends DonationService {
    @Override
    public int serve(int amount,String sr) {
        if(sr.equals("BaytElZakat")){
            return amount;
        }
        else if(sr.equals("EqyptionFoodBank")){
            return amount;
        }
        else if(sr.equals("MisrElkhir")){
            return amount;
        }
        else if(sr.equals("AlOrman")){
            return amount;
        }
        else if(sr.equals("Resala")){
            return amount;
        }
        else{
            return -1;
        }
    }
}