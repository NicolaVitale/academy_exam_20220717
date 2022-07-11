package arithmeticoperations;

import lombok.AllArgsConstructor;
import lombok.Getter;
import utils.ConvertOperator;
import utils.CurrencyAmount;

@Getter
@AllArgsConstructor
public class Multiplication {

  private final CurrencyAmount operator1;
  private final int operator2;

  public CurrencyAmount multiplication() {
    int penniesFirstOperand = ConvertOperator.currencyAmountToPennies(operator1);
    return ConvertOperator.penniesToCurrencyAmount(penniesFirstOperand * operator2);
  }
}
