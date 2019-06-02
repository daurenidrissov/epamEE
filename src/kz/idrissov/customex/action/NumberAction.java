package kz.idrissov.customex.action;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class NumberAction {
    public BigDecimal sum(BigDecimal[] nums) {
        BigDecimal result = BigDecimal.valueOf(0);
        for(BigDecimal i : nums) {
            result = result.add(i);
        }
        return result;
    }

    public BigDecimal average(BigDecimal[] nums){
        BigDecimal result = sum(nums);
        result = result.divide(BigDecimal.valueOf(nums.length), 4, RoundingMode.HALF_UP);
        return result;
    }
}
