package model;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class EarningRateTest {
    EarningRate earningRate = new EarningRate();
    @DisplayName("소수점 아래 두번 째 자리 수 반올림 테스트")
    @Test
    void hundredthsDigitRoundTest(){
        assertThat(earningRate.round(5.56)).isEqualTo(5.6);
    }

    @DisplayName("수익률 계산하는 테스트")
    @Test
    void calculateEarningRateTest(){
        assertThat(earningRate.calculateEarningRate(3000,8000));
    }
}