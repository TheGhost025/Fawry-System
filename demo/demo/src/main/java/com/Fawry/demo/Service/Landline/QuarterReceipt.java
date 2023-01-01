package com.Fawry.demo.Service.Landline;

import com.Fawry.demo.Service.Landline.LandlineService;
import org.springframework.stereotype.Service;

@Service
public class QuarterReceipt extends LandlineService {

    @Override
    public int serve(int amount,String place) {
        return amount;
    }

}