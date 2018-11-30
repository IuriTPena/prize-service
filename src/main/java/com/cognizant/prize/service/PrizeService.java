package com.cognizant.prize.service;

import com.cognizant.prize.domain.Prize;
import org.springframework.stereotype.Service;

@Service
public class PrizeService {
    private static final int SIX_DIG_PRIZE = 25;
    private static final int EIGHT_DIG_PRIZE = 100;
    private static final int TEN_DIG_PRIZE = 400;

    public Prize prizeGenerator(final String ticketNumber) {
        Prize prize;

        final int multiplier = getPrizeMultiplier(ticketNumber);

        Integer value = 0;
        switch (ticketNumber.length()-1) {
            case 6:
                value = SIX_DIG_PRIZE * multiplier;
                break;
            case 8:
                value = EIGHT_DIG_PRIZE * multiplier;
                break;
            case 10:
                value = TEN_DIG_PRIZE * multiplier;
                break;
            default:
                // DO NOTHING
        }
        prize = new Prize(value);

        return prize;
    }

    private int getPrizeMultiplier(String ticket) {
        int multiplier = 0;

        switch (ticket.charAt(0)) {
            case 'A':
                multiplier = 1;
                break;
            case 'B':
                multiplier = 2;
                break;
            default:
                // DO NOTHING
        }

        return multiplier;
    }
}
