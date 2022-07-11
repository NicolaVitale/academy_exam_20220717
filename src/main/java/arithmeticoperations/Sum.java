package arithmeticoperations;

import interfaceclass.Operation;
import lombok.AllArgsConstructor;
import lombok.Getter;
import utils.ConvertOperator;
import utils.CurrencyAmount;

@Getter
@AllArgsConstructor
public class Sum implements Operation {

  private final CurrencyAmount operator1;
  private final CurrencyAmount operator2;

  public CurrencyAmount currencyAmount() {

    int penniesOperator1 = ConvertOperator.currencyAmountToPennies(operator1);
    int penniesOperator2 = ConvertOperator.currencyAmountToPennies(operator2);
    return ConvertOperator.penniesToCurrencyAmount(penniesOperator1 - penniesOperator2);

  }
}
