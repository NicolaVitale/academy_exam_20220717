package arithmeticoperations;

import utils.ConvertOperator;
import utils.CurrencyAmount;

public class Amount {

  CurrencyAmount currencyAmount;

  public CurrencyAmount extractCurrencyAmount(String pounds, String shillings, String pennies) {
    return new CurrencyAmount(ConvertOperator.extractInt(pounds),
        ConvertOperator.extractInt(shillings),
        ConvertOperator.extractInt(pennies), 0);
  }

}
