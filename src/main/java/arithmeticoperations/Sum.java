package arithmeticoperations;

import lombok.AllArgsConstructor;
import lombok.Getter;
import utils.ConvertOperator;
import utils.CurrencyAmount;

@Getter
@AllArgsConstructor
public class Sum {

  private final CurrencyAmount operator1;
  private final CurrencyAmount operator2;

  public CurrencyAmount sumOperation() {

    int penniesOperator1 = ConvertOperator.currencyAmountToPennies(operator1);
    int penniesOperator2 = ConvertOperator.currencyAmountToPennies(operator2);
    return ConvertOperator.penniesToCurrencyAmount(penniesOperator1 + penniesOperator2);

  }
}
