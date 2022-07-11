package interfaceclass;

import utils.ConvertOperator;
import utils.CurrencyAmount;

public interface Amount {

  Operation operation(String input);

  default CurrencyAmount extractCurrencyAmount(String pounds, String shillings, String pennies) {
    return new CurrencyAmount(ConvertOperator.extractInt(pounds),
        ConvertOperator.extractInt(shillings),
        ConvertOperator.extractInt(pennies),0);
  }

}
