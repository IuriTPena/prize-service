package com.cognizant.prize.controller;

import com.cognizant.prize.domain.Prize;
import com.cognizant.prize.service.PrizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("prize")
public class PrizeController {

    @Autowired
    PrizeService prizeService;

    @GetMapping("{ticketNumber}")
    public Prize create(@PathVariable String ticketNumber) {
        return prizeService.prizeGenerator(ticketNumber);
    }
}
