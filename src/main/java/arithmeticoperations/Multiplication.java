package arithmeticoperations;

import interfaceclass.Operation;
import lombok.AllArgsConstructor;
import lombok.Getter;
import utils.ConvertOperator;
import utils.CurrencyAmount;

@Getter
@AllArgsConstructor
public class Multiplication implements Operation {

  private final CurrencyAmount operator1;
  private final int operator2;

  public CurrencyAmount currencyAmount() {
    int penniesFirstOperand = ConvertOperator.currencyAmountToPennies(operator1);
    return ConvertOperator.penniesToCurrencyAmount(penniesFirstOperand * operator2);
  }
}
