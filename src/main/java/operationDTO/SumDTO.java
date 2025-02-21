package operationDTO;

import arithmeticoperations.Sum;
import interfaceclass.Amount;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import utils.CurrencyAmount;

public class SumDTO implements Amount {

  private Pattern pattern =
      Pattern.compile("^([-]?[0-9]*p)? ?([-]?[0-9]*s)? ?([-]?[0-9]*d)? ? "
          + "\\+ ([-]?[0-9]*p)? ?([-]?[0-9]*s)? ?([-]?[0-9]*d)?$");

  public Sum operation(final String inputString) {
    Matcher matcher = pattern.matcher(inputString);

    if (matcher.find()) {

      CurrencyAmount firstOperand = extractCurrencyAmount(matcher.group(1),
          matcher.group(2), matcher.group(3));
      CurrencyAmount secondOperand = extractCurrencyAmount(matcher.group(4),
          matcher.group(5), matcher.group(6));

      return new Sum(firstOperand, secondOperand);
    }
    return null;
  }
}
