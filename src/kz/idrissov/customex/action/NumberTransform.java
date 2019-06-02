package kz.idrissov.customex.action;

import java.math.BigDecimal;

public class NumberTransform {
    public BigDecimal transform(String num) {
        return new BigDecimal(num);
    }
}
