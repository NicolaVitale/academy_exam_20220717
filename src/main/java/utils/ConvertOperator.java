package utils;

import com.sun.tools.javac.util.StringUtils;
import java.util.regex.Pattern;

public class ConvertOperator {

  private static final Pattern pattern = Pattern.compile("[^0-9]");

  public static int extractInt(final String input) {
    return Integer.parseInt(pattern.matcher(input).replaceAll(""));
  }

  public static int currencyAmountToPennies(CurrencyAmount currencyAmount) {
    return 20 * 12 * currencyAmount.getPounds() + 12 * currencyAmount.getShillings()
        + currencyAmount.getPennies();
  }

  public static CurrencyAmount penniesToCurrencyAmount(int pennies) {
    return new CurrencyAmount(pennies / 240, (pennies / 12) % 20, pennies % 12, 0);
  }
}
