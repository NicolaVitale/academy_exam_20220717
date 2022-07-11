package arithmeticoperations;

import interfaceclass.Operation;
import lombok.AllArgsConstructor;
import lombok.Getter;
import utils.ConvertOperator;
import utils.CurrencyAmount;

@Getter
@AllArgsConstructor
public class Division implements Operation {

  private final CurrencyAmount operator1;
  private final int operator2;

  public CurrencyAmount currencyAmount() {
    int penniesOperator1 = ConvertOperator.currencyAmountToPennies(operator1);
    CurrencyAmount currencyAmount = ConvertOperator.penniesToCurrencyAmount(
        penniesOperator1 / operator2);
    currencyAmount.setRest(penniesOperator1 % operator2);
    return currencyAmount;
  }

}
