package operationDTO;

import arithmeticoperations.Division;
import interfaceclass.Amount;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import utils.ConvertOperator;
import utils.CurrencyAmount;

public class DivisionDTO implements Amount {

  private final Pattern pattern = Pattern.compile(
      "^([-]?[0-9]*p)? ?([-]?[0-9]*s)? "
          + "?([-]?[0-9]*d)? ? / ([-]?[0-9]*)$");

  public Division operation(String inputString) {
    final Matcher matcher = pattern.matcher(inputString);
    if (matcher.find()) {
      CurrencyAmount firstOperand = extractCurrencyAmount(matcher.group(1), matcher.group(2),
          matcher.group(3));
      return new Division(firstOperand, ConvertOperator.extractInt(matcher.group(4)));
    }
    return null;
  }

}
